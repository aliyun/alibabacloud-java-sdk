// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryOrdersResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryOrdersResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AfterTaxAmount")
        public String afterTaxAmount;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("OrderType")
        public String orderType;

        @NameInMap("PaymentCurrency")
        public String paymentCurrency;

        @NameInMap("PaymentStatus")
        public String paymentStatus;

        @NameInMap("PaymentTime")
        public String paymentTime;

        @NameInMap("PretaxAmount")
        public String pretaxAmount;

        @NameInMap("PretaxAmountLocal")
        public String pretaxAmountLocal;

        @NameInMap("PretaxGrossAmount")
        public String pretaxGrossAmount;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductType")
        public String productType;

        @NameInMap("RelatedOrderId")
        public String relatedOrderId;

        @NameInMap("SubscriptionType")
        public String subscriptionType;

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
        @NameInMap("HostName")
        public String hostName;

        @NameInMap("OrderList")
        public QueryOrdersResponseBodyDataOrderList orderList;

        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

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
