// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeDBClusterPerformanceResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Performances")
    public java.util.List<DescribeDBClusterPerformanceResponseBodyPerformances> performances;

    @NameInMap("RequestId")
    public String requestId;

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

    public static class DescribeDBClusterPerformanceResponseBodyPerformancesSeries extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Tags")
        public String tags;

        @NameInMap("Values")
        public java.util.List<String> values;

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

        public DescribeDBClusterPerformanceResponseBodyPerformancesSeries setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public DescribeDBClusterPerformanceResponseBodyPerformancesSeries setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class DescribeDBClusterPerformanceResponseBodyPerformances extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Series")
        public java.util.List<DescribeDBClusterPerformanceResponseBodyPerformancesSeries> series;

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
