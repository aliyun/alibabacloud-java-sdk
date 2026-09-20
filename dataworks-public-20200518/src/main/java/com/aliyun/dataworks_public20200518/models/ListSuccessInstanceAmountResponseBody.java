// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListSuccessInstanceAmountResponseBody extends TeaModel {
    /**
     * <p>The trend data of successfully completed instance counts at different hours on the business date.</p>
     */
    @NameInMap("InstanceStatusTrend")
    public ListSuccessInstanceAmountResponseBodyInstanceStatusTrend instanceStatusTrend;

    /**
     * <p>The request ID. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>952795279527ab****</p>
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
         * <p>The number of successfully completed instances.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The time point. Valid values: hours on the hour from 00:00 to 23:00, such as 00:00, 01:00, and 02:00.</p>
         * <p>Format: <code>HH:mm</code>. Example: <code>01:00</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>01:00</p>
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
         * <p>The number of successfully completed instances.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The time point. Valid values: hours on the hour from 00:00 to 23:00, such as 00:00, 01:00, and 02:00.</p>
         * <p>Format: <code>HH:mm</code>. Example: <code>01:00</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>01:00</p>
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
         * <p>The number of successfully completed instances.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The time point. Valid values: hours on the hour from 00:00 to 23:00, such as 00:00, 01:00, and 02:00.</p>
         * <p>Format: <code>HH:mm</code>. Example: <code>01:00</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>01:00</p>
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
         * <p>The historical average trend.</p>
         */
        @NameInMap("AvgTrend")
        public java.util.List<ListSuccessInstanceAmountResponseBodyInstanceStatusTrendAvgTrend> avgTrend;

        /**
         * <p>The trend for the current business date.</p>
         */
        @NameInMap("TodayTrend")
        public java.util.List<ListSuccessInstanceAmountResponseBodyInstanceStatusTrendTodayTrend> todayTrend;

        /**
         * <p>The trend for the day before the business date.</p>
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
