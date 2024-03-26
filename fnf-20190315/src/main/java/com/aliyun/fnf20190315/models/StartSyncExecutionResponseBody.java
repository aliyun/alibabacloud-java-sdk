// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class StartSyncExecutionResponseBody extends TeaModel {
    /**
     * <p>The error code that is returned if the execution failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message that indicates the execution timed out.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The name of the flow.</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    /**
     * <p>The name of the execution.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The output of the execution, which is in the JSON format.</p>
     */
    @NameInMap("Output")
    public String output;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The time when the execution started.</p>
     */
    @NameInMap("StartedTime")
    public String startedTime;

    /**
     * <p>The status of the execution. Valid values:</p>
     * <br>
     * <p>*   **Starting**</p>
     * <p>*   **Running**</p>
     * <p>*   **Stopped**</p>
     * <p>*   **Succeeded**</p>
     * <p>*   **Failed**</p>
     * <p>*   **TimedOut**</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The time when the execution stopped.</p>
     */
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
