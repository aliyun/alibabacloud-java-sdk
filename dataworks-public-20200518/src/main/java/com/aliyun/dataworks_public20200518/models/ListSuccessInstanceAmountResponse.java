// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListSuccessInstanceAmountResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceStatusTrend")
    @Validation(required = true)
    public ListSuccessInstanceAmountResponseInstanceStatusTrend instanceStatusTrend;

    public static ListSuccessInstanceAmountResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSuccessInstanceAmountResponse self = new ListSuccessInstanceAmountResponse();
        return TeaModel.build(map, self);
    }

    public ListSuccessInstanceAmountResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSuccessInstanceAmountResponse setInstanceStatusTrend(ListSuccessInstanceAmountResponseInstanceStatusTrend instanceStatusTrend) {
        this.instanceStatusTrend = instanceStatusTrend;
        return this;
    }
    public ListSuccessInstanceAmountResponseInstanceStatusTrend getInstanceStatusTrend() {
        return this.instanceStatusTrend;
    }

    public static class ListSuccessInstanceAmountResponseInstanceStatusTrendTodayTrend extends TeaModel {
        @NameInMap("Count")
        @Validation(required = true)
        public Integer count;

        @NameInMap("TimePoint")
        @Validation(required = true)
        public String timePoint;

        public static ListSuccessInstanceAmountResponseInstanceStatusTrendTodayTrend build(java.util.Map<String, ?> map) throws Exception {
            ListSuccessInstanceAmountResponseInstanceStatusTrendTodayTrend self = new ListSuccessInstanceAmountResponseInstanceStatusTrendTodayTrend();
            return TeaModel.build(map, self);
        }

        public ListSuccessInstanceAmountResponseInstanceStatusTrendTodayTrend setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListSuccessInstanceAmountResponseInstanceStatusTrendTodayTrend setTimePoint(String timePoint) {
            this.timePoint = timePoint;
            return this;
        }
        public String getTimePoint() {
            return this.timePoint;
        }

    }

    public static class ListSuccessInstanceAmountResponseInstanceStatusTrendYesterdayTrend extends TeaModel {
        @NameInMap("Count")
        @Validation(required = true)
        public Integer count;

        @NameInMap("TimePoint")
        @Validation(required = true)
        public String timePoint;

        public static ListSuccessInstanceAmountResponseInstanceStatusTrendYesterdayTrend build(java.util.Map<String, ?> map) throws Exception {
            ListSuccessInstanceAmountResponseInstanceStatusTrendYesterdayTrend self = new ListSuccessInstanceAmountResponseInstanceStatusTrendYesterdayTrend();
            return TeaModel.build(map, self);
        }

        public ListSuccessInstanceAmountResponseInstanceStatusTrendYesterdayTrend setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListSuccessInstanceAmountResponseInstanceStatusTrendYesterdayTrend setTimePoint(String timePoint) {
            this.timePoint = timePoint;
            return this;
        }
        public String getTimePoint() {
            return this.timePoint;
        }

    }

    public static class ListSuccessInstanceAmountResponseInstanceStatusTrendAvgTrend extends TeaModel {
        @NameInMap("Count")
        @Validation(required = true)
        public Integer count;

        @NameInMap("TimePoint")
        @Validation(required = true)
        public String timePoint;

        public static ListSuccessInstanceAmountResponseInstanceStatusTrendAvgTrend build(java.util.Map<String, ?> map) throws Exception {
            ListSuccessInstanceAmountResponseInstanceStatusTrendAvgTrend self = new ListSuccessInstanceAmountResponseInstanceStatusTrendAvgTrend();
            return TeaModel.build(map, self);
        }

        public ListSuccessInstanceAmountResponseInstanceStatusTrendAvgTrend setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListSuccessInstanceAmountResponseInstanceStatusTrendAvgTrend setTimePoint(String timePoint) {
            this.timePoint = timePoint;
            return this;
        }
        public String getTimePoint() {
            return this.timePoint;
        }

    }

    public static class ListSuccessInstanceAmountResponseInstanceStatusTrend extends TeaModel {
        @NameInMap("TodayTrend")
        @Validation(required = true)
        public java.util.List<ListSuccessInstanceAmountResponseInstanceStatusTrendTodayTrend> todayTrend;

        @NameInMap("YesterdayTrend")
        @Validation(required = true)
        public java.util.List<ListSuccessInstanceAmountResponseInstanceStatusTrendYesterdayTrend> yesterdayTrend;

        @NameInMap("AvgTrend")
        @Validation(required = true)
        public java.util.List<ListSuccessInstanceAmountResponseInstanceStatusTrendAvgTrend> avgTrend;

        public static ListSuccessInstanceAmountResponseInstanceStatusTrend build(java.util.Map<String, ?> map) throws Exception {
            ListSuccessInstanceAmountResponseInstanceStatusTrend self = new ListSuccessInstanceAmountResponseInstanceStatusTrend();
            return TeaModel.build(map, self);
        }

        public ListSuccessInstanceAmountResponseInstanceStatusTrend setTodayTrend(java.util.List<ListSuccessInstanceAmountResponseInstanceStatusTrendTodayTrend> todayTrend) {
            this.todayTrend = todayTrend;
            return this;
        }
        public java.util.List<ListSuccessInstanceAmountResponseInstanceStatusTrendTodayTrend> getTodayTrend() {
            return this.todayTrend;
        }

        public ListSuccessInstanceAmountResponseInstanceStatusTrend setYesterdayTrend(java.util.List<ListSuccessInstanceAmountResponseInstanceStatusTrendYesterdayTrend> yesterdayTrend) {
            this.yesterdayTrend = yesterdayTrend;
            return this;
        }
        public java.util.List<ListSuccessInstanceAmountResponseInstanceStatusTrendYesterdayTrend> getYesterdayTrend() {
            return this.yesterdayTrend;
        }

        public ListSuccessInstanceAmountResponseInstanceStatusTrend setAvgTrend(java.util.List<ListSuccessInstanceAmountResponseInstanceStatusTrendAvgTrend> avgTrend) {
            this.avgTrend = avgTrend;
            return this;
        }
        public java.util.List<ListSuccessInstanceAmountResponseInstanceStatusTrendAvgTrend> getAvgTrend() {
            return this.avgTrend;
        }

    }

}
