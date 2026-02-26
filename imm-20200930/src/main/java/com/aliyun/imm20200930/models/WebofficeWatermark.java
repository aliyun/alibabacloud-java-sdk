// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class WebofficeWatermark extends TeaModel {
    /**
     * <p>The color and transparency of the text watermark.</p>
     * 
     * <strong>example:</strong>
     * <p>rgba(192, 192, 192, 0.6)</p>
     */
    @NameInMap("FillStyle")
    public String fillStyle;

    /**
     * <p>The font of the text watermark.</p>
     * 
     * <strong>example:</strong>
     * <p>bold 20px Serif</p>
     */
    @NameInMap("Font")
    public String font;

    /**
     * <p>The horizontal spacing of the text watermark. Unit: pixel.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("Horizontal")
    public Long horizontal;

    /**
     * <p>The rotation of the text watermark. Unit: radian.</p>
     * 
     * <strong>example:</strong>
     * <p>-0.7853982</p>
     */
    @NameInMap("Rotate")
    public Float rotate;

    /**
     * <p>The watermark type. Valid values:</p>
     * <ul>
     * <li>0: no watermark.</li>
     * <li>1: text watermark.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Type")
    public Long type;

    /**
     * <p>The watermark text.</p>
     * <blockquote>
     * <p> This parameter takes effect only if you set the Type parameter to 1.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Value")
    public String value;

    /**
     * <p>The vertical spacing of the text watermark. Unit: pixel.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
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
