// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateSettleConfirmResponseBody extends TeaModel {
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

    /**
     * <strong>example:</strong>
     * <p>5E2D59BA-4EB0-45C4-A0D7-D98C1A4B320B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TradeSettleConfirmResponse")
    public CreateSettleConfirmResponseBodyTradeSettleConfirmResponse tradeSettleConfirmResponse;

    public static CreateSettleConfirmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSettleConfirmResponseBody self = new CreateSettleConfirmResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSettleConfirmResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSettleConfirmResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSettleConfirmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSettleConfirmResponseBody setTradeSettleConfirmResponse(CreateSettleConfirmResponseBodyTradeSettleConfirmResponse tradeSettleConfirmResponse) {
        this.tradeSettleConfirmResponse = tradeSettleConfirmResponse;
        return this;
    }
    public CreateSettleConfirmResponseBodyTradeSettleConfirmResponse getTradeSettleConfirmResponse() {
        return this.tradeSettleConfirmResponse;
    }

    public static class CreateSettleConfirmResponseBodyTradeSettleConfirmResponse extends TeaModel {
        @NameInMap("OutRequestNo")
        public String outRequestNo;

        @NameInMap("TradeNo")
        public String tradeNo;

        public static CreateSettleConfirmResponseBodyTradeSettleConfirmResponse build(java.util.Map<String, ?> map) throws Exception {
            CreateSettleConfirmResponseBodyTradeSettleConfirmResponse self = new CreateSettleConfirmResponseBodyTradeSettleConfirmResponse();
            return TeaModel.build(map, self);
        }

        public CreateSettleConfirmResponseBodyTradeSettleConfirmResponse setOutRequestNo(String outRequestNo) {
            this.outRequestNo = outRequestNo;
            return this;
        }
        public String getOutRequestNo() {
            return this.outRequestNo;
        }

        public CreateSettleConfirmResponseBodyTradeSettleConfirmResponse setTradeNo(String tradeNo) {
            this.tradeNo = tradeNo;
            return this;
        }
        public String getTradeNo() {
            return this.tradeNo;
        }

    }

}
