// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class GetSkillImportFileUrlResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetSkillImportFileUrlResponseBodyData data;

    @NameInMap("RequestId")
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
        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("MaxSize")
        public String maxSize;

        @NameInMap("OssObjectName")
        public String ossObjectName;

        @NameInMap("UploadUrl")
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
