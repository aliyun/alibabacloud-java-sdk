// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class SearchImageByNameRequest extends TeaModel {
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

    @NameInMap("DistinctProductId")
    public Boolean distinctProductId;

    /**
     * <p>The filter conditions. int_attr supports the following operators: &gt;, &gt;=, &lt;, &lt;=, and =. str_attr supports the following operators: = and !=. You can set the logical operator between conditions to AND or OR.</p>
     * <p>Examples:</p>
     * <ul>
     * <li>int_attr&gt;=100</li>
     * <li>str_attr!=&quot;value1&quot;</li>
     * <li>int_attr=1000 AND str_attr=&quot;value1&quot;</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>int_attr&gt;=100</p>
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
     * <p>The name of the image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2092061_1.jpg</p>
     */
    @NameInMap("PicName")
    public String picName;

    /**
     * <p>The ID of the product.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2092061_1</p>
     */
    @NameInMap("ProductId")
    public String productId;

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

    public static SearchImageByNameRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchImageByNameRequest self = new SearchImageByNameRequest();
        return TeaModel.build(map, self);
    }

    public SearchImageByNameRequest setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Integer getCategoryId() {
        return this.categoryId;
    }

    public SearchImageByNameRequest setDistinctProductId(Boolean distinctProductId) {
        this.distinctProductId = distinctProductId;
        return this;
    }
    public Boolean getDistinctProductId() {
        return this.distinctProductId;
    }

    public SearchImageByNameRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public SearchImageByNameRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public SearchImageByNameRequest setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getNum() {
        return this.num;
    }

    public SearchImageByNameRequest setPicName(String picName) {
        this.picName = picName;
        return this;
    }
    public String getPicName() {
        return this.picName;
    }

    public SearchImageByNameRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public SearchImageByNameRequest setScoreThreshold(String scoreThreshold) {
        this.scoreThreshold = scoreThreshold;
        return this;
    }
    public String getScoreThreshold() {
        return this.scoreThreshold;
    }

    public SearchImageByNameRequest setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

}
