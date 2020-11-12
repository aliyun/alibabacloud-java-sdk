// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RefundOrderResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RefundResponse")
    @Validation(required = true)
    public RefundOrderResponseRefundResponse refundResponse;

    public static RefundOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        RefundOrderResponse self = new RefundOrderResponse();
        return TeaModel.build(map, self);
    }

    public RefundOrderResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RefundOrderResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RefundOrderResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RefundOrderResponse setRefundResponse(RefundOrderResponseRefundResponse refundResponse) {
        this.refundResponse = refundResponse;
        return this;
    }
    public RefundOrderResponseRefundResponse getRefundResponse() {
        return this.refundResponse;
    }

    public static class RefundOrderResponseRefundResponse extends TeaModel {
        @NameInMap("OutRequestNo")
        @Validation(required = true)
        public String outRequestNo;

        @NameInMap("OutTradeNo")
        @Validation(required = true)
        public String outTradeNo;

        @NameInMap("TradeNo")
        @Validation(required = true)
        public String tradeNo;

        @NameInMap("FundChange")
        @Validation(required = true)
        public String fundChange;

        @NameInMap("GmtRefundPay")
        @Validation(required = true)
        public String gmtRefundPay;

        public static RefundOrderResponseRefundResponse build(java.util.Map<String, ?> map) throws Exception {
            RefundOrderResponseRefundResponse self = new RefundOrderResponseRefundResponse();
            return TeaModel.build(map, self);
        }

        public RefundOrderResponseRefundResponse setOutRequestNo(String outRequestNo) {
            this.outRequestNo = outRequestNo;
            return this;
        }
        public String getOutRequestNo() {
            return this.outRequestNo;
        }

        public RefundOrderResponseRefundResponse setOutTradeNo(String outTradeNo) {
            this.outTradeNo = outTradeNo;
            return this;
        }
        public String getOutTradeNo() {
            return this.outTradeNo;
        }

        public RefundOrderResponseRefundResponse setTradeNo(String tradeNo) {
            this.tradeNo = tradeNo;
            return this;
        }
        public String getTradeNo() {
            return this.tradeNo;
        }

        public RefundOrderResponseRefundResponse setFundChange(String fundChange) {
            this.fundChange = fundChange;
            return this;
        }
        public String getFundChange() {
            return this.fundChange;
        }

        public RefundOrderResponseRefundResponse setGmtRefundPay(String gmtRefundPay) {
            this.gmtRefundPay = gmtRefundPay;
            return this;
        }
        public String getGmtRefundPay() {
            return this.gmtRefundPay;
        }

    }

}
