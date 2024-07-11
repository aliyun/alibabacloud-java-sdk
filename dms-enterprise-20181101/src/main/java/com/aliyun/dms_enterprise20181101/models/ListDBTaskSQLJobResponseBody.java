// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDBTaskSQLJobResponseBody extends TeaModel {
    /**
     * <p>The list of the SQL tasks.</p>
     */
    @NameInMap("DBTaskSQLJobList")
    public java.util.List<ListDBTaskSQLJobResponseBodyDBTaskSQLJobList> DBTaskSQLJobList;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F6C47680-8D2D-43A4-8902-F2740D71A398</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of the SQL tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListDBTaskSQLJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDBTaskSQLJobResponseBody self = new ListDBTaskSQLJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDBTaskSQLJobResponseBody setDBTaskSQLJobList(java.util.List<ListDBTaskSQLJobResponseBodyDBTaskSQLJobList> DBTaskSQLJobList) {
        this.DBTaskSQLJobList = DBTaskSQLJobList;
        return this;
    }
    public java.util.List<ListDBTaskSQLJobResponseBodyDBTaskSQLJobList> getDBTaskSQLJobList() {
        return this.DBTaskSQLJobList;
    }

    public ListDBTaskSQLJobResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDBTaskSQLJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
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

    public ListDBTaskSQLJobResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDBTaskSQLJobResponseBodyDBTaskSQLJobList extends TeaModel {
        /**
         * <p>The description of the SQL task.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The time when the SQL task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-18 17:49:20</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>43214523</p>
         */
        @NameInMap("DbId")
        public Long dbId;

        /**
         * <p>The name that is used to search for the database.</p>
         * 
         * <strong>example:</strong>
         * <p>test@xxx:3306【test】</p>
         */
        @NameInMap("DbSearchName")
        public String dbSearchName;

        /**
         * <p>The ID of the SQL task group.</p>
         * 
         * <strong>example:</strong>
         * <p>4324132</p>
         */
        @NameInMap("DbTaskGroupId")
        public Long dbTaskGroupId;

        /**
         * <p>The ID of the SQL task.</p>
         * 
         * <strong>example:</strong>
         * <p>123435</p>
         */
        @NameInMap("JobId")
        public Long jobId;

        /**
         * <p>The type of the SQL task.</p>
         * 
         * <strong>example:</strong>
         * <p>STRUCT_SYNC</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <p>The time when the SQL task was last executed.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-18 17:49:31</p>
         */
        @NameInMap("LastExecTime")
        public String lastExecTime;

        /**
         * <p>Indicates whether the database is a logical database. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The database is a logical database.</li>
         * <li><strong>false</strong>: The database is a logical database.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Logic")
        public Boolean logic;

        /**
         * <p>The state of the SQL task. Valid values:</p>
         * <ul>
         * <li><strong>INIT</strong>: The SQL task was initialized.</li>
         * <li><strong>PENDING</strong>: The SQL task waited to be run.</li>
         * <li><strong>BE_SCHEDULED</strong>: The SQL task waited to be scheduled.</li>
         * <li><strong>FAIL</strong>: The SQL task failed.</li>
         * <li><strong>SUCCESS</strong>: The SQL task was successful.</li>
         * <li><strong>PAUSE</strong>: The SQL task was paused.</li>
         * <li><strong>DELETE</strong>: The SQL task was deleted.</li>
         * <li><strong>RUNNING</strong>: The SQL task was being run.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Indicates whether the SQL task is executed as a transaction. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The SQL task is executed as a transaction.</li>
         * <li><strong>false</strong>: The SQL task is not executed as a transaction.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Transactional")
        public Boolean transactional;

        public static ListDBTaskSQLJobResponseBodyDBTaskSQLJobList build(java.util.Map<String, ?> map) throws Exception {
            ListDBTaskSQLJobResponseBodyDBTaskSQLJobList self = new ListDBTaskSQLJobResponseBodyDBTaskSQLJobList();
            return TeaModel.build(map, self);
        }

        public ListDBTaskSQLJobResponseBodyDBTaskSQLJobList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListDBTaskSQLJobResponseBodyDBTaskSQLJobList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDBTaskSQLJobResponseBodyDBTaskSQLJobList setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public ListDBTaskSQLJobResponseBodyDBTaskSQLJobList setDbSearchName(String dbSearchName) {
            this.dbSearchName = dbSearchName;
            return this;
        }
        public String getDbSearchName() {
            return this.dbSearchName;
        }

        public ListDBTaskSQLJobResponseBodyDBTaskSQLJobList setDbTaskGroupId(Long dbTaskGroupId) {
            this.dbTaskGroupId = dbTaskGroupId;
            return this;
        }
        public Long getDbTaskGroupId() {
            return this.dbTaskGroupId;
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

        public ListDBTaskSQLJobResponseBodyDBTaskSQLJobList setLastExecTime(String lastExecTime) {
            this.lastExecTime = lastExecTime;
            return this;
        }
        public String getLastExecTime() {
            return this.lastExecTime;
        }

        public ListDBTaskSQLJobResponseBodyDBTaskSQLJobList setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
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
