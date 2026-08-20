// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeOrderResponseBody extends TeaModel {
    /**
     * <p>The number of accounts.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AccountQuantity")
    public Long accountQuantity;

    /**
     * <p>The unique identifier of the Alibaba Cloud user (aliyunPK).</p>
     * 
     * <strong>example:</strong>
     * <p>190311111111****</p>
     */
    @NameInMap("AliUid")
    public Long aliUid;

    /**
     * <p>The order component information. The metric description for the parameters in the example is as follows:</p>
     * <ul>
     * <li>package_quantity: the number of usage times (a component specific to API products)</li>
     * <li>package_version: the version</li>
     * <li>ord_time: the duration</li>
     * <li>order_num: the quantity</li>
     * <li>code: the component code</li>
     * <li>globarKey: the component key</li>
     * <li>name: the component name</li>
     * <li>value: the component value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;package_quantity&quot;: { &quot;code&quot;: &quot;package_quantity&quot;, &quot;globarKey&quot;: &quot;cmapi014302_package_quantity_package_quantity_10000&quot;, &quot;name&quot;: &quot;10000次&quot;, &quot;value&quot;: &quot;10000&quot; }, &quot;package_version&quot;: { &quot;code&quot;: &quot;package_version&quot;, &quot;globarKey&quot;: &quot;cmapi014302_package_version_package_version_yuncode830200000&quot;, &quot;name&quot;: &quot;0元／10000次&quot;, &quot;value&quot;: &quot;yuncode830200000&quot; }, &quot;ord_time&quot;: { &quot;code&quot;: &quot;ord_time&quot;, &quot;globarKey&quot;: &quot;cmapi014302_ord_time_ord_time_6:Month&quot;, &quot;name&quot;: &quot;6个月&quot;, &quot;value&quot;: &quot;6:Month&quot; }, &quot;order_num&quot;: { &quot;code&quot;: &quot;order_num&quot;, &quot;globarKey&quot;: &quot;cmapi014302_order_num_order_num_1&quot;, &quot;name&quot;: &quot;1&quot;, &quot;value&quot;: &quot;1&quot; } }</p>
     */
    @NameInMap("Components")
    public java.util.Map<String, ?> components;

    /**
     * <p>The amount of vouchers used, in CNY.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0</p>
     */
    @NameInMap("CouponPrice")
    public Float couponPrice;

    /**
     * <p>The time when the order was placed.</p>
     * 
     * <strong>example:</strong>
     * <p>1531191564000</p>
     */
    @NameInMap("CreatedOn")
    public Long createdOn;

    @NameInMap("InstanceIds")
    public DescribeOrderResponseBodyInstanceIds instanceIds;

    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>202211111111111</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The order status. Valid values:</p>
     * <ul>
     * <li>NORMAL: Normal.</li>
     * <li>REFUND: Refunded.</li>
     * <li>DELETE: Voided.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("OrderStatus")
    public String orderStatus;

    /**
     * <p>The order type. Valid values:</p>
     * <ul>
     * <li>NEW: New purchase order.</li>
     * <li>RENEW: Renewal order.</li>
     * <li>TRIAL: Trial order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NEW</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The original price of the order, in CNY.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0</p>
     */
    @NameInMap("OriginalPrice")
    public Float originalPrice;

    /**
     * <p>The payment time.</p>
     * 
     * <strong>example:</strong>
     * <p>1531191675000</p>
     */
    @NameInMap("PaidOn")
    public Long paidOn;

    /**
     * <p>The payment status. Valid values:</p>
     * <ul>
     * <li>PAID: Paid.</li>
     * <li>UNPAID: Unpaid.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PAID</p>
     */
    @NameInMap("PayStatus")
    public String payStatus;

    /**
     * <p>The actual payment amount, in CNY.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0</p>
     */
    @NameInMap("PaymentPrice")
    public Float paymentPrice;

    /**
     * <p>The time unit for prepaid orders. Valid values:</p>
     * <ul>
     * <li>MONTH: one month</li>
     * <li>SEASON: one quarter</li>
     * <li>HALFYEAR: half a year</li>
     * <li>YEAR: one year</li>
     * <li>TWOYEARS: two years</li>
     * <li>ONCE: one-time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MONTH</p>
     */
    @NameInMap("PeriodType")
    public String periodType;

    /**
     * <p>The commodity code.</p>
     * 
     * <strong>example:</strong>
     * <p>cmgj02****</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The name of the subscribed product.</p>
     * 
     * <strong>example:</strong>
     * <p>saas服务产品</p>
     */
    @NameInMap("ProductName")
    public String productName;

    /**
     * <p>The specification code of the subscribed product.</p>
     * 
     * <strong>example:</strong>
     * <p>cmgj02****-prepay</p>
     */
    @NameInMap("ProductSkuCode")
    public String productSkuCode;

    /**
     * <p>The quantity of the subscribed product.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Quantity")
    public Integer quantity;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6EF60BEC-0242-43AF-BB20-270359FB54A7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The company name of the seller.</p>
     * 
     * <strong>example:</strong>
     * <p>**科技股份有限公司</p>
     */
    @NameInMap("SupplierCompanyName")
    public String supplierCompanyName;

    @NameInMap("SupplierTelephones")
    public DescribeOrderResponseBodySupplierTelephones supplierTelephones;

    /**
     * <p>The total payable amount of the order, in CNY.</p>
     * 
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
