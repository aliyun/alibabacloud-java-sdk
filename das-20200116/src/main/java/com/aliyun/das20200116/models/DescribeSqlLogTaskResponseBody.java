// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSqlLogTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    /**
     * <p>SqlLogTaskDetail</p>
     */
    @NameInMap("Data")
    public DescribeSqlLogTaskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Key")
        public String key;

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
        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("Consume")
        public Long consume;

        @NameInMap("CpuTime")
        public Long cpuTime;

        @NameInMap("DBName")
        public String DBName;

        /**
         * <p>yyyy-MM-dd\\"T\\"HH:mm:ss.SSS\\"Z\\"</p>
         */
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

        /**
         * <p>ts unix</p>
         */
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

        public DescribeSqlLogTaskResponseBodyDataQueries setTrxId(Long trxId) {
            this.trxId = trxId;
            return this;
        }
        public Long getTrxId() {
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
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("End")
        public Long end;

        @NameInMap("Expire")
        public Boolean expire;

        @NameInMap("Export")
        public String export;

        @NameInMap("Filters")
        public java.util.List<DescribeSqlLogTaskResponseBodyDataFilters> filters;

        @NameInMap("Name")
        public String name;

        @NameInMap("Queries")
        public java.util.List<DescribeSqlLogTaskResponseBodyDataQueries> queries;

        @NameInMap("Start")
        public Long start;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskType")
        public String taskType;

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
