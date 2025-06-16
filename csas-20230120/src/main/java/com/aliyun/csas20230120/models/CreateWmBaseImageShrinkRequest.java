// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateWmBaseImageShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1080</p>
     */
    @NameInMap("Height")
    public Integer height;

    @NameInMap("ImageControl")
    public String imageControlShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>255</p>
     */
    @NameInMap("Opacity")
    public Integer opacity;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Scale")
    public Integer scale;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1920</p>
     */
    @NameInMap("Width")
    public Integer width;

    /**
     * <strong>example:</strong>
     * <p>aGVsbG8gc2F*****</p>
     */
    @NameInMap("WmInfoBytesB64")
    public String wmInfoBytesB64;

    /**
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("WmInfoSize")
    public Long wmInfoSize;

    /**
     * <strong>example:</strong>
     * <p>12*****</p>
     */
    @NameInMap("WmInfoUint")
    public String wmInfoUint;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PureWebappInvisible</p>
     */
    @NameInMap("WmType")
    public String wmType;

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

}
