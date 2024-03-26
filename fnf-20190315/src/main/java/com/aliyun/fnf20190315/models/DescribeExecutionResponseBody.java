// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class DescribeExecutionResponseBody extends TeaModel {
    /**
     * <p>The definition of the flow.</p>
     */
    @NameInMap("FlowDefinition")
    public String flowDefinition;

    /**
     * <p>The name of the flow.</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    /**
     * <p>The input of the execution, which is in the JSON format.</p>
     */
    @NameInMap("Input")
    public String input;

    /**
     * <p>The name of the execution.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The execution result, which is in the JSON format.</p>
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
     * <p>The execution status. Valid values:</p>
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

    public static DescribeExecutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExecutionResponseBody self = new DescribeExecutionResponseBody();
        return TeaModel.build(map, self);
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

}
