// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDBTaskSQLJobDetailResponseBody extends TeaModel {
    /**
     * <p>The details of SQL tasks.</p>
     */
    @NameInMap("DBTaskSQLJobDetailList")
    public java.util.List<ListDBTaskSQLJobDetailResponseBodyDBTaskSQLJobDetailList> DBTaskSQLJobDetailList;

    /**
     * <p>The error code that is returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message that is returned.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request is successful.</p>
     * <p>*   **false**: The request fails.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of SQL tasks.</p>
     */
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
        /**
         * <p>The number of rows affected by the SQL task.</p>
         */
        @NameInMap("AffectRows")
        public Long affectRows;

        /**
         * <p>The SQL statement that was executed in the SQL task.</p>
         */
        @NameInMap("CurrentSql")
        public String currentSql;

        /**
         * <p>The ID of the physical database.</p>
         */
        @NameInMap("DbId")
        public Long dbId;

        /**
         * <p>The point in time when the SQL task ended.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The number of times that the SQL statement was executed.</p>
         */
        @NameInMap("ExecuteCount")
        public Long executeCount;

        /**
         * <p>The ID of the details of the SQL task.</p>
         */
        @NameInMap("JobDetailId")
        public Long jobDetailId;

        /**
         * <p>The ID of the SQL task.</p>
         */
        @NameInMap("JobId")
        public Long jobId;

        /**
         * <p>The details of the operational log.</p>
         */
        @NameInMap("Log")
        public String log;

        /**
         * <p>Indicates whether the database is a logical database. Valid values:</p>
         * <br>
         * <p>*   **true**: The database is a logical database.</p>
         * <p>*   **false**: The database is a physical database.</p>
         */
        @NameInMap("Logic")
        public Boolean logic;

        /**
         * <p>Indicates whether the SQL statement was skipped. Valid values:</p>
         * <br>
         * <p>*   **true**: The SQL statement was skipped.</p>
         * <p>*   **false**: The SQL statement was not skipped.</p>
         */
        @NameInMap("Skip")
        public Boolean skip;

        /**
         * <p>The type of the SQL statement, such as DELETE, UPDATE, or ALTER_TABLE.</p>
         */
        @NameInMap("SqlType")
        public String sqlType;

        /**
         * <p>The point in time when the SQL task started.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the SQL task. Valid values:</p>
         * <br>
         * <p>*   **INIT**: The SQL task was initialized.</p>
         * <p>*   **PENDING**: The SQL task waited to be run.</p>
         * <p>*   **BE_SCHEDULED**: The SQL task waited to be scheduled.</p>
         * <p>*   **FAIL**: The SQL task failed.</p>
         * <p>*   **SUCCESS**: The SQL task was successful.</p>
         * <p>*   **PAUSE**: The SQL task was paused.</p>
         * <p>*   **DELETE**: The SQL task was deleted.</p>
         * <p>*   **RUNNING**: The SQL task was being run.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The duration of the SQL task. Unit: milliseconds.</p>
         */
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
