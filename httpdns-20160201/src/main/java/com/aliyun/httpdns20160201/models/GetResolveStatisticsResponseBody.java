// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class GetResolveStatisticsResponseBody extends TeaModel {
    @NameInMap("DataPoints")
    public GetResolveStatisticsResponseBodyDataPoints dataPoints;

    @NameInMap("RequestId")
    public String requestId;

    public static GetResolveStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResolveStatisticsResponseBody self = new GetResolveStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResolveStatisticsResponseBody setDataPoints(GetResolveStatisticsResponseBodyDataPoints dataPoints) {
        this.dataPoints = dataPoints;
        return this;
    }
    public GetResolveStatisticsResponseBodyDataPoints getDataPoints() {
        return this.dataPoints;
    }

    public GetResolveStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetResolveStatisticsResponseBodyDataPointsDataPoint extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("Time")
        public Integer time;

        public static GetResolveStatisticsResponseBodyDataPointsDataPoint build(java.util.Map<String, ?> map) throws Exception {
            GetResolveStatisticsResponseBodyDataPointsDataPoint self = new GetResolveStatisticsResponseBodyDataPointsDataPoint();
            return TeaModel.build(map, self);
        }

        public GetResolveStatisticsResponseBodyDataPointsDataPoint setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetResolveStatisticsResponseBodyDataPointsDataPoint setTime(Integer time) {
            this.time = time;
            return this;
        }
        public Integer getTime() {
            return this.time;
        }

    }

    public static class GetResolveStatisticsResponseBodyDataPoints extends TeaModel {
        @NameInMap("DataPoint")
        public java.util.List<GetResolveStatisticsResponseBodyDataPointsDataPoint> dataPoint;

        public static GetResolveStatisticsResponseBodyDataPoints build(java.util.Map<String, ?> map) throws Exception {
            GetResolveStatisticsResponseBodyDataPoints self = new GetResolveStatisticsResponseBodyDataPoints();
            return TeaModel.build(map, self);
        }

        public GetResolveStatisticsResponseBodyDataPoints setDataPoint(java.util.List<GetResolveStatisticsResponseBodyDataPointsDataPoint> dataPoint) {
            this.dataPoint = dataPoint;
            return this;
        }
        public java.util.List<GetResolveStatisticsResponseBodyDataPointsDataPoint> getDataPoint() {
            return this.dataPoint;
        }

    }

}
