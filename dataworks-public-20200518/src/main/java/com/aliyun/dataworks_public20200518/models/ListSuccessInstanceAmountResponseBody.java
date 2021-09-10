// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListSuccessInstanceAmountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceStatusTrend")
    public ListSuccessInstanceAmountResponseBodyInstanceStatusTrend instanceStatusTrend;

    public static ListSuccessInstanceAmountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSuccessInstanceAmountResponseBody self = new ListSuccessInstanceAmountResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSuccessInstanceAmountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSuccessInstanceAmountResponseBody setInstanceStatusTrend(ListSuccessInstanceAmountResponseBodyInstanceStatusTrend instanceStatusTrend) {
        this.instanceStatusTrend = instanceStatusTrend;
        return this;
    }
    public ListSuccessInstanceAmountResponseBodyInstanceStatusTrend getInstanceStatusTrend() {
        return this.instanceStatusTrend;
    }

    public static class ListSuccessInstanceAmountResponseBodyInstanceStatusTrendTodayTrend extends TeaModel {
        @NameInMap("TimePoint")
        public String timePoint;

        @NameInMap("Count")
        public Integer count;

        public static ListSuccessInstanceAmountResponseBodyInstanceStatusTrendTodayTrend build(java.util.Map<String, ?> map) throws Exception {
            ListSuccessInstanceAmountResponseBodyInstanceStatusTrendTodayTrend self = new ListSuccessInstanceAmountResponseBodyInstanceStatusTrendTodayTrend();
            return TeaModel.build(map, self);
        }

        public ListSuccessInstanceAmountResponseBodyInstanceStatusTrendTodayTrend setTimePoint(String timePoint) {
            this.timePoint = timePoint;
            return this;
        }
        public String getTimePoint() {
            return this.timePoint;
        }

        public ListSuccessInstanceAmountResponseBodyInstanceStatusTrendTodayTrend setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class ListSuccessInstanceAmountResponseBodyInstanceStatusTrendYesterdayTrend extends TeaModel {
        @NameInMap("TimePoint")
        public String timePoint;

        @NameInMap("Count")
        public Integer count;

        public static ListSuccessInstanceAmountResponseBodyInstanceStatusTrendYesterdayTrend build(java.util.Map<String, ?> map) throws Exception {
            ListSuccessInstanceAmountResponseBodyInstanceStatusTrendYesterdayTrend self = new ListSuccessInstanceAmountResponseBodyInstanceStatusTrendYesterdayTrend();
            return TeaModel.build(map, self);
        }

        public ListSuccessInstanceAmountResponseBodyInstanceStatusTrendYesterdayTrend setTimePoint(String timePoint) {
            this.timePoint = timePoint;
            return this;
        }
        public String getTimePoint() {
            return this.timePoint;
        }

        public ListSuccessInstanceAmountResponseBodyInstanceStatusTrendYesterdayTrend setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class ListSuccessInstanceAmountResponseBodyInstanceStatusTrendAvgTrend extends TeaModel {
        @NameInMap("TimePoint")
        public String timePoint;

        @NameInMap("Count")
        public Integer count;

        public static ListSuccessInstanceAmountResponseBodyInstanceStatusTrendAvgTrend build(java.util.Map<String, ?> map) throws Exception {
            ListSuccessInstanceAmountResponseBodyInstanceStatusTrendAvgTrend self = new ListSuccessInstanceAmountResponseBodyInstanceStatusTrendAvgTrend();
            return TeaModel.build(map, self);
        }

        public ListSuccessInstanceAmountResponseBodyInstanceStatusTrendAvgTrend setTimePoint(String timePoint) {
            this.timePoint = timePoint;
            return this;
        }
        public String getTimePoint() {
            return this.timePoint;
        }

        public ListSuccessInstanceAmountResponseBodyInstanceStatusTrendAvgTrend setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class ListSuccessInstanceAmountResponseBodyInstanceStatusTrend extends TeaModel {
        @NameInMap("TodayTrend")
        public java.util.List<ListSuccessInstanceAmountResponseBodyInstanceStatusTrendTodayTrend> todayTrend;

        @NameInMap("YesterdayTrend")
        public java.util.List<ListSuccessInstanceAmountResponseBodyInstanceStatusTrendYesterdayTrend> yesterdayTrend;

        @NameInMap("AvgTrend")
        public java.util.List<ListSuccessInstanceAmountResponseBodyInstanceStatusTrendAvgTrend> avgTrend;

        public static ListSuccessInstanceAmountResponseBodyInstanceStatusTrend build(java.util.Map<String, ?> map) throws Exception {
            ListSuccessInstanceAmountResponseBodyInstanceStatusTrend self = new ListSuccessInstanceAmountResponseBodyInstanceStatusTrend();
            return TeaModel.build(map, self);
        }

        public ListSuccessInstanceAmountResponseBodyInstanceStatusTrend setTodayTrend(java.util.List<ListSuccessInstanceAmountResponseBodyInstanceStatusTrendTodayTrend> todayTrend) {
            this.todayTrend = todayTrend;
            return this;
        }
        public java.util.List<ListSuccessInstanceAmountResponseBodyInstanceStatusTrendTodayTrend> getTodayTrend() {
            return this.todayTrend;
        }

        public ListSuccessInstanceAmountResponseBodyInstanceStatusTrend setYesterdayTrend(java.util.List<ListSuccessInstanceAmountResponseBodyInstanceStatusTrendYesterdayTrend> yesterdayTrend) {
            this.yesterdayTrend = yesterdayTrend;
            return this;
        }
        public java.util.List<ListSuccessInstanceAmountResponseBodyInstanceStatusTrendYesterdayTrend> getYesterdayTrend() {
            return this.yesterdayTrend;
        }

        public ListSuccessInstanceAmountResponseBodyInstanceStatusTrend setAvgTrend(java.util.List<ListSuccessInstanceAmountResponseBodyInstanceStatusTrendAvgTrend> avgTrend) {
            this.avgTrend = avgTrend;
            return this;
        }
        public java.util.List<ListSuccessInstanceAmountResponseBodyInstanceStatusTrendAvgTrend> getAvgTrend() {
            return this.avgTrend;
        }

    }

}
