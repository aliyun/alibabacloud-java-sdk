// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryWithholdTradeResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("QueryWithholdTradeResponse")
    @Validation(required = true)
    public QueryWithholdTradeResponseQueryWithholdTradeResponse queryWithholdTradeResponse;

    public static QueryWithholdTradeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWithholdTradeResponse self = new QueryWithholdTradeResponse();
        return TeaModel.build(map, self);
    }

    public QueryWithholdTradeResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryWithholdTradeResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryWithholdTradeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryWithholdTradeResponse setQueryWithholdTradeResponse(QueryWithholdTradeResponseQueryWithholdTradeResponse queryWithholdTradeResponse) {
        this.queryWithholdTradeResponse = queryWithholdTradeResponse;
        return this;
    }
    public QueryWithholdTradeResponseQueryWithholdTradeResponse getQueryWithholdTradeResponse() {
        return this.queryWithholdTradeResponse;
    }

    public static class QueryWithholdTradeResponseQueryWithholdTradeResponse extends TeaModel {
        @NameInMap("TradeStatus")
        @Validation(required = true)
        public String tradeStatus;

        @NameInMap("SettleStatus")
        @Validation(required = true)
        public String settleStatus;

        @NameInMap("OutTradeNo")
        @Validation(required = true)
        public String outTradeNo;

        @NameInMap("TotalAmount")
        @Validation(required = true)
        public String totalAmount;

        @NameInMap("TradeNo")
        @Validation(required = true)
        public String tradeNo;

        @NameInMap("PaymentDate")
        @Validation(required = true)
        public String paymentDate;

        public static QueryWithholdTradeResponseQueryWithholdTradeResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryWithholdTradeResponseQueryWithholdTradeResponse self = new QueryWithholdTradeResponseQueryWithholdTradeResponse();
            return TeaModel.build(map, self);
        }

        public QueryWithholdTradeResponseQueryWithholdTradeResponse setTradeStatus(String tradeStatus) {
            this.tradeStatus = tradeStatus;
            return this;
        }
        public String getTradeStatus() {
            return this.tradeStatus;
        }

        public QueryWithholdTradeResponseQueryWithholdTradeResponse setSettleStatus(String settleStatus) {
            this.settleStatus = settleStatus;
            return this;
        }
        public String getSettleStatus() {
            return this.settleStatus;
        }

        public QueryWithholdTradeResponseQueryWithholdTradeResponse setOutTradeNo(String outTradeNo) {
            this.outTradeNo = outTradeNo;
            return this;
        }
        public String getOutTradeNo() {
            return this.outTradeNo;
        }

        public QueryWithholdTradeResponseQueryWithholdTradeResponse setTotalAmount(String totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public String getTotalAmount() {
            return this.totalAmount;
        }

        public QueryWithholdTradeResponseQueryWithholdTradeResponse setTradeNo(String tradeNo) {
            this.tradeNo = tradeNo;
            return this;
        }
        public String getTradeNo() {
            return this.tradeNo;
        }

        public QueryWithholdTradeResponseQueryWithholdTradeResponse setPaymentDate(String paymentDate) {
            this.paymentDate = paymentDate;
            return this;
        }
        public String getPaymentDate() {
            return this.paymentDate;
        }

    }

}
