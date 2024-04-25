// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetPfsSqlSampleResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The SQL sample data.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetPfsSqlSampleResponseBodyData> data;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>>  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
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
         * <p>The number of internal on-disk temporary tables that were created when the SQL statement was executed.</p>
         */
        @NameInMap("CreateTmpDiskTables")
        public Integer createTmpDiskTables;

        /**
         * <p>The number of internal temporary tables that were created when the SQL statement was executed.</p>
         */
        @NameInMap("CreateTmpTables")
        public Integer createTmpTables;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("Db")
        public String db;

        /**
         * <p>The end ID of the event. By default, the value of this parameter is NULL when the event starts and is changed to the event ID when the event ends.</p>
         */
        @NameInMap("EndEventId")
        public Integer endEventId;

        /**
         * <p>The number of errors returned for the SQL statement.</p>
         */
        @NameInMap("Errors")
        public Integer errors;

        /**
         * <p>The event ID.</p>
         */
        @NameInMap("EventId")
        public Integer eventId;

        /**
         * <p>The name of the event.</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The execution duration. Unit: millisecond.</p>
         */
        @NameInMap("Latency")
        public Double latency;

        /**
         * <p>The lock wait duration. Unit: millisecond.</p>
         */
        @NameInMap("LockLatency")
        public Double lockLatency;

        /**
         * <p>The ID of the logical database.</p>
         */
        @NameInMap("LogicId")
        public String logicId;

        /**
         * <p>Indicates whether the server failed to find an index that can be used for the SQL statement. Valid values:</p>
         * <br>
         * <p>*   **1**: yes.</p>
         * <p>*   **0**: no.</p>
         */
        @NameInMap("NoGoodIndexUsed")
        public Integer noGoodIndexUsed;

        /**
         * <p>Indicates whether table scans were performed when indexes were not used. Valid values:</p>
         * <br>
         * <p>*   **1**: yes.</p>
         * <p>*   **0**: no.</p>
         */
        @NameInMap("NoIndexUsed")
        public Integer noIndexUsed;

        /**
         * <p>The node ID.</p>
         * <br>
         * <p>>  This parameter is returned only for ApsaraDB RDS for MySQL Cluster Edition instances or PolarDB for MySQL clusters.</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The number of rows affected by the SQL statement.</p>
         */
        @NameInMap("RowsAffected")
        public Integer rowsAffected;

        /**
         * <p>The number of rows scanned by the SQL statement.</p>
         */
        @NameInMap("RowsExamined")
        public Integer rowsExamined;

        /**
         * <p>The number of rows returned by the SQL statement.</p>
         */
        @NameInMap("RowsSent")
        public Integer rowsSent;

        /**
         * <p>The number of joins that are used to perform table scans without using indexes.</p>
         * <br>
         * <p>> : This parameter is used for the scenario in which indexes are not used in a union query. If the returned value is not 0, check the indexes of tables.</p>
         */
        @NameInMap("SelectFullJoin")
        public Integer selectFullJoin;

        /**
         * <p>The number of joins that used ranges on referenced tables.</p>
         */
        @NameInMap("SelectFullRangeJoin")
        public Integer selectFullRangeJoin;

        /**
         * <p>The number of joins that used ranges on the first table.</p>
         */
        @NameInMap("SelectRange")
        public Integer selectRange;

        /**
         * <p>The number of joins that did not have key values. The keys and values were checked for each row of data.</p>
         * <br>
         * <p>> : This parameter is used for the scenario in which indexes are not used in a union query. If the returned value is not 0, check the indexes of tables.</p>
         */
        @NameInMap("SelectRangeCheck")
        public Integer selectRangeCheck;

        /**
         * <p>The number of scans.</p>
         */
        @NameInMap("SelectScan")
        public Integer selectScan;

        /**
         * <p>The number of merges that the sorting algorithm must perform.</p>
         */
        @NameInMap("SortMergePasses")
        public Integer sortMergePasses;

        /**
         * <p>The number of times the data was sorted by using ranges.</p>
         */
        @NameInMap("SortRange")
        public Integer sortRange;

        /**
         * <p>The number of sorted rows.</p>
         */
        @NameInMap("SortRows")
        public Integer sortRows;

        /**
         * <p>The number of sorts that were performed during table scans.</p>
         */
        @NameInMap("SortScan")
        public Integer sortScan;

        /**
         * <p>The sample SQL statement.</p>
         */
        @NameInMap("Sql")
        public String sql;

        /**
         * <p>The SQL statement ID.</p>
         */
        @NameInMap("SqlId")
        public String sqlId;

        /**
         * <p>The thread ID.</p>
         */
        @NameInMap("ThreadId")
        public Integer threadId;

        /**
         * <p>The time when the SQL statement was executed. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The user ID.</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The number of warnings returned for the SQL statement.</p>
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
