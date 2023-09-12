// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class SkuSaleInfo extends TeaModel {
    @NameInMap("canSell")
    public Boolean canSell;

    @NameInMap("divisionCode")
    public String divisionCode;

    @NameInMap("fuzzyQuantity")
    public String fuzzyQuantity;

    @NameInMap("markPrice")
    public Long markPrice;

    @NameInMap("price")
    public Long price;

    @NameInMap("productId")
    public String productId;

    @NameInMap("quantity")
    public Long quantity;

    @NameInMap("shopId")
    public String shopId;

    @NameInMap("skuId")
    public String skuId;

    @NameInMap("skuStatus")
    public String skuStatus;

    @NameInMap("title")
    public String title;

    public static SkuSaleInfo build(java.util.Map<String, ?> map) throws Exception {
        SkuSaleInfo self = new SkuSaleInfo();
        return TeaModel.build(map, self);
    }

    public SkuSaleInfo setCanSell(Boolean canSell) {
        this.canSell = canSell;
        return this;
    }
    public Boolean getCanSell() {
        return this.canSell;
    }

    public SkuSaleInfo setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
        return this;
    }
    public String getDivisionCode() {
        return this.divisionCode;
    }

    public SkuSaleInfo setFuzzyQuantity(String fuzzyQuantity) {
        this.fuzzyQuantity = fuzzyQuantity;
        return this;
    }
    public String getFuzzyQuantity() {
        return this.fuzzyQuantity;
    }

    public SkuSaleInfo setMarkPrice(Long markPrice) {
        this.markPrice = markPrice;
        return this;
    }
    public Long getMarkPrice() {
        return this.markPrice;
    }

    public SkuSaleInfo setPrice(Long price) {
        this.price = price;
        return this;
    }
    public Long getPrice() {
        return this.price;
    }

    public SkuSaleInfo setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public SkuSaleInfo setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }
    public Long getQuantity() {
        return this.quantity;
    }

    public SkuSaleInfo setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public SkuSaleInfo setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

    public SkuSaleInfo setSkuStatus(String skuStatus) {
        this.skuStatus = skuStatus;
        return this;
    }
    public String getSkuStatus() {
        return this.skuStatus;
    }

    public SkuSaleInfo setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
