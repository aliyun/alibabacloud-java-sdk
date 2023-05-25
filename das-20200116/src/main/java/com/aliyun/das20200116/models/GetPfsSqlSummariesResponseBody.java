// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetPfsSqlSummariesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetPfsSqlSummariesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetPfsSqlSummariesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPfsSqlSummariesResponseBody self = new GetPfsSqlSummariesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPfsSqlSummariesResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetPfsSqlSummariesResponseBody setData(GetPfsSqlSummariesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPfsSqlSummariesResponseBodyData getData() {
        return this.data;
    }

    public GetPfsSqlSummariesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPfsSqlSummariesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPfsSqlSummariesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPfsSqlSummariesResponseBodyDataList extends TeaModel {
        @NameInMap("AvgLatency")
        public Double avgLatency;

        @NameInMap("Count")
        public Long count;

        @NameInMap("CountRate")
        public Double countRate;

        @NameInMap("CpuRate")
        public Double cpuRate;

        @NameInMap("CpuTime")
        public Double cpuTime;

        @NameInMap("DataReadTime")
        public Double dataReadTime;

        @NameInMap("DataReads")
        public Integer dataReads;

        @NameInMap("DataWriteTime")
        public Double dataWriteTime;

        @NameInMap("DataWrites")
        public Integer dataWrites;

        @NameInMap("Db")
        public String db;

        @NameInMap("ElapsedTime")
        public Double elapsedTime;

        @NameInMap("ErrCount")
        public Long errCount;

        @NameInMap("FirstTime")
        public Long firstTime;

        @NameInMap("FullScan")
        public Boolean fullScan;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LastTime")
        public Long lastTime;

        @NameInMap("LockLatencyAvg")
        public Double lockLatencyAvg;

        @NameInMap("LogicId")
        public Long logicId;

        @NameInMap("LogicReads")
        public Long logicReads;

        @NameInMap("MaxLatency")
        public Double maxLatency;

        @NameInMap("MutexSpins")
        public Integer mutexSpins;

        @NameInMap("MutexWaits")
        public Integer mutexWaits;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("PhysicalAsyncReads")
        public Long physicalAsyncReads;

        @NameInMap("PhysicalReads")
        public Long physicalReads;

        @NameInMap("Psql")
        public String psql;

        @NameInMap("RedoWrites")
        public Long redoWrites;

        @NameInMap("RowsAffected")
        public Long rowsAffected;

        @NameInMap("RowsAffectedAvg")
        public Double rowsAffectedAvg;

        @NameInMap("RowsExamined")
        public Long rowsExamined;

        @NameInMap("RowsExaminedAvg")
        public Double rowsExaminedAvg;

        @NameInMap("RowsSendAvg")
        public Double rowsSendAvg;

        @NameInMap("RowsSent")
        public Long rowsSent;

        @NameInMap("RowsSentAvg")
        public Double rowsSentAvg;

        @NameInMap("RowsSorted")
        public Long rowsSorted;

        @NameInMap("RtRate")
        public Double rtRate;

        @NameInMap("RwlockOsWaits")
        public Integer rwlockOsWaits;

        @NameInMap("RwlockSpinRounds")
        public Integer rwlockSpinRounds;

        @NameInMap("RwlockSpinWaits")
        public Integer rwlockSpinWaits;

        @NameInMap("SelectFullJoinAvg")
        public Double selectFullJoinAvg;

        @NameInMap("SelectFullRangeJoinAvg")
        public Double selectFullRangeJoinAvg;

        @NameInMap("SelectRangeAvg")
        public Double selectRangeAvg;

        @NameInMap("SelectScanAvg")
        public Double selectScanAvg;

        @NameInMap("SemisyncDelayTime")
        public Double semisyncDelayTime;

        @NameInMap("ServerLockTime")
        public Double serverLockTime;

        @NameInMap("SortMergePasses")
        public Long sortMergePasses;

        @NameInMap("SortRangeAvg")
        public Double sortRangeAvg;

        @NameInMap("SortRowsAvg")
        public Double sortRowsAvg;

        @NameInMap("SortScanAvg")
        public Double sortScanAvg;

        @NameInMap("SqlId")
        public String sqlId;

        @NameInMap("SqlType")
        public String sqlType;

        @NameInMap("Tables")
        public java.util.List<String> tables;

        @NameInMap("TimerWaitAvg")
        public Double timerWaitAvg;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("TmpDiskTables")
        public Long tmpDiskTables;

        @NameInMap("TmpDiskTablesAvg")
        public Double tmpDiskTablesAvg;

        @NameInMap("TmpTables")
        public Long tmpTables;

        @NameInMap("TmpTablesAvg")
        public Double tmpTablesAvg;

        @NameInMap("TotalLatency")
        public Double totalLatency;

        @NameInMap("TransactionLockTime")
        public Double transactionLockTime;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("WarnCount")
        public Long warnCount;

        public static GetPfsSqlSummariesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetPfsSqlSummariesResponseBodyDataList self = new GetPfsSqlSummariesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetPfsSqlSummariesResponseBodyDataList setAvgLatency(Double avgLatency) {
            this.avgLatency = avgLatency;
            return this;
        }
        public Double getAvgLatency() {
            return this.avgLatency;
        }

        public GetPfsSqlSummariesResponseBodyDataList setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public GetPfsSqlSummariesResponseBodyDataList setCountRate(Double countRate) {
            this.countRate = countRate;
            return this;
        }
        public Double getCountRate() {
            return this.countRate;
        }

        public GetPfsSqlSummariesResponseBodyDataList setCpuRate(Double cpuRate) {
            this.cpuRate = cpuRate;
            return this;
        }
        public Double getCpuRate() {
            return this.cpuRate;
        }

        public GetPfsSqlSummariesResponseBodyDataList setCpuTime(Double cpuTime) {
            this.cpuTime = cpuTime;
            return this;
        }
        public Double getCpuTime() {
            return this.cpuTime;
        }

        public GetPfsSqlSummariesResponseBodyDataList setDataReadTime(Double dataReadTime) {
            this.dataReadTime = dataReadTime;
            return this;
        }
        public Double getDataReadTime() {
            return this.dataReadTime;
        }

        public GetPfsSqlSummariesResponseBodyDataList setDataReads(Integer dataReads) {
            this.dataReads = dataReads;
            return this;
        }
        public Integer getDataReads() {
            return this.dataReads;
        }

        public GetPfsSqlSummariesResponseBodyDataList setDataWriteTime(Double dataWriteTime) {
            this.dataWriteTime = dataWriteTime;
            return this;
        }
        public Double getDataWriteTime() {
            return this.dataWriteTime;
        }

        public GetPfsSqlSummariesResponseBodyDataList setDataWrites(Integer dataWrites) {
            this.dataWrites = dataWrites;
            return this;
        }
        public Integer getDataWrites() {
            return this.dataWrites;
        }

        public GetPfsSqlSummariesResponseBodyDataList setDb(String db) {
            this.db = db;
            return this;
        }
        public String getDb() {
            return this.db;
        }

        public GetPfsSqlSummariesResponseBodyDataList setElapsedTime(Double elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }
        public Double getElapsedTime() {
            return this.elapsedTime;
        }

        public GetPfsSqlSummariesResponseBodyDataList setErrCount(Long errCount) {
            this.errCount = errCount;
            return this;
        }
        public Long getErrCount() {
            return this.errCount;
        }

        public GetPfsSqlSummariesResponseBodyDataList setFirstTime(Long firstTime) {
            this.firstTime = firstTime;
            return this;
        }
        public Long getFirstTime() {
            return this.firstTime;
        }

        public GetPfsSqlSummariesResponseBodyDataList setFullScan(Boolean fullScan) {
            this.fullScan = fullScan;
            return this;
        }
        public Boolean getFullScan() {
            return this.fullScan;
        }

        public GetPfsSqlSummariesResponseBodyDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetPfsSqlSummariesResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetPfsSqlSummariesResponseBodyDataList setLastTime(Long lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Long getLastTime() {
            return this.lastTime;
        }

        public GetPfsSqlSummariesResponseBodyDataList setLockLatencyAvg(Double lockLatencyAvg) {
            this.lockLatencyAvg = lockLatencyAvg;
            return this;
        }
        public Double getLockLatencyAvg() {
            return this.lockLatencyAvg;
        }

        public GetPfsSqlSummariesResponseBodyDataList setLogicId(Long logicId) {
            this.logicId = logicId;
            return this;
        }
        public Long getLogicId() {
            return this.logicId;
        }

        public GetPfsSqlSummariesResponseBodyDataList setLogicReads(Long logicReads) {
            this.logicReads = logicReads;
            return this;
        }
        public Long getLogicReads() {
            return this.logicReads;
        }

        public GetPfsSqlSummariesResponseBodyDataList setMaxLatency(Double maxLatency) {
            this.maxLatency = maxLatency;
            return this;
        }
        public Double getMaxLatency() {
            return this.maxLatency;
        }

        public GetPfsSqlSummariesResponseBodyDataList setMutexSpins(Integer mutexSpins) {
            this.mutexSpins = mutexSpins;
            return this;
        }
        public Integer getMutexSpins() {
            return this.mutexSpins;
        }

        public GetPfsSqlSummariesResponseBodyDataList setMutexWaits(Integer mutexWaits) {
            this.mutexWaits = mutexWaits;
            return this;
        }
        public Integer getMutexWaits() {
            return this.mutexWaits;
        }

        public GetPfsSqlSummariesResponseBodyDataList setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetPfsSqlSummariesResponseBodyDataList setPhysicalAsyncReads(Long physicalAsyncReads) {
            this.physicalAsyncReads = physicalAsyncReads;
            return this;
        }
        public Long getPhysicalAsyncReads() {
            return this.physicalAsyncReads;
        }

        public GetPfsSqlSummariesResponseBodyDataList setPhysicalReads(Long physicalReads) {
            this.physicalReads = physicalReads;
            return this;
        }
        public Long getPhysicalReads() {
            return this.physicalReads;
        }

        public GetPfsSqlSummariesResponseBodyDataList setPsql(String psql) {
            this.psql = psql;
            return this;
        }
        public String getPsql() {
            return this.psql;
        }

        public GetPfsSqlSummariesResponseBodyDataList setRedoWrites(Long redoWrites) {
            this.redoWrites = redoWrites;
            return this;
        }
        public Long getRedoWrites() {
            return this.redoWrites;
        }

        public GetPfsSqlSummariesResponseBodyDataList setRowsAffected(Long rowsAffected) {
            this.rowsAffected = rowsAffected;
            return this;
        }
        public Long getRowsAffected() {
            return this.rowsAffected;
        }

        public GetPfsSqlSummariesResponseBodyDataList setRowsAffectedAvg(Double rowsAffectedAvg) {
            this.rowsAffectedAvg = rowsAffectedAvg;
            return this;
        }
        public Double getRowsAffectedAvg() {
            return this.rowsAffectedAvg;
        }

        public GetPfsSqlSummariesResponseBodyDataList setRowsExamined(Long rowsExamined) {
            this.rowsExamined = rowsExamined;
            return this;
        }
        public Long getRowsExamined() {
            return this.rowsExamined;
        }

        public GetPfsSqlSummariesResponseBodyDataList setRowsExaminedAvg(Double rowsExaminedAvg) {
            this.rowsExaminedAvg = rowsExaminedAvg;
            return this;
        }
        public Double getRowsExaminedAvg() {
            return this.rowsExaminedAvg;
        }

        public GetPfsSqlSummariesResponseBodyDataList setRowsSendAvg(Double rowsSendAvg) {
            this.rowsSendAvg = rowsSendAvg;
            return this;
        }
        public Double getRowsSendAvg() {
            return this.rowsSendAvg;
        }

        public GetPfsSqlSummariesResponseBodyDataList setRowsSent(Long rowsSent) {
            this.rowsSent = rowsSent;
            return this;
        }
        public Long getRowsSent() {
            return this.rowsSent;
        }

        public GetPfsSqlSummariesResponseBodyDataList setRowsSentAvg(Double rowsSentAvg) {
            this.rowsSentAvg = rowsSentAvg;
            return this;
        }
        public Double getRowsSentAvg() {
            return this.rowsSentAvg;
        }

        public GetPfsSqlSummariesResponseBodyDataList setRowsSorted(Long rowsSorted) {
            this.rowsSorted = rowsSorted;
            return this;
        }
        public Long getRowsSorted() {
            return this.rowsSorted;
        }

        public GetPfsSqlSummariesResponseBodyDataList setRtRate(Double rtRate) {
            this.rtRate = rtRate;
            return this;
        }
        public Double getRtRate() {
            return this.rtRate;
        }

        public GetPfsSqlSummariesResponseBodyDataList setRwlockOsWaits(Integer rwlockOsWaits) {
            this.rwlockOsWaits = rwlockOsWaits;
            return this;
        }
        public Integer getRwlockOsWaits() {
            return this.rwlockOsWaits;
        }

        public GetPfsSqlSummariesResponseBodyDataList setRwlockSpinRounds(Integer rwlockSpinRounds) {
            this.rwlockSpinRounds = rwlockSpinRounds;
            return this;
        }
        public Integer getRwlockSpinRounds() {
            return this.rwlockSpinRounds;
        }

        public GetPfsSqlSummariesResponseBodyDataList setRwlockSpinWaits(Integer rwlockSpinWaits) {
            this.rwlockSpinWaits = rwlockSpinWaits;
            return this;
        }
        public Integer getRwlockSpinWaits() {
            return this.rwlockSpinWaits;
        }

        public GetPfsSqlSummariesResponseBodyDataList setSelectFullJoinAvg(Double selectFullJoinAvg) {
            this.selectFullJoinAvg = selectFullJoinAvg;
            return this;
        }
        public Double getSelectFullJoinAvg() {
            return this.selectFullJoinAvg;
        }

        public GetPfsSqlSummariesResponseBodyDataList setSelectFullRangeJoinAvg(Double selectFullRangeJoinAvg) {
            this.selectFullRangeJoinAvg = selectFullRangeJoinAvg;
            return this;
        }
        public Double getSelectFullRangeJoinAvg() {
            return this.selectFullRangeJoinAvg;
        }

        public GetPfsSqlSummariesResponseBodyDataList setSelectRangeAvg(Double selectRangeAvg) {
            this.selectRangeAvg = selectRangeAvg;
            return this;
        }
        public Double getSelectRangeAvg() {
            return this.selectRangeAvg;
        }

        public GetPfsSqlSummariesResponseBodyDataList setSelectScanAvg(Double selectScanAvg) {
            this.selectScanAvg = selectScanAvg;
            return this;
        }
        public Double getSelectScanAvg() {
            return this.selectScanAvg;
        }

        public GetPfsSqlSummariesResponseBodyDataList setSemisyncDelayTime(Double semisyncDelayTime) {
            this.semisyncDelayTime = semisyncDelayTime;
            return this;
        }
        public Double getSemisyncDelayTime() {
            return this.semisyncDelayTime;
        }

        public GetPfsSqlSummariesResponseBodyDataList setServerLockTime(Double serverLockTime) {
            this.serverLockTime = serverLockTime;
            return this;
        }
        public Double getServerLockTime() {
            return this.serverLockTime;
        }

        public GetPfsSqlSummariesResponseBodyDataList setSortMergePasses(Long sortMergePasses) {
            this.sortMergePasses = sortMergePasses;
            return this;
        }
        public Long getSortMergePasses() {
            return this.sortMergePasses;
        }

        public GetPfsSqlSummariesResponseBodyDataList setSortRangeAvg(Double sortRangeAvg) {
            this.sortRangeAvg = sortRangeAvg;
            return this;
        }
        public Double getSortRangeAvg() {
            return this.sortRangeAvg;
        }

        public GetPfsSqlSummariesResponseBodyDataList setSortRowsAvg(Double sortRowsAvg) {
            this.sortRowsAvg = sortRowsAvg;
            return this;
        }
        public Double getSortRowsAvg() {
            return this.sortRowsAvg;
        }

        public GetPfsSqlSummariesResponseBodyDataList setSortScanAvg(Double sortScanAvg) {
            this.sortScanAvg = sortScanAvg;
            return this;
        }
        public Double getSortScanAvg() {
            return this.sortScanAvg;
        }

        public GetPfsSqlSummariesResponseBodyDataList setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public GetPfsSqlSummariesResponseBodyDataList setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

        public GetPfsSqlSummariesResponseBodyDataList setTables(java.util.List<String> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<String> getTables() {
            return this.tables;
        }

        public GetPfsSqlSummariesResponseBodyDataList setTimerWaitAvg(Double timerWaitAvg) {
            this.timerWaitAvg = timerWaitAvg;
            return this;
        }
        public Double getTimerWaitAvg() {
            return this.timerWaitAvg;
        }

        public GetPfsSqlSummariesResponseBodyDataList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetPfsSqlSummariesResponseBodyDataList setTmpDiskTables(Long tmpDiskTables) {
            this.tmpDiskTables = tmpDiskTables;
            return this;
        }
        public Long getTmpDiskTables() {
            return this.tmpDiskTables;
        }

        public GetPfsSqlSummariesResponseBodyDataList setTmpDiskTablesAvg(Double tmpDiskTablesAvg) {
            this.tmpDiskTablesAvg = tmpDiskTablesAvg;
            return this;
        }
        public Double getTmpDiskTablesAvg() {
            return this.tmpDiskTablesAvg;
        }

        public GetPfsSqlSummariesResponseBodyDataList setTmpTables(Long tmpTables) {
            this.tmpTables = tmpTables;
            return this;
        }
        public Long getTmpTables() {
            return this.tmpTables;
        }

        public GetPfsSqlSummariesResponseBodyDataList setTmpTablesAvg(Double tmpTablesAvg) {
            this.tmpTablesAvg = tmpTablesAvg;
            return this;
        }
        public Double getTmpTablesAvg() {
            return this.tmpTablesAvg;
        }

        public GetPfsSqlSummariesResponseBodyDataList setTotalLatency(Double totalLatency) {
            this.totalLatency = totalLatency;
            return this;
        }
        public Double getTotalLatency() {
            return this.totalLatency;
        }

        public GetPfsSqlSummariesResponseBodyDataList setTransactionLockTime(Double transactionLockTime) {
            this.transactionLockTime = transactionLockTime;
            return this;
        }
        public Double getTransactionLockTime() {
            return this.transactionLockTime;
        }

        public GetPfsSqlSummariesResponseBodyDataList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetPfsSqlSummariesResponseBodyDataList setWarnCount(Long warnCount) {
            this.warnCount = warnCount;
            return this;
        }
        public Long getWarnCount() {
            return this.warnCount;
        }

    }

    public static class GetPfsSqlSummariesResponseBodyData extends TeaModel {
        @NameInMap("Extra")
        public Object extra;

        @NameInMap("List")
        public java.util.List<GetPfsSqlSummariesResponseBodyDataList> list;

        @NameInMap("PageNo")
        public Long pageNo;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        public static GetPfsSqlSummariesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPfsSqlSummariesResponseBodyData self = new GetPfsSqlSummariesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPfsSqlSummariesResponseBodyData setExtra(Object extra) {
            this.extra = extra;
            return this;
        }
        public Object getExtra() {
            return this.extra;
        }

        public GetPfsSqlSummariesResponseBodyData setList(java.util.List<GetPfsSqlSummariesResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetPfsSqlSummariesResponseBodyDataList> getList() {
            return this.list;
        }

        public GetPfsSqlSummariesResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public GetPfsSqlSummariesResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetPfsSqlSummariesResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
