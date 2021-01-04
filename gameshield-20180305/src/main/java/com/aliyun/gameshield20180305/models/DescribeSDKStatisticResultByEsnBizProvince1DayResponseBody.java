// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeSDKStatisticResultByEsnBizProvince1DayResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Statistic")
    public java.util.List<DescribeSDKStatisticResultByEsnBizProvince1DayResponseBodyStatistic> statistic;

    @NameInMap("Total")
    public Long total;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeSDKStatisticResultByEsnBizProvince1DayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSDKStatisticResultByEsnBizProvince1DayResponseBody self = new DescribeSDKStatisticResultByEsnBizProvince1DayResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSDKStatisticResultByEsnBizProvince1DayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSDKStatisticResultByEsnBizProvince1DayResponseBody setStatistic(java.util.List<DescribeSDKStatisticResultByEsnBizProvince1DayResponseBodyStatistic> statistic) {
        this.statistic = statistic;
        return this;
    }
    public java.util.List<DescribeSDKStatisticResultByEsnBizProvince1DayResponseBodyStatistic> getStatistic() {
        return this.statistic;
    }

    public DescribeSDKStatisticResultByEsnBizProvince1DayResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeSDKStatisticResultByEsnBizProvince1DayResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeSDKStatisticResultByEsnBizProvince1DayResponseBodyStatistic extends TeaModel {
        @NameInMap("Result")
        public String result;

        @NameInMap("ProvinceId")
        public String provinceId;

        @NameInMap("Count")
        public Long count;

        public static DescribeSDKStatisticResultByEsnBizProvince1DayResponseBodyStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeSDKStatisticResultByEsnBizProvince1DayResponseBodyStatistic self = new DescribeSDKStatisticResultByEsnBizProvince1DayResponseBodyStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeSDKStatisticResultByEsnBizProvince1DayResponseBodyStatistic setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public DescribeSDKStatisticResultByEsnBizProvince1DayResponseBodyStatistic setProvinceId(String provinceId) {
            this.provinceId = provinceId;
            return this;
        }
        public String getProvinceId() {
            return this.provinceId;
        }

        public DescribeSDKStatisticResultByEsnBizProvince1DayResponseBodyStatistic setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

}
