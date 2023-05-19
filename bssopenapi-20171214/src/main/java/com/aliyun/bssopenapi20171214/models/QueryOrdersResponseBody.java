// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryOrdersResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Data")
    public QueryOrdersResponseBodyData data;

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

    public static QueryOrdersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOrdersResponseBody self = new QueryOrdersResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOrdersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOrdersResponseBody setData(QueryOrdersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryOrdersResponseBodyData getData() {
        return this.data;
    }

    public QueryOrdersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryOrdersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOrdersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryOrdersResponseBodyDataOrderListOrder extends TeaModel {
        /**
         * <p>The aftertax amount of the order.</p>
         */
        @NameInMap("AfterTaxAmount")
        public String afterTaxAmount;

        /**
         * <p>The service code.</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

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
         * <p>The ID of the order.</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <p>The type of the order. Valid values:</p>
         * <br>
         * <p>*   New: purchases an instance.</p>
         * <p>*   Renew: renews an instance.</p>
         * <p>*   Upgrade: upgrades the configurations of an instance.</p>
         * <p>*   Refund: applies for a refund.</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        /**
         * <p>The currency of payment.</p>
         */
        @NameInMap("PaymentCurrency")
        public String paymentCurrency;

        /**
         * <p>The status of payment. Valid values for a non-refund order:</p>
         * <br>
         * <p>*   Unpaid: The order is not paid.</p>
         * <p>*   Paid: The order is paid.</p>
         * <p>*   Cancelled: The order is canceled.</p>
         * <br>
         * <p>> : The value is NULL for a refund order.</p>
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
         * <p>The ID of the associated order.</p>
         */
        @NameInMap("RelatedOrderId")
        public String relatedOrderId;

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

        public static QueryOrdersResponseBodyDataOrderListOrder build(java.util.Map<String, ?> map) throws Exception {
            QueryOrdersResponseBodyDataOrderListOrder self = new QueryOrdersResponseBodyDataOrderListOrder();
            return TeaModel.build(map, self);
        }

        public QueryOrdersResponseBodyDataOrderListOrder setAfterTaxAmount(String afterTaxAmount) {
            this.afterTaxAmount = afterTaxAmount;
            return this;
        }
        public String getAfterTaxAmount() {
            return this.afterTaxAmount;
        }

        public QueryOrdersResponseBodyDataOrderListOrder setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public QueryOrdersResponseBodyDataOrderListOrder setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryOrdersResponseBodyDataOrderListOrder setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryOrdersResponseBodyDataOrderListOrder setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryOrdersResponseBodyDataOrderListOrder setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public QueryOrdersResponseBodyDataOrderListOrder setPaymentCurrency(String paymentCurrency) {
            this.paymentCurrency = paymentCurrency;
            return this;
        }
        public String getPaymentCurrency() {
            return this.paymentCurrency;
        }

        public QueryOrdersResponseBodyDataOrderListOrder setPaymentStatus(String paymentStatus) {
            this.paymentStatus = paymentStatus;
            return this;
        }
        public String getPaymentStatus() {
            return this.paymentStatus;
        }

        public QueryOrdersResponseBodyDataOrderListOrder setPaymentTime(String paymentTime) {
            this.paymentTime = paymentTime;
            return this;
        }
        public String getPaymentTime() {
            return this.paymentTime;
        }

        public QueryOrdersResponseBodyDataOrderListOrder setPretaxAmount(String pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public String getPretaxAmount() {
            return this.pretaxAmount;
        }

        public QueryOrdersResponseBodyDataOrderListOrder setPretaxAmountLocal(String pretaxAmountLocal) {
            this.pretaxAmountLocal = pretaxAmountLocal;
            return this;
        }
        public String getPretaxAmountLocal() {
            return this.pretaxAmountLocal;
        }

        public QueryOrdersResponseBodyDataOrderListOrder setPretaxGrossAmount(String pretaxGrossAmount) {
            this.pretaxGrossAmount = pretaxGrossAmount;
            return this;
        }
        public String getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        public QueryOrdersResponseBodyDataOrderListOrder setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public QueryOrdersResponseBodyDataOrderListOrder setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public QueryOrdersResponseBodyDataOrderListOrder setRelatedOrderId(String relatedOrderId) {
            this.relatedOrderId = relatedOrderId;
            return this;
        }
        public String getRelatedOrderId() {
            return this.relatedOrderId;
        }

        public QueryOrdersResponseBodyDataOrderListOrder setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public QueryOrdersResponseBodyDataOrderListOrder setTax(String tax) {
            this.tax = tax;
            return this;
        }
        public String getTax() {
            return this.tax;
        }

    }

    public static class QueryOrdersResponseBodyDataOrderList extends TeaModel {
        @NameInMap("Order")
        public java.util.List<QueryOrdersResponseBodyDataOrderListOrder> order;

        public static QueryOrdersResponseBodyDataOrderList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrdersResponseBodyDataOrderList self = new QueryOrdersResponseBodyDataOrderList();
            return TeaModel.build(map, self);
        }

        public QueryOrdersResponseBodyDataOrderList setOrder(java.util.List<QueryOrdersResponseBodyDataOrderListOrder> order) {
            this.order = order;
            return this;
        }
        public java.util.List<QueryOrdersResponseBodyDataOrderListOrder> getOrder() {
            return this.order;
        }

    }

    public static class QueryOrdersResponseBodyData extends TeaModel {
        /**
         * <p>The hostname.</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The orders returned.</p>
         */
        @NameInMap("OrderList")
        public QueryOrdersResponseBodyDataOrderList orderList;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of returned entries.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static QueryOrdersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryOrdersResponseBodyData self = new QueryOrdersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryOrdersResponseBodyData setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public QueryOrdersResponseBodyData setOrderList(QueryOrdersResponseBodyDataOrderList orderList) {
            this.orderList = orderList;
            return this;
        }
        public QueryOrdersResponseBodyDataOrderList getOrderList() {
            return this.orderList;
        }

        public QueryOrdersResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryOrdersResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryOrdersResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
