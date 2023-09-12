// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class OrderProductResult extends TeaModel {
    @NameInMap("canSell")
    public Boolean canSell;

    @NameInMap("features")
    public java.util.Map<String, ?> features;

    @NameInMap("message")
    public String message;

    @NameInMap("price")
    public Long price;

    @NameInMap("productId")
    public String productId;

    @NameInMap("productPicUrl")
    public String productPicUrl;

    @NameInMap("productTitle")
    public String productTitle;

    @NameInMap("quantity")
    public Integer quantity;

    @NameInMap("shopId")
    public String shopId;

    @NameInMap("skuId")
    public String skuId;

    @NameInMap("skuTitle")
    public String skuTitle;

    public static OrderProductResult build(java.util.Map<String, ?> map) throws Exception {
        OrderProductResult self = new OrderProductResult();
        return TeaModel.build(map, self);
    }

    public OrderProductResult setCanSell(Boolean canSell) {
        this.canSell = canSell;
        return this;
    }
    public Boolean getCanSell() {
        return this.canSell;
    }

    public OrderProductResult setFeatures(java.util.Map<String, ?> features) {
        this.features = features;
        return this;
    }
    public java.util.Map<String, ?> getFeatures() {
        return this.features;
    }

    public OrderProductResult setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OrderProductResult setPrice(Long price) {
        this.price = price;
        return this;
    }
    public Long getPrice() {
        return this.price;
    }

    public OrderProductResult setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public OrderProductResult setProductPicUrl(String productPicUrl) {
        this.productPicUrl = productPicUrl;
        return this;
    }
    public String getProductPicUrl() {
        return this.productPicUrl;
    }

    public OrderProductResult setProductTitle(String productTitle) {
        this.productTitle = productTitle;
        return this;
    }
    public String getProductTitle() {
        return this.productTitle;
    }

    public OrderProductResult setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

    public OrderProductResult setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public OrderProductResult setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

    public OrderProductResult setSkuTitle(String skuTitle) {
        this.skuTitle = skuTitle;
        return this;
    }
    public String getSkuTitle() {
        return this.skuTitle;
    }

}
