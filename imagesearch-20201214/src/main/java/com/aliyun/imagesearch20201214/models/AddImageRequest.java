// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class AddImageRequest extends TeaModel {
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
    public String picContent;

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

    public static AddImageRequest build(java.util.Map<String, ?> map) throws Exception {
        AddImageRequest self = new AddImageRequest();
        return TeaModel.build(map, self);
    }

    public AddImageRequest setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Integer getCategoryId() {
        return this.categoryId;
    }

    public AddImageRequest setCrop(Boolean crop) {
        this.crop = crop;
        return this;
    }
    public Boolean getCrop() {
        return this.crop;
    }

    public AddImageRequest setCustomContent(String customContent) {
        this.customContent = customContent;
        return this;
    }
    public String getCustomContent() {
        return this.customContent;
    }

    public AddImageRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public AddImageRequest setIntAttr(Integer intAttr) {
        this.intAttr = intAttr;
        return this;
    }
    public Integer getIntAttr() {
        return this.intAttr;
    }

    public AddImageRequest setIntAttr2(Integer intAttr2) {
        this.intAttr2 = intAttr2;
        return this;
    }
    public Integer getIntAttr2() {
        return this.intAttr2;
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

    public AddImageRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public AddImageRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public AddImageRequest setStrAttr(String strAttr) {
        this.strAttr = strAttr;
        return this;
    }
    public String getStrAttr() {
        return this.strAttr;
    }

    public AddImageRequest setStrAttr2(String strAttr2) {
        this.strAttr2 = strAttr2;
        return this;
    }
    public String getStrAttr2() {
        return this.strAttr2;
    }

}
