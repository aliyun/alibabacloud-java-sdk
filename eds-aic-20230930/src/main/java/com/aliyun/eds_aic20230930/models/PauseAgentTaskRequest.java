// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class PauseAgentTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskIds")
    public java.util.List<String> taskIds;

    public static PauseAgentTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        PauseAgentTaskRequest self = new PauseAgentTaskRequest();
        return TeaModel.build(map, self);
    }

    public PauseAgentTaskRequest setTaskIds(java.util.List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

}
