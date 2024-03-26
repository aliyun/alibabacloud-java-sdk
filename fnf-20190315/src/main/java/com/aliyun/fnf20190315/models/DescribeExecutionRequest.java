// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class DescribeExecutionRequest extends TeaModel {
    /**
     * <p>The name of the execution, which is unique within a flow. Set this parameter based on the following rules:</p>
     * <br>
     * <p>*   The name can contain letters, digits, underscores (\_), and hyphens (-).</p>
     * <p>*   The name must start with a letter or an underscore (\_).</p>
     * <p>*   The name is case-sensitive.</p>
     * <p>*   The name must be 1 to 128 characters in length.</p>
     */
    @NameInMap("ExecutionName")
    public String executionName;

    /**
     * <p>The name of the flow. The name is unique within the region and cannot be modified after the flow is created. Set this parameter based on the following rules:</p>
     * <br>
     * <p>*   The name can contain letters, digits, underscores (\_), and hyphens (-).</p>
     * <p>*   The name must start with a letter or an underscore (\_).</p>
     * <p>*   The name is case-sensitive.</p>
     * <p>*   The name must be 1 to 128 characters in length.</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    /**
     * <p>The maximum period of time for long polling waits. Valid values: 0 to 60. Unit: seconds. Configure this parameter based on the following rules:</p>
     * <br>
     * <p>*   If the value is 0, the system immediately returns the current execution status.</p>
     * <p>*   If the value is greater than 0, the long polling request waits until the execution ends or the specified period elapses.</p>
     */
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

    public DescribeExecutionRequest setWaitTimeSeconds(Integer waitTimeSeconds) {
        this.waitTimeSeconds = waitTimeSeconds;
        return this;
    }
    public Integer getWaitTimeSeconds() {
        return this.waitTimeSeconds;
    }

}
