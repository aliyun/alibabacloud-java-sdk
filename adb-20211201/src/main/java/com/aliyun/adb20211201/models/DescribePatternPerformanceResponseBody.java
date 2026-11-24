// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribePatternPerformanceResponseBody extends TeaModel {
    /**
     * <p>The IP address of the client that submits the SQL statements related to the pattern.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.14.*</p>
     */
    @NameInMap("AccessIp")
    public String accessIp;

    /**
     * <p>The end time of the query. The time is in UTC and follows the <i>yyyy-MM-ddTHH:mmZ</i> format.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-08-22T01:06:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The number of failures of the pattern within the query time range.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FailedCount")
    public Long failedCount;

    /**
     * <p>The performance details.</p>
     */
    @NameInMap("Performances")
    public java.util.List<DescribePatternPerformanceResponseBodyPerformances> performances;

    /**
     * <p>The number of executions of the pattern within the query time range.</p>
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
     * <p>The specific statement of the SQL pattern.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT *nFROM HIVE.<code>ADB_EXTERNAL_TPCH_10GB</code>.<code>External_customer</code>nLIMIT ?</p>
     */
    @NameInMap("SQLPattern")
    public String SQLPattern;

    /**
     * <p>The start time of the query. The time is in UTC and follows the <i>yyyy-MM-ddTHH:mmZ</i> format.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-08-21T02:15:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The information about the tables involved in the SQL pattern query.</p>
     * 
     * <strong>example:</strong>
     * <p>tpch_1g.part;tpch_1g.supplier;tpch_1g.lineitem;tpch_1g.partsupp;tpch_1g.orders;tpch_1g.nation</p>
     */
    @NameInMap("Tables")
    public String tables;

    /**
     * <p>The database account that executes the SQL statement.</p>
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
         * <p>The name of the performance value. Valid values:</p>
         * <ul>
         * <li>When the <code>Key</code> value is <code>AnalyticDB_PatternQueryCount</code>, this parameter returns <code>pattern_query_count</code>, which indicates the executions of SQL statements related to the current pattern.</li>
         * <li>When the <code>Key</code> value is <code>AnalyticDB_PatternQueryTime</code>, this parameter returns:<ul>
         * <li><code>average_query_time</code>: the average total time consumed by SQL statements related to the current pattern.</li>
         * <li><code>max_query_time</code>: the maximum total time consumed by SQL statements related to the current pattern.</li>
         * </ul>
         * </li>
         * <li>When the <code>Key</code> value is <code>AnalyticDB_PatternExecutionTime</code>, this parameter returns:<ul>
         * <li><code>average_execution_time</code>: the average execution duration of SQL statements related to the current pattern.</li>
         * <li><code>max_execution_time</code>: the maximum execution duration of SQL statements related to the current pattern.</li>
         * </ul>
         * </li>
         * <li>When the <code>Key</code> value is <code>AnalyticDB_PatternPeakMemory</code>, this parameter returns:<ul>
         * <li><code>average_peak_memory</code>: the average peak memory consumed by SQL statements related to the current pattern.</li>
         * <li><code>max_peak_memory</code>: the maximum peak memory consumed by SQL statements related to the current pattern.</li>
         * </ul>
         * </li>
         * <li>When the <code>Key</code> value is <code>AnalyticDB_PatternScanSize</code>, this parameter returns:<ul>
         * <li><code>average_scan_size</code>: the average data volume read by SQL statements related to the current pattern.</li>
         * <li><code>max_scan_size</code>: the maximum data volume read by SQL statements related to the current pattern.</li>
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
         * <p>The queried performance metrics. Valid values:</p>
         * <ul>
         * <li><strong>AnalyticDB_PatternQueryCount</strong>: the total number of queries related to the pattern.</li>
         * <li><strong>AnalyticDB_PatternQueryTime</strong>: the total time consumed by queries related to the pattern.</li>
         * <li><strong>AnalyticDB_PatternExecutionTime</strong>: the execution duration of queries related to the pattern.</li>
         * <li><strong>AnalyticDB_PatternPeakMemory</strong>: the peak memory consumed by queries related to the pattern.</li>
         * <li><strong>AnalyticDB_PatternScanSize</strong>: the data volume read by queries related to the pattern.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AnalyticDB_PatternExecutionTime</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The details of each performance value under the performance metrics.</p>
         */
        @NameInMap("Series")
        public java.util.List<DescribePatternPerformanceResponseBodyPerformancesSeries> series;

        /**
         * <p>The units corresponding to the performance metrics. Valid values:</p>
         * <ul>
         * <li><strong>ms</strong>: returned when the performance metric is related to query time, which means the <code>Key</code> value is <code>AnalyticDB_PatternQueryTime</code> or <code>AnalyticDB_PatternExecutionTime</code>.</li>
         * <li><strong>MB</strong>: returned when the performance metric is related to peak memory, which means the <code>Key</code> value is <code>AnalyticDB_PatternPeakMemory</code>.</li>
         * <li><strong>MB</strong>: returned when the performance metric is the data volume read, which means the <code>Key</code> value is <code>AnalyticDB_PatternScanSize</code>.</li>
         * <li>Empty: returned when the performance metric is the number of queries, which means the <code>Key</code> value is <code>AnalyticDB_PatternQueryCount</code>.</li>
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
