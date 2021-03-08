// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteInspectionTaskRequest extends TeaModel {
    // 周期性任务的ID
    @NameInMap("TaskId")
    public String taskId;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteInspectionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInspectionTaskRequest self = new DeleteInspectionTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInspectionTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DeleteInspectionTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
