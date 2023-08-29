// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class StartExecutionRequest extends TeaModel {
    @NameInMap("CallbackFnFTaskToken")
    public String callbackFnFTaskToken;

    @NameInMap("ExecutionName")
    public String executionName;

    @NameInMap("FlowName")
    public String flowName;

    @NameInMap("Input")
    public String input;

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
