// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class StartExecutionRequest extends TeaModel {
    /**
     * <p>Specifies that the <strong>TaskToken</strong>-related tasks are called back after the execution in the flow ends.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("CallbackFnFTaskToken")
    public String callbackFnFTaskToken;

    /**
     * <p>The name of the execution. The execution name is unique within a workflow. Configure this parameter based on the following rules:</p>
     * <ul>
     * <li>The name must start with a letter or an underscore (_).</li>
     * <li>The name can contain letters, digits, underscores (_), and hyphens (-).</li>
     * <li>The name is case-sensitive.</li>
     * <li>The name must be 1 to 128 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>exec</p>
     */
    @NameInMap("ExecutionName")
    public String executionName;

    /**
     * <p>The name of the workflow to be executed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>flow</p>
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

    public static StartExecutionRequest build(java.util.Map<String, ?> map) throws Exception {
        StartExecutionRequest self = new StartExecutionRequest();
        return TeaModel.build(map, self);
    }

    public StartExecutionRequest setCallbackFnFTaskToken(String callbackFnFTaskToken) {
        this.callbackFnFTaskToken = callbackFnFTaskToken;
        return this;
    }
    public String getCallbackFnFTaskToken() {
        return this.callbackFnFTaskToken;
    }

    public StartExecutionRequest setExecutionName(String executionName) {
        this.executionName = executionName;
        return this;
    }
    public String getExecutionName() {
        return this.executionName;
    }

    public StartExecutionRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public StartExecutionRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public StartExecutionRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}
