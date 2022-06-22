// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class OpenAhasCommercialRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("BuyerId")
    public Long buyerId;

    @NameInMap("IsInternational")
    public Boolean isInternational;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("OpenType")
    public Integer openType;

    @NameInMap("Product")
    public String product;

    public static OpenAhasCommercialRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenAhasCommercialRequest self = new OpenAhasCommercialRequest();
        return TeaModel.build(map, self);
    }

    public OpenAhasCommercialRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public OpenAhasCommercialRequest setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public Long getBuyerId() {
        return this.buyerId;
    }

    public OpenAhasCommercialRequest setIsInternational(Boolean isInternational) {
        this.isInternational = isInternational;
        return this;
    }
    public Boolean getIsInternational() {
        return this.isInternational;
    }

    public OpenAhasCommercialRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public OpenAhasCommercialRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public OpenAhasCommercialRequest setOpenType(Integer openType) {
        this.openType = openType;
        return this;
    }
    public Integer getOpenType() {
        return this.openType;
    }

    public OpenAhasCommercialRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
