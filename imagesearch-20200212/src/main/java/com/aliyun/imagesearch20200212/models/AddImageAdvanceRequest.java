// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20200212.models;

import com.aliyun.tea.*;

public class AddImageAdvanceRequest extends TeaModel {
    @NameInMap("PicContentObject")
    @Validation(required = true)
    public java.io.InputStream picContentObject;

    @NameInMap("InstanceName")
    @Validation(required = true)
    public String instanceName;

    @NameInMap("CategoryId")
    public Integer categoryId;

    @NameInMap("ProductId")
    @Validation(required = true)
    public String productId;

    @NameInMap("PicName")
    @Validation(required = true)
    public String picName;

    @NameInMap("Crop")
    public Boolean crop;

    @NameInMap("Region")
    public String region;

    @NameInMap("CustomContent")
    public String customContent;

    @NameInMap("IntAttr")
    public Integer intAttr;

    @NameInMap("StrAttr")
    public String strAttr;

    public static AddImageAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddImageAdvanceRequest self = new AddImageAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public AddImageAdvanceRequest setPicContentObject(java.io.InputStream picContentObject) {
        this.picContentObject = picContentObject;
        return this;
    }
    public java.io.InputStream getPicContentObject() {
        return this.picContentObject;
    }

    public AddImageAdvanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public AddImageAdvanceRequest setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Integer getCategoryId() {
        return this.categoryId;
    }

    public AddImageAdvanceRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public AddImageAdvanceRequest setPicName(String picName) {
        this.picName = picName;
        return this;
    }
    public String getPicName() {
        return this.picName;
    }

    public AddImageAdvanceRequest setCrop(Boolean crop) {
        this.crop = crop;
        return this;
    }
    public Boolean getCrop() {
        return this.crop;
    }

    public AddImageAdvanceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public AddImageAdvanceRequest setCustomContent(String customContent) {
        this.customContent = customContent;
        return this;
    }
    public String getCustomContent() {
        return this.customContent;
    }

    public AddImageAdvanceRequest setIntAttr(Integer intAttr) {
        this.intAttr = intAttr;
        return this;
    }
    public Integer getIntAttr() {
        return this.intAttr;
    }

    public AddImageAdvanceRequest setStrAttr(String strAttr) {
        this.strAttr = strAttr;
        return this;
    }
    public String getStrAttr() {
        return this.strAttr;
    }

}
