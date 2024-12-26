// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSlowLogStatisticResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>AsyncResult&lt;DBLogRecords<SlowLogStat>&gt;</p>
     */
    @NameInMap("Data")
    public DescribeSlowLogStatisticResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>52D540CF-C517-1F57-BB42-9035F96******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeSlowLogStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogStatisticResponseBody self = new DescribeSlowLogStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogStatisticResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSlowLogStatisticResponseBody setData(DescribeSlowLogStatisticResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSlowLogStatisticResponseBodyData getData() {
        return this.data;
    }

    public DescribeSlowLogStatisticResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSlowLogStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlowLogStatisticResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeSlowLogStatisticResponseBodyDataDataLogsHistogramItem extends TeaModel {
        @NameInMap("Count")
        public java.util.List<Long> count;

        /**
         * <strong>example:</strong>
         * <p>r-bp1s1m8hwzrm77kfvz-db-0</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        public static DescribeSlowLogStatisticResponseBodyDataDataLogsHistogramItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogStatisticResponseBodyDataDataLogsHistogramItem self = new DescribeSlowLogStatisticResponseBodyDataDataLogsHistogramItem();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogsHistogramItem setCount(java.util.List<Long> count) {
            this.count = count;
            return this;
        }
        public java.util.List<Long> getCount() {
            return this.count;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogsHistogramItem setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

    public static class DescribeSlowLogStatisticResponseBodyDataDataLogsHistogram extends TeaModel {
        @NameInMap("AvgLockTime")
        public java.util.List<Double> avgLockTime;

        @NameInMap("AvgRowsExamined")
        public java.util.List<Double> avgRowsExamined;

        @NameInMap("AvgRowsSent")
        public java.util.List<Double> avgRowsSent;

        @NameInMap("AvgRt")
        public java.util.List<Double> avgRt;

        @NameInMap("Count")
        public java.util.List<Long> count;

        @NameInMap("Item")
        public java.util.List<DescribeSlowLogStatisticResponseBodyDataDataLogsHistogramItem> item;

        @NameInMap("LockTime")
        public java.util.List<Double> lockTime;

        @NameInMap("MaxLockTime")
        public java.util.List<Double> maxLockTime;

        @NameInMap("MaxRowsExamined")
        public java.util.List<Long> maxRowsExamined;

        @NameInMap("MaxRowsSent")
        public java.util.List<Long> maxRowsSent;

        @NameInMap("MaxRt")
        public java.util.List<Double> maxRt;

        @NameInMap("RowsExamined")
        public java.util.List<Long> rowsExamined;

        @NameInMap("RowsSent")
        public java.util.List<Long> rowsSent;

        @NameInMap("Rt")
        public java.util.List<Double> rt;

        /**
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Total")
        public Long total;

        @NameInMap("Ts")
        public java.util.List<Long> ts;

        @NameInMap("TsEnd")
        public java.util.List<Long> tsEnd;

        public static DescribeSlowLogStatisticResponseBodyDataDataLogsHistogram build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogStatisticResponseBodyDataDataLogsHistogram self = new DescribeSlowLogStatisticResponseBodyDataDataLogsHistogram();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogsHistogram setAvgLockTime(java.util.List<Double> avgLockTime) {
            this.avgLockTime = avgLockTime;
            return this;
        }
        public java.util.List<Double> getAvgLockTime() {
            return this.avgLockTime;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogsHistogram setAvgRowsExamined(java.util.List<Double> avgRowsExamined) {
            this.avgRowsExamined = avgRowsExamined;
            return this;
        }
        public java.util.List<Double> getAvgRowsExamined() {
            return this.avgRowsExamined;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogsHistogram setAvgRowsSent(java.util.List<Double> avgRowsSent) {
            this.avgRowsSent = avgRowsSent;
            return this;
        }
        public java.util.List<Double> getAvgRowsSent() {
            return this.avgRowsSent;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogsHistogram setAvgRt(java.util.List<Double> avgRt) {
            this.avgRt = avgRt;
            return this;
        }
        public java.util.List<Double> getAvgRt() {
            return this.avgRt;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogsHistogram setCount(java.util.List<Long> count) {
            this.count = count;
            return this;
        }
        public java.util.List<Long> getCount() {
            return this.count;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogsHistogram setItem(java.util.List<DescribeSlowLogStatisticResponseBodyDataDataLogsHistogramItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<DescribeSlowLogStatisticResponseBodyDataDataLogsHistogramItem> getItem() {
            return this.item;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogsHistogram setLockTime(java.util.List<Double> lockTime) {
            this.lockTime = lockTime;
            return this;
        }
        public java.util.List<Double> getLockTime() {
            return this.lockTime;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogsHistogram setMaxLockTime(java.util.List<Double> maxLockTime) {
            this.maxLockTime = maxLockTime;
            return this;
        }
        public java.util.List<Double> getMaxLockTime() {
            return this.maxLockTime;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogsHistogram setMaxRowsExamined(java.util.List<Long> maxRowsExamined) {
            this.maxRowsExamined = maxRowsExamined;
            return this;
        }
        public java.util.List<Long> getMaxRowsExamined() {
            return this.maxRowsExamined;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogsHistogram setMaxRowsSent(java.util.List<Long> maxRowsSent) {
            this.maxRowsSent = maxRowsSent;
            return this;
        }
        public java.util.List<Long> getMaxRowsSent() {
            return this.maxRowsSent;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogsHistogram setMaxRt(java.util.List<Double> maxRt) {
            this.maxRt = maxRt;
            return this;
        }
        public java.util.List<Double> getMaxRt() {
            return this.maxRt;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogsHistogram setRowsExamined(java.util.List<Long> rowsExamined) {
            this.rowsExamined = rowsExamined;
            return this;
        }
        public java.util.List<Long> getRowsExamined() {
            return this.rowsExamined;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogsHistogram setRowsSent(java.util.List<Long> rowsSent) {
            this.rowsSent = rowsSent;
            return this;
        }
        public java.util.List<Long> getRowsSent() {
            return this.rowsSent;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogsHistogram setRt(java.util.List<Double> rt) {
            this.rt = rt;
            return this;
        }
        public java.util.List<Double> getRt() {
            return this.rt;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogsHistogram setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogsHistogram setTs(java.util.List<Long> ts) {
            this.ts = ts;
            return this;
        }
        public java.util.List<Long> getTs() {
            return this.ts;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogsHistogram setTsEnd(java.util.List<Long> tsEnd) {
            this.tsEnd = tsEnd;
            return this;
        }
        public java.util.List<Long> getTsEnd() {
            return this.tsEnd;
        }

    }

    public static class DescribeSlowLogStatisticResponseBodyDataDataLogsSqlTag extends TeaModel {
        @NameInMap("Comments")
        public String comments;

        /**
         * <p>SQL ID。</p>
         * 
         * <strong>example:</strong>
         * <p>a3931d8c3a9315dd5ed016d71cf*****</p>
         */
        @NameInMap("SqlId")
        public String sqlId;

        /**
         * <strong>example:</strong>
         * <p>DAS_IN_PLAN</p>
         */
        @NameInMap("Tags")
        public String tags;

        public static DescribeSlowLogStatisticResponseBodyDataDataLogsSqlTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogStatisticResponseBodyDataDataLogsSqlTag self = new DescribeSlowLogStatisticResponseBodyDataDataLogsSqlTag();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogsSqlTag setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogsSqlTag setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogsSqlTag setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

    }

    public static class DescribeSlowLogStatisticResponseBodyDataDataLogsTrend extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1723775362</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <strong>example:</strong>
         * <p>tf-testacc-oos-parameter</p>
         */
        @NameInMap("Value")
        public Object value;

        public static DescribeSlowLogStatisticResponseBodyDataDataLogsTrend build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogStatisticResponseBodyDataDataLogsTrend self = new DescribeSlowLogStatisticResponseBodyDataDataLogsTrend();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogsTrend setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogsTrend setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

    public static class DescribeSlowLogStatisticResponseBodyDataDataLogs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>edu_admin</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("AvgCPUTime")
        public Double avgCPUTime;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("AvgDocExamined")
        public Double avgDocExamined;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("AvgIOWrites")
        public Double avgIOWrites;

        /**
         * <strong>example:</strong>
         * <p>20000</p>
         */
        @NameInMap("AvgKeysExamined")
        public Double avgKeysExamined;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("AvgLastRowsCountAffected")
        public Double avgLastRowsCountAffected;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("AvgLockTime")
        public Double avgLockTime;

        /**
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("AvgLockTimeSeconds")
        public Double avgLockTimeSeconds;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("AvgLogicalIOReads")
        public Double avgLogicalIOReads;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("AvgPhysicalIOReads")
        public Double avgPhysicalIOReads;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("AvgQueryTime")
        public Double avgQueryTime;

        /**
         * <strong>example:</strong>
         * <p>6.211</p>
         */
        @NameInMap("AvgQueryTimeSeconds")
        public Double avgQueryTimeSeconds;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AvgReturnNum")
        public Double avgReturnNum;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("AvgRowsCountAffected")
        public Double avgRowsCountAffected;

        /**
         * <strong>example:</strong>
         * <p>53421.0</p>
         */
        @NameInMap("AvgRowsExamined")
        public Double avgRowsExamined;

        /**
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("AvgRowsSent")
        public Double avgRowsSent;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("CPUTime")
        public Double CPUTime;

        /**
         * <strong>example:</strong>
         * <p>SELECT b?.id,b?.t?,b?.id,b?.t? FROM testtb? b? JOIN testtb? b? ON b?.id=b?.id WHERE b?.t? LIKE ? ORDER BY b?.t? DESC</p>
         */
        @NameInMap("Command")
        public String command;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>0.2034</p>
         */
        @NameInMap("CountRate")
        public Double countRate;

        /**
         * <strong>example:</strong>
         * <p>member_score</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <strong>example:</strong>
         * <p>work-wechat-api</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DbInstanceName")
        public String dbInstanceName;

        /**
         * <strong>example:</strong>
         * <p>2000000</p>
         */
        @NameInMap("DocExamined")
        public Long docExamined;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DocsExamined")
        public Long docsExamined;

        @NameInMap("Histogram")
        public DescribeSlowLogStatisticResponseBodyDataDataLogsHistogram histogram;

        /**
         * <strong>example:</strong>
         * <p>172.23.142.178</p>
         */
        @NameInMap("HostAddress")
        public String hostAddress;

        /**
         * <strong>example:</strong>
         * <p>mongo-abc123456</p>
         */
        @NameInMap("HostInsId")
        public String hostInsId;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("IOWrites")
        public Long IOWrites;

        /**
         * <strong>example:</strong>
         * <p>rm-uf6zix1z2jh1y6fe5</p>
         */
        @NameInMap("InsName")
        public String insName;

        /**
         * <strong>example:</strong>
         * <p>__system</p>
         */
        @NameInMap("InsRole")
        public String insRole;

        /**
         * <strong>example:</strong>
         * <p>20000</p>
         */
        @NameInMap("KeysExamined")
        public Long keysExamined;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("LastRowsCountAffected")
        public Long lastRowsCountAffected;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("LockTime")
        public Double lockTime;

        /**
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("LockTimeSeconds")
        public Double lockTimeSeconds;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("LogicalIOReads")
        public Long logicalIOReads;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("MaxCPUTime")
        public Double maxCPUTime;

        /**
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        @NameInMap("MaxDocExamined")
        public Long maxDocExamined;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxIOWrites")
        public Long maxIOWrites;

        /**
         * <strong>example:</strong>
         * <p>2000000</p>
         */
        @NameInMap("MaxKeysExamined")
        public Long maxKeysExamined;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxLastRowsCountAffected")
        public Long maxLastRowsCountAffected;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("MaxLockTime")
        public Double maxLockTime;

        /**
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("MaxLockTimeSeconds")
        public Double maxLockTimeSeconds;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxLogicalIOReads")
        public Long maxLogicalIOReads;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxPhysicalIOReads")
        public Long maxPhysicalIOReads;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("MaxQueryTime")
        public Double maxQueryTime;

        /**
         * <strong>example:</strong>
         * <p>14.402</p>
         */
        @NameInMap("MaxQueryTimeSeconds")
        public Double maxQueryTimeSeconds;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaxReturnNum")
        public Long maxReturnNum;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxRowsCountAffected")
        public Long maxRowsCountAffected;

        /**
         * <strong>example:</strong>
         * <p>318613</p>
         */
        @NameInMap("MaxRowsExamined")
        public Long maxRowsExamined;

        /**
         * <strong>example:</strong>
         * <p>256</p>
         */
        @NameInMap("MaxRowsSent")
        public Long maxRowsSent;

        /**
         * <strong>example:</strong>
         * <p>database.collection</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <strong>example:</strong>
         * <p>DLNode</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <strong>example:</strong>
         * <p>Insert</p>
         */
        @NameInMap("OpType")
        public String opType;

        /**
         * <strong>example:</strong>
         * <p>order-1</p>
         */
        @NameInMap("OriginAlias")
        public String originAlias;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("PhysicalIOReads")
        public Long physicalIOReads;

        /**
         * <strong>example:</strong>
         * <p>SELECT b?.id,b?.t?,b?.id,b?.t? FROM testtb? b? JOIN testtb? b? ON b?.id=b?.id WHERE b?.t? LIKE ? ORDER BY b?.id DESC</p>
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
         * <p>2024-12-25T03:00:00Z</p>
         */
        @NameInMap("QueryStartTime")
        public String queryStartTime;

        /**
         * <strong>example:</strong>
         * <p>272.444</p>
         */
        @NameInMap("QueryTime")
        public Long queryTime;

        /**
         * <strong>example:</strong>
         * <p>0.1018</p>
         */
        @NameInMap("QueryTimeRate")
        public Double queryTimeRate;

        /**
         * <strong>example:</strong>
         * <p>25.472</p>
         */
        @NameInMap("QueryTimeSeconds")
        public Double queryTimeSeconds;

        @NameInMap("ReturnItemNumbers")
        public String returnItemNumbers;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReturnNum")
        public Long returnNum;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("RowsCountAffected")
        public Long rowsCountAffected;

        /**
         * <strong>example:</strong>
         * <p>2444081</p>
         */
        @NameInMap("RowsExamined")
        public Long rowsExamined;

        /**
         * <strong>example:</strong>
         * <p>772</p>
         */
        @NameInMap("RowsSent")
        public Long rowsSent;

        /**
         * <strong>example:</strong>
         * <p>SELECT \&quot;Hello, World!\&quot; FROM DUAL</p>
         */
        @NameInMap("SQLText")
        public String SQLText;

        /**
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("Scheme")
        public String scheme;

        /**
         * <p>SQL ID。</p>
         * 
         * <strong>example:</strong>
         * <p>2dca88762ec6b3812504ab8a4b******</p>
         */
        @NameInMap("SqlId")
        public String sqlId;

        @NameInMap("SqlTag")
        public DescribeSlowLogStatisticResponseBodyDataDataLogsSqlTag sqlTag;

        /**
         * <strong>example:</strong>
         * <p>LOGIN</p>
         */
        @NameInMap("SqlType")
        public String sqlType;

        /**
         * <strong>example:</strong>
         * <p>r-8vba51c588ba3a94</p>
         */
        @NameInMap("SubInstanceId")
        public String subInstanceId;

        /**
         * <strong>example:</strong>
         * <p>users\nifconfig\n</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ThreadId")
        public String threadId;

        /**
         * <strong>example:</strong>
         * <p>1708568930</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Trend")
        public java.util.List<DescribeSlowLogStatisticResponseBodyDataDataLogsTrend> trend;

        /**
         * <strong>example:</strong>
         * <p>user-1</p>
         */
        @NameInMap("User")
        public String user;

        public static DescribeSlowLogStatisticResponseBodyDataDataLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogStatisticResponseBodyDataDataLogs self = new DescribeSlowLogStatisticResponseBodyDataDataLogs();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setAvgCPUTime(Double avgCPUTime) {
            this.avgCPUTime = avgCPUTime;
            return this;
        }
        public Double getAvgCPUTime() {
            return this.avgCPUTime;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setAvgDocExamined(Double avgDocExamined) {
            this.avgDocExamined = avgDocExamined;
            return this;
        }
        public Double getAvgDocExamined() {
            return this.avgDocExamined;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setAvgIOWrites(Double avgIOWrites) {
            this.avgIOWrites = avgIOWrites;
            return this;
        }
        public Double getAvgIOWrites() {
            return this.avgIOWrites;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setAvgKeysExamined(Double avgKeysExamined) {
            this.avgKeysExamined = avgKeysExamined;
            return this;
        }
        public Double getAvgKeysExamined() {
            return this.avgKeysExamined;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setAvgLastRowsCountAffected(Double avgLastRowsCountAffected) {
            this.avgLastRowsCountAffected = avgLastRowsCountAffected;
            return this;
        }
        public Double getAvgLastRowsCountAffected() {
            return this.avgLastRowsCountAffected;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setAvgLockTime(Double avgLockTime) {
            this.avgLockTime = avgLockTime;
            return this;
        }
        public Double getAvgLockTime() {
            return this.avgLockTime;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setAvgLockTimeSeconds(Double avgLockTimeSeconds) {
            this.avgLockTimeSeconds = avgLockTimeSeconds;
            return this;
        }
        public Double getAvgLockTimeSeconds() {
            return this.avgLockTimeSeconds;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setAvgLogicalIOReads(Double avgLogicalIOReads) {
            this.avgLogicalIOReads = avgLogicalIOReads;
            return this;
        }
        public Double getAvgLogicalIOReads() {
            return this.avgLogicalIOReads;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setAvgPhysicalIOReads(Double avgPhysicalIOReads) {
            this.avgPhysicalIOReads = avgPhysicalIOReads;
            return this;
        }
        public Double getAvgPhysicalIOReads() {
            return this.avgPhysicalIOReads;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setAvgQueryTime(Double avgQueryTime) {
            this.avgQueryTime = avgQueryTime;
            return this;
        }
        public Double getAvgQueryTime() {
            return this.avgQueryTime;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setAvgQueryTimeSeconds(Double avgQueryTimeSeconds) {
            this.avgQueryTimeSeconds = avgQueryTimeSeconds;
            return this;
        }
        public Double getAvgQueryTimeSeconds() {
            return this.avgQueryTimeSeconds;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setAvgReturnNum(Double avgReturnNum) {
            this.avgReturnNum = avgReturnNum;
            return this;
        }
        public Double getAvgReturnNum() {
            return this.avgReturnNum;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setAvgRowsCountAffected(Double avgRowsCountAffected) {
            this.avgRowsCountAffected = avgRowsCountAffected;
            return this;
        }
        public Double getAvgRowsCountAffected() {
            return this.avgRowsCountAffected;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setAvgRowsExamined(Double avgRowsExamined) {
            this.avgRowsExamined = avgRowsExamined;
            return this;
        }
        public Double getAvgRowsExamined() {
            return this.avgRowsExamined;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setAvgRowsSent(Double avgRowsSent) {
            this.avgRowsSent = avgRowsSent;
            return this;
        }
        public Double getAvgRowsSent() {
            return this.avgRowsSent;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setCPUTime(Double CPUTime) {
            this.CPUTime = CPUTime;
            return this;
        }
        public Double getCPUTime() {
            return this.CPUTime;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setCountRate(Double countRate) {
            this.countRate = countRate;
            return this;
        }
        public Double getCountRate() {
            return this.countRate;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setDbInstanceName(String dbInstanceName) {
            this.dbInstanceName = dbInstanceName;
            return this;
        }
        public String getDbInstanceName() {
            return this.dbInstanceName;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setDocExamined(Long docExamined) {
            this.docExamined = docExamined;
            return this;
        }
        public Long getDocExamined() {
            return this.docExamined;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setDocsExamined(Long docsExamined) {
            this.docsExamined = docsExamined;
            return this;
        }
        public Long getDocsExamined() {
            return this.docsExamined;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setHistogram(DescribeSlowLogStatisticResponseBodyDataDataLogsHistogram histogram) {
            this.histogram = histogram;
            return this;
        }
        public DescribeSlowLogStatisticResponseBodyDataDataLogsHistogram getHistogram() {
            return this.histogram;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setHostAddress(String hostAddress) {
            this.hostAddress = hostAddress;
            return this;
        }
        public String getHostAddress() {
            return this.hostAddress;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setHostInsId(String hostInsId) {
            this.hostInsId = hostInsId;
            return this;
        }
        public String getHostInsId() {
            return this.hostInsId;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setIOWrites(Long IOWrites) {
            this.IOWrites = IOWrites;
            return this;
        }
        public Long getIOWrites() {
            return this.IOWrites;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setInsName(String insName) {
            this.insName = insName;
            return this;
        }
        public String getInsName() {
            return this.insName;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setInsRole(String insRole) {
            this.insRole = insRole;
            return this;
        }
        public String getInsRole() {
            return this.insRole;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setKeysExamined(Long keysExamined) {
            this.keysExamined = keysExamined;
            return this;
        }
        public Long getKeysExamined() {
            return this.keysExamined;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setLastRowsCountAffected(Long lastRowsCountAffected) {
            this.lastRowsCountAffected = lastRowsCountAffected;
            return this;
        }
        public Long getLastRowsCountAffected() {
            return this.lastRowsCountAffected;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setLockTime(Double lockTime) {
            this.lockTime = lockTime;
            return this;
        }
        public Double getLockTime() {
            return this.lockTime;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setLockTimeSeconds(Double lockTimeSeconds) {
            this.lockTimeSeconds = lockTimeSeconds;
            return this;
        }
        public Double getLockTimeSeconds() {
            return this.lockTimeSeconds;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setLogicalIOReads(Long logicalIOReads) {
            this.logicalIOReads = logicalIOReads;
            return this;
        }
        public Long getLogicalIOReads() {
            return this.logicalIOReads;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setMaxCPUTime(Double maxCPUTime) {
            this.maxCPUTime = maxCPUTime;
            return this;
        }
        public Double getMaxCPUTime() {
            return this.maxCPUTime;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setMaxDocExamined(Long maxDocExamined) {
            this.maxDocExamined = maxDocExamined;
            return this;
        }
        public Long getMaxDocExamined() {
            return this.maxDocExamined;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setMaxIOWrites(Long maxIOWrites) {
            this.maxIOWrites = maxIOWrites;
            return this;
        }
        public Long getMaxIOWrites() {
            return this.maxIOWrites;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setMaxKeysExamined(Long maxKeysExamined) {
            this.maxKeysExamined = maxKeysExamined;
            return this;
        }
        public Long getMaxKeysExamined() {
            return this.maxKeysExamined;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setMaxLastRowsCountAffected(Long maxLastRowsCountAffected) {
            this.maxLastRowsCountAffected = maxLastRowsCountAffected;
            return this;
        }
        public Long getMaxLastRowsCountAffected() {
            return this.maxLastRowsCountAffected;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setMaxLockTime(Double maxLockTime) {
            this.maxLockTime = maxLockTime;
            return this;
        }
        public Double getMaxLockTime() {
            return this.maxLockTime;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setMaxLockTimeSeconds(Double maxLockTimeSeconds) {
            this.maxLockTimeSeconds = maxLockTimeSeconds;
            return this;
        }
        public Double getMaxLockTimeSeconds() {
            return this.maxLockTimeSeconds;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setMaxLogicalIOReads(Long maxLogicalIOReads) {
            this.maxLogicalIOReads = maxLogicalIOReads;
            return this;
        }
        public Long getMaxLogicalIOReads() {
            return this.maxLogicalIOReads;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setMaxPhysicalIOReads(Long maxPhysicalIOReads) {
            this.maxPhysicalIOReads = maxPhysicalIOReads;
            return this;
        }
        public Long getMaxPhysicalIOReads() {
            return this.maxPhysicalIOReads;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setMaxQueryTime(Double maxQueryTime) {
            this.maxQueryTime = maxQueryTime;
            return this;
        }
        public Double getMaxQueryTime() {
            return this.maxQueryTime;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setMaxQueryTimeSeconds(Double maxQueryTimeSeconds) {
            this.maxQueryTimeSeconds = maxQueryTimeSeconds;
            return this;
        }
        public Double getMaxQueryTimeSeconds() {
            return this.maxQueryTimeSeconds;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setMaxReturnNum(Long maxReturnNum) {
            this.maxReturnNum = maxReturnNum;
            return this;
        }
        public Long getMaxReturnNum() {
            return this.maxReturnNum;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setMaxRowsCountAffected(Long maxRowsCountAffected) {
            this.maxRowsCountAffected = maxRowsCountAffected;
            return this;
        }
        public Long getMaxRowsCountAffected() {
            return this.maxRowsCountAffected;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setMaxRowsExamined(Long maxRowsExamined) {
            this.maxRowsExamined = maxRowsExamined;
            return this;
        }
        public Long getMaxRowsExamined() {
            return this.maxRowsExamined;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setMaxRowsSent(Long maxRowsSent) {
            this.maxRowsSent = maxRowsSent;
            return this;
        }
        public Long getMaxRowsSent() {
            return this.maxRowsSent;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setOpType(String opType) {
            this.opType = opType;
            return this;
        }
        public String getOpType() {
            return this.opType;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setOriginAlias(String originAlias) {
            this.originAlias = originAlias;
            return this;
        }
        public String getOriginAlias() {
            return this.originAlias;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setPhysicalIOReads(Long physicalIOReads) {
            this.physicalIOReads = physicalIOReads;
            return this;
        }
        public Long getPhysicalIOReads() {
            return this.physicalIOReads;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setPsql(String psql) {
            this.psql = psql;
            return this;
        }
        public String getPsql() {
            return this.psql;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setQueryId(String queryId) {
            this.queryId = queryId;
            return this;
        }
        public String getQueryId() {
            return this.queryId;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setQueryStartTime(String queryStartTime) {
            this.queryStartTime = queryStartTime;
            return this;
        }
        public String getQueryStartTime() {
            return this.queryStartTime;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setQueryTime(Long queryTime) {
            this.queryTime = queryTime;
            return this;
        }
        public Long getQueryTime() {
            return this.queryTime;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setQueryTimeRate(Double queryTimeRate) {
            this.queryTimeRate = queryTimeRate;
            return this;
        }
        public Double getQueryTimeRate() {
            return this.queryTimeRate;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setQueryTimeSeconds(Double queryTimeSeconds) {
            this.queryTimeSeconds = queryTimeSeconds;
            return this;
        }
        public Double getQueryTimeSeconds() {
            return this.queryTimeSeconds;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setReturnItemNumbers(String returnItemNumbers) {
            this.returnItemNumbers = returnItemNumbers;
            return this;
        }
        public String getReturnItemNumbers() {
            return this.returnItemNumbers;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setReturnNum(Long returnNum) {
            this.returnNum = returnNum;
            return this;
        }
        public Long getReturnNum() {
            return this.returnNum;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setRowsCountAffected(Long rowsCountAffected) {
            this.rowsCountAffected = rowsCountAffected;
            return this;
        }
        public Long getRowsCountAffected() {
            return this.rowsCountAffected;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setRowsExamined(Long rowsExamined) {
            this.rowsExamined = rowsExamined;
            return this;
        }
        public Long getRowsExamined() {
            return this.rowsExamined;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setRowsSent(Long rowsSent) {
            this.rowsSent = rowsSent;
            return this;
        }
        public Long getRowsSent() {
            return this.rowsSent;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setSqlTag(DescribeSlowLogStatisticResponseBodyDataDataLogsSqlTag sqlTag) {
            this.sqlTag = sqlTag;
            return this;
        }
        public DescribeSlowLogStatisticResponseBodyDataDataLogsSqlTag getSqlTag() {
            return this.sqlTag;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setSubInstanceId(String subInstanceId) {
            this.subInstanceId = subInstanceId;
            return this;
        }
        public String getSubInstanceId() {
            return this.subInstanceId;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setThreadId(String threadId) {
            this.threadId = threadId;
            return this;
        }
        public String getThreadId() {
            return this.threadId;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setTrend(java.util.List<DescribeSlowLogStatisticResponseBodyDataDataLogsTrend> trend) {
            this.trend = trend;
            return this;
        }
        public java.util.List<DescribeSlowLogStatisticResponseBodyDataDataLogsTrend> getTrend() {
            return this.trend;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class DescribeSlowLogStatisticResponseBodyDataData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>rm-k2ja51w7cnusg5a1x</p>
         */
        @NameInMap("DbInstanceId")
        public Long dbInstanceId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DbInstanceName")
        public String dbInstanceName;

        /**
         * <strong>example:</strong>
         * <p>2024-08-08T02:15:00Z</p>
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
        public java.util.List<DescribeSlowLogStatisticResponseBodyDataDataLogs> logs;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxRecordsPerPage")
        public Integer maxRecordsPerPage;

        /**
         * <strong>example:</strong>
         * <p>pi-wz99g5rn7w1x8h0sf</p>
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
         * <p>2024-10-08T02:01:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("TotalRecords")
        public Long totalRecords;

        public static DescribeSlowLogStatisticResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogStatisticResponseBodyDataData self = new DescribeSlowLogStatisticResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogStatisticResponseBodyDataData setDbInstanceId(Long dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        public Long getDbInstanceId() {
            return this.dbInstanceId;
        }

        public DescribeSlowLogStatisticResponseBodyDataData setDbInstanceName(String dbInstanceName) {
            this.dbInstanceName = dbInstanceName;
            return this;
        }
        public String getDbInstanceName() {
            return this.dbInstanceName;
        }

        public DescribeSlowLogStatisticResponseBodyDataData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeSlowLogStatisticResponseBodyDataData setItemsNumbers(Long itemsNumbers) {
            this.itemsNumbers = itemsNumbers;
            return this;
        }
        public Long getItemsNumbers() {
            return this.itemsNumbers;
        }

        public DescribeSlowLogStatisticResponseBodyDataData setLogs(java.util.List<DescribeSlowLogStatisticResponseBodyDataDataLogs> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<DescribeSlowLogStatisticResponseBodyDataDataLogs> getLogs() {
            return this.logs;
        }

        public DescribeSlowLogStatisticResponseBodyDataData setMaxRecordsPerPage(Integer maxRecordsPerPage) {
            this.maxRecordsPerPage = maxRecordsPerPage;
            return this;
        }
        public Integer getMaxRecordsPerPage() {
            return this.maxRecordsPerPage;
        }

        public DescribeSlowLogStatisticResponseBodyDataData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeSlowLogStatisticResponseBodyDataData setPageNumbers(Integer pageNumbers) {
            this.pageNumbers = pageNumbers;
            return this;
        }
        public Integer getPageNumbers() {
            return this.pageNumbers;
        }

        public DescribeSlowLogStatisticResponseBodyDataData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeSlowLogStatisticResponseBodyDataData setTotalRecords(Long totalRecords) {
            this.totalRecords = totalRecords;
            return this;
        }
        public Long getTotalRecords() {
            return this.totalRecords;
        }

    }

    public static class DescribeSlowLogStatisticResponseBodyData extends TeaModel {
        @NameInMap("Data")
        public DescribeSlowLogStatisticResponseBodyDataData data;

        /**
         * <strong>example:</strong>
         * <p>10910</p>
         */
        @NameInMap("ErrorCode")
        public Integer errorCode;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsFinish")
        public Boolean isFinish;

        /**
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("RequestKey")
        public String requestKey;

        /**
         * <strong>example:</strong>
         * <p>async__665ee69612f1627c7fd9f3c85075****</p>
         */
        @NameInMap("ResultId")
        public String resultId;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>1735104224250</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        public static DescribeSlowLogStatisticResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogStatisticResponseBodyData self = new DescribeSlowLogStatisticResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogStatisticResponseBodyData setData(DescribeSlowLogStatisticResponseBodyDataData data) {
            this.data = data;
            return this;
        }
        public DescribeSlowLogStatisticResponseBodyDataData getData() {
            return this.data;
        }

        public DescribeSlowLogStatisticResponseBodyData setErrorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public Integer getErrorCode() {
            return this.errorCode;
        }

        public DescribeSlowLogStatisticResponseBodyData setIsFinish(Boolean isFinish) {
            this.isFinish = isFinish;
            return this;
        }
        public Boolean getIsFinish() {
            return this.isFinish;
        }

        public DescribeSlowLogStatisticResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeSlowLogStatisticResponseBodyData setRequestKey(String requestKey) {
            this.requestKey = requestKey;
            return this;
        }
        public String getRequestKey() {
            return this.requestKey;
        }

        public DescribeSlowLogStatisticResponseBodyData setResultId(String resultId) {
            this.resultId = resultId;
            return this;
        }
        public String getResultId() {
            return this.resultId;
        }

        public DescribeSlowLogStatisticResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeSlowLogStatisticResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
