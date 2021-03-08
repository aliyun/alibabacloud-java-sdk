// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetRealtimeTaskRequest extends TeaModel {
    // 实时任务ID
    @NameInMap("TaskId")
    public String taskId;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetRealtimeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRealtimeTaskRequest self = new GetRealtimeTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetRealtimeTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetRealtimeTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
