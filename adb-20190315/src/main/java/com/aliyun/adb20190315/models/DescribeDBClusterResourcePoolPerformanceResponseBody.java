// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBClusterResourcePoolPerformanceResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Performances")
    public java.util.List<DescribeDBClusterResourcePoolPerformanceResponseBodyPerformances> performances;

    public static DescribeDBClusterResourcePoolPerformanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterResourcePoolPerformanceResponseBody self = new DescribeDBClusterResourcePoolPerformanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterResourcePoolPerformanceResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
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

    public DescribeDBClusterResourcePoolPerformanceResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBClusterResourcePoolPerformanceResponseBody setPerformances(java.util.List<DescribeDBClusterResourcePoolPerformanceResponseBodyPerformances> performances) {
        this.performances = performances;
        return this;
    }
    public java.util.List<DescribeDBClusterResourcePoolPerformanceResponseBodyPerformances> getPerformances() {
        return this.performances;
    }

    public static class DescribeDBClusterResourcePoolPerformanceResponseBodyPerformancesResourcePoolPerformancesResourcePoolSeries extends TeaModel {
        @NameInMap("Values")
        public java.util.List<String> values;

        @NameInMap("Name")
        public String name;

        public static DescribeDBClusterResourcePoolPerformanceResponseBodyPerformancesResourcePoolPerformancesResourcePoolSeries build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterResourcePoolPerformanceResponseBodyPerformancesResourcePoolPerformancesResourcePoolSeries self = new DescribeDBClusterResourcePoolPerformanceResponseBodyPerformancesResourcePoolPerformancesResourcePoolSeries();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterResourcePoolPerformanceResponseBodyPerformancesResourcePoolPerformancesResourcePoolSeries setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

        public DescribeDBClusterResourcePoolPerformanceResponseBodyPerformancesResourcePoolPerformancesResourcePoolSeries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeDBClusterResourcePoolPerformanceResponseBodyPerformancesResourcePoolPerformances extends TeaModel {
        @NameInMap("ResourcePoolName")
        public String resourcePoolName;

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
        @NameInMap("Key")
        public String key;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("ResourcePoolPerformances")
        public java.util.List<DescribeDBClusterResourcePoolPerformanceResponseBodyPerformancesResourcePoolPerformances> resourcePoolPerformances;

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

        public DescribeDBClusterResourcePoolPerformanceResponseBodyPerformances setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribeDBClusterResourcePoolPerformanceResponseBodyPerformances setResourcePoolPerformances(java.util.List<DescribeDBClusterResourcePoolPerformanceResponseBodyPerformancesResourcePoolPerformances> resourcePoolPerformances) {
            this.resourcePoolPerformances = resourcePoolPerformances;
            return this;
        }
        public java.util.List<DescribeDBClusterResourcePoolPerformanceResponseBodyPerformancesResourcePoolPerformances> getResourcePoolPerformances() {
            return this.resourcePoolPerformances;
        }

    }

}
