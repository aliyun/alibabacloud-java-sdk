// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class QueryOrderResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<QueryOrderResponseBodyData> data;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderResponseBody self = new QueryOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOrderResponseBody setData(java.util.List<QueryOrderResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryOrderResponseBodyData> getData() {
        return this.data;
    }

    public QueryOrderResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public QueryOrderResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public QueryOrderResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryOrderResponseBodyData extends TeaModel {
        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("OrderStatus")
        public String orderStatus;

        @NameInMap("OrderType")
        public String orderType;

        public static QueryOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderResponseBodyData self = new QueryOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryOrderResponseBodyData setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        public QueryOrderResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryOrderResponseBodyData setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public String getOrderStatus() {
            return this.orderStatus;
        }

        public QueryOrderResponseBodyData setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

    }

}
