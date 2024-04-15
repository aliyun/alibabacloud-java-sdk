// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeFlowStatisticResponseBody extends TeaModel {
    /**
     * <p>The number of available cloud computers in the office network.</p>
     */
    @NameInMap("DesktopCount")
    public Integer desktopCount;

    /**
     * <p>The traffic statistics.</p>
     */
    @NameInMap("DesktopFlowStatistic")
    public java.util.List<DescribeFlowStatisticResponseBodyDesktopFlowStatistic> desktopFlowStatistic;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeFlowStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowStatisticResponseBody self = new DescribeFlowStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlowStatisticResponseBody setDesktopCount(Integer desktopCount) {
        this.desktopCount = desktopCount;
        return this;
    }
    public Integer getDesktopCount() {
        return this.desktopCount;
    }

    public DescribeFlowStatisticResponseBody setDesktopFlowStatistic(java.util.List<DescribeFlowStatisticResponseBodyDesktopFlowStatistic> desktopFlowStatistic) {
        this.desktopFlowStatistic = desktopFlowStatistic;
        return this;
    }
    public java.util.List<DescribeFlowStatisticResponseBodyDesktopFlowStatistic> getDesktopFlowStatistic() {
        return this.desktopFlowStatistic;
    }

    public DescribeFlowStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeFlowStatisticResponseBodyDesktopFlowStatistic extends TeaModel {
        /**
         * <p>The ID of the cloud computer.</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The name of the cloud computer.</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <p>The traffic amount. Unit: KB.</p>
         */
        @NameInMap("FlowIn")
        public String flowIn;

        /**
         * <p>The traffic ranking.</p>
         */
        @NameInMap("FlowRank")
        public Integer flowRank;

        public static DescribeFlowStatisticResponseBodyDesktopFlowStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowStatisticResponseBodyDesktopFlowStatistic self = new DescribeFlowStatisticResponseBodyDesktopFlowStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeFlowStatisticResponseBodyDesktopFlowStatistic setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeFlowStatisticResponseBodyDesktopFlowStatistic setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public DescribeFlowStatisticResponseBodyDesktopFlowStatistic setFlowIn(String flowIn) {
            this.flowIn = flowIn;
            return this;
        }
        public String getFlowIn() {
            return this.flowIn;
        }

        public DescribeFlowStatisticResponseBodyDesktopFlowStatistic setFlowRank(Integer flowRank) {
            this.flowRank = flowRank;
            return this;
        }
        public Integer getFlowRank() {
            return this.flowRank;
        }

    }

}
