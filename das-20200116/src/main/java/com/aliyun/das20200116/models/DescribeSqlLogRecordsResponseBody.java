// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSqlLogRecordsResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeSqlLogRecordsResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>>  If the request was successful, **Successful** is returned. If the request failed, error information such as an error code is returned.</p>
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
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
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
        /**
         * <p>The account of the database.</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>This is a reserved parameter.</p>
         */
        @NameInMap("Collection")
        public String collection;

        /**
         * <p>The duration of the query. Unit: milliseconds.</p>
         */
        @NameInMap("Consume")
        public Long consume;

        /**
         * <p>The CPU execution duration. Unit: microseconds.</p>
         */
        @NameInMap("CpuTime")
        public Long cpuTime;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <p>The time when the query was performed. The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time is displayed in UTC.</p>
         */
        @NameInMap("ExecuteTime")
        public String executeTime;

        /**
         * <p>The extended information. This parameter is a reserved parameter.</p>
         */
        @NameInMap("Ext")
        public String ext;

        /**
         * <p>The number of rows that are pulled by the compute nodes of the PolarDB-X 2.0 database instance.</p>
         */
        @NameInMap("Frows")
        public Long frows;

        /**
         * <p>The IP address of the client.</p>
         */
        @NameInMap("HostAddress")
        public String hostAddress;

        /**
         * <p>The lock wait duration. Unit: milliseconds.</p>
         */
        @NameInMap("LockTime")
        public Long lockTime;

        /**
         * <p>The number of logical reads.</p>
         */
        @NameInMap("LogicRead")
        public Long logicRead;

        /**
         * <p>The node ID.</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The time when the query was performed. The value of this parameter is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("OriginTime")
        public Long originTime;

        /**
         * <p>The parallel queue time of the PolarDB for MySQL instance. Unit: milliseconds.</p>
         */
        @NameInMap("ParallelDegree")
        public String parallelDegree;

        /**
         * <p>The parallelism of the PolarDB for MySQL instance.</p>
         */
        @NameInMap("ParallelQueueTime")
        public String parallelQueueTime;

        /**
         * <p>The number of physical asynchronous reads.</p>
         */
        @NameInMap("PhysicAsyncRead")
        public Long physicAsyncRead;

        /**
         * <p>The number of physical reads.</p>
         */
        @NameInMap("PhysicRead")
        public Long physicRead;

        /**
         * <p>The number of physical synchronous reads.</p>
         */
        @NameInMap("PhysicSyncRead")
        public Long physicSyncRead;

        /**
         * <p>The number of rows that are returned.</p>
         */
        @NameInMap("ReturnRows")
        public Long returnRows;

        /**
         * <p>The total number of rows that are updated or returned by the compute nodes of the PolarDB-X 2.0 database instance.</p>
         */
        @NameInMap("Rows")
        public Long rows;

        /**
         * <p>The number of rows that are scanned.</p>
         */
        @NameInMap("ScanRows")
        public Long scanRows;

        /**
         * <p>The number of requests that are sent to the data nodes by the compute nodes of the PolarDB-X 2.0 database instance.</p>
         */
        @NameInMap("Scnt")
        public Long scnt;

        /**
         * <p>The SQL statement ID.</p>
         */
        @NameInMap("SqlId")
        public String sqlId;

        /**
         * <p>The SQL statement.</p>
         */
        @NameInMap("SqlText")
        public String sqlText;

        /**
         * <p>The type of the SQL statement.</p>
         */
        @NameInMap("SqlType")
        public String sqlType;

        /**
         * <p>The state of the query. Valid values:</p>
         * <br>
         * <p>*   **0**: The query was successful.</p>
         * <p>*   **1**: The query failed to be performed.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The thread ID.</p>
         */
        @NameInMap("ThreadId")
        public Long threadId;

        /**
         * <p>The trace ID of the PolarDB-X 2.0 database instance. The value is the execution ID of the SQL statement on the data nodes.</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        /**
         * <p>The transaction ID.</p>
         */
        @NameInMap("TrxId")
        public String trxId;

        /**
         * <p>The number of rows that are updated.</p>
         */
        @NameInMap("UpdateRows")
        public Long updateRows;

        /**
         * <p>Indicates whether the In-Memory Column Index (IMCI) feature is enabled for the PolarDB for MySQL instance. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("UseImciEngine")
        public String useImciEngine;

        /**
         * <p>The IP address that is resolved from the endpoint of the query link.</p>
         */
        @NameInMap("Vip")
        public String vip;

        /**
         * <p>The number of writes that are performed by the ApsaraDB RDS for SQL Server engine.</p>
         */
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

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setTrxId(String trxId) {
            this.trxId = trxId;
            return this;
        }
        public String getTrxId() {
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
        /**
         * <p>The SQL log data.</p>
         */
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
        /**
         * <p>The end of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>Indicates whether the task was complete. Valid values:</p>
         * <br>
         * <p>*   **0**: The task failed.</p>
         * <p>*   **1**: The task was complete.</p>
         * <br>
         * <p>>  If the value of **Finish** is 0 and the value of **JobId** is returned, the request is an asynchronous request and the return result cannot be directly obtained. You must query the return result by using the value of **JobId**. Specify JobId as the key of **Filters** and the value of **JobId** as the value of Filters. Example: `Filters=[{"Key": "JobId", "Value": "******"}]`.</p>
         */
        @NameInMap("Finish")
        public String finish;

        /**
         * <p>The data.</p>
         */
        @NameInMap("Items")
        public DescribeSqlLogRecordsResponseBodyDataItems items;

        /**
         * <p>The ID of the asynchronous task.</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The beginning of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The total number of entries returned.</p>
         */
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
