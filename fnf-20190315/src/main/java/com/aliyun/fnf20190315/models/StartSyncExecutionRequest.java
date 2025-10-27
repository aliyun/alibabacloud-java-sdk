// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class StartSyncExecutionRequest extends TeaModel {
    /**
     * <p>The name of the execution that you want to start. The name must meet the following conventions:</p>
     * <ul>
     * <li>The name can contain letters, digits, underscores (_), and hyphens (-).</li>
     * <li>The name must start with a letter or an underscore (_).</li>
     * <li>The name is case-sensitive.</li>
     * <li>The name must be 1 to 128 characters in length.</li>
     * </ul>
     * <p>Different from the StartExecution operation, in the synchronous execution mode, the execution name is no longer required to be unique within a flow. You can choose to provide an execution name to identify the current execution. In this case, the system adds a UUID to the current execution name. The used format is {ExecutionName}:{UUID}. If you do not specify the execution name, the system automatically generates an execution name.</p>
     * 
     * <strong>example:</strong>
     * <p>my_exec_name</p>
     */
    @NameInMap("ExecutionName")
    public String executionName;

    /**
     * <p>The name of the workflow to be executed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_flow_name</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    /**
     * <p>The input of the execution, which is in the JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;value&quot;}</p>
     */
    @NameInMap("Input")
    public String input;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Qualifier")
    public String qualifier;

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

    public StartSyncExecutionRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}
