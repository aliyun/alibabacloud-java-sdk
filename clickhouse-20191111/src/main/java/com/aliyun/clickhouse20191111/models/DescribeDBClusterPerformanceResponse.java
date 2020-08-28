// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBClusterPerformanceResponse extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("Performances")
    @Validation(required = true)
    public java.util.List<DescribeDBClusterPerformanceResponsePerformances> performances;

    public static DescribeDBClusterPerformanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterPerformanceResponse self = new DescribeDBClusterPerformanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterPerformanceResponse setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBClusterPerformanceResponse setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDBClusterPerformanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterPerformanceResponse setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDBClusterPerformanceResponse setPerformances(java.util.List<DescribeDBClusterPerformanceResponsePerformances> performances) {
        this.performances = performances;
        return this;
    }
    public java.util.List<DescribeDBClusterPerformanceResponsePerformances> getPerformances() {
        return this.performances;
    }

    public static class DescribeDBClusterPerformanceResponsePerformancesSeriesValues extends TeaModel {
        @NameInMap("Point")
        @Validation(required = true)
        public java.util.List<String> point;

        public static DescribeDBClusterPerformanceResponsePerformancesSeriesValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterPerformanceResponsePerformancesSeriesValues self = new DescribeDBClusterPerformanceResponsePerformancesSeriesValues();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterPerformanceResponsePerformancesSeriesValues setPoint(java.util.List<String> point) {
            this.point = point;
            return this;
        }
        public java.util.List<String> getPoint() {
            return this.point;
        }

    }

    public static class DescribeDBClusterPerformanceResponsePerformancesSeries extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Values")
        @Validation(required = true)
        public java.util.List<DescribeDBClusterPerformanceResponsePerformancesSeriesValues> values;

        public static DescribeDBClusterPerformanceResponsePerformancesSeries build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterPerformanceResponsePerformancesSeries self = new DescribeDBClusterPerformanceResponsePerformancesSeries();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterPerformanceResponsePerformancesSeries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDBClusterPerformanceResponsePerformancesSeries setValues(java.util.List<DescribeDBClusterPerformanceResponsePerformancesSeriesValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<DescribeDBClusterPerformanceResponsePerformancesSeriesValues> getValues() {
            return this.values;
        }

    }

    public static class DescribeDBClusterPerformanceResponsePerformances extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Unit")
        @Validation(required = true)
        public String unit;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Series")
        @Validation(required = true)
        public java.util.List<DescribeDBClusterPerformanceResponsePerformancesSeries> series;

        public static DescribeDBClusterPerformanceResponsePerformances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterPerformanceResponsePerformances self = new DescribeDBClusterPerformanceResponsePerformances();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterPerformanceResponsePerformances setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBClusterPerformanceResponsePerformances setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribeDBClusterPerformanceResponsePerformances setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDBClusterPerformanceResponsePerformances setSeries(java.util.List<DescribeDBClusterPerformanceResponsePerformancesSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<DescribeDBClusterPerformanceResponsePerformancesSeries> getSeries() {
            return this.series;
        }

    }

}
