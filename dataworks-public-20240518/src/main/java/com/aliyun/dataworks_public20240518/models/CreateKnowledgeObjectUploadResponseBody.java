// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateKnowledgeObjectUploadResponseBody extends TeaModel {
    /**
     * <p>The business error code, which is used to determine the error type when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data returned when the request is successful.</p>
     */
    @NameInMap("Data")
    public CreateKnowledgeObjectUploadResponseBodyData data;

    /**
     * <p>The error message returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>The request parameters are invalid</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request, which can be used to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>00000000-0000-4000-8000-000000000001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateKnowledgeObjectUploadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeObjectUploadResponseBody self = new CreateKnowledgeObjectUploadResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeObjectUploadResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateKnowledgeObjectUploadResponseBody setData(CreateKnowledgeObjectUploadResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateKnowledgeObjectUploadResponseBodyData getData() {
        return this.data;
    }

    public CreateKnowledgeObjectUploadResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateKnowledgeObjectUploadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateKnowledgeObjectUploadResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateKnowledgeObjectUploadResponseBodyData extends TeaModel {
        /**
         * <p>The expiration time of the UploadUrl, represented as a UNIX timestamp in milliseconds. The maximum validity period is 30 minutes, subject to the upper limit of the OSS signature configuration and the remaining time of the session. This field prevails.</p>
         * 
         * <strong>example:</strong>
         * <p>1792456200000</p>
         */
        @NameInMap("ExpiresAt")
        public Long expiresAt;

        /**
         * <p>The HTTP headers that must be included in the direct upload request. The key is the actual header name, and the value is the header value.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Content-Type&quot;:&quot;text/plain&quot;,&quot;Content-MD5&quot;:&quot;1B2M2Y8AsgTpgAmY7PhCfg==&quot;}</p>
         */
        @NameInMap("RequiredHeaders")
        public java.util.Map<String, String> requiredHeaders;

        /**
         * <p>The identifier of the upload session to be consumed by document creation, model update, or model import tasks. This is not a KnowledgeObjectId or TaskId.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abd</p>
         */
        @NameInMap("UploadId")
        public String uploadId;

        /**
         * <p>The temporary direct upload URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.invalid/short-lived-upload">https://example.invalid/short-lived-upload</a></p>
         */
        @NameInMap("UploadUrl")
        public String uploadUrl;

        public static CreateKnowledgeObjectUploadResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeObjectUploadResponseBodyData self = new CreateKnowledgeObjectUploadResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeObjectUploadResponseBodyData setExpiresAt(Long expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public Long getExpiresAt() {
            return this.expiresAt;
        }

        public CreateKnowledgeObjectUploadResponseBodyData setRequiredHeaders(java.util.Map<String, String> requiredHeaders) {
            this.requiredHeaders = requiredHeaders;
            return this;
        }
        public java.util.Map<String, String> getRequiredHeaders() {
            return this.requiredHeaders;
        }

        public CreateKnowledgeObjectUploadResponseBodyData setUploadId(String uploadId) {
            this.uploadId = uploadId;
            return this;
        }
        public String getUploadId() {
            return this.uploadId;
        }

        public CreateKnowledgeObjectUploadResponseBodyData setUploadUrl(String uploadUrl) {
            this.uploadUrl = uploadUrl;
            return this;
        }
        public String getUploadUrl() {
            return this.uploadUrl;
        }

    }

}
