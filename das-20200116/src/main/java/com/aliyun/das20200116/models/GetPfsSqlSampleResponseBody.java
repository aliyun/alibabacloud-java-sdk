// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetPfsSqlSampleResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public java.util.List<GetPfsSqlSampleResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CreateTmpDiskTables")
        public Integer createTmpDiskTables;

        @NameInMap("CreateTmpTables")
        public Integer createTmpTables;

        @NameInMap("Db")
        public String db;

        @NameInMap("EndEventId")
        public Integer endEventId;

        @NameInMap("Errors")
        public Integer errors;

        @NameInMap("EventId")
        public Integer eventId;

        @NameInMap("EventName")
        public String eventName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Latency")
        public Double latency;

        @NameInMap("LockLatency")
        public Double lockLatency;

        @NameInMap("LogicId")
        public String logicId;

        @NameInMap("NoGoodIndexUsed")
        public Integer noGoodIndexUsed;

        @NameInMap("NoIndexUsed")
        public Integer noIndexUsed;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("RowsAffected")
        public Integer rowsAffected;

        @NameInMap("RowsExamined")
        public Integer rowsExamined;

        @NameInMap("RowsSent")
        public Integer rowsSent;

        @NameInMap("SelectFullJoin")
        public Integer selectFullJoin;

        @NameInMap("SelectFullRangeJoin")
        public Integer selectFullRangeJoin;

        @NameInMap("SelectRange")
        public Integer selectRange;

        @NameInMap("SelectRangeCheck")
        public Integer selectRangeCheck;

        @NameInMap("SelectScan")
        public Integer selectScan;

        @NameInMap("SortMergePasses")
        public Integer sortMergePasses;

        @NameInMap("SortRange")
        public Integer sortRange;

        @NameInMap("SortRows")
        public Integer sortRows;

        @NameInMap("SortScan")
        public Integer sortScan;

        @NameInMap("Sql")
        public String sql;

        /**
         * <p>SQL ID。</p>
         */
        @NameInMap("SqlId")
        public String sqlId;

        @NameInMap("ThreadId")
        public Integer threadId;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("UserId")
        public String userId;

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
