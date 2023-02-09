// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101.models;

import com.aliyun.tea.*;

public class AddImageShrinkRequest extends TeaModel {
    @NameInMap("Boxes")
    public String boxesShrink;

    @NameInMap("CustomContent")
    public String customContent;

    @NameInMap("DetectLimit")
    public Integer detectLimit;

    @NameInMap("IntAttr")
    public Integer intAttr;

    @NameInMap("PicContent")
    public String picContent;

    @NameInMap("PicName")
    public String picName;

    @NameInMap("PicUrl")
    public String picUrl;

    @NameInMap("StrAttr")
    public String strAttr;

    public static AddImageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddImageShrinkRequest self = new AddImageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddImageShrinkRequest setBoxesShrink(String boxesShrink) {
        this.boxesShrink = boxesShrink;
        return this;
    }
    public String getBoxesShrink() {
        return this.boxesShrink;
    }

    public AddImageShrinkRequest setCustomContent(String customContent) {
        this.customContent = customContent;
        return this;
    }
    public String getCustomContent() {
        return this.customContent;
    }

    public AddImageShrinkRequest setDetectLimit(Integer detectLimit) {
        this.detectLimit = detectLimit;
        return this;
    }
    public Integer getDetectLimit() {
        return this.detectLimit;
    }

    public AddImageShrinkRequest setIntAttr(Integer intAttr) {
        this.intAttr = intAttr;
        return this;
    }
    public Integer getIntAttr() {
        return this.intAttr;
    }

    public AddImageShrinkRequest setPicContent(String picContent) {
        this.picContent = picContent;
        return this;
    }
    public String getPicContent() {
        return this.picContent;
    }

    public AddImageShrinkRequest setPicName(String picName) {
        this.picName = picName;
        return this;
    }
    public String getPicName() {
        return this.picName;
    }

    public AddImageShrinkRequest setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public String getPicUrl() {
        return this.picUrl;
    }

    public AddImageShrinkRequest setStrAttr(String strAttr) {
        this.strAttr = strAttr;
        return this;
    }
    public String getStrAttr() {
        return this.strAttr;
    }

}
