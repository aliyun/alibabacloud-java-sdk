// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeSDKStatisticResultByEsnBizISPIntervalResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Statistic")
    public java.util.List<DescribeSDKStatisticResultByEsnBizISPIntervalResponseBodyStatistic> statistic;

    @NameInMap("Total")
    public Long total;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeSDKStatisticResultByEsnBizISPIntervalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSDKStatisticResultByEsnBizISPIntervalResponseBody self = new DescribeSDKStatisticResultByEsnBizISPIntervalResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSDKStatisticResultByEsnBizISPIntervalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSDKStatisticResultByEsnBizISPIntervalResponseBody setStatistic(java.util.List<DescribeSDKStatisticResultByEsnBizISPIntervalResponseBodyStatistic> statistic) {
        this.statistic = statistic;
        return this;
    }
    public java.util.List<DescribeSDKStatisticResultByEsnBizISPIntervalResponseBodyStatistic> getStatistic() {
        return this.statistic;
    }

    public DescribeSDKStatisticResultByEsnBizISPIntervalResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeSDKStatisticResultByEsnBizISPIntervalResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeSDKStatisticResultByEsnBizISPIntervalResponseBodyStatistic extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("Time")
        public Long time;

        @NameInMap("Result")
        public String result;

        @NameInMap("IspId")
        public String ispId;

        @NameInMap("Count")
        public Long count;

        public static DescribeSDKStatisticResultByEsnBizISPIntervalResponseBodyStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeSDKStatisticResultByEsnBizISPIntervalResponseBodyStatistic self = new DescribeSDKStatisticResultByEsnBizISPIntervalResponseBodyStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeSDKStatisticResultByEsnBizISPIntervalResponseBodyStatistic setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public DescribeSDKStatisticResultByEsnBizISPIntervalResponseBodyStatistic setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeSDKStatisticResultByEsnBizISPIntervalResponseBodyStatistic setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public DescribeSDKStatisticResultByEsnBizISPIntervalResponseBodyStatistic setIspId(String ispId) {
            this.ispId = ispId;
            return this;
        }
        public String getIspId() {
            return this.ispId;
        }

        public DescribeSDKStatisticResultByEsnBizISPIntervalResponseBodyStatistic setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

}
