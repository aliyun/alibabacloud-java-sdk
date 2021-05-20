// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class SearchImageByNameRequest extends TeaModel {
    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("ProductId")
    public String productId;

    @NameInMap("PicName")
    public String picName;

    @NameInMap("CategoryId")
    public Integer categoryId;

    @NameInMap("Num")
    public Integer num;

    @NameInMap("Start")
    public Integer start;

    @NameInMap("Filter")
    public String filter;

    public static SearchImageByNameRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchImageByNameRequest self = new SearchImageByNameRequest();
        return TeaModel.build(map, self);
    }

    public SearchImageByNameRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public SearchImageByNameRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public SearchImageByNameRequest setPicName(String picName) {
        this.picName = picName;
        return this;
    }
    public String getPicName() {
        return this.picName;
    }

    public SearchImageByNameRequest setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Integer getCategoryId() {
        return this.categoryId;
    }

    public SearchImageByNameRequest setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getNum() {
        return this.num;
    }

    public SearchImageByNameRequest setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

    public SearchImageByNameRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

}
