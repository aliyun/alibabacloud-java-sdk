// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeFlexibleProtectionFlowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Flows")
    public java.util.List<DescribeFlexibleProtectionFlowResponseBodyFlows> flows;

    public static DescribeFlexibleProtectionFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlexibleProtectionFlowResponseBody self = new DescribeFlexibleProtectionFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlexibleProtectionFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlexibleProtectionFlowResponseBody setFlows(java.util.List<DescribeFlexibleProtectionFlowResponseBodyFlows> flows) {
        this.flows = flows;
        return this;
    }
    public java.util.List<DescribeFlexibleProtectionFlowResponseBodyFlows> getFlows() {
        return this.flows;
    }

    public static class DescribeFlexibleProtectionFlowResponseBodyFlows extends TeaModel {
        @NameInMap("UsedFlow")
        public Float usedFlow;

        @NameInMap("Time")
        public Long time;

        @NameInMap("AddFlow")
        public Float addFlow;

        @NameInMap("UseableFlow")
        public Float useableFlow;

        public static DescribeFlexibleProtectionFlowResponseBodyFlows build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlexibleProtectionFlowResponseBodyFlows self = new DescribeFlexibleProtectionFlowResponseBodyFlows();
            return TeaModel.build(map, self);
        }

        public DescribeFlexibleProtectionFlowResponseBodyFlows setUsedFlow(Float usedFlow) {
            this.usedFlow = usedFlow;
            return this;
        }
        public Float getUsedFlow() {
            return this.usedFlow;
        }

        public DescribeFlexibleProtectionFlowResponseBodyFlows setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeFlexibleProtectionFlowResponseBodyFlows setAddFlow(Float addFlow) {
            this.addFlow = addFlow;
            return this;
        }
        public Float getAddFlow() {
            return this.addFlow;
        }

        public DescribeFlexibleProtectionFlowResponseBodyFlows setUseableFlow(Float useableFlow) {
            this.useableFlow = useableFlow;
            return this;
        }
        public Float getUseableFlow() {
            return this.useableFlow;
        }

    }

}
