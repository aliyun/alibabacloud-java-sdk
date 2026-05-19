// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ResumeAgentTaskRequest extends TeaModel {
    @NameInMap("AdditionalPrompt")
    public String additionalPrompt;

    /**
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
