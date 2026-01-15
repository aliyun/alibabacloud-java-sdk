// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class SearchImageByPicAdvanceRequest extends TeaModel {
    /**
     * <p>The category of the product. For more information, see <a href="https://help.aliyun.com/document_detail/179184.html">Category references</a>.</p>
     * <ul>
     * <li>For product search: If a category is specified, the specified category prevails. If no category is specified, the system estimates and selects a category. The category selected by the system is included in the response.</li>
     * <li>For generic search: The parameter value is set to 88888888 regardless of whether a category is specified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>88888888</p>
     */
    @NameInMap("CategoryId")
    public Integer categoryId;

    /**
     * <p>Specifies whether to recognize the subject in the image and search for images based on the recognized subject. Valid values: true and false. Default value: true.</p>
     * <ul>
     * <li>true: The system recognizes the subject in the image, and searches for images based on the recognized subject. The recognition result is included in the response.</li>
     * <li>false: The system does not recognize the subject of the image, and searches for images based on the entire image.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Crop")
    public Boolean crop;

    @NameInMap("DistinctProductId")
    public Boolean distinctProductId;

    /**
     * <p>The filter conditions. int_attr supports the following operators: &gt;, &gt;=, &lt;, &lt;=, and =. str_attr supports the following operators: = and !=. You can set the logical operator between conditions to AND or OR.</p>
     * <p>Examples:</p>
     * <ul>
     * <li>int_attr&gt;=100</li>
     * <li>str_attr!=&quot;value1&quot;</li>
     * <li>Example: int_attr=1000 AND str_attr=&quot;value1&quot;</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>int_attr=1000 AND str_attr=&quot;value1&quot;</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The name of the Image Search instance. The name can be up to 20 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demoinstance1</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The number of images to return on each page. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Num")
    public Integer num;

    /**
     * <p>The image file. The image file is encoded in Base64.</p>
     * <ul>
     * <li>The file size of the image cannot exceed 4 MB.</li>
     * <li>The following image formats are supported: PNG, JPG, JPEG, BMP, GIF, WebP, TIFF, and PPM.</li>
     * <li>The transmission timeout period cannot exceed 5 seconds.</li>
     * <li>For brand image searches, the length and the width of the image must range from 200 pixels to 4,096 pixels.</li>
     * <li>For cloth image searches, the length and the width of the image must range from 448 pixels to 4,096 pixels.</li>
     * <li>For product and generic image searches, the length and the width of the image must range from 100 pixels to 4,096 pixels.</li>
     * <li>The image cannot contain rotation settings.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAANSUhEUgAAAPcAAAEVCAYAAAA8d3NuAAAAAXNSR0IArs......RK5CYII=</p>
     */
    @NameInMap("PicContent")
    public java.io.InputStream picContentObject;

    /**
     * <p>The subject area of the image. Specify the subject area in the following format: <code>x1,x2,y1,y2</code>. <code>x1 and y1</code> represent the upper-left corner pixel. <code>x2 and y2</code> represent the lower-right corner pixel.</p>
     * <blockquote>
     * <ul>
     * <li>If you set the Region parameter, the system searches for images based on the value of Region regardless of the value of the Crop parameter.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>280,486,232,351</p>
     */
    @NameInMap("Region")
    public String region;

    @NameInMap("ScoreThreshold")
    public String scoreThreshold;

    /**
     * <p>The number of the image to return. Valid values: 0 to 499. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Start")
    public Integer start;

    public static SearchImageByPicAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchImageByPicAdvanceRequest self = new SearchImageByPicAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SearchImageByPicAdvanceRequest setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Integer getCategoryId() {
        return this.categoryId;
    }

    public SearchImageByPicAdvanceRequest setCrop(Boolean crop) {
        this.crop = crop;
        return this;
    }
    public Boolean getCrop() {
        return this.crop;
    }

    public SearchImageByPicAdvanceRequest setDistinctProductId(Boolean distinctProductId) {
        this.distinctProductId = distinctProductId;
        return this;
    }
    public Boolean getDistinctProductId() {
        return this.distinctProductId;
    }

    public SearchImageByPicAdvanceRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public SearchImageByPicAdvanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public SearchImageByPicAdvanceRequest setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getNum() {
        return this.num;
    }

    public SearchImageByPicAdvanceRequest setPicContentObject(java.io.InputStream picContentObject) {
        this.picContentObject = picContentObject;
        return this;
    }
    public java.io.InputStream getPicContentObject() {
        return this.picContentObject;
    }

    public SearchImageByPicAdvanceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public SearchImageByPicAdvanceRequest setScoreThreshold(String scoreThreshold) {
        this.scoreThreshold = scoreThreshold;
        return this;
    }
    public String getScoreThreshold() {
        return this.scoreThreshold;
    }

    public SearchImageByPicAdvanceRequest setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

}
