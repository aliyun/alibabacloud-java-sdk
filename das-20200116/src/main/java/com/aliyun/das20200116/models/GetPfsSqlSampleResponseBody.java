// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetPfsSqlSampleResponseBody extends TeaModel {
    /**
     * <p>The returned status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The returned SQL sample data.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetPfsSqlSampleResponseBodyData> data;

    /**
     * <p>The message returned for the request.</p>
     * <blockquote>
     * <p>If the request is successful, <strong>Successful</strong> is returned. If the request fails, an error message such as an error code is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9CB97BC4-6479-55D0-B9D0-EA925AFE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetPfsSqlSampleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPfsSqlSampleResponseBody self = new GetPfsSqlSampleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPfsSqlSampleResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetPfsSqlSampleResponseBody setData(java.util.List<GetPfsSqlSampleResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetPfsSqlSampleResponseBodyData> getData() {
        return this.data;
    }

    public GetPfsSqlSampleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPfsSqlSampleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPfsSqlSampleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPfsSqlSampleResponseBodyData extends TeaModel {
        /**
         * <p>The number of on-disk internal temporary tables created during statement execution.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CreateTmpDiskTables")
        public Integer createTmpDiskTables;

        /**
         * <p>The number of internal temporary tables created during statement execution.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CreateTmpTables")
        public Integer createTmpTables;

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>testDB</p>
         */
        @NameInMap("Db")
        public String db;

        /**
         * <p>The end event ID. This parameter is NULL by default when the event starts and is updated to the current event ID of the thread when the event ends.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("EndEventId")
        public Integer endEventId;

        /**
         * <p>The number of errors in the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Errors")
        public Integer errors;

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>63735293</p>
         */
        @NameInMap("EventId")
        public Integer eventId;

        /**
         * <p>The event name.</p>
         * 
         * <strong>example:</strong>
         * <p>statement/sql/select</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze1jdv45i7l6****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The execution duration, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0.199</p>
         */
        @NameInMap("Latency")
        public Double latency;

        /**
         * <p>The lock wait time, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0.09</p>
         */
        @NameInMap("LockLatency")
        public Double lockLatency;

        /**
         * <p>The logical database ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx</p>
         */
        @NameInMap("LogicId")
        public String logicId;

        /**
         * <p>Indicates whether the server could not find a good index to use for the statement. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Yes.</li>
         * <li><strong>0</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NoGoodIndexUsed")
        public Integer noGoodIndexUsed;

        /**
         * <p>Indicates whether the statement performed a table scan without using an index. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Yes.</li>
         * <li><strong>0</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NoIndexUsed")
        public Integer noIndexUsed;

        /**
         * <p>The node ID.</p>
         * <blockquote>
         * <p>This parameter is returned only for ApsaraDB RDS for MySQL Cluster Edition instances or PolarDB for MySQL clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>r-x****-db-0</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The number of affected rows.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RowsAffected")
        public Integer rowsAffected;

        /**
         * <p>The number of scanned rows.</p>
         * 
         * <strong>example:</strong>
         * <p>2048576</p>
         */
        @NameInMap("RowsExamined")
        public Integer rowsExamined;

        /**
         * <p>The number of rows returned by the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RowsSent")
        public Integer rowsSent;

        /**
         * <p>The number of joins that perform table scans without using indexes.</p>
         * <blockquote>
         * <p>Notice: This parameter counts the joins that do not use indexes during a join query. If the value is not 0, check the table indexes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SelectFullJoin")
        public Integer selectFullJoin;

        /**
         * <p>The number of joins that use a range search on a reference table.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SelectFullRangeJoin")
        public Integer selectFullRangeJoin;

        /**
         * <p>The number of joins that use a range on the first table.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SelectRange")
        public Integer selectRange;

        /**
         * <p>The number of joins without keys that check for key usage after each row.</p>
         * <blockquote>
         * <p>Notice: This parameter counts the joins that do not use indexes during a join query. If the value is not 0, check the table indexes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SelectRangeCheck")
        public Integer selectRangeCheck;

        /**
         * <p>The number of scans.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SelectScan")
        public Integer selectScan;

        /**
         * <p>The number of merge passes that the sort algorithm must perform.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SortMergePasses")
        public Integer sortMergePasses;

        /**
         * <p>The number of sorts that use a range.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SortRange")
        public Integer sortRange;

        /**
         * <p>The number of sorted rows.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SortRows")
        public Integer sortRows;

        /**
         * <p>The number of sort scans.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SortScan")
        public Integer sortScan;

        /**
         * <p>The SQL sample.</p>
         * 
         * <strong>example:</strong>
         * <p>select * from xxxx where ****</p>
         */
        @NameInMap("Sql")
        public String sql;

        /**
         * <p>The SQL ID.</p>
         * 
         * <strong>example:</strong>
         * <p>651b56fe9418d48edb8fdf0980ec****</p>
         */
        @NameInMap("SqlId")
        public String sqlId;

        /**
         * <p>The thread ID.</p>
         * 
         * <strong>example:</strong>
         * <p>81751940</p>
         */
        @NameInMap("ThreadId")
        public Integer threadId;

        /**
         * <p>The time when the SQL statement was executed. The time is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1660100753556</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>196278346919****</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The number of warnings for the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Warnings")
        public Integer warnings;

        public static GetPfsSqlSampleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPfsSqlSampleResponseBodyData self = new GetPfsSqlSampleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPfsSqlSampleResponseBodyData setCreateTmpDiskTables(Integer createTmpDiskTables) {
            this.createTmpDiskTables = createTmpDiskTables;
            return this;
        }
        public Integer getCreateTmpDiskTables() {
            return this.createTmpDiskTables;
        }

        public GetPfsSqlSampleResponseBodyData setCreateTmpTables(Integer createTmpTables) {
            this.createTmpTables = createTmpTables;
            return this;
        }
        public Integer getCreateTmpTables() {
            return this.createTmpTables;
        }

        public GetPfsSqlSampleResponseBodyData setDb(String db) {
            this.db = db;
            return this;
        }
        public String getDb() {
            return this.db;
        }

        public GetPfsSqlSampleResponseBodyData setEndEventId(Integer endEventId) {
            this.endEventId = endEventId;
            return this;
        }
        public Integer getEndEventId() {
            return this.endEventId;
        }

        public GetPfsSqlSampleResponseBodyData setErrors(Integer errors) {
            this.errors = errors;
            return this;
        }
        public Integer getErrors() {
            return this.errors;
        }

        public GetPfsSqlSampleResponseBodyData setEventId(Integer eventId) {
            this.eventId = eventId;
            return this;
        }
        public Integer getEventId() {
            return this.eventId;
        }

        public GetPfsSqlSampleResponseBodyData setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public GetPfsSqlSampleResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetPfsSqlSampleResponseBodyData setLatency(Double latency) {
            this.latency = latency;
            return this;
        }
        public Double getLatency() {
            return this.latency;
        }

        public GetPfsSqlSampleResponseBodyData setLockLatency(Double lockLatency) {
            this.lockLatency = lockLatency;
            return this;
        }
        public Double getLockLatency() {
            return this.lockLatency;
        }

        public GetPfsSqlSampleResponseBodyData setLogicId(String logicId) {
            this.logicId = logicId;
            return this;
        }
        public String getLogicId() {
            return this.logicId;
        }

        public GetPfsSqlSampleResponseBodyData setNoGoodIndexUsed(Integer noGoodIndexUsed) {
            this.noGoodIndexUsed = noGoodIndexUsed;
            return this;
        }
        public Integer getNoGoodIndexUsed() {
            return this.noGoodIndexUsed;
        }

        public GetPfsSqlSampleResponseBodyData setNoIndexUsed(Integer noIndexUsed) {
            this.noIndexUsed = noIndexUsed;
            return this;
        }
        public Integer getNoIndexUsed() {
            return this.noIndexUsed;
        }

        public GetPfsSqlSampleResponseBodyData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetPfsSqlSampleResponseBodyData setRowsAffected(Integer rowsAffected) {
            this.rowsAffected = rowsAffected;
            return this;
        }
        public Integer getRowsAffected() {
            return this.rowsAffected;
        }

        public GetPfsSqlSampleResponseBodyData setRowsExamined(Integer rowsExamined) {
            this.rowsExamined = rowsExamined;
            return this;
        }
        public Integer getRowsExamined() {
            return this.rowsExamined;
        }

        public GetPfsSqlSampleResponseBodyData setRowsSent(Integer rowsSent) {
            this.rowsSent = rowsSent;
            return this;
        }
        public Integer getRowsSent() {
            return this.rowsSent;
        }

        public GetPfsSqlSampleResponseBodyData setSelectFullJoin(Integer selectFullJoin) {
            this.selectFullJoin = selectFullJoin;
            return this;
        }
        public Integer getSelectFullJoin() {
            return this.selectFullJoin;
        }

        public GetPfsSqlSampleResponseBodyData setSelectFullRangeJoin(Integer selectFullRangeJoin) {
            this.selectFullRangeJoin = selectFullRangeJoin;
            return this;
        }
        public Integer getSelectFullRangeJoin() {
            return this.selectFullRangeJoin;
        }

        public GetPfsSqlSampleResponseBodyData setSelectRange(Integer selectRange) {
            this.selectRange = selectRange;
            return this;
        }
        public Integer getSelectRange() {
            return this.selectRange;
        }

        public GetPfsSqlSampleResponseBodyData setSelectRangeCheck(Integer selectRangeCheck) {
            this.selectRangeCheck = selectRangeCheck;
            return this;
        }
        public Integer getSelectRangeCheck() {
            return this.selectRangeCheck;
        }

        public GetPfsSqlSampleResponseBodyData setSelectScan(Integer selectScan) {
            this.selectScan = selectScan;
            return this;
        }
        public Integer getSelectScan() {
            return this.selectScan;
        }

        public GetPfsSqlSampleResponseBodyData setSortMergePasses(Integer sortMergePasses) {
            this.sortMergePasses = sortMergePasses;
            return this;
        }
        public Integer getSortMergePasses() {
            return this.sortMergePasses;
        }

        public GetPfsSqlSampleResponseBodyData setSortRange(Integer sortRange) {
            this.sortRange = sortRange;
            return this;
        }
        public Integer getSortRange() {
            return this.sortRange;
        }

        public GetPfsSqlSampleResponseBodyData setSortRows(Integer sortRows) {
            this.sortRows = sortRows;
            return this;
        }
        public Integer getSortRows() {
            return this.sortRows;
        }

        public GetPfsSqlSampleResponseBodyData setSortScan(Integer sortScan) {
            this.sortScan = sortScan;
            return this;
        }
        public Integer getSortScan() {
            return this.sortScan;
        }

        public GetPfsSqlSampleResponseBodyData setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

        public GetPfsSqlSampleResponseBodyData setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public GetPfsSqlSampleResponseBodyData setThreadId(Integer threadId) {
            this.threadId = threadId;
            return this;
        }
        public Integer getThreadId() {
            return this.threadId;
        }

        public GetPfsSqlSampleResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetPfsSqlSampleResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetPfsSqlSampleResponseBodyData setWarnings(Integer warnings) {
            this.warnings = warnings;
            return this;
        }
        public Integer getWarnings() {
            return this.warnings;
        }

    }

}
