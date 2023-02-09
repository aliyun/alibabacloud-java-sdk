// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101.models;

import com.aliyun.tea.*;

public class SearchImageByPicRequest extends TeaModel {
    @NameInMap("Box")
    public Box box;

    @NameInMap("DetectLimit")
    public Integer detectLimit;

    @NameInMap("Filter")
    public String filter;

    @NameInMap("Num")
    public Integer num;

    @NameInMap("PicContent")
    public String picContent;

    @NameInMap("PicUrl")
    public String picUrl;

    @NameInMap("Start")
    public Integer start;

    @NameInMap("Text")
    public String text;

    public static SearchImageByPicRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchImageByPicRequest self = new SearchImageByPicRequest();
        return TeaModel.build(map, self);
    }

    public SearchImageByPicRequest setBox(Box box) {
        this.box = box;
        return this;
    }
    public Box getBox() {
        return this.box;
    }

    public SearchImageByPicRequest setDetectLimit(Integer detectLimit) {
        this.detectLimit = detectLimit;
        return this;
    }
    public Integer getDetectLimit() {
        return this.detectLimit;
    }

    public SearchImageByPicRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public SearchImageByPicRequest setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getNum() {
        return this.num;
    }

    public SearchImageByPicRequest setPicContent(String picContent) {
        this.picContent = picContent;
        return this;
    }
    public String getPicContent() {
        return this.picContent;
    }

    public SearchImageByPicRequest setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public String getPicUrl() {
        return this.picUrl;
    }

    public SearchImageByPicRequest setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

    public SearchImageByPicRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
