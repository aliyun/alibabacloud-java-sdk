// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class StopExecutionRequest extends TeaModel {
    /**
     * <p>The reason for stopping the execution. The value must be 1 to 4,096 characters in length.</p>
     */
    @NameInMap("Cause")
    public String cause;

    /**
     * <p>The error for stopping the execution. The value must be 1 to 128 characters in length.</p>
     */
    @NameInMap("Error")
    public String error;

    /**
     * <p>The name of the execution that you want to stop. You can call the **ListExecutions** operation to obtain the value of this parameter. The name is unique in a flow. Set this parameter based on the following rules:</p>
     * <br>
     * <p>*   The name can contain letters, digits, underscores (\_), and hyphens (-).</p>
     * <p>*   The name must start with a letter or an underscore (\_).</p>
     * <p>*   The name is case-sensitive.</p>
     * <p>*   The name must be 1 to 128 characters in length.</p>
     */
    @NameInMap("ExecutionName")
    public String executionName;

    /**
     * <p>The name of the flow in which that you want to stop the execution. You can call the **ListFlows** operation to obtain the value of this parameter. The name is unique within the same region and cannot be modified after the flow is created. Set this parameter based on the following rules:</p>
     * <br>
     * <p>*   The name can contain letters, digits, underscores (\_), and hyphens (-).</p>
     * <p>*   The name must start with a letter or an underscore (\_).</p>
     * <p>*   The name is case-sensitive.</p>
     * <p>*   The name must be 1 to 128 characters in length.</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    public static StopExecutionRequest build(java.util.Map<String, ?> map) throws Exception {
        StopExecutionRequest self = new StopExecutionRequest();
        return TeaModel.build(map, self);
    }

    public StopExecutionRequest setCause(String cause) {
        this.cause = cause;
        return this;
    }
    public String getCause() {
        return this.cause;
    }

    public StopExecutionRequest setError(String error) {
        this.error = error;
        return this;
    }
    public String getError() {
        return this.error;
    }

    public StopExecutionRequest setExecutionName(String executionName) {
        this.executionName = executionName;
        return this;
    }
    public String getExecutionName() {
        return this.executionName;
    }

    public StopExecutionRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

}
