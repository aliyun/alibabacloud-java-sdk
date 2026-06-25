// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ResumeAgentTaskRequest extends TeaModel {
    /**
     * <p>An additional prompt to guide the task. This parameter applies only when a task is in the <code>PAUSED</code> state, for example, while waiting for user input.</p>
     * 
     * <strong>example:</strong>
     * <p>验证码为***。</p>
     */
    @NameInMap("AdditionalPrompt")
    public String additionalPrompt;

    /**
     * <p>A list of task IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskIds")
    public java.util.List<String> taskIds;

    public static ResumeAgentTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeAgentTaskRequest self = new ResumeAgentTaskRequest();
        return TeaModel.build(map, self);
    }

    public ResumeAgentTaskRequest setAdditionalPrompt(String additionalPrompt) {
        this.additionalPrompt = additionalPrompt;
        return this;
    }
    public String getAdditionalPrompt() {
        return this.additionalPrompt;
    }

    public ResumeAgentTaskRequest setTaskIds(java.util.List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

}
