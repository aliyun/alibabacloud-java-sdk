// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDBTaskSQLJobDetailResponseBody extends TeaModel {
    /**
     * <p>The point in time when the SQL task ended.</p>
     */
    @NameInMap("DBTaskSQLJobDetailList")
    public java.util.List<ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList> DBTaskSQLJobDetailList;

    /**
     * <p>The type of the SQL statement, such as DELETE, UPDATE, or ALTER_TABLE.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The ID of the SQL task. You can call the [ListDBTaskSQLJob](~~207049~~) operation to query the SQL task ID.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The operation that you want to perform. Set the value to **ListDBTaskSQLJobDetail**.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The SQL statement that was executed in the SQL task.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListDBTaskSQLJobDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDBTaskSQLJobDetailResponseBody self = new ListDBTaskSQLJobDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDBTaskSQLJobDetailResponseBody setDBTaskSQLJobDetailList(java.util.List<ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList> DBTaskSQLJobDetailList) {
        this.DBTaskSQLJobDetailList = DBTaskSQLJobDetailList;
        return this;
    }
    public java.util.List<ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList> getDBTaskSQLJobDetailList() {
        return this.DBTaskSQLJobDetailList;
    }

    public ListDBTaskSQLJobDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDBTaskSQLJobDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDBTaskSQLJobDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDBTaskSQLJobDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDBTaskSQLJobDetailResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList extends TeaModel {
        @NameInMap("AffectRows")
        public Long affectRows;

        /**
         * <p>The duration of the SQL task. Unit: milliseconds.</p>
         */
        @NameInMap("CurrentSql")
        public String currentSql;

        /**
         * <p>The number of entries to return on each page.</p>
         */
        @NameInMap("DbId")
        public Long dbId;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The point in time when the SQL task started.</p>
         */
        @NameInMap("ExecuteCount")
        public Long executeCount;

        /**
         * <p>The ID of the SQL task.</p>
         */
        @NameInMap("JobDetailId")
        public Long jobDetailId;

        /**
         * <p>The number of the page to return.</p>
         */
        @NameInMap("JobId")
        public Long jobId;

        /**
         * <p>The details of the operational log.</p>
         */
        @NameInMap("Log")
        public String log;

        /**
         * <p>The details of SQL tasks.</p>
         */
        @NameInMap("Logic")
        public Boolean logic;

        /**
         * <p>The error message that is returned.</p>
         */
        @NameInMap("Skip")
        public Boolean skip;

        /**
         * <p>The ID of the details of the SQL task.</p>
         */
        @NameInMap("SqlType")
        public String sqlType;

        /**
         * <p>The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to query the tenant ID.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>Indicates whether the SQL statement was skipped. Valid values:</p>
         * <br>
         * <p>*   **true**: The SQL statement was skipped.</p>
         * <p>*   **false**: The SQL statement was not skipped.</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("TimeDelay")
        public Long timeDelay;

        public static ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList build(java.util.Map<String, ?> map) throws Exception {
            ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList self = new ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList();
            return TeaModel.build(map, self);
        }

        public ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList setAffectRows(Long affectRows) {
            this.affectRows = affectRows;
            return this;
        }
        public Long getAffectRows() {
            return this.affectRows;
        }

        public ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList setCurrentSql(String currentSql) {
            this.currentSql = currentSql;
            return this;
        }
        public String getCurrentSql() {
            return this.currentSql;
        }

        public ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList setExecuteCount(Long executeCount) {
            this.executeCount = executeCount;
            return this;
        }
        public Long getExecuteCount() {
            return this.executeCount;
        }

        public ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList setJobDetailId(Long jobDetailId) {
            this.jobDetailId = jobDetailId;
            return this;
        }
        public Long getJobDetailId() {
            return this.jobDetailId;
        }

        public ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList setLog(String log) {
            this.log = log;
            return this;
        }
        public String getLog() {
            return this.log;
        }

        public ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

        public ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList setSkip(Boolean skip) {
            this.skip = skip;
            return this;
        }
        public Boolean getSkip() {
            return this.skip;
        }

        public ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

        public ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList setTimeDelay(Long timeDelay) {
            this.timeDelay = timeDelay;
            return this;
        }
        public Long getTimeDelay() {
            return this.timeDelay;
        }

    }

}
