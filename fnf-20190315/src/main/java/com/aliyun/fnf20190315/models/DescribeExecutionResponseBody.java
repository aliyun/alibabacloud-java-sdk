// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class DescribeExecutionResponseBody extends TeaModel {
    @NameInMap("Environment")
    public DescribeExecutionResponseBodyEnvironment environment;

    /**
     * <p>The definition of the flow.</p>
     * 
     * <strong>example:</strong>
     * <p>version: v1.0\ntype: flow\nname: test\nsteps:\n - type: pass\n name: mypass</p>
     */
    @NameInMap("FlowDefinition")
    public String flowDefinition;

    /**
     * <p>The name of the flow.</p>
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
     * <p>The name of the execution.</p>
     * 
     * <strong>example:</strong>
     * <p>exec</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The execution result, which is in the JSON format.</p>
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
     * <p>The execution status. Valid values:</p>
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

    public static DescribeExecutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExecutionResponseBody self = new DescribeExecutionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExecutionResponseBody setEnvironment(DescribeExecutionResponseBodyEnvironment environment) {
        this.environment = environment;
        return this;
    }
    public DescribeExecutionResponseBodyEnvironment getEnvironment() {
        return this.environment;
    }

    public DescribeExecutionResponseBody setFlowDefinition(String flowDefinition) {
        this.flowDefinition = flowDefinition;
        return this;
    }
    public String getFlowDefinition() {
        return this.flowDefinition;
    }

    public DescribeExecutionResponseBody setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public DescribeExecutionResponseBody setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public DescribeExecutionResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeExecutionResponseBody setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public DescribeExecutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExecutionResponseBody setStartedTime(String startedTime) {
        this.startedTime = startedTime;
        return this;
    }
    public String getStartedTime() {
        return this.startedTime;
    }

    public DescribeExecutionResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeExecutionResponseBody setStoppedTime(String stoppedTime) {
        this.stoppedTime = stoppedTime;
        return this;
    }
    public String getStoppedTime() {
        return this.stoppedTime;
    }

    public static class DescribeExecutionResponseBodyEnvironmentVariables extends TeaModel {
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

        public static DescribeExecutionResponseBodyEnvironmentVariables build(java.util.Map<String, ?> map) throws Exception {
            DescribeExecutionResponseBodyEnvironmentVariables self = new DescribeExecutionResponseBodyEnvironmentVariables();
            return TeaModel.build(map, self);
        }

        public DescribeExecutionResponseBodyEnvironmentVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeExecutionResponseBodyEnvironmentVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeExecutionResponseBodyEnvironment extends TeaModel {
        @NameInMap("Variables")
        public java.util.List<DescribeExecutionResponseBodyEnvironmentVariables> variables;

        public static DescribeExecutionResponseBodyEnvironment build(java.util.Map<String, ?> map) throws Exception {
            DescribeExecutionResponseBodyEnvironment self = new DescribeExecutionResponseBodyEnvironment();
            return TeaModel.build(map, self);
        }

        public DescribeExecutionResponseBodyEnvironment setVariables(java.util.List<DescribeExecutionResponseBodyEnvironmentVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<DescribeExecutionResponseBodyEnvironmentVariables> getVariables() {
            return this.variables;
        }

    }

}
