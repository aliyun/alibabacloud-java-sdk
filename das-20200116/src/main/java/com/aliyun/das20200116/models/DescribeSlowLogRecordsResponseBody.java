// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSlowLogRecordsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>DBLogRecords<SlowLogItem></p>
     */
    @NameInMap("Data")
    public DescribeSlowLogRecordsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>A1C79EE2-D04D-571B-8C60-961FAF8E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeSlowLogRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogRecordsResponseBody self = new DescribeSlowLogRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogRecordsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSlowLogRecordsResponseBody setData(DescribeSlowLogRecordsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSlowLogRecordsResponseBodyData getData() {
        return this.data;
    }

    public DescribeSlowLogRecordsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSlowLogRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlowLogRecordsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeSlowLogRecordsResponseBodyDataLogsSqlTag extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Comments")
        public String comments;

        /**
         * <p>sqlid。</p>
         * 
         * <strong>example:</strong>
         * <p>8ad7069f236bcdaaa9b3ae4b6299****</p>
         */
        @NameInMap("SqlId")
        public String sqlId;

        /**
         * <strong>example:</strong>
         * <p>DAS_IMPORTANT,DAS_IN_PLAN</p>
         */
        @NameInMap("Tags")
        public String tags;

        public static DescribeSlowLogRecordsResponseBodyDataLogsSqlTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseBodyDataLogsSqlTag self = new DescribeSlowLogRecordsResponseBodyDataLogsSqlTag();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsResponseBodyDataLogsSqlTag setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogsSqlTag setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogsSqlTag setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

    }

    public static class DescribeSlowLogRecordsResponseBodyDataLogs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>user1</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <strong>example:</strong>
         * <p>MyApp</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("CPUTime")
        public Double CPUTime;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CPUTimeSeconds")
        public Double CPUTimeSeconds;

        @NameInMap("ClientIp")
        public String clientIp;

        @NameInMap("Cmd")
        public String cmd;

        /**
         * <strong>example:</strong>
         * <p>SELECT</p>
         */
        @NameInMap("Command")
        public String command;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DBName")
        public String DBName;

        @NameInMap("DbId")
        public String dbId;

        /**
         * <strong>example:</strong>
         * <p>rm-2zebg30mk056g****</p>
         */
        @NameInMap("DbInstanceName")
        public String dbInstanceName;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DocsExamined")
        public String docsExamined;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Frows")
        public Long frows;

        /**
         * <strong>example:</strong>
         * <p>192.168.1.1</p>
         */
        @NameInMap("HostAddress")
        public String hostAddress;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IOWrites")
        public Long IOWrites;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("InsName")
        public String insName;

        /**
         * <strong>example:</strong>
         * <p>valueA</p>
         */
        @NameInMap("KeysExamined")
        public String keysExamined;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("LastRowsCountAffected")
        public Long lastRowsCountAffected;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("LockTime")
        public Double lockTime;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("LockTimeSeconds")
        public Double lockTimeSeconds;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LogicalIOReads")
        public Long logicalIOReads;

        /**
         * <strong>example:</strong>
         * <p>pro-test</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("OpType")
        public String opType;

        @NameInMap("OriginTime")
        public String originTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PhysicalIOReads")
        public Long physicalIOReads;

        /**
         * <strong>example:</strong>
         * <p>SELECT * FROM my_table WHERE ROWNUM &lt;= 10</p>
         */
        @NameInMap("Psql")
        public String psql;

        /**
         * <strong>example:</strong>
         * <p>sq-1pzcdMwRb</p>
         */
        @NameInMap("QueryId")
        public String queryId;

        /**
         * <strong>example:</strong>
         * <p>2024-04-01 11:00:00</p>
         */
        @NameInMap("QueryStartTime")
        public String queryStartTime;

        /**
         * <strong>example:</strong>
         * <p>121</p>
         */
        @NameInMap("QueryTime")
        public Long queryTime;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("QueryTimeSeconds")
        public Double queryTimeSeconds;

        @NameInMap("RequestSize")
        public Long requestSize;

        @NameInMap("ResponseSize")
        public Long responseSize;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ReturnItemNumbers")
        public String returnItemNumbers;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("ReturnNum")
        public String returnNum;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Rows")
        public Long rows;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RowsCountAffected")
        public Long rowsCountAffected;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("RowsExamined")
        public Long rowsExamined;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RowsSent")
        public Long rowsSent;

        @NameInMap("Rt")
        public Long rt;

        /**
         * <strong>example:</strong>
         * <p>SELECT * FROM my_table WHERE ROWNUM &lt;= 10</p>
         */
        @NameInMap("SQLText")
        public String SQLText;

        /**
         * <strong>example:</strong>
         * <p>HTTPS</p>
         */
        @NameInMap("Scheme")
        public String scheme;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Scnt")
        public Long scnt;

        /**
         * <strong>example:</strong>
         * <p>sqlId</p>
         */
        @NameInMap("SqlId")
        public String sqlId;

        @NameInMap("SqlTag")
        public DescribeSlowLogRecordsResponseBodyDataLogsSqlTag sqlTag;

        /**
         * <strong>example:</strong>
         * <p>SELECT</p>
         */
        @NameInMap("SqlType")
        public String sqlType;

        /**
         * <strong>example:</strong>
         * <p>r-8vb219d10038****</p>
         */
        @NameInMap("SubInstanceId")
        public String subInstanceId;

        /**
         * <strong>example:</strong>
         * <p>tableNameExample</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <strong>example:</strong>
         * <p>6a63b6ac4572abfaef7d1163f684****</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <strong>example:</strong>
         * <p>57472578</p>
         */
        @NameInMap("ThreadId")
        public String threadId;

        /**
         * <strong>example:</strong>
         * <p>1747118812</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <strong>example:</strong>
         * <p>074ce334-5247-40b9-b0c1-158aea5d****</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static DescribeSlowLogRecordsResponseBodyDataLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseBodyDataLogs self = new DescribeSlowLogRecordsResponseBodyDataLogs();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setCPUTime(Double CPUTime) {
            this.CPUTime = CPUTime;
            return this;
        }
        public Double getCPUTime() {
            return this.CPUTime;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setCPUTimeSeconds(Double CPUTimeSeconds) {
            this.CPUTimeSeconds = CPUTimeSeconds;
            return this;
        }
        public Double getCPUTimeSeconds() {
            return this.CPUTimeSeconds;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setCmd(String cmd) {
            this.cmd = cmd;
            return this;
        }
        public String getCmd() {
            return this.cmd;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setDbId(String dbId) {
            this.dbId = dbId;
            return this;
        }
        public String getDbId() {
            return this.dbId;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setDbInstanceName(String dbInstanceName) {
            this.dbInstanceName = dbInstanceName;
            return this;
        }
        public String getDbInstanceName() {
            return this.dbInstanceName;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setDocsExamined(String docsExamined) {
            this.docsExamined = docsExamined;
            return this;
        }
        public String getDocsExamined() {
            return this.docsExamined;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setFrows(Long frows) {
            this.frows = frows;
            return this;
        }
        public Long getFrows() {
            return this.frows;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setHostAddress(String hostAddress) {
            this.hostAddress = hostAddress;
            return this;
        }
        public String getHostAddress() {
            return this.hostAddress;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setIOWrites(Long IOWrites) {
            this.IOWrites = IOWrites;
            return this;
        }
        public Long getIOWrites() {
            return this.IOWrites;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setInsName(String insName) {
            this.insName = insName;
            return this;
        }
        public String getInsName() {
            return this.insName;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setKeysExamined(String keysExamined) {
            this.keysExamined = keysExamined;
            return this;
        }
        public String getKeysExamined() {
            return this.keysExamined;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setLastRowsCountAffected(Long lastRowsCountAffected) {
            this.lastRowsCountAffected = lastRowsCountAffected;
            return this;
        }
        public Long getLastRowsCountAffected() {
            return this.lastRowsCountAffected;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setLockTime(Double lockTime) {
            this.lockTime = lockTime;
            return this;
        }
        public Double getLockTime() {
            return this.lockTime;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setLockTimeSeconds(Double lockTimeSeconds) {
            this.lockTimeSeconds = lockTimeSeconds;
            return this;
        }
        public Double getLockTimeSeconds() {
            return this.lockTimeSeconds;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setLogicalIOReads(Long logicalIOReads) {
            this.logicalIOReads = logicalIOReads;
            return this;
        }
        public Long getLogicalIOReads() {
            return this.logicalIOReads;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setOpType(String opType) {
            this.opType = opType;
            return this;
        }
        public String getOpType() {
            return this.opType;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setOriginTime(String originTime) {
            this.originTime = originTime;
            return this;
        }
        public String getOriginTime() {
            return this.originTime;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setPhysicalIOReads(Long physicalIOReads) {
            this.physicalIOReads = physicalIOReads;
            return this;
        }
        public Long getPhysicalIOReads() {
            return this.physicalIOReads;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setPsql(String psql) {
            this.psql = psql;
            return this;
        }
        public String getPsql() {
            return this.psql;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setQueryId(String queryId) {
            this.queryId = queryId;
            return this;
        }
        public String getQueryId() {
            return this.queryId;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setQueryStartTime(String queryStartTime) {
            this.queryStartTime = queryStartTime;
            return this;
        }
        public String getQueryStartTime() {
            return this.queryStartTime;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setQueryTime(Long queryTime) {
            this.queryTime = queryTime;
            return this;
        }
        public Long getQueryTime() {
            return this.queryTime;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setQueryTimeSeconds(Double queryTimeSeconds) {
            this.queryTimeSeconds = queryTimeSeconds;
            return this;
        }
        public Double getQueryTimeSeconds() {
            return this.queryTimeSeconds;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setRequestSize(Long requestSize) {
            this.requestSize = requestSize;
            return this;
        }
        public Long getRequestSize() {
            return this.requestSize;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setResponseSize(Long responseSize) {
            this.responseSize = responseSize;
            return this;
        }
        public Long getResponseSize() {
            return this.responseSize;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setReturnItemNumbers(String returnItemNumbers) {
            this.returnItemNumbers = returnItemNumbers;
            return this;
        }
        public String getReturnItemNumbers() {
            return this.returnItemNumbers;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setReturnNum(String returnNum) {
            this.returnNum = returnNum;
            return this;
        }
        public String getReturnNum() {
            return this.returnNum;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setRows(Long rows) {
            this.rows = rows;
            return this;
        }
        public Long getRows() {
            return this.rows;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setRowsCountAffected(Long rowsCountAffected) {
            this.rowsCountAffected = rowsCountAffected;
            return this;
        }
        public Long getRowsCountAffected() {
            return this.rowsCountAffected;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setRowsExamined(Long rowsExamined) {
            this.rowsExamined = rowsExamined;
            return this;
        }
        public Long getRowsExamined() {
            return this.rowsExamined;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setRowsSent(Long rowsSent) {
            this.rowsSent = rowsSent;
            return this;
        }
        public Long getRowsSent() {
            return this.rowsSent;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setRt(Long rt) {
            this.rt = rt;
            return this;
        }
        public Long getRt() {
            return this.rt;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setScnt(Long scnt) {
            this.scnt = scnt;
            return this;
        }
        public Long getScnt() {
            return this.scnt;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setSqlTag(DescribeSlowLogRecordsResponseBodyDataLogsSqlTag sqlTag) {
            this.sqlTag = sqlTag;
            return this;
        }
        public DescribeSlowLogRecordsResponseBodyDataLogsSqlTag getSqlTag() {
            return this.sqlTag;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setSubInstanceId(String subInstanceId) {
            this.subInstanceId = subInstanceId;
            return this;
        }
        public String getSubInstanceId() {
            return this.subInstanceId;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setThreadId(String threadId) {
            this.threadId = threadId;
            return this;
        }
        public String getThreadId() {
            return this.threadId;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeSlowLogRecordsResponseBodyDataLogs setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class DescribeSlowLogRecordsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DbInstanceId")
        public Long dbInstanceId;

        /**
         * <strong>example:</strong>
         * <p>rm-bp157g54vy772****</p>
         */
        @NameInMap("DbInstanceName")
        public String dbInstanceName;

        /**
         * <strong>example:</strong>
         * <p>1672617600000</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ItemsNumbers")
        public Long itemsNumbers;

        @NameInMap("Logs")
        public java.util.List<DescribeSlowLogRecordsResponseBodyDataLogs> logs;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxRecordsPerPage")
        public Integer maxRecordsPerPage;

        /**
         * <strong>example:</strong>
         * <p>node123</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumbers")
        public Integer pageNumbers;

        /**
         * <strong>example:</strong>
         * <p>1672531200000</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalRecords")
        public Long totalRecords;

        public static DescribeSlowLogRecordsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogRecordsResponseBodyData self = new DescribeSlowLogRecordsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogRecordsResponseBodyData setDbInstanceId(Long dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        public Long getDbInstanceId() {
            return this.dbInstanceId;
        }

        public DescribeSlowLogRecordsResponseBodyData setDbInstanceName(String dbInstanceName) {
            this.dbInstanceName = dbInstanceName;
            return this;
        }
        public String getDbInstanceName() {
            return this.dbInstanceName;
        }

        public DescribeSlowLogRecordsResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeSlowLogRecordsResponseBodyData setItemsNumbers(Long itemsNumbers) {
            this.itemsNumbers = itemsNumbers;
            return this;
        }
        public Long getItemsNumbers() {
            return this.itemsNumbers;
        }

        public DescribeSlowLogRecordsResponseBodyData setLogs(java.util.List<DescribeSlowLogRecordsResponseBodyDataLogs> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<DescribeSlowLogRecordsResponseBodyDataLogs> getLogs() {
            return this.logs;
        }

        public DescribeSlowLogRecordsResponseBodyData setMaxRecordsPerPage(Integer maxRecordsPerPage) {
            this.maxRecordsPerPage = maxRecordsPerPage;
            return this;
        }
        public Integer getMaxRecordsPerPage() {
            return this.maxRecordsPerPage;
        }

        public DescribeSlowLogRecordsResponseBodyData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeSlowLogRecordsResponseBodyData setPageNumbers(Integer pageNumbers) {
            this.pageNumbers = pageNumbers;
            return this;
        }
        public Integer getPageNumbers() {
            return this.pageNumbers;
        }

        public DescribeSlowLogRecordsResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeSlowLogRecordsResponseBodyData setTotalRecords(Long totalRecords) {
            this.totalRecords = totalRecords;
            return this;
        }
        public Long getTotalRecords() {
            return this.totalRecords;
        }

    }

}
