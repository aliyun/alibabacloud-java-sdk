// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RunAgentTaskRequest extends TeaModel {
    /**
     * <p>The region ID of the mobile node.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>An array of mobile node IDs. Specify a maximum of 100 IDs per request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The maximum number of steps the task can execute. This limit prevents infinite loops. Valid values: 30–1000. Default: 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("MaxSteps")
    public Integer maxSteps;

    /**
     * <p>The task timeout in seconds. Valid values: 300–3600. Default: 3600.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("TimeoutSeconds")
    public Integer timeoutSeconds;

    /**
     * <p>The user prompt in natural language. The Agent completes the task based on this prompt.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Download DingTalk from App Store</p>
     */
    @NameInMap("UserPrompt")
    public String userPrompt;

    public static RunAgentTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        RunAgentTaskRequest self = new RunAgentTaskRequest();
        return TeaModel.build(map, self);
    }

    public RunAgentTaskRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public RunAgentTaskRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public RunAgentTaskRequest setMaxSteps(Integer maxSteps) {
        this.maxSteps = maxSteps;
        return this;
    }
    public Integer getMaxSteps() {
        return this.maxSteps;
    }

    public RunAgentTaskRequest setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public RunAgentTaskRequest setUserPrompt(String userPrompt) {
        this.userPrompt = userPrompt;
        return this;
    }
    public String getUserPrompt() {
        return this.userPrompt;
    }

}
