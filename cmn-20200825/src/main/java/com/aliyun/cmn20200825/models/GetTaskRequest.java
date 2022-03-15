// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetTaskRequest extends TeaModel {
    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 任务ID
    @NameInMap("TaskId")
    public String taskId;

    public static GetTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskRequest self = new GetTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
