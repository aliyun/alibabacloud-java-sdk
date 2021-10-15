// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class WebofficeWatermark extends TeaModel {
    // 字体颜色
    @NameInMap("FillStyle")
    public String fillStyle;

    // 字体样式
    @NameInMap("Font")
    public String font;

    // 水平间距
    @NameInMap("Horizontal")
    public Long horizontal;

    // 旋转角度
    @NameInMap("Rotate")
    public Float rotate;

    // 水印类型，目前仅支持文字水印，0: 无水印；1: 文字水印
    @NameInMap("Type")
    public Long type;

    // 水印文字
    @NameInMap("Value")
    public String value;

    // 垂直间距
    @NameInMap("Vertical")
    public Long vertical;

    public static WebofficeWatermark build(java.util.Map<String, ?> map) throws Exception {
        WebofficeWatermark self = new WebofficeWatermark();
        return TeaModel.build(map, self);
    }

    public WebofficeWatermark setFillStyle(String fillStyle) {
        this.fillStyle = fillStyle;
        return this;
    }
    public String getFillStyle() {
        return this.fillStyle;
    }

    public WebofficeWatermark setFont(String font) {
        this.font = font;
        return this;
    }
    public String getFont() {
        return this.font;
    }

    public WebofficeWatermark setHorizontal(Long horizontal) {
        this.horizontal = horizontal;
        return this;
    }
    public Long getHorizontal() {
        return this.horizontal;
    }

    public WebofficeWatermark setRotate(Float rotate) {
        this.rotate = rotate;
        return this;
    }
    public Float getRotate() {
        return this.rotate;
    }

    public WebofficeWatermark setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public WebofficeWatermark setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public WebofficeWatermark setVertical(Long vertical) {
        this.vertical = vertical;
        return this;
    }
    public Long getVertical() {
        return this.vertical;
    }

}
