// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CreateCommitResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CreateCommitResponseBodyData data;

    public static CreateCommitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCommitResponseBody self = new CreateCommitResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCommitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCommitResponseBody setData(CreateCommitResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateCommitResponseBodyData getData() {
        return this.data;
    }

    public static class CreateCommitResponseBodyData extends TeaModel {
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

        public static CreateCommitResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateCommitResponseBodyData self = new CreateCommitResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateCommitResponseBodyData setCommitType(String commitType) {
            this.commitType = commitType;
            return this;
        }
        public String getCommitType() {
            return this.commitType;
        }

        public CreateCommitResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public CreateCommitResponseBodyData setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public CreateCommitResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateCommitResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateCommitResponseBodyData setRollbackToCommitId(String rollbackToCommitId) {
            this.rollbackToCommitId = rollbackToCommitId;
            return this;
        }
        public String getRollbackToCommitId() {
            return this.rollbackToCommitId;
        }

        public CreateCommitResponseBodyData setCommitLog(String commitLog) {
            this.commitLog = commitLog;
            return this;
        }
        public String getCommitLog() {
            return this.commitLog;
        }

    }

}
