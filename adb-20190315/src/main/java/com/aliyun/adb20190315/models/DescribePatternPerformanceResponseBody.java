// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribePatternPerformanceResponseBody extends TeaModel {
    /**
     * <p>The IP address of the SQL client that submits the SQL pattern.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.14.*</p>
     */
    @NameInMap("AccessIp")
    public String accessIp;

    /**
     * <p>The end time of the query. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-11-18T18:05Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The number of failed SQL patterns within the time range.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FailedCount")
    public Long failedCount;

    /**
     * <p>The queried performance metrics.</p>
     */
    @NameInMap("Performances")
    public java.util.List<DescribePatternPerformanceResponseBodyPerformances> performances;

    /**
     * <p>The number of queries executed in association with the SQL pattern within the time range.</p>
     * 
     * <strong>example:</strong>
     * <p>35018</p>
     */
    @NameInMap("QueryCount")
    public Long queryCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>210f47011634026610213529******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The SQL statement that represents the SQL pattern.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT *nFROM HIVE.<code>ADB_EXTERNAL_TPCH_10GB</code>.<code>External_customer</code>nLIMIT ?</p>
     */
    @NameInMap("SQLPattern")
    public String SQLPattern;

    /**
     * <p>The start time of the query. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-11-18T00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The tables that are in association with the SQL pattern.</p>
     * 
     * <strong>example:</strong>
     * <p>tpch_1g.part;tpch_1g.supplier;tpch_1g.lineitem;tpch_1g.partsupp;tpch_1g.orders;tpch_1g.nation</p>
     */
    @NameInMap("Tables")
    public String tables;

    /**
     * <p>The database account that is used to execute the SQL statement.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
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
         * <p>The name of the performance metric value. Valid values:</p>
         * <ul>
         * <li><p>When the <code>Key</code> parameter is set to <code>AnalyticDB_PatternQueryCount</code>, <code>pattern_query_count</code> is returned, which indicates the number of executions of the SQL statements in association with the SQL pattern.</p>
         * </li>
         * <li><p>When the <code>Key</code> parameter is set to <code>AnalyticDB_PatternQueryTime</code>, the following values are returned:</p>
         * <ul>
         * <li><code>average_query_time</code>, which indicates the average total amount of time consumed by the SQL statements in association with the SQL pattern.</li>
         * <li><code>max_query_time</code>, which indicates the maximum total amount of time consumed by the SQL statements in association with the SQL pattern.</li>
         * </ul>
         * </li>
         * <li><p>When the <code>Key</code> parameter is set to <code>AnalyticDB_PatternExecutionTime</code>, the following values are returned:</p>
         * <ul>
         * <li><code>average_execution_time</code>, which indicates the average execution duration of the SQL statements in association with the SQL pattern.</li>
         * <li><code>max_execution_time</code>, which indicates the maximum execution duration of the SQL statements in association with the SQL pattern.</li>
         * </ul>
         * </li>
         * <li><p>When the <code>Key</code> parameter is set to <code>AnalyticDB_PatternPeakMemory</code>, the following values are returned:</p>
         * <ul>
         * <li><code>average_peak_memory</code>, which indicates the average peak memory usage of the SQL statements in association with the SQL pattern.</li>
         * <li><code>max_peak_memory</code>, which indicates the maximum peak memory usage of the SQL statements in association with the SQL pattern.</li>
         * </ul>
         * </li>
         * <li><p>When the <code>Key</code> parameter is set <code>AnalyticDB_PatternScanSize</code>, the following values are returned:</p>
         * <ul>
         * <li><code>average_scan_size</code>, which indicates the average amount of data scanned by the SQL statements in association with the SQL pattern.</li>
         * <li><code>max_scan_size</code>, which indicates the maximum amount of data scanned by the SQL statements in association with the SQL pattern.</li>
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
         * <p>The queried performance metrics.</p>
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
         * <p>The performance metric that was queried. Valid values:</p>
         * <ul>
         * <li><strong>AnalyticDB_PatternQueryCount</strong>: the total number of queries executed in association with the SQL pattern.</li>
         * <li><strong>AnalyticDB_PatternQueryTime</strong>: the total amount of time consumed by the queries executed in association with the SQL pattern.</li>
         * <li><strong>AnalyticDB_PatternExecutionTime</strong>: the total execution duration of the queries executed in association with the SQL pattern.</li>
         * <li><strong>AnalyticDB_PatternPeakMemory</strong>: the peak memory usage of the queries executed in association with the SQL pattern.</li>
         * <li><strong>AnalyticDB_PatternScanSize</strong>: the amount of data scanned in the queries executed in association with the SQL pattern.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AnalyticDB_PatternQueryCount</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The queried performance metrics.</p>
         */
        @NameInMap("Series")
        public java.util.List<DescribePatternPerformanceResponseBodyPerformancesSeries> series;

        /**
         * <p>The unit of the performance metric. Valid values:</p>
         * <ul>
         * <li>When the performance metric is related to the query duration (the <code>Key</code> value is <code>AnalyticDB_PatternQueryTime</code> or <code>AnalyticDB_PatternExecutionTime</code>), <strong>ms</strong> is returned.</li>
         * <li>When the performance metric is related to the memory usage (the <code>Key</code> value is <code>AnalyticDB_PatternPeakMemory</code>), <strong>MB</strong> is returned.</li>
         * <li>When the performance metric is related to the amount of data scanned (the <code>Key</code> value is <code>AnalyticDB_PatternScanSize</code>), <strong>MB</strong> is returned.</li>
         * <li>When the performance metric is related to the number of queries (the <code>Key</code> value is <code>AnalyticDB_PatternQueryCount</code>), this parameter is empty.</li>
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
