// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeRequestStatisticCountByEsnBiz1DayResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Statistic")
    public DescribeRequestStatisticCountByEsnBiz1DayResponseBodyStatistic statistic;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeRequestStatisticCountByEsnBiz1DayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRequestStatisticCountByEsnBiz1DayResponseBody self = new DescribeRequestStatisticCountByEsnBiz1DayResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRequestStatisticCountByEsnBiz1DayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRequestStatisticCountByEsnBiz1DayResponseBody setStatistic(DescribeRequestStatisticCountByEsnBiz1DayResponseBodyStatistic statistic) {
        this.statistic = statistic;
        return this;
    }
    public DescribeRequestStatisticCountByEsnBiz1DayResponseBodyStatistic getStatistic() {
        return this.statistic;
    }

    public DescribeRequestStatisticCountByEsnBiz1DayResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeRequestStatisticCountByEsnBiz1DayResponseBodyStatistic extends TeaModel {
        @NameInMap("FailureCount")
        public Long failureCount;

        @NameInMap("SuccessCount")
        public Long successCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeRequestStatisticCountByEsnBiz1DayResponseBodyStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeRequestStatisticCountByEsnBiz1DayResponseBodyStatistic self = new DescribeRequestStatisticCountByEsnBiz1DayResponseBodyStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeRequestStatisticCountByEsnBiz1DayResponseBodyStatistic setFailureCount(Long failureCount) {
            this.failureCount = failureCount;
            return this;
        }
        public Long getFailureCount() {
            return this.failureCount;
        }

        public DescribeRequestStatisticCountByEsnBiz1DayResponseBodyStatistic setSuccessCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }
        public Long getSuccessCount() {
            return this.successCount;
        }

        public DescribeRequestStatisticCountByEsnBiz1DayResponseBodyStatistic setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
