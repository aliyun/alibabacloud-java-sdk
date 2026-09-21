// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSqlInsightStatisticResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The envelope for asynchronous query results. The first call returns <strong>ResultId</strong> and <strong>State</strong>. Poll with the exact same request parameters until <strong>State</strong> is <strong>SUCCESS</strong>, then retrieve the statistical details from <strong>List</strong>.</p>
     */
    @NameInMap("Data")
    public DescribeSqlInsightStatisticResponseBodyData data;

    /**
     * <p>The response message. An error description is returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID of the request, which can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed. Check the <strong>Code</strong> and <strong>Message</strong> fields to determine the cause.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeSqlInsightStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlInsightStatisticResponseBody self = new DescribeSqlInsightStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSqlInsightStatisticResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSqlInsightStatisticResponseBody setData(DescribeSqlInsightStatisticResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSqlInsightStatisticResponseBodyData getData() {
        return this.data;
    }

    public DescribeSqlInsightStatisticResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSqlInsightStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSqlInsightStatisticResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeSqlInsightStatisticResponseBodyDataDataListTrend extends TeaModel {
        /**
         * <p>The timestamp of the trend data point. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1718000000000</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The number of SQL executions within the time slice.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Value")
        public Object value;

        public static DescribeSqlInsightStatisticResponseBodyDataDataListTrend build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlInsightStatisticResponseBodyDataDataListTrend self = new DescribeSqlInsightStatisticResponseBodyDataDataListTrend();
            return TeaModel.build(map, self);
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataListTrend setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataListTrend setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

    public static class DescribeSqlInsightStatisticResponseBodyDataDataList extends TeaModel {
        /**
         * <p>The number of affected rows for a single SQL statement. For <strong>SELECT</strong> statements, this indicates the number of scanned rows. For <strong>DML</strong> statements, this indicates the number of affected rows.</p>
         * <blockquote>
         * <p>Returned only for Lindorm instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("AffectRows")
        public Long affectRows;

        /**
         * <p>The value of the aggregation dimension for this statistical entry, which varies based on the <strong>Type</strong> request parameter. Valid values:</p>
         * <ul>
         * <li>When aggregated by SQL template: the SQL template ID, which is the same as <strong>SqlId</strong>.</li>
         * <li>When <strong>Type</strong> is set to <strong>FullRequestOrigin</strong>: the access source address.</li>
         * <li>When <strong>Type</strong> is set to <strong>FullRequestUser</strong>: the database username.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>651b56fe9418d48edb8fdf0980ec****</p>
         */
        @NameInMap("AggKey")
        public String aggKey;

        /**
         * <p>The average number of affected rows.</p>
         * <blockquote>
         * <p>Returned only for Lindorm instances. The value is null for other database engines.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30.2</p>
         */
        @NameInMap("AvgAffectRows")
        public Double avgAffectRows;

        /**
         * <p>The average CPU time consumed by SQL execution, in microseconds.</p>
         * <blockquote>
         * <p>This metric is exclusive to SQL Server instances. The value is null for other database engines.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>12.5</p>
         */
        @NameInMap("AvgCpuTime")
        public Double avgCpuTime;

        /**
         * <p>The average number of rows fetched by the PolarDB-X compute node from data nodes.</p>
         * <blockquote>
         * <p>This metric is exclusive to PolarDB-X compute nodes. The value is null or 0 for other database engines.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AvgFrows")
        public Double avgFrows;

        /**
         * <p>The average lock wait time per execution, in milliseconds.</p>
         * <blockquote>
         * <p>Data is available only when <strong>Version</strong> is set to <strong>1</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.00009589874265269765</p>
         */
        @NameInMap("AvgLockWaitTime")
        public Double avgLockWaitTime;

        /**
         * <p>The average number of logical reads per execution.</p>
         * <blockquote>
         * <p>Data is available only when <strong>Version</strong> is set to <strong>1</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>654.4470327860251</p>
         */
        @NameInMap("AvgLogicalRead")
        public Double avgLogicalRead;

        /**
         * <p>The average number of physical asynchronous reads per execution.</p>
         * <blockquote>
         * <p>Data is available only when <strong>Version</strong> is set to <strong>1</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AvgPhysicalAsyncRead")
        public Double avgPhysicalAsyncRead;

        /**
         * <p>The average number of physical reads.</p>
         * <blockquote>
         * <p>This metric is exclusive to SQL Server instances. The value is null for other database engines.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>654.4</p>
         */
        @NameInMap("AvgPhysicalRead")
        public Double avgPhysicalRead;

        /**
         * <p>The average number of physical synchronous reads per execution.</p>
         * <blockquote>
         * <p>Data is available only when <strong>Version</strong> is set to <strong>1</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AvgPhysicalSyncRead")
        public Double avgPhysicalSyncRead;

        /**
         * <p>The average number of updated rows and returned rows for the PolarDB-X compute node.</p>
         * <blockquote>
         * <p>This metric is exclusive to PolarDB-X compute nodes. The value is null or 0 for other database engines.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AvgRows")
        public Double avgRows;

        /**
         * <p>The average number of rows scanned per execution.</p>
         * 
         * <strong>example:</strong>
         * <p>53421.0</p>
         */
        @NameInMap("AvgRowsExamined")
        public Double avgRowsExamined;

        /**
         * <p>The average number of rows returned per execution.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("AvgRowsReturned")
        public Double avgRowsReturned;

        /**
         * <p>The average number of rows updated per execution.</p>
         * 
         * <strong>example:</strong>
         * <p>30.2</p>
         */
        @NameInMap("AvgRowsUpdated")
        public Double avgRowsUpdated;

        /**
         * <p>The average execution time per execution, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2.499</p>
         */
        @NameInMap("AvgRt")
        public Double avgRt;

        /**
         * <p>The average number of scanned rows.</p>
         * <blockquote>
         * <p>This field is not returned by this operation. Use <strong>AvgRowsExamined</strong> for the average number of scanned rows.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>53421.0</p>
         */
        @NameInMap("AvgScanRows")
        public Double avgScanRows;

        /**
         * <p>The average number of requests sent by the PolarDB-X compute node to data nodes.</p>
         * <blockquote>
         * <p>This metric is exclusive to PolarDB-X compute nodes. The value is null or 0 for other database engines.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AvgScnt")
        public Double avgScnt;

        /**
         * <p>The average number of logical writes.</p>
         * <blockquote>
         * <p>This metric is exclusive to SQL Server instances. The value is null for other database engines.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AvgWrites")
        public Double avgWrites;

        /**
         * <p>The total number of executions of the SQL template within the statistical interval.</p>
         * 
         * <strong>example:</strong>
         * <p>127</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The ratio of the number of executions of this statistical entry to the total number of executions of all SQL statements on the instance. The value ranges from 0 to 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0586</p>
         */
        @NameInMap("CountRate")
        public Double countRate;

        /**
         * <p>The total CPU time consumed by SQL execution, in microseconds.</p>
         * <blockquote>
         * <p>This metric is exclusive to SQL Server instances. The value is null for other database engines.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CpuTime")
        public Long cpuTime;

        /**
         * <p>The name of the database where the SQL statement is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>dbtest01</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The error code returned by SQL execution.</p>
         * <blockquote>
         * <p>The error code is a detail of a single SQL statement. This operation returns template-level aggregated statistics and does not return this field. Use <strong>ErrorCount</strong> for error information.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1146</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The number of execution errors for the SQL template within the statistical interval.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ErrorCount")
        public Long errorCount;

        /**
         * <p>The time when the SQL template first appeared.</p>
         * <blockquote>
         * <p>This field is not returned by this operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1659308149000</p>
         */
        @NameInMap("FirstTime")
        public Long firstTime;

        /**
         * <p>The total number of rows fetched by the PolarDB-X compute node from data nodes.</p>
         * <blockquote>
         * <p>This metric is exclusive to PolarDB-X compute nodes. The value is null or 0 for other database engines.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Frows")
        public Long frows;

        /**
         * <p>The hash value of the SQL template, returned together with the SQL template.</p>
         * <blockquote>
         * <p>This value is generated by the PolarDB-X compute node kernel. The value is empty for non-PolarDB-X compute node instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2e8147b5ca2dfc640dfd5e43d96a****</p>
         */
        @NameInMap("Hash")
        public String hash;

        /**
         * <p>The endpoint of the instance to which the statistical data belongs.</p>
         * <blockquote>
         * <p>Whether this field is returned depends on the aggregated storage link of the instance. The value is null for some links.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze1jdv45i7l6****.mysql.rds.aliyuncs.com</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The total lock wait time, in milliseconds.</p>
         * <blockquote>
         * <p>Data is available only when <strong>Version</strong> is set to <strong>1</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1089.4177720290281</p>
         */
        @NameInMap("LockWaitTime")
        public Double lockWaitTime;

        /**
         * <p>The total number of logical reads.</p>
         * <blockquote>
         * <p>Data is available only when <strong>Version</strong> is set to <strong>1</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>165848</p>
         */
        @NameInMap("LogicalRead")
        public Double logicalRead;

        /**
         * <p>The maximum CPU time in a single execution, in microseconds.</p>
         * <blockquote>
         * <p>This metric is exclusive to SQL Server instances. The value is null for other database engines.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("MaxCpuTime")
        public Long maxCpuTime;

        /**
         * <p>The maximum number of logical reads in a single execution.</p>
         * <blockquote>
         * <p>Data is available only when <strong>Version</strong> is set to <strong>1</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3186</p>
         */
        @NameInMap("MaxLogicalRead")
        public Long maxLogicalRead;

        /**
         * <p>The maximum number of physical reads in a single execution.</p>
         * <blockquote>
         * <p>This metric is exclusive to SQL Server instances. The value is null for other database engines.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3186</p>
         */
        @NameInMap("MaxPhysicalRead")
        public Long maxPhysicalRead;

        /**
         * <p>The maximum number of rows scanned in a single execution.</p>
         * <blockquote>
         * <p>This field is not returned by this operation. Use <strong>RowsExamined</strong> and <strong>AvgRowsExamined</strong> for scanned row counts.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>318613</p>
         */
        @NameInMap("MaxRowsExamined")
        public Long maxRowsExamined;

        /**
         * <p>The maximum number of rows returned in a single execution.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxRowsReturned")
        public Long maxRowsReturned;

        /**
         * <p>The maximum execution time in a single execution, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>12.499</p>
         */
        @NameInMap("MaxRt")
        public Double maxRt;

        /**
         * <p>The maximum number of logical writes in a single execution.</p>
         * <blockquote>
         * <p>This metric is exclusive to SQL Server instances. The value is null for other database engines.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("MaxWrites")
        public Long maxWrites;

        /**
         * <p>The minimum CPU time in a single execution, in microseconds.</p>
         * <blockquote>
         * <p>This metric is exclusive to SQL Server instances. The value is null for other database engines.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MinCpuTime")
        public Long minCpuTime;

        /**
         * <p>The minimum number of logical reads in a single execution.</p>
         * <blockquote>
         * <p>Data is available only when <strong>Version</strong> is set to <strong>1</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("MinLogicalRead")
        public Long minLogicalRead;

        /**
         * <p>The minimum number of physical reads in a single execution.</p>
         * <blockquote>
         * <p>This metric is exclusive to SQL Server instances. The value is null for other database engines.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("MinPhysicalRead")
        public Long minPhysicalRead;

        /**
         * <p>The minimum number of rows returned in a single execution.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinRowsReturned")
        public Long minRowsReturned;

        /**
         * <p>The minimum execution time in a single execution, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0.409789</p>
         */
        @NameInMap("MinRt")
        public Double minRt;

        /**
         * <p>The minimum number of logical writes in a single execution.</p>
         * <blockquote>
         * <p>This metric is exclusive to SQL Server instances. The value is null for other database engines.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("MinWrites")
        public Long minWrites;

        /**
         * <p>The display alias configured for the access source address.</p>
         * <blockquote>
         * <p>Returned only when aggregated by access source (when <strong>Type</strong> is set to <strong>FullRequestOrigin</strong>). The value is null in other scenarios.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>order-1</p>
         */
        @NameInMap("OriginAlias")
        public String originAlias;

        /**
         * <p>The source address of the client that initiated the SQL statement.</p>
         * <blockquote>
         * <p>When <strong>Type</strong> is set to <strong>FullRequestOrigin</strong>, this field serves as the aggregation dimension for the statistical entry.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.26.XX.XXX</p>
         */
        @NameInMap("OriginHost")
        public String originHost;

        /**
         * <p>The parameter content of the SQL sample.</p>
         * <blockquote>
         * <p>This operation returns template-level aggregated statistics and does not return this field.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[1, &quot;das&quot;]</p>
         */
        @NameInMap("Params")
        public String params;

        /**
         * <p>The total number of physical asynchronous reads.</p>
         * <blockquote>
         * <p>Data is available only when <strong>Version</strong> is set to <strong>1</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PhysicalAsyncRead")
        public Double physicalAsyncRead;

        /**
         * <p>The total number of physical reads.</p>
         * <blockquote>
         * <p>This metric is exclusive to SQL Server instances. The value is null for other database engines.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>165848</p>
         */
        @NameInMap("PhysicalRead")
        public Long physicalRead;

        /**
         * <p>The total number of physical synchronous reads.</p>
         * <blockquote>
         * <p>Data is available only when <strong>Version</strong> is set to <strong>1</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PhysicalSyncRead")
        public Double physicalSyncRead;

        /**
         * <p>The port of the instance to which the statistical data belongs.</p>
         * <blockquote>
         * <p>Whether this field is returned depends on the aggregated storage link of the instance. The value is null for some links.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The parameterized SQL template text, which is the statement with constants in the SQL replaced by placeholders.</p>
         * 
         * <strong>example:</strong>
         * <p>select * from t_order where id = ?</p>
         */
        @NameInMap("Psql")
        public String psql;

        /**
         * <p>The total number of updated rows and returned rows for the PolarDB-X compute node.</p>
         * <blockquote>
         * <p>This metric is exclusive to PolarDB-X compute nodes. The value is null or 0 for other engines.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Rows")
        public Long rows;

        /**
         * <p>The total number of rows examined by the SQL template within the statistical interval.</p>
         * 
         * <strong>example:</strong>
         * <p>2048576</p>
         */
        @NameInMap("RowsExamined")
        public Long rowsExamined;

        /**
         * <p>The total number of rows returned by the SQL template within the statistical interval.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("RowsReturned")
        public Long rowsReturned;

        /**
         * <p>The total execution duration of the SQL template within the statistical interval. Unit: milliseconds.</p>
         * <blockquote>
         * <p>For PolarDB-X compute nodes (where <strong>Role</strong> is <strong>polarx_cn</strong>) with kernel versions earlier than 5.4.13, this value is converted from microseconds to milliseconds.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.409789</p>
         */
        @NameInMap("Rt")
        public Double rt;

        /**
         * <p>The number of times the execution duration exceeds 1 second.</p>
         * <blockquote>
         * <p>Whether this field is returned depends on the aggregation storage link of the instance. The value is null for certain links.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("RtGreaterThanOneSecondCount")
        public Long rtGreaterThanOneSecondCount;

        /**
         * <p>The ratio of the total execution duration of this entry to the total execution duration of all SQL statements on the instance. Valid values: 0 to 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1384</p>
         */
        @NameInMap("RtRate")
        public Double rtRate;

        /**
         * <p>The type identifier of the sample data.</p>
         * <blockquote>
         * <p>This operation returns aggregated statistics and does not return this field.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sql</p>
         */
        @NameInMap("SampleType")
        public String sampleType;

        /**
         * <p>The number of rows scanned by a single SQL statement.</p>
         * <blockquote>
         * <p>This operation returns template-level aggregated statistics and does not return this field. Use the aggregated metrics <strong>RowsExamined</strong> and <strong>AvgRowsExamined</strong> instead.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>29</p>
         */
        @NameInMap("ScanRows")
        public Long scanRows;

        /**
         * <p>The total number of requests sent from the PolarDB-X compute node to data nodes.</p>
         * <blockquote>
         * <p>This metric is exclusive to PolarDB-X compute nodes. The value is null or 0 for other engines.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Scnt")
        public Long scnt;

        /**
         * <p>The original SQL text.</p>
         * <blockquote>
         * <p>The statistical results return the SQL template (<strong>Psql</strong>) and do not return this field.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>select * from t_order where id = 1</p>
         */
        @NameInMap("Sql")
        public String sql;

        /**
         * <p>The SQL template ID that uniquely identifies a type of parameterized SQL statement. Multiple executions under the same template are aggregated into a single statistical entry. You can use this ID to correlate the same type of SQL across multi-dimensional queries.</p>
         * 
         * <strong>example:</strong>
         * <p>651b56fe9418d48edb8fdf0980ec****</p>
         */
        @NameInMap("SqlId")
        public String sqlId;

        /**
         * <p>The SQL text with parameter values uniformly processed, used in sample data scenarios.</p>
         * <blockquote>
         * <p>This operation does not return this field.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>select * from t_order where id = ?</p>
         */
        @NameInMap("SqlNew")
        public String sqlNew;

        /**
         * <p>The SQL text feature value, used in SQL analysis scenarios.</p>
         * <blockquote>
         * <p>This operation does not return this field.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>select_from_t_order</p>
         */
        @NameInMap("SqlTextFeature")
        public String sqlTextFeature;

        /**
         * <p>The SQL type. Valid values:</p>
         * <ul>
         * <li><strong>select</strong></li>
         * <li><strong>insert</strong></li>
         * <li><strong>update</strong></li>
         * <li><strong>delete</strong></li>
         * <li><strong>other</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>select</p>
         */
        @NameInMap("SqlType")
        public String sqlType;

        /**
         * <p>The total number of rows updated by the SQL template within the statistical interval.</p>
         * 
         * <strong>example:</strong>
         * <p>3810</p>
         */
        @NameInMap("SumRowsUpdated")
        public Double sumRowsUpdated;

        /**
         * <p>The list of table names involved in the SQL statement.</p>
         */
        @NameInMap("Tables")
        public java.util.List<String> tables;

        /**
         * <p>The database thread ID that executed the SQL statement.</p>
         * <blockquote>
         * <p>The thread ID is a detail of a single SQL statement. This operation returns template-level aggregated statistics and does not return this field.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>57472578</p>
         */
        @NameInMap("ThreadId")
        public String threadId;

        /**
         * <p>The execution duration ratio.</p>
         * <blockquote>
         * <p>This operation returns the execution duration ratio through <strong>RtRate</strong> and does not return this field.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.1384</p>
         */
        @NameInMap("TimeRate")
        public Double timeRate;

        /**
         * <p>The data timestamp. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * <blockquote>
         * <p>The statistical results are aggregated at the SQL template level and do not return this field.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1718600000000</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The total number of affected rows.</p>
         * <blockquote>
         * <p>This field is returned only for Lindorm instances. The value is null for other engines.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3810</p>
         */
        @NameInMap("TotalAffectRows")
        public Long totalAffectRows;

        /**
         * <p>The total SQL execution duration.</p>
         * <blockquote>
         * <p>This operation does not return this field. Use <strong>Rt</strong> for the total execution duration.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>310</p>
         */
        @NameInMap("TotalRt")
        public Long totalRt;

        /**
         * <p>The total number of rows scanned.</p>
         * <blockquote>
         * <p>This operation does not return this field. Use <strong>RowsExamined</strong> for the total number of rows scanned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2048576</p>
         */
        @NameInMap("TotalScanRows")
        public Long totalScanRows;

        /**
         * <p>The execution count trend sequence of the SQL template, divided into time slices within the query time window.</p>
         * <blockquote>
         * <p>This field is returned only when the request parameter <strong>DoFillTrend</strong> is set to <strong>true</strong> and the trend padding capability is enabled for the instance. The time slice interval is automatically determined by the query span. Time slices with no data may be padded with zeros.</p>
         * </blockquote>
         */
        @NameInMap("Trend")
        public java.util.List<DescribeSqlInsightStatisticResponseBodyDataDataListTrend> trend;

        /**
         * <p>The number of rows updated by a single SQL statement.</p>
         * <blockquote>
         * <p>This operation returns template-level aggregated statistics and does not return this field. Use the aggregated metrics <strong>SumRowsUpdated</strong> and <strong>AvgRowsUpdated</strong> instead.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("UpdateRows")
        public Long updateRows;

        /**
         * <p>The database username that executed the SQL statement.</p>
         * <blockquote>
         * <p>When <strong>Type</strong> is set to <strong>FullRequestUser</strong>, this field serves as the aggregation dimension for the statistical entry.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testUser</p>
         */
        @NameInMap("User")
        public String user;

        /**
         * <p>The SQL Explorer data collection link version. The value <strong>1</strong> is returned when the instance collects logical read or lock wait data. Otherwise, the value <strong>0</strong> is returned. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: V0 basic collection link.</li>
         * <li><strong>1</strong>: V1 collection link, which additionally collects four metrics (<strong>LockWaitTime</strong>, <strong>LogicalRead</strong>, <strong>PhysicalSyncRead</strong>, and <strong>PhysicalAsyncRead</strong>) on top of V0.</li>
         * </ul>
         * <blockquote>
         * <p>When the value is <strong>0</strong>, the extended metrics contain no data.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

        /**
         * <p>The VPC ID of the instance to which the statistical data belongs.</p>
         * <blockquote>
         * <p>Whether this field is returned depends on the aggregation storage link of the instance. The value is null for certain links.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zentqj1sk4qmolci****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The total number of logical writes.</p>
         * <blockquote>
         * <p>This metric is exclusive to SQL Server instances. The value is null for other engines.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Writes")
        public Long writes;

        public static DescribeSqlInsightStatisticResponseBodyDataDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlInsightStatisticResponseBodyDataDataList self = new DescribeSqlInsightStatisticResponseBodyDataDataList();
            return TeaModel.build(map, self);
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setAffectRows(Long affectRows) {
            this.affectRows = affectRows;
            return this;
        }
        public Long getAffectRows() {
            return this.affectRows;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setAggKey(String aggKey) {
            this.aggKey = aggKey;
            return this;
        }
        public String getAggKey() {
            return this.aggKey;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setAvgAffectRows(Double avgAffectRows) {
            this.avgAffectRows = avgAffectRows;
            return this;
        }
        public Double getAvgAffectRows() {
            return this.avgAffectRows;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setAvgCpuTime(Double avgCpuTime) {
            this.avgCpuTime = avgCpuTime;
            return this;
        }
        public Double getAvgCpuTime() {
            return this.avgCpuTime;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setAvgFrows(Double avgFrows) {
            this.avgFrows = avgFrows;
            return this;
        }
        public Double getAvgFrows() {
            return this.avgFrows;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setAvgLockWaitTime(Double avgLockWaitTime) {
            this.avgLockWaitTime = avgLockWaitTime;
            return this;
        }
        public Double getAvgLockWaitTime() {
            return this.avgLockWaitTime;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setAvgLogicalRead(Double avgLogicalRead) {
            this.avgLogicalRead = avgLogicalRead;
            return this;
        }
        public Double getAvgLogicalRead() {
            return this.avgLogicalRead;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setAvgPhysicalAsyncRead(Double avgPhysicalAsyncRead) {
            this.avgPhysicalAsyncRead = avgPhysicalAsyncRead;
            return this;
        }
        public Double getAvgPhysicalAsyncRead() {
            return this.avgPhysicalAsyncRead;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setAvgPhysicalRead(Double avgPhysicalRead) {
            this.avgPhysicalRead = avgPhysicalRead;
            return this;
        }
        public Double getAvgPhysicalRead() {
            return this.avgPhysicalRead;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setAvgPhysicalSyncRead(Double avgPhysicalSyncRead) {
            this.avgPhysicalSyncRead = avgPhysicalSyncRead;
            return this;
        }
        public Double getAvgPhysicalSyncRead() {
            return this.avgPhysicalSyncRead;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setAvgRows(Double avgRows) {
            this.avgRows = avgRows;
            return this;
        }
        public Double getAvgRows() {
            return this.avgRows;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setAvgRowsExamined(Double avgRowsExamined) {
            this.avgRowsExamined = avgRowsExamined;
            return this;
        }
        public Double getAvgRowsExamined() {
            return this.avgRowsExamined;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setAvgRowsReturned(Double avgRowsReturned) {
            this.avgRowsReturned = avgRowsReturned;
            return this;
        }
        public Double getAvgRowsReturned() {
            return this.avgRowsReturned;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setAvgRowsUpdated(Double avgRowsUpdated) {
            this.avgRowsUpdated = avgRowsUpdated;
            return this;
        }
        public Double getAvgRowsUpdated() {
            return this.avgRowsUpdated;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setAvgRt(Double avgRt) {
            this.avgRt = avgRt;
            return this;
        }
        public Double getAvgRt() {
            return this.avgRt;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setAvgScanRows(Double avgScanRows) {
            this.avgScanRows = avgScanRows;
            return this;
        }
        public Double getAvgScanRows() {
            return this.avgScanRows;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setAvgScnt(Double avgScnt) {
            this.avgScnt = avgScnt;
            return this;
        }
        public Double getAvgScnt() {
            return this.avgScnt;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setAvgWrites(Double avgWrites) {
            this.avgWrites = avgWrites;
            return this;
        }
        public Double getAvgWrites() {
            return this.avgWrites;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setCountRate(Double countRate) {
            this.countRate = countRate;
            return this;
        }
        public Double getCountRate() {
            return this.countRate;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setCpuTime(Long cpuTime) {
            this.cpuTime = cpuTime;
            return this;
        }
        public Long getCpuTime() {
            return this.cpuTime;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setErrorCount(Long errorCount) {
            this.errorCount = errorCount;
            return this;
        }
        public Long getErrorCount() {
            return this.errorCount;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setFirstTime(Long firstTime) {
            this.firstTime = firstTime;
            return this;
        }
        public Long getFirstTime() {
            return this.firstTime;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setFrows(Long frows) {
            this.frows = frows;
            return this;
        }
        public Long getFrows() {
            return this.frows;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setHash(String hash) {
            this.hash = hash;
            return this;
        }
        public String getHash() {
            return this.hash;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setLockWaitTime(Double lockWaitTime) {
            this.lockWaitTime = lockWaitTime;
            return this;
        }
        public Double getLockWaitTime() {
            return this.lockWaitTime;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setLogicalRead(Double logicalRead) {
            this.logicalRead = logicalRead;
            return this;
        }
        public Double getLogicalRead() {
            return this.logicalRead;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setMaxCpuTime(Long maxCpuTime) {
            this.maxCpuTime = maxCpuTime;
            return this;
        }
        public Long getMaxCpuTime() {
            return this.maxCpuTime;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setMaxLogicalRead(Long maxLogicalRead) {
            this.maxLogicalRead = maxLogicalRead;
            return this;
        }
        public Long getMaxLogicalRead() {
            return this.maxLogicalRead;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setMaxPhysicalRead(Long maxPhysicalRead) {
            this.maxPhysicalRead = maxPhysicalRead;
            return this;
        }
        public Long getMaxPhysicalRead() {
            return this.maxPhysicalRead;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setMaxRowsExamined(Long maxRowsExamined) {
            this.maxRowsExamined = maxRowsExamined;
            return this;
        }
        public Long getMaxRowsExamined() {
            return this.maxRowsExamined;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setMaxRowsReturned(Long maxRowsReturned) {
            this.maxRowsReturned = maxRowsReturned;
            return this;
        }
        public Long getMaxRowsReturned() {
            return this.maxRowsReturned;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setMaxRt(Double maxRt) {
            this.maxRt = maxRt;
            return this;
        }
        public Double getMaxRt() {
            return this.maxRt;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setMaxWrites(Long maxWrites) {
            this.maxWrites = maxWrites;
            return this;
        }
        public Long getMaxWrites() {
            return this.maxWrites;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setMinCpuTime(Long minCpuTime) {
            this.minCpuTime = minCpuTime;
            return this;
        }
        public Long getMinCpuTime() {
            return this.minCpuTime;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setMinLogicalRead(Long minLogicalRead) {
            this.minLogicalRead = minLogicalRead;
            return this;
        }
        public Long getMinLogicalRead() {
            return this.minLogicalRead;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setMinPhysicalRead(Long minPhysicalRead) {
            this.minPhysicalRead = minPhysicalRead;
            return this;
        }
        public Long getMinPhysicalRead() {
            return this.minPhysicalRead;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setMinRowsReturned(Long minRowsReturned) {
            this.minRowsReturned = minRowsReturned;
            return this;
        }
        public Long getMinRowsReturned() {
            return this.minRowsReturned;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setMinRt(Double minRt) {
            this.minRt = minRt;
            return this;
        }
        public Double getMinRt() {
            return this.minRt;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setMinWrites(Long minWrites) {
            this.minWrites = minWrites;
            return this;
        }
        public Long getMinWrites() {
            return this.minWrites;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setOriginAlias(String originAlias) {
            this.originAlias = originAlias;
            return this;
        }
        public String getOriginAlias() {
            return this.originAlias;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setOriginHost(String originHost) {
            this.originHost = originHost;
            return this;
        }
        public String getOriginHost() {
            return this.originHost;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setPhysicalAsyncRead(Double physicalAsyncRead) {
            this.physicalAsyncRead = physicalAsyncRead;
            return this;
        }
        public Double getPhysicalAsyncRead() {
            return this.physicalAsyncRead;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setPhysicalRead(Long physicalRead) {
            this.physicalRead = physicalRead;
            return this;
        }
        public Long getPhysicalRead() {
            return this.physicalRead;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setPhysicalSyncRead(Double physicalSyncRead) {
            this.physicalSyncRead = physicalSyncRead;
            return this;
        }
        public Double getPhysicalSyncRead() {
            return this.physicalSyncRead;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setPsql(String psql) {
            this.psql = psql;
            return this;
        }
        public String getPsql() {
            return this.psql;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setRows(Long rows) {
            this.rows = rows;
            return this;
        }
        public Long getRows() {
            return this.rows;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setRowsExamined(Long rowsExamined) {
            this.rowsExamined = rowsExamined;
            return this;
        }
        public Long getRowsExamined() {
            return this.rowsExamined;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setRowsReturned(Long rowsReturned) {
            this.rowsReturned = rowsReturned;
            return this;
        }
        public Long getRowsReturned() {
            return this.rowsReturned;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setRt(Double rt) {
            this.rt = rt;
            return this;
        }
        public Double getRt() {
            return this.rt;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setRtGreaterThanOneSecondCount(Long rtGreaterThanOneSecondCount) {
            this.rtGreaterThanOneSecondCount = rtGreaterThanOneSecondCount;
            return this;
        }
        public Long getRtGreaterThanOneSecondCount() {
            return this.rtGreaterThanOneSecondCount;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setRtRate(Double rtRate) {
            this.rtRate = rtRate;
            return this;
        }
        public Double getRtRate() {
            return this.rtRate;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setSampleType(String sampleType) {
            this.sampleType = sampleType;
            return this;
        }
        public String getSampleType() {
            return this.sampleType;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setScanRows(Long scanRows) {
            this.scanRows = scanRows;
            return this;
        }
        public Long getScanRows() {
            return this.scanRows;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setScnt(Long scnt) {
            this.scnt = scnt;
            return this;
        }
        public Long getScnt() {
            return this.scnt;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setSqlNew(String sqlNew) {
            this.sqlNew = sqlNew;
            return this;
        }
        public String getSqlNew() {
            return this.sqlNew;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setSqlTextFeature(String sqlTextFeature) {
            this.sqlTextFeature = sqlTextFeature;
            return this;
        }
        public String getSqlTextFeature() {
            return this.sqlTextFeature;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setSumRowsUpdated(Double sumRowsUpdated) {
            this.sumRowsUpdated = sumRowsUpdated;
            return this;
        }
        public Double getSumRowsUpdated() {
            return this.sumRowsUpdated;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setTables(java.util.List<String> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<String> getTables() {
            return this.tables;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setThreadId(String threadId) {
            this.threadId = threadId;
            return this;
        }
        public String getThreadId() {
            return this.threadId;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setTimeRate(Double timeRate) {
            this.timeRate = timeRate;
            return this;
        }
        public Double getTimeRate() {
            return this.timeRate;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setTotalAffectRows(Long totalAffectRows) {
            this.totalAffectRows = totalAffectRows;
            return this;
        }
        public Long getTotalAffectRows() {
            return this.totalAffectRows;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setTotalRt(Long totalRt) {
            this.totalRt = totalRt;
            return this;
        }
        public Long getTotalRt() {
            return this.totalRt;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setTotalScanRows(Long totalScanRows) {
            this.totalScanRows = totalScanRows;
            return this;
        }
        public Long getTotalScanRows() {
            return this.totalScanRows;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setTrend(java.util.List<DescribeSqlInsightStatisticResponseBodyDataDataListTrend> trend) {
            this.trend = trend;
            return this;
        }
        public java.util.List<DescribeSqlInsightStatisticResponseBodyDataDataListTrend> getTrend() {
            return this.trend;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setUpdateRows(Long updateRows) {
            this.updateRows = updateRows;
            return this;
        }
        public Long getUpdateRows() {
            return this.updateRows;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeSqlInsightStatisticResponseBodyDataDataList setWrites(Long writes) {
            this.writes = writes;
            return this;
        }
        public Long getWrites() {
            return this.writes;
        }

    }

    public static class DescribeSqlInsightStatisticResponseBodyDataData extends TeaModel {
        /**
         * <p>The extended information.</p>
         * <blockquote>
         * <p>This field is not returned by this operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Extra")
        public Object extra;

        /**
         * <p>The list of SQL Explorer statistical results. Each element is a statistical entry under an aggregation dimension.</p>
         */
        @NameInMap("List")
        public java.util.List<DescribeSqlInsightStatisticResponseBodyDataDataList> list;

        /**
         * <p>The current page number, corresponding to the request parameter <strong>PageNo</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Long pageNo;

        /**
         * <p>The number of entries per page, corresponding to the request parameter <strong>PageSize</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of statistical entries that match the query conditions. You can use this value for pagination calculation.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Total")
        public Long total;

        public static DescribeSqlInsightStatisticResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlInsightStatisticResponseBodyDataData self = new DescribeSqlInsightStatisticResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public DescribeSqlInsightStatisticResponseBodyDataData setExtra(Object extra) {
            this.extra = extra;
            return this;
        }
        public Object getExtra() {
            return this.extra;
        }

        public DescribeSqlInsightStatisticResponseBodyDataData setList(java.util.List<DescribeSqlInsightStatisticResponseBodyDataDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<DescribeSqlInsightStatisticResponseBodyDataDataList> getList() {
            return this.list;
        }

        public DescribeSqlInsightStatisticResponseBodyDataData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public DescribeSqlInsightStatisticResponseBodyDataData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeSqlInsightStatisticResponseBodyDataData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class DescribeSqlInsightStatisticResponseBodyData extends TeaModel {
        /**
         * <p>The SQL Explorer statistical query results.</p>
         * <blockquote>
         * <p>Returned only when <strong>State</strong> is <strong>SUCCESS</strong>.</p>
         * </blockquote>
         */
        @NameInMap("Data")
        public DescribeSqlInsightStatisticResponseBodyDataData data;

        /**
         * <p>The error code of the asynchronous query failure.</p>
         * <blockquote>
         * <p>This field is returned only when the query fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>-10200020</p>
         */
        @NameInMap("ErrorCode")
        public Integer errorCode;

        /**
         * <p>Indicates whether the asynchronous query has completed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: <strong>State</strong> is <strong>SUCCESS</strong> or <strong>FAIL</strong>.</li>
         * <li><strong>false</strong>: <strong>State</strong> is <strong>RUNNING</strong>.</li>
         * </ul>
         */
        @NameInMap("IsFinish")
        public Boolean isFinish;

        /**
         * <p>The error description of the asynchronous query failure.</p>
         * <blockquote>
         * <p>This field is returned only when the query fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>startTime must be in 30 days and the interval must be within 7 day</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The hash identifier of the request parameters.</p>
         * <blockquote>
         * <p>This operation does not return this field. Use <strong>ResultId</strong> to identify the asynchronous query.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>507044db6c4eadfa2dab9b084e80****</p>
         */
        @NameInMap("RequestKey")
        public String requestKey;

        /**
         * <p>The asynchronous query result ID, in the format of an async_ prefix followed by a hash value computed from all business parameters of the request.</p>
         * <blockquote>
         * <p>Repeated calls with the same parameters return the same query result. Therefore, when polling, you must use exactly the same request parameters as the initial call. Any change in parameters generates a different <strong>ResultId</strong> and triggers a new query.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>async__507044db6c4eadfa2dab9b084e80****</p>
         */
        @NameInMap("ResultId")
        public String resultId;

        /**
         * <p>The current status of the asynchronous query. Valid values:</p>
         * <ul>
         * <li><strong>RUNNING</strong>: The query is in progress. Continue polling.</li>
         * <li><strong>SUCCESS</strong>: The query succeeded. The <strong>Data</strong> field contains data only in this state.</li>
         * <li><strong>FAIL</strong>: The query failed.</li>
         * </ul>
         * <blockquote>
         * <p>When the query fails, the operation directly returns an error code and error message instead of a normal response body with <strong>State</strong> set to <strong>FAIL</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The time when the asynchronous query was submitted. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * <blockquote>
         * <p>When the query fails, this value indicates the time when the failure occurred.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1718600000000</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        public static DescribeSqlInsightStatisticResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlInsightStatisticResponseBodyData self = new DescribeSqlInsightStatisticResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSqlInsightStatisticResponseBodyData setData(DescribeSqlInsightStatisticResponseBodyDataData data) {
            this.data = data;
            return this;
        }
        public DescribeSqlInsightStatisticResponseBodyDataData getData() {
            return this.data;
        }

        public DescribeSqlInsightStatisticResponseBodyData setErrorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public Integer getErrorCode() {
            return this.errorCode;
        }

        public DescribeSqlInsightStatisticResponseBodyData setIsFinish(Boolean isFinish) {
            this.isFinish = isFinish;
            return this;
        }
        public Boolean getIsFinish() {
            return this.isFinish;
        }

        public DescribeSqlInsightStatisticResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeSqlInsightStatisticResponseBodyData setRequestKey(String requestKey) {
            this.requestKey = requestKey;
            return this;
        }
        public String getRequestKey() {
            return this.requestKey;
        }

        public DescribeSqlInsightStatisticResponseBodyData setResultId(String resultId) {
            this.resultId = resultId;
            return this;
        }
        public String getResultId() {
            return this.resultId;
        }

        public DescribeSqlInsightStatisticResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeSqlInsightStatisticResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
