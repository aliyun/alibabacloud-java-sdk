// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class AddImageRequest extends TeaModel {
    /**
     * <p>The category of the image. For more information, see <a href="https://help.aliyun.com/document_detail/179184.html">Category reference</a>.</p>
     * <blockquote>
     * <ul>
     * <li>For product image search, if you specify a category for an image, the specified category prevails. If you do not specify a category for an image, the system predicts the category, and returns the prediction result in the response.</li>
     * <li>For generic image search, only 88888888 may be returned for this parameter in the response regardless of whether a category is specified.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>88888888</p>
     */
    @NameInMap("CategoryId")
    public Integer categoryId;

    /**
     * <p>Specifies whether to identify the subject in the image and search for images based on the subject identification result. Default value: true. Valid values:</p>
     * <ul>
     * <li>true: The system identifies the subject in the image, and searches for images based on the subject identification result. The subject identification result is included in the response.</li>
     * <li>false: The system does not identify the subject in the image, and searches for images based on the entire image.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Crop")
    public Boolean crop;

    /**
     * <p>The user-defined content. The value can be up to 4,096 characters in length.</p>
     * <blockquote>
     * <p>If you specify this parameter, the response includes this parameter and its value. You can add text such as an image description.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>zidingyi</p>
     */
    @NameInMap("CustomContent")
    public String customContent;

    /**
     * <p>The name of the Image Search instance. The name can be up to 20 characters in length. If an Image Search instance is purchased, you can log on to the <a href="https://imagesearch.console.aliyun.com/">Image Search console</a> to view the instance. If no Image Search instance is purchased, you must purchase an instance. For more information, see <a href="https://help.aliyun.com/document_detail/179178.html">Activate Image Search</a> and <a href="https://help.aliyun.com/document_detail/66569.html">Create an instance</a>.</p>
     * <blockquote>
     * <p>The instance name is not the instance ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demoinstance1</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The attribute, which is an integer. The attribute can be used to filter images when you search for images. If you specify this parameter, the response includes this parameter and its value.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("IntAttr")
    public Integer intAttr;

    /**
     * <p>The attribute, which is an integer. The attribute can be used to filter images when you search for images. If you specify this parameter, the response includes this parameter and its value.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("IntAttr2")
    public Integer intAttr2;

    @NameInMap("IntAttr3")
    public Integer intAttr3;

    @NameInMap("IntAttr4")
    public Integer intAttr4;

    /**
     * <p>The image file. The image file is encoded in Base64.</p>
     * <ul>
     * <li>The file size of the image cannot exceed 4 MB.</li>
     * <li>The following image formats are supported: PNG, JPG, JPEG, BMP, GIF, WebP, TIFF, and PPM.</li>
     * <li>The transmission timeout period cannot exceed 5 seconds.</li>
     * <li>For product and generic image searches, the length and width of the image must range from 100 pixels to 4,096 pixels.</li>
     * <li>The image cannot contain rotation settings.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If you use SDKs to call this operation, you do not need to specify <strong>PicContent</strong>. The SDKs encapsulate this parameter and automatically encode its value in Base64. For more information about how to use Image Search SDK for Java, see <a href="https://help.aliyun.com/document_detail/179188.html">Java SDK</a>.</li>
     * <li>If you use OpenAPI Explorer to call this operation, you can select only the <strong>2019-03-25</strong> version. If you call this operation of other versions, the value of <strong>PicContent</strong> cannot be encoded in Base64.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAANSUhEUgAAAPcAAAEVCAYAAAA8d3NuAAAAAXNSR0IArs......RK5CYII=</p>
     */
    @NameInMap("PicContent")
    public String picContent;

    /**
     * <p>The name of the image. The name can be up to 512 characters in length.</p>
     * <blockquote>
     * <ul>
     * <li>An image is uniquely identified by the values of ProductId and PicName.</li>
     * <li>If you add an image whose product ID (ProductId) and image name (PicName) are the same as those of an existing image, the newly added image overwrites the existing image.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2092061_1.jpg</p>
     */
    @NameInMap("PicName")
    public String picName;

    /**
     * <p>The ID of the product. The ID can be up to 512 characters in length.</p>
     * <blockquote>
     * <p>A product may have multiple images.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2092061_1</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <p>The subject area of the image, in the format of <code>x1,x2,y1,y2</code>. <code>x1 and y1</code> represent the position in the upper-left corner, in pixels. <code>x2 and y2</code> represent the position in the lower-right corner, in pixels.</p>
     * <blockquote>
     * <ul>
     * <li>If you specify Region, the system searches for images based on the value of Region regardless of the value of Crop.</li>
     * <li>The value of Region does not have a unit. The value is generated based on the length and width of the image. If the length and width of the image are scaled, the value of Region must be proportionally adjusted.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>280,486,232,351</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The attribute, which is a string. The value can be up to 128 characters in length. The attribute can be used to filter images when you search for images. If you specify this parameter, the response includes this parameter and its value.</p>
     * <blockquote>
     * <p>The value cannot contain the following special characters: \ ¥ $ &amp; %</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ss</p>
     */
    @NameInMap("StrAttr")
    public String strAttr;

    /**
     * <p>The attribute, which is a string. The value can be up to 128 characters in length. The attribute can be used to filter images when you search for images. If you specify this parameter, the response includes this parameter and its value.</p>
     * <blockquote>
     * <p>The value cannot contain the following special characters: \ ¥ $ &amp; %</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ss</p>
     */
    @NameInMap("StrAttr2")
    public String strAttr2;

    @NameInMap("StrAttr3")
    public String strAttr3;

    @NameInMap("StrAttr4")
    public String strAttr4;

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

    public AddImageRequest setIntAttr3(Integer intAttr3) {
        this.intAttr3 = intAttr3;
        return this;
    }
    public Integer getIntAttr3() {
        return this.intAttr3;
    }

    public AddImageRequest setIntAttr4(Integer intAttr4) {
        this.intAttr4 = intAttr4;
        return this;
    }
    public Integer getIntAttr4() {
        return this.intAttr4;
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

    public AddImageRequest setStrAttr3(String strAttr3) {
        this.strAttr3 = strAttr3;
        return this;
    }
    public String getStrAttr3() {
        return this.strAttr3;
    }

    public AddImageRequest setStrAttr4(String strAttr4) {
        this.strAttr4 = strAttr4;
        return this;
    }
    public String getStrAttr4() {
        return this.strAttr4;
    }

}
