// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UploadAgentSessionFileResponseBody extends TeaModel {
    /**
     * <p>The JSON-RPC response. Returns Result on success and Error on protocol errors.</p>
     */
    @NameInMap("JsonRpcResponse")
    public UploadAgentSessionFileResponseBodyJsonRpcResponse jsonRpcResponse;

    /**
     * <p>The server correlation ID for the current request. You can provide this value for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>01A0B6E0-E005-1465-B5DE-5CD17677426F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UploadAgentSessionFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadAgentSessionFileResponseBody self = new UploadAgentSessionFileResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadAgentSessionFileResponseBody setJsonRpcResponse(UploadAgentSessionFileResponseBodyJsonRpcResponse jsonRpcResponse) {
        this.jsonRpcResponse = jsonRpcResponse;
        return this;
    }
    public UploadAgentSessionFileResponseBodyJsonRpcResponse getJsonRpcResponse() {
        return this.jsonRpcResponse;
    }

    public UploadAgentSessionFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UploadAgentSessionFileResponseBodyJsonRpcResponseError extends TeaModel {
        /**
         * <p>The JSON-RPC error code.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
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
         * <p>SESSION_ATTACHMENT_OBJECT_MISMATCH</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>SESSION_ATTACHMENT_OBJECT_MISMATCH</p>
         */
        @NameInMap("Message")
        public String message;

        public static UploadAgentSessionFileResponseBodyJsonRpcResponseError build(java.util.Map<String, ?> map) throws Exception {
            UploadAgentSessionFileResponseBodyJsonRpcResponseError self = new UploadAgentSessionFileResponseBodyJsonRpcResponseError();
            return TeaModel.build(map, self);
        }

        public UploadAgentSessionFileResponseBodyJsonRpcResponseError setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public UploadAgentSessionFileResponseBodyJsonRpcResponseError setData(Object data) {
            this.data = data;
            return this;
        }
        public Object getData() {
            return this.data;
        }

        public UploadAgentSessionFileResponseBodyJsonRpcResponseError setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public UploadAgentSessionFileResponseBodyJsonRpcResponseError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class UploadAgentSessionFileResponseBodyJsonRpcResponseResultSignature extends TeaModel {
        /**
         * <p>The expiration time of the current upload signature in ISO 8601 UTC string format. The trailing Z indicates UTC, and fractional seconds may be included. The signature is valid for 5 minutes. Signature expiration does not indicate that the staged object has been deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-12T09:46:33.477365753Z</p>
         */
        @NameInMap("ExpiresAt")
        public String expiresAt;

        /**
         * <p>All signed request headers that must be included in the PUT request. The names and values must be used exactly as provided. This includes Content-Type, Content-MD5, Content-Length, x-oss-object-acl, and x-oss-forbid-overwrite.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Content-Type&quot;:&quot;application/octet-stream&quot;,&quot;Content-MD5&quot;:&quot;sZRqySSS0jR8YjW00mERhA==&quot;,&quot;Content-Length&quot;:&quot;6&quot;,&quot;x-oss-object-acl&quot;:&quot;private&quot;,&quot;x-oss-forbid-overwrite&quot;:&quot;true&quot;}</p>
         */
        @NameInMap("Headers")
        public java.util.Map<String, String> headers;

        /**
         * <p>The complete signed HTTPS PUT URL returned by prepare, which must be used exactly as provided for the upload. The example displayed for this field does not contain a valid signature. The actual request must use the complete signed URL returned by the current prepare call.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://attachments.example.test/signed">https://attachments.example.test/signed</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static UploadAgentSessionFileResponseBodyJsonRpcResponseResultSignature build(java.util.Map<String, ?> map) throws Exception {
            UploadAgentSessionFileResponseBodyJsonRpcResponseResultSignature self = new UploadAgentSessionFileResponseBodyJsonRpcResponseResultSignature();
            return TeaModel.build(map, self);
        }

        public UploadAgentSessionFileResponseBodyJsonRpcResponseResultSignature setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public UploadAgentSessionFileResponseBodyJsonRpcResponseResultSignature setHeaders(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        public UploadAgentSessionFileResponseBodyJsonRpcResponseResultSignature setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class UploadAgentSessionFileResponseBodyJsonRpcResponseResult extends TeaModel {
        /**
         * <p>The attachment identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The original file name.</p>
         * 
         * <strong>example:</strong>
         * <p>sample.csv</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The relative path in the session working directory.</p>
         * 
         * <strong>example:</strong>
         * <p>upload/session_bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb.csv</p>
         */
        @NameInMap("RelativePath")
        public String relativePath;

        /**
         * <p>The time-limited object storage signature returned by prepare.</p>
         */
        @NameInMap("Signature")
        public UploadAgentSessionFileResponseBodyJsonRpcResponseResultSignature signature;

        /**
         * <p>The number of file bytes saved in the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The staged upload identifier issued by prepare.</p>
         * 
         * <strong>example:</strong>
         * <p>bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb</p>
         */
        @NameInMap("UploadId")
        public String uploadId;

        public static UploadAgentSessionFileResponseBodyJsonRpcResponseResult build(java.util.Map<String, ?> map) throws Exception {
            UploadAgentSessionFileResponseBodyJsonRpcResponseResult self = new UploadAgentSessionFileResponseBodyJsonRpcResponseResult();
            return TeaModel.build(map, self);
        }

        public UploadAgentSessionFileResponseBodyJsonRpcResponseResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UploadAgentSessionFileResponseBodyJsonRpcResponseResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UploadAgentSessionFileResponseBodyJsonRpcResponseResult setRelativePath(String relativePath) {
            this.relativePath = relativePath;
            return this;
        }
        public String getRelativePath() {
            return this.relativePath;
        }

        public UploadAgentSessionFileResponseBodyJsonRpcResponseResult setSignature(UploadAgentSessionFileResponseBodyJsonRpcResponseResultSignature signature) {
            this.signature = signature;
            return this;
        }
        public UploadAgentSessionFileResponseBodyJsonRpcResponseResultSignature getSignature() {
            return this.signature;
        }

        public UploadAgentSessionFileResponseBodyJsonRpcResponseResult setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public UploadAgentSessionFileResponseBodyJsonRpcResponseResult setUploadId(String uploadId) {
            this.uploadId = uploadId;
            return this;
        }
        public String getUploadId() {
            return this.uploadId;
        }

    }

    public static class UploadAgentSessionFileResponseBodyJsonRpcResponse extends TeaModel {
        /**
         * <p>The JSON-RPC fault message. This field is not returned on success.</p>
         */
        @NameInMap("Error")
        public UploadAgentSessionFileResponseBodyJsonRpcResponseError error;

        /**
         * <p>The JSON-RPC correlation identifier for the current request, which is passed by the caller and returned as is.</p>
         * 
         * <strong>example:</strong>
         * <p>attachment-rpc-001</p>
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
         * <p>Issues the staged upload URL or returns the attachment information after writing to the instance.</p>
         */
        @NameInMap("Result")
        public UploadAgentSessionFileResponseBodyJsonRpcResponseResult result;

        /**
         * <p>The response time as a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1789549200000</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        public static UploadAgentSessionFileResponseBodyJsonRpcResponse build(java.util.Map<String, ?> map) throws Exception {
            UploadAgentSessionFileResponseBodyJsonRpcResponse self = new UploadAgentSessionFileResponseBodyJsonRpcResponse();
            return TeaModel.build(map, self);
        }

        public UploadAgentSessionFileResponseBodyJsonRpcResponse setError(UploadAgentSessionFileResponseBodyJsonRpcResponseError error) {
            this.error = error;
            return this;
        }
        public UploadAgentSessionFileResponseBodyJsonRpcResponseError getError() {
            return this.error;
        }

        public UploadAgentSessionFileResponseBodyJsonRpcResponse setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UploadAgentSessionFileResponseBodyJsonRpcResponse setJsonrpc(String jsonrpc) {
            this.jsonrpc = jsonrpc;
            return this;
        }
        public String getJsonrpc() {
            return this.jsonrpc;
        }

        public UploadAgentSessionFileResponseBodyJsonRpcResponse setResult(UploadAgentSessionFileResponseBodyJsonRpcResponseResult result) {
            this.result = result;
            return this;
        }
        public UploadAgentSessionFileResponseBodyJsonRpcResponseResult getResult() {
            return this.result;
        }

        public UploadAgentSessionFileResponseBodyJsonRpcResponse setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
