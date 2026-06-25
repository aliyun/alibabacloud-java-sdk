// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class SearchImageByPicRequest extends TeaModel {
    /**
     * <p>The product category. For more information, see <a href="https://help.aliyun.com/document_detail/179184.html">Category reference</a>.</p>
     * <ul>
     * <li>For product image search, if you specify a category, the specified category is used. If you do not specify a category, the system predicts the category. You can obtain the predicted category from the response.
     * &lt;props=&quot;china&quot;&gt;</li>
     * <li>For fabric, trademark, generic furniture, and industrial hardware image search, the system sets the category to 88888888 regardless of whether you specify a category.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li>For generic image search, the system sets the category to 88888888 regardless of whether you specify a category.
     * .</li>
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
     * <li>If this parameter is set to true, the system performs subject identification and searches based on the identified subject. You can obtain the subject identification result from the response.</li>
     * <li>If this parameter is set to false, the system does not perform subject identification and searches based on the entire image.
     * &lt;props=&quot;china&quot;&gt;</li>
     * <li>For fabric image search, this parameter is ignored and the system searches based on the entire image.
     * .</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Crop")
    public Boolean crop;

    /**
     * <p>Specifies whether to deduplicate results based on the ProductId field during the search. If this parameter is set to true, deduplication is performed.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DistinctProductId")
    public Boolean distinctProductId;

    /**
     * <p>The filter condition. The int_attr field supports the following operators: in, not in, greater than (&gt;), greater than or equal to (&gt;=), less than (&lt;), less than or equal to (&lt;=), and equal to (=). The str_attr field supports the following operators: in, not in, equal to (=), and not equal to (!=). Multiple conditions can be connected by using AND and OR.
     * Examples:</p>
     * <ul>
     * <li>int_attr &gt;= 100.</li>
     * <li>str_attr != &quot;value1&quot;.</li>
     * <li>int_attr = 1000 AND str_attr = &quot;value1&quot;.</li>
     * </ul>
     * <blockquote>
     * <p>A maximum of 4096 characters are supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>int_attr=1000 AND str_attr=&quot;value1&quot;</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The name of the Image Search instance. The name can be up to 20 characters in length.
     * If you have purchased an Image Search instance, log on to the <a href="https://imagesearch.console.aliyun.com/">Image Search console</a> to view the instance name.
     * If you have not purchased an Image Search instance, see <a href="https://help.aliyun.com/document_detail/179178.html">Activate the service</a> and <a href="https://help.aliyun.com/document_detail/66569.html">Create an instance</a>.</p>
     * <blockquote>
     * <p>The instance name is not the instance ID. Make sure that you distinguish between them.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demoinstance1</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The number of results to return. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Num")
    public Integer num;

    /**
     * <p>The image content.</p>
     * <ul>
     * <li>The image size cannot exceed 4 MB.</li>
     * <li>Image formats: PNG, JPG, JPEG, BMP, GIF, WEBP, TIFF, and PPM.</li>
     * <li>The transmission wait time cannot exceed 5 seconds.
     * &lt;props=&quot;china&quot;&gt;</li>
     * <li>For product image search, generic image search, furniture image search, and industrial hardware image search, the image width and height must be greater than or equal to 100 px and less than or equal to 4096 px.
     * For trademark image search, the image width and height must be greater than or equal to 200 px and less than 4096 px.
     * For fabric image search, the image width and height must be greater than or equal to 448 px and less than or equal to 4096 px.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li><p>For product image search and generic image search, the image width and height must be greater than or equal to 100 px and less than or equal to 4096 px.</p>
     * </li>
     * <li><p>The image cannot contain rotation information.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><strong>Call by using the SDK:</strong></li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>If you use the V3 SDK, you do not need to specify the PicContent field. The SDK encapsulates this field as PicContentObject and automatically converts it to Base64 encoding. For specific examples, see <a href="https://help.aliyun.com/document_detail/179188.html">Java SDK</a>.</li>
     * <li>The SDK does not support directly passing an image URL. The V3 SDK provides an alternative method to upload images by URL. For specific examples, see <a href="https://help.aliyun.com/document_detail/179188.html">Java SDK</a>.</li>
     * <li><strong>Call by using the Alibaba Cloud OpenAPI platform:</strong><ul>
     * <li>If you use the <strong>2019-03-25</strong> version, set the <strong>PicContent</strong> field to the <strong>Base64</strong>-encoded string of the image.</li>
     * <li>If you use the <strong>2020-12-14</strong> version, click the upload button in the <strong>PicContent</strong> field to upload the image.</li>
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
     * <p>The subject region of the image, in the format of <code>x1,x2,y1,y2</code>, where <code>x1,y1</code> is the upper-left point and <code>x2,y2</code> is the lower-right point.</p>
     * <blockquote>
     * <ul>
     * <li>If you specify Region, the system searches based on the specified Region regardless of the value of the Crop parameter.
     * &lt;props=&quot;china&quot;&gt;</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>For fabric image search, this parameter is ignored and the system searches based on the entire image.
     * .</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>280,486,232,351</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The similarity score threshold. After you specify this threshold, only images with a similarity score greater than or equal to the threshold are returned. Valid values: 0.00 to 1.00. Up to two decimal places are supported. Default value: 0.00.</p>
     * 
     * <strong>example:</strong>
     * <p>0.50</p>
     */
    @NameInMap("ScoreThreshold")
    public String scoreThreshold;

    /**
     * <p>The start position of the results to return. Valid values: 0 to 499. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Start")
    public Integer start;

    public static SearchImageByPicRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchImageByPicRequest self = new SearchImageByPicRequest();
        return TeaModel.build(map, self);
    }

    public SearchImageByPicRequest setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Integer getCategoryId() {
        return this.categoryId;
    }

    public SearchImageByPicRequest setCrop(Boolean crop) {
        this.crop = crop;
        return this;
    }
    public Boolean getCrop() {
        return this.crop;
    }

    public SearchImageByPicRequest setDistinctProductId(Boolean distinctProductId) {
        this.distinctProductId = distinctProductId;
        return this;
    }
    public Boolean getDistinctProductId() {
        return this.distinctProductId;
    }

    public SearchImageByPicRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public SearchImageByPicRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public SearchImageByPicRequest setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getNum() {
        return this.num;
    }

    public SearchImageByPicRequest setPicContent(String picContent) {
        this.picContent = picContent;
        return this;
    }
    public String getPicContent() {
        return this.picContent;
    }

    public SearchImageByPicRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public SearchImageByPicRequest setScoreThreshold(String scoreThreshold) {
        this.scoreThreshold = scoreThreshold;
        return this;
    }
    public String getScoreThreshold() {
        return this.scoreThreshold;
    }

    public SearchImageByPicRequest setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

}
