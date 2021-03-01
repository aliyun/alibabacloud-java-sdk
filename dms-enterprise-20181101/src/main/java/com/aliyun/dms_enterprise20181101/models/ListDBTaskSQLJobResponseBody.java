// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDBTaskSQLJobResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("DBTaskSQLJobList")
    public java.util.List<ListDBTaskSQLJobResponseBodyDBTaskSQLJobList> DBTaskSQLJobList;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListDBTaskSQLJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDBTaskSQLJobResponseBody self = new ListDBTaskSQLJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDBTaskSQLJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDBTaskSQLJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDBTaskSQLJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDBTaskSQLJobResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDBTaskSQLJobResponseBody setDBTaskSQLJobList(java.util.List<ListDBTaskSQLJobResponseBodyDBTaskSQLJobList> DBTaskSQLJobList) {
        this.DBTaskSQLJobList = DBTaskSQLJobList;
        return this;
    }
    public java.util.List<ListDBTaskSQLJobResponseBodyDBTaskSQLJobList> getDBTaskSQLJobList() {
        return this.DBTaskSQLJobList;
    }

    public ListDBTaskSQLJobResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDBTaskSQLJobResponseBodyDBTaskSQLJobList extends TeaModel {
        @NameInMap("JobId")
        public Long jobId;

        @NameInMap("JobType")
        public String jobType;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("DbSearchName")
        public String dbSearchName;

        @NameInMap("DbId")
        public Long dbId;

        @NameInMap("Logic")
        public Boolean logic;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("LastExecTime")
        public String lastExecTime;

        @NameInMap("DbTaskGroupId")
        public Long dbTaskGroupId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Transactional")
        public Boolean transactional;

        public static ListDBTaskSQLJobResponseBodyDBTaskSQLJobList build(java.util.Map<String, ?> map) throws Exception {
            ListDBTaskSQLJobResponseBodyDBTaskSQLJobList self = new ListDBTaskSQLJobResponseBodyDBTaskSQLJobList();
            return TeaModel.build(map, self);
        }

        public ListDBTaskSQLJobResponseBodyDBTaskSQLJobList setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public ListDBTaskSQLJobResponseBodyDBTaskSQLJobList setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public ListDBTaskSQLJobResponseBodyDBTaskSQLJobList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListDBTaskSQLJobResponseBodyDBTaskSQLJobList setDbSearchName(String dbSearchName) {
            this.dbSearchName = dbSearchName;
            return this;
        }
        public String getDbSearchName() {
            return this.dbSearchName;
        }

        public ListDBTaskSQLJobResponseBodyDBTaskSQLJobList setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public ListDBTaskSQLJobResponseBodyDBTaskSQLJobList setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

        public ListDBTaskSQLJobResponseBodyDBTaskSQLJobList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDBTaskSQLJobResponseBodyDBTaskSQLJobList setLastExecTime(String lastExecTime) {
            this.lastExecTime = lastExecTime;
            return this;
        }
        public String getLastExecTime() {
            return this.lastExecTime;
        }

        public ListDBTaskSQLJobResponseBodyDBTaskSQLJobList setDbTaskGroupId(Long dbTaskGroupId) {
            this.dbTaskGroupId = dbTaskGroupId;
            return this;
        }
        public Long getDbTaskGroupId() {
            return this.dbTaskGroupId;
        }

        public ListDBTaskSQLJobResponseBodyDBTaskSQLJobList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDBTaskSQLJobResponseBodyDBTaskSQLJobList setTransactional(Boolean transactional) {
            this.transactional = transactional;
            return this;
        }
        public Boolean getTransactional() {
            return this.transactional;
        }

    }

}
