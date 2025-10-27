// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class StopExecutionResponseBody extends TeaModel {
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
     * <p>The Alibaba Cloud resource name (ARN) of the role that executed the flow. If the RoleArn in the flow definition is changed during the execution of the flow, the system records and returns a snapshot of the original RoleArn.</p>
     * <blockquote>
     * <p> If you do not specify the RoleArn parameter in the request parameters, the response parameters do not contain the RoleArn parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>acs:ram:${region}:${accountID}:${role}</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

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
     * <p>Running</p>
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

    public static StopExecutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopExecutionResponseBody self = new StopExecutionResponseBody();
        return TeaModel.build(map, self);
    }

    public StopExecutionResponseBody setFlowDefinition(String flowDefinition) {
        this.flowDefinition = flowDefinition;
        return this;
    }
    public String getFlowDefinition() {
        return this.flowDefinition;
    }

    public StopExecutionResponseBody setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public StopExecutionResponseBody setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public StopExecutionResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public StopExecutionResponseBody setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public StopExecutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopExecutionResponseBody setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public StopExecutionResponseBody setStartedTime(String startedTime) {
        this.startedTime = startedTime;
        return this;
    }
    public String getStartedTime() {
        return this.startedTime;
    }

    public StopExecutionResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public StopExecutionResponseBody setStoppedTime(String stoppedTime) {
        this.stoppedTime = stoppedTime;
        return this;
    }
    public String getStoppedTime() {
        return this.stoppedTime;
    }

}
