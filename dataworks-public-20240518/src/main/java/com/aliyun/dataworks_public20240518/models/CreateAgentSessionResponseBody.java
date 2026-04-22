// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateAgentSessionResponseBody extends TeaModel {
    @NameInMap("JsonRpcResponse")
    public CreateAgentSessionResponseBodyJsonRpcResponse jsonRpcResponse;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>8A9D5E6C-5817-5837-9715-6E3967EC6123</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAgentSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentSessionResponseBody self = new CreateAgentSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAgentSessionResponseBody setJsonRpcResponse(CreateAgentSessionResponseBodyJsonRpcResponse jsonRpcResponse) {
        this.jsonRpcResponse = jsonRpcResponse;
        return this;
    }
    public CreateAgentSessionResponseBodyJsonRpcResponse getJsonRpcResponse() {
        return this.jsonRpcResponse;
    }

    public CreateAgentSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAgentSessionResponseBodyJsonRpcResponseResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>sess_0f12abc34</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        public static CreateAgentSessionResponseBodyJsonRpcResponseResult build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentSessionResponseBodyJsonRpcResponseResult self = new CreateAgentSessionResponseBodyJsonRpcResponseResult();
            return TeaModel.build(map, self);
        }

        public CreateAgentSessionResponseBodyJsonRpcResponseResult setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

    public static class CreateAgentSessionResponseBodyJsonRpcResponse extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
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
        public CreateAgentSessionResponseBodyJsonRpcResponseResult result;

        public static CreateAgentSessionResponseBodyJsonRpcResponse build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentSessionResponseBodyJsonRpcResponse self = new CreateAgentSessionResponseBodyJsonRpcResponse();
            return TeaModel.build(map, self);
        }

        public CreateAgentSessionResponseBodyJsonRpcResponse setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateAgentSessionResponseBodyJsonRpcResponse setJsonrpc(String jsonrpc) {
            this.jsonrpc = jsonrpc;
            return this;
        }
        public String getJsonrpc() {
            return this.jsonrpc;
        }

        public CreateAgentSessionResponseBodyJsonRpcResponse setResult(CreateAgentSessionResponseBodyJsonRpcResponseResult result) {
            this.result = result;
            return this;
        }
        public CreateAgentSessionResponseBodyJsonRpcResponseResult getResult() {
            return this.result;
        }

    }

}
