// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RefundOrderResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RefundResponse")
    public RefundOrderResponseBodyRefundResponse refundResponse;

    @NameInMap("RequestId")
    public String requestId;

    public static RefundOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefundOrderResponseBody self = new RefundOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public RefundOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RefundOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RefundOrderResponseBody setRefundResponse(RefundOrderResponseBodyRefundResponse refundResponse) {
        this.refundResponse = refundResponse;
        return this;
    }
    public RefundOrderResponseBodyRefundResponse getRefundResponse() {
        return this.refundResponse;
    }

    public RefundOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RefundOrderResponseBodyRefundResponse extends TeaModel {
        @NameInMap("FundChange")
        public String fundChange;

        @NameInMap("GmtRefundPay")
        public String gmtRefundPay;

        @NameInMap("OutRequestNo")
        public String outRequestNo;

        @NameInMap("OutTradeNo")
        public String outTradeNo;

        @NameInMap("TradeNo")
        public String tradeNo;

        public static RefundOrderResponseBodyRefundResponse build(java.util.Map<String, ?> map) throws Exception {
            RefundOrderResponseBodyRefundResponse self = new RefundOrderResponseBodyRefundResponse();
            return TeaModel.build(map, self);
        }

        public RefundOrderResponseBodyRefundResponse setFundChange(String fundChange) {
            this.fundChange = fundChange;
            return this;
        }
        public String getFundChange() {
            return this.fundChange;
        }

        public RefundOrderResponseBodyRefundResponse setGmtRefundPay(String gmtRefundPay) {
            this.gmtRefundPay = gmtRefundPay;
            return this;
        }
        public String getGmtRefundPay() {
            return this.gmtRefundPay;
        }

        public RefundOrderResponseBodyRefundResponse setOutRequestNo(String outRequestNo) {
            this.outRequestNo = outRequestNo;
            return this;
        }
        public String getOutRequestNo() {
            return this.outRequestNo;
        }

        public RefundOrderResponseBodyRefundResponse setOutTradeNo(String outTradeNo) {
            this.outTradeNo = outTradeNo;
            return this;
        }
        public String getOutTradeNo() {
            return this.outTradeNo;
        }

        public RefundOrderResponseBodyRefundResponse setTradeNo(String tradeNo) {
            this.tradeNo = tradeNo;
            return this;
        }
        public String getTradeNo() {
            return this.tradeNo;
        }

    }

}
