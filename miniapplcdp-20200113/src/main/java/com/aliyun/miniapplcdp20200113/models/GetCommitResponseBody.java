// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetCommitResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetCommitResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetCommitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCommitResponseBody self = new GetCommitResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCommitResponseBody setData(GetCommitResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCommitResponseBodyData getData() {
        return this.data;
    }

    public GetCommitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCommitResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("CommitDigest")
        public String commitDigest;

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

        @NameInMap("ModelDigest")
        public java.util.Map<String, String> modelDigest;

        @NameInMap("ModelPack")
        public java.util.List<?> modelPack;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("ModuleId")
        public String moduleId;

        @NameInMap("ResourceDataPath")
        public String resourceDataPath;

        @NameInMap("ResourceDigest")
        public java.util.Map<String, String> resourceDigest;

        @NameInMap("ResourcePack")
        public java.util.List<java.util.Map<String, String>> resourcePack;

        @NameInMap("RollbackToCommitId")
        public String rollbackToCommitId;

        @NameInMap("RollbackType")
        public String rollbackType;

        @NameInMap("SchemaVersion")
        public String schemaVersion;

        public static GetCommitResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCommitResponseBodyData self = new GetCommitResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCommitResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetCommitResponseBodyData setCommitDigest(String commitDigest) {
            this.commitDigest = commitDigest;
            return this;
        }
        public String getCommitDigest() {
            return this.commitDigest;
        }

        public GetCommitResponseBodyData setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public GetCommitResponseBodyData setCommitLog(String commitLog) {
            this.commitLog = commitLog;
            return this;
        }
        public String getCommitLog() {
            return this.commitLog;
        }

        public GetCommitResponseBodyData setCommitType(String commitType) {
            this.commitType = commitType;
            return this;
        }
        public String getCommitType() {
            return this.commitType;
        }

        public GetCommitResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetCommitResponseBodyData setMainModuleCommitId(String mainModuleCommitId) {
            this.mainModuleCommitId = mainModuleCommitId;
            return this;
        }
        public String getMainModuleCommitId() {
            return this.mainModuleCommitId;
        }

        public GetCommitResponseBodyData setMainModuleId(String mainModuleId) {
            this.mainModuleId = mainModuleId;
            return this;
        }
        public String getMainModuleId() {
            return this.mainModuleId;
        }

        public GetCommitResponseBodyData setModelDataPath(String modelDataPath) {
            this.modelDataPath = modelDataPath;
            return this;
        }
        public String getModelDataPath() {
            return this.modelDataPath;
        }

        public GetCommitResponseBodyData setModelDigest(java.util.Map<String, String> modelDigest) {
            this.modelDigest = modelDigest;
            return this;
        }
        public java.util.Map<String, String> getModelDigest() {
            return this.modelDigest;
        }

        public GetCommitResponseBodyData setModelPack(java.util.List<?> modelPack) {
            this.modelPack = modelPack;
            return this;
        }
        public java.util.List<?> getModelPack() {
            return this.modelPack;
        }

        public GetCommitResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetCommitResponseBodyData setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public GetCommitResponseBodyData setResourceDataPath(String resourceDataPath) {
            this.resourceDataPath = resourceDataPath;
            return this;
        }
        public String getResourceDataPath() {
            return this.resourceDataPath;
        }

        public GetCommitResponseBodyData setResourceDigest(java.util.Map<String, String> resourceDigest) {
            this.resourceDigest = resourceDigest;
            return this;
        }
        public java.util.Map<String, String> getResourceDigest() {
            return this.resourceDigest;
        }

        public GetCommitResponseBodyData setResourcePack(java.util.List<java.util.Map<String, String>> resourcePack) {
            this.resourcePack = resourcePack;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getResourcePack() {
            return this.resourcePack;
        }

        public GetCommitResponseBodyData setRollbackToCommitId(String rollbackToCommitId) {
            this.rollbackToCommitId = rollbackToCommitId;
            return this;
        }
        public String getRollbackToCommitId() {
            return this.rollbackToCommitId;
        }

        public GetCommitResponseBodyData setRollbackType(String rollbackType) {
            this.rollbackType = rollbackType;
            return this;
        }
        public String getRollbackType() {
            return this.rollbackType;
        }

        public GetCommitResponseBodyData setSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

    }

}
