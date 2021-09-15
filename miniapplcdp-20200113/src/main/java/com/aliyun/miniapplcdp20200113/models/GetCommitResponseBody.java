// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetCommitResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetCommitResponseBodyData data;

    public static GetCommitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCommitResponseBody self = new GetCommitResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCommitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCommitResponseBody setData(GetCommitResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCommitResponseBodyData getData() {
        return this.data;
    }

    public static class GetCommitResponseBodyData extends TeaModel {
        @NameInMap("CommitType")
        public String commitType;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("CommitId")
        public String commitId;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("RollbackToCommitId")
        public String rollbackToCommitId;

        @NameInMap("AppModel")
        public java.util.Map<String, ?> appModel;

        @NameInMap("CommitLog")
        public String commitLog;

        @NameInMap("LogicModels")
        public java.util.List<java.util.Map<String, ?>> logicModels;

        @NameInMap("PageModels")
        public java.util.List<java.util.Map<String, ?>> pageModels;

        @NameInMap("DataModels")
        public java.util.List<java.util.Map<String, ?>> dataModels;

        public static GetCommitResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCommitResponseBodyData self = new GetCommitResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCommitResponseBodyData setCommitType(String commitType) {
            this.commitType = commitType;
            return this;
        }
        public String getCommitType() {
            return this.commitType;
        }

        public GetCommitResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetCommitResponseBodyData setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public GetCommitResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetCommitResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetCommitResponseBodyData setRollbackToCommitId(String rollbackToCommitId) {
            this.rollbackToCommitId = rollbackToCommitId;
            return this;
        }
        public String getRollbackToCommitId() {
            return this.rollbackToCommitId;
        }

        public GetCommitResponseBodyData setAppModel(java.util.Map<String, ?> appModel) {
            this.appModel = appModel;
            return this;
        }
        public java.util.Map<String, ?> getAppModel() {
            return this.appModel;
        }

        public GetCommitResponseBodyData setCommitLog(String commitLog) {
            this.commitLog = commitLog;
            return this;
        }
        public String getCommitLog() {
            return this.commitLog;
        }

        public GetCommitResponseBodyData setLogicModels(java.util.List<java.util.Map<String, ?>> logicModels) {
            this.logicModels = logicModels;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getLogicModels() {
            return this.logicModels;
        }

        public GetCommitResponseBodyData setPageModels(java.util.List<java.util.Map<String, ?>> pageModels) {
            this.pageModels = pageModels;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getPageModels() {
            return this.pageModels;
        }

        public GetCommitResponseBodyData setDataModels(java.util.List<java.util.Map<String, ?>> dataModels) {
            this.dataModels = dataModels;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getDataModels() {
            return this.dataModels;
        }

    }

}
