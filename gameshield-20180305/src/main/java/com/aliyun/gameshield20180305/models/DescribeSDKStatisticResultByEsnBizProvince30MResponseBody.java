// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeSDKStatisticResultByEsnBizProvince30MResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Statistic")
    public java.util.List<DescribeSDKStatisticResultByEsnBizProvince30MResponseBodyStatistic> statistic;

    @NameInMap("Total")
    public Long total;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeSDKStatisticResultByEsnBizProvince30MResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSDKStatisticResultByEsnBizProvince30MResponseBody self = new DescribeSDKStatisticResultByEsnBizProvince30MResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSDKStatisticResultByEsnBizProvince30MResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSDKStatisticResultByEsnBizProvince30MResponseBody setStatistic(java.util.List<DescribeSDKStatisticResultByEsnBizProvince30MResponseBodyStatistic> statistic) {
        this.statistic = statistic;
        return this;
    }
    public java.util.List<DescribeSDKStatisticResultByEsnBizProvince30MResponseBodyStatistic> getStatistic() {
        return this.statistic;
    }

    public DescribeSDKStatisticResultByEsnBizProvince30MResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeSDKStatisticResultByEsnBizProvince30MResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeSDKStatisticResultByEsnBizProvince30MResponseBodyStatistic extends TeaModel {
        @NameInMap("Result")
        public String result;

        @NameInMap("ProvinceId")
        public String provinceId;

        @NameInMap("Count")
        public Long count;

        public static DescribeSDKStatisticResultByEsnBizProvince30MResponseBodyStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeSDKStatisticResultByEsnBizProvince30MResponseBodyStatistic self = new DescribeSDKStatisticResultByEsnBizProvince30MResponseBodyStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeSDKStatisticResultByEsnBizProvince30MResponseBodyStatistic setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public DescribeSDKStatisticResultByEsnBizProvince30MResponseBodyStatistic setProvinceId(String provinceId) {
            this.provinceId = provinceId;
            return this;
        }
        public String getProvinceId() {
            return this.provinceId;
        }

        public DescribeSDKStatisticResultByEsnBizProvince30MResponseBodyStatistic setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

}
