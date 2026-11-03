// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateAgentSessionTitleResponseBody extends TeaModel {
    /**
     * <p>The JSON-RPC response. Result is returned upon success, and Error is returned upon a protocol error.</p>
     */
    @NameInMap("JsonRpcResponse")
    public UpdateAgentSessionTitleResponseBodyJsonRpcResponse jsonRpcResponse;

    /**
     * <p>The unique ID of the current OpenAPI request. You can use it to troubleshoot request issues.</p>
     * 
     * <strong>example:</strong>
     * <p>01A0B6E0-E005-1465-B5DE-5CD17677426F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAgentSessionTitleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentSessionTitleResponseBody self = new UpdateAgentSessionTitleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAgentSessionTitleResponseBody setJsonRpcResponse(UpdateAgentSessionTitleResponseBodyJsonRpcResponse jsonRpcResponse) {
        this.jsonRpcResponse = jsonRpcResponse;
        return this;
    }
    public UpdateAgentSessionTitleResponseBodyJsonRpcResponse getJsonRpcResponse() {
        return this.jsonRpcResponse;
    }

    public UpdateAgentSessionTitleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateAgentSessionTitleResponseBodyJsonRpcResponseError extends TeaModel {
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
         * <p>The session does not exist or the current account is not authorized to access it. Return to the session list and select another session</p>
         */
        @NameInMap("Message")
        public String message;

        public static UpdateAgentSessionTitleResponseBodyJsonRpcResponseError build(java.util.Map<String, ?> map) throws Exception {
            UpdateAgentSessionTitleResponseBodyJsonRpcResponseError self = new UpdateAgentSessionTitleResponseBodyJsonRpcResponseError();
            return TeaModel.build(map, self);
        }

        public UpdateAgentSessionTitleResponseBodyJsonRpcResponseError setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public UpdateAgentSessionTitleResponseBodyJsonRpcResponseError setData(Object data) {
            this.data = data;
            return this;
        }
        public Object getData() {
            return this.data;
        }

        public UpdateAgentSessionTitleResponseBodyJsonRpcResponseError setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public UpdateAgentSessionTitleResponseBodyJsonRpcResponseError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class UpdateAgentSessionTitleResponseBodyJsonRpcResponseResult extends TeaModel {
        /**
         * <p>The ID of the agent session whose title is modified. It corresponds to the SessionId in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-42d3-a456-426614174000</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <p>The saved session title after modification. Leading and trailing whitespace characters are removed.</p>
         * 
         * <strong>example:</strong>
         * <p>New title</p>
         */
        @NameInMap("Title")
        public String title;

        public static UpdateAgentSessionTitleResponseBodyJsonRpcResponseResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateAgentSessionTitleResponseBodyJsonRpcResponseResult self = new UpdateAgentSessionTitleResponseBodyJsonRpcResponseResult();
            return TeaModel.build(map, self);
        }

        public UpdateAgentSessionTitleResponseBodyJsonRpcResponseResult setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public UpdateAgentSessionTitleResponseBodyJsonRpcResponseResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class UpdateAgentSessionTitleResponseBodyJsonRpcResponse extends TeaModel {
        /**
         * <p>The JSON-RPC error message. This field is not returned upon success.</p>
         */
        @NameInMap("Error")
        public UpdateAgentSessionTitleResponseBodyJsonRpcResponseError error;

        /**
         * <p>The JSON-RPC correlation ID for the current request. It is passed by the caller and returned as is.</p>
         * 
         * <strong>example:</strong>
         * <p>updateagentsessiontitle-rpc-001</p>
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
         * <p>The operation result.</p>
         */
        @NameInMap("Result")
        public UpdateAgentSessionTitleResponseBodyJsonRpcResponseResult result;

        /**
         * <p>The response time. It is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1789549200000</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        public static UpdateAgentSessionTitleResponseBodyJsonRpcResponse build(java.util.Map<String, ?> map) throws Exception {
            UpdateAgentSessionTitleResponseBodyJsonRpcResponse self = new UpdateAgentSessionTitleResponseBodyJsonRpcResponse();
            return TeaModel.build(map, self);
        }

        public UpdateAgentSessionTitleResponseBodyJsonRpcResponse setError(UpdateAgentSessionTitleResponseBodyJsonRpcResponseError error) {
            this.error = error;
            return this;
        }
        public UpdateAgentSessionTitleResponseBodyJsonRpcResponseError getError() {
            return this.error;
        }

        public UpdateAgentSessionTitleResponseBodyJsonRpcResponse setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateAgentSessionTitleResponseBodyJsonRpcResponse setJsonrpc(String jsonrpc) {
            this.jsonrpc = jsonrpc;
            return this;
        }
        public String getJsonrpc() {
            return this.jsonrpc;
        }

        public UpdateAgentSessionTitleResponseBodyJsonRpcResponse setResult(UpdateAgentSessionTitleResponseBodyJsonRpcResponseResult result) {
            this.result = result;
            return this;
        }
        public UpdateAgentSessionTitleResponseBodyJsonRpcResponseResult getResult() {
            return this.result;
        }

        public UpdateAgentSessionTitleResponseBodyJsonRpcResponse setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
