// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteInspectionTaskRequest extends TeaModel {
    // 周期性任务的ID
    @NameInMap("TaskId")
    public String taskId;

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

}
