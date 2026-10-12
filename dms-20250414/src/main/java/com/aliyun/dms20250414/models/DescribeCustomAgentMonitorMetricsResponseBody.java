// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DescribeCustomAgentMonitorMetricsResponseBody extends TeaModel {
    /**
     * <p>The response struct.</p>
     */
    @NameInMap("Data")
    public DescribeCustomAgentMonitorMetricsResponseBodyData data;

    /**
     * <p>The error code returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidTid</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned when the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Specified parameter Tid is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E0D21075-CD3E-4D98-8264-FD8AD04A63B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request is successful.</li>
     * <li><strong>false</strong>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeCustomAgentMonitorMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomAgentMonitorMetricsResponseBody self = new DescribeCustomAgentMonitorMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomAgentMonitorMetricsResponseBody setData(DescribeCustomAgentMonitorMetricsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCustomAgentMonitorMetricsResponseBodyData getData() {
        return this.data;
    }

    public DescribeCustomAgentMonitorMetricsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeCustomAgentMonitorMetricsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeCustomAgentMonitorMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomAgentMonitorMetricsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCustomAgentMonitorMetricsResponseBodyDataTrend extends TeaModel {
        /**
         * <p>The number of active users within the statistical period.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ActiveUserCount")
        public Long activeUserCount;

        /**
         * <p>The number of dislikes within the statistical period.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DislikeCount")
        public Long dislikeCount;

        /**
         * <p>The number of likes within the statistical period.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LikeCount")
        public Long likeCount;

        /**
         * <p>The number of sessions within the statistical period.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SessionCount")
        public Long sessionCount;

        /**
         * <p>The statistical time. For daily granularity, the format is 2026-09-01. For hourly granularity, the format is 2026-09-01 13:00.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-01</p>
         */
        @NameInMap("StatTime")
        public String statTime;

        /**
         * <p>The start timestamp of the statistical period (epoch millis).</p>
         * 
         * <strong>example:</strong>
         * <p>1782835200000</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        public static DescribeCustomAgentMonitorMetricsResponseBodyDataTrend build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomAgentMonitorMetricsResponseBodyDataTrend self = new DescribeCustomAgentMonitorMetricsResponseBodyDataTrend();
            return TeaModel.build(map, self);
        }

        public DescribeCustomAgentMonitorMetricsResponseBodyDataTrend setActiveUserCount(Long activeUserCount) {
            this.activeUserCount = activeUserCount;
            return this;
        }
        public Long getActiveUserCount() {
            return this.activeUserCount;
        }

        public DescribeCustomAgentMonitorMetricsResponseBodyDataTrend setDislikeCount(Long dislikeCount) {
            this.dislikeCount = dislikeCount;
            return this;
        }
        public Long getDislikeCount() {
            return this.dislikeCount;
        }

        public DescribeCustomAgentMonitorMetricsResponseBodyDataTrend setLikeCount(Long likeCount) {
            this.likeCount = likeCount;
            return this;
        }
        public Long getLikeCount() {
            return this.likeCount;
        }

        public DescribeCustomAgentMonitorMetricsResponseBodyDataTrend setSessionCount(Long sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }
        public Long getSessionCount() {
            return this.sessionCount;
        }

        public DescribeCustomAgentMonitorMetricsResponseBodyDataTrend setStatTime(String statTime) {
            this.statTime = statTime;
            return this;
        }
        public String getStatTime() {
            return this.statTime;
        }

        public DescribeCustomAgentMonitorMetricsResponseBodyDataTrend setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class DescribeCustomAgentMonitorMetricsResponseBodyData extends TeaModel {
        /**
         * <p>The number of active users.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("ActiveUserCount")
        public Long activeUserCount;

        /**
         * <p>The custom agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-4y3ca4khkcu**********ysf</p>
         */
        @NameInMap("CustomAgentId")
        public String customAgentId;

        /**
         * <p>The total number of dislikes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DislikeCount")
        public Long dislikeCount;

        /**
         * <p>The end time of the statistical period (epoch millis).</p>
         * 
         * <strong>example:</strong>
         * <p>1756742400000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The aggregation granularity: DAY / HOUR.</p>
         * 
         * <strong>example:</strong>
         * <p>DAY</p>
         */
        @NameInMap("Granularity")
        public String granularity;

        /**
         * <p>The total number of likes.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("LikeCount")
        public Long likeCount;

        /**
         * <p>The total number of sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>102</p>
         */
        @NameInMap("SessionCount")
        public Long sessionCount;

        /**
         * <p>The start time of the statistical period (epoch millis).</p>
         * 
         * <strong>example:</strong>
         * <p>1782835200000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The trend data aggregated by the specified granularity. Time points without data are filled with 0. The data is sorted in chronological order.</p>
         */
        @NameInMap("Trend")
        public java.util.List<DescribeCustomAgentMonitorMetricsResponseBodyDataTrend> trend;

        public static DescribeCustomAgentMonitorMetricsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomAgentMonitorMetricsResponseBodyData self = new DescribeCustomAgentMonitorMetricsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCustomAgentMonitorMetricsResponseBodyData setActiveUserCount(Long activeUserCount) {
            this.activeUserCount = activeUserCount;
            return this;
        }
        public Long getActiveUserCount() {
            return this.activeUserCount;
        }

        public DescribeCustomAgentMonitorMetricsResponseBodyData setCustomAgentId(String customAgentId) {
            this.customAgentId = customAgentId;
            return this;
        }
        public String getCustomAgentId() {
            return this.customAgentId;
        }

        public DescribeCustomAgentMonitorMetricsResponseBodyData setDislikeCount(Long dislikeCount) {
            this.dislikeCount = dislikeCount;
            return this;
        }
        public Long getDislikeCount() {
            return this.dislikeCount;
        }

        public DescribeCustomAgentMonitorMetricsResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeCustomAgentMonitorMetricsResponseBodyData setGranularity(String granularity) {
            this.granularity = granularity;
            return this;
        }
        public String getGranularity() {
            return this.granularity;
        }

        public DescribeCustomAgentMonitorMetricsResponseBodyData setLikeCount(Long likeCount) {
            this.likeCount = likeCount;
            return this;
        }
        public Long getLikeCount() {
            return this.likeCount;
        }

        public DescribeCustomAgentMonitorMetricsResponseBodyData setSessionCount(Long sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }
        public Long getSessionCount() {
            return this.sessionCount;
        }

        public DescribeCustomAgentMonitorMetricsResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeCustomAgentMonitorMetricsResponseBodyData setTrend(java.util.List<DescribeCustomAgentMonitorMetricsResponseBodyDataTrend> trend) {
            this.trend = trend;
            return this;
        }
        public java.util.List<DescribeCustomAgentMonitorMetricsResponseBodyDataTrend> getTrend() {
            return this.trend;
        }

    }

}
