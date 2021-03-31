// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetSuccessInstanceTrendResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceStatusTrend")
    public GetSuccessInstanceTrendResponseBodyInstanceStatusTrend instanceStatusTrend;

    public static GetSuccessInstanceTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSuccessInstanceTrendResponseBody self = new GetSuccessInstanceTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSuccessInstanceTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSuccessInstanceTrendResponseBody setInstanceStatusTrend(GetSuccessInstanceTrendResponseBodyInstanceStatusTrend instanceStatusTrend) {
        this.instanceStatusTrend = instanceStatusTrend;
        return this;
    }
    public GetSuccessInstanceTrendResponseBodyInstanceStatusTrend getInstanceStatusTrend() {
        return this.instanceStatusTrend;
    }

    public static class GetSuccessInstanceTrendResponseBodyInstanceStatusTrendAvgTrend extends TeaModel {
        @NameInMap("TimePoint")
        public String timePoint;

        @NameInMap("Count")
        public Integer count;

        public static GetSuccessInstanceTrendResponseBodyInstanceStatusTrendAvgTrend build(java.util.Map<String, ?> map) throws Exception {
            GetSuccessInstanceTrendResponseBodyInstanceStatusTrendAvgTrend self = new GetSuccessInstanceTrendResponseBodyInstanceStatusTrendAvgTrend();
            return TeaModel.build(map, self);
        }

        public GetSuccessInstanceTrendResponseBodyInstanceStatusTrendAvgTrend setTimePoint(String timePoint) {
            this.timePoint = timePoint;
            return this;
        }
        public String getTimePoint() {
            return this.timePoint;
        }

        public GetSuccessInstanceTrendResponseBodyInstanceStatusTrendAvgTrend setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class GetSuccessInstanceTrendResponseBodyInstanceStatusTrendYesterdayTrend extends TeaModel {
        @NameInMap("TimePoint")
        public String timePoint;

        @NameInMap("Count")
        public Integer count;

        public static GetSuccessInstanceTrendResponseBodyInstanceStatusTrendYesterdayTrend build(java.util.Map<String, ?> map) throws Exception {
            GetSuccessInstanceTrendResponseBodyInstanceStatusTrendYesterdayTrend self = new GetSuccessInstanceTrendResponseBodyInstanceStatusTrendYesterdayTrend();
            return TeaModel.build(map, self);
        }

        public GetSuccessInstanceTrendResponseBodyInstanceStatusTrendYesterdayTrend setTimePoint(String timePoint) {
            this.timePoint = timePoint;
            return this;
        }
        public String getTimePoint() {
            return this.timePoint;
        }

        public GetSuccessInstanceTrendResponseBodyInstanceStatusTrendYesterdayTrend setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class GetSuccessInstanceTrendResponseBodyInstanceStatusTrendTodayTrend extends TeaModel {
        @NameInMap("TimePoint")
        public String timePoint;

        @NameInMap("Count")
        public Integer count;

        public static GetSuccessInstanceTrendResponseBodyInstanceStatusTrendTodayTrend build(java.util.Map<String, ?> map) throws Exception {
            GetSuccessInstanceTrendResponseBodyInstanceStatusTrendTodayTrend self = new GetSuccessInstanceTrendResponseBodyInstanceStatusTrendTodayTrend();
            return TeaModel.build(map, self);
        }

        public GetSuccessInstanceTrendResponseBodyInstanceStatusTrendTodayTrend setTimePoint(String timePoint) {
            this.timePoint = timePoint;
            return this;
        }
        public String getTimePoint() {
            return this.timePoint;
        }

        public GetSuccessInstanceTrendResponseBodyInstanceStatusTrendTodayTrend setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class GetSuccessInstanceTrendResponseBodyInstanceStatusTrend extends TeaModel {
        @NameInMap("AvgTrend")
        public java.util.List<GetSuccessInstanceTrendResponseBodyInstanceStatusTrendAvgTrend> avgTrend;

        @NameInMap("YesterdayTrend")
        public java.util.List<GetSuccessInstanceTrendResponseBodyInstanceStatusTrendYesterdayTrend> yesterdayTrend;

        @NameInMap("TodayTrend")
        public java.util.List<GetSuccessInstanceTrendResponseBodyInstanceStatusTrendTodayTrend> todayTrend;

        public static GetSuccessInstanceTrendResponseBodyInstanceStatusTrend build(java.util.Map<String, ?> map) throws Exception {
            GetSuccessInstanceTrendResponseBodyInstanceStatusTrend self = new GetSuccessInstanceTrendResponseBodyInstanceStatusTrend();
            return TeaModel.build(map, self);
        }

        public GetSuccessInstanceTrendResponseBodyInstanceStatusTrend setAvgTrend(java.util.List<GetSuccessInstanceTrendResponseBodyInstanceStatusTrendAvgTrend> avgTrend) {
            this.avgTrend = avgTrend;
            return this;
        }
        public java.util.List<GetSuccessInstanceTrendResponseBodyInstanceStatusTrendAvgTrend> getAvgTrend() {
            return this.avgTrend;
        }

        public GetSuccessInstanceTrendResponseBodyInstanceStatusTrend setYesterdayTrend(java.util.List<GetSuccessInstanceTrendResponseBodyInstanceStatusTrendYesterdayTrend> yesterdayTrend) {
            this.yesterdayTrend = yesterdayTrend;
            return this;
        }
        public java.util.List<GetSuccessInstanceTrendResponseBodyInstanceStatusTrendYesterdayTrend> getYesterdayTrend() {
            return this.yesterdayTrend;
        }

        public GetSuccessInstanceTrendResponseBodyInstanceStatusTrend setTodayTrend(java.util.List<GetSuccessInstanceTrendResponseBodyInstanceStatusTrendTodayTrend> todayTrend) {
            this.todayTrend = todayTrend;
            return this;
        }
        public java.util.List<GetSuccessInstanceTrendResponseBodyInstanceStatusTrendTodayTrend> getTodayTrend() {
            return this.todayTrend;
        }

    }

}
