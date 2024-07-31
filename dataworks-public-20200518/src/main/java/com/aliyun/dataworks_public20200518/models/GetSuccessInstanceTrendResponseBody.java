// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetSuccessInstanceTrendResponseBody extends TeaModel {
    /**
     * <p>The trend of statistics on the instance status in different time periods.</p>
     */
    @NameInMap("InstanceStatusTrend")
    public GetSuccessInstanceTrendResponseBodyInstanceStatusTrend instanceStatusTrend;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>952795279527ab****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetSuccessInstanceTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSuccessInstanceTrendResponseBody self = new GetSuccessInstanceTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSuccessInstanceTrendResponseBody setInstanceStatusTrend(GetSuccessInstanceTrendResponseBodyInstanceStatusTrend instanceStatusTrend) {
        this.instanceStatusTrend = instanceStatusTrend;
        return this;
    }
    public GetSuccessInstanceTrendResponseBodyInstanceStatusTrend getInstanceStatusTrend() {
        return this.instanceStatusTrend;
    }

    public GetSuccessInstanceTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSuccessInstanceTrendResponseBodyInstanceStatusTrendAvgTrend extends TeaModel {
        /**
         * <p>The number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The point in time. Valid values: 00:00 to 23:00.</p>
         * 
         * <strong>example:</strong>
         * <p>01:00</p>
         */
        @NameInMap("TimePoint")
        public String timePoint;

        public static GetSuccessInstanceTrendResponseBodyInstanceStatusTrendAvgTrend build(java.util.Map<String, ?> map) throws Exception {
            GetSuccessInstanceTrendResponseBodyInstanceStatusTrendAvgTrend self = new GetSuccessInstanceTrendResponseBodyInstanceStatusTrendAvgTrend();
            return TeaModel.build(map, self);
        }

        public GetSuccessInstanceTrendResponseBodyInstanceStatusTrendAvgTrend setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetSuccessInstanceTrendResponseBodyInstanceStatusTrendAvgTrend setTimePoint(String timePoint) {
            this.timePoint = timePoint;
            return this;
        }
        public String getTimePoint() {
            return this.timePoint;
        }

    }

    public static class GetSuccessInstanceTrendResponseBodyInstanceStatusTrendTodayTrend extends TeaModel {
        /**
         * <p>The number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The point in time. Valid values: 00:00 to 23:00.</p>
         * 
         * <strong>example:</strong>
         * <p>01:00</p>
         */
        @NameInMap("TimePoint")
        public String timePoint;

        public static GetSuccessInstanceTrendResponseBodyInstanceStatusTrendTodayTrend build(java.util.Map<String, ?> map) throws Exception {
            GetSuccessInstanceTrendResponseBodyInstanceStatusTrendTodayTrend self = new GetSuccessInstanceTrendResponseBodyInstanceStatusTrendTodayTrend();
            return TeaModel.build(map, self);
        }

        public GetSuccessInstanceTrendResponseBodyInstanceStatusTrendTodayTrend setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetSuccessInstanceTrendResponseBodyInstanceStatusTrendTodayTrend setTimePoint(String timePoint) {
            this.timePoint = timePoint;
            return this;
        }
        public String getTimePoint() {
            return this.timePoint;
        }

    }

    public static class GetSuccessInstanceTrendResponseBodyInstanceStatusTrendYesterdayTrend extends TeaModel {
        /**
         * <p>The number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The point in time. Valid values: 00:00 to 23:00.</p>
         * 
         * <strong>example:</strong>
         * <p>01:00</p>
         */
        @NameInMap("TimePoint")
        public String timePoint;

        public static GetSuccessInstanceTrendResponseBodyInstanceStatusTrendYesterdayTrend build(java.util.Map<String, ?> map) throws Exception {
            GetSuccessInstanceTrendResponseBodyInstanceStatusTrendYesterdayTrend self = new GetSuccessInstanceTrendResponseBodyInstanceStatusTrendYesterdayTrend();
            return TeaModel.build(map, self);
        }

        public GetSuccessInstanceTrendResponseBodyInstanceStatusTrendYesterdayTrend setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetSuccessInstanceTrendResponseBodyInstanceStatusTrendYesterdayTrend setTimePoint(String timePoint) {
            this.timePoint = timePoint;
            return this;
        }
        public String getTimePoint() {
            return this.timePoint;
        }

    }

    public static class GetSuccessInstanceTrendResponseBodyInstanceStatusTrend extends TeaModel {
        /**
         * <p>The average trend.</p>
         */
        @NameInMap("AvgTrend")
        public java.util.List<GetSuccessInstanceTrendResponseBodyInstanceStatusTrendAvgTrend> avgTrend;

        /**
         * <p>The trend on the current day.</p>
         */
        @NameInMap("TodayTrend")
        public java.util.List<GetSuccessInstanceTrendResponseBodyInstanceStatusTrendTodayTrend> todayTrend;

        /**
         * <p>The trend on the previous day.</p>
         */
        @NameInMap("YesterdayTrend")
        public java.util.List<GetSuccessInstanceTrendResponseBodyInstanceStatusTrendYesterdayTrend> yesterdayTrend;

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

        public GetSuccessInstanceTrendResponseBodyInstanceStatusTrend setTodayTrend(java.util.List<GetSuccessInstanceTrendResponseBodyInstanceStatusTrendTodayTrend> todayTrend) {
            this.todayTrend = todayTrend;
            return this;
        }
        public java.util.List<GetSuccessInstanceTrendResponseBodyInstanceStatusTrendTodayTrend> getTodayTrend() {
            return this.todayTrend;
        }

        public GetSuccessInstanceTrendResponseBodyInstanceStatusTrend setYesterdayTrend(java.util.List<GetSuccessInstanceTrendResponseBodyInstanceStatusTrendYesterdayTrend> yesterdayTrend) {
            this.yesterdayTrend = yesterdayTrend;
            return this;
        }
        public java.util.List<GetSuccessInstanceTrendResponseBodyInstanceStatusTrendYesterdayTrend> getYesterdayTrend() {
            return this.yesterdayTrend;
        }

    }

}
