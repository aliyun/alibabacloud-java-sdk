// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CreateCommitResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateCommitResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateCommitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCommitResponseBody self = new CreateCommitResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCommitResponseBody setData(CreateCommitResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateCommitResponseBodyData getData() {
        return this.data;
    }

    public CreateCommitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateCommitResponseBodyData extends TeaModel {
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

        public static CreateCommitResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateCommitResponseBodyData self = new CreateCommitResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateCommitResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateCommitResponseBodyData setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public CreateCommitResponseBodyData setCommitLog(String commitLog) {
            this.commitLog = commitLog;
            return this;
        }
        public String getCommitLog() {
            return this.commitLog;
        }

        public CreateCommitResponseBodyData setCommitType(String commitType) {
            this.commitType = commitType;
            return this;
        }
        public String getCommitType() {
            return this.commitType;
        }

        public CreateCommitResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateCommitResponseBodyData setMainModuleCommitId(String mainModuleCommitId) {
            this.mainModuleCommitId = mainModuleCommitId;
            return this;
        }
        public String getMainModuleCommitId() {
            return this.mainModuleCommitId;
        }

        public CreateCommitResponseBodyData setMainModuleId(String mainModuleId) {
            this.mainModuleId = mainModuleId;
            return this;
        }
        public String getMainModuleId() {
            return this.mainModuleId;
        }

        public CreateCommitResponseBodyData setModelDataPath(String modelDataPath) {
            this.modelDataPath = modelDataPath;
            return this;
        }
        public String getModelDataPath() {
            return this.modelDataPath;
        }

        public CreateCommitResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public CreateCommitResponseBodyData setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public CreateCommitResponseBodyData setResourceDataPath(String resourceDataPath) {
            this.resourceDataPath = resourceDataPath;
            return this;
        }
        public String getResourceDataPath() {
            return this.resourceDataPath;
        }

        public CreateCommitResponseBodyData setResourceDigest(java.util.Map<String, String> resourceDigest) {
            this.resourceDigest = resourceDigest;
            return this;
        }
        public java.util.Map<String, String> getResourceDigest() {
            return this.resourceDigest;
        }

        public CreateCommitResponseBodyData setRollbackToCommitId(String rollbackToCommitId) {
            this.rollbackToCommitId = rollbackToCommitId;
            return this;
        }
        public String getRollbackToCommitId() {
            return this.rollbackToCommitId;
        }

        public CreateCommitResponseBodyData setRollbackType(String rollbackType) {
            this.rollbackType = rollbackType;
            return this;
        }
        public String getRollbackType() {
            return this.rollbackType;
        }

        public CreateCommitResponseBodyData setSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

    }

}
