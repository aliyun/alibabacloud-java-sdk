// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetAgentSpecImportFileUrlResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public GetAgentSpecImportFileUrlResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-47A8-90AB-CDEF12345678</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetAgentSpecImportFileUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentSpecImportFileUrlResponseBody self = new GetAgentSpecImportFileUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentSpecImportFileUrlResponseBody setData(GetAgentSpecImportFileUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentSpecImportFileUrlResponseBodyData getData() {
        return this.data;
    }

    public GetAgentSpecImportFileUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAgentSpecImportFileUrlResponseBodyData extends TeaModel {
        /**
         * <p>The Content-Type used for the OSS PUT request.</p>
         * 
         * <strong>example:</strong>
         * <p>application/zip</p>
         */
        @NameInMap("contentType")
        public String contentType;

        /**
         * <p>The maximum number of bytes allowed for the upload.</p>
         * 
         * <strong>example:</strong>
         * <p>10485760</p>
         */
        @NameInMap("maxSize")
        public String maxSize;

        /**
         * <p>The OSS object name.</p>
         * 
         * <strong>example:</strong>
         * <p>imports/example.zip</p>
         */
        @NameInMap("ossObjectName")
        public String ossObjectName;

        /**
         * <p>The OSS pre-signed upload URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/artifacts/example.zip">https://example.com/artifacts/example.zip</a></p>
         */
        @NameInMap("uploadUrl")
        public String uploadUrl;

        public static GetAgentSpecImportFileUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentSpecImportFileUrlResponseBodyData self = new GetAgentSpecImportFileUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentSpecImportFileUrlResponseBodyData setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public GetAgentSpecImportFileUrlResponseBodyData setMaxSize(String maxSize) {
            this.maxSize = maxSize;
            return this;
        }
        public String getMaxSize() {
            return this.maxSize;
        }

        public GetAgentSpecImportFileUrlResponseBodyData setOssObjectName(String ossObjectName) {
            this.ossObjectName = ossObjectName;
            return this;
        }
        public String getOssObjectName() {
            return this.ossObjectName;
        }

        public GetAgentSpecImportFileUrlResponseBodyData setUploadUrl(String uploadUrl) {
            this.uploadUrl = uploadUrl;
            return this;
        }
        public String getUploadUrl() {
            return this.uploadUrl;
        }

    }

}
