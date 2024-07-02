// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class OrderProductResult extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("canSell")
    public Boolean canSell;

    @NameInMap("features")
    public java.util.Map<String, ?> features;

    /**
     * <strong>example:</strong>
     * <p>库存为0</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("price")
    public Long price;

    /**
     * <strong>example:</strong>
     * <p>6600****6736</p>
     */
    @NameInMap("productId")
    public String productId;

    /**
     * <strong>example:</strong>
     * <p>//img.alicdn.com/imgextra/i4/2216003305543/O1CN01bip3Un1qokG0</p>
     */
    @NameInMap("productPicUrl")
    public String productPicUrl;

    /**
     * <strong>example:</strong>
     * <p>儿童学习桌</p>
     */
    @NameInMap("productTitle")
    public String productTitle;

    /**
     * <strong>example:</strong>
     * <p>56****2304</p>
     */
    @NameInMap("purchaserId")
    public String purchaserId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("quantity")
    public Integer quantity;

    /**
     * <strong>example:</strong>
     * <p>6600****6737</p>
     */
    @NameInMap("skuId")
    public String skuId;

    /**
     * <strong>example:</strong>
     * <p>浅绿色</p>
     */
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

    public OrderProductResult setPurchaserId(String purchaserId) {
        this.purchaserId = purchaserId;
        return this;
    }
    public String getPurchaserId() {
        return this.purchaserId;
    }

    public OrderProductResult setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    public Integer getQuantity() {
        return this.quantity;
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
