// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSlowLogStatisticResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * 
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
     * <p>The message returned for the request.</p>
     * <blockquote>
     * <p>If the request is successful, <strong>Successful</strong> is returned. If the request fails, exception information (such as an error code) is returned.</p>
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
     * <p>52D540CF-C517-1F57-BB42-9035F96******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request is successful.</li>
     * <li><strong>false</strong>: The request fails.</li>
     * </ul>
     * 
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
        /**
         * <p>The number of slow logs.</p>
         */
        @NameInMap("Count")
        public java.util.List<Long> count;

        /**
         * <p>The node ID.</p>
         * 
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
        /**
         * <p>The average lock wait time. Unit: seconds.</p>
         */
        @NameInMap("AvgLockTime")
        public java.util.List<Double> avgLockTime;

        /**
         * <p>The average number of rows examined.</p>
         */
        @NameInMap("AvgRowsExamined")
        public java.util.List<Double> avgRowsExamined;

        /**
         * <p>The average number of rows returned.</p>
         */
        @NameInMap("AvgRowsSent")
        public java.util.List<Double> avgRowsSent;

        /**
         * <p>The average execution duration.</p>
         */
        @NameInMap("AvgRt")
        public java.util.List<Double> avgRt;

        /**
         * <p>The number of slow logs.</p>
         */
        @NameInMap("Count")
        public java.util.List<Long> count;

        /**
         * <p>The task status.</p>
         */
        @NameInMap("Item")
        public java.util.List<DescribeSlowLogStatisticResponseBodyDataDataLogsHistogramItem> item;

        /**
         * <p>The lock wait time. Unit: milliseconds.</p>
         */
        @NameInMap("LockTime")
        public java.util.List<Double> lockTime;

        /**
         * <p>The maximum lock wait time. Unit: seconds.</p>
         */
        @NameInMap("MaxLockTime")
        public java.util.List<Double> maxLockTime;

        /**
         * <p>The maximum number of rows examined.</p>
         */
        @NameInMap("MaxRowsExamined")
        public java.util.List<Long> maxRowsExamined;

        /**
         * <p>The maximum number of rows returned.</p>
         */
        @NameInMap("MaxRowsSent")
        public java.util.List<Long> maxRowsSent;

        /**
         * <p>The maximum response time. Unit: ms.</p>
         */
        @NameInMap("MaxRt")
        public java.util.List<Double> maxRt;

        /**
         * <p>The total number of rows examined.</p>
         * <blockquote>
         * <p>Databases that currently support this field: ApsaraDB RDS for MySQL, ApsaraDB RDS for PostgreSQL, and PolarDB for MySQL.</p>
         * </blockquote>
         */
        @NameInMap("RowsExamined")
        public java.util.List<Long> rowsExamined;

        /**
         * <p>The number of rows returned.</p>
         */
        @NameInMap("RowsSent")
        public java.util.List<Long> rowsSent;

        /**
         * <p>The execution duration. Unit: seconds.</p>
         */
        @NameInMap("Rt")
        public java.util.List<Double> rt;

        /**
         * <p>The total number of queried records.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Total")
        public Long total;

        /**
         * <p>The execution timestamp.</p>
         */
        @NameInMap("Ts")
        public java.util.List<Long> ts;

        /**
         * <p>Deprecated.</p>
         */
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
        /**
         * <p>The remarks.</p>
         * <p>The value must be 1 to 300 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>dba archiving</p>
         */
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
         * <p>Multiple tags separated by commas.</p>
         * 
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
         * <p>The execution time, in UNIX timestamp format. Unit: milliseconds (ms).</p>
         * 
         * <strong>example:</strong>
         * <p>1723775362</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The value of the filter parameter.</p>
         * 
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
         * <p>The database account.</p>
         * 
         * <strong>example:</strong>
         * <p>edu_admin</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>Deprecated.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("AvgCPUTime")
        public Double avgCPUTime;

        /**
         * <p>The average CPU query time. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>456</p>
         */
        @NameInMap("AvgCPUTimeSeconds")
        public Double avgCPUTimeSeconds;

        /**
         * <p>The average number of documents scanned.</p>
         * <blockquote>
         * <p>This field is supported only for ApsaraDB for MongoDB instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("AvgDocExamined")
        public Double avgDocExamined;

        /**
         * <p>The average number of rows fetched.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AvgFrows")
        public Double avgFrows;

        /**
         * <p>The average number of I/O writes.</p>
         * <blockquote>
         * <p>This field is supported only for ApsaraDB RDS for SQL Server instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("AvgIOWrites")
        public Double avgIOWrites;

        /**
         * <p>The average number of rows scanned by the index.</p>
         * <blockquote>
         * <p>This field is supported only for ApsaraDB for MongoDB instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20000</p>
         */
        @NameInMap("AvgKeysExamined")
        public Double avgKeysExamined;

        /**
         * <p>The average number of rows affected by the last statement.</p>
         * <blockquote>
         * <p>This field is supported only for ApsaraDB RDS for SQL Server instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("AvgLastRowsCountAffected")
        public Double avgLastRowsCountAffected;

        /**
         * <p>Deprecated.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("AvgLockTime")
        public Double avgLockTime;

        /**
         * <p>The average lock wait time. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("AvgLockTimeSeconds")
        public Double avgLockTimeSeconds;

        /**
         * <p>The average number of logical reads.</p>
         * <blockquote>
         * <p>This field is supported only for ApsaraDB RDS for SQL Server instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("AvgLogicalIOReads")
        public Double avgLogicalIOReads;

        /**
         * <p>The average number of physical reads.</p>
         * <blockquote>
         * <p>This field is supported only for ApsaraDB RDS for SQL Server instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("AvgPhysicalIOReads")
        public Double avgPhysicalIOReads;

        /**
         * <p>Deprecated.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("AvgQueryTime")
        public Double avgQueryTime;

        /**
         * <p>The average query execution duration. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>6.211</p>
         */
        @NameInMap("AvgQueryTimeSeconds")
        public Double avgQueryTimeSeconds;

        /**
         * <p>The average size of the request, in bytes. This parameter is valid only for Redis.</p>
         */
        @NameInMap("AvgRequestSize")
        public Double avgRequestSize;

        /**
         * <p>The average response size, in bytes. This parameter is valid only for Redis.</p>
         */
        @NameInMap("AvgResponseSize")
        public Double avgResponseSize;

        /**
         * <p>The average number of rows returned.</p>
         * <blockquote>
         * <p>This field is supported only for ApsaraDB for MongoDB instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AvgReturnNum")
        public Double avgReturnNum;

        /**
         * <p>The average number of rows.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AvgRows")
        public Double avgRows;

        /**
         * <p>The average number of rows affected.</p>
         * <blockquote>
         * <p>This field is supported only for ApsaraDB RDS for SQL Server instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("AvgRowsCountAffected")
        public Double avgRowsCountAffected;

        /**
         * <p>The average number of rows examined.</p>
         * 
         * <strong>example:</strong>
         * <p>53421.0</p>
         */
        @NameInMap("AvgRowsExamined")
        public Double avgRowsExamined;

        /**
         * <p>The average number of rows returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("AvgRowsSent")
        public Double avgRowsSent;

        /**
         * <p>The average execution duration.</p>
         */
        @NameInMap("AvgRt")
        public Double avgRt;

        /**
         * <p>The average number of requests.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AvgScnt")
        public Double avgScnt;

        /**
         * <p>Deprecated.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("CPUTime")
        public Double CPUTime;

        /**
         * <p>The CPU query time. Unit: seconds.</p>
         * <blockquote>
         * <p>This field is supported only for ApsaraDB RDS for SQL Server instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>456</p>
         */
        @NameInMap("CPUTimeSeconds")
        public Double CPUTimeSeconds;

        /**
         * <p>The client IP address in the query.</p>
         * 
         * <strong>example:</strong>
         * <p>10.57.84.109</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <p>The command that was executed. This parameter is valid only for Redis.</p>
         * 
         * <strong>example:</strong>
         * <p>systemctl restart nginx.service</p>
         */
        @NameInMap("Cmd")
        public String cmd;

        /**
         * <p>The slow query statement.</p>
         * <blockquote>
         * <p>This field is supported only for ApsaraDB for Tair (Redis® OSS-Compatible) database instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SELECT b?.id,b?.t?,b?.id,b?.t? FROM testtb? b? JOIN testtb? b? ON b?.id=b?.id WHERE b?.t? LIKE ? ORDER BY b?.t? DESC</p>
         */
        @NameInMap("Command")
        public String command;

        /**
         * <p>The number of elements in the key.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The proportion of executions.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2034</p>
         */
        @NameInMap("CountRate")
        public Double countRate;

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>member_score</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>work-wechat-api</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The database ID. This parameter is valid only for Redis.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DbId")
        public String dbId;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DbInstanceName")
        public String dbInstanceName;

        /**
         * <p>The number of documents scanned.</p>
         * <blockquote>
         * <p>This field is supported only for ApsaraDB for MongoDB instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2000000</p>
         */
        @NameInMap("DocExamined")
        public Long docExamined;

        /**
         * <p>The number of documents scanned during the MongoDB operation.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DocsExamined")
        public Long docsExamined;

        /**
         * <p>The number of rows fetched by the compute node (CN) of the ApsaraDB for PolarDB-X 2.0 database instance.</p>
         * <blockquote>
         * <p>This field is supported only for ApsaraDB for PolarDB-X 2.0 instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Frows")
        public Long frows;

        /**
         * <p>The trend chart data.</p>
         */
        @NameInMap("Histogram")
        public DescribeSlowLogStatisticResponseBodyDataDataLogsHistogram histogram;

        /**
         * <p>The IP address of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>172.23.142.178</p>
         */
        @NameInMap("HostAddress")
        public String hostAddress;

        /**
         * <p>The host instance ID.</p>
         * <blockquote>
         * <p>This field is supported only for ApsaraDB for MongoDB instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>mongo-abc123456</p>
         */
        @NameInMap("HostInsId")
        public String hostInsId;

        /**
         * <p>The number of I/O writes.</p>
         * <blockquote>
         * <p>This field is supported only for ApsaraDB RDS for SQL Server instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("IOWrites")
        public Long IOWrites;

        /**
         * <p>The shard name.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6zix1z2jh1y6fe5</p>
         */
        @NameInMap("InsName")
        public String insName;

        /**
         * <p>The instance role.</p>
         * <blockquote>
         * <p>This field is supported only for ApsaraDB for MongoDB instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>__system</p>
         */
        @NameInMap("InsRole")
        public String insRole;

        /**
         * <p>The number of rows scanned by the MongoDB index.</p>
         * 
         * <strong>example:</strong>
         * <p>20000</p>
         */
        @NameInMap("KeysExamined")
        public Long keysExamined;

        /**
         * <p>The number of rows affected by the last statement.</p>
         * <blockquote>
         * <p>This field is supported only for ApsaraDB RDS for SQL Server instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("LastRowsCountAffected")
        public Long lastRowsCountAffected;

        /**
         * <p>Deprecated.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("LockTime")
        public Double lockTime;

        /**
         * <p>The lock wait time. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("LockTimeSeconds")
        public Double lockTimeSeconds;

        /**
         * <p>The number of logical reads.</p>
         * <blockquote>
         * <p>This field is supported only for ApsaraDB RDS for SQL Server instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("LogicalIOReads")
        public Long logicalIOReads;

        /**
         * <p>Deprecated.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("MaxCPUTime")
        public Double maxCPUTime;

        /**
         * <p>The maximum CPU query time. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>456</p>
         */
        @NameInMap("MaxCPUTimeSeconds")
        public Double maxCPUTimeSeconds;

        /**
         * <p>The maximum number of documents scanned.</p>
         * <blockquote>
         * <p>This field is supported only for ApsaraDB for MongoDB instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        @NameInMap("MaxDocExamined")
        public Long maxDocExamined;

        /**
         * <p>The maximum number of rows fetched.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxFrows")
        public Long maxFrows;

        /**
         * <p>The maximum number of I/O writes.</p>
         * <blockquote>
         * <p>This field is supported only for ApsaraDB RDS for SQL Server instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxIOWrites")
        public Long maxIOWrites;

        /**
         * <p>The maximum number of rows scanned by the index.</p>
         * <blockquote>
         * <p>This field is supported only for ApsaraDB for MongoDB instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2000000</p>
         */
        @NameInMap("MaxKeysExamined")
        public Long maxKeysExamined;

        /**
         * <p>The maximum number of rows affected by the last statement.</p>
         * <blockquote>
         * <p>This field is supported only for ApsaraDB RDS for SQL Server instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxLastRowsCountAffected")
        public Long maxLastRowsCountAffected;

        /**
         * <p>Deprecated.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("MaxLockTime")
        public Double maxLockTime;

        /**
         * <p>The maximum lock wait time. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("MaxLockTimeSeconds")
        public Double maxLockTimeSeconds;

        /**
         * <p>The maximum number of logical reads.</p>
         * <blockquote>
         * <p>This field is supported only for ApsaraDB RDS for SQL Server instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxLogicalIOReads")
        public Long maxLogicalIOReads;

        /**
         * <p>The maximum number of physical reads.</p>
         * <blockquote>
         * <p>This field is supported only for ApsaraDB RDS for SQL Server instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxPhysicalIOReads")
        public Long maxPhysicalIOReads;

        /**
         * <p>Deprecated.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("MaxQueryTime")
        public Double maxQueryTime;

        /**
         * <p>The maximum query execution duration. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>14.402</p>
         */
        @NameInMap("MaxQueryTimeSeconds")
        public Double maxQueryTimeSeconds;

        /**
         * <p>The maximum size of the request, in bytes. This parameter is valid only for Redis.</p>
         */
        @NameInMap("MaxRequestSize")
        public Double maxRequestSize;

        /**
         * <p>The maximum response size, in bytes. This parameter is valid only for Redis.</p>
         */
        @NameInMap("MaxResponseSize")
        public Double maxResponseSize;

        /**
         * <p>The maximum number of rows returned.</p>
         * <blockquote>
         * <p>This field is supported only for ApsaraDB for MongoDB instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaxReturnNum")
        public Long maxReturnNum;

        /**
         * <p>The maximum number of rows.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxRows")
        public Long maxRows;

        /**
         * <p>The maximum number of rows affected.</p>
         * <blockquote>
         * <p>This field is supported only for ApsaraDB RDS for SQL Server instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxRowsCountAffected")
        public Long maxRowsCountAffected;

        /**
         * <p>The maximum number of rows examined.</p>
         * 
         * <strong>example:</strong>
         * <p>318613</p>
         */
        @NameInMap("MaxRowsExamined")
        public Long maxRowsExamined;

        /**
         * <p>The maximum number of rows returned.</p>
         * 
         * <strong>example:</strong>
         * <p>256</p>
         */
        @NameInMap("MaxRowsSent")
        public Long maxRowsSent;

        /**
         * <p>The maximum execution duration, in seconds.</p>
         */
        @NameInMap("MaxRt")
        public Double maxRt;

        /**
         * <p>The maximum number of requests.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxScnt")
        public Long maxScnt;

        /**
         * <p>The namespace.</p>
         * <blockquote>
         * <p>This field is supported only for ApsaraDB for MongoDB instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>database.collection</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The node type.</p>
         * <blockquote>
         * <p>Databases that support this field: ApsaraDB for MongoDB and Tair (Redis® OSS-Compatible).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>DLNode</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The operation type.</p>
         * <blockquote>
         * <p>This field is supported only for ApsaraDB for MongoDB instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Insert</p>
         */
        @NameInMap("OpType")
        public String opType;

        /**
         * <p>The source alias.</p>
         * 
         * <strong>example:</strong>
         * <p>order-1</p>
         */
        @NameInMap("OriginAlias")
        public String originAlias;

        /**
         * <p>The number of physical reads.</p>
         * <blockquote>
         * <p>This field is supported only for ApsaraDB RDS for SQL Server instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("PhysicalIOReads")
        public Long physicalIOReads;

        /**
         * <p>The SQL template.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT b?.id,b?.t?,b?.id,b?.t? FROM testtb? b? JOIN testtb? b? ON b?.id=b?.id WHERE b?.t? LIKE ? ORDER BY b?.id DESC</p>
         */
        @NameInMap("Psql")
        public String psql;

        /**
         * <p>The query ID.</p>
         * <blockquote>
         * <p>This field is supported only for ApsaraDB for MongoDB instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sq-1pzcdMwRb</p>
         */
        @NameInMap("QueryId")
        public String queryId;

        /**
         * <p>The time when the query started. Format: yyyy-MM-dd hh:mm:ss (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-25T03:00:00Z</p>
         */
        @NameInMap("QueryStartTime")
        public String queryStartTime;

        /**
         * <p>The query execution time threshold. Unit: milliseconds (ms).</p>
         * 
         * <strong>example:</strong>
         * <p>272.444</p>
         */
        @NameInMap("QueryTime")
        public Long queryTime;

        /**
         * <p>The proportion of query duration.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1018</p>
         */
        @NameInMap("QueryTimeRate")
        public Double queryTimeRate;

        /**
         * <p>The query execution duration. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>25.472</p>
         */
        @NameInMap("QueryTimeSeconds")
        public Double queryTimeSeconds;

        /**
         * <p>The return item numbers.</p>
         * 
         * <strong>example:</strong>
         * <p>暂无</p>
         */
        @NameInMap("ReturnItemNumbers")
        public String returnItemNumbers;

        /**
         * <p>The number of rows returned.</p>
         * <blockquote>
         * <p>This field is supported only for ApsaraDB for MongoDB instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReturnNum")
        public Long returnNum;

        /**
         * <p>The total number of rows updated or returned by the compute nodes of the ApsaraDB for PolarDB-X 2.0 database instance.</p>
         * <blockquote>
         * <p>This field is supported only for ApsaraDB for PolarDB-X 2.0 instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>105</p>
         */
        @NameInMap("Rows")
        public Long rows;

        /**
         * <p>The number of rows affected.</p>
         * <blockquote>
         * <p>This field is supported only for ApsaraDB RDS for SQL Server instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("RowsCountAffected")
        public Long rowsCountAffected;

        /**
         * <p>The total number of rows examined.</p>
         * <blockquote>
         * <p>Databases that currently support this field: ApsaraDB RDS for MySQL, ApsaraDB RDS for PostgreSQL, and PolarDB for MySQL.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2444081</p>
         */
        @NameInMap("RowsExamined")
        public Long rowsExamined;

        /**
         * <p>The number of rows returned.</p>
         * 
         * <strong>example:</strong>
         * <p>772</p>
         */
        @NameInMap("RowsSent")
        public Long rowsSent;

        /**
         * <p>The rule ID. For more information, see <a href="https://help.aliyun.com/document_detail/290038.html">Query Governance</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>181**47</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The details of the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT \&quot;Hello, World!\&quot; FROM DUAL</p>
         */
        @NameInMap("SQLText")
        public String SQLText;

        /**
         * <p>HTTP or HTTPS.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("Scheme")
        public String scheme;

        /**
         * <p>The number of DN requests from the compute node (CN) of the ApsaraDB for PolarDB-X 2.0 database instance.</p>
         * <blockquote>
         * <p>This field is supported only for ApsaraDB for PolarDB-X 2.0 instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Scnt")
        public Long scnt;

        /**
         * <p>SQL ID。</p>
         * 
         * <strong>example:</strong>
         * <p>2dca88762ec6b3812504ab8a4b******</p>
         */
        @NameInMap("SqlId")
        public String sqlId;

        /**
         * <p>The tag.</p>
         */
        @NameInMap("SqlTag")
        public DescribeSlowLogStatisticResponseBodyDataDataLogsSqlTag sqlTag;

        /**
         * <p>The type of the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>LOGIN</p>
         */
        @NameInMap("SqlType")
        public String sqlType;

        /**
         * <p>The child instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>r-8vba51c588ba3a94</p>
         */
        @NameInMap("SubInstanceId")
        public String subInstanceId;

        /**
         * <p>The table name.</p>
         * 
         * <strong>example:</strong>
         * <p>users\nifconfig\n</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The thread_id. This field is available only for PolarDB for MySQL.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ThreadId")
        public String threadId;

        /**
         * <p>The execution time, in UNIX timestamp format. Unit: milliseconds (ms).</p>
         * 
         * <strong>example:</strong>
         * <p>1708568930</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The total number of records. This parameter is valid only for the Redis engine.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        /**
         * <p>The slow log trends.</p>
         */
        @NameInMap("Trend")
        public java.util.List<DescribeSlowLogStatisticResponseBodyDataDataLogsTrend> trend;

        /**
         * <p>The user.</p>
         * 
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

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setAvgCPUTimeSeconds(Double avgCPUTimeSeconds) {
            this.avgCPUTimeSeconds = avgCPUTimeSeconds;
            return this;
        }
        public Double getAvgCPUTimeSeconds() {
            return this.avgCPUTimeSeconds;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setAvgDocExamined(Double avgDocExamined) {
            this.avgDocExamined = avgDocExamined;
            return this;
        }
        public Double getAvgDocExamined() {
            return this.avgDocExamined;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setAvgFrows(Double avgFrows) {
            this.avgFrows = avgFrows;
            return this;
        }
        public Double getAvgFrows() {
            return this.avgFrows;
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

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setAvgRequestSize(Double avgRequestSize) {
            this.avgRequestSize = avgRequestSize;
            return this;
        }
        public Double getAvgRequestSize() {
            return this.avgRequestSize;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setAvgResponseSize(Double avgResponseSize) {
            this.avgResponseSize = avgResponseSize;
            return this;
        }
        public Double getAvgResponseSize() {
            return this.avgResponseSize;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setAvgReturnNum(Double avgReturnNum) {
            this.avgReturnNum = avgReturnNum;
            return this;
        }
        public Double getAvgReturnNum() {
            return this.avgReturnNum;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setAvgRows(Double avgRows) {
            this.avgRows = avgRows;
            return this;
        }
        public Double getAvgRows() {
            return this.avgRows;
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

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setAvgRt(Double avgRt) {
            this.avgRt = avgRt;
            return this;
        }
        public Double getAvgRt() {
            return this.avgRt;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setAvgScnt(Double avgScnt) {
            this.avgScnt = avgScnt;
            return this;
        }
        public Double getAvgScnt() {
            return this.avgScnt;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setCPUTime(Double CPUTime) {
            this.CPUTime = CPUTime;
            return this;
        }
        public Double getCPUTime() {
            return this.CPUTime;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setCPUTimeSeconds(Double CPUTimeSeconds) {
            this.CPUTimeSeconds = CPUTimeSeconds;
            return this;
        }
        public Double getCPUTimeSeconds() {
            return this.CPUTimeSeconds;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setCmd(String cmd) {
            this.cmd = cmd;
            return this;
        }
        public String getCmd() {
            return this.cmd;
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

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setDbId(String dbId) {
            this.dbId = dbId;
            return this;
        }
        public String getDbId() {
            return this.dbId;
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

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setFrows(Long frows) {
            this.frows = frows;
            return this;
        }
        public Long getFrows() {
            return this.frows;
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

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setMaxCPUTimeSeconds(Double maxCPUTimeSeconds) {
            this.maxCPUTimeSeconds = maxCPUTimeSeconds;
            return this;
        }
        public Double getMaxCPUTimeSeconds() {
            return this.maxCPUTimeSeconds;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setMaxDocExamined(Long maxDocExamined) {
            this.maxDocExamined = maxDocExamined;
            return this;
        }
        public Long getMaxDocExamined() {
            return this.maxDocExamined;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setMaxFrows(Long maxFrows) {
            this.maxFrows = maxFrows;
            return this;
        }
        public Long getMaxFrows() {
            return this.maxFrows;
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

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setMaxRequestSize(Double maxRequestSize) {
            this.maxRequestSize = maxRequestSize;
            return this;
        }
        public Double getMaxRequestSize() {
            return this.maxRequestSize;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setMaxResponseSize(Double maxResponseSize) {
            this.maxResponseSize = maxResponseSize;
            return this;
        }
        public Double getMaxResponseSize() {
            return this.maxResponseSize;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setMaxReturnNum(Long maxReturnNum) {
            this.maxReturnNum = maxReturnNum;
            return this;
        }
        public Long getMaxReturnNum() {
            return this.maxReturnNum;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setMaxRows(Long maxRows) {
            this.maxRows = maxRows;
            return this;
        }
        public Long getMaxRows() {
            return this.maxRows;
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

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setMaxRt(Double maxRt) {
            this.maxRt = maxRt;
            return this;
        }
        public Double getMaxRt() {
            return this.maxRt;
        }

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setMaxScnt(Long maxScnt) {
            this.maxScnt = maxScnt;
            return this;
        }
        public Long getMaxScnt() {
            return this.maxScnt;
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

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setRows(Long rows) {
            this.rows = rows;
            return this;
        }
        public Long getRows() {
            return this.rows;
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

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
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

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setScnt(Long scnt) {
            this.scnt = scnt;
            return this;
        }
        public Long getScnt() {
            return this.scnt;
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

        public DescribeSlowLogStatisticResponseBodyDataDataLogs setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
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
         * <p>The numeric ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-k2ja51w7cnusg5a1x</p>
         */
        @NameInMap("DbInstanceId")
        public Long dbInstanceId;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DbInstanceName")
        public String dbInstanceName;

        /**
         * <p>The end time of the query task, in UNIX timestamp format. Unit: milliseconds.</p>
         * <blockquote>
         * <p>The end time of the query task must be later than the start time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2024-08-08T02:15:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The number of items in the log list on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ItemsNumbers")
        public Long itemsNumbers;

        /**
         * <p>The name of the operation object.</p>
         */
        @NameInMap("Logs")
        public java.util.List<DescribeSlowLogStatisticResponseBodyDataDataLogs> logs;

        /**
         * <p>The maximum number of records per page for the paged query. Valid values: 5 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxRecordsPerPage")
        public Integer maxRecordsPerPage;

        /**
         * <p>The node ID.</p>
         * <p>For MongoDB instances, specify a node for storage analysis by using this parameter. Call the <a href="https://help.aliyun.com/document_detail/123802.html">DescribeRoleZoneInfo</a> operation to query the details of each node in a MongoDB instance.</p>
         * <ul>
         * <li>If you specify the <strong>InsName</strong> (node ID) of the target node, such as <code>d-bp1872fa24d5****</code>, this operation analyzes the corresponding Hidden node.</li>
         * <li>If you specify the <code>InsName#RoleId</code> of the target node, such as <code>d-bp1872fa24d5****#299****5</code>, this operation analyzes the specified node.</li>
         * </ul>
         * <blockquote>
         * <p>Notice: For MongoDB replica set instances, if you do not specify this parameter, this operation analyzes the only Hidden node by default. For MongoDB sharded cluster instances, specify this parameter to designate the target node.</notice></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pi-wz99g5rn7w1x8h0sf</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The page number for the paged query. The value starts from 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumbers")
        public Integer pageNumbers;

        /**
         * <p>The start time, in UNIX timestamp format. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-08T02:01:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The total number of records.</p>
         * 
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
        /**
         * <p>The data.</p>
         */
        @NameInMap("Data")
        public DescribeSlowLogStatisticResponseBodyDataData data;

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>10910</p>
         */
        @NameInMap("ErrorCode")
        public Integer errorCode;

        /**
         * <p>Indicates whether the task is finished.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsFinish")
        public Boolean isFinish;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The key of the request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("RequestKey")
        public String requestKey;

        /**
         * <p>The result ID.</p>
         * 
         * <strong>example:</strong>
         * <p>async__665ee69612f1627c7fd9f3c85075****</p>
         */
        @NameInMap("ResultId")
        public String resultId;

        /**
         * <p>The current status. Valid values:</p>
         * <ul>
         * <li><strong>RUNNING</strong>: running.</li>
         * <li><strong>SUCCESS</strong>: succeeded.</li>
         * <li><strong>FAIL</strong>: failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The request time.</p>
         * 
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
