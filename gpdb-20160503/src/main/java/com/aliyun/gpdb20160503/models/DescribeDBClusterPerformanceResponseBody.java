// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBClusterPerformanceResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("PerformanceKeys")
    public java.util.List<DescribeDBClusterPerformanceResponseBodyPerformanceKeys> performanceKeys;

    public static DescribeDBClusterPerformanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterPerformanceResponseBody self = new DescribeDBClusterPerformanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterPerformanceResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDBClusterPerformanceResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDBClusterPerformanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterPerformanceResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBClusterPerformanceResponseBody setPerformanceKeys(java.util.List<DescribeDBClusterPerformanceResponseBodyPerformanceKeys> performanceKeys) {
        this.performanceKeys = performanceKeys;
        return this;
    }
    public java.util.List<DescribeDBClusterPerformanceResponseBodyPerformanceKeys> getPerformanceKeys() {
        return this.performanceKeys;
    }

    public static class DescribeDBClusterPerformanceResponseBodyPerformanceKeysSeriesValues extends TeaModel {
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
        @NameInMap("Role")
        public String role;

        @NameInMap("Name")
        public String name;

        @NameInMap("Values")
        public java.util.List<DescribeDBClusterPerformanceResponseBodyPerformanceKeysSeriesValues> values;

        public static DescribeDBClusterPerformanceResponseBodyPerformanceKeysSeries build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterPerformanceResponseBodyPerformanceKeysSeries self = new DescribeDBClusterPerformanceResponseBodyPerformanceKeysSeries();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterPerformanceResponseBodyPerformanceKeysSeries setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeDBClusterPerformanceResponseBodyPerformanceKeysSeries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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
        @NameInMap("Name")
        public String name;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("Series")
        public java.util.List<DescribeDBClusterPerformanceResponseBodyPerformanceKeysSeries> series;

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

        public DescribeDBClusterPerformanceResponseBodyPerformanceKeys setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribeDBClusterPerformanceResponseBodyPerformanceKeys setSeries(java.util.List<DescribeDBClusterPerformanceResponseBodyPerformanceKeysSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<DescribeDBClusterPerformanceResponseBodyPerformanceKeysSeries> getSeries() {
            return this.series;
        }

    }

}
