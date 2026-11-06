// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ArchiveAgentSessionResponseBody extends TeaModel {
    /**
     * <p>The JSON-RPC response. Result is returned if the call is successful, and Error is returned if a protocol error occurs.</p>
     */
    @NameInMap("JsonRpcResponse")
    public ArchiveAgentSessionResponseBodyJsonRpcResponse jsonRpcResponse;

    /**
     * <p>The OpenAPI request ID, which can be used to troubleshoot call failures.</p>
     * 
     * <strong>example:</strong>
     * <p>01A0B6E0-E005-1465-B5DE-5CD17677426F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ArchiveAgentSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ArchiveAgentSessionResponseBody self = new ArchiveAgentSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public ArchiveAgentSessionResponseBody setJsonRpcResponse(ArchiveAgentSessionResponseBodyJsonRpcResponse jsonRpcResponse) {
        this.jsonRpcResponse = jsonRpcResponse;
        return this;
    }
    public ArchiveAgentSessionResponseBodyJsonRpcResponse getJsonRpcResponse() {
        return this.jsonRpcResponse;
    }

    public ArchiveAgentSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ArchiveAgentSessionResponseBodyJsonRpcResponseError extends TeaModel {
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

        public static ArchiveAgentSessionResponseBodyJsonRpcResponseError build(java.util.Map<String, ?> map) throws Exception {
            ArchiveAgentSessionResponseBodyJsonRpcResponseError self = new ArchiveAgentSessionResponseBodyJsonRpcResponseError();
            return TeaModel.build(map, self);
        }

        public ArchiveAgentSessionResponseBodyJsonRpcResponseError setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public ArchiveAgentSessionResponseBodyJsonRpcResponseError setData(Object data) {
            this.data = data;
            return this;
        }
        public Object getData() {
            return this.data;
        }

        public ArchiveAgentSessionResponseBodyJsonRpcResponseError setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ArchiveAgentSessionResponseBodyJsonRpcResponseError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class ArchiveAgentSessionResponseBodyJsonRpcResponseResult extends TeaModel {
        /**
         * <p>The archive status after the operation is completed. A value of true indicates that the session is archived, and a value of false indicates that the session is unarchived.</p>
         */
        @NameInMap("Archived")
        public Boolean archived;

        /**
         * <p>The ID of the session for which the archive status is set.</p>
         * 
         * <strong>example:</strong>
         * <p>session_example</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        public static ArchiveAgentSessionResponseBodyJsonRpcResponseResult build(java.util.Map<String, ?> map) throws Exception {
            ArchiveAgentSessionResponseBodyJsonRpcResponseResult self = new ArchiveAgentSessionResponseBodyJsonRpcResponseResult();
            return TeaModel.build(map, self);
        }

        public ArchiveAgentSessionResponseBodyJsonRpcResponseResult setArchived(Boolean archived) {
            this.archived = archived;
            return this;
        }
        public Boolean getArchived() {
            return this.archived;
        }

        public ArchiveAgentSessionResponseBodyJsonRpcResponseResult setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

    public static class ArchiveAgentSessionResponseBodyJsonRpcResponse extends TeaModel {
        /**
         * <p>The JSON-RPC fault message. This field is not returned if the call is successful.</p>
         */
        @NameInMap("Error")
        public ArchiveAgentSessionResponseBodyJsonRpcResponseError error;

        /**
         * <p>The JSON-RPC correlation identifier of the current request, which is passed by the caller and returned as-is.</p>
         * 
         * <strong>example:</strong>
         * <p>archive-rpc-001</p>
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
         * <p>The session archive status.</p>
         */
        @NameInMap("Result")
        public ArchiveAgentSessionResponseBodyJsonRpcResponseResult result;

        /**
         * <p>The response time, which is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1789549200000</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        public static ArchiveAgentSessionResponseBodyJsonRpcResponse build(java.util.Map<String, ?> map) throws Exception {
            ArchiveAgentSessionResponseBodyJsonRpcResponse self = new ArchiveAgentSessionResponseBodyJsonRpcResponse();
            return TeaModel.build(map, self);
        }

        public ArchiveAgentSessionResponseBodyJsonRpcResponse setError(ArchiveAgentSessionResponseBodyJsonRpcResponseError error) {
            this.error = error;
            return this;
        }
        public ArchiveAgentSessionResponseBodyJsonRpcResponseError getError() {
            return this.error;
        }

        public ArchiveAgentSessionResponseBodyJsonRpcResponse setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ArchiveAgentSessionResponseBodyJsonRpcResponse setJsonrpc(String jsonrpc) {
            this.jsonrpc = jsonrpc;
            return this;
        }
        public String getJsonrpc() {
            return this.jsonrpc;
        }

        public ArchiveAgentSessionResponseBodyJsonRpcResponse setResult(ArchiveAgentSessionResponseBodyJsonRpcResponseResult result) {
            this.result = result;
            return this;
        }
        public ArchiveAgentSessionResponseBodyJsonRpcResponseResult getResult() {
            return this.result;
        }

        public ArchiveAgentSessionResponseBodyJsonRpcResponse setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
