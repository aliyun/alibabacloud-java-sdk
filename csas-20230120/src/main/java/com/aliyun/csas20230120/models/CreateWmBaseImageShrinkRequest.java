// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateWmBaseImageShrinkRequest extends TeaModel {
    /**
     * <p>Height of the watermark image, in pixels. Valid values: 100 to 5000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1080</p>
     */
    @NameInMap("Height")
    public Integer height;

    /**
     * <p>Image watermark control parameters.</p>
     */
    @NameInMap("ImageControl")
    public String imageControlShrink;

    /**
     * <p>Opacity of the watermark image. Valid values: 1 to 255. Higher values mean lower transparency.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>255</p>
     */
    @NameInMap("Opacity")
    public Integer opacity;

    /**
     * <p>Scaling factor of the watermark image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Scale")
    public Integer scale;

    /**
     * <p>Width of the watermark image, in pixels. Valid values: 100 to 5000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1920</p>
     */
    @NameInMap("Width")
    public Integer width;

    /**
     * <p>Base64-encoded watermark information. Length: 1 to 300 characters. Do not set this parameter if you set WmInfoUint.</p>
     * 
     * <strong>example:</strong>
     * <p>aGVsbG8gc2F*****</p>
     */
    @NameInMap("WmInfoBytesB64")
    public String wmInfoBytesB64;

    /**
     * <p>Bit width of the watermark information. Default value: 32. This value must be the same during embedding and extraction. For example, if you use a 40-bit SDK to embed the watermark, set this value to 40 when extracting it.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("WmInfoSize")
    public Long wmInfoSize;

    /**
     * <p>Decimal-form watermark information. Do not set this parameter if you set WmInfoBytesB64.</p>
     * <p>The valid range depends on the WmInfoSize value:</p>
     * <ul>
     * <li><p>If WmInfoSize is <strong>32</strong>, the valid range is 1 to 4294967295.</p>
     * </li>
     * <li><p>If WmInfoSize is <strong>40</strong>, the valid range is 1 to 1099511627775.</p>
     * </li>
     * <li><p>If WmInfoSize is <strong>64</strong>, the valid range is 1 to 18446744073709551615.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>12*****</p>
     */
    @NameInMap("WmInfoUint")
    public String wmInfoUint;

    /**
     * <p>Watermark type. Valid values:</p>
     * <ul>
     * <li><p><strong>PureWebappInvisible</strong>: Web watermark.</p>
     * </li>
     * <li><p><strong>PureAppInvisible</strong>: App watermark.</p>
     * </li>
     * <li><p><strong>PureScreenInvisible</strong>: Screen watermark.</p>
     * </li>
     * <li><p><strong>AigcWebappInvisible</strong>: AIGC web watermark.</p>
     * </li>
     * <li><p><strong>AigcAppInvisible</strong>: AIGC app watermark.</p>
     * </li>
     * <li><p><strong>AigcScreenInvisible</strong>: AIGC screen watermark.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PureWebappInvisible</p>
     */
    @NameInMap("WmType")
    public String wmType;

    /**
     * <p>Comments.</p>
     * 
     * <strong>example:</strong>
     * <p>备注</p>
     */
    @NameInMap("comment")
    public String comment;

    public static CreateWmBaseImageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWmBaseImageShrinkRequest self = new CreateWmBaseImageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateWmBaseImageShrinkRequest setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public CreateWmBaseImageShrinkRequest setImageControlShrink(String imageControlShrink) {
        this.imageControlShrink = imageControlShrink;
        return this;
    }
    public String getImageControlShrink() {
        return this.imageControlShrink;
    }

    public CreateWmBaseImageShrinkRequest setOpacity(Integer opacity) {
        this.opacity = opacity;
        return this;
    }
    public Integer getOpacity() {
        return this.opacity;
    }

    public CreateWmBaseImageShrinkRequest setScale(Integer scale) {
        this.scale = scale;
        return this;
    }
    public Integer getScale() {
        return this.scale;
    }

    public CreateWmBaseImageShrinkRequest setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

    public CreateWmBaseImageShrinkRequest setWmInfoBytesB64(String wmInfoBytesB64) {
        this.wmInfoBytesB64 = wmInfoBytesB64;
        return this;
    }
    public String getWmInfoBytesB64() {
        return this.wmInfoBytesB64;
    }

    public CreateWmBaseImageShrinkRequest setWmInfoSize(Long wmInfoSize) {
        this.wmInfoSize = wmInfoSize;
        return this;
    }
    public Long getWmInfoSize() {
        return this.wmInfoSize;
    }

    public CreateWmBaseImageShrinkRequest setWmInfoUint(String wmInfoUint) {
        this.wmInfoUint = wmInfoUint;
        return this;
    }
    public String getWmInfoUint() {
        return this.wmInfoUint;
    }

    public CreateWmBaseImageShrinkRequest setWmType(String wmType) {
        this.wmType = wmType;
        return this;
    }
    public String getWmType() {
        return this.wmType;
    }

    public CreateWmBaseImageShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

}
