// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateWmBaseImageShrinkRequest extends TeaModel {
    /**
     * <p>The height of the watermark image, in pixels. Valid values: 100 to 5000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1080</p>
     */
    @NameInMap("Height")
    public Integer height;

    /**
     * <p>The image watermark control parameters.</p>
     */
    @NameInMap("ImageControl")
    public String imageControlShrink;

    /**
     * <p>The opacity of the watermark image. Valid values: 1 to 255. A larger value indicates lower transparency.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>255</p>
     */
    @NameInMap("Opacity")
    public Integer opacity;

    /**
     * <p>The scaling ratio of the watermark image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Scale")
    public Integer scale;

    /**
     * <p>The width of the watermark image, in pixels. Valid values: 100 to 5000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1920</p>
     */
    @NameInMap("Width")
    public Integer width;

    /**
     * <p>The watermark information in Base64-encoded string format. The length is 1 to 300 characters. If this parameter is set, the WmInfoUint parameter cannot be set.</p>
     * 
     * <strong>example:</strong>
     * <p>aGVsbG8gc2F*****</p>
     */
    @NameInMap("WmInfoBytesB64")
    public String wmInfoBytesB64;

    /**
     * <p>The bit width of the watermark information capacity. Default value: 32. This parameter must be consistent between embedding and extraction. For example, if the SDK used for embedding is 40-bit, set this parameter to 40 during extraction as well.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("WmInfoSize")
    public Long wmInfoSize;

    /**
     * <p>The watermark information in decimal number format. If this parameter is set, WmInfoBytesB64 cannot be set.</p>
     * <p>The valid range depends on the WmInfoSize parameter:</p>
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
     * <p>The watermark type. Valid values:</p>
     * <ul>
     * <li><strong>PureWebappInvisible</strong>: web watermark.</li>
     * <li><strong>PureAppInvisible</strong>: App watermark.</li>
     * <li><strong>PureScreenInvisible</strong>: screen watermark.</li>
     * <li><strong>AigcWebappInvisible</strong>: AIGC web watermark.</li>
     * <li><strong>AigcAppInvisible</strong>: AIGC App watermark.</li>
     * <li><strong>AigcScreenInvisible</strong>: AIGC screen watermark.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PureWebappInvisible</p>
     */
    @NameInMap("WmType")
    public String wmType;

    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>Remarks</p>
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
