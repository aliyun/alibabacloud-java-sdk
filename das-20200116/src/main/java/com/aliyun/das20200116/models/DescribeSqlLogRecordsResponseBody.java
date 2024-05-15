// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSqlLogRecordsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    /**
     * <p>SqlLogDetailResult</p>
     */
    @NameInMap("Data")
    public DescribeSqlLogRecordsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static DescribeSqlLogRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlLogRecordsResponseBody self = new DescribeSqlLogRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSqlLogRecordsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSqlLogRecordsResponseBody setData(DescribeSqlLogRecordsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSqlLogRecordsResponseBodyData getData() {
        return this.data;
    }

    public DescribeSqlLogRecordsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSqlLogRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSqlLogRecordsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord extends TeaModel {
        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("Collection")
        public String collection;

        @NameInMap("Consume")
        public Long consume;

        @NameInMap("CpuTime")
        public Long cpuTime;

        @NameInMap("DBName")
        public String DBName;

        @NameInMap("ExecuteTime")
        public String executeTime;

        @NameInMap("Ext")
        public String ext;

        @NameInMap("Frows")
        public Long frows;

        @NameInMap("HostAddress")
        public String hostAddress;

        @NameInMap("LockTime")
        public Long lockTime;

        @NameInMap("LogicRead")
        public Long logicRead;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("OriginTime")
        public Long originTime;

        @NameInMap("ParallelDegree")
        public String parallelDegree;

        @NameInMap("ParallelQueueTime")
        public String parallelQueueTime;

        @NameInMap("PhysicAsyncRead")
        public Long physicAsyncRead;

        @NameInMap("PhysicRead")
        public Long physicRead;

        @NameInMap("PhysicSyncRead")
        public Long physicSyncRead;

        @NameInMap("ReturnRows")
        public Long returnRows;

        @NameInMap("Rows")
        public Long rows;

        @NameInMap("ScanRows")
        public Long scanRows;

        @NameInMap("Scnt")
        public Long scnt;

        /**
         * <p>SQL ID。</p>
         */
        @NameInMap("SqlId")
        public String sqlId;

        @NameInMap("SqlText")
        public String sqlText;

        @NameInMap("SqlType")
        public String sqlType;

        @NameInMap("State")
        public String state;

        @NameInMap("ThreadId")
        public Long threadId;

        @NameInMap("TraceId")
        public String traceId;

        @NameInMap("TrxId")
        public Long trxId;

        @NameInMap("UpdateRows")
        public Long updateRows;

        @NameInMap("UseImciEngine")
        public String useImciEngine;

        @NameInMap("Vip")
        public String vip;

        @NameInMap("Writes")
        public Long writes;

        public static DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord self = new DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord();
            return TeaModel.build(map, self);
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setCollection(String collection) {
            this.collection = collection;
            return this;
        }
        public String getCollection() {
            return this.collection;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setConsume(Long consume) {
            this.consume = consume;
            return this;
        }
        public Long getConsume() {
            return this.consume;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setCpuTime(Long cpuTime) {
            this.cpuTime = cpuTime;
            return this;
        }
        public Long getCpuTime() {
            return this.cpuTime;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setExecuteTime(String executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public String getExecuteTime() {
            return this.executeTime;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setFrows(Long frows) {
            this.frows = frows;
            return this;
        }
        public Long getFrows() {
            return this.frows;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setHostAddress(String hostAddress) {
            this.hostAddress = hostAddress;
            return this;
        }
        public String getHostAddress() {
            return this.hostAddress;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setLockTime(Long lockTime) {
            this.lockTime = lockTime;
            return this;
        }
        public Long getLockTime() {
            return this.lockTime;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setLogicRead(Long logicRead) {
            this.logicRead = logicRead;
            return this;
        }
        public Long getLogicRead() {
            return this.logicRead;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setOriginTime(Long originTime) {
            this.originTime = originTime;
            return this;
        }
        public Long getOriginTime() {
            return this.originTime;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setParallelDegree(String parallelDegree) {
            this.parallelDegree = parallelDegree;
            return this;
        }
        public String getParallelDegree() {
            return this.parallelDegree;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setParallelQueueTime(String parallelQueueTime) {
            this.parallelQueueTime = parallelQueueTime;
            return this;
        }
        public String getParallelQueueTime() {
            return this.parallelQueueTime;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setPhysicAsyncRead(Long physicAsyncRead) {
            this.physicAsyncRead = physicAsyncRead;
            return this;
        }
        public Long getPhysicAsyncRead() {
            return this.physicAsyncRead;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setPhysicRead(Long physicRead) {
            this.physicRead = physicRead;
            return this;
        }
        public Long getPhysicRead() {
            return this.physicRead;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setPhysicSyncRead(Long physicSyncRead) {
            this.physicSyncRead = physicSyncRead;
            return this;
        }
        public Long getPhysicSyncRead() {
            return this.physicSyncRead;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setReturnRows(Long returnRows) {
            this.returnRows = returnRows;
            return this;
        }
        public Long getReturnRows() {
            return this.returnRows;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setRows(Long rows) {
            this.rows = rows;
            return this;
        }
        public Long getRows() {
            return this.rows;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setScanRows(Long scanRows) {
            this.scanRows = scanRows;
            return this;
        }
        public Long getScanRows() {
            return this.scanRows;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setScnt(Long scnt) {
            this.scnt = scnt;
            return this;
        }
        public Long getScnt() {
            return this.scnt;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setSqlText(String sqlText) {
            this.sqlText = sqlText;
            return this;
        }
        public String getSqlText() {
            return this.sqlText;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setThreadId(Long threadId) {
            this.threadId = threadId;
            return this;
        }
        public Long getThreadId() {
            return this.threadId;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setTrxId(Long trxId) {
            this.trxId = trxId;
            return this;
        }
        public Long getTrxId() {
            return this.trxId;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setUpdateRows(Long updateRows) {
            this.updateRows = updateRows;
            return this;
        }
        public Long getUpdateRows() {
            return this.updateRows;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setUseImciEngine(String useImciEngine) {
            this.useImciEngine = useImciEngine;
            return this;
        }
        public String getUseImciEngine() {
            return this.useImciEngine;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setVip(String vip) {
            this.vip = vip;
            return this;
        }
        public String getVip() {
            return this.vip;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setWrites(Long writes) {
            this.writes = writes;
            return this;
        }
        public Long getWrites() {
            return this.writes;
        }

    }

    public static class DescribeSqlLogRecordsResponseBodyDataItems extends TeaModel {
        @NameInMap("SQLLogRecord")
        public java.util.List<DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord> SQLLogRecord;

        public static DescribeSqlLogRecordsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlLogRecordsResponseBodyDataItems self = new DescribeSqlLogRecordsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public DescribeSqlLogRecordsResponseBodyDataItems setSQLLogRecord(java.util.List<DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord> SQLLogRecord) {
            this.SQLLogRecord = SQLLogRecord;
            return this;
        }
        public java.util.List<DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord> getSQLLogRecord() {
            return this.SQLLogRecord;
        }

    }

    public static class DescribeSqlLogRecordsResponseBodyData extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Finish")
        public String finish;

        @NameInMap("Items")
        public DescribeSqlLogRecordsResponseBodyDataItems items;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("TotalRecords")
        public Long totalRecords;

        public static DescribeSqlLogRecordsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlLogRecordsResponseBodyData self = new DescribeSqlLogRecordsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSqlLogRecordsResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeSqlLogRecordsResponseBodyData setFinish(String finish) {
            this.finish = finish;
            return this;
        }
        public String getFinish() {
            return this.finish;
        }

        public DescribeSqlLogRecordsResponseBodyData setItems(DescribeSqlLogRecordsResponseBodyDataItems items) {
            this.items = items;
            return this;
        }
        public DescribeSqlLogRecordsResponseBodyDataItems getItems() {
            return this.items;
        }

        public DescribeSqlLogRecordsResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeSqlLogRecordsResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeSqlLogRecordsResponseBodyData setTotalRecords(Long totalRecords) {
            this.totalRecords = totalRecords;
            return this;
        }
        public Long getTotalRecords() {
            return this.totalRecords;
        }

    }

}
