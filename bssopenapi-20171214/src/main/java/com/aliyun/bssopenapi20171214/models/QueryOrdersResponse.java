// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryOrdersResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryOrdersResponseData data;

    public static QueryOrdersResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrdersResponse self = new QueryOrdersResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrdersResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOrdersResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryOrdersResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOrdersResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryOrdersResponse setData(QueryOrdersResponseData data) {
        this.data = data;
        return this;
    }
    public QueryOrdersResponseData getData() {
        return this.data;
    }

    public static class QueryOrdersResponseDataOrderListOrder extends TeaModel {
        @NameInMap("OrderId")
        @Validation(required = true)
        public String orderId;

        @NameInMap("ProductCode")
        @Validation(required = true)
        public String productCode;

        @NameInMap("ProductType")
        @Validation(required = true)
        public String productType;

        @NameInMap("SubscriptionType")
        @Validation(required = true)
        public String subscriptionType;

        @NameInMap("OrderType")
        @Validation(required = true)
        public String orderType;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("PaymentTime")
        @Validation(required = true)
        public String paymentTime;

        @NameInMap("PaymentStatus")
        @Validation(required = true)
        public String paymentStatus;

        @NameInMap("PretaxGrossAmount")
        @Validation(required = true)
        public String pretaxGrossAmount;

        @NameInMap("PretaxAmount")
        @Validation(required = true)
        public String pretaxAmount;

        @NameInMap("Currency")
        @Validation(required = true)
        public String currency;

        @NameInMap("PretaxAmountLocal")
        @Validation(required = true)
        public String pretaxAmountLocal;

        @NameInMap("Tax")
        @Validation(required = true)
        public String tax;

        @NameInMap("AfterTaxAmount")
        @Validation(required = true)
        public String afterTaxAmount;

        @NameInMap("PaymentCurrency")
        @Validation(required = true)
        public String paymentCurrency;

        @NameInMap("RelatedOrderId")
        @Validation(required = true)
        public String relatedOrderId;

        public static QueryOrdersResponseDataOrderListOrder build(java.util.Map<String, ?> map) throws Exception {
            QueryOrdersResponseDataOrderListOrder self = new QueryOrdersResponseDataOrderListOrder();
            return TeaModel.build(map, self);
        }

        public QueryOrdersResponseDataOrderListOrder setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryOrdersResponseDataOrderListOrder setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public QueryOrdersResponseDataOrderListOrder setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public QueryOrdersResponseDataOrderListOrder setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public QueryOrdersResponseDataOrderListOrder setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public QueryOrdersResponseDataOrderListOrder setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryOrdersResponseDataOrderListOrder setPaymentTime(String paymentTime) {
            this.paymentTime = paymentTime;
            return this;
        }
        public String getPaymentTime() {
            return this.paymentTime;
        }

        public QueryOrdersResponseDataOrderListOrder setPaymentStatus(String paymentStatus) {
            this.paymentStatus = paymentStatus;
            return this;
        }
        public String getPaymentStatus() {
            return this.paymentStatus;
        }

        public QueryOrdersResponseDataOrderListOrder setPretaxGrossAmount(String pretaxGrossAmount) {
            this.pretaxGrossAmount = pretaxGrossAmount;
            return this;
        }
        public String getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        public QueryOrdersResponseDataOrderListOrder setPretaxAmount(String pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public String getPretaxAmount() {
            return this.pretaxAmount;
        }

        public QueryOrdersResponseDataOrderListOrder setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryOrdersResponseDataOrderListOrder setPretaxAmountLocal(String pretaxAmountLocal) {
            this.pretaxAmountLocal = pretaxAmountLocal;
            return this;
        }
        public String getPretaxAmountLocal() {
            return this.pretaxAmountLocal;
        }

        public QueryOrdersResponseDataOrderListOrder setTax(String tax) {
            this.tax = tax;
            return this;
        }
        public String getTax() {
            return this.tax;
        }

        public QueryOrdersResponseDataOrderListOrder setAfterTaxAmount(String afterTaxAmount) {
            this.afterTaxAmount = afterTaxAmount;
            return this;
        }
        public String getAfterTaxAmount() {
            return this.afterTaxAmount;
        }

        public QueryOrdersResponseDataOrderListOrder setPaymentCurrency(String paymentCurrency) {
            this.paymentCurrency = paymentCurrency;
            return this;
        }
        public String getPaymentCurrency() {
            return this.paymentCurrency;
        }

        public QueryOrdersResponseDataOrderListOrder setRelatedOrderId(String relatedOrderId) {
            this.relatedOrderId = relatedOrderId;
            return this;
        }
        public String getRelatedOrderId() {
            return this.relatedOrderId;
        }

    }

    public static class QueryOrdersResponseDataOrderList extends TeaModel {
        @NameInMap("Order")
        @Validation(required = true)
        public java.util.List<QueryOrdersResponseDataOrderListOrder> order;

        public static QueryOrdersResponseDataOrderList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrdersResponseDataOrderList self = new QueryOrdersResponseDataOrderList();
            return TeaModel.build(map, self);
        }

        public QueryOrdersResponseDataOrderList setOrder(java.util.List<QueryOrdersResponseDataOrderListOrder> order) {
            this.order = order;
            return this;
        }
        public java.util.List<QueryOrdersResponseDataOrderListOrder> getOrder() {
            return this.order;
        }

    }

    public static class QueryOrdersResponseData extends TeaModel {
        @NameInMap("HostName")
        @Validation(required = true)
        public String hostName;

        @NameInMap("PageNum")
        @Validation(required = true)
        public Integer pageNum;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("OrderList")
        @Validation(required = true)
        public QueryOrdersResponseDataOrderList orderList;

        public static QueryOrdersResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryOrdersResponseData self = new QueryOrdersResponseData();
            return TeaModel.build(map, self);
        }

        public QueryOrdersResponseData setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public QueryOrdersResponseData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryOrdersResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryOrdersResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryOrdersResponseData setOrderList(QueryOrdersResponseDataOrderList orderList) {
            this.orderList = orderList;
            return this;
        }
        public QueryOrdersResponseDataOrderList getOrderList() {
            return this.orderList;
        }

    }

}
