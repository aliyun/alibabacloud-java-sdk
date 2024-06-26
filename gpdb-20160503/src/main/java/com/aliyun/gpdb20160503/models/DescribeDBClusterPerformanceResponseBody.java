// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBClusterPerformanceResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp12ga6v69h86****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end time of the query. The time follows the ISO 8601 standard in the <code>YYYY-MM-DDTHH:mmZ</code> format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-11-03T15:10Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The name of the performance metric. For more information, see <a href="https://help.aliyun.com/document_detail/86943.html">Performance parameters</a>.</p>
     */
    @NameInMap("PerformanceKeys")
    public java.util.List<DescribeDBClusterPerformanceResponseBodyPerformanceKeys> performanceKeys;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8E8990F0-C81E-4C94-8F51-5F**********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start time of the query. The time follows the ISO 8601 standard in the <code>YYYY-MM-DDTHH:mmZ</code> format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-11-03T15:00Z</p>
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

    public DescribeDBClusterPerformanceResponseBody setPerformanceKeys(java.util.List<DescribeDBClusterPerformanceResponseBodyPerformanceKeys> performanceKeys) {
        this.performanceKeys = performanceKeys;
        return this;
    }
    public java.util.List<DescribeDBClusterPerformanceResponseBodyPerformanceKeys> getPerformanceKeys() {
        return this.performanceKeys;
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

    public static class DescribeDBClusterPerformanceResponseBodyPerformanceKeysSeriesValues extends TeaModel {
        /**
         * <p>The value of the performance metric and the time when the metric value was collected.</p>
         */
        @NameInMap("Point")
        public java.util.List<String> point;

        public static DescribeDBClusterPerformanceResponseBodyPerformanceKeysSeriesValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterPerformanceResponseBodyPerformanceKeysSeriesValues self = new DescribeDBClusterPerformanceResponseBodyPerformanceKeysSeriesValues();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterPerformanceResponseBodyPerformanceKeysSeriesValues setPoint(java.util.List<String> point) {
            this.point = point;
            return this;
        }
        public java.util.List<String> getPoint() {
            return this.point;
        }

    }

    public static class DescribeDBClusterPerformanceResponseBodyPerformanceKeysSeries extends TeaModel {
        /**
         * <p>The name of the compute node or compute group.</p>
         * 
         * <strong>example:</strong>
         * <p>standby-********-cpu</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The role of the node. Valid values:</p>
         * <ul>
         * <li><strong>master</strong>: primary coordinator node</li>
         * <li><strong>standby</strong>: standby coordinator node</li>
         * <li><strong>segment</strong>: compute node</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standby</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The value of the performance metric collected at a point in time.</p>
         */
        @NameInMap("Values")
        public java.util.List<DescribeDBClusterPerformanceResponseBodyPerformanceKeysSeriesValues> values;

        public static DescribeDBClusterPerformanceResponseBodyPerformanceKeysSeries build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterPerformanceResponseBodyPerformanceKeysSeries self = new DescribeDBClusterPerformanceResponseBodyPerformanceKeysSeries();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterPerformanceResponseBodyPerformanceKeysSeries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDBClusterPerformanceResponseBodyPerformanceKeysSeries setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeDBClusterPerformanceResponseBodyPerformanceKeysSeries setValues(java.util.List<DescribeDBClusterPerformanceResponseBodyPerformanceKeysSeriesValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<DescribeDBClusterPerformanceResponseBodyPerformanceKeysSeriesValues> getValues() {
            return this.values;
        }

    }

    public static class DescribeDBClusterPerformanceResponseBodyPerformanceKeys extends TeaModel {
        /**
         * <p>The name of the performance metric. For more information, see <a href="https://help.aliyun.com/document_detail/86943.html">Performance parameters</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>adbpg_group_cpu_used_percent</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Details of the performance metric of a node.</p>
         */
        @NameInMap("Series")
        public java.util.List<DescribeDBClusterPerformanceResponseBodyPerformanceKeysSeries> series;

        /**
         * <p>The unit of the performance metric.</p>
         * 
         * <strong>example:</strong>
         * <p>%</p>
         */
        @NameInMap("Unit")
        public String unit;

        public static DescribeDBClusterPerformanceResponseBodyPerformanceKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterPerformanceResponseBodyPerformanceKeys self = new DescribeDBClusterPerformanceResponseBodyPerformanceKeys();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterPerformanceResponseBodyPerformanceKeys setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDBClusterPerformanceResponseBodyPerformanceKeys setSeries(java.util.List<DescribeDBClusterPerformanceResponseBodyPerformanceKeysSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<DescribeDBClusterPerformanceResponseBodyPerformanceKeysSeries> getSeries() {
            return this.series;
        }

        public DescribeDBClusterPerformanceResponseBodyPerformanceKeys setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
