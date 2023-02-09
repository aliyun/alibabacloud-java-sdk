// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101.models;

import com.aliyun.tea.*;

public class SearchImageByPicAdvanceRequest extends TeaModel {
    @NameInMap("Box")
    public Box box;

    @NameInMap("DetectLimit")
    public Integer detectLimit;

    @NameInMap("Filter")
    public String filter;

    @NameInMap("Num")
    public Integer num;

    @NameInMap("PicContent")
    public java.io.InputStream picContentObject;

    @NameInMap("PicUrl")
    public String picUrl;

    @NameInMap("Start")
    public Integer start;

    @NameInMap("Text")
    public String text;

    public static SearchImageByPicAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchImageByPicAdvanceRequest self = new SearchImageByPicAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SearchImageByPicAdvanceRequest setBox(Box box) {
        this.box = box;
        return this;
    }
    public Box getBox() {
        return this.box;
    }

    public SearchImageByPicAdvanceRequest setDetectLimit(Integer detectLimit) {
        this.detectLimit = detectLimit;
        return this;
    }
    public Integer getDetectLimit() {
        return this.detectLimit;
    }

    public SearchImageByPicAdvanceRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
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

    public SearchImageByPicAdvanceRequest setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public String getPicUrl() {
        return this.picUrl;
    }

    public SearchImageByPicAdvanceRequest setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

    public SearchImageByPicAdvanceRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
