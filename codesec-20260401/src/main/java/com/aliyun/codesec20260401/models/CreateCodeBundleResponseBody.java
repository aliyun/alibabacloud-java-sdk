// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401.models;

import com.aliyun.tea.*;

public class CreateCodeBundleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("bundleVersion")
    public String bundleVersion;

    /**
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("codeBundleId")
    public Long codeBundleId;

    /**
     * <p>代码包创建时间（RFC3339）</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-27T00:53:46.774Z</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <strong>example:</strong>
     * <p>test-cases.zip</p>
     */
    @NameInMap("filename")
    public String filename;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("projectId")
    public Long projectId;

    /**
     * <strong>example:</strong>
     * <p>9A1F403F-0A85-5578-8B7C-55E3E9408659</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>pending</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>代码包更新时间（RFC3339）</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-27T00:53:46.774Z</p>
     */
    @NameInMap("updatedAt")
    public String updatedAt;

    @NameInMap("upload")
    public CreateCodeBundleResponseBodyUpload upload;

    public static CreateCodeBundleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCodeBundleResponseBody self = new CreateCodeBundleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCodeBundleResponseBody setBundleVersion(String bundleVersion) {
        this.bundleVersion = bundleVersion;
        return this;
    }
    public String getBundleVersion() {
        return this.bundleVersion;
    }

    public CreateCodeBundleResponseBody setCodeBundleId(Long codeBundleId) {
        this.codeBundleId = codeBundleId;
        return this;
    }
    public Long getCodeBundleId() {
        return this.codeBundleId;
    }

    public CreateCodeBundleResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CreateCodeBundleResponseBody setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

    public CreateCodeBundleResponseBody setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateCodeBundleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCodeBundleResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateCodeBundleResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public CreateCodeBundleResponseBody setUpload(CreateCodeBundleResponseBodyUpload upload) {
        this.upload = upload;
        return this;
    }
    public CreateCodeBundleResponseBodyUpload getUpload() {
        return this.upload;
    }

    public static class CreateCodeBundleResponseBodyUpload extends TeaModel {
        /**
         * <p>凭证过期时间（RFC3339）</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-03T05:58:47.88987539Z</p>
         */
        @NameInMap("expiresAt")
        public String expiresAt;

        /**
         * <p>HTTP method for the presigned URL.</p>
         * 
         * <strong>example:</strong>
         * <p>PUT</p>
         */
        @NameInMap("method")
        public String method;

        /**
         * <p>Presigned OSS PUT URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://codesec-beijing.oss-cn-beijing.aliyuncs.com/87766767%2F1001667%2F1004171.zip">https://codesec-beijing.oss-cn-beijing.aliyuncs.com/87766767%2F1001667%2F1004171.zip</a></p>
         */
        @NameInMap("putUrl")
        public String putUrl;

        /**
         * <p>Clients MUST send this <strong><code>Content-Type</code></strong> on PUT when <strong><code>put_url</code></strong> is set.</p>
         * 
         * <strong>example:</strong>
         * <p>application/octet-stream</p>
         */
        @NameInMap("requiredContentType")
        public String requiredContentType;

        public static CreateCodeBundleResponseBodyUpload build(java.util.Map<String, ?> map) throws Exception {
            CreateCodeBundleResponseBodyUpload self = new CreateCodeBundleResponseBodyUpload();
            return TeaModel.build(map, self);
        }

        public CreateCodeBundleResponseBodyUpload setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public CreateCodeBundleResponseBodyUpload setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public CreateCodeBundleResponseBodyUpload setPutUrl(String putUrl) {
            this.putUrl = putUrl;
            return this;
        }
        public String getPutUrl() {
            return this.putUrl;
        }

        public CreateCodeBundleResponseBodyUpload setRequiredContentType(String requiredContentType) {
            this.requiredContentType = requiredContentType;
            return this;
        }
        public String getRequiredContentType() {
            return this.requiredContentType;
        }

    }

}
