// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class StartSyncExecutionResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("FlowName")
    public String flowName;

    @NameInMap("Name")
    public String name;

    @NameInMap("Output")
    public String output;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartedTime")
    public String startedTime;

    @NameInMap("Status")
    public String status;

    @NameInMap("StoppedTime")
    public String stoppedTime;

    public static StartSyncExecutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartSyncExecutionResponseBody self = new StartSyncExecutionResponseBody();
        return TeaModel.build(map, self);
    }

    public StartSyncExecutionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public StartSyncExecutionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public StartSyncExecutionResponseBody setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public StartSyncExecutionResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public StartSyncExecutionResponseBody setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public StartSyncExecutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartSyncExecutionResponseBody setStartedTime(String startedTime) {
        this.startedTime = startedTime;
        return this;
    }
    public String getStartedTime() {
        return this.startedTime;
    }

    public StartSyncExecutionResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public StartSyncExecutionResponseBody setStoppedTime(String stoppedTime) {
        this.stoppedTime = stoppedTime;
        return this;
    }
    public String getStoppedTime() {
        return this.stoppedTime;
    }

}
