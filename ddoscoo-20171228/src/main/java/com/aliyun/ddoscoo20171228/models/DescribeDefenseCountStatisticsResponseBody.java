// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDefenseCountStatisticsResponseBody extends TeaModel {
    @NameInMap("DefenseCountStatistics")
    public DescribeDefenseCountStatisticsResponseBodyDefenseCountStatistics defenseCountStatistics;

    /**
     * <strong>example:</strong>
     * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDefenseCountStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseCountStatisticsResponseBody self = new DescribeDefenseCountStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseCountStatisticsResponseBody setDefenseCountStatistics(DescribeDefenseCountStatisticsResponseBodyDefenseCountStatistics defenseCountStatistics) {
        this.defenseCountStatistics = defenseCountStatistics;
        return this;
    }
    public DescribeDefenseCountStatisticsResponseBodyDefenseCountStatistics getDefenseCountStatistics() {
        return this.defenseCountStatistics;
    }

    public DescribeDefenseCountStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDefenseCountStatisticsResponseBodyDefenseCountStatistics extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DefenseCountTotalUsageOfCurrentMonth")
        public Integer defenseCountTotalUsageOfCurrentMonth;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("FlowPackCountRemain")
        public Integer flowPackCountRemain;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxUsableDefenseCountCurrentMonth")
        public Integer maxUsableDefenseCountCurrentMonth;

        public static DescribeDefenseCountStatisticsResponseBodyDefenseCountStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeDefenseCountStatisticsResponseBodyDefenseCountStatistics self = new DescribeDefenseCountStatisticsResponseBodyDefenseCountStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeDefenseCountStatisticsResponseBodyDefenseCountStatistics setDefenseCountTotalUsageOfCurrentMonth(Integer defenseCountTotalUsageOfCurrentMonth) {
            this.defenseCountTotalUsageOfCurrentMonth = defenseCountTotalUsageOfCurrentMonth;
            return this;
        }
        public Integer getDefenseCountTotalUsageOfCurrentMonth() {
            return this.defenseCountTotalUsageOfCurrentMonth;
        }

        public DescribeDefenseCountStatisticsResponseBodyDefenseCountStatistics setFlowPackCountRemain(Integer flowPackCountRemain) {
            this.flowPackCountRemain = flowPackCountRemain;
            return this;
        }
        public Integer getFlowPackCountRemain() {
            return this.flowPackCountRemain;
        }

        public DescribeDefenseCountStatisticsResponseBodyDefenseCountStatistics setMaxUsableDefenseCountCurrentMonth(Integer maxUsableDefenseCountCurrentMonth) {
            this.maxUsableDefenseCountCurrentMonth = maxUsableDefenseCountCurrentMonth;
            return this;
        }
        public Integer getMaxUsableDefenseCountCurrentMonth() {
            return this.maxUsableDefenseCountCurrentMonth;
        }

    }

}
