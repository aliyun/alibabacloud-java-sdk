// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class AddImageRequest extends TeaModel {
    /**
     * <p>The category of the image. For more information, see [Category reference](~~179184~~).</p>
     * <br>
     * <p>> *   For product image search, if you specify a category for an image, the specified category prevails. If you do not specify a category for an image, the system predicts the category, and returns the prediction result in the response.</p>
     * <p>>*   For generic image search, only 88888888 may be returned for this parameter in the response regardless of whether a category is specified.</p>
     */
    @NameInMap("CategoryId")
    public Integer categoryId;

    /**
     * <p>Specifies whether to identify the subject in the image and search for images based on the subject identification result. Default value: true. Valid values:</p>
     * <br>
     * <p>*   true: The system identifies the subject in the image, and searches for images based on the subject identification result. The subject identification result is included in the response.</p>
     * <p>*   false: The system does not identify the subject in the image, and searches for images based on the entire image.</p>
     */
    @NameInMap("Crop")
    public Boolean crop;

    /**
     * <p>The user-defined content. The value can be up to 4,096 characters in length.</p>
     * <br>
     * <p>> If you specify this parameter, the response includes this parameter and its value. You can add text such as an image description.</p>
     */
    @NameInMap("CustomContent")
    public String customContent;

    /**
     * <p>The name of the Image Search instance. The name can be up to 20 characters in length. If an Image Search instance is purchased, you can log on to the [Image Search console](https://imagesearch.console.aliyun.com/) to view the instance. If no Image Search instance is purchased, you must purchase an instance. For more information, see [Activate Image Search](~~179178~~) and [Create an instance](~~66569~~).</p>
     * <br>
     * <p>> The instance name is not the instance ID.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The attribute, which is an integer. The attribute can be used to filter images when you search for images. If you specify this parameter, the response includes this parameter and its value.</p>
     */
    @NameInMap("IntAttr")
    public Integer intAttr;

    /**
     * <p>The attribute, which is an integer. The attribute can be used to filter images when you search for images. If you specify this parameter, the response includes this parameter and its value.</p>
     */
    @NameInMap("IntAttr2")
    public Integer intAttr2;

    /**
     * <p>The image file. The image file is encoded in Base64.</p>
     * <br>
     * <p>*   The file size of the image cannot exceed 4 MB.</p>
     * <p>*   The following image formats are supported: PNG, JPG, JPEG, BMP, GIF, WebP, TIFF, and PPM.</p>
     * <p>*   The transmission timeout period cannot exceed 5 seconds.</p>
     * <p>*   For product and generic image searches, the length and width of the image must range from 100 pixels to 4,096 pixels.</p>
     * <p>*   The image cannot contain rotation settings.</p>
     * <br>
     * <p>> *   If you use SDKs to call this operation, you do not need to specify **PicContent**. The SDKs encapsulate this parameter and automatically encode its value in Base64. For more information about how to use Image Search SDK for Java, see [Java SDK](~~179188~~).</p>
     * <p>>*   If you use OpenAPI Explorer to call this operation, you can select only the **2019-03-25** version. If you call this operation of other versions, the value of **PicContent** cannot be encoded in Base64.</p>
     */
    @NameInMap("PicContent")
    public String picContent;

    /**
     * <p>The name of the image. The name can be up to 512 characters in length.</p>
     * <br>
     * <p>> *   An image is uniquely identified by the values of ProductId and PicName.</p>
     * <p>>*   If you add an image whose product ID (ProductId) and image name (PicName) are the same as those of an existing image, the newly added image overwrites the existing image.</p>
     */
    @NameInMap("PicName")
    public String picName;

    /**
     * <p>The ID of the product. The ID can be up to 512 characters in length.</p>
     * <br>
     * <p>> A product may have multiple images.</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <p>The subject area of the image, in the format of `x1,x2,y1,y2`. `x1 and y1` represent the position in the upper-left corner, in pixels. `x2 and y2` represent the position in the lower-right corner, in pixels.</p>
     * <br>
     * <p>> *   If you specify Region, the system searches for images based on the value of Region regardless of the value of Crop.</p>
     * <p>>*   The value of Region does not have a unit. The value is generated based on the length and width of the image. If the length and width of the image are scaled, the value of Region must be proportionally adjusted.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The attribute, which is a string. The value can be up to 128 characters in length. The attribute can be used to filter images when you search for images. If you specify this parameter, the response includes this parameter and its value.</p>
     * <br>
     * <p>> The value cannot contain the following special characters: \ ¥ $ & %</p>
     */
    @NameInMap("StrAttr")
    public String strAttr;

    /**
     * <p>The attribute, which is a string. The value can be up to 128 characters in length. The attribute can be used to filter images when you search for images. If you specify this parameter, the response includes this parameter and its value.</p>
     * <br>
     * <p>> The value cannot contain the following special characters: \ ¥ $ & %</p>
     */
    @NameInMap("StrAttr2")
    public String strAttr2;

    public static AddImageRequest build(java.util.Map<String, ?> map) throws Exception {
        AddImageRequest self = new AddImageRequest();
        return TeaModel.build(map, self);
    }

    public AddImageRequest setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Integer getCategoryId() {
        return this.categoryId;
    }

    public AddImageRequest setCrop(Boolean crop) {
        this.crop = crop;
        return this;
    }
    public Boolean getCrop() {
        return this.crop;
    }

    public AddImageRequest setCustomContent(String customContent) {
        this.customContent = customContent;
        return this;
    }
    public String getCustomContent() {
        return this.customContent;
    }

    public AddImageRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public AddImageRequest setIntAttr(Integer intAttr) {
        this.intAttr = intAttr;
        return this;
    }
    public Integer getIntAttr() {
        return this.intAttr;
    }

    public AddImageRequest setIntAttr2(Integer intAttr2) {
        this.intAttr2 = intAttr2;
        return this;
    }
    public Integer getIntAttr2() {
        return this.intAttr2;
    }

    public AddImageRequest setPicContent(String picContent) {
        this.picContent = picContent;
        return this;
    }
    public String getPicContent() {
        return this.picContent;
    }

    public AddImageRequest setPicName(String picName) {
        this.picName = picName;
        return this;
    }
    public String getPicName() {
        return this.picName;
    }

    public AddImageRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public AddImageRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public AddImageRequest setStrAttr(String strAttr) {
        this.strAttr = strAttr;
        return this;
    }
    public String getStrAttr() {
        return this.strAttr;
    }

    public AddImageRequest setStrAttr2(String strAttr2) {
        this.strAttr2 = strAttr2;
        return this;
    }
    public String getStrAttr2() {
        return this.strAttr2;
    }

}
