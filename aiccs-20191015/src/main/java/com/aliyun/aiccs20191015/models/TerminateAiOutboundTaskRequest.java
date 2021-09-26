// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class TerminateAiOutboundTaskRequest extends TeaModel {
    // 实例id
    @NameInMap("InstanceId")
    public String instanceId;

    // 任务id
    @NameInMap("TaskId")
    public Long taskId;

    public static TerminateAiOutboundTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        TerminateAiOutboundTaskRequest self = new TerminateAiOutboundTaskRequest();
        return TeaModel.build(map, self);
    }

    public TerminateAiOutboundTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public TerminateAiOutboundTaskRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
