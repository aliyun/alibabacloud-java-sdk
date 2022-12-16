// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class AddImageAdvanceRequest extends TeaModel {
    @NameInMap("CategoryId")
    public Integer categoryId;

    @NameInMap("Crop")
    public Boolean crop;

    @NameInMap("CustomContent")
    public String customContent;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("IntAttr")
    public Integer intAttr;

    @NameInMap("IntAttr2")
    public Integer intAttr2;

    @NameInMap("PicContent")
    public java.io.InputStream picContentObject;

    @NameInMap("PicName")
    public String picName;

    @NameInMap("ProductId")
    public String productId;

    @NameInMap("Region")
    public String region;

    @NameInMap("StrAttr")
    public String strAttr;

    @NameInMap("StrAttr2")
    public String strAttr2;

    public static AddImageAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddImageAdvanceRequest self = new AddImageAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public AddImageAdvanceRequest setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Integer getCategoryId() {
        return this.categoryId;
    }

    public AddImageAdvanceRequest setCrop(Boolean crop) {
        this.crop = crop;
        return this;
    }
    public Boolean getCrop() {
        return this.crop;
    }

    public AddImageAdvanceRequest setCustomContent(String customContent) {
        this.customContent = customContent;
        return this;
    }
    public String getCustomContent() {
        return this.customContent;
    }

    public AddImageAdvanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public AddImageAdvanceRequest setIntAttr(Integer intAttr) {
        this.intAttr = intAttr;
        return this;
    }
    public Integer getIntAttr() {
        return this.intAttr;
    }

    public AddImageAdvanceRequest setIntAttr2(Integer intAttr2) {
        this.intAttr2 = intAttr2;
        return this;
    }
    public Integer getIntAttr2() {
        return this.intAttr2;
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

    public AddImageAdvanceRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public AddImageAdvanceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public AddImageAdvanceRequest setStrAttr(String strAttr) {
        this.strAttr = strAttr;
        return this;
    }
    public String getStrAttr() {
        return this.strAttr;
    }

    public AddImageAdvanceRequest setStrAttr2(String strAttr2) {
        this.strAttr2 = strAttr2;
        return this;
    }
    public String getStrAttr2() {
        return this.strAttr2;
    }

}
