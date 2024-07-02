// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class OrderLineResult extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("logisticsStatus")
    public String logisticsStatus;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("number")
    public String number;

    /**
     * <strong>example:</strong>
     * <p>6692****5457</p>
     */
    @NameInMap("orderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>6692****5458</p>
     */
    @NameInMap("orderLineId")
    public String orderLineId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("orderLineStatus")
    public String orderLineStatus;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("payFee")
    public Long payFee;

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
    @NameInMap("productPic")
    public String productPic;

    /**
     * <strong>example:</strong>
     * <p>儿童学习桌</p>
     */
    @NameInMap("productTitle")
    public String productTitle;

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

    public OrderLineResult setPayFee(Long payFee) {
        this.payFee = payFee;
        return this;
    }
    public Long getPayFee() {
        return this.payFee;
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
