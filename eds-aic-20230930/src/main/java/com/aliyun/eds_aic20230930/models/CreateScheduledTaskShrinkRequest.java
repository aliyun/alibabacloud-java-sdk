// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateScheduledTaskShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0 0 * * *</p>
     */
    @NameInMap("CronExpression")
    public String cronExpression;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;ai-instance-001&quot;]</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxExecutions")
    public Integer maxExecutions;

    /**
     * <strong>example:</strong>
     * <p>{&quot;maxSteps&quot;:10,&quot;timeoutSeconds&quot;:3600}</p>
     */
    @NameInMap("RunConfig")
    public String runConfigShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>自动回复钉钉消息</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>打开钉钉，回复前5个未读消息</p>
     */
    @NameInMap("UserPrompt")
    public String userPrompt;

    public static CreateScheduledTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduledTaskShrinkRequest self = new CreateScheduledTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateScheduledTaskShrinkRequest setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public CreateScheduledTaskShrinkRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public CreateScheduledTaskShrinkRequest setMaxExecutions(Integer maxExecutions) {
        this.maxExecutions = maxExecutions;
        return this;
    }
    public Integer getMaxExecutions() {
        return this.maxExecutions;
    }

    public CreateScheduledTaskShrinkRequest setRunConfigShrink(String runConfigShrink) {
        this.runConfigShrink = runConfigShrink;
        return this;
    }
    public String getRunConfigShrink() {
        return this.runConfigShrink;
    }

    public CreateScheduledTaskShrinkRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateScheduledTaskShrinkRequest setUserPrompt(String userPrompt) {
        this.userPrompt = userPrompt;
        return this;
    }
    public String getUserPrompt() {
        return this.userPrompt;
    }

}
