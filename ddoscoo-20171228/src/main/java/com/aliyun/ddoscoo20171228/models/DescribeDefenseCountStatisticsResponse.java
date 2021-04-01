// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDefenseCountStatisticsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DefenseCountStatistics")
    @Validation(required = true)
    public DescribeDefenseCountStatisticsResponseDefenseCountStatistics defenseCountStatistics;

    public static DescribeDefenseCountStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseCountStatisticsResponse self = new DescribeDefenseCountStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseCountStatisticsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDefenseCountStatisticsResponse setDefenseCountStatistics(DescribeDefenseCountStatisticsResponseDefenseCountStatistics defenseCountStatistics) {
        this.defenseCountStatistics = defenseCountStatistics;
        return this;
    }
    public DescribeDefenseCountStatisticsResponseDefenseCountStatistics getDefenseCountStatistics() {
        return this.defenseCountStatistics;
    }

    public static class DescribeDefenseCountStatisticsResponseDefenseCountStatistics extends TeaModel {
        @NameInMap("DefenseCountTotalUsageOfCurrentMonth")
        @Validation(required = true)
        public Integer defenseCountTotalUsageOfCurrentMonth;

        @NameInMap("FlowPackCountRemain")
        @Validation(required = true)
        public Integer flowPackCountRemain;

        @NameInMap("MaxUsableDefenseCountCurrentMonth")
        @Validation(required = true)
        public Integer maxUsableDefenseCountCurrentMonth;

        public static DescribeDefenseCountStatisticsResponseDefenseCountStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeDefenseCountStatisticsResponseDefenseCountStatistics self = new DescribeDefenseCountStatisticsResponseDefenseCountStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeDefenseCountStatisticsResponseDefenseCountStatistics setDefenseCountTotalUsageOfCurrentMonth(Integer defenseCountTotalUsageOfCurrentMonth) {
            this.defenseCountTotalUsageOfCurrentMonth = defenseCountTotalUsageOfCurrentMonth;
            return this;
        }
        public Integer getDefenseCountTotalUsageOfCurrentMonth() {
            return this.defenseCountTotalUsageOfCurrentMonth;
        }

        public DescribeDefenseCountStatisticsResponseDefenseCountStatistics setFlowPackCountRemain(Integer flowPackCountRemain) {
            this.flowPackCountRemain = flowPackCountRemain;
            return this;
        }
        public Integer getFlowPackCountRemain() {
            return this.flowPackCountRemain;
        }

        public DescribeDefenseCountStatisticsResponseDefenseCountStatistics setMaxUsableDefenseCountCurrentMonth(Integer maxUsableDefenseCountCurrentMonth) {
            this.maxUsableDefenseCountCurrentMonth = maxUsableDefenseCountCurrentMonth;
            return this;
        }
        public Integer getMaxUsableDefenseCountCurrentMonth() {
            return this.maxUsableDefenseCountCurrentMonth;
        }

    }

}
