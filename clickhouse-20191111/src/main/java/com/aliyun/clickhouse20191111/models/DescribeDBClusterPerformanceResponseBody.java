// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBClusterPerformanceResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-bp125e3uu94wo****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end of the time range to query. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time is displayed in Coordinated Universal Time (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2021-11-27T16:38Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The values of the queried performance metrics of the cluster.</p>
     */
    @NameInMap("Performances")
    public java.util.List<DescribeDBClusterPerformanceResponseBodyPerformances> performances;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE242962-6DA3-5FC8-9691-37B62A3210F7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range to query. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-11-27T16:37Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDBClusterPerformanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterPerformanceResponseBody self = new DescribeDBClusterPerformanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterPerformanceResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBClusterPerformanceResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDBClusterPerformanceResponseBody setPerformances(java.util.List<DescribeDBClusterPerformanceResponseBodyPerformances> performances) {
        this.performances = performances;
        return this;
    }
    public java.util.List<DescribeDBClusterPerformanceResponseBodyPerformances> getPerformances() {
        return this.performances;
    }

    public DescribeDBClusterPerformanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterPerformanceResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDBClusterPerformanceResponseBodyPerformancesSeriesValues extends TeaModel {
        /**
         * <p>The values of a metric.</p>
         */
        @NameInMap("Point")
        public java.util.List<String> point;

        public static DescribeDBClusterPerformanceResponseBodyPerformancesSeriesValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterPerformanceResponseBodyPerformancesSeriesValues self = new DescribeDBClusterPerformanceResponseBodyPerformancesSeriesValues();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterPerformanceResponseBodyPerformancesSeriesValues setPoint(java.util.List<String> point) {
            this.point = point;
            return this;
        }
        public java.util.List<String> getPoint() {
            return this.point;
        }

    }

    public static class DescribeDBClusterPerformanceResponseBodyPerformancesSeries extends TeaModel {
        /**
         * <p>The name of the list of performance metric values.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp125e3uu94wo1s0k16****</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The values of the performance parameter. Each value of the performance parameter is collected at a point in time.</p>
         */
        @NameInMap("Values")
        public java.util.List<DescribeDBClusterPerformanceResponseBodyPerformancesSeriesValues> values;

        public static DescribeDBClusterPerformanceResponseBodyPerformancesSeries build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterPerformanceResponseBodyPerformancesSeries self = new DescribeDBClusterPerformanceResponseBodyPerformancesSeries();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterPerformanceResponseBodyPerformancesSeries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDBClusterPerformanceResponseBodyPerformancesSeries setValues(java.util.List<DescribeDBClusterPerformanceResponseBodyPerformancesSeriesValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<DescribeDBClusterPerformanceResponseBodyPerformancesSeriesValues> getValues() {
            return this.values;
        }

    }

    public static class DescribeDBClusterPerformanceResponseBodyPerformances extends TeaModel {
        /**
         * <p>The name of the performance metric.</p>
         * 
         * <strong>example:</strong>
         * <p>MEM_USAGE</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The name of the performance metric value.</p>
         * 
         * <strong>example:</strong>
         * <p>mem_usage</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The queried performance pamaters.</p>
         */
        @NameInMap("Series")
        public java.util.List<DescribeDBClusterPerformanceResponseBodyPerformancesSeries> series;

        /**
         * <p>The unit of the performance metric.</p>
         * 
         * <strong>example:</strong>
         * <p>%</p>
         */
        @NameInMap("Unit")
        public String unit;

        public static DescribeDBClusterPerformanceResponseBodyPerformances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterPerformanceResponseBodyPerformances self = new DescribeDBClusterPerformanceResponseBodyPerformances();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterPerformanceResponseBodyPerformances setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBClusterPerformanceResponseBodyPerformances setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDBClusterPerformanceResponseBodyPerformances setSeries(java.util.List<DescribeDBClusterPerformanceResponseBodyPerformancesSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<DescribeDBClusterPerformanceResponseBodyPerformancesSeries> getSeries() {
            return this.series;
        }

        public DescribeDBClusterPerformanceResponseBodyPerformances setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
