// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateScheduledTaskRequest extends TeaModel {
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
    public CreateScheduledTaskRequestRunConfig runConfig;

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

    public static CreateScheduledTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduledTaskRequest self = new CreateScheduledTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateScheduledTaskRequest setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public CreateScheduledTaskRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public CreateScheduledTaskRequest setMaxExecutions(Integer maxExecutions) {
        this.maxExecutions = maxExecutions;
        return this;
    }
    public Integer getMaxExecutions() {
        return this.maxExecutions;
    }

    public CreateScheduledTaskRequest setRunConfig(CreateScheduledTaskRequestRunConfig runConfig) {
        this.runConfig = runConfig;
        return this;
    }
    public CreateScheduledTaskRequestRunConfig getRunConfig() {
        return this.runConfig;
    }

    public CreateScheduledTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateScheduledTaskRequest setUserPrompt(String userPrompt) {
        this.userPrompt = userPrompt;
        return this;
    }
    public String getUserPrompt() {
        return this.userPrompt;
    }

    public static class CreateScheduledTaskRequestRunConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;batchSize&quot;:&quot;1000&quot;}</p>
         */
        @NameInMap("ExtraParams")
        public String extraParams;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxSteps")
        public Integer maxSteps;

        /**
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("TimeoutSeconds")
        public Integer timeoutSeconds;

        public static CreateScheduledTaskRequestRunConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduledTaskRequestRunConfig self = new CreateScheduledTaskRequestRunConfig();
            return TeaModel.build(map, self);
        }

        public CreateScheduledTaskRequestRunConfig setExtraParams(String extraParams) {
            this.extraParams = extraParams;
            return this;
        }
        public String getExtraParams() {
            return this.extraParams;
        }

        public CreateScheduledTaskRequestRunConfig setMaxSteps(Integer maxSteps) {
            this.maxSteps = maxSteps;
            return this;
        }
        public Integer getMaxSteps() {
            return this.maxSteps;
        }

        public CreateScheduledTaskRequestRunConfig setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

    }

}
