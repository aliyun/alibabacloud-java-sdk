// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageMattingAsyncRequest extends TeaModel {
    /**
     * <p>Specifies the background format of the returned image. Valid values:</p>
     * <ul>
     * <li>WHITE_BACKGROUND: Returns an image with a white background.</li>
     * <li>TRANSPARENT: Returns an image with a transparent background.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WHITE_BACKGROUND</p>
     */
    @NameInMap("BackGroundType")
    public String backGroundType;

    /**
     * <p>The BGR color value of the background. Default value: white.</p>
     * 
     * <strong>example:</strong>
     * <p>255,255,255</p>
     */
    @NameInMap("BgColor")
    public String bgColor;

    /**
     * <p>The URL of the original image. The image must be in JPG, JPEG, PNG, BMP, or WEBP format. The resolution must be between 100 × 100 and 3000 × 3000 pixels, and the file size cannot exceed 10 MB.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg">https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The expected height of the cropped image. If you do not specify this parameter, the original height of the image is used. Unit: pixels. Valid values: 100 to 5000.</p>
     * 
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("TargetHeight")
    public Integer targetHeight;

    /**
     * <p>The expected width of the cropped image. If you do not specify this parameter, the original width of the image is used. Unit: pixels. Valid values: 100 to 5000.</p>
     * 
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("TargetWidth")
    public Integer targetWidth;

    public static ImageMattingAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageMattingAsyncRequest self = new ImageMattingAsyncRequest();
        return TeaModel.build(map, self);
    }

    public ImageMattingAsyncRequest setBackGroundType(String backGroundType) {
        this.backGroundType = backGroundType;
        return this;
    }
    public String getBackGroundType() {
        return this.backGroundType;
    }

    public ImageMattingAsyncRequest setBgColor(String bgColor) {
        this.bgColor = bgColor;
        return this;
    }
    public String getBgColor() {
        return this.bgColor;
    }

    public ImageMattingAsyncRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public ImageMattingAsyncRequest setTargetHeight(Integer targetHeight) {
        this.targetHeight = targetHeight;
        return this;
    }
    public Integer getTargetHeight() {
        return this.targetHeight;
    }

    public ImageMattingAsyncRequest setTargetWidth(Integer targetWidth) {
        this.targetWidth = targetWidth;
        return this;
    }
    public Integer getTargetWidth() {
        return this.targetWidth;
    }

}
