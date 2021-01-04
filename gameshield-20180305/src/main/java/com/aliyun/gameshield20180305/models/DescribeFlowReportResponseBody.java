// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeFlowReportResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FlowReport")
    public java.util.List<DescribeFlowReportResponseBodyFlowReport> flowReport;

    public static DescribeFlowReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowReportResponseBody self = new DescribeFlowReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlowReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlowReportResponseBody setFlowReport(java.util.List<DescribeFlowReportResponseBodyFlowReport> flowReport) {
        this.flowReport = flowReport;
        return this;
    }
    public java.util.List<DescribeFlowReportResponseBodyFlowReport> getFlowReport() {
        return this.flowReport;
    }

    public static class DescribeFlowReportResponseBodyFlowReport extends TeaModel {
        @NameInMap("Index")
        public Long index;

        @NameInMap("ActConns")
        public Long actConns;

        @NameInMap("InactConns")
        public Long inactConns;

        @NameInMap("InBps")
        public Long inBps;

        @NameInMap("OutBps")
        public Long outBps;

        public static DescribeFlowReportResponseBodyFlowReport build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowReportResponseBodyFlowReport self = new DescribeFlowReportResponseBodyFlowReport();
            return TeaModel.build(map, self);
        }

        public DescribeFlowReportResponseBodyFlowReport setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public DescribeFlowReportResponseBodyFlowReport setActConns(Long actConns) {
            this.actConns = actConns;
            return this;
        }
        public Long getActConns() {
            return this.actConns;
        }

        public DescribeFlowReportResponseBodyFlowReport setInactConns(Long inactConns) {
            this.inactConns = inactConns;
            return this;
        }
        public Long getInactConns() {
            return this.inactConns;
        }

        public DescribeFlowReportResponseBodyFlowReport setInBps(Long inBps) {
            this.inBps = inBps;
            return this;
        }
        public Long getInBps() {
            return this.inBps;
        }

        public DescribeFlowReportResponseBodyFlowReport setOutBps(Long outBps) {
            this.outBps = outBps;
            return this;
        }
        public Long getOutBps() {
            return this.outBps;
        }

    }

}
