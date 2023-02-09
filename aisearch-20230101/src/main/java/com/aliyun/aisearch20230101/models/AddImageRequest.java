// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101.models;

import com.aliyun.tea.*;

public class AddImageRequest extends TeaModel {
    @NameInMap("Boxes")
    public java.util.List<Box> boxes;

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

    public static AddImageRequest build(java.util.Map<String, ?> map) throws Exception {
        AddImageRequest self = new AddImageRequest();
        return TeaModel.build(map, self);
    }

    public AddImageRequest setBoxes(java.util.List<Box> boxes) {
        this.boxes = boxes;
        return this;
    }
    public java.util.List<Box> getBoxes() {
        return this.boxes;
    }

    public AddImageRequest setCustomContent(String customContent) {
        this.customContent = customContent;
        return this;
    }
    public String getCustomContent() {
        return this.customContent;
    }

    public AddImageRequest setDetectLimit(Integer detectLimit) {
        this.detectLimit = detectLimit;
        return this;
    }
    public Integer getDetectLimit() {
        return this.detectLimit;
    }

    public AddImageRequest setIntAttr(Integer intAttr) {
        this.intAttr = intAttr;
        return this;
    }
    public Integer getIntAttr() {
        return this.intAttr;
    }

    public AddImageRequest setPicContent(String picContent) {
        this.picContent = picContent;
        return this;
    }
    public String getPicContent() {
        return this.picContent;
    }

    public AddImageRequest setPicName(String picName) {
        this.picName = picName;
        return this;
    }
    public String getPicName() {
        return this.picName;
    }

    public AddImageRequest setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public String getPicUrl() {
        return this.picUrl;
    }

    public AddImageRequest setStrAttr(String strAttr) {
        this.strAttr = strAttr;
        return this;
    }
    public String getStrAttr() {
        return this.strAttr;
    }

}
