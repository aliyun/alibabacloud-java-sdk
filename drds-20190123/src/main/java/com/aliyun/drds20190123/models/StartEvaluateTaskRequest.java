// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class StartEvaluateTaskRequest extends TeaModel {
    @NameInMap("TaskId")
    public Integer taskId;

    public static StartEvaluateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StartEvaluateTaskRequest self = new StartEvaluateTaskRequest();
        return TeaModel.build(map, self);
    }

    public StartEvaluateTaskRequest setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

}
