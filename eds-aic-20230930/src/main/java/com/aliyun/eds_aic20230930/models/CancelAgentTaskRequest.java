// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CancelAgentTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskIds")
    public java.util.List<String> taskIds;

    public static CancelAgentTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelAgentTaskRequest self = new CancelAgentTaskRequest();
        return TeaModel.build(map, self);
    }

    public CancelAgentTaskRequest setTaskIds(java.util.List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

}
