// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetAgentCodePackageDownloadUrlResponseBody extends TeaModel {
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
    public GetAgentCodePackageDownloadUrlResponseBodyData data;

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

    public static GetAgentCodePackageDownloadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentCodePackageDownloadUrlResponseBody self = new GetAgentCodePackageDownloadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentCodePackageDownloadUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgentCodePackageDownloadUrlResponseBody setData(GetAgentCodePackageDownloadUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentCodePackageDownloadUrlResponseBodyData getData() {
        return this.data;
    }

    public GetAgentCodePackageDownloadUrlResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAgentCodePackageDownloadUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAgentCodePackageDownloadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentCodePackageDownloadUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAgentCodePackageDownloadUrlResponseBodyData extends TeaModel {
        /**
         * <p>The CRC64 value of the code package object.</p>
         * 
         * <strong>example:</strong>
         * <p>456</p>
         */
        @NameInMap("crc64")
        public String crc64;

        /**
         * <p>The time-limited, read-only download URL for the code package.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://agentcore-platform-example.oss-cn-hangzhou.aliyuncs.com/code-packages/workspaces/ws-a1b2c3d4e5f6/550e8400-e29b-41d4-a716-446655440000/package.zip?OSSAccessKeyId=LTAI5tExample****&Expires=1792627800&Signature=ExampleSignature">https://agentcore-platform-example.oss-cn-hangzhou.aliyuncs.com/code-packages/workspaces/ws-a1b2c3d4e5f6/550e8400-e29b-41d4-a716-446655440000/package.zip?OSSAccessKeyId=LTAI5tExample****&amp;Expires=1792627800&amp;Signature=ExampleSignature</a>****</p>
         */
        @NameInMap("downloadUrl")
        public String downloadUrl;

        /**
         * <p>The ETag of the code package object.</p>
         * 
         * <strong>example:</strong>
         * <p>fixed-etag</p>
         */
        @NameInMap("etag")
        public String etag;

        /**
         * <p>The expiration time of the download URL.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-22T00:10:00Z</p>
         */
        @NameInMap("expiresAt")
        public String expiresAt;

        /**
         * <p>The original file name of the code package.</p>
         * 
         * <strong>example:</strong>
         * <p>main.zip</p>
         */
        @NameInMap("fileName")
        public String fileName;

        /**
         * <p>The compressed size of the code package.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("fileSize")
        public Long fileSize;

        /**
         * <p>The format of the code package.</p>
         * 
         * <strong>example:</strong>
         * <p>zip</p>
         */
        @NameInMap("format")
        public String format;

        /**
         * <p>The resource version ID corresponding to the currently saved configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("resourceVersionId")
        public String resourceVersionId;

        public static GetAgentCodePackageDownloadUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentCodePackageDownloadUrlResponseBodyData self = new GetAgentCodePackageDownloadUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentCodePackageDownloadUrlResponseBodyData setCrc64(String crc64) {
            this.crc64 = crc64;
            return this;
        }
        public String getCrc64() {
            return this.crc64;
        }

        public GetAgentCodePackageDownloadUrlResponseBodyData setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public GetAgentCodePackageDownloadUrlResponseBodyData setEtag(String etag) {
            this.etag = etag;
            return this;
        }
        public String getEtag() {
            return this.etag;
        }

        public GetAgentCodePackageDownloadUrlResponseBodyData setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public GetAgentCodePackageDownloadUrlResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetAgentCodePackageDownloadUrlResponseBodyData setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public GetAgentCodePackageDownloadUrlResponseBodyData setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public GetAgentCodePackageDownloadUrlResponseBodyData setResourceVersionId(String resourceVersionId) {
            this.resourceVersionId = resourceVersionId;
            return this;
        }
        public String getResourceVersionId() {
            return this.resourceVersionId;
        }

    }

}
