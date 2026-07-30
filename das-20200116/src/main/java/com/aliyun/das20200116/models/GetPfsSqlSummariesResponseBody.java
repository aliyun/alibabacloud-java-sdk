// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetPfsSqlSummariesResponseBody extends TeaModel {
    /**
     * <p>Response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>Response data.</p>
     */
    @NameInMap("Data")
    public GetPfsSqlSummariesResponseBodyData data;

    /**
     * <p>Response message.</p>
     * <blockquote>
     * <p>If the request succeeds, this parameter returns <strong>Successful</strong>. If it fails, it returns error details such as an error code.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>54F3DBAE-9420-511A-9C29-265E8C04****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded:</p>
     * <ul>
     * <li><p><strong>true</strong>: Succeeded.</p>
     * </li>
     * <li><p><strong>false</strong>: Failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>Average SQL execution duration, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1717</p>
         */
        @NameInMap("AvgLatency")
        public Double avgLatency;

        /**
         * <p>Total number of executions.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>Percentage of total executions.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0586</p>
         */
        @NameInMap("CountRate")
        public Double countRate;

        /**
         * <p>Ratio of CPU execution time to total SQL execution time.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CpuRate")
        public Double cpuRate;

        /**
         * <p>CPU runtime, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CpuTime")
        public Double cpuTime;

        /**
         * <p>Data read time, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DataReadTime")
        public Double dataReadTime;

        /**
         * <p>Number of readable data nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DataReads")
        public Integer dataReads;

        /**
         * <p>Data write time, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DataWriteTime")
        public Double dataWriteTime;

        /**
         * <p>Number of writable data nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DataWrites")
        public Integer dataWrites;

        /**
         * <p>Database name.</p>
         * 
         * <strong>example:</strong>
         * <p>testDB</p>
         */
        @NameInMap("Db")
        public String db;

        /**
         * <p>Actual runtime, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ElapsedTime")
        public Double elapsedTime;

        /**
         * <p>Number of errors.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ErrCount")
        public Long errCount;

        /**
         * <p>First execution time, in Unix time format, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1659308149000</p>
         */
        @NameInMap("FirstTime")
        public Long firstTime;

        /**
         * <p>Indicates whether a full table scan occurred. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Yes.</p>
         * </li>
         * <li><p><strong>false</strong>: No.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FullScan")
        public Boolean fullScan;

        /**
         * <p>Primary key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>26186357</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze8g2am97624****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Last update time, in Unix time format, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1661306520000</p>
         */
        @NameInMap("LastTime")
        public Long lastTime;

        /**
         * <p>Average lock wait time, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LockLatencyAvg")
        public Double lockLatencyAvg;

        /**
         * <p>Logical database ID.</p>
         * 
         * <strong>example:</strong>
         * <p>58275984</p>
         */
        @NameInMap("LogicId")
        public Long logicId;

        /**
         * <p>Number of logical nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LogicReads")
        public Long logicReads;

        /**
         * <p>Maximum execution duration, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>36.233</p>
         */
        @NameInMap("MaxLatency")
        public Double maxLatency;

        /**
         * <p>Number of mutex spins.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MutexSpins")
        public Integer mutexSpins;

        /**
         * <p>Number of mutex waits.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MutexWaits")
        public Integer mutexWaits;

        /**
         * <p>Node ID.</p>
         * <blockquote>
         * <p>This parameter is returned for ApsaraDB RDS for MySQL Cluster Edition or PolarDB for MySQL database instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>r-x****-db-0</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>Number of physical asynchronous nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PhysicalAsyncReads")
        public Long physicalAsyncReads;

        /**
         * <p>Number of physical nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PhysicalReads")
        public Long physicalReads;

        /**
         * <p>SQL template.</p>
         * 
         * <strong>example:</strong>
         * <p>select ?</p>
         */
        @NameInMap("Psql")
        public String psql;

        /**
         * <p>Number of redo nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RedoWrites")
        public Long redoWrites;

        /**
         * <p>Number of rows affected.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RowsAffected")
        public Long rowsAffected;

        /**
         * <p>Average number of rows affected.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RowsAffectedAvg")
        public Double rowsAffectedAvg;

        /**
         * <p>Total number of rows scanned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("RowsExamined")
        public Long rowsExamined;

        /**
         * <p>Average number of rows scanned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RowsExaminedAvg")
        public Double rowsExaminedAvg;

        /**
         * <p>Average number of rows sent.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RowsSendAvg")
        public Double rowsSendAvg;

        /**
         * <p>Number of rows returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RowsSent")
        public Long rowsSent;

        /**
         * <p>Average number of rows returned per SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>0.52</p>
         */
        @NameInMap("RowsSentAvg")
        public Double rowsSentAvg;

        /**
         * <p>Number of rows sorted.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RowsSorted")
        public Long rowsSorted;

        /**
         * <p>Percentage of total execution duration.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1384</p>
         */
        @NameInMap("RtRate")
        public Double rtRate;

        /**
         * <p>Indicates whether read/write splitting is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Disabled.</p>
         * </li>
         * <li><p><strong>1</strong>: Enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RwlockOsWaits")
        public Integer rwlockOsWaits;

        /**
         * <p>Read/write splitting parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RwlockSpinRounds")
        public Integer rwlockSpinRounds;

        /**
         * <p>Indicates whether multiple index scans are enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Disabled.</p>
         * </li>
         * <li><p><strong>1</strong>: Enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RwlockSpinWaits")
        public Integer rwlockSpinWaits;

        /**
         * <p>The average number of connections that perform table scans without using an index.</p>
         * <blockquote>
         * <p>Notice: If this parameter value is not 0, carefully check the indexes of the table.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SelectFullJoinAvg")
        public Double selectFullJoinAvg;

        /**
         * <p>Average number of range joins.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SelectFullRangeJoinAvg")
        public Double selectFullRangeJoinAvg;

        /**
         * <p>Average range selection.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SelectRangeAvg")
        public Double selectRangeAvg;

        /**
         * <p>Average number of scans.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SelectScanAvg")
        public Double selectScanAvg;

        /**
         * <p>Semi-synchronous replication delay, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0.12</p>
         */
        @NameInMap("SemisyncDelayTime")
        public Double semisyncDelayTime;

        /**
         * <p>Server lock time, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ServerLockTime")
        public Double serverLockTime;

        /**
         * <p>Number of merge passes required by the sort algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SortMergePasses")
        public Long sortMergePasses;

        /**
         * <p>Average number of range-based sorts.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SortRangeAvg")
        public Double sortRangeAvg;

        /**
         * <p>Average number of sorted rows.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SortRowsAvg")
        public Double sortRowsAvg;

        /**
         * <p>Average number of sorted scans.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SortScanAvg")
        public Double sortScanAvg;

        /**
         * <p>SQL template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2e8147b5ca2dfc640dfd5e43d96a****</p>
         */
        @NameInMap("SqlId")
        public String sqlId;

        /**
         * <p>SQL type. Valid values:</p>
         * <ul>
         * <li><p><strong>SELECT</strong></p>
         * </li>
         * <li><p><strong>UPDATE</strong></p>
         * </li>
         * <li><p><strong>DELETE</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SELECT</p>
         */
        @NameInMap("SqlType")
        public String sqlType;

        /**
         * <p>Database table names.</p>
         */
        @NameInMap("Tables")
        public java.util.List<String> tables;

        /**
         * <p>Reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("TimerWaitAvg")
        public Double timerWaitAvg;

        /**
         * <p>Data timestamp in Unix time format, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1643040000000</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>Number of temporary disk tables.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TmpDiskTables")
        public Long tmpDiskTables;

        /**
         * <p>Average number of temporary disk tables.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TmpDiskTablesAvg")
        public Double tmpDiskTablesAvg;

        /**
         * <p>Number of temporary tables.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TmpTables")
        public Long tmpTables;

        /**
         * <p>Average number of temporary tables.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TmpTablesAvg")
        public Double tmpTablesAvg;

        /**
         * <p>Total execution duration, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60913.256</p>
         */
        @NameInMap("TotalLatency")
        public Double totalLatency;

        /**
         * <p>Transaction lock time, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TransactionLockTime")
        public Double transactionLockTime;

        /**
         * <p>User ID.</p>
         * 
         * <strong>example:</strong>
         * <p>196278346919****</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>Number of warnings.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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
        /**
         * <p>Reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Extra")
        public Object extra;

        /**
         * <p>Detailed information list.</p>
         */
        @NameInMap("List")
        public java.util.List<GetPfsSqlSummariesResponseBodyDataList> list;

        /**
         * <p>Page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Long pageNo;

        /**
         * <p>Maximum number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>Total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>264</p>
         */
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
