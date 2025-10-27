// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class StopExecutionRequest extends TeaModel {
    /**
     * <p>The reason for stopping the execution. The value must be 1 to 4,096 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>for test</p>
     */
    @NameInMap("Cause")
    public String cause;

    /**
     * <p>The error code for stopping the execution. The error code must be 1 to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>nill</p>
     */
    @NameInMap("Error")
    public String error;

    /**
     * <p>The name of the execution to be stopped. You can call the <strong>ListExecutions</strong> operation to obtain the value of this parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exec</p>
     */
    @NameInMap("ExecutionName")
    public String executionName;

    /**
     * <p>The name of the workflow to be stopped. You can call the <strong>ListFlows</strong> operation to obtain the value of this parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>flow</p>
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
