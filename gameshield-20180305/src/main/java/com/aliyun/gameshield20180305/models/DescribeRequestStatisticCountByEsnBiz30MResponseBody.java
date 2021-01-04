// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeRequestStatisticCountByEsnBiz30MResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Statistic")
    public DescribeRequestStatisticCountByEsnBiz30MResponseBodyStatistic statistic;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeRequestStatisticCountByEsnBiz30MResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRequestStatisticCountByEsnBiz30MResponseBody self = new DescribeRequestStatisticCountByEsnBiz30MResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRequestStatisticCountByEsnBiz30MResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRequestStatisticCountByEsnBiz30MResponseBody setStatistic(DescribeRequestStatisticCountByEsnBiz30MResponseBodyStatistic statistic) {
        this.statistic = statistic;
        return this;
    }
    public DescribeRequestStatisticCountByEsnBiz30MResponseBodyStatistic getStatistic() {
        return this.statistic;
    }

    public DescribeRequestStatisticCountByEsnBiz30MResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeRequestStatisticCountByEsnBiz30MResponseBodyStatistic extends TeaModel {
        @NameInMap("FailureCount")
        public Long failureCount;

        @NameInMap("SuccessCount")
        public Long successCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeRequestStatisticCountByEsnBiz30MResponseBodyStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeRequestStatisticCountByEsnBiz30MResponseBodyStatistic self = new DescribeRequestStatisticCountByEsnBiz30MResponseBodyStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeRequestStatisticCountByEsnBiz30MResponseBodyStatistic setFailureCount(Long failureCount) {
            this.failureCount = failureCount;
            return this;
        }
        public Long getFailureCount() {
            return this.failureCount;
        }

        public DescribeRequestStatisticCountByEsnBiz30MResponseBodyStatistic setSuccessCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }
        public Long getSuccessCount() {
            return this.successCount;
        }

        public DescribeRequestStatisticCountByEsnBiz30MResponseBodyStatistic setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
