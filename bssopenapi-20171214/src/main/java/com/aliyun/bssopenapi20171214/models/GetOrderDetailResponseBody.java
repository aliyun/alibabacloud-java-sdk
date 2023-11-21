// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetOrderDetailResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetOrderDetailResponseBodyData data;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetOrderDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOrderDetailResponseBody self = new GetOrderDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOrderDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOrderDetailResponseBody setData(GetOrderDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOrderDetailResponseBodyData getData() {
        return this.data;
    }

    public GetOrderDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOrderDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOrderDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOrderDetailResponseBodyDataOrderListOrder extends TeaModel {
        /**
         * <p>The after-tax amount of the order.</p>
         */
        @NameInMap("AfterTaxAmount")
        public String afterTaxAmount;

        /**
         * <p>The service code.</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The configurations of the main service.</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The time when the order was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The currency.</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The instance IDs.</p>
         */
        @NameInMap("InstanceIDs")
        public String instanceIDs;

        /**
         * <p>The ID of the Resource Access Management (RAM) user who performs operations on the order. If no RAM user is involved, leave this parameter blank.</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The ID of the order.</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <p>The type of the suborder. Valid values:</p>
         * <br>
         * <p>*   ProductSubOrder: the service suborder</p>
         * <p>*   RefundSubOrder: the refund suborder</p>
         */
        @NameInMap("OrderSubType")
        public String orderSubType;

        /**
         * <p>The type of the order. Valid values:</p>
         * <br>
         * <p>*   New: purchases an instance.</p>
         * <p>*   Renew: renews an instance.</p>
         * <p>*   Upgrade: upgrades the configurations of an instance.</p>
         * <p>*   Refund: applies for a refund.</p>
         * <p>*   Convert: switches the billing method.</p>
         * <p>*   Downgrade: downgrades the configurations of an instance.</p>
         * <p>*   ResizeDisk: resizes the disk.</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        /**
         * <p>The module information without standardized conversion.</p>
         */
        @NameInMap("OriginalConfig")
        public String originalConfig;

        /**
         * <p>The currency of payment.</p>
         */
        @NameInMap("PaymentCurrency")
        public String paymentCurrency;

        /**
         * <p>The status of payment. Valid values:</p>
         * <br>
         * <p>*   Unpaid: The order is not paid.</p>
         * <p>*   Paid: The order is paid.</p>
         * <p>*   Cancelled: The order is canceled.</p>
         */
        @NameInMap("PaymentStatus")
        public String paymentStatus;

        /**
         * <p>The time of payment.</p>
         */
        @NameInMap("PaymentTime")
        public String paymentTime;

        /**
         * <p>The pretax amount of the order.</p>
         */
        @NameInMap("PretaxAmount")
        public String pretaxAmount;

        /**
         * <p>The pretax amount of the order in local currency.</p>
         */
        @NameInMap("PretaxAmountLocal")
        public String pretaxAmountLocal;

        /**
         * <p>The pretax gross amount of the order.</p>
         */
        @NameInMap("PretaxGrossAmount")
        public String pretaxGrossAmount;

        /**
         * <p>The code of the main service.</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The type of the main service.</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The number of main services.</p>
         */
        @NameInMap("Quantity")
        public String quantity;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The ID of the associated order.</p>
         */
        @NameInMap("RelatedOrderId")
        public String relatedOrderId;

        /**
         * <p>The ID of the suborder.</p>
         */
        @NameInMap("SubOrderId")
        public String subOrderId;

        /**
         * <p>The billing method. Valid values:</p>
         * <br>
         * <p>*   Subscription: subscription</p>
         * <p>*   PayAsYouGo: pay-as-you-go</p>
         */
        @NameInMap("SubscriptionType")
        public String subscriptionType;

        /**
         * <p>The tax of the order.</p>
         */
        @NameInMap("Tax")
        public String tax;

        /**
         * <p>The time when the service ends.</p>
         */
        @NameInMap("UsageEndTime")
        public String usageEndTime;

        /**
         * <p>The time when the service starts.</p>
         */
        @NameInMap("UsageStartTime")
        public String usageStartTime;

        public static GetOrderDetailResponseBodyDataOrderListOrder build(java.util.Map<String, ?> map) throws Exception {
            GetOrderDetailResponseBodyDataOrderListOrder self = new GetOrderDetailResponseBodyDataOrderListOrder();
            return TeaModel.build(map, self);
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setAfterTaxAmount(String afterTaxAmount) {
            this.afterTaxAmount = afterTaxAmount;
            return this;
        }
        public String getAfterTaxAmount() {
            return this.afterTaxAmount;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setInstanceIDs(String instanceIDs) {
            this.instanceIDs = instanceIDs;
            return this;
        }
        public String getInstanceIDs() {
            return this.instanceIDs;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setOrderSubType(String orderSubType) {
            this.orderSubType = orderSubType;
            return this;
        }
        public String getOrderSubType() {
            return this.orderSubType;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setOriginalConfig(String originalConfig) {
            this.originalConfig = originalConfig;
            return this;
        }
        public String getOriginalConfig() {
            return this.originalConfig;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setPaymentCurrency(String paymentCurrency) {
            this.paymentCurrency = paymentCurrency;
            return this;
        }
        public String getPaymentCurrency() {
            return this.paymentCurrency;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setPaymentStatus(String paymentStatus) {
            this.paymentStatus = paymentStatus;
            return this;
        }
        public String getPaymentStatus() {
            return this.paymentStatus;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setPaymentTime(String paymentTime) {
            this.paymentTime = paymentTime;
            return this;
        }
        public String getPaymentTime() {
            return this.paymentTime;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setPretaxAmount(String pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public String getPretaxAmount() {
            return this.pretaxAmount;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setPretaxAmountLocal(String pretaxAmountLocal) {
            this.pretaxAmountLocal = pretaxAmountLocal;
            return this;
        }
        public String getPretaxAmountLocal() {
            return this.pretaxAmountLocal;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setPretaxGrossAmount(String pretaxGrossAmount) {
            this.pretaxGrossAmount = pretaxGrossAmount;
            return this;
        }
        public String getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setQuantity(String quantity) {
            this.quantity = quantity;
            return this;
        }
        public String getQuantity() {
            return this.quantity;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setRelatedOrderId(String relatedOrderId) {
            this.relatedOrderId = relatedOrderId;
            return this;
        }
        public String getRelatedOrderId() {
            return this.relatedOrderId;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setSubOrderId(String subOrderId) {
            this.subOrderId = subOrderId;
            return this;
        }
        public String getSubOrderId() {
            return this.subOrderId;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setTax(String tax) {
            this.tax = tax;
            return this;
        }
        public String getTax() {
            return this.tax;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setUsageEndTime(String usageEndTime) {
            this.usageEndTime = usageEndTime;
            return this;
        }
        public String getUsageEndTime() {
            return this.usageEndTime;
        }

        public GetOrderDetailResponseBodyDataOrderListOrder setUsageStartTime(String usageStartTime) {
            this.usageStartTime = usageStartTime;
            return this;
        }
        public String getUsageStartTime() {
            return this.usageStartTime;
        }

    }

    public static class GetOrderDetailResponseBodyDataOrderList extends TeaModel {
        @NameInMap("Order")
        public java.util.List<GetOrderDetailResponseBodyDataOrderListOrder> order;

        public static GetOrderDetailResponseBodyDataOrderList build(java.util.Map<String, ?> map) throws Exception {
            GetOrderDetailResponseBodyDataOrderList self = new GetOrderDetailResponseBodyDataOrderList();
            return TeaModel.build(map, self);
        }

        public GetOrderDetailResponseBodyDataOrderList setOrder(java.util.List<GetOrderDetailResponseBodyDataOrderListOrder> order) {
            this.order = order;
            return this;
        }
        public java.util.List<GetOrderDetailResponseBodyDataOrderListOrder> getOrder() {
            return this.order;
        }

    }

    public static class GetOrderDetailResponseBodyData extends TeaModel {
        /**
         * <p>The hostname.</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The details of the order.</p>
         */
        @NameInMap("OrderList")
        public GetOrderDetailResponseBodyDataOrderList orderList;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of entries returned on each page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of returned entries.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetOrderDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOrderDetailResponseBodyData self = new GetOrderDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOrderDetailResponseBodyData setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public GetOrderDetailResponseBodyData setOrderList(GetOrderDetailResponseBodyDataOrderList orderList) {
            this.orderList = orderList;
            return this;
        }
        public GetOrderDetailResponseBodyDataOrderList getOrderList() {
            return this.orderList;
        }

        public GetOrderDetailResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetOrderDetailResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetOrderDetailResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
