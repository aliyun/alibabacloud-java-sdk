// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetOrdersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetOrdersResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Successful!</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>6000EE23-274B-4E07-A697-FF2E999520A4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetOrdersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOrdersResponseBody self = new GetOrdersResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOrdersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOrdersResponseBody setData(GetOrdersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOrdersResponseBodyData getData() {
        return this.data;
    }

    public GetOrdersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOrdersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOrdersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOrdersResponseBodyDataOrderListOrder extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>66</p>
         */
        @NameInMap("AfterTaxAmount")
        public String afterTaxAmount;

        /**
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <strong>example:</strong>
         * <p>2017-06-08T09:41:30Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <strong>example:</strong>
         * <p>237258627070169</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <strong>example:</strong>
         * <p>New</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        /**
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("PaymentCurrency")
        public String paymentCurrency;

        /**
         * <strong>example:</strong>
         * <p>Paid</p>
         */
        @NameInMap("PaymentStatus")
        public String paymentStatus;

        /**
         * <strong>example:</strong>
         * <p>2017-06-08T09:41:30Z</p>
         */
        @NameInMap("PaymentTime")
        public String paymentTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PretaxAmount")
        public String pretaxAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PretaxAmountLocal")
        public String pretaxAmountLocal;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PretaxGrossAmount")
        public String pretaxGrossAmount;

        /**
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <strong>example:</strong>
         * <p>234535345345342</p>
         */
        @NameInMap("RelatedOrderId")
        public String relatedOrderId;

        /**
         * <strong>example:</strong>
         * <p>Subscription</p>
         */
        @NameInMap("SubscriptionType")
        public String subscriptionType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Tax")
        public String tax;

        public static GetOrdersResponseBodyDataOrderListOrder build(java.util.Map<String, ?> map) throws Exception {
            GetOrdersResponseBodyDataOrderListOrder self = new GetOrdersResponseBodyDataOrderListOrder();
            return TeaModel.build(map, self);
        }

        public GetOrdersResponseBodyDataOrderListOrder setAfterTaxAmount(String afterTaxAmount) {
            this.afterTaxAmount = afterTaxAmount;
            return this;
        }
        public String getAfterTaxAmount() {
            return this.afterTaxAmount;
        }

        public GetOrdersResponseBodyDataOrderListOrder setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public GetOrdersResponseBodyDataOrderListOrder setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetOrdersResponseBodyDataOrderListOrder setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GetOrdersResponseBodyDataOrderListOrder setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public GetOrdersResponseBodyDataOrderListOrder setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public GetOrdersResponseBodyDataOrderListOrder setPaymentCurrency(String paymentCurrency) {
            this.paymentCurrency = paymentCurrency;
            return this;
        }
        public String getPaymentCurrency() {
            return this.paymentCurrency;
        }

        public GetOrdersResponseBodyDataOrderListOrder setPaymentStatus(String paymentStatus) {
            this.paymentStatus = paymentStatus;
            return this;
        }
        public String getPaymentStatus() {
            return this.paymentStatus;
        }

        public GetOrdersResponseBodyDataOrderListOrder setPaymentTime(String paymentTime) {
            this.paymentTime = paymentTime;
            return this;
        }
        public String getPaymentTime() {
            return this.paymentTime;
        }

        public GetOrdersResponseBodyDataOrderListOrder setPretaxAmount(String pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public String getPretaxAmount() {
            return this.pretaxAmount;
        }

        public GetOrdersResponseBodyDataOrderListOrder setPretaxAmountLocal(String pretaxAmountLocal) {
            this.pretaxAmountLocal = pretaxAmountLocal;
            return this;
        }
        public String getPretaxAmountLocal() {
            return this.pretaxAmountLocal;
        }

        public GetOrdersResponseBodyDataOrderListOrder setPretaxGrossAmount(String pretaxGrossAmount) {
            this.pretaxGrossAmount = pretaxGrossAmount;
            return this;
        }
        public String getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        public GetOrdersResponseBodyDataOrderListOrder setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public GetOrdersResponseBodyDataOrderListOrder setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public GetOrdersResponseBodyDataOrderListOrder setRelatedOrderId(String relatedOrderId) {
            this.relatedOrderId = relatedOrderId;
            return this;
        }
        public String getRelatedOrderId() {
            return this.relatedOrderId;
        }

        public GetOrdersResponseBodyDataOrderListOrder setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public GetOrdersResponseBodyDataOrderListOrder setTax(String tax) {
            this.tax = tax;
            return this;
        }
        public String getTax() {
            return this.tax;
        }

    }

    public static class GetOrdersResponseBodyDataOrderList extends TeaModel {
        @NameInMap("Order")
        public java.util.List<GetOrdersResponseBodyDataOrderListOrder> order;

        public static GetOrdersResponseBodyDataOrderList build(java.util.Map<String, ?> map) throws Exception {
            GetOrdersResponseBodyDataOrderList self = new GetOrdersResponseBodyDataOrderList();
            return TeaModel.build(map, self);
        }

        public GetOrdersResponseBodyDataOrderList setOrder(java.util.List<GetOrdersResponseBodyDataOrderListOrder> order) {
            this.order = order;
            return this;
        }
        public java.util.List<GetOrdersResponseBodyDataOrderListOrder> getOrder() {
            return this.order;
        }

    }

    public static class GetOrdersResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("HostName")
        public String hostName;

        @NameInMap("OrderList")
        public GetOrdersResponseBodyDataOrderList orderList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetOrdersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOrdersResponseBodyData self = new GetOrdersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOrdersResponseBodyData setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public GetOrdersResponseBodyData setOrderList(GetOrdersResponseBodyDataOrderList orderList) {
            this.orderList = orderList;
            return this;
        }
        public GetOrdersResponseBodyDataOrderList getOrderList() {
            return this.orderList;
        }

        public GetOrdersResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetOrdersResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetOrdersResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
