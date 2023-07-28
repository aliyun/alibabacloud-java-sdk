// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBClusterResourcePoolPerformanceResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end of the time range for monitoring the resource group. The time follows the ISO 8601 standard in the *yyyy-MM-ddTHH:mm:ssZ* format. The time is displayed in UTC.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The queried monitoring information about the metrics.</p>
     */
    @NameInMap("Performances")
    public java.util.List<DescribeDBClusterResourcePoolPerformanceResponseBodyPerformances> performances;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range for monitoring the resource group. The time follows the ISO 8601 standard in the *yyyy-MM-ddTHH:mm:ssZ* format. The time is displayed in UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDBClusterResourcePoolPerformanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterResourcePoolPerformanceResponseBody self = new DescribeDBClusterResourcePoolPerformanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterResourcePoolPerformanceResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBClusterResourcePoolPerformanceResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDBClusterResourcePoolPerformanceResponseBody setPerformances(java.util.List<DescribeDBClusterResourcePoolPerformanceResponseBodyPerformances> performances) {
        this.performances = performances;
        return this;
    }
    public java.util.List<DescribeDBClusterResourcePoolPerformanceResponseBodyPerformances> getPerformances() {
        return this.performances;
    }

    public DescribeDBClusterResourcePoolPerformanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterResourcePoolPerformanceResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDBClusterResourcePoolPerformanceResponseBodyPerformancesResourcePoolPerformancesResourcePoolSeries extends TeaModel {
        /**
         * <p>The name of the metric.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the metric.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static DescribeDBClusterResourcePoolPerformanceResponseBodyPerformancesResourcePoolPerformancesResourcePoolSeries build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterResourcePoolPerformanceResponseBodyPerformancesResourcePoolPerformancesResourcePoolSeries self = new DescribeDBClusterResourcePoolPerformanceResponseBodyPerformancesResourcePoolPerformancesResourcePoolSeries();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterResourcePoolPerformanceResponseBodyPerformancesResourcePoolPerformancesResourcePoolSeries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDBClusterResourcePoolPerformanceResponseBodyPerformancesResourcePoolPerformancesResourcePoolSeries setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class DescribeDBClusterResourcePoolPerformanceResponseBodyPerformancesResourcePoolPerformances extends TeaModel {
        /**
         * <p>The name of the resource group.</p>
         */
        @NameInMap("ResourcePoolName")
        public String resourcePoolName;

        /**
         * <p>The sequential monitoring information about the resource groups.</p>
         */
        @NameInMap("ResourcePoolSeries")
        public java.util.List<DescribeDBClusterResourcePoolPerformanceResponseBodyPerformancesResourcePoolPerformancesResourcePoolSeries> resourcePoolSeries;

        public static DescribeDBClusterResourcePoolPerformanceResponseBodyPerformancesResourcePoolPerformances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterResourcePoolPerformanceResponseBodyPerformancesResourcePoolPerformances self = new DescribeDBClusterResourcePoolPerformanceResponseBodyPerformancesResourcePoolPerformances();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterResourcePoolPerformanceResponseBodyPerformancesResourcePoolPerformances setResourcePoolName(String resourcePoolName) {
            this.resourcePoolName = resourcePoolName;
            return this;
        }
        public String getResourcePoolName() {
            return this.resourcePoolName;
        }

        public DescribeDBClusterResourcePoolPerformanceResponseBodyPerformancesResourcePoolPerformances setResourcePoolSeries(java.util.List<DescribeDBClusterResourcePoolPerformanceResponseBodyPerformancesResourcePoolPerformancesResourcePoolSeries> resourcePoolSeries) {
            this.resourcePoolSeries = resourcePoolSeries;
            return this;
        }
        public java.util.List<DescribeDBClusterResourcePoolPerformanceResponseBodyPerformancesResourcePoolPerformancesResourcePoolSeries> getResourcePoolSeries() {
            return this.resourcePoolSeries;
        }

    }

    public static class DescribeDBClusterResourcePoolPerformanceResponseBodyPerformances extends TeaModel {
        /**
         * <p>The metric of the resource group.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The queried monitoring information about the resource groups.</p>
         */
        @NameInMap("ResourcePoolPerformances")
        public java.util.List<DescribeDBClusterResourcePoolPerformanceResponseBodyPerformancesResourcePoolPerformances> resourcePoolPerformances;

        /**
         * <p>The unit of the metric value.</p>
         */
        @NameInMap("Unit")
        public String unit;

        public static DescribeDBClusterResourcePoolPerformanceResponseBodyPerformances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterResourcePoolPerformanceResponseBodyPerformances self = new DescribeDBClusterResourcePoolPerformanceResponseBodyPerformances();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterResourcePoolPerformanceResponseBodyPerformances setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBClusterResourcePoolPerformanceResponseBodyPerformances setResourcePoolPerformances(java.util.List<DescribeDBClusterResourcePoolPerformanceResponseBodyPerformancesResourcePoolPerformances> resourcePoolPerformances) {
            this.resourcePoolPerformances = resourcePoolPerformances;
            return this;
        }
        public java.util.List<DescribeDBClusterResourcePoolPerformanceResponseBodyPerformancesResourcePoolPerformances> getResourcePoolPerformances() {
            return this.resourcePoolPerformances;
        }

        public DescribeDBClusterResourcePoolPerformanceResponseBodyPerformances setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
