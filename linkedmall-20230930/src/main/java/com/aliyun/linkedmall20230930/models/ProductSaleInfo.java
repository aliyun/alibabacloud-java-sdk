// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ProductSaleInfo extends TeaModel {
    @NameInMap("canSell")
    public Boolean canSell;

    @NameInMap("divisionCode")
    public String divisionCode;

    @NameInMap("fuzzyQuantity")
    public String fuzzyQuantity;

    @NameInMap("lmItemId")
    public String lmItemId;

    @NameInMap("productId")
    public String productId;

    @NameInMap("productStatus")
    public String productStatus;

    @NameInMap("quantity")
    public Long quantity;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("shopId")
    public String shopId;

    @NameInMap("skus")
    public java.util.List<SkuSaleInfo> skus;

    @NameInMap("title")
    public String title;

    public static ProductSaleInfo build(java.util.Map<String, ?> map) throws Exception {
        ProductSaleInfo self = new ProductSaleInfo();
        return TeaModel.build(map, self);
    }

    public ProductSaleInfo setCanSell(Boolean canSell) {
        this.canSell = canSell;
        return this;
    }
    public Boolean getCanSell() {
        return this.canSell;
    }

    public ProductSaleInfo setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
        return this;
    }
    public String getDivisionCode() {
        return this.divisionCode;
    }

    public ProductSaleInfo setFuzzyQuantity(String fuzzyQuantity) {
        this.fuzzyQuantity = fuzzyQuantity;
        return this;
    }
    public String getFuzzyQuantity() {
        return this.fuzzyQuantity;
    }

    public ProductSaleInfo setLmItemId(String lmItemId) {
        this.lmItemId = lmItemId;
        return this;
    }
    public String getLmItemId() {
        return this.lmItemId;
    }

    public ProductSaleInfo setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public ProductSaleInfo setProductStatus(String productStatus) {
        this.productStatus = productStatus;
        return this;
    }
    public String getProductStatus() {
        return this.productStatus;
    }

    public ProductSaleInfo setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }
    public Long getQuantity() {
        return this.quantity;
    }

    public ProductSaleInfo setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ProductSaleInfo setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public ProductSaleInfo setSkus(java.util.List<SkuSaleInfo> skus) {
        this.skus = skus;
        return this;
    }
    public java.util.List<SkuSaleInfo> getSkus() {
        return this.skus;
    }

    public ProductSaleInfo setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
