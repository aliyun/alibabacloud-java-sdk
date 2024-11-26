// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeOrderForIsvResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AccountQuantity")
    public Long accountQuantity;

    /**
     * <strong>example:</strong>
     * <p>190311111111****</p>
     */
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("Components")
    public java.util.Map<String, ?> components;

    /**
     * <strong>example:</strong>
     * <p>0.0</p>
     */
    @NameInMap("CouponPrice")
    public Float couponPrice;

    /**
     * <strong>example:</strong>
     * <p>1531191564000</p>
     */
    @NameInMap("CreatedOn")
    public Long createdOn;

    /**
     * <p>List</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <strong>example:</strong>
     * <p>202211111111111</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("OrderStatus")
    public String orderStatus;

    /**
     * <strong>example:</strong>
     * <p>NEW</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <strong>example:</strong>
     * <p>10.0</p>
     */
    @NameInMap("OriginalPrice")
    public Float originalPrice;

    /**
     * <strong>example:</strong>
     * <p>1531191675000</p>
     */
    @NameInMap("PaidOn")
    public Long paidOn;

    /**
     * <strong>example:</strong>
     * <p>PAID</p>
     */
    @NameInMap("PayStatus")
    public String payStatus;

    /**
     * <strong>example:</strong>
     * <p>0.0</p>
     */
    @NameInMap("PaymentPrice")
    public Float paymentPrice;

    /**
     * <strong>example:</strong>
     * <p>MONTH</p>
     */
    @NameInMap("PeriodType")
    public String periodType;

    /**
     * <strong>example:</strong>
     * <p>cmgj02****</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ProductName")
    public String productName;

    /**
     * <strong>example:</strong>
     * <p>cmgj02****-prepay</p>
     */
    @NameInMap("ProductSkuCode")
    public String productSkuCode;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Quantity")
    public Integer quantity;

    /**
     * <strong>example:</strong>
     * <p>6EF60BEC-<strong><strong>-</strong></strong>-****-270359FB54A7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0.0</p>
     */
    @NameInMap("TotalPrice")
    public Float totalPrice;

    public static DescribeOrderForIsvResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrderForIsvResponseBody self = new DescribeOrderForIsvResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOrderForIsvResponseBody setAccountQuantity(Long accountQuantity) {
        this.accountQuantity = accountQuantity;
        return this;
    }
    public Long getAccountQuantity() {
        return this.accountQuantity;
    }

    public DescribeOrderForIsvResponseBody setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DescribeOrderForIsvResponseBody setComponents(java.util.Map<String, ?> components) {
        this.components = components;
        return this;
    }
    public java.util.Map<String, ?> getComponents() {
        return this.components;
    }

    public DescribeOrderForIsvResponseBody setCouponPrice(Float couponPrice) {
        this.couponPrice = couponPrice;
        return this;
    }
    public Float getCouponPrice() {
        return this.couponPrice;
    }

    public DescribeOrderForIsvResponseBody setCreatedOn(Long createdOn) {
        this.createdOn = createdOn;
        return this;
    }
    public Long getCreatedOn() {
        return this.createdOn;
    }

    public DescribeOrderForIsvResponseBody setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeOrderForIsvResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public DescribeOrderForIsvResponseBody setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public DescribeOrderForIsvResponseBody setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public DescribeOrderForIsvResponseBody setOriginalPrice(Float originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }
    public Float getOriginalPrice() {
        return this.originalPrice;
    }

    public DescribeOrderForIsvResponseBody setPaidOn(Long paidOn) {
        this.paidOn = paidOn;
        return this;
    }
    public Long getPaidOn() {
        return this.paidOn;
    }

    public DescribeOrderForIsvResponseBody setPayStatus(String payStatus) {
        this.payStatus = payStatus;
        return this;
    }
    public String getPayStatus() {
        return this.payStatus;
    }

    public DescribeOrderForIsvResponseBody setPaymentPrice(Float paymentPrice) {
        this.paymentPrice = paymentPrice;
        return this;
    }
    public Float getPaymentPrice() {
        return this.paymentPrice;
    }

    public DescribeOrderForIsvResponseBody setPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }
    public String getPeriodType() {
        return this.periodType;
    }

    public DescribeOrderForIsvResponseBody setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeOrderForIsvResponseBody setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public DescribeOrderForIsvResponseBody setProductSkuCode(String productSkuCode) {
        this.productSkuCode = productSkuCode;
        return this;
    }
    public String getProductSkuCode() {
        return this.productSkuCode;
    }

    public DescribeOrderForIsvResponseBody setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

    public DescribeOrderForIsvResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOrderForIsvResponseBody setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }
    public Float getTotalPrice() {
        return this.totalPrice;
    }

}
