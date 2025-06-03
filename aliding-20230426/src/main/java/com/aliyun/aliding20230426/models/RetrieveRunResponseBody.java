// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class RetrieveRunResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("run")
    public RetrieveRunResponseBodyRun run;

    public static RetrieveRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetrieveRunResponseBody self = new RetrieveRunResponseBody();
        return TeaModel.build(map, self);
    }

    public RetrieveRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RetrieveRunResponseBody setRun(RetrieveRunResponseBodyRun run) {
        this.run = run;
        return this;
    }
    public RetrieveRunResponseBodyRun getRun() {
        return this.run;
    }

    public static class RetrieveRunResponseBodyRun extends TeaModel {
        @NameInMap("cancelledAt")
        public Long cancelledAt;

        @NameInMap("completedAt")
        public Long completedAt;

        @NameInMap("createAt")
        public Long createAt;

        @NameInMap("expiresAt")
        public Long expiresAt;

        @NameInMap("failedAt")
        public Long failedAt;

        @NameInMap("id")
        public String id;

        @NameInMap("lastErrorMsg")
        public String lastErrorMsg;

        @NameInMap("startedAt")
        public Long startedAt;

        @NameInMap("status")
        public String status;

        @NameInMap("threadId")
        public String threadId;

        public static RetrieveRunResponseBodyRun build(java.util.Map<String, ?> map) throws Exception {
            RetrieveRunResponseBodyRun self = new RetrieveRunResponseBodyRun();
            return TeaModel.build(map, self);
        }

        public RetrieveRunResponseBodyRun setCancelledAt(Long cancelledAt) {
            this.cancelledAt = cancelledAt;
            return this;
        }
        public Long getCancelledAt() {
            return this.cancelledAt;
        }

        public RetrieveRunResponseBodyRun setCompletedAt(Long completedAt) {
            this.completedAt = completedAt;
            return this;
        }
        public Long getCompletedAt() {
            return this.completedAt;
        }

        public RetrieveRunResponseBodyRun setCreateAt(Long createAt) {
            this.createAt = createAt;
            return this;
        }
        public Long getCreateAt() {
            return this.createAt;
        }

        public RetrieveRunResponseBodyRun setExpiresAt(Long expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public Long getExpiresAt() {
            return this.expiresAt;
        }

        public RetrieveRunResponseBodyRun setFailedAt(Long failedAt) {
            this.failedAt = failedAt;
            return this;
        }
        public Long getFailedAt() {
            return this.failedAt;
        }

        public RetrieveRunResponseBodyRun setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public RetrieveRunResponseBodyRun setLastErrorMsg(String lastErrorMsg) {
            this.lastErrorMsg = lastErrorMsg;
            return this;
        }
        public String getLastErrorMsg() {
            return this.lastErrorMsg;
        }

        public RetrieveRunResponseBodyRun setStartedAt(Long startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public Long getStartedAt() {
            return this.startedAt;
        }

        public RetrieveRunResponseBodyRun setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public RetrieveRunResponseBodyRun setThreadId(String threadId) {
            this.threadId = threadId;
            return this;
        }
        public String getThreadId() {
            return this.threadId;
        }

    }

}
