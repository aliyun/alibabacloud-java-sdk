// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class DistributionSku extends TeaModel {
    @NameInMap("aliasTitle")
    public String aliasTitle;

    @NameInMap("barCode")
    public String barCode;

    @NameInMap("creditPeriod")
    public Integer creditPeriod;

    @NameInMap("dxPrice")
    public Long dxPrice;

    @NameInMap("hasCredit")
    public Boolean hasCredit;

    @NameInMap("hasInvoice")
    public Boolean hasInvoice;

    @NameInMap("jxPrice")
    public Long jxPrice;

    @NameInMap("picUrl")
    public String picUrl;

    @NameInMap("quantity")
    public Integer quantity;

    @NameInMap("skuId")
    public String skuId;

    @NameInMap("skuStatus")
    public String skuStatus;

    @NameInMap("taxCode")
    public String taxCode;

    @NameInMap("taxRate")
    public Integer taxRate;

    @NameInMap("title")
    public String title;

    public static DistributionSku build(java.util.Map<String, ?> map) throws Exception {
        DistributionSku self = new DistributionSku();
        return TeaModel.build(map, self);
    }

    public DistributionSku setAliasTitle(String aliasTitle) {
        this.aliasTitle = aliasTitle;
        return this;
    }
    public String getAliasTitle() {
        return this.aliasTitle;
    }

    public DistributionSku setBarCode(String barCode) {
        this.barCode = barCode;
        return this;
    }
    public String getBarCode() {
        return this.barCode;
    }

    public DistributionSku setCreditPeriod(Integer creditPeriod) {
        this.creditPeriod = creditPeriod;
        return this;
    }
    public Integer getCreditPeriod() {
        return this.creditPeriod;
    }

    public DistributionSku setDxPrice(Long dxPrice) {
        this.dxPrice = dxPrice;
        return this;
    }
    public Long getDxPrice() {
        return this.dxPrice;
    }

    public DistributionSku setHasCredit(Boolean hasCredit) {
        this.hasCredit = hasCredit;
        return this;
    }
    public Boolean getHasCredit() {
        return this.hasCredit;
    }

    public DistributionSku setHasInvoice(Boolean hasInvoice) {
        this.hasInvoice = hasInvoice;
        return this;
    }
    public Boolean getHasInvoice() {
        return this.hasInvoice;
    }

    public DistributionSku setJxPrice(Long jxPrice) {
        this.jxPrice = jxPrice;
        return this;
    }
    public Long getJxPrice() {
        return this.jxPrice;
    }

    public DistributionSku setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public String getPicUrl() {
        return this.picUrl;
    }

    public DistributionSku setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

    public DistributionSku setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

    public DistributionSku setSkuStatus(String skuStatus) {
        this.skuStatus = skuStatus;
        return this;
    }
    public String getSkuStatus() {
        return this.skuStatus;
    }

    public DistributionSku setTaxCode(String taxCode) {
        this.taxCode = taxCode;
        return this;
    }
    public String getTaxCode() {
        return this.taxCode;
    }

    public DistributionSku setTaxRate(Integer taxRate) {
        this.taxRate = taxRate;
        return this;
    }
    public Integer getTaxRate() {
        return this.taxRate;
    }

    public DistributionSku setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
