// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetAgentCodePackageUploadUrlResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public GetAgentCodePackageUploadUrlResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetAgentCodePackageUploadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentCodePackageUploadUrlResponseBody self = new GetAgentCodePackageUploadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentCodePackageUploadUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgentCodePackageUploadUrlResponseBody setData(GetAgentCodePackageUploadUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentCodePackageUploadUrlResponseBodyData getData() {
        return this.data;
    }

    public GetAgentCodePackageUploadUrlResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAgentCodePackageUploadUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAgentCodePackageUploadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentCodePackageUploadUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAgentCodePackageUploadUrlResponseBodyData extends TeaModel {
        /**
         * <p>The expiration time of the upload URL.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-22T00:10:00Z</p>
         */
        @NameInMap("expiresAt")
        public String expiresAt;

        /**
         * <p>The HTTP headers that must be included in the direct upload request.</p>
         */
        @NameInMap("headers")
        public java.util.Map<String, String> headers;

        /**
         * <p>The maximum compressed size of the code package.</p>
         * 
         * <strong>example:</strong>
         * <p>500000000</p>
         */
        @NameInMap("maxSize")
        public Long maxSize;

        /**
         * <p>The temporary Object Storage Service (OSS) URI of the code package.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://agentcore-platform-example/code-package-uploads/workspaces/ws-a1b2c3d4e5f6/550e8400-e29b-41d4-a716-446655440000/package.zip</p>
         */
        @NameInMap("sourceUri")
        public String sourceUri;

        /**
         * <p>The HTTP method for direct upload.</p>
         * 
         * <strong>example:</strong>
         * <p>PUT</p>
         */
        @NameInMap("uploadMethod")
        public String uploadMethod;

        /**
         * <p>The time-limited presigned upload URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://agentcore-platform-example.oss-cn-hangzhou.aliyuncs.com/code-package-uploads/workspaces/ws-a1b2c3d4e5f6/550e8400-e29b-41d4-a716-446655440000/package.zip?OSSAccessKeyId=LTAI5tExample****&Expires=1792627800&Signature=ExampleSignature">https://agentcore-platform-example.oss-cn-hangzhou.aliyuncs.com/code-package-uploads/workspaces/ws-a1b2c3d4e5f6/550e8400-e29b-41d4-a716-446655440000/package.zip?OSSAccessKeyId=LTAI5tExample****&amp;Expires=1792627800&amp;Signature=ExampleSignature</a>****</p>
         */
        @NameInMap("uploadUrl")
        public String uploadUrl;

        public static GetAgentCodePackageUploadUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentCodePackageUploadUrlResponseBodyData self = new GetAgentCodePackageUploadUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentCodePackageUploadUrlResponseBodyData setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public GetAgentCodePackageUploadUrlResponseBodyData setHeaders(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        public GetAgentCodePackageUploadUrlResponseBodyData setMaxSize(Long maxSize) {
            this.maxSize = maxSize;
            return this;
        }
        public Long getMaxSize() {
            return this.maxSize;
        }

        public GetAgentCodePackageUploadUrlResponseBodyData setSourceUri(String sourceUri) {
            this.sourceUri = sourceUri;
            return this;
        }
        public String getSourceUri() {
            return this.sourceUri;
        }

        public GetAgentCodePackageUploadUrlResponseBodyData setUploadMethod(String uploadMethod) {
            this.uploadMethod = uploadMethod;
            return this;
        }
        public String getUploadMethod() {
            return this.uploadMethod;
        }

        public GetAgentCodePackageUploadUrlResponseBodyData setUploadUrl(String uploadUrl) {
            this.uploadUrl = uploadUrl;
            return this;
        }
        public String getUploadUrl() {
            return this.uploadUrl;
        }

    }

}
