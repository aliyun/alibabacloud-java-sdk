// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ReplyAgentSessionResponseBody extends TeaModel {
    /**
     * <p>The JSON-RPC response. Returns Result on success and Error on protocol errors.</p>
     */
    @NameInMap("JsonRpcResponse")
    public ReplyAgentSessionResponseBodyJsonRpcResponse jsonRpcResponse;

    /**
     * <p>The request ID for the current call, which can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>request-001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReplyAgentSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReplyAgentSessionResponseBody self = new ReplyAgentSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public ReplyAgentSessionResponseBody setJsonRpcResponse(ReplyAgentSessionResponseBodyJsonRpcResponse jsonRpcResponse) {
        this.jsonRpcResponse = jsonRpcResponse;
        return this;
    }
    public ReplyAgentSessionResponseBodyJsonRpcResponse getJsonRpcResponse() {
        return this.jsonRpcResponse;
    }

    public ReplyAgentSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ReplyAgentSessionResponseBodyJsonRpcResponseError extends TeaModel {
        /**
         * <p>The JSON-RPC error code.</p>
         * 
         * <strong>example:</strong>
         * <p>-32601</p>
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
         * <p>DAEMON_PERMISSION_UNAVAILABLE</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>DataAgent daemon permission reply is not enabled</p>
         */
        @NameInMap("Message")
        public String message;

        public static ReplyAgentSessionResponseBodyJsonRpcResponseError build(java.util.Map<String, ?> map) throws Exception {
            ReplyAgentSessionResponseBodyJsonRpcResponseError self = new ReplyAgentSessionResponseBodyJsonRpcResponseError();
            return TeaModel.build(map, self);
        }

        public ReplyAgentSessionResponseBodyJsonRpcResponseError setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public ReplyAgentSessionResponseBodyJsonRpcResponseError setData(Object data) {
            this.data = data;
            return this;
        }
        public Object getData() {
            return this.data;
        }

        public ReplyAgentSessionResponseBodyJsonRpcResponseError setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ReplyAgentSessionResponseBodyJsonRpcResponseError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class ReplyAgentSessionResponseBodyJsonRpcResponseResult extends TeaModel {
        /**
         * <p>Indicates whether the daemon accepts the current reply. A value of true indicates that the reply is accepted. A value of false indicates that the reply is not accepted, which may be because the request is unknown, already processed, expired, or the session does not exist. The specific cause cannot be distinguished based on this value.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Accepted")
        public Boolean accepted;

        public static ReplyAgentSessionResponseBodyJsonRpcResponseResult build(java.util.Map<String, ?> map) throws Exception {
            ReplyAgentSessionResponseBodyJsonRpcResponseResult self = new ReplyAgentSessionResponseBodyJsonRpcResponseResult();
            return TeaModel.build(map, self);
        }

        public ReplyAgentSessionResponseBodyJsonRpcResponseResult setAccepted(Boolean accepted) {
            this.accepted = accepted;
            return this;
        }
        public Boolean getAccepted() {
            return this.accepted;
        }

    }

    public static class ReplyAgentSessionResponseBodyJsonRpcResponse extends TeaModel {
        /**
         * <p>The JSON-RPC fault message. For example, DAEMON_PERMISSION_UNAVAILABLE is returned when the daemon reply feature is not enabled.</p>
         */
        @NameInMap("Error")
        public ReplyAgentSessionResponseBodyJsonRpcResponseError error;

        /**
         * <p>The JSON-RPC correlation ID for the current reply request.</p>
         * 
         * <strong>example:</strong>
         * <p>reply-rpc-001</p>
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
         * <p>The reply processing result. It only indicates whether the current reply is accepted, and does not indicate that the original task execution is completed.</p>
         */
        @NameInMap("Result")
        public ReplyAgentSessionResponseBodyJsonRpcResponseResult result;

        /**
         * <p>The response time. It is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1789549200000</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        public static ReplyAgentSessionResponseBodyJsonRpcResponse build(java.util.Map<String, ?> map) throws Exception {
            ReplyAgentSessionResponseBodyJsonRpcResponse self = new ReplyAgentSessionResponseBodyJsonRpcResponse();
            return TeaModel.build(map, self);
        }

        public ReplyAgentSessionResponseBodyJsonRpcResponse setError(ReplyAgentSessionResponseBodyJsonRpcResponseError error) {
            this.error = error;
            return this;
        }
        public ReplyAgentSessionResponseBodyJsonRpcResponseError getError() {
            return this.error;
        }

        public ReplyAgentSessionResponseBodyJsonRpcResponse setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ReplyAgentSessionResponseBodyJsonRpcResponse setJsonrpc(String jsonrpc) {
            this.jsonrpc = jsonrpc;
            return this;
        }
        public String getJsonrpc() {
            return this.jsonrpc;
        }

        public ReplyAgentSessionResponseBodyJsonRpcResponse setResult(ReplyAgentSessionResponseBodyJsonRpcResponseResult result) {
            this.result = result;
            return this;
        }
        public ReplyAgentSessionResponseBodyJsonRpcResponseResult getResult() {
            return this.result;
        }

        public ReplyAgentSessionResponseBodyJsonRpcResponse setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
