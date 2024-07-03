// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetPfsSqlSummariesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetPfsSqlSummariesResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <blockquote>
     * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message such as an error code is returned.</p>
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
     * <p>54F3DBAE-9420-511A-9C29-265E8C04****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
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
         * <p>The average execution latency. Unit: millisecond.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1717</p>
         */
        @NameInMap("AvgLatency")
        public Double avgLatency;

        /**
         * <p>The total number of executions.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The percentage of the number of executions.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0586</p>
         */
        @NameInMap("CountRate")
        public Double countRate;

        /**
         * <p>The ratio of the CPU execution duration to the total execution duration of the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CpuRate")
        public Double cpuRate;

        /**
         * <p>The CPU execution duration. Unit: millisecond.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CpuTime")
        public Double cpuTime;

        /**
         * <p>The data read duration. Unit: millisecond.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DataReadTime")
        public Double dataReadTime;

        /**
         * <p>The number of nodes from which data can be read.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DataReads")
        public Integer dataReads;

        /**
         * <p>The data write duration. Unit: millisecond.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DataWriteTime")
        public Double dataWriteTime;

        /**
         * <p>The number of nodes to which data can be written.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DataWrites")
        public Integer dataWrites;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>testDB</p>
         */
        @NameInMap("Db")
        public String db;

        /**
         * <p>The execution duration. Unit: millisecond.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ElapsedTime")
        public Double elapsedTime;

        /**
         * <p>The number of errors.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ErrCount")
        public Long errCount;

        /**
         * <p>The time when the SQL statement was executed for the first time. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1659308149000</p>
         */
        @NameInMap("FirstTime")
        public Long firstTime;

        /**
         * <p>Indicates whether full table scan was enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FullScan")
        public Boolean fullScan;

        /**
         * <p>The primary key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>26186357</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze8g2am97624****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The time when the SQL statement was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1661306520000</p>
         */
        @NameInMap("LastTime")
        public Long lastTime;

        /**
         * <p>The average lock wait latency. Unit: millisecond.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LockLatencyAvg")
        public Double lockLatencyAvg;

        /**
         * <p>The logical database ID.</p>
         * 
         * <strong>example:</strong>
         * <p>58275984</p>
         */
        @NameInMap("LogicId")
        public Long logicId;

        /**
         * <p>The number of logical nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LogicReads")
        public Long logicReads;

        /**
         * <p>The maximum execution latency. Unit: millisecond.</p>
         * 
         * <strong>example:</strong>
         * <p>36.233</p>
         */
        @NameInMap("MaxLatency")
        public Double maxLatency;

        /**
         * <p>The number of mutex spins.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MutexSpins")
        public Integer mutexSpins;

        /**
         * <p>The number of mutex waits.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MutexWaits")
        public Integer mutexWaits;

        /**
         * <p>The node ID.</p>
         * <blockquote>
         * <p>This parameter is returned only if the database instance is an ApsaraDB RDS for MySQL Cluster Edition instance or a PolarDB for MySQL cluster.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>r-x****-db-0</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The number of physical asynchronous nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PhysicalAsyncReads")
        public Long physicalAsyncReads;

        /**
         * <p>The number of physical nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PhysicalReads")
        public Long physicalReads;

        /**
         * <p>The SQL template.</p>
         * 
         * <strong>example:</strong>
         * <p>select ?</p>
         */
        @NameInMap("Psql")
        public String psql;

        /**
         * <p>The number of redo nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RedoWrites")
        public Long redoWrites;

        /**
         * <p>The number of rows that are affected by the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RowsAffected")
        public Long rowsAffected;

        /**
         * <p>The average number of rows affected by the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RowsAffectedAvg")
        public Double rowsAffectedAvg;

        /**
         * <p>The total number of scanned rows.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("RowsExamined")
        public Long rowsExamined;

        /**
         * <p>The average number of scanned rows.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RowsExaminedAvg")
        public Double rowsExaminedAvg;

        /**
         * <p>The average number of returned rows.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RowsSendAvg")
        public Double rowsSendAvg;

        /**
         * <p>The number of rows returned by the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RowsSent")
        public Long rowsSent;

        /**
         * <p>The average number of rows returned for the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>0.52</p>
         */
        @NameInMap("RowsSentAvg")
        public Double rowsSentAvg;

        /**
         * <p>The number of sorted rows.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RowsSorted")
        public Long rowsSorted;

        /**
         * <p>The execution duration percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1384</p>
         */
        @NameInMap("RtRate")
        public Double rtRate;

        /**
         * <p>Indicates whether read/write splitting was enabled. Valid values:</p>
         * <ul>
         * <li><strong>0:</strong> Read/write splitting was disabled.</li>
         * <li><strong>1:</strong> Read/write splitting was enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RwlockOsWaits")
        public Integer rwlockOsWaits;

        /**
         * <p>The read/write splitting parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RwlockSpinRounds")
        public Integer rwlockSpinRounds;

        /**
         * <p>Indices whether multi-index scanning was enabled. Valid values:</p>
         * <ul>
         * <li><strong>0:</strong> Multi-index scanning was disabled.</li>
         * <li><strong>1:</strong> Multi-index scanning was enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RwlockSpinWaits")
        public Integer rwlockSpinWaits;

        /**
         * <p>The average number of joins that performed table scans without using indexes.</p>
         * <blockquote>
         * <p>If the value of this parameter is not 0, check the table indexes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SelectFullJoinAvg")
        public Double selectFullJoinAvg;

        /**
         * <p>The average number of joins that selected a range.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SelectFullRangeJoinAvg")
        public Double selectFullRangeJoinAvg;

        /**
         * <p>The average selected range.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SelectRangeAvg")
        public Double selectRangeAvg;

        /**
         * <p>The average number of scanned rows.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SelectScanAvg")
        public Double selectScanAvg;

        /**
         * <p>The semi-synchronous replication latency. Unit: millisecond.</p>
         * 
         * <strong>example:</strong>
         * <p>0.12</p>
         */
        @NameInMap("SemisyncDelayTime")
        public Double semisyncDelayTime;

        /**
         * <p>The amount of time consumed for locking the server. Unit: millisecond.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ServerLockTime")
        public Double serverLockTime;

        /**
         * <p>The number of merges that the sorting algorithm must perform.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SortMergePasses")
        public Long sortMergePasses;

        /**
         * <p>The average number of sorts that were performed by using a range.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SortRangeAvg")
        public Double sortRangeAvg;

        /**
         * <p>The average number of sorted rows.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SortRowsAvg")
        public Double sortRowsAvg;

        /**
         * <p>The average number of sorts that were performed during table scans.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SortScanAvg")
        public Double sortScanAvg;

        /**
         * <p>The SQL template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2e8147b5ca2dfc640dfd5e43d96a****</p>
         */
        @NameInMap("SqlId")
        public String sqlId;

        /**
         * <p>The type of the SQL statement. Valid values:</p>
         * <ul>
         * <li><strong>SELECT</strong></li>
         * <li><strong>UPDATE</strong></li>
         * <li><strong>DELETE</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SELECT</p>
         */
        @NameInMap("SqlType")
        public String sqlType;

        /**
         * <p>The names of tables in the database.</p>
         */
        @NameInMap("Tables")
        public java.util.List<String> tables;

        /**
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("TimerWaitAvg")
        public Double timerWaitAvg;

        /**
         * <p>The data timestamp. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1643040000000</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The number of on-disk temporary tables.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TmpDiskTables")
        public Long tmpDiskTables;

        /**
         * <p>The average number of on-disk temporary tables.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TmpDiskTablesAvg")
        public Double tmpDiskTablesAvg;

        /**
         * <p>The number of temporary tables.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TmpTables")
        public Long tmpTables;

        /**
         * <p>The average number of temporary tables.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TmpTablesAvg")
        public Double tmpTablesAvg;

        /**
         * <p>The execution latency. Unit: millisecond.</p>
         * 
         * <strong>example:</strong>
         * <p>60913.256</p>
         */
        @NameInMap("TotalLatency")
        public Double totalLatency;

        /**
         * <p>The amount of time consumed for locking the storage transaction. Unit: millisecond.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TransactionLockTime")
        public Double transactionLockTime;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>196278346919****</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The number of warnings.</p>
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
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Extra")
        public Object extra;

        /**
         * <p>The detailed information.</p>
         */
        @NameInMap("List")
        public java.util.List<GetPfsSqlSummariesResponseBodyDataList> list;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Long pageNo;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of entries returned.</p>
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
