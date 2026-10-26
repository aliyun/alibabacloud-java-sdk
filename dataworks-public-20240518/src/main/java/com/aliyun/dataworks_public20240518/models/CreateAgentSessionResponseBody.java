// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateAgentSessionResponseBody extends TeaModel {
    /**
     * <p>The JSON-RPC response.</p>
     */
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

    public static class CreateAgentSessionResponseBodyJsonRpcResponseError extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Data")
        public Object data;

        /**
         * <strong>example:</strong>
         * <p>0x4883300000000019</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>创建 DataAgent 实例必须指定资源组，请在请求的 _meta.dataAgent.resourceGroupId 中传入资源组 ID</p>
         */
        @NameInMap("Message")
        public String message;

        public static CreateAgentSessionResponseBodyJsonRpcResponseError build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentSessionResponseBodyJsonRpcResponseError self = new CreateAgentSessionResponseBodyJsonRpcResponseError();
            return TeaModel.build(map, self);
        }

        public CreateAgentSessionResponseBodyJsonRpcResponseError setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public CreateAgentSessionResponseBodyJsonRpcResponseError setData(Object data) {
            this.data = data;
            return this;
        }
        public Object getData() {
            return this.data;
        }

        public CreateAgentSessionResponseBodyJsonRpcResponseError setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public CreateAgentSessionResponseBodyJsonRpcResponseError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class CreateAgentSessionResponseBodyJsonRpcResponseResult extends TeaModel {
        /**
         * <p>The ID of the created session.</p>
         * 
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
        @NameInMap("Error")
        public CreateAgentSessionResponseBodyJsonRpcResponseError error;

        /**
         * <p>The request ID passed by the caller. The value is returned as-is.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The JSON-RPC version. Fixed value: 2.0.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("Jsonrpc")
        public String jsonrpc;

        /**
         * <p>The business data. The value is null if an error occurs.</p>
         */
        @NameInMap("Result")
        public CreateAgentSessionResponseBodyJsonRpcResponseResult result;

        /**
         * <strong>example:</strong>
         * <p>1789549200000</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        public static CreateAgentSessionResponseBodyJsonRpcResponse build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentSessionResponseBodyJsonRpcResponse self = new CreateAgentSessionResponseBodyJsonRpcResponse();
            return TeaModel.build(map, self);
        }

        public CreateAgentSessionResponseBodyJsonRpcResponse setError(CreateAgentSessionResponseBodyJsonRpcResponseError error) {
            this.error = error;
            return this;
        }
        public CreateAgentSessionResponseBodyJsonRpcResponseError getError() {
            return this.error;
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

        public CreateAgentSessionResponseBodyJsonRpcResponse setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
