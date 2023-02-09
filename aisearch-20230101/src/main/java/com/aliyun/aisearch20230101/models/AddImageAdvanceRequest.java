// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101.models;

import com.aliyun.tea.*;

public class AddImageAdvanceRequest extends TeaModel {
    @NameInMap("Boxes")
    public java.util.List<Box> boxes;

    @NameInMap("CustomContent")
    public String customContent;

    @NameInMap("DetectLimit")
    public Integer detectLimit;

    @NameInMap("IntAttr")
    public Integer intAttr;

    @NameInMap("PicContent")
    public java.io.InputStream picContentObject;

    @NameInMap("PicName")
    public String picName;

    @NameInMap("PicUrl")
    public String picUrl;

    @NameInMap("StrAttr")
    public String strAttr;

    public static AddImageAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddImageAdvanceRequest self = new AddImageAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public AddImageAdvanceRequest setBoxes(java.util.List<Box> boxes) {
        this.boxes = boxes;
        return this;
    }
    public java.util.List<Box> getBoxes() {
        return this.boxes;
    }

    public AddImageAdvanceRequest setCustomContent(String customContent) {
        this.customContent = customContent;
        return this;
    }
    public String getCustomContent() {
        return this.customContent;
    }

    public AddImageAdvanceRequest setDetectLimit(Integer detectLimit) {
        this.detectLimit = detectLimit;
        return this;
    }
    public Integer getDetectLimit() {
        return this.detectLimit;
    }

    public AddImageAdvanceRequest setIntAttr(Integer intAttr) {
        this.intAttr = intAttr;
        return this;
    }
    public Integer getIntAttr() {
        return this.intAttr;
    }

    public AddImageAdvanceRequest setPicContentObject(java.io.InputStream picContentObject) {
        this.picContentObject = picContentObject;
        return this;
    }
    public java.io.InputStream getPicContentObject() {
        return this.picContentObject;
    }

    public AddImageAdvanceRequest setPicName(String picName) {
        this.picName = picName;
        return this;
    }
    public String getPicName() {
        return this.picName;
    }

    public AddImageAdvanceRequest setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public String getPicUrl() {
        return this.picUrl;
    }

    public AddImageAdvanceRequest setStrAttr(String strAttr) {
        this.strAttr = strAttr;
        return this;
    }
    public String getStrAttr() {
        return this.strAttr;
    }

}
