// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeOrderForIsvResponseBody extends TeaModel {
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
     * <p>The order module information. The metric description for the parameters in the example is as follows:</p>
     * <ul>
     * <li>package_quantity: the number of usage times (a module specific to API products)</li>
     * <li>package_version: the version</li>
     * <li>ord_time: the duration</li>
     * <li>order_num: the quantity</li>
     * <li>code: the module code</li>
     * <li>globarKey: the module key</li>
     * <li>name: the module name</li>
     * <li>value: the module value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;package_version&quot;:{&quot;code&quot;:&quot;package_version&quot;,&quot;globarKey&quot;:&quot;cmgj0<em><em><strong><strong>8_package_version_package_version_yuncode4176</strong></strong></em>1&quot;,&quot;name&quot;:&quot;0.01&quot;,&quot;value&quot;:&quot;yuncode4176</em><strong><strong>1&quot;},&quot;ord_time&quot;:{&quot;code&quot;:&quot;ord_time&quot;,&quot;globarKey&quot;:&quot;cmgj0</strong></strong><strong>8_ord_time_ord_time_1:Month&quot;,&quot;name&quot;:&quot;1个月&quot;,&quot;value&quot;:&quot;1:Month&quot;},&quot;order_num&quot;:{&quot;code&quot;:&quot;order_num&quot;,&quot;globarKey&quot;:&quot;cmgj0</strong>****8_order_num_order_num_1&quot;,&quot;name&quot;:&quot;1&quot;,&quot;value&quot;:&quot;1&quot;}}</p>
     */
    @NameInMap("Components")
    public Object components;

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

    /**
     * <p>List</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

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
     * <li>UPGRADE: Upgrade order.</li>
     * <li>DOWNGRADE: Downgrade order.</li>
     * <li>PURCHASE: Conversion order.</li>
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
     * <p>The SKU code of the subscribed product.</p>
     * 
     * <strong>example:</strong>
     * <p>cmgj02****-prepay</p>
     */
    @NameInMap("ProductSkuCode")
    public String productSkuCode;

    /**
     * <p>The quantity of the order.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Quantity")
    public Integer quantity;

    /**
     * <p>The request ID. This ID is used for troubleshooting when an error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>6EF60BEC-<strong><strong>-</strong></strong>-****-270359FB54A7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total receivable amount of the order, in CNY.</p>
     * 
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

    public DescribeOrderForIsvResponseBody setComponents(Object components) {
        this.components = components;
        return this;
    }
    public Object getComponents() {
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
