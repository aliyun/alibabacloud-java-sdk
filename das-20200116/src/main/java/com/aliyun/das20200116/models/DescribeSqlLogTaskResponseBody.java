// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSqlLogTaskResponseBody extends TeaModel {
    /**
     * <p>The returned HTTP status code.</p>
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
    public DescribeSqlLogTaskResponseBodyData data;

    /**
     * <p>The response message.</p>
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
     * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
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

    public static DescribeSqlLogTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlLogTaskResponseBody self = new DescribeSqlLogTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSqlLogTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSqlLogTaskResponseBody setData(DescribeSqlLogTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSqlLogTaskResponseBodyData getData() {
        return this.data;
    }

    public DescribeSqlLogTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSqlLogTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSqlLogTaskResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeSqlLogTaskResponseBodyDataFilters extends TeaModel {
        /**
         * <p>The name of the filter parameter.</p>
         * <blockquote>
         * <p>For more information about the supported filter parameters and their valid values, see the &quot;Additional information about response parameters&quot; section.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>keyWords</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>select</p>
         */
        @NameInMap("Value")
        public Object value;

        public static DescribeSqlLogTaskResponseBodyDataFilters build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlLogTaskResponseBodyDataFilters self = new DescribeSqlLogTaskResponseBodyDataFilters();
            return TeaModel.build(map, self);
        }

        public DescribeSqlLogTaskResponseBodyDataFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeSqlLogTaskResponseBodyDataFilters setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

    public static class DescribeSqlLogTaskResponseBodyDataQueries extends TeaModel {
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
         * <p>The execution duration. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>58</p>
         */
        @NameInMap("Consume")
        public Long consume;

        /**
         * <p>The CPU execution time. Unit: microseconds.</p>
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
         * <p>testdb01</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <p>The time when the SQL statement was executed. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-07T02:15:32Z</p>
         */
        @NameInMap("ExecuteTime")
        public String executeTime;

        /**
         * <p>Reserved for future use.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Ext")
        public String ext;

        /**
         * <p>The number of rows that are fetched by the compute nodes of a PolarDB-X 2.0 instance.</p>
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
         * <p>pi-bp1o58x3ib7e6****</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The time when the SQL statement was executed. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
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
         * <p>The parallel queuing time for the PolarDB for MySQL instance. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ParallelQueueTime")
        public String parallelQueueTime;

        /**
         * <p>The query parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>[1, &quot;das&quot;]</p>
         */
        @NameInMap("Params")
        public String params;

        /**
         * <p>The number of physical asynchronous reads.</p>
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
         * <p>The number of physical synchronous reads.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PhysicSyncRead")
        public Long physicSyncRead;

        /**
         * <p>Indicates whether the query is protected.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("Protected")
        public String _protected;

        /**
         * <p>The number of returned rows.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ReturnRows")
        public Long returnRows;

        /**
         * <p>The row key.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("RowKey")
        public String rowKey;

        /**
         * <p>The total number of rows that are updated or returned by the compute nodes of a PolarDB-X 2.0 instance.</p>
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
         * <p>The number of requests that are sent from compute nodes (CNs) to data nodes (DNs) for a PolarDB-X 2.0 instance.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Scnt")
        public Long scnt;

        /**
         * <p>The SQL command in the query.</p>
         * 
         * <strong>example:</strong>
         * <p>sql</p>
         */
        @NameInMap("SqlCommand")
        public Long sqlCommand;

        /**
         * <p>The SQL ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a4111670e80596c5bf42cf5154438a91</p>
         */
        @NameInMap("SqlId")
        public String sqlId;

        /**
         * <p>The SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT @@session.transaction_read_only</p>
         */
        @NameInMap("SqlText")
        public String sqlText;

        /**
         * <p>The type of the SQL statement. Valid values:</p>
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
         * <p>The execution state. Valid values:</p>
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
         * <p>The table name.</p>
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
         * <p>The trace ID of a PolarDB-X 2.0 instance. The trace ID is the execution ID of the SQL statement on data nodes.</p>
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
         * <p>Indicates whether an In-Memory Column Index (IMCI) is used for the PolarDB for MySQL instance. Valid values:</p>
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
         * <p>The IP address that the query endpoint resolves to.</p>
         * 
         * <strong>example:</strong>
         * <p>10.146.XX.XX</p>
         */
        @NameInMap("Vip")
        public String vip;

        /**
         * <p>The number of writes for the ApsaraDB RDS for SQL Server instance.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Writes")
        public Long writes;

        public static DescribeSqlLogTaskResponseBodyDataQueries build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlLogTaskResponseBodyDataQueries self = new DescribeSqlLogTaskResponseBodyDataQueries();
            return TeaModel.build(map, self);
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setAffectColumns(String affectColumns) {
            this.affectColumns = affectColumns;
            return this;
        }
        public String getAffectColumns() {
            return this.affectColumns;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setClientPort(Long clientPort) {
            this.clientPort = clientPort;
            return this;
        }
        public Long getClientPort() {
            return this.clientPort;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setCollection(String collection) {
            this.collection = collection;
            return this;
        }
        public String getCollection() {
            return this.collection;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setConnectionId(String connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public String getConnectionId() {
            return this.connectionId;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setConsume(Long consume) {
            this.consume = consume;
            return this;
        }
        public Long getConsume() {
            return this.consume;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setCpuTime(Long cpuTime) {
            this.cpuTime = cpuTime;
            return this;
        }
        public Long getCpuTime() {
            return this.cpuTime;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setExecuteTime(String executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public String getExecuteTime() {
            return this.executeTime;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setFrows(Long frows) {
            this.frows = frows;
            return this;
        }
        public Long getFrows() {
            return this.frows;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setHostAddress(String hostAddress) {
            this.hostAddress = hostAddress;
            return this;
        }
        public String getHostAddress() {
            return this.hostAddress;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setLockTime(Long lockTime) {
            this.lockTime = lockTime;
            return this;
        }
        public Long getLockTime() {
            return this.lockTime;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setLogicRead(Long logicRead) {
            this.logicRead = logicRead;
            return this;
        }
        public Long getLogicRead() {
            return this.logicRead;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setOriginTime(Long originTime) {
            this.originTime = originTime;
            return this;
        }
        public Long getOriginTime() {
            return this.originTime;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setParallelDegree(String parallelDegree) {
            this.parallelDegree = parallelDegree;
            return this;
        }
        public String getParallelDegree() {
            return this.parallelDegree;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setParallelQueueTime(String parallelQueueTime) {
            this.parallelQueueTime = parallelQueueTime;
            return this;
        }
        public String getParallelQueueTime() {
            return this.parallelQueueTime;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setPhysicAsyncRead(Long physicAsyncRead) {
            this.physicAsyncRead = physicAsyncRead;
            return this;
        }
        public Long getPhysicAsyncRead() {
            return this.physicAsyncRead;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setPhysicRead(Long physicRead) {
            this.physicRead = physicRead;
            return this;
        }
        public Long getPhysicRead() {
            return this.physicRead;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setPhysicSyncRead(Long physicSyncRead) {
            this.physicSyncRead = physicSyncRead;
            return this;
        }
        public Long getPhysicSyncRead() {
            return this.physicSyncRead;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries set_protected(String _protected) {
            this._protected = _protected;
            return this;
        }
        public String get_protected() {
            return this._protected;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setReturnRows(Long returnRows) {
            this.returnRows = returnRows;
            return this;
        }
        public Long getReturnRows() {
            return this.returnRows;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setRowKey(String rowKey) {
            this.rowKey = rowKey;
            return this;
        }
        public String getRowKey() {
            return this.rowKey;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setRows(Long rows) {
            this.rows = rows;
            return this;
        }
        public Long getRows() {
            return this.rows;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setScanRows(Long scanRows) {
            this.scanRows = scanRows;
            return this;
        }
        public Long getScanRows() {
            return this.scanRows;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setScnt(Long scnt) {
            this.scnt = scnt;
            return this;
        }
        public Long getScnt() {
            return this.scnt;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setSqlCommand(Long sqlCommand) {
            this.sqlCommand = sqlCommand;
            return this;
        }
        public Long getSqlCommand() {
            return this.sqlCommand;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setSqlText(String sqlText) {
            this.sqlText = sqlText;
            return this;
        }
        public String getSqlText() {
            return this.sqlText;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setThreadId(Long threadId) {
            this.threadId = threadId;
            return this;
        }
        public Long getThreadId() {
            return this.threadId;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setTrxId(String trxId) {
            this.trxId = trxId;
            return this;
        }
        public String getTrxId() {
            return this.trxId;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setUpdateRows(Long updateRows) {
            this.updateRows = updateRows;
            return this;
        }
        public Long getUpdateRows() {
            return this.updateRows;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setUseImciEngine(String useImciEngine) {
            this.useImciEngine = useImciEngine;
            return this;
        }
        public String getUseImciEngine() {
            return this.useImciEngine;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setVip(String vip) {
            this.vip = vip;
            return this;
        }
        public String getVip() {
            return this.vip;
        }

        public DescribeSqlLogTaskResponseBodyDataQueries setWrites(Long writes) {
            this.writes = writes;
            return this;
        }
        public Long getWrites() {
            return this.writes;
        }

    }

    public static class DescribeSqlLogTaskResponseBodyData extends TeaModel {
        /**
         * <p>The time when the task was created, which is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1681363254423</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The end of the query time range, which is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1608888296000</p>
         */
        @NameInMap("End")
        public Long end;

        /**
         * <p>Indicates whether the task has expired. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The task has expired.</p>
         * </li>
         * <li><p><strong>false</strong>: The task has not expired.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Expire")
        public Boolean expire;

        /**
         * <p>The download URL of the exported file. This parameter is returned only if the value of <code>TaskType</code> is <code>Export</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;<a href="https://das-sqllog-download-cn-hongkong.oss-cn-hongkong.aliyuncs.com/">https://das-sqllog-download-cn-hongkong.oss-cn-hongkong.aliyuncs.com/</a>****&quot;</p>
         */
        @NameInMap("Export")
        public String export;

        /**
         * <p>The filter conditions.</p>
         */
        @NameInMap("Filters")
        public java.util.List<DescribeSqlLogTaskResponseBodyDataFilters> filters;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>SQL audit export 1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The results of the offline query task. This parameter is returned only if the value of <code>TaskType</code> is <code>Query</code>.</p>
         */
        @NameInMap("Queries")
        public java.util.List<DescribeSqlLogTaskResponseBodyDataQueries> queries;

        /**
         * <p>The beginning of the query time range, which is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1596177993000</p>
         */
        @NameInMap("Start")
        public Long start;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li><p><strong>INIT</strong>: The task is pending.</p>
         * </li>
         * <li><p><strong>RUNNING</strong>: The task is running.</p>
         * </li>
         * <li><p><strong>FAILED</strong>: The task failed.</p>
         * </li>
         * <li><p><strong>CANCELED</strong>: The task was canceled.</p>
         * </li>
         * <li><p><strong>COMPLETED</strong>: The task is complete.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The results of an offline task are available only when the status is <strong>COMPLETED</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9a4f5c4494dbd6713185d87a97aa53e8</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li><p><strong>Export</strong>: an export task.</p>
         * </li>
         * <li><p><strong>Query</strong>: a query task.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Query</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The total number of tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Total")
        public Long total;

        public static DescribeSqlLogTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlLogTaskResponseBodyData self = new DescribeSqlLogTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSqlLogTaskResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeSqlLogTaskResponseBodyData setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public DescribeSqlLogTaskResponseBodyData setExpire(Boolean expire) {
            this.expire = expire;
            return this;
        }
        public Boolean getExpire() {
            return this.expire;
        }

        public DescribeSqlLogTaskResponseBodyData setExport(String export) {
            this.export = export;
            return this;
        }
        public String getExport() {
            return this.export;
        }

        public DescribeSqlLogTaskResponseBodyData setFilters(java.util.List<DescribeSqlLogTaskResponseBodyDataFilters> filters) {
            this.filters = filters;
            return this;
        }
        public java.util.List<DescribeSqlLogTaskResponseBodyDataFilters> getFilters() {
            return this.filters;
        }

        public DescribeSqlLogTaskResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSqlLogTaskResponseBodyData setQueries(java.util.List<DescribeSqlLogTaskResponseBodyDataQueries> queries) {
            this.queries = queries;
            return this;
        }
        public java.util.List<DescribeSqlLogTaskResponseBodyDataQueries> getQueries() {
            return this.queries;
        }

        public DescribeSqlLogTaskResponseBodyData setStart(Long start) {
            this.start = start;
            return this;
        }
        public Long getStart() {
            return this.start;
        }

        public DescribeSqlLogTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSqlLogTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeSqlLogTaskResponseBodyData setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public DescribeSqlLogTaskResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
