// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeRequestStatisticByEsnBizIntervalResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Statistic")
    public java.util.List<DescribeRequestStatisticByEsnBizIntervalResponseBodyStatistic> statistic;

    @NameInMap("Total")
    public Long total;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeRequestStatisticByEsnBizIntervalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRequestStatisticByEsnBizIntervalResponseBody self = new DescribeRequestStatisticByEsnBizIntervalResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRequestStatisticByEsnBizIntervalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRequestStatisticByEsnBizIntervalResponseBody setStatistic(java.util.List<DescribeRequestStatisticByEsnBizIntervalResponseBodyStatistic> statistic) {
        this.statistic = statistic;
        return this;
    }
    public java.util.List<DescribeRequestStatisticByEsnBizIntervalResponseBodyStatistic> getStatistic() {
        return this.statistic;
    }

    public DescribeRequestStatisticByEsnBizIntervalResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeRequestStatisticByEsnBizIntervalResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeRequestStatisticByEsnBizIntervalResponseBodyStatistic extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("Time")
        public Long time;

        @NameInMap("FailureCount")
        public Long failureCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("SuccessCount")
        public Long successCount;

        public static DescribeRequestStatisticByEsnBizIntervalResponseBodyStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeRequestStatisticByEsnBizIntervalResponseBodyStatistic self = new DescribeRequestStatisticByEsnBizIntervalResponseBodyStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeRequestStatisticByEsnBizIntervalResponseBodyStatistic setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public DescribeRequestStatisticByEsnBizIntervalResponseBodyStatistic setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeRequestStatisticByEsnBizIntervalResponseBodyStatistic setFailureCount(Long failureCount) {
            this.failureCount = failureCount;
            return this;
        }
        public Long getFailureCount() {
            return this.failureCount;
        }

        public DescribeRequestStatisticByEsnBizIntervalResponseBodyStatistic setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribeRequestStatisticByEsnBizIntervalResponseBodyStatistic setSuccessCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }
        public Long getSuccessCount() {
            return this.successCount;
        }

    }

}
