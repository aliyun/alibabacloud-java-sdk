// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RemoveEvaluateTaskRequest extends TeaModel {
    @NameInMap("TaskId")
    @Validation(required = true)
    public Integer taskId;

    public static RemoveEvaluateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveEvaluateTaskRequest self = new RemoveEvaluateTaskRequest();
        return TeaModel.build(map, self);
    }

    public RemoveEvaluateTaskRequest setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

}
