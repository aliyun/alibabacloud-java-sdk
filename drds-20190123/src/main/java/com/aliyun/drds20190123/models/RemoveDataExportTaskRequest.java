// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RemoveDataExportTaskRequest extends TeaModel {
    @NameInMap("TaskId")
    public Integer taskId;

    public static RemoveDataExportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveDataExportTaskRequest self = new RemoveDataExportTaskRequest();
        return TeaModel.build(map, self);
    }

    public RemoveDataExportTaskRequest setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

}
