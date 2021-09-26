// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAiOutboundTaskDetailRequest extends TeaModel {
    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 任务id
    @NameInMap("TaskId")
    public Long taskId;

    public static GetAiOutboundTaskDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAiOutboundTaskDetailRequest self = new GetAiOutboundTaskDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetAiOutboundTaskDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAiOutboundTaskDetailRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
