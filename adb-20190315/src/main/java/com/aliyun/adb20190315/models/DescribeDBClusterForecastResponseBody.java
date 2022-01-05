// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBClusterForecastResponseBody extends TeaModel {
    @NameInMap("Performances")
    public java.util.List<DescribeDBClusterForecastResponseBodyPerformances> performances;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBClusterForecastResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterForecastResponseBody self = new DescribeDBClusterForecastResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterForecastResponseBody setPerformances(java.util.List<DescribeDBClusterForecastResponseBodyPerformances> performances) {
        this.performances = performances;
        return this;
    }
    public java.util.List<DescribeDBClusterForecastResponseBodyPerformances> getPerformances() {
        return this.performances;
    }

    public DescribeDBClusterForecastResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBClusterForecastResponseBodyPerformancesSeries extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Values")
        public String values;

        public static DescribeDBClusterForecastResponseBodyPerformancesSeries build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterForecastResponseBodyPerformancesSeries self = new DescribeDBClusterForecastResponseBodyPerformancesSeries();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterForecastResponseBodyPerformancesSeries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDBClusterForecastResponseBodyPerformancesSeries setValues(String values) {
            this.values = values;
            return this;
        }
        public String getValues() {
            return this.values;
        }

    }

    public static class DescribeDBClusterForecastResponseBodyPerformances extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Series")
        public java.util.List<DescribeDBClusterForecastResponseBodyPerformancesSeries> series;

        @NameInMap("Unit")
        public String unit;

        public static DescribeDBClusterForecastResponseBodyPerformances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterForecastResponseBodyPerformances self = new DescribeDBClusterForecastResponseBodyPerformances();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterForecastResponseBodyPerformances setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBClusterForecastResponseBodyPerformances setSeries(java.util.List<DescribeDBClusterForecastResponseBodyPerformancesSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<DescribeDBClusterForecastResponseBodyPerformancesSeries> getSeries() {
            return this.series;
        }

        public DescribeDBClusterForecastResponseBodyPerformances setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
