// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class StartExecutionResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("Input")
    public String input;

    @NameInMap("StoppedTime")
    public String stoppedTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FlowName")
    public String flowName;

    @NameInMap("Output")
    public String output;

    @NameInMap("ExternalOutputUri")
    public String externalOutputUri;

    @NameInMap("StartedTime")
    public String startedTime;

    @NameInMap("ExternalInputUri")
    public String externalInputUri;

    @NameInMap("FlowDefinition")
    public String flowDefinition;

    @NameInMap("Name")
    public String name;

    public static StartExecutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartExecutionResponseBody self = new StartExecutionResponseBody();
        return TeaModel.build(map, self);
    }

    public StartExecutionResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public StartExecutionResponseBody setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public StartExecutionResponseBody setStoppedTime(String stoppedTime) {
        this.stoppedTime = stoppedTime;
        return this;
    }
    public String getStoppedTime() {
        return this.stoppedTime;
    }

    public StartExecutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartExecutionResponseBody setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public StartExecutionResponseBody setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public StartExecutionResponseBody setExternalOutputUri(String externalOutputUri) {
        this.externalOutputUri = externalOutputUri;
        return this;
    }
    public String getExternalOutputUri() {
        return this.externalOutputUri;
    }

    public StartExecutionResponseBody setStartedTime(String startedTime) {
        this.startedTime = startedTime;
        return this;
    }
    public String getStartedTime() {
        return this.startedTime;
    }

    public StartExecutionResponseBody setExternalInputUri(String externalInputUri) {
        this.externalInputUri = externalInputUri;
        return this;
    }
    public String getExternalInputUri() {
        return this.externalInputUri;
    }

    public StartExecutionResponseBody setFlowDefinition(String flowDefinition) {
        this.flowDefinition = flowDefinition;
        return this;
    }
    public String getFlowDefinition() {
        return this.flowDefinition;
    }

    public StartExecutionResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
