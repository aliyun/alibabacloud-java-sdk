// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class DescribeExecutionRequest extends TeaModel {
    @NameInMap("ExecutionName")
    public String executionName;

    @NameInMap("FlowName")
    public String flowName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WaitTimeSeconds")
    public Integer waitTimeSeconds;

    public static DescribeExecutionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExecutionRequest self = new DescribeExecutionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExecutionRequest setExecutionName(String executionName) {
        this.executionName = executionName;
        return this;
    }
    public String getExecutionName() {
        return this.executionName;
    }

    public DescribeExecutionRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public DescribeExecutionRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExecutionRequest setWaitTimeSeconds(Integer waitTimeSeconds) {
        this.waitTimeSeconds = waitTimeSeconds;
        return this;
    }
    public Integer getWaitTimeSeconds() {
        return this.waitTimeSeconds;
    }

}
