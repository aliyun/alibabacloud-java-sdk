// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CancelAgentSessionResponseBody extends TeaModel {
    @NameInMap("JsonRpcResponse")
    public CancelAgentSessionResponseBodyJsonRpcResponse jsonRpcResponse;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>7CD3D216-5876-5DB1-A34A-396806F4A413</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelAgentSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelAgentSessionResponseBody self = new CancelAgentSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelAgentSessionResponseBody setJsonRpcResponse(CancelAgentSessionResponseBodyJsonRpcResponse jsonRpcResponse) {
        this.jsonRpcResponse = jsonRpcResponse;
        return this;
    }
    public CancelAgentSessionResponseBodyJsonRpcResponse getJsonRpcResponse() {
        return this.jsonRpcResponse;
    }

    public CancelAgentSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CancelAgentSessionResponseBodyJsonRpcResponseResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>session-d5d549fe4c2c4180a9814fb74190f502</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        public static CancelAgentSessionResponseBodyJsonRpcResponseResult build(java.util.Map<String, ?> map) throws Exception {
            CancelAgentSessionResponseBodyJsonRpcResponseResult self = new CancelAgentSessionResponseBodyJsonRpcResponseResult();
            return TeaModel.build(map, self);
        }

        public CancelAgentSessionResponseBodyJsonRpcResponseResult setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

    public static class CancelAgentSessionResponseBodyJsonRpcResponse extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>7675839888324361477</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("Jsonrpc")
        public String jsonrpc;

        @NameInMap("Result")
        public CancelAgentSessionResponseBodyJsonRpcResponseResult result;

        public static CancelAgentSessionResponseBodyJsonRpcResponse build(java.util.Map<String, ?> map) throws Exception {
            CancelAgentSessionResponseBodyJsonRpcResponse self = new CancelAgentSessionResponseBodyJsonRpcResponse();
            return TeaModel.build(map, self);
        }

        public CancelAgentSessionResponseBodyJsonRpcResponse setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CancelAgentSessionResponseBodyJsonRpcResponse setJsonrpc(String jsonrpc) {
            this.jsonrpc = jsonrpc;
            return this;
        }
        public String getJsonrpc() {
            return this.jsonrpc;
        }

        public CancelAgentSessionResponseBodyJsonRpcResponse setResult(CancelAgentSessionResponseBodyJsonRpcResponseResult result) {
            this.result = result;
            return this;
        }
        public CancelAgentSessionResponseBodyJsonRpcResponseResult getResult() {
            return this.result;
        }

    }

}
