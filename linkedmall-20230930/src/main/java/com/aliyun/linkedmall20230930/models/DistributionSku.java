// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class DistributionSku extends TeaModel {
    /**
     * <p>The alias.</p>
     * 
     * <strong>example:</strong>
     * <p>示例规格</p>
     */
    @NameInMap("aliasTitle")
    public String aliasTitle;

    /**
     * <p>The barcode.</p>
     * 
     * <strong>example:</strong>
     * <p>6901234567892</p>
     */
    @NameInMap("barCode")
    public String barCode;

    /**
     * <p>The maximum acceptable credit period.</p>
     */
    @NameInMap("creditPeriod")
    public Integer creditPeriod;

    /**
     * <p>The consignment supply price.</p>
     */
    @NameInMap("dxPrice")
    public Long dxPrice;

    /**
     * <p>Specifies whether credit periods are supported.</p>
     */
    @NameInMap("hasCredit")
    public Boolean hasCredit;

    /**
     * <p>Specifies whether invoicing is supported.</p>
     */
    @NameInMap("hasInvoice")
    public Boolean hasInvoice;

    /**
     * <p>The distribution supply price.</p>
     */
    @NameInMap("jxPrice")
    public Long jxPrice;

    /**
     * <p>The image.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/images/product.png">https://example.com/images/product.png</a></p>
     */
    @NameInMap("picUrl")
    public String picUrl;

    /**
     * <p>The inventory.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("quantity")
    public Integer quantity;

    /**
     * <p>sku id</p>
     * 
     * <strong>example:</strong>
     * <p>660460842235822082</p>
     */
    @NameInMap("skuId")
    public String skuId;

    /**
     * <p>The status.</p>
     */
    @NameInMap("skuStatus")
    public String skuStatus;

    /**
     * <p>The tax code.</p>
     */
    @NameInMap("taxCode")
    public String taxCode;

    /**
     * <p>The tax rate.</p>
     */
    @NameInMap("taxRate")
    public Integer taxRate;

    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>示例商品名称</p>
     */
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
