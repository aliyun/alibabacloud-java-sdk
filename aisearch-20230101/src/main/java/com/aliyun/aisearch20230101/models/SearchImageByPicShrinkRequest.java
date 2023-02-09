// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101.models;

import com.aliyun.tea.*;

public class SearchImageByPicShrinkRequest extends TeaModel {
    @NameInMap("Box")
    public String boxShrink;

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

    public static SearchImageByPicShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchImageByPicShrinkRequest self = new SearchImageByPicShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SearchImageByPicShrinkRequest setBoxShrink(String boxShrink) {
        this.boxShrink = boxShrink;
        return this;
    }
    public String getBoxShrink() {
        return this.boxShrink;
    }

    public SearchImageByPicShrinkRequest setDetectLimit(Integer detectLimit) {
        this.detectLimit = detectLimit;
        return this;
    }
    public Integer getDetectLimit() {
        return this.detectLimit;
    }

    public SearchImageByPicShrinkRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public SearchImageByPicShrinkRequest setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getNum() {
        return this.num;
    }

    public SearchImageByPicShrinkRequest setPicContent(String picContent) {
        this.picContent = picContent;
        return this;
    }
    public String getPicContent() {
        return this.picContent;
    }

    public SearchImageByPicShrinkRequest setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public String getPicUrl() {
        return this.picUrl;
    }

    public SearchImageByPicShrinkRequest setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

    public SearchImageByPicShrinkRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
