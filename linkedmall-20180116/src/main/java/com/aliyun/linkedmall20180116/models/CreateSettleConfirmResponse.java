// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateSettleConfirmResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TradeSettleConfirmResponse")
    @Validation(required = true)
    public CreateSettleConfirmResponseTradeSettleConfirmResponse tradeSettleConfirmResponse;

    public static CreateSettleConfirmResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSettleConfirmResponse self = new CreateSettleConfirmResponse();
        return TeaModel.build(map, self);
    }

    public CreateSettleConfirmResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSettleConfirmResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSettleConfirmResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSettleConfirmResponse setTradeSettleConfirmResponse(CreateSettleConfirmResponseTradeSettleConfirmResponse tradeSettleConfirmResponse) {
        this.tradeSettleConfirmResponse = tradeSettleConfirmResponse;
        return this;
    }
    public CreateSettleConfirmResponseTradeSettleConfirmResponse getTradeSettleConfirmResponse() {
        return this.tradeSettleConfirmResponse;
    }

    public static class CreateSettleConfirmResponseTradeSettleConfirmResponse extends TeaModel {
        @NameInMap("TradeNo")
        @Validation(required = true)
        public String tradeNo;

        @NameInMap("OutRequestNo")
        @Validation(required = true)
        public String outRequestNo;

        public static CreateSettleConfirmResponseTradeSettleConfirmResponse build(java.util.Map<String, ?> map) throws Exception {
            CreateSettleConfirmResponseTradeSettleConfirmResponse self = new CreateSettleConfirmResponseTradeSettleConfirmResponse();
            return TeaModel.build(map, self);
        }

        public CreateSettleConfirmResponseTradeSettleConfirmResponse setTradeNo(String tradeNo) {
            this.tradeNo = tradeNo;
            return this;
        }
        public String getTradeNo() {
            return this.tradeNo;
        }

        public CreateSettleConfirmResponseTradeSettleConfirmResponse setOutRequestNo(String outRequestNo) {
            this.outRequestNo = outRequestNo;
            return this;
        }
        public String getOutRequestNo() {
            return this.outRequestNo;
        }

    }

}
