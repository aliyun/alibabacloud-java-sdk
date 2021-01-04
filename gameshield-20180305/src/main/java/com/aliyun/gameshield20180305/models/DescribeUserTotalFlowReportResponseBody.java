// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeUserTotalFlowReportResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    @NameInMap("FlowReport")
    public DescribeUserTotalFlowReportResponseBodyFlowReport flowReport;

    public static DescribeUserTotalFlowReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserTotalFlowReportResponseBody self = new DescribeUserTotalFlowReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserTotalFlowReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserTotalFlowReportResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public DescribeUserTotalFlowReportResponseBody setFlowReport(DescribeUserTotalFlowReportResponseBodyFlowReport flowReport) {
        this.flowReport = flowReport;
        return this;
    }
    public DescribeUserTotalFlowReportResponseBodyFlowReport getFlowReport() {
        return this.flowReport;
    }

    public static class DescribeUserTotalFlowReportResponseBodyFlowReport extends TeaModel {
        @NameInMap("Time")
        public java.util.List<String> time;

        @NameInMap("MaxInflow")
        public java.util.List<String> maxInflow;

        @NameInMap("AttackFlow")
        public java.util.List<String> attackFlow;

        @NameInMap("MaxOutFlow")
        public java.util.List<String> maxOutFlow;

        public static DescribeUserTotalFlowReportResponseBodyFlowReport build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserTotalFlowReportResponseBodyFlowReport self = new DescribeUserTotalFlowReportResponseBodyFlowReport();
            return TeaModel.build(map, self);
        }

        public DescribeUserTotalFlowReportResponseBodyFlowReport setTime(java.util.List<String> time) {
            this.time = time;
            return this;
        }
        public java.util.List<String> getTime() {
            return this.time;
        }

        public DescribeUserTotalFlowReportResponseBodyFlowReport setMaxInflow(java.util.List<String> maxInflow) {
            this.maxInflow = maxInflow;
            return this;
        }
        public java.util.List<String> getMaxInflow() {
            return this.maxInflow;
        }

        public DescribeUserTotalFlowReportResponseBodyFlowReport setAttackFlow(java.util.List<String> attackFlow) {
            this.attackFlow = attackFlow;
            return this;
        }
        public java.util.List<String> getAttackFlow() {
            return this.attackFlow;
        }

        public DescribeUserTotalFlowReportResponseBodyFlowReport setMaxOutFlow(java.util.List<String> maxOutFlow) {
            this.maxOutFlow = maxOutFlow;
            return this;
        }
        public java.util.List<String> getMaxOutFlow() {
            return this.maxOutFlow;
        }

    }

}
