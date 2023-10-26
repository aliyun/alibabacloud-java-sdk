// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class StartExecutionRequest extends TeaModel {
    /**
     * <p>Specifies that the **TaskToken**-related tasks are called back after the execution in the flow ends.</p>
     */
    @NameInMap("CallbackFnFTaskToken")
    public String callbackFnFTaskToken;

    /**
     * <p>The name of the execution, which is unique within a flow. Configure this parameter based on the following rules:</p>
     * <br>
     * <p>*   The name can contain letters, digits, underscores (\_), and hyphens (-).</p>
     * <p>*   The name must start with a letter or an underscore (\_).</p>
     * <p>*   The name is case-sensitive.</p>
     * <p>*   The name must be 1 to 128 characters in length.</p>
     */
    @NameInMap("ExecutionName")
    public String executionName;

    /**
     * <p>The name of the flow you want to start to execute. The name is unique within the region and cannot be modified after the flow is created. Configure this parameter based on the following rules:</p>
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

    /**
     * <p>The request ID. If you specify this parameter, the system uses this value as the ID of the request. If you do not specify this parameter, the system generates a value at random.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public StartExecutionRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
