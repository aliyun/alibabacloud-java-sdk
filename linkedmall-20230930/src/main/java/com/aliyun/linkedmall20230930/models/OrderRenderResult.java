// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class OrderRenderResult extends TeaModel {
    /**
     * <p>Indicates whether the item can be sold.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("canSell")
    public Boolean canSell;

    /**
     * <p>The fulfillment information.</p>
     */
    @NameInMap("deliveryInfoList")
    public java.util.List<DeliveryInfo> deliveryInfoList;

    /**
     * <p>The extension information.</p>
     */
    @NameInMap("extInfo")
    public java.util.Map<String, ?> extInfo;

    /**
     * <p>The reason why the item is unavailable.</p>
     * 
     * <strong>example:</strong>
     * <p>库存为0</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The list of products.</p>
     */
    @NameInMap("productList")
    public java.util.List<OrderProductResult> productList;

    public static OrderRenderResult build(java.util.Map<String, ?> map) throws Exception {
        OrderRenderResult self = new OrderRenderResult();
        return TeaModel.build(map, self);
    }

    public OrderRenderResult setCanSell(Boolean canSell) {
        this.canSell = canSell;
        return this;
    }
    public Boolean getCanSell() {
        return this.canSell;
    }

    public OrderRenderResult setDeliveryInfoList(java.util.List<DeliveryInfo> deliveryInfoList) {
        this.deliveryInfoList = deliveryInfoList;
        return this;
    }
    public java.util.List<DeliveryInfo> getDeliveryInfoList() {
        return this.deliveryInfoList;
    }

    public OrderRenderResult setExtInfo(java.util.Map<String, ?> extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public java.util.Map<String, ?> getExtInfo() {
        return this.extInfo;
    }

    public OrderRenderResult setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OrderRenderResult setProductList(java.util.List<OrderProductResult> productList) {
        this.productList = productList;
        return this;
    }
    public java.util.List<OrderProductResult> getProductList() {
        return this.productList;
    }

}
