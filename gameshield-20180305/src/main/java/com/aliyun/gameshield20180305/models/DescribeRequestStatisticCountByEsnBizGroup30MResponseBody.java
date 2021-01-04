// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeRequestStatisticCountByEsnBizGroup30MResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Statistic")
    public java.util.List<DescribeRequestStatisticCountByEsnBizGroup30MResponseBodyStatistic> statistic;

    @NameInMap("Total")
    public Long total;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeRequestStatisticCountByEsnBizGroup30MResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRequestStatisticCountByEsnBizGroup30MResponseBody self = new DescribeRequestStatisticCountByEsnBizGroup30MResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRequestStatisticCountByEsnBizGroup30MResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRequestStatisticCountByEsnBizGroup30MResponseBody setStatistic(java.util.List<DescribeRequestStatisticCountByEsnBizGroup30MResponseBodyStatistic> statistic) {
        this.statistic = statistic;
        return this;
    }
    public java.util.List<DescribeRequestStatisticCountByEsnBizGroup30MResponseBodyStatistic> getStatistic() {
        return this.statistic;
    }

    public DescribeRequestStatisticCountByEsnBizGroup30MResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeRequestStatisticCountByEsnBizGroup30MResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeRequestStatisticCountByEsnBizGroup30MResponseBodyStatistic extends TeaModel {
        @NameInMap("DetectIp")
        public String detectIp;

        @NameInMap("EsnGroupId")
        public String esnGroupId;

        @NameInMap("Count")
        public Long count;

        public static DescribeRequestStatisticCountByEsnBizGroup30MResponseBodyStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeRequestStatisticCountByEsnBizGroup30MResponseBodyStatistic self = new DescribeRequestStatisticCountByEsnBizGroup30MResponseBodyStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeRequestStatisticCountByEsnBizGroup30MResponseBodyStatistic setDetectIp(String detectIp) {
            this.detectIp = detectIp;
            return this;
        }
        public String getDetectIp() {
            return this.detectIp;
        }

        public DescribeRequestStatisticCountByEsnBizGroup30MResponseBodyStatistic setEsnGroupId(String esnGroupId) {
            this.esnGroupId = esnGroupId;
            return this;
        }
        public String getEsnGroupId() {
            return this.esnGroupId;
        }

        public DescribeRequestStatisticCountByEsnBizGroup30MResponseBodyStatistic setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

}
