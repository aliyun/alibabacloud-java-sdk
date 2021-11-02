// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class SettleOrderResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TradeOrderSettleResponse")
    public SettleOrderResponseBodyTradeOrderSettleResponse tradeOrderSettleResponse;

    public static SettleOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SettleOrderResponseBody self = new SettleOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public SettleOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SettleOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SettleOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SettleOrderResponseBody setTradeOrderSettleResponse(SettleOrderResponseBodyTradeOrderSettleResponse tradeOrderSettleResponse) {
        this.tradeOrderSettleResponse = tradeOrderSettleResponse;
        return this;
    }
    public SettleOrderResponseBodyTradeOrderSettleResponse getTradeOrderSettleResponse() {
        return this.tradeOrderSettleResponse;
    }

    public static class SettleOrderResponseBodyTradeOrderSettleResponse extends TeaModel {
        @NameInMap("OutRequestNo")
        public String outRequestNo;

        @NameInMap("TradeNo")
        public String tradeNo;

        public static SettleOrderResponseBodyTradeOrderSettleResponse build(java.util.Map<String, ?> map) throws Exception {
            SettleOrderResponseBodyTradeOrderSettleResponse self = new SettleOrderResponseBodyTradeOrderSettleResponse();
            return TeaModel.build(map, self);
        }

        public SettleOrderResponseBodyTradeOrderSettleResponse setOutRequestNo(String outRequestNo) {
            this.outRequestNo = outRequestNo;
            return this;
        }
        public String getOutRequestNo() {
            return this.outRequestNo;
        }

        public SettleOrderResponseBodyTradeOrderSettleResponse setTradeNo(String tradeNo) {
            this.tradeNo = tradeNo;
            return this;
        }
        public String getTradeNo() {
            return this.tradeNo;
        }

    }

}
