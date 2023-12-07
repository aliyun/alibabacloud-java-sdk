// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class SearchImageByNameRequest extends TeaModel {
    /**
     * <p>The category of the product. For more information, see [Category references](~~179184~~).</p>
     * <br>
     * <p>*   For product search: If a category is specified, the specified category prevails. If no category is specified, the system estimates and selects a category. The category selected by the system is included in the response.</p>
     * <p>*   For generic search: The parameter value is set to 88888888 regardless of whether a category is specified.</p>
     */
    @NameInMap("CategoryId")
    public Integer categoryId;

    /**
     * <p>The filter conditions. int_attr supports the following operators: >, >=, <, <=, and =. str_attr supports the following operators: = and !=. You can set the logical operator between conditions to AND or OR.</p>
     * <br>
     * <p>Examples:</p>
     * <br>
     * <p>*   int_attr>=100</p>
     * <p>*   str_attr!="value1"</p>
     * <p>*   int_attr=1000 AND str_attr="value1"</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The name of the Image Search instance. The name can be up to 20 characters in length.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The number of images to return on each page. Valid values: 1 to 100. Default value: 10.</p>
     */
    @NameInMap("Num")
    public Integer num;

    /**
     * <p>The name of the image.</p>
     */
    @NameInMap("PicName")
    public String picName;

    /**
     * <p>The ID of the product.</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <p>The number of the image to return. Valid values: 0 to 499. Default value: 0.</p>
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

    public SearchImageByNameRequest setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

}
