// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210501.models;

import com.aliyun.tea.*;

public class SearchByPicRequest extends TeaModel {
    @NameInMap("PicContent")
    public String picContent;

    @NameInMap("CategoryId")
    public Integer categoryId;

    @NameInMap("Crop")
    public Boolean crop;

    @NameInMap("Region")
    public String region;

    @NameInMap("Start")
    public Integer start;

    @NameInMap("Num")
    public Integer num;

    @NameInMap("Fields")
    public String fields;

    @NameInMap("RelationId")
    public Long relationId;

    @NameInMap("Pid")
    public String pid;

    public static SearchByPicRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchByPicRequest self = new SearchByPicRequest();
        return TeaModel.build(map, self);
    }

    public SearchByPicRequest setPicContent(String picContent) {
        this.picContent = picContent;
        return this;
    }
    public String getPicContent() {
        return this.picContent;
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

    public SearchByPicRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public SearchByPicRequest setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

    public SearchByPicRequest setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getNum() {
        return this.num;
    }

    public SearchByPicRequest setFields(String fields) {
        this.fields = fields;
        return this;
    }
    public String getFields() {
        return this.fields;
    }

    public SearchByPicRequest setRelationId(Long relationId) {
        this.relationId = relationId;
        return this;
    }
    public Long getRelationId() {
        return this.relationId;
    }

    public SearchByPicRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

}
