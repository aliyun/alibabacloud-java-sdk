// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20200212.models;

import com.aliyun.tea.*;

public class SearchImageByPicRequest extends TeaModel {
    @NameInMap("CategoryId")
    public Integer categoryId;

    @NameInMap("InstanceName")
    @Validation(required = true)
    public String instanceName;

    @NameInMap("PicContent")
    @Validation(required = true)
    public String picContent;

    @NameInMap("Crop")
    public Boolean crop;

    @NameInMap("Region")
    public String region;

    @NameInMap("Num")
    public Integer num;

    @NameInMap("Start")
    public Integer start;

    @NameInMap("Filter")
    public String filter;

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

    public SearchImageByPicRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public SearchImageByPicRequest setPicContent(String picContent) {
        this.picContent = picContent;
        return this;
    }
    public String getPicContent() {
        return this.picContent;
    }

    public SearchImageByPicRequest setCrop(Boolean crop) {
        this.crop = crop;
        return this;
    }
    public Boolean getCrop() {
        return this.crop;
    }

    public SearchImageByPicRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public SearchImageByPicRequest setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getNum() {
        return this.num;
    }

    public SearchImageByPicRequest setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

    public SearchImageByPicRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

}
