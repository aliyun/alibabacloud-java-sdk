// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeSDKStatisticResultByEsnBizISP1M30MResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Statistic")
    public java.util.List<DescribeSDKStatisticResultByEsnBizISP1M30MResponseBodyStatistic> statistic;

    @NameInMap("Total")
    public Long total;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeSDKStatisticResultByEsnBizISP1M30MResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSDKStatisticResultByEsnBizISP1M30MResponseBody self = new DescribeSDKStatisticResultByEsnBizISP1M30MResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSDKStatisticResultByEsnBizISP1M30MResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSDKStatisticResultByEsnBizISP1M30MResponseBody setStatistic(java.util.List<DescribeSDKStatisticResultByEsnBizISP1M30MResponseBodyStatistic> statistic) {
        this.statistic = statistic;
        return this;
    }
    public java.util.List<DescribeSDKStatisticResultByEsnBizISP1M30MResponseBodyStatistic> getStatistic() {
        return this.statistic;
    }

    public DescribeSDKStatisticResultByEsnBizISP1M30MResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeSDKStatisticResultByEsnBizISP1M30MResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeSDKStatisticResultByEsnBizISP1M30MResponseBodyStatistic extends TeaModel {
        @NameInMap("Time")
        public Long time;

        @NameInMap("Result")
        public String result;

        @NameInMap("IspId")
        public String ispId;

        @NameInMap("Count")
        public Long count;

        public static DescribeSDKStatisticResultByEsnBizISP1M30MResponseBodyStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeSDKStatisticResultByEsnBizISP1M30MResponseBodyStatistic self = new DescribeSDKStatisticResultByEsnBizISP1M30MResponseBodyStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeSDKStatisticResultByEsnBizISP1M30MResponseBodyStatistic setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeSDKStatisticResultByEsnBizISP1M30MResponseBodyStatistic setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public DescribeSDKStatisticResultByEsnBizISP1M30MResponseBodyStatistic setIspId(String ispId) {
            this.ispId = ispId;
            return this;
        }
        public String getIspId() {
            return this.ispId;
        }

        public DescribeSDKStatisticResultByEsnBizISP1M30MResponseBodyStatistic setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

}
