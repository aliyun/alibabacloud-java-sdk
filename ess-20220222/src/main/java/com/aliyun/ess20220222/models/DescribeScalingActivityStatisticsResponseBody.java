// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingActivityStatisticsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>A8F44B4D-BAB4-5176-8705-5984xxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScalingActivityErrorCodeStatistics")
    public DescribeScalingActivityStatisticsResponseBodyScalingActivityErrorCodeStatistics scalingActivityErrorCodeStatistics;

    @NameInMap("ScalingActivityStatusStatistics")
    public DescribeScalingActivityStatisticsResponseBodyScalingActivityStatusStatistics scalingActivityStatusStatistics;

    public static DescribeScalingActivityStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingActivityStatisticsResponseBody self = new DescribeScalingActivityStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScalingActivityStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScalingActivityStatisticsResponseBody setScalingActivityErrorCodeStatistics(DescribeScalingActivityStatisticsResponseBodyScalingActivityErrorCodeStatistics scalingActivityErrorCodeStatistics) {
        this.scalingActivityErrorCodeStatistics = scalingActivityErrorCodeStatistics;
        return this;
    }
    public DescribeScalingActivityStatisticsResponseBodyScalingActivityErrorCodeStatistics getScalingActivityErrorCodeStatistics() {
        return this.scalingActivityErrorCodeStatistics;
    }

    public DescribeScalingActivityStatisticsResponseBody setScalingActivityStatusStatistics(DescribeScalingActivityStatisticsResponseBodyScalingActivityStatusStatistics scalingActivityStatusStatistics) {
        this.scalingActivityStatusStatistics = scalingActivityStatusStatistics;
        return this;
    }
    public DescribeScalingActivityStatisticsResponseBodyScalingActivityStatusStatistics getScalingActivityStatusStatistics() {
        return this.scalingActivityStatusStatistics;
    }

    public static class DescribeScalingActivityStatisticsResponseBodyScalingActivityErrorCodeStatisticsErrorStatistic extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <strong>example:</strong>
         * <p>QuotaExceeded.PrivateIpAddress</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>2025121623</p>
         */
        @NameInMap("Time")
        public String time;

        public static DescribeScalingActivityStatisticsResponseBodyScalingActivityErrorCodeStatisticsErrorStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingActivityStatisticsResponseBodyScalingActivityErrorCodeStatisticsErrorStatistic self = new DescribeScalingActivityStatisticsResponseBodyScalingActivityErrorCodeStatisticsErrorStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeScalingActivityStatisticsResponseBodyScalingActivityErrorCodeStatisticsErrorStatistic setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeScalingActivityStatisticsResponseBodyScalingActivityErrorCodeStatisticsErrorStatistic setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeScalingActivityStatisticsResponseBodyScalingActivityErrorCodeStatisticsErrorStatistic setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class DescribeScalingActivityStatisticsResponseBodyScalingActivityErrorCodeStatistics extends TeaModel {
        @NameInMap("ErrorStatistic")
        public java.util.List<DescribeScalingActivityStatisticsResponseBodyScalingActivityErrorCodeStatisticsErrorStatistic> errorStatistic;

        public static DescribeScalingActivityStatisticsResponseBodyScalingActivityErrorCodeStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingActivityStatisticsResponseBodyScalingActivityErrorCodeStatistics self = new DescribeScalingActivityStatisticsResponseBodyScalingActivityErrorCodeStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeScalingActivityStatisticsResponseBodyScalingActivityErrorCodeStatistics setErrorStatistic(java.util.List<DescribeScalingActivityStatisticsResponseBodyScalingActivityErrorCodeStatisticsErrorStatistic> errorStatistic) {
            this.errorStatistic = errorStatistic;
            return this;
        }
        public java.util.List<DescribeScalingActivityStatisticsResponseBodyScalingActivityErrorCodeStatisticsErrorStatistic> getErrorStatistic() {
            return this.errorStatistic;
        }

    }

    public static class DescribeScalingActivityStatisticsResponseBodyScalingActivityStatusStatisticsStatistic extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FailedActivityCount")
        public Integer failedActivityCount;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SuccessActivityCount")
        public Integer successActivityCount;

        /**
         * <strong>example:</strong>
         * <p>2025121623</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("WarningActivityCount")
        public Integer warningActivityCount;

        public static DescribeScalingActivityStatisticsResponseBodyScalingActivityStatusStatisticsStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingActivityStatisticsResponseBodyScalingActivityStatusStatisticsStatistic self = new DescribeScalingActivityStatisticsResponseBodyScalingActivityStatusStatisticsStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeScalingActivityStatisticsResponseBodyScalingActivityStatusStatisticsStatistic setFailedActivityCount(Integer failedActivityCount) {
            this.failedActivityCount = failedActivityCount;
            return this;
        }
        public Integer getFailedActivityCount() {
            return this.failedActivityCount;
        }

        public DescribeScalingActivityStatisticsResponseBodyScalingActivityStatusStatisticsStatistic setSuccessActivityCount(Integer successActivityCount) {
            this.successActivityCount = successActivityCount;
            return this;
        }
        public Integer getSuccessActivityCount() {
            return this.successActivityCount;
        }

        public DescribeScalingActivityStatisticsResponseBodyScalingActivityStatusStatisticsStatistic setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeScalingActivityStatisticsResponseBodyScalingActivityStatusStatisticsStatistic setWarningActivityCount(Integer warningActivityCount) {
            this.warningActivityCount = warningActivityCount;
            return this;
        }
        public Integer getWarningActivityCount() {
            return this.warningActivityCount;
        }

    }

    public static class DescribeScalingActivityStatisticsResponseBodyScalingActivityStatusStatistics extends TeaModel {
        @NameInMap("Statistic")
        public java.util.List<DescribeScalingActivityStatisticsResponseBodyScalingActivityStatusStatisticsStatistic> statistic;

        public static DescribeScalingActivityStatisticsResponseBodyScalingActivityStatusStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingActivityStatisticsResponseBodyScalingActivityStatusStatistics self = new DescribeScalingActivityStatisticsResponseBodyScalingActivityStatusStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeScalingActivityStatisticsResponseBodyScalingActivityStatusStatistics setStatistic(java.util.List<DescribeScalingActivityStatisticsResponseBodyScalingActivityStatusStatisticsStatistic> statistic) {
            this.statistic = statistic;
            return this;
        }
        public java.util.List<DescribeScalingActivityStatisticsResponseBodyScalingActivityStatusStatisticsStatistic> getStatistic() {
            return this.statistic;
        }

    }

}
