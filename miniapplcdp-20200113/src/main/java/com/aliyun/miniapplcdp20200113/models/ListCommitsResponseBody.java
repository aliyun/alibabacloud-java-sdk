// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListCommitsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListCommitsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListCommitsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCommitsResponseBody self = new ListCommitsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCommitsResponseBody setData(ListCommitsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCommitsResponseBodyData getData() {
        return this.data;
    }

    public ListCommitsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCommitsResponseBodyDataItems extends TeaModel {
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

        public static ListCommitsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListCommitsResponseBodyDataItems self = new ListCommitsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListCommitsResponseBodyDataItems setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListCommitsResponseBodyDataItems setCommitDigest(String commitDigest) {
            this.commitDigest = commitDigest;
            return this;
        }
        public String getCommitDigest() {
            return this.commitDigest;
        }

        public ListCommitsResponseBodyDataItems setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public ListCommitsResponseBodyDataItems setCommitLog(String commitLog) {
            this.commitLog = commitLog;
            return this;
        }
        public String getCommitLog() {
            return this.commitLog;
        }

        public ListCommitsResponseBodyDataItems setCommitType(String commitType) {
            this.commitType = commitType;
            return this;
        }
        public String getCommitType() {
            return this.commitType;
        }

        public ListCommitsResponseBodyDataItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListCommitsResponseBodyDataItems setMainModuleCommitId(String mainModuleCommitId) {
            this.mainModuleCommitId = mainModuleCommitId;
            return this;
        }
        public String getMainModuleCommitId() {
            return this.mainModuleCommitId;
        }

        public ListCommitsResponseBodyDataItems setMainModuleId(String mainModuleId) {
            this.mainModuleId = mainModuleId;
            return this;
        }
        public String getMainModuleId() {
            return this.mainModuleId;
        }

        public ListCommitsResponseBodyDataItems setModelDataPath(String modelDataPath) {
            this.modelDataPath = modelDataPath;
            return this;
        }
        public String getModelDataPath() {
            return this.modelDataPath;
        }

        public ListCommitsResponseBodyDataItems setModelDigest(java.util.Map<String, String> modelDigest) {
            this.modelDigest = modelDigest;
            return this;
        }
        public java.util.Map<String, String> getModelDigest() {
            return this.modelDigest;
        }

        public ListCommitsResponseBodyDataItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListCommitsResponseBodyDataItems setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public ListCommitsResponseBodyDataItems setResourceDataPath(String resourceDataPath) {
            this.resourceDataPath = resourceDataPath;
            return this;
        }
        public String getResourceDataPath() {
            return this.resourceDataPath;
        }

        public ListCommitsResponseBodyDataItems setResourceDigest(java.util.Map<String, String> resourceDigest) {
            this.resourceDigest = resourceDigest;
            return this;
        }
        public java.util.Map<String, String> getResourceDigest() {
            return this.resourceDigest;
        }

        public ListCommitsResponseBodyDataItems setRollbackToCommitId(String rollbackToCommitId) {
            this.rollbackToCommitId = rollbackToCommitId;
            return this;
        }
        public String getRollbackToCommitId() {
            return this.rollbackToCommitId;
        }

        public ListCommitsResponseBodyDataItems setRollbackType(String rollbackType) {
            this.rollbackType = rollbackType;
            return this;
        }
        public String getRollbackType() {
            return this.rollbackType;
        }

        public ListCommitsResponseBodyDataItems setSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

    }

    public static class ListCommitsResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListCommitsResponseBodyDataItems> items;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCommitsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCommitsResponseBodyData self = new ListCommitsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCommitsResponseBodyData setItems(java.util.List<ListCommitsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListCommitsResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListCommitsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCommitsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCommitsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
