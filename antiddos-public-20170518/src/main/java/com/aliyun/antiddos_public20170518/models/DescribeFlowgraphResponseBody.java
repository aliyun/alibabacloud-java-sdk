// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeFlowgraphResponseBody extends TeaModel {
    @NameInMap("Flowgraphs")
    public java.util.List<DescribeFlowgraphResponseBodyFlowgraphs> flowgraphs;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeFlowgraphResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowgraphResponseBody self = new DescribeFlowgraphResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlowgraphResponseBody setFlowgraphs(java.util.List<DescribeFlowgraphResponseBodyFlowgraphs> flowgraphs) {
        this.flowgraphs = flowgraphs;
        return this;
    }
    public java.util.List<DescribeFlowgraphResponseBodyFlowgraphs> getFlowgraphs() {
        return this.flowgraphs;
    }

    public DescribeFlowgraphResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeFlowgraphResponseBodyFlowgraphs extends TeaModel {
        @NameInMap("Time")
        public Long time;

        @NameInMap("Bps")
        public Long bps;

        @NameInMap("Pps")
        public Long pps;

        public static DescribeFlowgraphResponseBodyFlowgraphs build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowgraphResponseBodyFlowgraphs self = new DescribeFlowgraphResponseBodyFlowgraphs();
            return TeaModel.build(map, self);
        }

        public DescribeFlowgraphResponseBodyFlowgraphs setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeFlowgraphResponseBodyFlowgraphs setBps(Long bps) {
            this.bps = bps;
            return this;
        }
        public Long getBps() {
            return this.bps;
        }

        public DescribeFlowgraphResponseBodyFlowgraphs setPps(Long pps) {
            this.pps = pps;
            return this;
        }
        public Long getPps() {
            return this.pps;
        }

    }

}
