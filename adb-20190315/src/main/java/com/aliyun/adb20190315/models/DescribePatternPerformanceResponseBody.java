// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribePatternPerformanceResponseBody extends TeaModel {
    /**
     * <p>The end time of the query. The time follows the ISO 8601 standard in the *yyyy-MM-ddTHH:mm:ssZ* format. The time is displayed in UTC.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The queried performance metrics.</p>
     */
    @NameInMap("Performances")
    public java.util.List<DescribePatternPerformanceResponseBodyPerformances> performances;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start time of the query. The time follows the ISO 8601 standard in the *yyyy-MM-ddTHH:mm:ssZ* format. The time is displayed in UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribePatternPerformanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePatternPerformanceResponseBody self = new DescribePatternPerformanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePatternPerformanceResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribePatternPerformanceResponseBody setPerformances(java.util.List<DescribePatternPerformanceResponseBodyPerformances> performances) {
        this.performances = performances;
        return this;
    }
    public java.util.List<DescribePatternPerformanceResponseBodyPerformances> getPerformances() {
        return this.performances;
    }

    public DescribePatternPerformanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePatternPerformanceResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribePatternPerformanceResponseBodyPerformancesSeries extends TeaModel {
        /**
         * <p>The name of the performance metric value. Valid values:</p>
         * <br>
         * <p>*   When the `Key` parameter is set to `AnalyticDB_PatternQueryCount`, `pattern_query_count` is returned, which indicates the number of executions of the SQL statements in association with the SQL pattern.</p>
         * <br>
         * <p>*   When the `Key` parameter is set to `AnalyticDB_PatternQueryTime`, the following values are returned:</p>
         * <br>
         * <p>    *   `average_query_time`, which indicates the average total amount of time consumed by the SQL statements in association with the SQL pattern.</p>
         * <p>    *   `max_query_time`, which indicates the maximum total amount of time consumed by the SQL statements in association with the SQL pattern.</p>
         * <br>
         * <p>*   When the `Key` parameter is set to `AnalyticDB_PatternExecutionTime`, the following values are returned:</p>
         * <br>
         * <p>    *   `average_execution_time`, which indicates the average execution duration of the SQL statements in association with the SQL pattern.</p>
         * <p>    *   `max_execution_time`, which indicates the maximum execution duration of the SQL statements in association with the SQL pattern.</p>
         * <br>
         * <p>*   When the `Key` parameter is set to `AnalyticDB_PatternPeakMemory`, the following values are returned:</p>
         * <br>
         * <p>    *   `average_peak_memory`, which indicates the average peak memory usage of the SQL statements in association with the SQL pattern.</p>
         * <p>    *   `max_peak_memory`, which indicates the maximum peak memory usage of the SQL statements in association with the SQL pattern.</p>
         * <br>
         * <p>*   When the `Key` parameter is set `AnalyticDB_PatternScanSize`, the following values are returned:</p>
         * <br>
         * <p>    *   `average_scan_size`, which indicates the average amount of data scanned by the SQL statements in association with the SQL pattern.</p>
         * <p>    *   `max_scan_size`, which indicates the maximum amount of data scanned by the SQL statements in association with the SQL pattern.</p>
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
         * <br>
         * <p>*   **AnalyticDB_PatternQueryCount**: the total number of queries executed in association with the SQL pattern.</p>
         * <p>*   **AnalyticDB_PatternQueryTime**: the total amount of time consumed by the queries executed in association with the SQL pattern.</p>
         * <p>*   **AnalyticDB_PatternExecutionTime**: the total execution duration of the queries executed in association with the SQL pattern.</p>
         * <p>*   **AnalyticDB_PatternPeakMemory**: the peak memory usage of the queries executed in association with the SQL pattern.</p>
         * <p>*   **AnalyticDB_PatternScanSize**: the amount of data scanned in the queries executed in association with the SQL pattern.</p>
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
         * <br>
         * <p>*   When the performance metric is related to the query duration (the `Key` value is `AnalyticDB_PatternQueryTime` or `AnalyticDB_PatternExecutionTime`), **ms** is returned.</p>
         * <p>*   When the performance metric is related to the memory usage (the `Key` value is `AnalyticDB_PatternPeakMemory`), **MB** is returned.</p>
         * <p>*   When the performance metric is related to the amount of data scanned (the `Key` value is `AnalyticDB_PatternScanSize`), **MB** is returned.</p>
         * <p>*   When the performance metric is related to the number of queries (the `Key` value is `AnalyticDB_PatternQueryCount`), this parameter is empty.</p>
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
