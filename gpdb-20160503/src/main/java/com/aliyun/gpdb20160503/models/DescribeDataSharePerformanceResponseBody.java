// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDataSharePerformanceResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PerformanceKeys")
    public java.util.List<DescribeDataSharePerformanceResponseBodyPerformanceKeys> performanceKeys;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDataSharePerformanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataSharePerformanceResponseBody self = new DescribeDataSharePerformanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataSharePerformanceResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDataSharePerformanceResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDataSharePerformanceResponseBody setPerformanceKeys(java.util.List<DescribeDataSharePerformanceResponseBodyPerformanceKeys> performanceKeys) {
        this.performanceKeys = performanceKeys;
        return this;
    }
    public java.util.List<DescribeDataSharePerformanceResponseBodyPerformanceKeys> getPerformanceKeys() {
        return this.performanceKeys;
    }

    public DescribeDataSharePerformanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataSharePerformanceResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDataSharePerformanceResponseBodyPerformanceKeysSeriesValues extends TeaModel {
        @NameInMap("Point")
        public java.util.List<String> point;

        public static DescribeDataSharePerformanceResponseBodyPerformanceKeysSeriesValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataSharePerformanceResponseBodyPerformanceKeysSeriesValues self = new DescribeDataSharePerformanceResponseBodyPerformanceKeysSeriesValues();
            return TeaModel.build(map, self);
        }

        public DescribeDataSharePerformanceResponseBodyPerformanceKeysSeriesValues setPoint(java.util.List<String> point) {
            this.point = point;
            return this;
        }
        public java.util.List<String> getPoint() {
            return this.point;
        }

    }

    public static class DescribeDataSharePerformanceResponseBodyPerformanceKeysSeries extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Values")
        public java.util.List<DescribeDataSharePerformanceResponseBodyPerformanceKeysSeriesValues> values;

        public static DescribeDataSharePerformanceResponseBodyPerformanceKeysSeries build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataSharePerformanceResponseBodyPerformanceKeysSeries self = new DescribeDataSharePerformanceResponseBodyPerformanceKeysSeries();
            return TeaModel.build(map, self);
        }

        public DescribeDataSharePerformanceResponseBodyPerformanceKeysSeries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDataSharePerformanceResponseBodyPerformanceKeysSeries setValues(java.util.List<DescribeDataSharePerformanceResponseBodyPerformanceKeysSeriesValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<DescribeDataSharePerformanceResponseBodyPerformanceKeysSeriesValues> getValues() {
            return this.values;
        }

    }

    public static class DescribeDataSharePerformanceResponseBodyPerformanceKeys extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Series")
        public java.util.List<DescribeDataSharePerformanceResponseBodyPerformanceKeysSeries> series;

        @NameInMap("Unit")
        public String unit;

        public static DescribeDataSharePerformanceResponseBodyPerformanceKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataSharePerformanceResponseBodyPerformanceKeys self = new DescribeDataSharePerformanceResponseBodyPerformanceKeys();
            return TeaModel.build(map, self);
        }

        public DescribeDataSharePerformanceResponseBodyPerformanceKeys setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDataSharePerformanceResponseBodyPerformanceKeys setSeries(java.util.List<DescribeDataSharePerformanceResponseBodyPerformanceKeysSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<DescribeDataSharePerformanceResponseBodyPerformanceKeysSeries> getSeries() {
            return this.series;
        }

        public DescribeDataSharePerformanceResponseBodyPerformanceKeys setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
