// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class DeleteCommitResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DeleteCommitResponseBodyData data;

    public static DeleteCommitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCommitResponseBody self = new DeleteCommitResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCommitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteCommitResponseBody setData(DeleteCommitResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteCommitResponseBodyData getData() {
        return this.data;
    }

    public static class DeleteCommitResponseBodyData extends TeaModel {
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

        public static DeleteCommitResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteCommitResponseBodyData self = new DeleteCommitResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteCommitResponseBodyData setCommitType(String commitType) {
            this.commitType = commitType;
            return this;
        }
        public String getCommitType() {
            return this.commitType;
        }

        public DeleteCommitResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DeleteCommitResponseBodyData setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public DeleteCommitResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DeleteCommitResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DeleteCommitResponseBodyData setRollbackToCommitId(String rollbackToCommitId) {
            this.rollbackToCommitId = rollbackToCommitId;
            return this;
        }
        public String getRollbackToCommitId() {
            return this.rollbackToCommitId;
        }

        public DeleteCommitResponseBodyData setCommitLog(String commitLog) {
            this.commitLog = commitLog;
            return this;
        }
        public String getCommitLog() {
            return this.commitLog;
        }

    }

}
