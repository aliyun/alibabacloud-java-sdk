// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210501.models;

import com.aliyun.tea.*;

public class SearchByPicRequest extends TeaModel {
    @NameInMap("CategoryId")
    public Integer categoryId;

    @NameInMap("Crop")
    public Boolean crop;

    @NameInMap("Fields")
    public String fields;

    @NameInMap("Num")
    public Integer num;

    @NameInMap("PicContent")
    public String picContent;

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

    public static SearchByPicRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchByPicRequest self = new SearchByPicRequest();
        return TeaModel.build(map, self);
    }

    public SearchByPicRequest setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Integer getCategoryId() {
        return this.categoryId;
    }

    public SearchByPicRequest setCrop(Boolean crop) {
        this.crop = crop;
        return this;
    }
    public Boolean getCrop() {
        return this.crop;
    }

    public SearchByPicRequest setFields(String fields) {
        this.fields = fields;
        return this;
    }
    public String getFields() {
        return this.fields;
    }

    public SearchByPicRequest setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getNum() {
        return this.num;
    }

    public SearchByPicRequest setPicContent(String picContent) {
        this.picContent = picContent;
        return this;
    }
    public String getPicContent() {
        return this.picContent;
    }

    public SearchByPicRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public SearchByPicRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public SearchByPicRequest setRelationId(Long relationId) {
        this.relationId = relationId;
        return this;
    }
    public Long getRelationId() {
        return this.relationId;
    }

    public SearchByPicRequest setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

    public SearchByPicRequest setUserType(Long userType) {
        this.userType = userType;
        return this;
    }
    public Long getUserType() {
        return this.userType;
    }

}
