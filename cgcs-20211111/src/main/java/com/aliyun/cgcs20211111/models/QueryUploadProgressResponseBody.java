// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class QueryUploadProgressResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryUploadProgressResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryUploadProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUploadProgressResponseBody self = new QueryUploadProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUploadProgressResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryUploadProgressResponseBody setData(QueryUploadProgressResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryUploadProgressResponseBodyData getData() {
        return this.data;
    }

    public QueryUploadProgressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryUploadProgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryUploadProgressResponseBodyDataContentVersions extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("Progress")
        public Double progress;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("VersionId")
        public String versionId;

        public static QueryUploadProgressResponseBodyDataContentVersions build(java.util.Map<String, ?> map) throws Exception {
            QueryUploadProgressResponseBodyDataContentVersions self = new QueryUploadProgressResponseBodyDataContentVersions();
            return TeaModel.build(map, self);
        }

        public QueryUploadProgressResponseBodyDataContentVersions setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryUploadProgressResponseBodyDataContentVersions setProgress(Double progress) {
            this.progress = progress;
            return this;
        }
        public Double getProgress() {
            return this.progress;
        }

        public QueryUploadProgressResponseBodyDataContentVersions setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public QueryUploadProgressResponseBodyDataContentVersions setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

    public static class QueryUploadProgressResponseBodyDataContent extends TeaModel {
        @NameInMap("Versions")
        public java.util.List<QueryUploadProgressResponseBodyDataContentVersions> versions;

        public static QueryUploadProgressResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            QueryUploadProgressResponseBodyDataContent self = new QueryUploadProgressResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public QueryUploadProgressResponseBodyDataContent setVersions(java.util.List<QueryUploadProgressResponseBodyDataContentVersions> versions) {
            this.versions = versions;
            return this;
        }
        public java.util.List<QueryUploadProgressResponseBodyDataContentVersions> getVersions() {
            return this.versions;
        }

    }

    public static class QueryUploadProgressResponseBodyData extends TeaModel {
        // 查询结果
        @NameInMap("Code")
        public String code;

        // 进度信息
        @NameInMap("Content")
        public QueryUploadProgressResponseBodyDataContent content;

        // 查询信息
        @NameInMap("Message")
        public String message;

        public static QueryUploadProgressResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryUploadProgressResponseBodyData self = new QueryUploadProgressResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryUploadProgressResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryUploadProgressResponseBodyData setContent(QueryUploadProgressResponseBodyDataContent content) {
            this.content = content;
            return this;
        }
        public QueryUploadProgressResponseBodyDataContent getContent() {
            return this.content;
        }

        public QueryUploadProgressResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
