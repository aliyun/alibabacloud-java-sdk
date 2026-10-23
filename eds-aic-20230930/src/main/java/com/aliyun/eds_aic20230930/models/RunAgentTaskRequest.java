// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RunAgentTaskRequest extends TeaModel {
    /**
     * <p>The region ID of the Mobile node.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The list of Mobile node IDs. A single request supports up to 100 nodes.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The maximum number of execution steps for the task to prevent infinite loops. Valid values: 50 to 1000. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxSteps")
    public Integer maxSteps;

    /**
     * <p>The runtime configuration that carries the runtime parameters such as skills for the current task.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Skills&quot;:[&quot;sk-abc&quot;,&quot;sk-def&quot;]}</p>
     */
    @NameInMap("RunConfig")
    public RunAgentTaskRequestRunConfig runConfig;

    /**
     * <p>Specifies whether to write the task artifacts to the user\&quot;s OSS.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SaveArtifacts")
    public Boolean saveArtifacts;

    /**
     * <p>The scheduling plan ID. If specified, the execute record is associated with the corresponding scheduled node to facilitate aggregate query by scheduling dimension aggregation.</p>
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
    public java.util.List<RunAgentTaskRequestTargets> targets;

    /**
     * <p>The task configuration ID used to trigger a task with the specified configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>tsk-260625-49be****</p>
     */
    @NameInMap("TaskConfigId")
    public String taskConfigId;

    /**
     * <p>The timeout period for the task in seconds. Valid values: 300 to 3600. Default value: 3600.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("TimeoutSeconds")
    public Integer timeoutSeconds;

    /**
     * <p>The user prompt in natural language based on which the agent performs operations.</p>
     * 
     * <strong>example:</strong>
     * <p>Download DingTalk from the app store</p>
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

    public RunAgentTaskRequest setRunConfig(RunAgentTaskRequestRunConfig runConfig) {
        this.runConfig = runConfig;
        return this;
    }
    public RunAgentTaskRequestRunConfig getRunConfig() {
        return this.runConfig;
    }

    public RunAgentTaskRequest setSaveArtifacts(Boolean saveArtifacts) {
        this.saveArtifacts = saveArtifacts;
        return this;
    }
    public Boolean getSaveArtifacts() {
        return this.saveArtifacts;
    }

    public RunAgentTaskRequest setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }
    public String getScheduleId() {
        return this.scheduleId;
    }

    public RunAgentTaskRequest setTargets(java.util.List<RunAgentTaskRequestTargets> targets) {
        this.targets = targets;
        return this;
    }
    public java.util.List<RunAgentTaskRequestTargets> getTargets() {
        return this.targets;
    }

    public RunAgentTaskRequest setTaskConfigId(String taskConfigId) {
        this.taskConfigId = taskConfigId;
        return this;
    }
    public String getTaskConfigId() {
        return this.taskConfigId;
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

    public static class RunAgentTaskRequestRunConfig extends TeaModel {
        /**
         * <p>The list of skill IDs. A maximum of 10 skills are supported. Only the first skill ID is passed through when the command is delivered. All skill IDs are stored in the task_skill_relation table for reverse lookup.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;sk-abc&quot;,&quot;sk-def&quot;]</p>
         */
        @NameInMap("Skills")
        public java.util.List<String> skills;

        public static RunAgentTaskRequestRunConfig build(java.util.Map<String, ?> map) throws Exception {
            RunAgentTaskRequestRunConfig self = new RunAgentTaskRequestRunConfig();
            return TeaModel.build(map, self);
        }

        public RunAgentTaskRequestRunConfig setSkills(java.util.List<String> skills) {
            this.skills = skills;
            return this;
        }
        public java.util.List<String> getSkills() {
            return this.skills;
        }

    }

    public static class RunAgentTaskRequestTargets extends TeaModel {
        /**
         * <p>The Mobile node ID, such as acp-xxx.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-5hh4a31emkt6u****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The session ID. Tasks with the same session ID share the context, such as ses-260702-21b****.</p>
         * 
         * <strong>example:</strong>
         * <p>ses-260702-21bh****。</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        public static RunAgentTaskRequestTargets build(java.util.Map<String, ?> map) throws Exception {
            RunAgentTaskRequestTargets self = new RunAgentTaskRequestTargets();
            return TeaModel.build(map, self);
        }

        public RunAgentTaskRequestTargets setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public RunAgentTaskRequestTargets setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
