// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class OrderLineResult extends TeaModel {
    @NameInMap("logisticsStatus")
    public String logisticsStatus;

    @NameInMap("number")
    public String number;

    @NameInMap("orderId")
    public String orderId;

    @NameInMap("orderLineId")
    public String orderLineId;

    @NameInMap("orderLineStatus")
    public String orderLineStatus;

    @NameInMap("productId")
    public String productId;

    @NameInMap("productPic")
    public String productPic;

    @NameInMap("productPrice")
    public java.util.List<ProductPrice> productPrice;

    @NameInMap("productTitle")
    public String productTitle;

    @NameInMap("skuId")
    public String skuId;

    @NameInMap("skuTitle")
    public String skuTitle;

    public static OrderLineResult build(java.util.Map<String, ?> map) throws Exception {
        OrderLineResult self = new OrderLineResult();
        return TeaModel.build(map, self);
    }

    public OrderLineResult setLogisticsStatus(String logisticsStatus) {
        this.logisticsStatus = logisticsStatus;
        return this;
    }
    public String getLogisticsStatus() {
        return this.logisticsStatus;
    }

    public OrderLineResult setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

    public OrderLineResult setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OrderLineResult setOrderLineId(String orderLineId) {
        this.orderLineId = orderLineId;
        return this;
    }
    public String getOrderLineId() {
        return this.orderLineId;
    }

    public OrderLineResult setOrderLineStatus(String orderLineStatus) {
        this.orderLineStatus = orderLineStatus;
        return this;
    }
    public String getOrderLineStatus() {
        return this.orderLineStatus;
    }

    public OrderLineResult setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public OrderLineResult setProductPic(String productPic) {
        this.productPic = productPic;
        return this;
    }
    public String getProductPic() {
        return this.productPic;
    }

    public OrderLineResult setProductPrice(java.util.List<ProductPrice> productPrice) {
        this.productPrice = productPrice;
        return this;
    }
    public java.util.List<ProductPrice> getProductPrice() {
        return this.productPrice;
    }

    public OrderLineResult setProductTitle(String productTitle) {
        this.productTitle = productTitle;
        return this;
    }
    public String getProductTitle() {
        return this.productTitle;
    }

    public OrderLineResult setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

    public OrderLineResult setSkuTitle(String skuTitle) {
        this.skuTitle = skuTitle;
        return this;
    }
    public String getSkuTitle() {
        return this.skuTitle;
    }

}
