// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RefundOrderResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("RefundResponse")
    public RefundOrderResponseBodyRefundResponse refundResponse;

    /**
     * <strong>example:</strong>
     * <p>1718921E-C8D4-55E1-B8D4-114AE537C1B7</p>
     */
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

        /**
         * <strong>example:</strong>
         * <p>4111584A-44D8-49B6-80BD-FACD0726054C</p>
         */
        @NameInMap("OutRequestNo")
        public String outRequestNo;

        /**
         * <strong>example:</strong>
         * <p>23******32727</p>
         */
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
