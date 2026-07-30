// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSqlLogRecordsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
     * <blockquote>
     * <p>If the request is successful, <strong>Successful</strong> is returned. Otherwise, an error message is returned.</p>
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
     * <p>F43E7FB3-CE67-5FFD-A59C-EFD278BCD7BE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The database account.</p>
         * 
         * <strong>example:</strong>
         * <p>testname</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The affected columns.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;col1&quot;]</p>
         */
        @NameInMap("AffectColumns")
        public String affectColumns;

        /**
         * <p>The client IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.1xx</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <p>The client port.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("ClientPort")
        public Long clientPort;

        /**
         * <p>This parameter is reserved.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Collection")
        public String collection;

        /**
         * <p>The connection ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ld-******</p>
         */
        @NameInMap("ConnectionId")
        public String connectionId;

        /**
         * <p>The execution duration. Unit: microseconds (μs).</p>
         * 
         * <strong>example:</strong>
         * <p>58</p>
         */
        @NameInMap("Consume")
        public Long consume;

        /**
         * <p>The CPU execution time. Unit: microseconds (μs).</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CpuTime")
        public Long cpuTime;

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>testdb</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <p>The execution time. The time is in UTC. Format: <code>yyyy-MM-ddTHH:mm:ssZ</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-07T02:15:32Z</p>
         */
        @NameInMap("ExecuteTime")
        public String executeTime;

        /**
         * <p>The extended information. This parameter is reserved.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Ext")
        public String ext;

        /**
         * <p>The number of rows fetched by the compute node (CN) in a PolarDB-X 2.0 instance.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Frows")
        public Long frows;

        /**
         * <p>The client IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>11.197.XX.XX</p>
         */
        @NameInMap("HostAddress")
        public String hostAddress;

        /**
         * <p>The lock wait time. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LockTime")
        public Long lockTime;

        /**
         * <p>The number of logical reads.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LogicRead")
        public Long logicRead;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pi-uf6k5f6g3912i****</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The execution time. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1701886532000</p>
         */
        @NameInMap("OriginTime")
        public Long originTime;

        /**
         * <p>The degree of parallelism (DOP) for the PolarDB for MySQL instance.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ParallelDegree")
        public String parallelDegree;

        /**
         * <p>The parallel queue time for the PolarDB for MySQL instance. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ParallelQueueTime")
        public String parallelQueueTime;

        /**
         * <p>The SQL parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>[1, &quot;das&quot;]</p>
         */
        @NameInMap("Params")
        public String params;

        /**
         * <p>The number of asynchronous physical reads.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PhysicAsyncRead")
        public Long physicAsyncRead;

        /**
         * <p>The number of physical reads.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PhysicRead")
        public Long physicRead;

        /**
         * <p>The number of synchronous physical reads.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PhysicSyncRead")
        public Long physicSyncRead;

        /**
         * <p>The protocol type.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The number of returned rows.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ReturnRows")
        public Long returnRows;

        /**
         * <p>The row key of the SQL log record.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("RowKey")
        public String rowKey;

        /**
         * <p>The total number of rows updated or returned by the compute node (CN) of a PolarDB-X 2.0 instance.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Rows")
        public Long rows;

        /**
         * <p>The number of scanned rows.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ScanRows")
        public Long scanRows;

        /**
         * <p>The number of requests sent from a compute node (CN) to data nodes (DNs) in a PolarDB-X 2.0 instance.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Scnt")
        public Long scnt;

        /**
         * <p>The SQL ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c67649d4a7fb62c4f8c7a447c52b5b17</p>
         */
        @NameInMap("SqlId")
        public String sqlId;

        /**
         * <p>The SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>select resource_id as cluster_id, tpl_name \n\tfrom dbfree_alert_resource_tpl_ref\n\twhere user_id=? and type=\&quot;cluster\&quot; group by resource_id, tpl_name</p>
         */
        @NameInMap("SqlText")
        public String sqlText;

        /**
         * <p>The type of the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>select</p>
         */
        @NameInMap("SqlType")
        public String sqlType;

        /**
         * <p>The execution status. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: The execution was successful.</p>
         * </li>
         * <li><p><strong>1</strong>: The execution failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The name of the table that the SQL statement references.</p>
         * 
         * <strong>example:</strong>
         * <p>das</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The thread ID.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("ThreadId")
        public Long threadId;

        /**
         * <p>The trace ID for a PolarDB-X 2.0 instance. This is the ID of the SQL statement that was executed on a data node (DN).</p>
         * 
         * <strong>example:</strong>
         * <p>14c93b7c7bf00000</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        /**
         * <p>The transaction ID.</p>
         * 
         * <strong>example:</strong>
         * <p>200000</p>
         */
        @NameInMap("TrxId")
        public String trxId;

        /**
         * <p>The number of updated rows.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("UpdateRows")
        public Long updateRows;

        /**
         * <p>Indicates whether an In-Memory Column Index (IMCI) is used for the PolarDB for MySQL instance.</p>
         * <ul>
         * <li><p><strong>true</strong></p>
         * </li>
         * <li><p><strong>false</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("UseImciEngine")
        public String useImciEngine;

        /**
         * <p>The endpoint that is resolved from the query connection string.</p>
         * 
         * <strong>example:</strong>
         * <p>100.115.XX.XX</p>
         */
        @NameInMap("Vip")
        public String vip;

        /**
         * <p>The number of write operations on an ApsaraDB RDS for SQL Server instance.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setAffectColumns(String affectColumns) {
            this.affectColumns = affectColumns;
            return this;
        }
        public String getAffectColumns() {
            return this.affectColumns;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setClientPort(Long clientPort) {
            this.clientPort = clientPort;
            return this;
        }
        public Long getClientPort() {
            return this.clientPort;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setCollection(String collection) {
            this.collection = collection;
            return this;
        }
        public String getCollection() {
            return this.collection;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setConnectionId(String connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public String getConnectionId() {
            return this.connectionId;
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

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
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

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setReturnRows(Long returnRows) {
            this.returnRows = returnRows;
            return this;
        }
        public Long getReturnRows() {
            return this.returnRows;
        }

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setRowKey(String rowKey) {
            this.rowKey = rowKey;
            return this;
        }
        public String getRowKey() {
            return this.rowKey;
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

        public DescribeSqlLogRecordsResponseBodyDataItemsSQLLogRecord setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
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
         * <p>The end time of the query. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1608888296000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>Indicates whether the task is complete. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: The task is in progress.</p>
         * </li>
         * <li><p><strong>1</strong>: The task is complete.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If this parameter is <strong>0</strong> and the <strong>JobId</strong> parameter is returned, the current request is an asynchronous request and you cannot obtain the returned results. You must use the value of <strong>JobId</strong> to initiate another request. Set the <strong>Filters</strong> parameter to the value of <strong>JobId</strong>. Example: <code>Filters=[{&quot;Key&quot;: &quot;JobId&quot;, &quot;Value&quot;: &quot;******&quot;}]</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Finish")
        public String finish;

        /**
         * <p>The details of the SQL logs.</p>
         */
        @NameInMap("Items")
        public DescribeSqlLogRecordsResponseBodyDataItems items;

        /**
         * <p>The asynchronous task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>MzI4NTZfUUlOR0RBT19DTTlfTlUyMF9NWVNRTF9PREJTX0xWU18zMjg1Nl9teXNxbF9XZWQgTWFyIDA2IDE0OjUwOjQ3IENTVCAyMDI0XzBfMzBfRXhlY3V0ZVRpbWVfREVTQ19XZWQgTWFyIDA2IDE0OjM1OjQ3IENTVCAyMDI0Xw==_1709708406465</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The start time of the query. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1596177993000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
