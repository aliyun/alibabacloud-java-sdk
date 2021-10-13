// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210501.models;

import com.aliyun.tea.*;

public class SearchByUrlRequest extends TeaModel {
    @NameInMap("CategoryId")
    public Integer categoryId;

    @NameInMap("Crop")
    public Boolean crop;

    @NameInMap("Fields")
    public String fields;

    @NameInMap("Num")
    public Integer num;

    @NameInMap("PicUrl")
    public String picUrl;

    @NameInMap("Pid")
    public String pid;

    @NameInMap("Region")
    public String region;

    @NameInMap("RelationId")
    public Long relationId;

    @NameInMap("Start")
    public Integer start;

    @NameInMap("UserType")
    public Long userType;

    public static SearchByUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchByUrlRequest self = new SearchByUrlRequest();
        return TeaModel.build(map, self);
    }

    public SearchByUrlRequest setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Integer getCategoryId() {
        return this.categoryId;
    }

    public SearchByUrlRequest setCrop(Boolean crop) {
        this.crop = crop;
        return this;
    }
    public Boolean getCrop() {
        return this.crop;
    }

    public SearchByUrlRequest setFields(String fields) {
        this.fields = fields;
        return this;
    }
    public String getFields() {
        return this.fields;
    }

    public SearchByUrlRequest setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getNum() {
        return this.num;
    }

    public SearchByUrlRequest setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public String getPicUrl() {
        return this.picUrl;
    }

    public SearchByUrlRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public SearchByUrlRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public SearchByUrlRequest setRelationId(Long relationId) {
        this.relationId = relationId;
        return this;
    }
    public Long getRelationId() {
        return this.relationId;
    }

    public SearchByUrlRequest setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

    public SearchByUrlRequest setUserType(Long userType) {
        this.userType = userType;
        return this;
    }
    public Long getUserType() {
        return this.userType;
    }

}
