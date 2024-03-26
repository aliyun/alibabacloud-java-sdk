// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class StartSyncExecutionRequest extends TeaModel {
    /**
     * <p>The name of the execution that you want to start. The name must meet the following conventions:</p>
     * <br>
     * <p>*   The name can contain letters, digits, underscores (\_), and hyphens (-).</p>
     * <p>*   The name must start with a letter or an underscore (\_).</p>
     * <p>*   The name is case-sensitive.</p>
     * <p>*   The name must be 1 to 128 characters in length.</p>
     * <br>
     * <p>Different from the StartExecution operation, in the synchronous execution mode, the execution name is no longer required to be unique within a flow. You can choose to provide an execution name to identify the current execution. In this case, the system adds a UUID to the current execution name. The used format is {ExecutionName}:{UUID}. If you do not specify the execution name, the system automatically generates an execution name.</p>
     */
    @NameInMap("ExecutionName")
    public String executionName;

    /**
     * <p>The name of the flow in which you want to start the execution. The name is unique within the same region and cannot be modified after the flow is created. Set this parameter based on the following rules:</p>
     * <br>
     * <p>*   The name can contain letters, digits, underscores (\_), and hyphens (-).</p>
     * <p>*   The name must start with a letter or an underscore (\_).</p>
     * <p>*   The name is case-sensitive.</p>
     * <p>*   The name must be 1 to 128 characters in length.</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    /**
     * <p>The input of the execution, which is in the JSON format.</p>
     */
    @NameInMap("Input")
    public String input;

    public static StartSyncExecutionRequest build(java.util.Map<String, ?> map) throws Exception {
        StartSyncExecutionRequest self = new StartSyncExecutionRequest();
        return TeaModel.build(map, self);
    }

    public StartSyncExecutionRequest setExecutionName(String executionName) {
        this.executionName = executionName;
        return this;
    }
    public String getExecutionName() {
        return this.executionName;
    }

    public StartSyncExecutionRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public StartSyncExecutionRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

}
