// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageRecognitionAsyncShrinkRequest extends TeaModel {
    /**
     * <p>The URL of the image. The image must be in JPG, JPEG, PNG, BMP, or WEBP format. The resolution must be between 256 × 256 and 3000 × 3000 pixels, and the file size cannot exceed 10 MB.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg">https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>Specifies the types of elements to be detected outside the image subject. Valid values:</p>
     * <ul>
     * <li>1: Watermark.</li>
     * <li>2: Logo.</li>
     * <li>3: Text.</li>
     * <li>4: Text-containing color block.
     * You can specify multiple element types. This parameter and ObjectDetectElements cannot be empty at the same time.</li>
     * </ul>
     */
    @NameInMap("NonObjectDetectElements")
    public String nonObjectDetectElementsShrink;

    /**
     * <p>Specifies the types of elements to be detected on the image subject. Valid values:</p>
     * <ul>
     * <li>1: Watermark.</li>
     * <li>2: Logo.</li>
     * <li>3: Text.</li>
     * <li>4: Text-containing color block.
     * You can specify multiple element types.</li>
     * </ul>
     */
    @NameInMap("ObjectDetectElements")
    public String objectDetectElementsShrink;

    /**
     * <p>Specifies whether to return the marginalization distance of the subject. Valid values:</p>
     * <ul>
     * <li>1: Yes.</li>
     * <li>0: No.
     * Default value: 0.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReturnBorderPixel")
    public Integer returnBorderPixel;

    /**
     * <p>Specifies whether to return the OCR results of the text in the recognized area. Valid values:</p>
     * <ul>
     * <li>1: Yes.</li>
     * <li>0: No.
     * Default value: 0.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReturnCharacter")
    public Integer returnCharacter;

    /**
     * <p>Specifies whether to return the text proportion. Valid values:</p>
     * <ul>
     * <li>1: Yes.</li>
     * <li>0: No.
     * Default value: 0.
     * This parameter takes effect only when the following two conditions are met:</li>
     * </ul>
     * <ol>
     * <li>ReturnCharacter is set to 1.</li>
     * <li>ObjectDetectElements or NonObjectDetectElements is set to 3, which means text recognition is required.</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReturnCharacterProp")
    public Integer returnCharacterProp;

    /**
     * <p>Specifies whether to return the number of subjects. Valid values:</p>
     * <ul>
     * <li>1: Yes.</li>
     * <li>0: No.
     * Default value: 0.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReturnProductNum")
    public Integer returnProductNum;

    /**
     * <p>Specifies whether to return the area proportion of the subject. Valid values:</p>
     * <ul>
     * <li>1: Yes.</li>
     * <li>0: No.
     * Default value: 0.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReturnProductProp")
    public Integer returnProductProp;

    public static ImageRecognitionAsyncShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageRecognitionAsyncShrinkRequest self = new ImageRecognitionAsyncShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ImageRecognitionAsyncShrinkRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public ImageRecognitionAsyncShrinkRequest setNonObjectDetectElementsShrink(String nonObjectDetectElementsShrink) {
        this.nonObjectDetectElementsShrink = nonObjectDetectElementsShrink;
        return this;
    }
    public String getNonObjectDetectElementsShrink() {
        return this.nonObjectDetectElementsShrink;
    }

    public ImageRecognitionAsyncShrinkRequest setObjectDetectElementsShrink(String objectDetectElementsShrink) {
        this.objectDetectElementsShrink = objectDetectElementsShrink;
        return this;
    }
    public String getObjectDetectElementsShrink() {
        return this.objectDetectElementsShrink;
    }

    public ImageRecognitionAsyncShrinkRequest setReturnBorderPixel(Integer returnBorderPixel) {
        this.returnBorderPixel = returnBorderPixel;
        return this;
    }
    public Integer getReturnBorderPixel() {
        return this.returnBorderPixel;
    }

    public ImageRecognitionAsyncShrinkRequest setReturnCharacter(Integer returnCharacter) {
        this.returnCharacter = returnCharacter;
        return this;
    }
    public Integer getReturnCharacter() {
        return this.returnCharacter;
    }

    public ImageRecognitionAsyncShrinkRequest setReturnCharacterProp(Integer returnCharacterProp) {
        this.returnCharacterProp = returnCharacterProp;
        return this;
    }
    public Integer getReturnCharacterProp() {
        return this.returnCharacterProp;
    }

    public ImageRecognitionAsyncShrinkRequest setReturnProductNum(Integer returnProductNum) {
        this.returnProductNum = returnProductNum;
        return this;
    }
    public Integer getReturnProductNum() {
        return this.returnProductNum;
    }

    public ImageRecognitionAsyncShrinkRequest setReturnProductProp(Integer returnProductProp) {
        this.returnProductProp = returnProductProp;
        return this;
    }
    public Integer getReturnProductProp() {
        return this.returnProductProp;
    }

}
