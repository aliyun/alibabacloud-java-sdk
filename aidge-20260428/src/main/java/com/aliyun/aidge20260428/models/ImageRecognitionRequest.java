// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageRecognitionRequest extends TeaModel {
    /**
     * <p>The URL of the image to recognize.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://fb-es.mrvcdn.com/kf/E6332bde0101849968532c4f08dac757cZ.jpg">https://fb-es.mrvcdn.com/kf/E6332bde0101849968532c4f08dac757cZ.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The list of non-subject element types to detect. Valid values: 1 (background), 2 (border), 3 (watermark), and 4 (collage).</p>
     * 
     * <strong>example:</strong>
     * <p>[1,2,3,4]</p>
     */
    @NameInMap("NonObjectDetectElements")
    public java.util.List<Integer> nonObjectDetectElements;

    /**
     * <p>The list of subject element types to detect. Valid values: 1 (product subject), 2 (model), 3 (text), and 4 (logo).</p>
     * 
     * <strong>example:</strong>
     * <p>[1,2,3,4]</p>
     */
    @NameInMap("ObjectDetectElements")
    public java.util.List<Integer> objectDetectElements;

    /**
     * <p>Specifies whether to return border pixel information. Valid values: 1 (return) and 0 (do not return).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReturnBorderPixel")
    public Integer returnBorderPixel;

    /**
     * <p>Specifies whether to return text information. Valid values: 1 (return) and 0 (do not return).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReturnCharacter")
    public Integer returnCharacter;

    /**
     * <p>Specifies whether to return text property information. Valid values: 1 (return) and 0 (do not return).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReturnCharacterProp")
    public Integer returnCharacterProp;

    /**
     * <p>Specifies whether to return the product count. Valid values: 1 (return) and 0 (do not return).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReturnProductNum")
    public Integer returnProductNum;

    /**
     * <p>Specifies whether to return product property information. Valid values: 1 (return) and 0 (do not return).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReturnProductProp")
    public Integer returnProductProp;

    public static ImageRecognitionRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageRecognitionRequest self = new ImageRecognitionRequest();
        return TeaModel.build(map, self);
    }

    public ImageRecognitionRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public ImageRecognitionRequest setNonObjectDetectElements(java.util.List<Integer> nonObjectDetectElements) {
        this.nonObjectDetectElements = nonObjectDetectElements;
        return this;
    }
    public java.util.List<Integer> getNonObjectDetectElements() {
        return this.nonObjectDetectElements;
    }

    public ImageRecognitionRequest setObjectDetectElements(java.util.List<Integer> objectDetectElements) {
        this.objectDetectElements = objectDetectElements;
        return this;
    }
    public java.util.List<Integer> getObjectDetectElements() {
        return this.objectDetectElements;
    }

    public ImageRecognitionRequest setReturnBorderPixel(Integer returnBorderPixel) {
        this.returnBorderPixel = returnBorderPixel;
        return this;
    }
    public Integer getReturnBorderPixel() {
        return this.returnBorderPixel;
    }

    public ImageRecognitionRequest setReturnCharacter(Integer returnCharacter) {
        this.returnCharacter = returnCharacter;
        return this;
    }
    public Integer getReturnCharacter() {
        return this.returnCharacter;
    }

    public ImageRecognitionRequest setReturnCharacterProp(Integer returnCharacterProp) {
        this.returnCharacterProp = returnCharacterProp;
        return this;
    }
    public Integer getReturnCharacterProp() {
        return this.returnCharacterProp;
    }

    public ImageRecognitionRequest setReturnProductNum(Integer returnProductNum) {
        this.returnProductNum = returnProductNum;
        return this;
    }
    public Integer getReturnProductNum() {
        return this.returnProductNum;
    }

    public ImageRecognitionRequest setReturnProductProp(Integer returnProductProp) {
        this.returnProductProp = returnProductProp;
        return this;
    }
    public Integer getReturnProductProp() {
        return this.returnProductProp;
    }

}
