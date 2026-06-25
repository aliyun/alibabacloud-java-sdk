// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class AddImageRequest extends TeaModel {
    /**
     * <p>The image category. For more information, refer to <a href="https://help.aliyun.com/document_detail/179184.html">Category reference</a>.</p>
     * <blockquote>
     * <ul>
     * <li>For product image search, if you specify a category, the specified category is used. If you do not specify a category, the system predicts the category. The predicted category result can be obtained from the response.
     * &lt;props=&quot;china&quot;&gt;</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li><p>For fabric, trademark, generic, furniture, and industrial hardware image search, the system sets the category to 88888888 regardless of whether you specify a category.</p>
     * </li>
     * <li><p>For generic image search, the system sets the category to 88888888 regardless of whether you specify a category.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>88888888</p>
     */
    @NameInMap("CategoryId")
    public Integer categoryId;

    /**
     * <p>Specifies whether to perform subject identification. Default value: true.</p>
     * <ul>
     * <li>true: The system performs subject identification and searches based on the identified subject. The subject identification result can be obtained from the response.</li>
     * <li>false: The system does not perform subject identification and searches based on the entire image.</li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;For fabric image search, this parameter is ignored. The system searches based on the entire image..</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Crop")
    public Boolean crop;

    /**
     * <p>The custom content defined by the user. The content can be up to 4,096 characters in length.</p>
     * <blockquote>
     * <p>This field is returned in query results. For example, you can add a text description of the image.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>zidingyi</p>
     */
    @NameInMap("CustomContent")
    public String customContent;

    /**
     * <p>The name of the Image Search instance. The name can be up to 20 characters in length.
     * If you have purchased an Image Search instance, log on to the <a href="https://imagesearch.console.aliyun.com/">Image Search console</a> to view the instance name.
     * If you have not purchased an Image Search instance, refer to <a href="https://help.aliyun.com/document_detail/179178.html">Activate the service</a> and <a href="https://help.aliyun.com/document_detail/66569.html">Create an instance</a>.</p>
     * <blockquote>
     * <p>The instance name is not the instance ID. Do not confuse the two.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demoinstance1</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The integer attribute. This attribute can be used to filter query results and is returned in query results.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("IntAttr")
    public Integer intAttr;

    /**
     * <p>The integer attribute. This attribute can be used to filter query results and is returned in query results.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("IntAttr2")
    public Integer intAttr2;

    /**
     * <p>The integer attribute. This attribute can be used to filter query results and is returned in query results.</p>
     * 
     * <strong>example:</strong>
     * <p>33</p>
     */
    @NameInMap("IntAttr3")
    public Integer intAttr3;

    /**
     * <p>The integer attribute. This attribute can be used to filter query results and is returned in query results.</p>
     * 
     * <strong>example:</strong>
     * <p>44</p>
     */
    @NameInMap("IntAttr4")
    public Integer intAttr4;

    /**
     * <p>The image content.</p>
     * <ul>
     * <li>The image size cannot exceed 4 MB.</li>
     * <li>Image formats: PNG, JPG, JPEG, BMP, GIF, WEBP, TIFF, and PPM.</li>
     * <li>The transmission wait time cannot exceed 5 seconds.
     * &lt;props=&quot;china&quot;&gt;</li>
     * <li>For product image search, generic image search, furniture image search, and industrial hardware image search, the image width and height must be at least 100 pixels and at most 4,096 pixels.
     *   For trademark image search, the image width and height must be at least 200 pixels and less than 4,096 pixels.
     *  For fabric image search, the image width and height must be at least 448 pixels and at most 4,096 pixels.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li><p>For product image search and generic image search, the image width and height must be at least 100 pixels and at most 4,096 pixels.</p>
     * </li>
     * <li><p>The image must not contain rotation information.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><strong>When calling by using an SDK:</strong></li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>If you use a V3 SDK, you do not need to set the PicContent field. The SDK encapsulates this field as PicContentObject and automatically converts it to Base64 encoding. For specific examples, refer to <a href="https://help.aliyun.com/document_detail/179188.html">Java SDK</a>.</li>
     * <li>The SDK does not support passing image URLs directly. The V3 SDK provides an alternative method to upload images by URL. For specific examples, refer to <a href="https://help.aliyun.com/document_detail/179188.html">Java SDK</a>.</li>
     * <li><strong>When calling by using the Alibaba Cloud OpenAPI platform:</strong><ul>
     * <li>If you use the <strong>2019-03-25</strong> version, set the <strong>PicContent</strong> field to the <strong>Base64</strong> encoding of the image.</li>
     * <li>If you use the <strong>2020-12-14</strong> version, click to upload the image directly in the <strong>PicContent</strong> field.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAANSUhEUgAAAPcAAAEVCAYAAAA8d3NuAAAAAXNSR0IArs......RK5CYII=</p>
     */
    @NameInMap("PicContent")
    public String picContent;

    /**
     * <p>The image name. The name can be up to 256 characters in length.</p>
     * <blockquote>
     * <ul>
     * <li>ProductId and PicName uniquely identify an image.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>If you add multiple images with the same ProductId and PicName, only the last added image is retained. Previously added images are overwritten.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2092061_1.jpg</p>
     */
    @NameInMap("PicName")
    public String picName;

    /**
     * <p>The product ID. The ID can be up to 256 characters in length.</p>
     * <blockquote>
     * <p>A product can have multiple images.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2092061_1</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <p>The subject region of the image, in the format of <code>x1,x2,y1,y2</code>, where <code>x1,y1</code> is the upper-left point and <code>x2,y2</code> is the lower-right point.</p>
     * <blockquote>
     * <ul>
     * <li>If you specify Region, the system searches based on the specified Region regardless of the Crop parameter value.
     * &lt;props=&quot;china&quot;&gt;</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li><p>For fabric image search, this parameter is ignored. The system searches based on the entire image.</p>
     * </li>
     * <li><p>The Region parameter has no unit. The values are based on the pixel dimensions of the image. If the image is scaled, the Region parameter values must be scaled proportionally.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>280,486,232,351</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The string attribute. The attribute can be up to 128 characters in length. This attribute can be used to filter query results and is returned in query results.</p>
     * <blockquote>
     * <p>Special characters such as \¥$&amp;% are not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ss</p>
     */
    @NameInMap("StrAttr")
    public String strAttr;

    /**
     * <p>The string attribute. The attribute can be up to 128 characters in length. This attribute can be used to filter query results and is returned in query results.</p>
     * <blockquote>
     * <p>Special characters such as \¥$&amp;% are not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ss</p>
     */
    @NameInMap("StrAttr2")
    public String strAttr2;

    /**
     * <p>The string attribute. The attribute can be up to 128 characters in length. This attribute can be used to filter query results and is returned in query results.</p>
     * <blockquote>
     * <p>Special characters such as \¥$&amp;% are not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ss</p>
     */
    @NameInMap("StrAttr3")
    public String strAttr3;

    /**
     * <p>The string attribute. The attribute can be up to 128 characters in length. This attribute can be used to filter query results and is returned in query results.</p>
     * <blockquote>
     * <p>Special characters such as \¥$&amp;% are not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ss</p>
     */
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
