// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RunAgentTaskShrinkRequest extends TeaModel {
    /**
     * <p>The region ID of the Mobile node.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The list of Mobile node IDs. A maximum of 100 nodes are supported per request.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The maximum number of execution steps for the task. This prevents infinite loops. Valid values: 30 to 1000. Default value: 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("MaxSteps")
    public Integer maxSteps;

    /**
     * <p>The runtime configuration that carries the runtime parameters (skills) for this task.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Skills&quot;:[&quot;sk-abc&quot;,&quot;sk-def&quot;]}</p>
     */
    @NameInMap("RunConfig")
    public String runConfigShrink;

    /**
     * <p>The scheduling plan ID. When specified, the execution record is associated with the corresponding scheduled node, which facilitates aggregate query by scheduling dimension through aggregation.</p>
     * 
     * <strong>example:</strong>
     * <p>sch-260625-pbj2****</p>
     */
    @NameInMap("ScheduleId")
    public String scheduleId;

    /**
     * <p>The Targets array. Each element is an object that contains InstanceId and SessionId.</p>
     */
    @NameInMap("Targets")
    public java.util.List<RunAgentTaskShrinkRequestTargets> targets;

    /**
     * <p>The task configuration ID. This parameter is used to trigger a task with the specified configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>tsk-260625-49be****</p>
     */
    @NameInMap("TaskConfigId")
    public String taskConfigId;

    /**
     * <p>The task timeout period, in seconds. Valid values: 300 to 3600. Default value: 3600.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("TimeoutSeconds")
    public Integer timeoutSeconds;

    /**
     * <p>The user instruction in natural language. The Agent performs operations based on this instruction.</p>
     * 
     * <strong>example:</strong>
     * <p>Go to App Store and download DingTalk</p>
     */
    @NameInMap("UserPrompt")
    public String userPrompt;

    public static RunAgentTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunAgentTaskShrinkRequest self = new RunAgentTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunAgentTaskShrinkRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public RunAgentTaskShrinkRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public RunAgentTaskShrinkRequest setMaxSteps(Integer maxSteps) {
        this.maxSteps = maxSteps;
        return this;
    }
    public Integer getMaxSteps() {
        return this.maxSteps;
    }

    public RunAgentTaskShrinkRequest setRunConfigShrink(String runConfigShrink) {
        this.runConfigShrink = runConfigShrink;
        return this;
    }
    public String getRunConfigShrink() {
        return this.runConfigShrink;
    }

    public RunAgentTaskShrinkRequest setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }
    public String getScheduleId() {
        return this.scheduleId;
    }

    public RunAgentTaskShrinkRequest setTargets(java.util.List<RunAgentTaskShrinkRequestTargets> targets) {
        this.targets = targets;
        return this;
    }
    public java.util.List<RunAgentTaskShrinkRequestTargets> getTargets() {
        return this.targets;
    }

    public RunAgentTaskShrinkRequest setTaskConfigId(String taskConfigId) {
        this.taskConfigId = taskConfigId;
        return this;
    }
    public String getTaskConfigId() {
        return this.taskConfigId;
    }

    public RunAgentTaskShrinkRequest setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public RunAgentTaskShrinkRequest setUserPrompt(String userPrompt) {
        this.userPrompt = userPrompt;
        return this;
    }
    public String getUserPrompt() {
        return this.userPrompt;
    }

    public static class RunAgentTaskShrinkRequestTargets extends TeaModel {
        /**
         * <p>The Mobile node ID, such as acp-xxx.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-5hh4a31emkt6u****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The session ID. Tasks with the same session ID share context, such as ses-260702-21b****.</p>
         * 
         * <strong>example:</strong>
         * <p>ses-260702-21bh****。</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        public static RunAgentTaskShrinkRequestTargets build(java.util.Map<String, ?> map) throws Exception {
            RunAgentTaskShrinkRequestTargets self = new RunAgentTaskShrinkRequestTargets();
            return TeaModel.build(map, self);
        }

        public RunAgentTaskShrinkRequestTargets setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public RunAgentTaskShrinkRequestTargets setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
