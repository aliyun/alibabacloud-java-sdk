// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class QueryOrderResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Ext")
    public java.util.Map<String, ?> ext;

    @NameInMap("Header")
    public QueryOrderResponseBodyHeader header;

    @NameInMap("Result")
    public QueryOrderResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static QueryOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderResponseBody self = new QueryOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryOrderResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryOrderResponseBody setExt(java.util.Map<String, ?> ext) {
        this.ext = ext;
        return this;
    }
    public java.util.Map<String, ?> getExt() {
        return this.ext;
    }

    public QueryOrderResponseBody setHeader(QueryOrderResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public QueryOrderResponseBodyHeader getHeader() {
        return this.header;
    }

    public QueryOrderResponseBody setResult(QueryOrderResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryOrderResponseBodyResult getResult() {
        return this.result;
    }

    public QueryOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryOrderResponseBodyHeader extends TeaModel {
        @NameInMap("CostTime")
        public Long costTime;

        @NameInMap("InnerErrorCode")
        public String innerErrorCode;

        @NameInMap("InnerErrorMsg")
        public String innerErrorMsg;

        /**
         * <p>RPC ID</p>
         */
        @NameInMap("RpcId")
        public String rpcId;

        @NameInMap("TraceId")
        public String traceId;

        @NameInMap("Version")
        public String version;

        public static QueryOrderResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderResponseBodyHeader self = new QueryOrderResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public QueryOrderResponseBodyHeader setCostTime(Long costTime) {
            this.costTime = costTime;
            return this;
        }
        public Long getCostTime() {
            return this.costTime;
        }

        public QueryOrderResponseBodyHeader setInnerErrorCode(String innerErrorCode) {
            this.innerErrorCode = innerErrorCode;
            return this;
        }
        public String getInnerErrorCode() {
            return this.innerErrorCode;
        }

        public QueryOrderResponseBodyHeader setInnerErrorMsg(String innerErrorMsg) {
            this.innerErrorMsg = innerErrorMsg;
            return this;
        }
        public String getInnerErrorMsg() {
            return this.innerErrorMsg;
        }

        public QueryOrderResponseBodyHeader setRpcId(String rpcId) {
            this.rpcId = rpcId;
            return this;
        }
        public String getRpcId() {
            return this.rpcId;
        }

        public QueryOrderResponseBodyHeader setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public QueryOrderResponseBodyHeader setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryOrderResponseBodyResult extends TeaModel {
        @NameInMap("AlipayTradeId")
        public String alipayTradeId;

        @NameInMap("ChannelTradeId")
        public String channelTradeId;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        @NameInMap("OrderStatus")
        public Integer orderStatus;

        @NameInMap("Price")
        public Long price;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TaobaoTradeId")
        public String taobaoTradeId;

        @NameInMap("TradeId")
        public String tradeId;

        public static QueryOrderResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderResponseBodyResult self = new QueryOrderResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryOrderResponseBodyResult setAlipayTradeId(String alipayTradeId) {
            this.alipayTradeId = alipayTradeId;
            return this;
        }
        public String getAlipayTradeId() {
            return this.alipayTradeId;
        }

        public QueryOrderResponseBodyResult setChannelTradeId(String channelTradeId) {
            this.channelTradeId = channelTradeId;
            return this;
        }
        public String getChannelTradeId() {
            return this.channelTradeId;
        }

        public QueryOrderResponseBodyResult setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryOrderResponseBodyResult setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public QueryOrderResponseBodyResult setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public QueryOrderResponseBodyResult setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public QueryOrderResponseBodyResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public QueryOrderResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryOrderResponseBodyResult setTaobaoTradeId(String taobaoTradeId) {
            this.taobaoTradeId = taobaoTradeId;
            return this;
        }
        public String getTaobaoTradeId() {
            return this.taobaoTradeId;
        }

        public QueryOrderResponseBodyResult setTradeId(String tradeId) {
            this.tradeId = tradeId;
            return this;
        }
        public String getTradeId() {
            return this.tradeId;
        }

    }

}
