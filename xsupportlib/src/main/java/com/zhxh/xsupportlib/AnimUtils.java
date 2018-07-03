package com.zhxh.xsupportlib;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

/**
 * Created by zhxh on 2018/7/3
 */
public class AnimUtils {
    /***
     * 启动动画
     * param context
     * param view
     * param id
     */
    public static void startAnimation(Context context, View view, int id) {

        try {

            Animation animation = AnimationUtils.loadAnimation(context, id);
            view.startAnimation(animation);
            animation = null;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}
