// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeOrderResponseBody extends TeaModel {
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

    @NameInMap("InstanceIds")
    public DescribeOrderResponseBodyInstanceIds instanceIds;

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
     * <p>6EF60BEC-0242-43AF-BB20-270359FB54A7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SupplierCompanyName")
    public String supplierCompanyName;

    @NameInMap("SupplierTelephones")
    public DescribeOrderResponseBodySupplierTelephones supplierTelephones;

    /**
     * <strong>example:</strong>
     * <p>0.0</p>
     */
    @NameInMap("TotalPrice")
    public Float totalPrice;

    public static DescribeOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrderResponseBody self = new DescribeOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOrderResponseBody setAccountQuantity(Long accountQuantity) {
        this.accountQuantity = accountQuantity;
        return this;
    }
    public Long getAccountQuantity() {
        return this.accountQuantity;
    }

    public DescribeOrderResponseBody setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DescribeOrderResponseBody setComponents(java.util.Map<String, ?> components) {
        this.components = components;
        return this;
    }
    public java.util.Map<String, ?> getComponents() {
        return this.components;
    }

    public DescribeOrderResponseBody setCouponPrice(Float couponPrice) {
        this.couponPrice = couponPrice;
        return this;
    }
    public Float getCouponPrice() {
        return this.couponPrice;
    }

    public DescribeOrderResponseBody setCreatedOn(Long createdOn) {
        this.createdOn = createdOn;
        return this;
    }
    public Long getCreatedOn() {
        return this.createdOn;
    }

    public DescribeOrderResponseBody setInstanceIds(DescribeOrderResponseBodyInstanceIds instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public DescribeOrderResponseBodyInstanceIds getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeOrderResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public DescribeOrderResponseBody setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public DescribeOrderResponseBody setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public DescribeOrderResponseBody setOriginalPrice(Float originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }
    public Float getOriginalPrice() {
        return this.originalPrice;
    }

    public DescribeOrderResponseBody setPaidOn(Long paidOn) {
        this.paidOn = paidOn;
        return this;
    }
    public Long getPaidOn() {
        return this.paidOn;
    }

    public DescribeOrderResponseBody setPayStatus(String payStatus) {
        this.payStatus = payStatus;
        return this;
    }
    public String getPayStatus() {
        return this.payStatus;
    }

    public DescribeOrderResponseBody setPaymentPrice(Float paymentPrice) {
        this.paymentPrice = paymentPrice;
        return this;
    }
    public Float getPaymentPrice() {
        return this.paymentPrice;
    }

    public DescribeOrderResponseBody setPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }
    public String getPeriodType() {
        return this.periodType;
    }

    public DescribeOrderResponseBody setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeOrderResponseBody setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public DescribeOrderResponseBody setProductSkuCode(String productSkuCode) {
        this.productSkuCode = productSkuCode;
        return this;
    }
    public String getProductSkuCode() {
        return this.productSkuCode;
    }

    public DescribeOrderResponseBody setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

    public DescribeOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOrderResponseBody setSupplierCompanyName(String supplierCompanyName) {
        this.supplierCompanyName = supplierCompanyName;
        return this;
    }
    public String getSupplierCompanyName() {
        return this.supplierCompanyName;
    }

    public DescribeOrderResponseBody setSupplierTelephones(DescribeOrderResponseBodySupplierTelephones supplierTelephones) {
        this.supplierTelephones = supplierTelephones;
        return this;
    }
    public DescribeOrderResponseBodySupplierTelephones getSupplierTelephones() {
        return this.supplierTelephones;
    }

    public DescribeOrderResponseBody setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }
    public Float getTotalPrice() {
        return this.totalPrice;
    }

    public static class DescribeOrderResponseBodyInstanceIds extends TeaModel {
        @NameInMap("InstanceId")
        public java.util.List<String> instanceId;

        public static DescribeOrderResponseBodyInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeOrderResponseBodyInstanceIds self = new DescribeOrderResponseBodyInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeOrderResponseBodyInstanceIds setInstanceId(java.util.List<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public java.util.List<String> getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeOrderResponseBodySupplierTelephones extends TeaModel {
        @NameInMap("Telephone")
        public java.util.List<String> telephone;

        public static DescribeOrderResponseBodySupplierTelephones build(java.util.Map<String, ?> map) throws Exception {
            DescribeOrderResponseBodySupplierTelephones self = new DescribeOrderResponseBodySupplierTelephones();
            return TeaModel.build(map, self);
        }

        public DescribeOrderResponseBodySupplierTelephones setTelephone(java.util.List<String> telephone) {
            this.telephone = telephone;
            return this;
        }
        public java.util.List<String> getTelephone() {
            return this.telephone;
        }

    }

}
