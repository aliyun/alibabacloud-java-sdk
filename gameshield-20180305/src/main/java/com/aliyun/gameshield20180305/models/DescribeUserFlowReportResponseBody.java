// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeUserFlowReportResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    @NameInMap("FlowReport")
    public DescribeUserFlowReportResponseBodyFlowReport flowReport;

    public static DescribeUserFlowReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserFlowReportResponseBody self = new DescribeUserFlowReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserFlowReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserFlowReportResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public DescribeUserFlowReportResponseBody setFlowReport(DescribeUserFlowReportResponseBodyFlowReport flowReport) {
        this.flowReport = flowReport;
        return this;
    }
    public DescribeUserFlowReportResponseBodyFlowReport getFlowReport() {
        return this.flowReport;
    }

    public static class DescribeUserFlowReportResponseBodyFlowReport extends TeaModel {
        @NameInMap("Time")
        public java.util.List<String> time;

        @NameInMap("MaxInflow")
        public java.util.List<String> maxInflow;

        @NameInMap("AttackFlow")
        public java.util.List<String> attackFlow;

        @NameInMap("MaxOutFlow")
        public java.util.List<String> maxOutFlow;

        public static DescribeUserFlowReportResponseBodyFlowReport build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserFlowReportResponseBodyFlowReport self = new DescribeUserFlowReportResponseBodyFlowReport();
            return TeaModel.build(map, self);
        }

        public DescribeUserFlowReportResponseBodyFlowReport setTime(java.util.List<String> time) {
            this.time = time;
            return this;
        }
        public java.util.List<String> getTime() {
            return this.time;
        }

        public DescribeUserFlowReportResponseBodyFlowReport setMaxInflow(java.util.List<String> maxInflow) {
            this.maxInflow = maxInflow;
            return this;
        }
        public java.util.List<String> getMaxInflow() {
            return this.maxInflow;
        }

        public DescribeUserFlowReportResponseBodyFlowReport setAttackFlow(java.util.List<String> attackFlow) {
            this.attackFlow = attackFlow;
            return this;
        }
        public java.util.List<String> getAttackFlow() {
            return this.attackFlow;
        }

        public DescribeUserFlowReportResponseBodyFlowReport setMaxOutFlow(java.util.List<String> maxOutFlow) {
            this.maxOutFlow = maxOutFlow;
            return this;
        }
        public java.util.List<String> getMaxOutFlow() {
            return this.maxOutFlow;
        }

    }

}
