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
     * <p>The scheduling plan ID. When specified, execution records are associated with the corresponding scheduled node, which facilitates aggregation query by scheduling dimension.</p>
     * 
     * <strong>example:</strong>
     * <p>sch-260625-pbj2****</p>
     */
    @NameInMap("ScheduleId")
    public String scheduleId;

    /**
     * <p>The array of target objects. Each element contains an InstanceId and a SessionId.</p>
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
     * <p>The timeout period of the task, in seconds. Valid values: 300 to 3600. Default value: 3600.</p>
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
     * <p>去应用宝下载钉钉</p>
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
         * <p>The session ID. Tasks with the same session ID share context, such as ses-260702-21b****.</p>
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
