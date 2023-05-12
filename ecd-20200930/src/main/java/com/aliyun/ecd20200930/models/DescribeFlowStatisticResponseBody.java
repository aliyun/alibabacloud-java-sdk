// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeFlowStatisticResponseBody extends TeaModel {
    @NameInMap("DesktopCount")
    public Integer desktopCount;

    @NameInMap("DesktopFlowStatistic")
    public java.util.List<DescribeFlowStatisticResponseBodyDesktopFlowStatistic> desktopFlowStatistic;

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
        @NameInMap("DesktopId")
        public String desktopId;

        @NameInMap("DesktopName")
        public String desktopName;

        @NameInMap("FlowIn")
        public String flowIn;

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
