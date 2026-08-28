// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetSkillImportFileUrlResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public GetSkillImportFileUrlResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-47A8-90AB-CDEF12345678</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetSkillImportFileUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSkillImportFileUrlResponseBody self = new GetSkillImportFileUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSkillImportFileUrlResponseBody setData(GetSkillImportFileUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSkillImportFileUrlResponseBodyData getData() {
        return this.data;
    }

    public GetSkillImportFileUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSkillImportFileUrlResponseBodyData extends TeaModel {
        /**
         * <p>The Content-Type of the upload file.</p>
         * 
         * <strong>example:</strong>
         * <p>application/zip</p>
         */
        @NameInMap("contentType")
        public String contentType;

        /**
         * <p>The maximum file size allowed for upload, in bytes.</p>
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

        public static GetSkillImportFileUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSkillImportFileUrlResponseBodyData self = new GetSkillImportFileUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSkillImportFileUrlResponseBodyData setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public GetSkillImportFileUrlResponseBodyData setMaxSize(String maxSize) {
            this.maxSize = maxSize;
            return this;
        }
        public String getMaxSize() {
            return this.maxSize;
        }

        public GetSkillImportFileUrlResponseBodyData setOssObjectName(String ossObjectName) {
            this.ossObjectName = ossObjectName;
            return this;
        }
        public String getOssObjectName() {
            return this.ossObjectName;
        }

        public GetSkillImportFileUrlResponseBodyData setUploadUrl(String uploadUrl) {
            this.uploadUrl = uploadUrl;
            return this;
        }
        public String getUploadUrl() {
            return this.uploadUrl;
        }

    }

}
