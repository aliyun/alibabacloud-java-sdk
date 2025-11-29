// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListSlowSQLRecordsResponseBody extends TeaModel {
    /**
     * <p>List of slow queries.</p>
     */
    @NameInMap("Items")
    public java.util.List<ListSlowSQLRecordsResponseBodyItems> items;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of log entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static ListSlowSQLRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSlowSQLRecordsResponseBody self = new ListSlowSQLRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSlowSQLRecordsResponseBody setItems(java.util.List<ListSlowSQLRecordsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListSlowSQLRecordsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListSlowSQLRecordsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSlowSQLRecordsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public ListSlowSQLRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSlowSQLRecordsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class ListSlowSQLRecordsResponseBodyItems extends TeaModel {
        /**
         * <p>The total CPU time (in milliseconds) consumed by the query execution.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("CpuTimeMs")
        public Long cpuTimeMs;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>adbpgadmin</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <p>Total execution time in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("DurationTime")
        public Integer durationTime;

        /**
         * <p>The total lock wait time (in milliseconds).</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("LockWaitTime")
        public Integer lockWaitTime;

        /**
         * <p>The total memory (in bytes) occupied by the query execution.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MemBytes")
        public Long memBytes;

        /**
         * <p>Execution optimizer.</p>
         * 
         * <strong>example:</strong>
         * <p>planner</p>
         */
        @NameInMap("Optimizer")
        public String optimizer;

        /**
         * <p>The end time of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-04T18:00:00Z</p>
         */
        @NameInMap("QueryEndTime")
        public String queryEndTime;

        /**
         * <p>The query ID. It is a unique identifier of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>7775338456746339025</p>
         */
        @NameInMap("QueryID")
        public String queryID;

        /**
         * <p>The start time of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-04T17:00:00Z</p>
         */
        @NameInMap("QueryStartTime")
        public String queryStartTime;

        /**
         * <p>The query queueing time (in milliseconds) in resource groups/queues.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("QueueWaitTime")
        public Integer queueWaitTime;

        /**
         * <p>The total size (in bytes) of the files generated by the query.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("SpillBytes")
        public Long spillBytes;

        /**
         * <p>SQL statements in audit logs.</p>
         * 
         * <strong>example:</strong>
         * <p>SHOW COLUMNS FROM <code>t_project</code></p>
         */
        @NameInMap("SqlText")
        public String sqlText;

        /**
         * <p>Indicates whether the SQL statement is truncated. Valid values:</p>
         * <ul>
         * <li>true: Truncated.</li>
         * <li>false: Not truncated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SqlTruncated")
        public String sqlTruncated;

        /**
         * <p>The threshold that is used to truncate the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SqlTruncatedThreshold")
        public Integer sqlTruncatedThreshold;

        /**
         * <p>The account that initiates the query.</p>
         * 
         * <strong>example:</strong>
         * <p>test_user</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static ListSlowSQLRecordsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListSlowSQLRecordsResponseBodyItems self = new ListSlowSQLRecordsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListSlowSQLRecordsResponseBodyItems setCpuTimeMs(Long cpuTimeMs) {
            this.cpuTimeMs = cpuTimeMs;
            return this;
        }
        public Long getCpuTimeMs() {
            return this.cpuTimeMs;
        }

        public ListSlowSQLRecordsResponseBodyItems setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public ListSlowSQLRecordsResponseBodyItems setDurationTime(Integer durationTime) {
            this.durationTime = durationTime;
            return this;
        }
        public Integer getDurationTime() {
            return this.durationTime;
        }

        public ListSlowSQLRecordsResponseBodyItems setLockWaitTime(Integer lockWaitTime) {
            this.lockWaitTime = lockWaitTime;
            return this;
        }
        public Integer getLockWaitTime() {
            return this.lockWaitTime;
        }

        public ListSlowSQLRecordsResponseBodyItems setMemBytes(Long memBytes) {
            this.memBytes = memBytes;
            return this;
        }
        public Long getMemBytes() {
            return this.memBytes;
        }

        public ListSlowSQLRecordsResponseBodyItems setOptimizer(String optimizer) {
            this.optimizer = optimizer;
            return this;
        }
        public String getOptimizer() {
            return this.optimizer;
        }

        public ListSlowSQLRecordsResponseBodyItems setQueryEndTime(String queryEndTime) {
            this.queryEndTime = queryEndTime;
            return this;
        }
        public String getQueryEndTime() {
            return this.queryEndTime;
        }

        public ListSlowSQLRecordsResponseBodyItems setQueryID(String queryID) {
            this.queryID = queryID;
            return this;
        }
        public String getQueryID() {
            return this.queryID;
        }

        public ListSlowSQLRecordsResponseBodyItems setQueryStartTime(String queryStartTime) {
            this.queryStartTime = queryStartTime;
            return this;
        }
        public String getQueryStartTime() {
            return this.queryStartTime;
        }

        public ListSlowSQLRecordsResponseBodyItems setQueueWaitTime(Integer queueWaitTime) {
            this.queueWaitTime = queueWaitTime;
            return this;
        }
        public Integer getQueueWaitTime() {
            return this.queueWaitTime;
        }

        public ListSlowSQLRecordsResponseBodyItems setSpillBytes(Long spillBytes) {
            this.spillBytes = spillBytes;
            return this;
        }
        public Long getSpillBytes() {
            return this.spillBytes;
        }

        public ListSlowSQLRecordsResponseBodyItems setSqlText(String sqlText) {
            this.sqlText = sqlText;
            return this;
        }
        public String getSqlText() {
            return this.sqlText;
        }

        public ListSlowSQLRecordsResponseBodyItems setSqlTruncated(String sqlTruncated) {
            this.sqlTruncated = sqlTruncated;
            return this;
        }
        public String getSqlTruncated() {
            return this.sqlTruncated;
        }

        public ListSlowSQLRecordsResponseBodyItems setSqlTruncatedThreshold(Integer sqlTruncatedThreshold) {
            this.sqlTruncatedThreshold = sqlTruncatedThreshold;
            return this;
        }
        public Integer getSqlTruncatedThreshold() {
            return this.sqlTruncatedThreshold;
        }

        public ListSlowSQLRecordsResponseBodyItems setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
