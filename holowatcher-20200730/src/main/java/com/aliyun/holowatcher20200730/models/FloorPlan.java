// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class FloorPlan extends TeaModel {
    // angle
    @NameInMap("Angle")
    public Long angle;

    // imgHeight
    @NameInMap("ImgHeight")
    public Long imgHeight;

    // imgWidth
    @NameInMap("ImgWidth")
    public Long imgWidth;

    // scale
    @NameInMap("Scale")
    public Long scale;

    // translationX
    @NameInMap("TranslationX")
    public Long translationX;

    // translationY
    @NameInMap("TranslationY")
    public Long translationY;

    public static FloorPlan build(java.util.Map<String, ?> map) throws Exception {
        FloorPlan self = new FloorPlan();
        return TeaModel.build(map, self);
    }

    public FloorPlan setAngle(Long angle) {
        this.angle = angle;
        return this;
    }
    public Long getAngle() {
        return this.angle;
    }

    public FloorPlan setImgHeight(Long imgHeight) {
        this.imgHeight = imgHeight;
        return this;
    }
    public Long getImgHeight() {
        return this.imgHeight;
    }

    public FloorPlan setImgWidth(Long imgWidth) {
        this.imgWidth = imgWidth;
        return this;
    }
    public Long getImgWidth() {
        return this.imgWidth;
    }

    public FloorPlan setScale(Long scale) {
        this.scale = scale;
        return this;
    }
    public Long getScale() {
        return this.scale;
    }

    public FloorPlan setTranslationX(Long translationX) {
        this.translationX = translationX;
        return this;
    }
    public Long getTranslationX() {
        return this.translationX;
    }

    public FloorPlan setTranslationY(Long translationY) {
        this.translationY = translationY;
        return this;
    }
    public Long getTranslationY() {
        return this.translationY;
    }

}
