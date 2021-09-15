// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetLatestCommitResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetLatestCommitResponseBodyData data;

    public static GetLatestCommitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLatestCommitResponseBody self = new GetLatestCommitResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLatestCommitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLatestCommitResponseBody setData(GetLatestCommitResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLatestCommitResponseBodyData getData() {
        return this.data;
    }

    public static class GetLatestCommitResponseBodyData extends TeaModel {
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

        @NameInMap("CommitLog")
        public String commitLog;

        public static GetLatestCommitResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLatestCommitResponseBodyData self = new GetLatestCommitResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLatestCommitResponseBodyData setCommitType(String commitType) {
            this.commitType = commitType;
            return this;
        }
        public String getCommitType() {
            return this.commitType;
        }

        public GetLatestCommitResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetLatestCommitResponseBodyData setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public GetLatestCommitResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetLatestCommitResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetLatestCommitResponseBodyData setRollbackToCommitId(String rollbackToCommitId) {
            this.rollbackToCommitId = rollbackToCommitId;
            return this;
        }
        public String getRollbackToCommitId() {
            return this.rollbackToCommitId;
        }

        public GetLatestCommitResponseBodyData setCommitLog(String commitLog) {
            this.commitLog = commitLog;
            return this;
        }
        public String getCommitLog() {
            return this.commitLog;
        }

    }

}
