// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class WebofficeWatermark extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>rgba(192, 192, 192, 0.6)</p>
     */
    @NameInMap("FillStyle")
    public String fillStyle;

    /**
     * <strong>example:</strong>
     * <p>bold 20px Serif</p>
     */
    @NameInMap("Font")
    public String font;

    @NameInMap("Horizontal")
    public Long horizontal;

    @NameInMap("Rotate")
    public Float rotate;

    @NameInMap("Type")
    public Long type;

    @NameInMap("Value")
    public String value;

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
