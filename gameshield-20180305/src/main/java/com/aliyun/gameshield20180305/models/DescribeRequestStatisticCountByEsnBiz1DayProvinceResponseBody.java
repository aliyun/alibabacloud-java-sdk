// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeRequestStatisticCountByEsnBiz1DayProvinceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Statistic")
    public java.util.List<DescribeRequestStatisticCountByEsnBiz1DayProvinceResponseBodyStatistic> statistic;

    @NameInMap("Total")
    public Long total;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeRequestStatisticCountByEsnBiz1DayProvinceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRequestStatisticCountByEsnBiz1DayProvinceResponseBody self = new DescribeRequestStatisticCountByEsnBiz1DayProvinceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRequestStatisticCountByEsnBiz1DayProvinceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRequestStatisticCountByEsnBiz1DayProvinceResponseBody setStatistic(java.util.List<DescribeRequestStatisticCountByEsnBiz1DayProvinceResponseBodyStatistic> statistic) {
        this.statistic = statistic;
        return this;
    }
    public java.util.List<DescribeRequestStatisticCountByEsnBiz1DayProvinceResponseBodyStatistic> getStatistic() {
        return this.statistic;
    }

    public DescribeRequestStatisticCountByEsnBiz1DayProvinceResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeRequestStatisticCountByEsnBiz1DayProvinceResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeRequestStatisticCountByEsnBiz1DayProvinceResponseBodyStatistic extends TeaModel {
        @NameInMap("FailureCount")
        public Long failureCount;

        @NameInMap("ProvinceId")
        public Long provinceId;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("SuccessCount")
        public Long successCount;

        public static DescribeRequestStatisticCountByEsnBiz1DayProvinceResponseBodyStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeRequestStatisticCountByEsnBiz1DayProvinceResponseBodyStatistic self = new DescribeRequestStatisticCountByEsnBiz1DayProvinceResponseBodyStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeRequestStatisticCountByEsnBiz1DayProvinceResponseBodyStatistic setFailureCount(Long failureCount) {
            this.failureCount = failureCount;
            return this;
        }
        public Long getFailureCount() {
            return this.failureCount;
        }

        public DescribeRequestStatisticCountByEsnBiz1DayProvinceResponseBodyStatistic setProvinceId(Long provinceId) {
            this.provinceId = provinceId;
            return this;
        }
        public Long getProvinceId() {
            return this.provinceId;
        }

        public DescribeRequestStatisticCountByEsnBiz1DayProvinceResponseBodyStatistic setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribeRequestStatisticCountByEsnBiz1DayProvinceResponseBodyStatistic setSuccessCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }
        public Long getSuccessCount() {
            return this.successCount;
        }

    }

}
