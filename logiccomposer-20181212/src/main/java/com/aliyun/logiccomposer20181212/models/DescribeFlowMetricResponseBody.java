// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class DescribeFlowMetricResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InvocationCount")
    public Long invocationCount;

    @NameInMap("InvocationErrorCount")
    public Long invocationErrorCount;

    @NameInMap("ErrorRate")
    public Float errorRate;

    @NameInMap("CostAverage")
    public Long costAverage;

    public static DescribeFlowMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowMetricResponseBody self = new DescribeFlowMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlowMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlowMetricResponseBody setInvocationCount(Long invocationCount) {
        this.invocationCount = invocationCount;
        return this;
    }
    public Long getInvocationCount() {
        return this.invocationCount;
    }

    public DescribeFlowMetricResponseBody setInvocationErrorCount(Long invocationErrorCount) {
        this.invocationErrorCount = invocationErrorCount;
        return this;
    }
    public Long getInvocationErrorCount() {
        return this.invocationErrorCount;
    }

    public DescribeFlowMetricResponseBody setErrorRate(Float errorRate) {
        this.errorRate = errorRate;
        return this;
    }
    public Float getErrorRate() {
        return this.errorRate;
    }

    public DescribeFlowMetricResponseBody setCostAverage(Long costAverage) {
        this.costAverage = costAverage;
        return this;
    }
    public Long getCostAverage() {
        return this.costAverage;
    }

}
