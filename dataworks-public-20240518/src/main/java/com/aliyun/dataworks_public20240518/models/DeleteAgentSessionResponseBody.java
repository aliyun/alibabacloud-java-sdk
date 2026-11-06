// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteAgentSessionResponseBody extends TeaModel {
    /**
     * <p>The JSON-RPC response. It returns Result upon success and Error upon protocol errors.</p>
     */
    @NameInMap("JsonRpcResponse")
    public DeleteAgentSessionResponseBodyJsonRpcResponse jsonRpcResponse;

    /**
     * <p>The OpenAPI request ID, which can be used to troubleshoot call failures.</p>
     * 
     * <strong>example:</strong>
     * <p>01A0B6E0-E005-1465-B5DE-5CD17677426F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAgentSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentSessionResponseBody self = new DeleteAgentSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAgentSessionResponseBody setJsonRpcResponse(DeleteAgentSessionResponseBodyJsonRpcResponse jsonRpcResponse) {
        this.jsonRpcResponse = jsonRpcResponse;
        return this;
    }
    public DeleteAgentSessionResponseBodyJsonRpcResponse getJsonRpcResponse() {
        return this.jsonRpcResponse;
    }

    public DeleteAgentSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteAgentSessionResponseBodyJsonRpcResponseError extends TeaModel {
        /**
         * <p>The JSON-RPC error code.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <p>The optional additional error information. The content depends on the error type.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Data")
        public Object data;

        /**
         * <p>The business error code.</p>
         * 
         * <strong>example:</strong>
         * <p>0x4883300000000019</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The session does not exist or the current account does not have access permissions. Return to the session list and select another session</p>
         */
        @NameInMap("Message")
        public String message;

        public static DeleteAgentSessionResponseBodyJsonRpcResponseError build(java.util.Map<String, ?> map) throws Exception {
            DeleteAgentSessionResponseBodyJsonRpcResponseError self = new DeleteAgentSessionResponseBodyJsonRpcResponseError();
            return TeaModel.build(map, self);
        }

        public DeleteAgentSessionResponseBodyJsonRpcResponseError setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public DeleteAgentSessionResponseBodyJsonRpcResponseError setData(Object data) {
            this.data = data;
            return this;
        }
        public Object getData() {
            return this.data;
        }

        public DeleteAgentSessionResponseBodyJsonRpcResponseError setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DeleteAgentSessionResponseBodyJsonRpcResponseError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class DeleteAgentSessionResponseBodyJsonRpcResponse extends TeaModel {
        /**
         * <p>The JSON-RPC fault message. This field is not returned upon success.</p>
         */
        @NameInMap("Error")
        public DeleteAgentSessionResponseBodyJsonRpcResponseError error;

        /**
         * <p>The JSON-RPC correlation identifier for the current request. It is passed by the caller and returned as-is.</p>
         * 
         * <strong>example:</strong>
         * <p>delete-rpc-001</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The JSON-RPC protocol version.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("Jsonrpc")
        public String jsonrpc;

        /**
         * <p>An empty object is returned upon successful deletion. If the deletion fails, check the sibling Error field.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Result")
        public Object result;

        /**
         * <p>The response time. It is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1789549200000</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        public static DeleteAgentSessionResponseBodyJsonRpcResponse build(java.util.Map<String, ?> map) throws Exception {
            DeleteAgentSessionResponseBodyJsonRpcResponse self = new DeleteAgentSessionResponseBodyJsonRpcResponse();
            return TeaModel.build(map, self);
        }

        public DeleteAgentSessionResponseBodyJsonRpcResponse setError(DeleteAgentSessionResponseBodyJsonRpcResponseError error) {
            this.error = error;
            return this;
        }
        public DeleteAgentSessionResponseBodyJsonRpcResponseError getError() {
            return this.error;
        }

        public DeleteAgentSessionResponseBodyJsonRpcResponse setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DeleteAgentSessionResponseBodyJsonRpcResponse setJsonrpc(String jsonrpc) {
            this.jsonrpc = jsonrpc;
            return this;
        }
        public String getJsonrpc() {
            return this.jsonrpc;
        }

        public DeleteAgentSessionResponseBodyJsonRpcResponse setResult(Object result) {
            this.result = result;
            return this;
        }
        public Object getResult() {
            return this.result;
        }

        public DeleteAgentSessionResponseBodyJsonRpcResponse setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
