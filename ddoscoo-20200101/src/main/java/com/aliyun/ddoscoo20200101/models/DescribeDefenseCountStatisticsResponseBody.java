// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDefenseCountStatisticsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DefenseCountStatistics")
    public DescribeDefenseCountStatisticsResponseBodyDefenseCountStatistics defenseCountStatistics;

    public static DescribeDefenseCountStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseCountStatisticsResponseBody self = new DescribeDefenseCountStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseCountStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDefenseCountStatisticsResponseBody setDefenseCountStatistics(DescribeDefenseCountStatisticsResponseBodyDefenseCountStatistics defenseCountStatistics) {
        this.defenseCountStatistics = defenseCountStatistics;
        return this;
    }
    public DescribeDefenseCountStatisticsResponseBodyDefenseCountStatistics getDefenseCountStatistics() {
        return this.defenseCountStatistics;
    }

    public static class DescribeDefenseCountStatisticsResponseBodyDefenseCountStatistics extends TeaModel {
        @NameInMap("MaxUsableDefenseCountCurrentMonth")
        public Integer maxUsableDefenseCountCurrentMonth;

        @NameInMap("FlowPackCountRemain")
        public Integer flowPackCountRemain;

        @NameInMap("DefenseCountTotalUsageOfCurrentMonth")
        public Integer defenseCountTotalUsageOfCurrentMonth;

        public static DescribeDefenseCountStatisticsResponseBodyDefenseCountStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeDefenseCountStatisticsResponseBodyDefenseCountStatistics self = new DescribeDefenseCountStatisticsResponseBodyDefenseCountStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeDefenseCountStatisticsResponseBodyDefenseCountStatistics setMaxUsableDefenseCountCurrentMonth(Integer maxUsableDefenseCountCurrentMonth) {
            this.maxUsableDefenseCountCurrentMonth = maxUsableDefenseCountCurrentMonth;
            return this;
        }
        public Integer getMaxUsableDefenseCountCurrentMonth() {
            return this.maxUsableDefenseCountCurrentMonth;
        }

        public DescribeDefenseCountStatisticsResponseBodyDefenseCountStatistics setFlowPackCountRemain(Integer flowPackCountRemain) {
            this.flowPackCountRemain = flowPackCountRemain;
            return this;
        }
        public Integer getFlowPackCountRemain() {
            return this.flowPackCountRemain;
        }

        public DescribeDefenseCountStatisticsResponseBodyDefenseCountStatistics setDefenseCountTotalUsageOfCurrentMonth(Integer defenseCountTotalUsageOfCurrentMonth) {
            this.defenseCountTotalUsageOfCurrentMonth = defenseCountTotalUsageOfCurrentMonth;
            return this;
        }
        public Integer getDefenseCountTotalUsageOfCurrentMonth() {
            return this.defenseCountTotalUsageOfCurrentMonth;
        }

    }

}
