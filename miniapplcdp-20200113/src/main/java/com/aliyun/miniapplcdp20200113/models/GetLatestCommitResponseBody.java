// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetLatestCommitResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetLatestCommitResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetLatestCommitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLatestCommitResponseBody self = new GetLatestCommitResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLatestCommitResponseBody setData(GetLatestCommitResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLatestCommitResponseBodyData getData() {
        return this.data;
    }

    public GetLatestCommitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetLatestCommitResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("CommitId")
        public String commitId;

        @NameInMap("CommitLog")
        public String commitLog;

        @NameInMap("CommitType")
        public String commitType;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("MainModuleCommitId")
        public String mainModuleCommitId;

        @NameInMap("MainModuleId")
        public String mainModuleId;

        @NameInMap("ModelDataPath")
        public String modelDataPath;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("ModuleId")
        public String moduleId;

        @NameInMap("ResourceDataPath")
        public String resourceDataPath;

        @NameInMap("ResourceDigest")
        public java.util.Map<String, String> resourceDigest;

        @NameInMap("RollbackToCommitId")
        public String rollbackToCommitId;

        @NameInMap("RollbackType")
        public String rollbackType;

        @NameInMap("SchemaVersion")
        public String schemaVersion;

        public static GetLatestCommitResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLatestCommitResponseBodyData self = new GetLatestCommitResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLatestCommitResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetLatestCommitResponseBodyData setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public GetLatestCommitResponseBodyData setCommitLog(String commitLog) {
            this.commitLog = commitLog;
            return this;
        }
        public String getCommitLog() {
            return this.commitLog;
        }

        public GetLatestCommitResponseBodyData setCommitType(String commitType) {
            this.commitType = commitType;
            return this;
        }
        public String getCommitType() {
            return this.commitType;
        }

        public GetLatestCommitResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetLatestCommitResponseBodyData setMainModuleCommitId(String mainModuleCommitId) {
            this.mainModuleCommitId = mainModuleCommitId;
            return this;
        }
        public String getMainModuleCommitId() {
            return this.mainModuleCommitId;
        }

        public GetLatestCommitResponseBodyData setMainModuleId(String mainModuleId) {
            this.mainModuleId = mainModuleId;
            return this;
        }
        public String getMainModuleId() {
            return this.mainModuleId;
        }

        public GetLatestCommitResponseBodyData setModelDataPath(String modelDataPath) {
            this.modelDataPath = modelDataPath;
            return this;
        }
        public String getModelDataPath() {
            return this.modelDataPath;
        }

        public GetLatestCommitResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetLatestCommitResponseBodyData setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public GetLatestCommitResponseBodyData setResourceDataPath(String resourceDataPath) {
            this.resourceDataPath = resourceDataPath;
            return this;
        }
        public String getResourceDataPath() {
            return this.resourceDataPath;
        }

        public GetLatestCommitResponseBodyData setResourceDigest(java.util.Map<String, String> resourceDigest) {
            this.resourceDigest = resourceDigest;
            return this;
        }
        public java.util.Map<String, String> getResourceDigest() {
            return this.resourceDigest;
        }

        public GetLatestCommitResponseBodyData setRollbackToCommitId(String rollbackToCommitId) {
            this.rollbackToCommitId = rollbackToCommitId;
            return this;
        }
        public String getRollbackToCommitId() {
            return this.rollbackToCommitId;
        }

        public GetLatestCommitResponseBodyData setRollbackType(String rollbackType) {
            this.rollbackType = rollbackType;
            return this;
        }
        public String getRollbackType() {
            return this.rollbackType;
        }

        public GetLatestCommitResponseBodyData setSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

    }

}
