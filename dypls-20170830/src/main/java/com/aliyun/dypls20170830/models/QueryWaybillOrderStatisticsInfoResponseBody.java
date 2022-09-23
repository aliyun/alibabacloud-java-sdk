// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryWaybillOrderStatisticsInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryWaybillOrderStatisticsInfoResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryWaybillOrderStatisticsInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryWaybillOrderStatisticsInfoResponseBody self = new QueryWaybillOrderStatisticsInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryWaybillOrderStatisticsInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryWaybillOrderStatisticsInfoResponseBody setData(java.util.List<QueryWaybillOrderStatisticsInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryWaybillOrderStatisticsInfoResponseBodyData> getData() {
        return this.data;
    }

    public QueryWaybillOrderStatisticsInfoResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryWaybillOrderStatisticsInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryWaybillOrderStatisticsInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryWaybillOrderStatisticsInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryWaybillOrderStatisticsInfoResponseBodyData extends TeaModel {
        @NameInMap("AliyunpriceAmount")
        public Double aliyunpriceAmount;

        @NameInMap("CancelCount")
        public Integer cancelCount;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GotCount")
        public Integer gotCount;

        @NameInMap("OrderTotal")
        public Integer orderTotal;

        public static QueryWaybillOrderStatisticsInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryWaybillOrderStatisticsInfoResponseBodyData self = new QueryWaybillOrderStatisticsInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryWaybillOrderStatisticsInfoResponseBodyData setAliyunpriceAmount(Double aliyunpriceAmount) {
            this.aliyunpriceAmount = aliyunpriceAmount;
            return this;
        }
        public Double getAliyunpriceAmount() {
            return this.aliyunpriceAmount;
        }

        public QueryWaybillOrderStatisticsInfoResponseBodyData setCancelCount(Integer cancelCount) {
            this.cancelCount = cancelCount;
            return this;
        }
        public Integer getCancelCount() {
            return this.cancelCount;
        }

        public QueryWaybillOrderStatisticsInfoResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryWaybillOrderStatisticsInfoResponseBodyData setGotCount(Integer gotCount) {
            this.gotCount = gotCount;
            return this;
        }
        public Integer getGotCount() {
            return this.gotCount;
        }

        public QueryWaybillOrderStatisticsInfoResponseBodyData setOrderTotal(Integer orderTotal) {
            this.orderTotal = orderTotal;
            return this;
        }
        public Integer getOrderTotal() {
            return this.orderTotal;
        }

    }

}
