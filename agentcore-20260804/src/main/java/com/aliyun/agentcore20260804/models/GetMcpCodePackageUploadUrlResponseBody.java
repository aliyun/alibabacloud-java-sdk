// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetMcpCodePackageUploadUrlResponseBody extends TeaModel {
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
    public GetMcpCodePackageUploadUrlResponseBodyData data;

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
     * <p>The request ID, which is used to locate and troubleshoot the request.</p>
     * 
     * <strong>example:</strong>
     * <p>request-123456</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetMcpCodePackageUploadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMcpCodePackageUploadUrlResponseBody self = new GetMcpCodePackageUploadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMcpCodePackageUploadUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMcpCodePackageUploadUrlResponseBody setData(GetMcpCodePackageUploadUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMcpCodePackageUploadUrlResponseBodyData getData() {
        return this.data;
    }

    public GetMcpCodePackageUploadUrlResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMcpCodePackageUploadUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMcpCodePackageUploadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMcpCodePackageUploadUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMcpCodePackageUploadUrlResponseBodyData extends TeaModel {
        /**
         * <p>The expiration time of the temporary code package artifact, in ISO 8601 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-24T00:00:00Z</p>
         */
        @NameInMap("artifactExpiresAt")
        public String artifactExpiresAt;

        /**
         * <p>The code package upload token.</p>
         * 
         * <strong>example:</strong>
         * <p>upload-token</p>
         */
        @NameInMap("codePackageToken")
        public String codePackageToken;

        /**
         * <p>The expiration time of the presigned upload URL, in ISO 8601 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-23T00:15:00Z</p>
         */
        @NameInMap("expiresAt")
        public String expiresAt;

        /**
         * <p>The HTTP request headers, where the key is the header name and the value is the header content.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Content-Type&quot;:&quot;application/zip&quot;}</p>
         */
        @NameInMap("headers")
        public java.util.Map<String, String> headers;

        /**
         * <p>The maximum allowed size of the code package to upload, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>52428800</p>
         */
        @NameInMap("maxSize")
        public Long maxSize;

        /**
         * <p>The HTTP method used to upload the code package.</p>
         * 
         * <strong>example:</strong>
         * <p>PUT</p>
         */
        @NameInMap("uploadMethod")
        public String uploadMethod;

        /**
         * <p>The presigned upload URL for the code package.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example-bucket.oss-cn-hangzhou.aliyuncs.com/server.zip?Signature=example-signature">https://example-bucket.oss-cn-hangzhou.aliyuncs.com/server.zip?Signature=example-signature</a></p>
         */
        @NameInMap("uploadUrl")
        public String uploadUrl;

        public static GetMcpCodePackageUploadUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMcpCodePackageUploadUrlResponseBodyData self = new GetMcpCodePackageUploadUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMcpCodePackageUploadUrlResponseBodyData setArtifactExpiresAt(String artifactExpiresAt) {
            this.artifactExpiresAt = artifactExpiresAt;
            return this;
        }
        public String getArtifactExpiresAt() {
            return this.artifactExpiresAt;
        }

        public GetMcpCodePackageUploadUrlResponseBodyData setCodePackageToken(String codePackageToken) {
            this.codePackageToken = codePackageToken;
            return this;
        }
        public String getCodePackageToken() {
            return this.codePackageToken;
        }

        public GetMcpCodePackageUploadUrlResponseBodyData setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public GetMcpCodePackageUploadUrlResponseBodyData setHeaders(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        public GetMcpCodePackageUploadUrlResponseBodyData setMaxSize(Long maxSize) {
            this.maxSize = maxSize;
            return this;
        }
        public Long getMaxSize() {
            return this.maxSize;
        }

        public GetMcpCodePackageUploadUrlResponseBodyData setUploadMethod(String uploadMethod) {
            this.uploadMethod = uploadMethod;
            return this;
        }
        public String getUploadMethod() {
            return this.uploadMethod;
        }

        public GetMcpCodePackageUploadUrlResponseBodyData setUploadUrl(String uploadUrl) {
            this.uploadUrl = uploadUrl;
            return this;
        }
        public String getUploadUrl() {
            return this.uploadUrl;
        }

    }

}
