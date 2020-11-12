// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class SettleOrderResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TradeOrderSettleResponse")
    @Validation(required = true)
    public SettleOrderResponseTradeOrderSettleResponse tradeOrderSettleResponse;

    public static SettleOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        SettleOrderResponse self = new SettleOrderResponse();
        return TeaModel.build(map, self);
    }

    public SettleOrderResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SettleOrderResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SettleOrderResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SettleOrderResponse setTradeOrderSettleResponse(SettleOrderResponseTradeOrderSettleResponse tradeOrderSettleResponse) {
        this.tradeOrderSettleResponse = tradeOrderSettleResponse;
        return this;
    }
    public SettleOrderResponseTradeOrderSettleResponse getTradeOrderSettleResponse() {
        return this.tradeOrderSettleResponse;
    }

    public static class SettleOrderResponseTradeOrderSettleResponse extends TeaModel {
        @NameInMap("OutRequestNo")
        @Validation(required = true)
        public String outRequestNo;

        @NameInMap("TradeNo")
        @Validation(required = true)
        public String tradeNo;

        public static SettleOrderResponseTradeOrderSettleResponse build(java.util.Map<String, ?> map) throws Exception {
            SettleOrderResponseTradeOrderSettleResponse self = new SettleOrderResponseTradeOrderSettleResponse();
            return TeaModel.build(map, self);
        }

        public SettleOrderResponseTradeOrderSettleResponse setOutRequestNo(String outRequestNo) {
            this.outRequestNo = outRequestNo;
            return this;
        }
        public String getOutRequestNo() {
            return this.outRequestNo;
        }

        public SettleOrderResponseTradeOrderSettleResponse setTradeNo(String tradeNo) {
            this.tradeNo = tradeNo;
            return this;
        }
        public String getTradeNo() {
            return this.tradeNo;
        }

    }

}
