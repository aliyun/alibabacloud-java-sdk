// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class StartSyncExecutionResponseBody extends TeaModel {
    @NameInMap("Environment")
    public StartSyncExecutionResponseBodyEnvironment environment;

    /**
     * <p>The error code that is returned if the execution failed.</p>
     * 
     * <strong>example:</strong>
     * <p>ActionNotSupported</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message that indicates the execution timed out.</p>
     * 
     * <strong>example:</strong>
     * <p>Standard execution is not supported</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The name of the flow.</p>
     * 
     * <strong>example:</strong>
     * <p>my_flow_name</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    /**
     * <p>The name of the execution.</p>
     * 
     * <strong>example:</strong>
     * <p>my_exec_name:{UUID}</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The output of the execution, which is in the JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;value&quot;}</p>
     */
    @NameInMap("Output")
    public String output;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>testRequestId</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The time when the execution started.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-01-01T01:01:01.001Z</p>
     */
    @NameInMap("StartedTime")
    public String startedTime;

    /**
     * <p>The status of the execution. Valid values:</p>
     * <ul>
     * <li><strong>Starting</strong></li>
     * <li><strong>Running</strong></li>
     * <li><strong>Stopped</strong></li>
     * <li><strong>Succeeded</strong></li>
     * <li><strong>Failed</strong></li>
     * <li><strong>TimedOut</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The time when the execution stopped.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-01-01T01:01:01.001Z</p>
     */
    @NameInMap("StoppedTime")
    public String stoppedTime;

    public static StartSyncExecutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartSyncExecutionResponseBody self = new StartSyncExecutionResponseBody();
        return TeaModel.build(map, self);
    }

    public StartSyncExecutionResponseBody setEnvironment(StartSyncExecutionResponseBodyEnvironment environment) {
        this.environment = environment;
        return this;
    }
    public StartSyncExecutionResponseBodyEnvironment getEnvironment() {
        return this.environment;
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

    public static class StartSyncExecutionResponseBodyEnvironmentVariables extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static StartSyncExecutionResponseBodyEnvironmentVariables build(java.util.Map<String, ?> map) throws Exception {
            StartSyncExecutionResponseBodyEnvironmentVariables self = new StartSyncExecutionResponseBodyEnvironmentVariables();
            return TeaModel.build(map, self);
        }

        public StartSyncExecutionResponseBodyEnvironmentVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public StartSyncExecutionResponseBodyEnvironmentVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class StartSyncExecutionResponseBodyEnvironment extends TeaModel {
        @NameInMap("Variables")
        public java.util.List<StartSyncExecutionResponseBodyEnvironmentVariables> variables;

        public static StartSyncExecutionResponseBodyEnvironment build(java.util.Map<String, ?> map) throws Exception {
            StartSyncExecutionResponseBodyEnvironment self = new StartSyncExecutionResponseBodyEnvironment();
            return TeaModel.build(map, self);
        }

        public StartSyncExecutionResponseBodyEnvironment setVariables(java.util.List<StartSyncExecutionResponseBodyEnvironmentVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<StartSyncExecutionResponseBodyEnvironmentVariables> getVariables() {
            return this.variables;
        }

    }

}
