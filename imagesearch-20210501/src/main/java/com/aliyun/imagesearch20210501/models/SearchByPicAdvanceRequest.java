// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210501.models;

import com.aliyun.tea.*;

public class SearchByPicAdvanceRequest extends TeaModel {
    @NameInMap("PicContentObject")
    @Validation(required = true)
    public java.io.InputStream picContentObject;

    @NameInMap("CategoryId")
    public Integer categoryId;

    @NameInMap("Crop")
    public Boolean crop;

    @NameInMap("Fields")
    public String fields;

    @NameInMap("Num")
    public Integer num;

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

    public static SearchByPicAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchByPicAdvanceRequest self = new SearchByPicAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SearchByPicAdvanceRequest setPicContentObject(java.io.InputStream picContentObject) {
        this.picContentObject = picContentObject;
        return this;
    }
    public java.io.InputStream getPicContentObject() {
        return this.picContentObject;
    }

    public SearchByPicAdvanceRequest setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Integer getCategoryId() {
        return this.categoryId;
    }

    public SearchByPicAdvanceRequest setCrop(Boolean crop) {
        this.crop = crop;
        return this;
    }
    public Boolean getCrop() {
        return this.crop;
    }

    public SearchByPicAdvanceRequest setFields(String fields) {
        this.fields = fields;
        return this;
    }
    public String getFields() {
        return this.fields;
    }

    public SearchByPicAdvanceRequest setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getNum() {
        return this.num;
    }

    public SearchByPicAdvanceRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public SearchByPicAdvanceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public SearchByPicAdvanceRequest setRelationId(Long relationId) {
        this.relationId = relationId;
        return this;
    }
    public Long getRelationId() {
        return this.relationId;
    }

    public SearchByPicAdvanceRequest setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

    public SearchByPicAdvanceRequest setUserType(Long userType) {
        this.userType = userType;
        return this;
    }
    public Long getUserType() {
        return this.userType;
    }

}
