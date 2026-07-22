// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyScheduledTaskRequest extends TeaModel {
    /**
     * <p>The cron expression.</p>
     * 
     * <strong>example:</strong>
     * <p>0 30 * * *</p>
     */
    @NameInMap("CronExpression")
    public String cronExpression;

    /**
     * <p>The list of instance IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;acp-5hh431emkt6u*****&quot;]</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The run configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;maxSteps&quot;:10,&quot;timeoutSeconds&quot;:3600}</p>
     */
    @NameInMap("RunConfig")
    public ModifyScheduledTaskRequestRunConfig runConfig;

    /**
     * <p>The scheduled task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sch-260705-agb*****</p>
     */
    @NameInMap("ScheduledId")
    public String scheduledId;

    /**
     * <p>The status switch: ACTIVE/DISABLED.</p>
     * 
     * <strong>example:</strong>
     * <p>ACTIVE</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The task name.</p>
     * 
     * <strong>example:</strong>
     * <p>NewTaskName.</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The CAS version number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TaskVersion")
    public Integer taskVersion;

    /**
     * <p>The user prompt.</p>
     * 
     * <strong>example:</strong>
     * <p>Execute daily data synchronization task.</p>
     */
    @NameInMap("UserPrompt")
    public String userPrompt;

    public static ModifyScheduledTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyScheduledTaskRequest self = new ModifyScheduledTaskRequest();
        return TeaModel.build(map, self);
    }

    public ModifyScheduledTaskRequest setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public ModifyScheduledTaskRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ModifyScheduledTaskRequest setRunConfig(ModifyScheduledTaskRequestRunConfig runConfig) {
        this.runConfig = runConfig;
        return this;
    }
    public ModifyScheduledTaskRequestRunConfig getRunConfig() {
        return this.runConfig;
    }

    public ModifyScheduledTaskRequest setScheduledId(String scheduledId) {
        this.scheduledId = scheduledId;
        return this;
    }
    public String getScheduledId() {
        return this.scheduledId;
    }

    public ModifyScheduledTaskRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ModifyScheduledTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public ModifyScheduledTaskRequest setTaskVersion(Integer taskVersion) {
        this.taskVersion = taskVersion;
        return this;
    }
    public Integer getTaskVersion() {
        return this.taskVersion;
    }

    public ModifyScheduledTaskRequest setUserPrompt(String userPrompt) {
        this.userPrompt = userPrompt;
        return this;
    }
    public String getUserPrompt() {
        return this.userPrompt;
    }

    public static class ModifyScheduledTaskRequestRunConfig extends TeaModel {
        /**
         * <p>The extended parameters as a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;batchSize&quot;:&quot;1000&quot;}</p>
         */
        @NameInMap("ExtraParams")
        public String extraParams;

        /**
         * <p>The maximum number of execution steps.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxSteps")
        public Integer maxSteps;

        /**
         * <p>The timeout in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("TimeoutSeconds")
        public Integer timeoutSeconds;

        public static ModifyScheduledTaskRequestRunConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyScheduledTaskRequestRunConfig self = new ModifyScheduledTaskRequestRunConfig();
            return TeaModel.build(map, self);
        }

        public ModifyScheduledTaskRequestRunConfig setExtraParams(String extraParams) {
            this.extraParams = extraParams;
            return this;
        }
        public String getExtraParams() {
            return this.extraParams;
        }

        public ModifyScheduledTaskRequestRunConfig setMaxSteps(Integer maxSteps) {
            this.maxSteps = maxSteps;
            return this;
        }
        public Integer getMaxSteps() {
            return this.maxSteps;
        }

        public ModifyScheduledTaskRequestRunConfig setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

    }

}
