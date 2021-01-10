// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateWithholdTradeResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WithholdTradeResponse")
    public CreateWithholdTradeResponseBodyWithholdTradeResponse withholdTradeResponse;

    @NameInMap("Code")
    public String code;

    public static CreateWithholdTradeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWithholdTradeResponseBody self = new CreateWithholdTradeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWithholdTradeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateWithholdTradeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWithholdTradeResponseBody setWithholdTradeResponse(CreateWithholdTradeResponseBodyWithholdTradeResponse withholdTradeResponse) {
        this.withholdTradeResponse = withholdTradeResponse;
        return this;
    }
    public CreateWithholdTradeResponseBodyWithholdTradeResponse getWithholdTradeResponse() {
        return this.withholdTradeResponse;
    }

    public CreateWithholdTradeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class CreateWithholdTradeResponseBodyWithholdTradeResponse extends TeaModel {
        @NameInMap("PaymentDate")
        public String paymentDate;

        @NameInMap("TradeNo")
        public String tradeNo;

        @NameInMap("OutRequestNo")
        public String outRequestNo;

        @NameInMap("OutTradeNo")
        public String outTradeNo;

        public static CreateWithholdTradeResponseBodyWithholdTradeResponse build(java.util.Map<String, ?> map) throws Exception {
            CreateWithholdTradeResponseBodyWithholdTradeResponse self = new CreateWithholdTradeResponseBodyWithholdTradeResponse();
            return TeaModel.build(map, self);
        }

        public CreateWithholdTradeResponseBodyWithholdTradeResponse setPaymentDate(String paymentDate) {
            this.paymentDate = paymentDate;
            return this;
        }
        public String getPaymentDate() {
            return this.paymentDate;
        }

        public CreateWithholdTradeResponseBodyWithholdTradeResponse setTradeNo(String tradeNo) {
            this.tradeNo = tradeNo;
            return this;
        }
        public String getTradeNo() {
            return this.tradeNo;
        }

        public CreateWithholdTradeResponseBodyWithholdTradeResponse setOutRequestNo(String outRequestNo) {
            this.outRequestNo = outRequestNo;
            return this;
        }
        public String getOutRequestNo() {
            return this.outRequestNo;
        }

        public CreateWithholdTradeResponseBodyWithholdTradeResponse setOutTradeNo(String outTradeNo) {
            this.outTradeNo = outTradeNo;
            return this;
        }
        public String getOutTradeNo() {
            return this.outTradeNo;
        }

    }

}
