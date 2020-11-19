// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class StartDataImportTaskRequest extends TeaModel {
    @NameInMap("TaskId")
    @Validation(required = true)
    public Integer taskId;

    public static StartDataImportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDataImportTaskRequest self = new StartDataImportTaskRequest();
        return TeaModel.build(map, self);
    }

    public StartDataImportTaskRequest setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

}
