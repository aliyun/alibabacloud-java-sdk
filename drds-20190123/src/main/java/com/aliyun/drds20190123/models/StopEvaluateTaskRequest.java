// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class StopEvaluateTaskRequest extends TeaModel {
    @NameInMap("TaskId")
    public Integer taskId;

    public static StopEvaluateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StopEvaluateTaskRequest self = new StopEvaluateTaskRequest();
        return TeaModel.build(map, self);
    }

    public StopEvaluateTaskRequest setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

}
