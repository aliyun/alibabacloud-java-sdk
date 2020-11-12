// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateWithholdTradeResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("WithholdTradeResponse")
    @Validation(required = true)
    public CreateWithholdTradeResponseWithholdTradeResponse withholdTradeResponse;

    public static CreateWithholdTradeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWithholdTradeResponse self = new CreateWithholdTradeResponse();
        return TeaModel.build(map, self);
    }

    public CreateWithholdTradeResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateWithholdTradeResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateWithholdTradeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWithholdTradeResponse setWithholdTradeResponse(CreateWithholdTradeResponseWithholdTradeResponse withholdTradeResponse) {
        this.withholdTradeResponse = withholdTradeResponse;
        return this;
    }
    public CreateWithholdTradeResponseWithholdTradeResponse getWithholdTradeResponse() {
        return this.withholdTradeResponse;
    }

    public static class CreateWithholdTradeResponseWithholdTradeResponse extends TeaModel {
        @NameInMap("OutRequestNo")
        @Validation(required = true)
        public String outRequestNo;

        @NameInMap("OutTradeNo")
        @Validation(required = true)
        public String outTradeNo;

        @NameInMap("TradeNo")
        @Validation(required = true)
        public String tradeNo;

        @NameInMap("PaymentDate")
        @Validation(required = true)
        public String paymentDate;

        public static CreateWithholdTradeResponseWithholdTradeResponse build(java.util.Map<String, ?> map) throws Exception {
            CreateWithholdTradeResponseWithholdTradeResponse self = new CreateWithholdTradeResponseWithholdTradeResponse();
            return TeaModel.build(map, self);
        }

        public CreateWithholdTradeResponseWithholdTradeResponse setOutRequestNo(String outRequestNo) {
            this.outRequestNo = outRequestNo;
            return this;
        }
        public String getOutRequestNo() {
            return this.outRequestNo;
        }

        public CreateWithholdTradeResponseWithholdTradeResponse setOutTradeNo(String outTradeNo) {
            this.outTradeNo = outTradeNo;
            return this;
        }
        public String getOutTradeNo() {
            return this.outTradeNo;
        }

        public CreateWithholdTradeResponseWithholdTradeResponse setTradeNo(String tradeNo) {
            this.tradeNo = tradeNo;
            return this;
        }
        public String getTradeNo() {
            return this.tradeNo;
        }

        public CreateWithholdTradeResponseWithholdTradeResponse setPaymentDate(String paymentDate) {
            this.paymentDate = paymentDate;
            return this;
        }
        public String getPaymentDate() {
            return this.paymentDate;
        }

    }

}
