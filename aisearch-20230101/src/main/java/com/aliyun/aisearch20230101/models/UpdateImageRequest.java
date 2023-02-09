// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101.models;

import com.aliyun.tea.*;

public class UpdateImageRequest extends TeaModel {
    @NameInMap("CustomContent")
    public String customContent;

    @NameInMap("IntAttr")
    public Integer intAttr;

    @NameInMap("PicName")
    public String picName;

    @NameInMap("StrAttr")
    public String strAttr;

    public static UpdateImageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageRequest self = new UpdateImageRequest();
        return TeaModel.build(map, self);
    }

    public UpdateImageRequest setCustomContent(String customContent) {
        this.customContent = customContent;
        return this;
    }
    public String getCustomContent() {
        return this.customContent;
    }

    public UpdateImageRequest setIntAttr(Integer intAttr) {
        this.intAttr = intAttr;
        return this;
    }
    public Integer getIntAttr() {
        return this.intAttr;
    }

    public UpdateImageRequest setPicName(String picName) {
        this.picName = picName;
        return this;
    }
    public String getPicName() {
        return this.picName;
    }

    public UpdateImageRequest setStrAttr(String strAttr) {
        this.strAttr = strAttr;
        return this;
    }
    public String getStrAttr() {
        return this.strAttr;
    }

}
