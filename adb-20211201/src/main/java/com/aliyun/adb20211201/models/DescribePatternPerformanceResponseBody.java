// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribePatternPerformanceResponseBody extends TeaModel {
    /**
     * <p>The client IP address that submitted the queries that match the sql pattern.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.14.*</p>
     */
    @NameInMap("AccessIp")
    public String accessIp;

    /**
     * <p>The end of the query time range. The time is in UTC and is formatted as <em>yyyy-MM-ddTHH:mmZ</em>.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-08-22T01:06:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The number of failed executions for the sql pattern within the query time range.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FailedCount")
    public Long failedCount;

    /**
     * <p>The performance metrics.</p>
     */
    @NameInMap("Performances")
    public java.util.List<DescribePatternPerformanceResponseBodyPerformances> performances;

    /**
     * <p>The number of executions for the sql pattern within the query time range.</p>
     * 
     * <strong>example:</strong>
     * <p>1202</p>
     */
    @NameInMap("QueryCount")
    public Long queryCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F21AF487-B8C9-57E0-8E3A-A92BC3611FB6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The SQL statement for the sql pattern.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT *nFROM HIVE.<code>ADB_EXTERNAL_TPCH_10GB</code>.<code>External_customer</code>nLIMIT ?</p>
     */
    @NameInMap("SQLPattern")
    public String SQLPattern;

    /**
     * <p>The start of the query time range. The time is in UTC and is formatted as <em>yyyy-MM-ddTHH:mmZ</em>.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-08-21T02:15:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The tables queried by the sql pattern.</p>
     * 
     * <strong>example:</strong>
     * <p>tpch_1g.part;tpch_1g.supplier;tpch_1g.lineitem;tpch_1g.partsupp;tpch_1g.orders;tpch_1g.nation</p>
     */
    @NameInMap("Tables")
    public String tables;

    /**
     * <p>The database account that executes the SQL statements.</p>
     * 
     * <strong>example:</strong>
     * <p>test_user</p>
     */
    @NameInMap("User")
    public String user;

    public static DescribePatternPerformanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePatternPerformanceResponseBody self = new DescribePatternPerformanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePatternPerformanceResponseBody setAccessIp(String accessIp) {
        this.accessIp = accessIp;
        return this;
    }
    public String getAccessIp() {
        return this.accessIp;
    }

    public DescribePatternPerformanceResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribePatternPerformanceResponseBody setFailedCount(Long failedCount) {
        this.failedCount = failedCount;
        return this;
    }
    public Long getFailedCount() {
        return this.failedCount;
    }

    public DescribePatternPerformanceResponseBody setPerformances(java.util.List<DescribePatternPerformanceResponseBodyPerformances> performances) {
        this.performances = performances;
        return this;
    }
    public java.util.List<DescribePatternPerformanceResponseBodyPerformances> getPerformances() {
        return this.performances;
    }

    public DescribePatternPerformanceResponseBody setQueryCount(Long queryCount) {
        this.queryCount = queryCount;
        return this;
    }
    public Long getQueryCount() {
        return this.queryCount;
    }

    public DescribePatternPerformanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePatternPerformanceResponseBody setSQLPattern(String SQLPattern) {
        this.SQLPattern = SQLPattern;
        return this;
    }
    public String getSQLPattern() {
        return this.SQLPattern;
    }

    public DescribePatternPerformanceResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribePatternPerformanceResponseBody setTables(String tables) {
        this.tables = tables;
        return this;
    }
    public String getTables() {
        return this.tables;
    }

    public DescribePatternPerformanceResponseBody setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

    public static class DescribePatternPerformanceResponseBodyPerformancesSeries extends TeaModel {
        /**
         * <p>The name of the performance value. The value of this parameter varies based on the value of <code>Key</code>:</p>
         * <ul>
         * <li><p>If <code>Key</code> is <code>AnalyticDB_PatternQueryCount</code>, this parameter returns <code>pattern_query_count</code>, which indicates the query count for the sql pattern.</p>
         * </li>
         * <li><p>If <code>Key</code> is <code>AnalyticDB_PatternQueryTime</code>, this parameter can be one of the following values:</p>
         * <ul>
         * <li><p><code>average_query_time</code>: the average total time of queries that match the sql pattern.</p>
         * </li>
         * <li><p><code>max_query_time</code>: the maximum total time of queries that match the sql pattern.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If <code>Key</code> is <code>AnalyticDB_PatternExecutionTime</code>, this parameter can be one of the following values:</p>
         * <ul>
         * <li><p><code>average_execution_time</code>: the average execution time of queries that match the sql pattern.</p>
         * </li>
         * <li><p><code>max_execution_time</code>: the maximum execution time of queries that match the sql pattern.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If <code>Key</code> is <code>AnalyticDB_PatternPeakMemory</code>, this parameter can be one of the following values:</p>
         * <ul>
         * <li><p><code>average_peak_memory</code>: the average peak memory usage of queries that match the sql pattern.</p>
         * </li>
         * <li><p><code>max_peak_memory</code>: the maximum peak memory usage of queries that match the sql pattern.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If <code>Key</code> is <code>AnalyticDB_PatternScanSize</code>, this parameter can be one of the following values:</p>
         * <ul>
         * <li><p><code>average_scan_size</code>: the average data scan size of queries that match the sql pattern.</p>
         * </li>
         * <li><p><code>max_scan_size</code>: the maximum data scan size of queries that match the sql pattern.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>max_query_time</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of performance values.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static DescribePatternPerformanceResponseBodyPerformancesSeries build(java.util.Map<String, ?> map) throws Exception {
            DescribePatternPerformanceResponseBodyPerformancesSeries self = new DescribePatternPerformanceResponseBodyPerformancesSeries();
            return TeaModel.build(map, self);
        }

        public DescribePatternPerformanceResponseBodyPerformancesSeries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePatternPerformanceResponseBodyPerformancesSeries setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class DescribePatternPerformanceResponseBodyPerformances extends TeaModel {
        /**
         * <p>The performance metric. Valid values:</p>
         * <ul>
         * <li><p><strong>AnalyticDB_PatternQueryCount</strong>: The total number of queries that match the sql pattern.</p>
         * </li>
         * <li><p><strong>AnalyticDB_PatternQueryTime</strong>: The total time for queries that match the sql pattern.</p>
         * </li>
         * <li><p><strong>AnalyticDB_PatternExecutionTime</strong>: The total execution time of queries that match the sql pattern.</p>
         * </li>
         * <li><p><strong>AnalyticDB_PatternPeakMemory</strong>: The peak memory usage of queries that match the sql pattern.</p>
         * </li>
         * <li><p><strong>AnalyticDB_PatternScanSize</strong>: The total data scan size of queries that match the sql pattern.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AnalyticDB_PatternExecutionTime</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The time series data for the performance metric.</p>
         */
        @NameInMap("Series")
        public java.util.List<DescribePatternPerformanceResponseBodyPerformancesSeries> series;

        /**
         * <p>The unit of the performance metric. The returned unit varies based on the value of <code>Key</code>:</p>
         * <ul>
         * <li><p>If <code>Key</code> is <code>AnalyticDB_PatternQueryTime</code> or <code>AnalyticDB_PatternExecutionTime</code>, the unit is <strong>ms</strong>.</p>
         * </li>
         * <li><p>If <code>Key</code> is <code>AnalyticDB_PatternPeakMemory</code>, the unit is <strong>MB</strong>.</p>
         * </li>
         * <li><p>If <code>Key</code> is <code>AnalyticDB_PatternScanSize</code>, the unit is <strong>MB</strong>.</p>
         * </li>
         * <li><p>If <code>Key</code> is <code>AnalyticDB_PatternQueryCount</code>, this parameter is empty.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ms</p>
         */
        @NameInMap("Unit")
        public String unit;

        public static DescribePatternPerformanceResponseBodyPerformances build(java.util.Map<String, ?> map) throws Exception {
            DescribePatternPerformanceResponseBodyPerformances self = new DescribePatternPerformanceResponseBodyPerformances();
            return TeaModel.build(map, self);
        }

        public DescribePatternPerformanceResponseBodyPerformances setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribePatternPerformanceResponseBodyPerformances setSeries(java.util.List<DescribePatternPerformanceResponseBodyPerformancesSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<DescribePatternPerformanceResponseBodyPerformancesSeries> getSeries() {
            return this.series;
        }

        public DescribePatternPerformanceResponseBodyPerformances setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
