// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSqlLogTaskResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeSqlLogTaskResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>>  If the request was successful, **Successful** is returned. If the request failed, an error message is returned.</p>
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
         * <br>
         * <p>>  For more information about the filter parameters, see the **Valid values of Key** section of this topic.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter parameter.</p>
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
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The execution duration. Unit: millisecond.</p>
         */
        @NameInMap("Consume")
        public Long consume;

        /**
         * <p>The CPU execution time. Unit: microsecond.</p>
         */
        @NameInMap("CpuTime")
        public Long cpuTime;

        /**
         * <p>The database name.</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <p>The execution time. The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time is displayed in UTC.</p>
         */
        @NameInMap("ExecuteTime")
        public String executeTime;

        /**
         * <p>The extended information. This parameter is a reserved parameter.</p>
         */
        @NameInMap("Ext")
        public String ext;

        /**
         * <p>The number of rows pulled by the CNs of the PolarDB-X 2.0 instance.</p>
         */
        @NameInMap("Frows")
        public Long frows;

        /**
         * <p>The IP address of the client.</p>
         */
        @NameInMap("HostAddress")
        public String hostAddress;

        /**
         * <p>The lock wait time. Unit: millisecond.</p>
         */
        @NameInMap("LockTime")
        public Long lockTime;

        /**
         * <p>The number of logical reads.</p>
         */
        @NameInMap("LogicRead")
        public Long logicRead;

        /**
         * <p>The ID of the child node.</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The execution timestamp. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("OriginTime")
        public Long originTime;

        /**
         * <p>The wait time of parallel queries in the queue in the PolarDB for MySQL instance. Unit: millisecond.</p>
         */
        @NameInMap("ParallelDegree")
        public String parallelDegree;

        /**
         * <p>The degree of parallelism (DOP) value of the PolarDB for MySQL instance.</p>
         */
        @NameInMap("ParallelQueueTime")
        public String parallelQueueTime;

        /**
         * <p>The number of physical asynchronous reads.</p>
         */
        @NameInMap("PhysicAsyncRead")
        public Long physicAsyncRead;

        /**
         * <p>The total number of physical reads.</p>
         */
        @NameInMap("PhysicRead")
        public Long physicRead;

        /**
         * <p>The number of physical synchronous reads.</p>
         */
        @NameInMap("PhysicSyncRead")
        public Long physicSyncRead;

        /**
         * <p>The number of rows returned.</p>
         */
        @NameInMap("ReturnRows")
        public Long returnRows;

        /**
         * <p>The total number of rows updated or returned by the CNs of the PolarDB-X 2.0 instance.</p>
         */
        @NameInMap("Rows")
        public Long rows;

        /**
         * <p>The number of rows scanned.</p>
         */
        @NameInMap("ScanRows")
        public Long scanRows;

        /**
         * <p>The number of requests from the compute nodes (CNs) to the data nodes (DNs) in the PolarDB-X 2.0 instance.</p>
         */
        @NameInMap("Scnt")
        public Long scnt;

        /**
         * <p>The ID of the SQL statement.</p>
         */
        @NameInMap("SqlId")
        public String sqlId;

        /**
         * <p>The queried SQL statement.</p>
         */
        @NameInMap("SqlText")
        public String sqlText;

        /**
         * <p>The type of the SQL statement. Valid values:</p>
         * <br>
         * <p>*   **SELECT**</p>
         * <p>*   **UPDATE**</p>
         * <p>*   **DELETE**</p>
         */
        @NameInMap("SqlType")
        public String sqlType;

        /**
         * <p>The execution result of the SQL statement. Valid values:</p>
         * <br>
         * <p>*   **0**: The execution was successful.</p>
         * <p>*   **1**: The execution failed.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The thread ID.</p>
         */
        @NameInMap("ThreadId")
        public Long threadId;

        /**
         * <p>The trace ID of the PolarDB-X 2.0 instance, which is the execution ID of the SQL statement on the DN.</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        /**
         * <p>The transaction ID.</p>
         */
        @NameInMap("TrxId")
        public String trxId;

        /**
         * <p>The number of rows updated.</p>
         */
        @NameInMap("UpdateRows")
        public Long updateRows;

        /**
         * <p>Indicates whether the PolarDB for MySQL instance uses In-Memory Column Indexes (IMCIs). Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("UseImciEngine")
        public String useImciEngine;

        /**
         * <p>The IP address to which the endpoint used for query is resolved.</p>
         */
        @NameInMap("Vip")
        public String vip;

        /**
         * <p>The number of writes to the ApsaraDB RDS for SQL Server instance.</p>
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

        public DescribeSqlLogTaskResponseBodyDataQueries setReturnRows(Long returnRows) {
            this.returnRows = returnRows;
            return this;
        }
        public Long getReturnRows() {
            return this.returnRows;
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
         * <p>The time when the task was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The end of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("End")
        public Long end;

        /**
         * <p>Indicates whether the task has expired. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Expire")
        public Boolean expire;

        /**
         * <p>The download URL of the export task.</p>
         */
        @NameInMap("Export")
        public String export;

        /**
         * <p>The filter parameters.</p>
         */
        @NameInMap("Filters")
        public java.util.List<DescribeSqlLogTaskResponseBodyDataFilters> filters;

        /**
         * <p>The task name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The results of the offline querying task.</p>
         */
        @NameInMap("Queries")
        public java.util.List<DescribeSqlLogTaskResponseBodyDataQueries> queries;

        /**
         * <p>The beginning of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("Start")
        public Long start;

        /**
         * <p>The task state. Valid values:</p>
         * <br>
         * <p>*   **INIT**: The task is to be scheduled.</p>
         * <p>*   **RUNNING**: The task is running.</p>
         * <p>*   **FAILED**: The task failed.</p>
         * <p>*   **CANCELED**: The task is canceled.</p>
         * <p>*   **COMPLETED**: The task is complete.</p>
         * <br>
         * <p>>  If a task is in the **COMPLETED** state, you can view the results of the task.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The task ID.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The task type. Valid values:</p>
         * <br>
         * <p>*   **Export**</p>
         * <p>*   **Query**</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The total number of tasks.</p>
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
