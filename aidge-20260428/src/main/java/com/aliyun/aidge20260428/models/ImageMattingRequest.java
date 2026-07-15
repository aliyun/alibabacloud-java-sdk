// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageMattingRequest extends TeaModel {
    /**
     * <p>Specifies the background type of the returned image. Valid values:</p>
     * <ul>
     * <li>WHITE_BACKGROUND: white background image.</li>
     * <li>TRANSPARENT: transparent background image.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WHITE_BACKGROUND</p>
     */
    @NameInMap("BackGroundType")
    public String backGroundType;

    /**
     * <p>BGColor</p>
     * 
     * <strong>example:</strong>
     * <p>255,255,255</p>
     */
    @NameInMap("BgColor")
    public String bgColor;

    /**
     * <p>The URL of the original image. The image must be in JPG, JPEG, PNG, BMP, or WEBP format. The resolution must be between 256 × 256 and 3000 × 3000 pixels. The file size cannot exceed 10 MB.<br><strong>Example</strong>: <code>&quot;https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg&quot;</code></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://sc02.alicdn.com/kf/H09364d2c7fc942e685d3b0f656261b24Q.png">https://sc02.alicdn.com/kf/H09364d2c7fc942e685d3b0f656261b24Q.png</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The target image height in pixels.</p>
     * 
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("TargetHeight")
    public Integer targetHeight;

    /**
     * <p>The target image width in pixels.</p>
     * 
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("TargetWidth")
    public Integer targetWidth;

    public static ImageMattingRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageMattingRequest self = new ImageMattingRequest();
        return TeaModel.build(map, self);
    }

    public ImageMattingRequest setBackGroundType(String backGroundType) {
        this.backGroundType = backGroundType;
        return this;
    }
    public String getBackGroundType() {
        return this.backGroundType;
    }

    public ImageMattingRequest setBgColor(String bgColor) {
        this.bgColor = bgColor;
        return this;
    }
    public String getBgColor() {
        return this.bgColor;
    }

    public ImageMattingRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public ImageMattingRequest setTargetHeight(Integer targetHeight) {
        this.targetHeight = targetHeight;
        return this;
    }
    public Integer getTargetHeight() {
        return this.targetHeight;
    }

    public ImageMattingRequest setTargetWidth(Integer targetWidth) {
        this.targetWidth = targetWidth;
        return this;
    }
    public Integer getTargetWidth() {
        return this.targetWidth;
    }

}
