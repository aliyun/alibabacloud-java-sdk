// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetPfsSqlComparisonResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetPfsSqlComparisonResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetPfsSqlComparisonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPfsSqlComparisonResponseBody self = new GetPfsSqlComparisonResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPfsSqlComparisonResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetPfsSqlComparisonResponseBody setData(GetPfsSqlComparisonResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPfsSqlComparisonResponseBodyData getData() {
        return this.data;
    }

    public GetPfsSqlComparisonResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPfsSqlComparisonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPfsSqlComparisonResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPfsSqlComparisonResponseBodyDataList extends TeaModel {
        @NameInMap("UserId")
        public String userId;

        @NameInMap("Psql")
        public String psql;

        @NameInMap("SqlFeature")
        public String sqlFeature;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("SqlType")
        public String sqlType;

        @NameInMap("LogicId")
        public Long logicId;

        @NameInMap("SqlId")
        public String sqlId;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("RtRate")
        public Double rtRate;

        @NameInMap("CountRate")
        public Double countRate;

        @NameInMap("FullScan")
        public Boolean fullScan;

        @NameInMap("Count")
        public Long count;

        @NameInMap("ErrCount")
        public Long errCount;

        @NameInMap("WarnCount")
        public Long warnCount;

        @NameInMap("TotalLatency")
        public Long totalLatency;

        @NameInMap("MaxLatency")
        public Long maxLatency;

        @NameInMap("AvgLatency")
        public Double avgLatency;

        @NameInMap("RowsSent")
        public Long rowsSent;

        @NameInMap("RowsSendAvg")
        public Double rowsSendAvg;

        @NameInMap("RowsExamined")
        public Long rowsExamined;

        @NameInMap("RowsExaminedAvg")
        public Double rowsExaminedAvg;

        @NameInMap("RowsAffected")
        public Long rowsAffected;

        @NameInMap("RowsAffectedAvg")
        public Double rowsAffectedAvg;

        @NameInMap("TmpTables")
        public Long tmpTables;

        @NameInMap("TmpDiskTables")
        public Long tmpDiskTables;

        @NameInMap("RowsSorted")
        public Long rowsSorted;

        @NameInMap("SortMergePasses")
        public Long sortMergePasses;

        @NameInMap("PhysicalReads")
        public Long physicalReads;

        @NameInMap("PhysicalAsyncReads")
        public Long physicalAsyncReads;

        @NameInMap("SemisyncDelayTime")
        public Long semisyncDelayTime;

        @NameInMap("RowsSentAvg")
        public Double rowsSentAvg;

        @NameInMap("LogicReads")
        public Long logicReads;

        @NameInMap("RedoWrites")
        public Long redoWrites;

        @NameInMap("DataWriteTime")
        public Integer dataWriteTime;

        @NameInMap("DataWrites")
        public Integer dataWrites;

        @NameInMap("DataReadTime")
        public Integer dataReadTime;

        @NameInMap("DataReads")
        public Integer dataReads;

        @NameInMap("RwlockOsWaits")
        public Integer rwlockOsWaits;

        @NameInMap("RwlockSpinRounds")
        public Integer rwlockSpinRounds;

        @NameInMap("RwlockSpinWaits")
        public Integer rwlockSpinWaits;

        @NameInMap("MutexWaits")
        public Integer mutexWaits;

        @NameInMap("MutexSpins")
        public Integer mutexSpins;

        @NameInMap("TransactionLockTime")
        public Integer transactionLockTime;

        @NameInMap("ServerLockTime")
        public Integer serverLockTime;

        @NameInMap("CpuTime")
        public Integer cpuTime;

        @NameInMap("ElapsedTime")
        public Integer elapsedTime;

        @NameInMap("Id")
        public Long id;

        public static GetPfsSqlComparisonResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetPfsSqlComparisonResponseBodyDataList self = new GetPfsSqlComparisonResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetPfsSqlComparisonResponseBodyDataList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetPfsSqlComparisonResponseBodyDataList setPsql(String psql) {
            this.psql = psql;
            return this;
        }
        public String getPsql() {
            return this.psql;
        }

        public GetPfsSqlComparisonResponseBodyDataList setSqlFeature(String sqlFeature) {
            this.sqlFeature = sqlFeature;
            return this;
        }
        public String getSqlFeature() {
            return this.sqlFeature;
        }

        public GetPfsSqlComparisonResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetPfsSqlComparisonResponseBodyDataList setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetPfsSqlComparisonResponseBodyDataList setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

        public GetPfsSqlComparisonResponseBodyDataList setLogicId(Long logicId) {
            this.logicId = logicId;
            return this;
        }
        public Long getLogicId() {
            return this.logicId;
        }

        public GetPfsSqlComparisonResponseBodyDataList setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public GetPfsSqlComparisonResponseBodyDataList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetPfsSqlComparisonResponseBodyDataList setRtRate(Double rtRate) {
            this.rtRate = rtRate;
            return this;
        }
        public Double getRtRate() {
            return this.rtRate;
        }

        public GetPfsSqlComparisonResponseBodyDataList setCountRate(Double countRate) {
            this.countRate = countRate;
            return this;
        }
        public Double getCountRate() {
            return this.countRate;
        }

        public GetPfsSqlComparisonResponseBodyDataList setFullScan(Boolean fullScan) {
            this.fullScan = fullScan;
            return this;
        }
        public Boolean getFullScan() {
            return this.fullScan;
        }

        public GetPfsSqlComparisonResponseBodyDataList setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public GetPfsSqlComparisonResponseBodyDataList setErrCount(Long errCount) {
            this.errCount = errCount;
            return this;
        }
        public Long getErrCount() {
            return this.errCount;
        }

        public GetPfsSqlComparisonResponseBodyDataList setWarnCount(Long warnCount) {
            this.warnCount = warnCount;
            return this;
        }
        public Long getWarnCount() {
            return this.warnCount;
        }

        public GetPfsSqlComparisonResponseBodyDataList setTotalLatency(Long totalLatency) {
            this.totalLatency = totalLatency;
            return this;
        }
        public Long getTotalLatency() {
            return this.totalLatency;
        }

        public GetPfsSqlComparisonResponseBodyDataList setMaxLatency(Long maxLatency) {
            this.maxLatency = maxLatency;
            return this;
        }
        public Long getMaxLatency() {
            return this.maxLatency;
        }

        public GetPfsSqlComparisonResponseBodyDataList setAvgLatency(Double avgLatency) {
            this.avgLatency = avgLatency;
            return this;
        }
        public Double getAvgLatency() {
            return this.avgLatency;
        }

        public GetPfsSqlComparisonResponseBodyDataList setRowsSent(Long rowsSent) {
            this.rowsSent = rowsSent;
            return this;
        }
        public Long getRowsSent() {
            return this.rowsSent;
        }

        public GetPfsSqlComparisonResponseBodyDataList setRowsSendAvg(Double rowsSendAvg) {
            this.rowsSendAvg = rowsSendAvg;
            return this;
        }
        public Double getRowsSendAvg() {
            return this.rowsSendAvg;
        }

        public GetPfsSqlComparisonResponseBodyDataList setRowsExamined(Long rowsExamined) {
            this.rowsExamined = rowsExamined;
            return this;
        }
        public Long getRowsExamined() {
            return this.rowsExamined;
        }

        public GetPfsSqlComparisonResponseBodyDataList setRowsExaminedAvg(Double rowsExaminedAvg) {
            this.rowsExaminedAvg = rowsExaminedAvg;
            return this;
        }
        public Double getRowsExaminedAvg() {
            return this.rowsExaminedAvg;
        }

        public GetPfsSqlComparisonResponseBodyDataList setRowsAffected(Long rowsAffected) {
            this.rowsAffected = rowsAffected;
            return this;
        }
        public Long getRowsAffected() {
            return this.rowsAffected;
        }

        public GetPfsSqlComparisonResponseBodyDataList setRowsAffectedAvg(Double rowsAffectedAvg) {
            this.rowsAffectedAvg = rowsAffectedAvg;
            return this;
        }
        public Double getRowsAffectedAvg() {
            return this.rowsAffectedAvg;
        }

        public GetPfsSqlComparisonResponseBodyDataList setTmpTables(Long tmpTables) {
            this.tmpTables = tmpTables;
            return this;
        }
        public Long getTmpTables() {
            return this.tmpTables;
        }

        public GetPfsSqlComparisonResponseBodyDataList setTmpDiskTables(Long tmpDiskTables) {
            this.tmpDiskTables = tmpDiskTables;
            return this;
        }
        public Long getTmpDiskTables() {
            return this.tmpDiskTables;
        }

        public GetPfsSqlComparisonResponseBodyDataList setRowsSorted(Long rowsSorted) {
            this.rowsSorted = rowsSorted;
            return this;
        }
        public Long getRowsSorted() {
            return this.rowsSorted;
        }

        public GetPfsSqlComparisonResponseBodyDataList setSortMergePasses(Long sortMergePasses) {
            this.sortMergePasses = sortMergePasses;
            return this;
        }
        public Long getSortMergePasses() {
            return this.sortMergePasses;
        }

        public GetPfsSqlComparisonResponseBodyDataList setPhysicalReads(Long physicalReads) {
            this.physicalReads = physicalReads;
            return this;
        }
        public Long getPhysicalReads() {
            return this.physicalReads;
        }

        public GetPfsSqlComparisonResponseBodyDataList setPhysicalAsyncReads(Long physicalAsyncReads) {
            this.physicalAsyncReads = physicalAsyncReads;
            return this;
        }
        public Long getPhysicalAsyncReads() {
            return this.physicalAsyncReads;
        }

        public GetPfsSqlComparisonResponseBodyDataList setSemisyncDelayTime(Long semisyncDelayTime) {
            this.semisyncDelayTime = semisyncDelayTime;
            return this;
        }
        public Long getSemisyncDelayTime() {
            return this.semisyncDelayTime;
        }

        public GetPfsSqlComparisonResponseBodyDataList setRowsSentAvg(Double rowsSentAvg) {
            this.rowsSentAvg = rowsSentAvg;
            return this;
        }
        public Double getRowsSentAvg() {
            return this.rowsSentAvg;
        }

        public GetPfsSqlComparisonResponseBodyDataList setLogicReads(Long logicReads) {
            this.logicReads = logicReads;
            return this;
        }
        public Long getLogicReads() {
            return this.logicReads;
        }

        public GetPfsSqlComparisonResponseBodyDataList setRedoWrites(Long redoWrites) {
            this.redoWrites = redoWrites;
            return this;
        }
        public Long getRedoWrites() {
            return this.redoWrites;
        }

        public GetPfsSqlComparisonResponseBodyDataList setDataWriteTime(Integer dataWriteTime) {
            this.dataWriteTime = dataWriteTime;
            return this;
        }
        public Integer getDataWriteTime() {
            return this.dataWriteTime;
        }

        public GetPfsSqlComparisonResponseBodyDataList setDataWrites(Integer dataWrites) {
            this.dataWrites = dataWrites;
            return this;
        }
        public Integer getDataWrites() {
            return this.dataWrites;
        }

        public GetPfsSqlComparisonResponseBodyDataList setDataReadTime(Integer dataReadTime) {
            this.dataReadTime = dataReadTime;
            return this;
        }
        public Integer getDataReadTime() {
            return this.dataReadTime;
        }

        public GetPfsSqlComparisonResponseBodyDataList setDataReads(Integer dataReads) {
            this.dataReads = dataReads;
            return this;
        }
        public Integer getDataReads() {
            return this.dataReads;
        }

        public GetPfsSqlComparisonResponseBodyDataList setRwlockOsWaits(Integer rwlockOsWaits) {
            this.rwlockOsWaits = rwlockOsWaits;
            return this;
        }
        public Integer getRwlockOsWaits() {
            return this.rwlockOsWaits;
        }

        public GetPfsSqlComparisonResponseBodyDataList setRwlockSpinRounds(Integer rwlockSpinRounds) {
            this.rwlockSpinRounds = rwlockSpinRounds;
            return this;
        }
        public Integer getRwlockSpinRounds() {
            return this.rwlockSpinRounds;
        }

        public GetPfsSqlComparisonResponseBodyDataList setRwlockSpinWaits(Integer rwlockSpinWaits) {
            this.rwlockSpinWaits = rwlockSpinWaits;
            return this;
        }
        public Integer getRwlockSpinWaits() {
            return this.rwlockSpinWaits;
        }

        public GetPfsSqlComparisonResponseBodyDataList setMutexWaits(Integer mutexWaits) {
            this.mutexWaits = mutexWaits;
            return this;
        }
        public Integer getMutexWaits() {
            return this.mutexWaits;
        }

        public GetPfsSqlComparisonResponseBodyDataList setMutexSpins(Integer mutexSpins) {
            this.mutexSpins = mutexSpins;
            return this;
        }
        public Integer getMutexSpins() {
            return this.mutexSpins;
        }

        public GetPfsSqlComparisonResponseBodyDataList setTransactionLockTime(Integer transactionLockTime) {
            this.transactionLockTime = transactionLockTime;
            return this;
        }
        public Integer getTransactionLockTime() {
            return this.transactionLockTime;
        }

        public GetPfsSqlComparisonResponseBodyDataList setServerLockTime(Integer serverLockTime) {
            this.serverLockTime = serverLockTime;
            return this;
        }
        public Integer getServerLockTime() {
            return this.serverLockTime;
        }

        public GetPfsSqlComparisonResponseBodyDataList setCpuTime(Integer cpuTime) {
            this.cpuTime = cpuTime;
            return this;
        }
        public Integer getCpuTime() {
            return this.cpuTime;
        }

        public GetPfsSqlComparisonResponseBodyDataList setElapsedTime(Integer elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }
        public Integer getElapsedTime() {
            return this.elapsedTime;
        }

        public GetPfsSqlComparisonResponseBodyDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class GetPfsSqlComparisonResponseBodyData extends TeaModel {
        @NameInMap("Extra")
        public Object extra;

        @NameInMap("List")
        public java.util.List<java.util.List<GetPfsSqlComparisonResponseBodyDataList>> list;

        @NameInMap("PageNo")
        public Long pageNo;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        public static GetPfsSqlComparisonResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPfsSqlComparisonResponseBodyData self = new GetPfsSqlComparisonResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPfsSqlComparisonResponseBodyData setExtra(Object extra) {
            this.extra = extra;
            return this;
        }
        public Object getExtra() {
            return this.extra;
        }

        public GetPfsSqlComparisonResponseBodyData setList(java.util.List<java.util.List<GetPfsSqlComparisonResponseBodyDataList>> list) {
            this.list = list;
            return this;
        }
        public java.util.List<java.util.List<GetPfsSqlComparisonResponseBodyDataList>> getList() {
            return this.list;
        }

        public GetPfsSqlComparisonResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public GetPfsSqlComparisonResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetPfsSqlComparisonResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
