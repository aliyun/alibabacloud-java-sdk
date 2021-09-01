// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetSuccessInstanceTrendResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceStatusTrend")
    @Validation(required = true)
    public GetSuccessInstanceTrendResponseInstanceStatusTrend instanceStatusTrend;

    public static GetSuccessInstanceTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSuccessInstanceTrendResponse self = new GetSuccessInstanceTrendResponse();
        return TeaModel.build(map, self);
    }

    public GetSuccessInstanceTrendResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSuccessInstanceTrendResponse setInstanceStatusTrend(GetSuccessInstanceTrendResponseInstanceStatusTrend instanceStatusTrend) {
        this.instanceStatusTrend = instanceStatusTrend;
        return this;
    }
    public GetSuccessInstanceTrendResponseInstanceStatusTrend getInstanceStatusTrend() {
        return this.instanceStatusTrend;
    }

    public static class GetSuccessInstanceTrendResponseInstanceStatusTrendTodayTrend extends TeaModel {
        @NameInMap("Count")
        @Validation(required = true)
        public Integer count;

        @NameInMap("TimePoint")
        @Validation(required = true)
        public String timePoint;

        public static GetSuccessInstanceTrendResponseInstanceStatusTrendTodayTrend build(java.util.Map<String, ?> map) throws Exception {
            GetSuccessInstanceTrendResponseInstanceStatusTrendTodayTrend self = new GetSuccessInstanceTrendResponseInstanceStatusTrendTodayTrend();
            return TeaModel.build(map, self);
        }

        public GetSuccessInstanceTrendResponseInstanceStatusTrendTodayTrend setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetSuccessInstanceTrendResponseInstanceStatusTrendTodayTrend setTimePoint(String timePoint) {
            this.timePoint = timePoint;
            return this;
        }
        public String getTimePoint() {
            return this.timePoint;
        }

    }

    public static class GetSuccessInstanceTrendResponseInstanceStatusTrendYesterdayTrend extends TeaModel {
        @NameInMap("Count")
        @Validation(required = true)
        public Integer count;

        @NameInMap("TimePoint")
        @Validation(required = true)
        public String timePoint;

        public static GetSuccessInstanceTrendResponseInstanceStatusTrendYesterdayTrend build(java.util.Map<String, ?> map) throws Exception {
            GetSuccessInstanceTrendResponseInstanceStatusTrendYesterdayTrend self = new GetSuccessInstanceTrendResponseInstanceStatusTrendYesterdayTrend();
            return TeaModel.build(map, self);
        }

        public GetSuccessInstanceTrendResponseInstanceStatusTrendYesterdayTrend setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetSuccessInstanceTrendResponseInstanceStatusTrendYesterdayTrend setTimePoint(String timePoint) {
            this.timePoint = timePoint;
            return this;
        }
        public String getTimePoint() {
            return this.timePoint;
        }

    }

    public static class GetSuccessInstanceTrendResponseInstanceStatusTrendAvgTrend extends TeaModel {
        @NameInMap("Count")
        @Validation(required = true)
        public Integer count;

        @NameInMap("TimePoint")
        @Validation(required = true)
        public String timePoint;

        public static GetSuccessInstanceTrendResponseInstanceStatusTrendAvgTrend build(java.util.Map<String, ?> map) throws Exception {
            GetSuccessInstanceTrendResponseInstanceStatusTrendAvgTrend self = new GetSuccessInstanceTrendResponseInstanceStatusTrendAvgTrend();
            return TeaModel.build(map, self);
        }

        public GetSuccessInstanceTrendResponseInstanceStatusTrendAvgTrend setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetSuccessInstanceTrendResponseInstanceStatusTrendAvgTrend setTimePoint(String timePoint) {
            this.timePoint = timePoint;
            return this;
        }
        public String getTimePoint() {
            return this.timePoint;
        }

    }

    public static class GetSuccessInstanceTrendResponseInstanceStatusTrend extends TeaModel {
        @NameInMap("TodayTrend")
        @Validation(required = true)
        public java.util.List<GetSuccessInstanceTrendResponseInstanceStatusTrendTodayTrend> todayTrend;

        @NameInMap("YesterdayTrend")
        @Validation(required = true)
        public java.util.List<GetSuccessInstanceTrendResponseInstanceStatusTrendYesterdayTrend> yesterdayTrend;

        @NameInMap("AvgTrend")
        @Validation(required = true)
        public java.util.List<GetSuccessInstanceTrendResponseInstanceStatusTrendAvgTrend> avgTrend;

        public static GetSuccessInstanceTrendResponseInstanceStatusTrend build(java.util.Map<String, ?> map) throws Exception {
            GetSuccessInstanceTrendResponseInstanceStatusTrend self = new GetSuccessInstanceTrendResponseInstanceStatusTrend();
            return TeaModel.build(map, self);
        }

        public GetSuccessInstanceTrendResponseInstanceStatusTrend setTodayTrend(java.util.List<GetSuccessInstanceTrendResponseInstanceStatusTrendTodayTrend> todayTrend) {
            this.todayTrend = todayTrend;
            return this;
        }
        public java.util.List<GetSuccessInstanceTrendResponseInstanceStatusTrendTodayTrend> getTodayTrend() {
            return this.todayTrend;
        }

        public GetSuccessInstanceTrendResponseInstanceStatusTrend setYesterdayTrend(java.util.List<GetSuccessInstanceTrendResponseInstanceStatusTrendYesterdayTrend> yesterdayTrend) {
            this.yesterdayTrend = yesterdayTrend;
            return this;
        }
        public java.util.List<GetSuccessInstanceTrendResponseInstanceStatusTrendYesterdayTrend> getYesterdayTrend() {
            return this.yesterdayTrend;
        }

        public GetSuccessInstanceTrendResponseInstanceStatusTrend setAvgTrend(java.util.List<GetSuccessInstanceTrendResponseInstanceStatusTrendAvgTrend> avgTrend) {
            this.avgTrend = avgTrend;
            return this;
        }
        public java.util.List<GetSuccessInstanceTrendResponseInstanceStatusTrendAvgTrend> getAvgTrend() {
            return this.avgTrend;
        }

    }

}
