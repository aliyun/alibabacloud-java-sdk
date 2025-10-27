// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class DescribeExecutionRequest extends TeaModel {
    /**
     * <p>The name of the execution.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exec</p>
     */
    @NameInMap("ExecutionName")
    public String executionName;

    /**
     * <p>The name of the workflow.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>flow</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    /**
     * <p>The maximum period of time for long polling waits. Valid values: 0 to 60. Unit: seconds. Configure this parameter based on the following rules:</p>
     * <ul>
     * <li>If the value is 0, the system immediately returns the current execution status.</li>
     * <li>If the value is greater than 0, the long polling request waits until the execution ends or the specified period elapses.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
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
