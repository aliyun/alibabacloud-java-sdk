// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ExecuteTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2615</p>
     */
    @NameInMap("TaskId")
    public Integer taskId;

    public static ExecuteTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTaskRequest self = new ExecuteTaskRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteTaskRequest setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

}
