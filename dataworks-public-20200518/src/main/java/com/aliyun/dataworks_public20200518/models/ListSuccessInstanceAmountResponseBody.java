// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListSuccessInstanceAmountResponseBody extends TeaModel {
    /**
     * <p>Indicates the trend of the number of auto triggered node instances that are successfully run every hour on the hour of the current day.</p>
     */
    @NameInMap("InstanceStatusTrend")
    public ListSuccessInstanceAmountResponseBodyInstanceStatusTrend instanceStatusTrend;

    /**
     * <p>The ID of the request. You can use the ID to troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListSuccessInstanceAmountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSuccessInstanceAmountResponseBody self = new ListSuccessInstanceAmountResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSuccessInstanceAmountResponseBody setInstanceStatusTrend(ListSuccessInstanceAmountResponseBodyInstanceStatusTrend instanceStatusTrend) {
        this.instanceStatusTrend = instanceStatusTrend;
        return this;
    }
    public ListSuccessInstanceAmountResponseBodyInstanceStatusTrend getInstanceStatusTrend() {
        return this.instanceStatusTrend;
    }

    public ListSuccessInstanceAmountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSuccessInstanceAmountResponseBodyInstanceStatusTrendAvgTrend extends TeaModel {
        /**
         * <p>The number of instances that are successfully run.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The point in time. The value is an exact hour that ranges from 00:00 to 23:00, such as 00:00, 01:00, or 02:00.</p>
         */
        @NameInMap("TimePoint")
        public String timePoint;

        public static ListSuccessInstanceAmountResponseBodyInstanceStatusTrendAvgTrend build(java.util.Map<String, ?> map) throws Exception {
            ListSuccessInstanceAmountResponseBodyInstanceStatusTrendAvgTrend self = new ListSuccessInstanceAmountResponseBodyInstanceStatusTrendAvgTrend();
            return TeaModel.build(map, self);
        }

        public ListSuccessInstanceAmountResponseBodyInstanceStatusTrendAvgTrend setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListSuccessInstanceAmountResponseBodyInstanceStatusTrendAvgTrend setTimePoint(String timePoint) {
            this.timePoint = timePoint;
            return this;
        }
        public String getTimePoint() {
            return this.timePoint;
        }

    }

    public static class ListSuccessInstanceAmountResponseBodyInstanceStatusTrendTodayTrend extends TeaModel {
        /**
         * <p>The number of instances that are successfully run.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The point in time. The value is an exact hour that ranges from 00:00 to 23:00, such as 00:00, 01:00, or 02:00.</p>
         */
        @NameInMap("TimePoint")
        public String timePoint;

        public static ListSuccessInstanceAmountResponseBodyInstanceStatusTrendTodayTrend build(java.util.Map<String, ?> map) throws Exception {
            ListSuccessInstanceAmountResponseBodyInstanceStatusTrendTodayTrend self = new ListSuccessInstanceAmountResponseBodyInstanceStatusTrendTodayTrend();
            return TeaModel.build(map, self);
        }

        public ListSuccessInstanceAmountResponseBodyInstanceStatusTrendTodayTrend setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListSuccessInstanceAmountResponseBodyInstanceStatusTrendTodayTrend setTimePoint(String timePoint) {
            this.timePoint = timePoint;
            return this;
        }
        public String getTimePoint() {
            return this.timePoint;
        }

    }

    public static class ListSuccessInstanceAmountResponseBodyInstanceStatusTrendYesterdayTrend extends TeaModel {
        /**
         * <p>The number of instances that are successfully run.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The point in time. The value is an exact hour that ranges from 00:00 to 23:00, such as 00:00, 01:00, or 02:00.</p>
         */
        @NameInMap("TimePoint")
        public String timePoint;

        public static ListSuccessInstanceAmountResponseBodyInstanceStatusTrendYesterdayTrend build(java.util.Map<String, ?> map) throws Exception {
            ListSuccessInstanceAmountResponseBodyInstanceStatusTrendYesterdayTrend self = new ListSuccessInstanceAmountResponseBodyInstanceStatusTrendYesterdayTrend();
            return TeaModel.build(map, self);
        }

        public ListSuccessInstanceAmountResponseBodyInstanceStatusTrendYesterdayTrend setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListSuccessInstanceAmountResponseBodyInstanceStatusTrendYesterdayTrend setTimePoint(String timePoint) {
            this.timePoint = timePoint;
            return this;
        }
        public String getTimePoint() {
            return this.timePoint;
        }

    }

    public static class ListSuccessInstanceAmountResponseBodyInstanceStatusTrend extends TeaModel {
        /**
         * <p>The average trend.</p>
         */
        @NameInMap("AvgTrend")
        public java.util.List<ListSuccessInstanceAmountResponseBodyInstanceStatusTrendAvgTrend> avgTrend;

        /**
         * <p>The trend of the number of auto triggered node instances that are successfully run on the current day.</p>
         */
        @NameInMap("TodayTrend")
        public java.util.List<ListSuccessInstanceAmountResponseBodyInstanceStatusTrendTodayTrend> todayTrend;

        /**
         * <p>The trend of the number of auto triggered node instances that are successfully run one day earlier than the current day.</p>
         */
        @NameInMap("YesterdayTrend")
        public java.util.List<ListSuccessInstanceAmountResponseBodyInstanceStatusTrendYesterdayTrend> yesterdayTrend;

        public static ListSuccessInstanceAmountResponseBodyInstanceStatusTrend build(java.util.Map<String, ?> map) throws Exception {
            ListSuccessInstanceAmountResponseBodyInstanceStatusTrend self = new ListSuccessInstanceAmountResponseBodyInstanceStatusTrend();
            return TeaModel.build(map, self);
        }

        public ListSuccessInstanceAmountResponseBodyInstanceStatusTrend setAvgTrend(java.util.List<ListSuccessInstanceAmountResponseBodyInstanceStatusTrendAvgTrend> avgTrend) {
            this.avgTrend = avgTrend;
            return this;
        }
        public java.util.List<ListSuccessInstanceAmountResponseBodyInstanceStatusTrendAvgTrend> getAvgTrend() {
            return this.avgTrend;
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

    }

}
