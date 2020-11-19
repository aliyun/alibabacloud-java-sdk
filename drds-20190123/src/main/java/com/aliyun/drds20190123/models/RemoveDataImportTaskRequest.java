// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RemoveDataImportTaskRequest extends TeaModel {
    @NameInMap("TaskId")
    @Validation(required = true)
    public Integer taskId;

    public static RemoveDataImportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveDataImportTaskRequest self = new RemoveDataImportTaskRequest();
        return TeaModel.build(map, self);
    }

    public RemoveDataImportTaskRequest setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

}
