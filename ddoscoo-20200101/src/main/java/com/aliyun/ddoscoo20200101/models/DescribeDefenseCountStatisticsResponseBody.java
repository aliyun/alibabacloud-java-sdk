// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDefenseCountStatisticsResponseBody extends TeaModel {
    /**
     * <p>The statistics on the number of advanced mitigation sessions.</p>
     */
    @NameInMap("DefenseCountStatistics")
    public DescribeDefenseCountStatisticsResponseBodyDefenseCountStatistics defenseCountStatistics;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>310A41FD-0990-5610-92E0-A6A55D7C6444</p>
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
         * <p>The number of advanced mitigation sessions that are used within the current calendar month.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DefenseCountTotalUsageOfCurrentMonth")
        public Integer defenseCountTotalUsageOfCurrentMonth;

        /**
         * <p>The number of available global advanced mitigation sessions for the Insurance mitigation plan.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FlowPackCountRemain")
        public Integer flowPackCountRemain;

        /**
         * <p>The maximum number of advanced mitigation sessions available for the current calendar month. The advanced mitigation sessions include the advanced mitigation sessions that are provided free of charge and the global advanced mitigation sessions that you purchase.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxUsableDefenseCountCurrentMonth")
        public Integer maxUsableDefenseCountCurrentMonth;

        /**
         * <p>The number of available global advanced mitigation sessions for the Secure Chinese Mainland Acceleration (Sec-CMA) mitigation plan.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SecHighSpeedCountRemain")
        public Integer secHighSpeedCountRemain;

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

        public DescribeDefenseCountStatisticsResponseBodyDefenseCountStatistics setSecHighSpeedCountRemain(Integer secHighSpeedCountRemain) {
            this.secHighSpeedCountRemain = secHighSpeedCountRemain;
            return this;
        }
        public Integer getSecHighSpeedCountRemain() {
            return this.secHighSpeedCountRemain;
        }

    }

}
