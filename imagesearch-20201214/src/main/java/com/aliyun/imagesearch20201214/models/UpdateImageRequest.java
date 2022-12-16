// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class UpdateImageRequest extends TeaModel {
    @NameInMap("CustomContent")
    public String customContent;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("IntAttr")
    public Integer intAttr;

    @NameInMap("IntAttr2")
    public Integer intAttr2;

    @NameInMap("PicName")
    public String picName;

    @NameInMap("ProductId")
    public String productId;

    @NameInMap("StrAttr")
    public String strAttr;

    @NameInMap("StrAttr2")
    public String strAttr2;

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

    public UpdateImageRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public UpdateImageRequest setIntAttr(Integer intAttr) {
        this.intAttr = intAttr;
        return this;
    }
    public Integer getIntAttr() {
        return this.intAttr;
    }

    public UpdateImageRequest setIntAttr2(Integer intAttr2) {
        this.intAttr2 = intAttr2;
        return this;
    }
    public Integer getIntAttr2() {
        return this.intAttr2;
    }

    public UpdateImageRequest setPicName(String picName) {
        this.picName = picName;
        return this;
    }
    public String getPicName() {
        return this.picName;
    }

    public UpdateImageRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public UpdateImageRequest setStrAttr(String strAttr) {
        this.strAttr = strAttr;
        return this;
    }
    public String getStrAttr() {
        return this.strAttr;
    }

    public UpdateImageRequest setStrAttr2(String strAttr2) {
        this.strAttr2 = strAttr2;
        return this;
    }
    public String getStrAttr2() {
        return this.strAttr2;
    }

}
