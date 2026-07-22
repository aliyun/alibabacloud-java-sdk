// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyScheduledTaskShrinkRequest extends TeaModel {
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
    public String runConfigShrink;

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

    public static ModifyScheduledTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyScheduledTaskShrinkRequest self = new ModifyScheduledTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyScheduledTaskShrinkRequest setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public ModifyScheduledTaskShrinkRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ModifyScheduledTaskShrinkRequest setRunConfigShrink(String runConfigShrink) {
        this.runConfigShrink = runConfigShrink;
        return this;
    }
    public String getRunConfigShrink() {
        return this.runConfigShrink;
    }

    public ModifyScheduledTaskShrinkRequest setScheduledId(String scheduledId) {
        this.scheduledId = scheduledId;
        return this;
    }
    public String getScheduledId() {
        return this.scheduledId;
    }

    public ModifyScheduledTaskShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ModifyScheduledTaskShrinkRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public ModifyScheduledTaskShrinkRequest setTaskVersion(Integer taskVersion) {
        this.taskVersion = taskVersion;
        return this;
    }
    public Integer getTaskVersion() {
        return this.taskVersion;
    }

    public ModifyScheduledTaskShrinkRequest setUserPrompt(String userPrompt) {
        this.userPrompt = userPrompt;
        return this;
    }
    public String getUserPrompt() {
        return this.userPrompt;
    }

}
