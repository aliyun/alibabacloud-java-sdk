// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateWithholdTradeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>6103AD7B-21C2-523B-89D0-579DA58D08E8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WithholdTradeResponse")
    public CreateWithholdTradeResponseBodyWithholdTradeResponse withholdTradeResponse;

    public static CreateWithholdTradeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWithholdTradeResponseBody self = new CreateWithholdTradeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWithholdTradeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
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

    public static class CreateWithholdTradeResponseBodyWithholdTradeResponse extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>57E4FE52-0750-4456-AA8F-ECC9FA0F8DF0</p>
         */
        @NameInMap("OutRequestNo")
        public String outRequestNo;

        /**
         * <strong>example:</strong>
         * <p>23******274</p>
         */
        @NameInMap("OutTradeNo")
        public String outTradeNo;

        /**
         * <strong>example:</strong>
         * <p>2022-04-01 12:00:00</p>
         */
        @NameInMap("PaymentDate")
        public String paymentDate;

        /**
         * <strong>example:</strong>
         * <p>32******372</p>
         */
        @NameInMap("TradeNo")
        public String tradeNo;

        public static CreateWithholdTradeResponseBodyWithholdTradeResponse build(java.util.Map<String, ?> map) throws Exception {
            CreateWithholdTradeResponseBodyWithholdTradeResponse self = new CreateWithholdTradeResponseBodyWithholdTradeResponse();
            return TeaModel.build(map, self);
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

    }

}
