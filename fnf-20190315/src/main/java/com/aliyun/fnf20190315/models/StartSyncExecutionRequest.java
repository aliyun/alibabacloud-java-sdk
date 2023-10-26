// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class StartSyncExecutionRequest extends TeaModel {
    @NameInMap("ExecutionName")
    public String executionName;

    @NameInMap("FlowName")
    public String flowName;

    @NameInMap("Input")
    public String input;

    @NameInMap("RequestId")
    public String requestId;

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

    public StartSyncExecutionRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
