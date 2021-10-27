// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class StopDataImportTaskRequest extends TeaModel {
    @NameInMap("TaskId")
    public Integer taskId;

    public static StopDataImportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StopDataImportTaskRequest self = new StopDataImportTaskRequest();
        return TeaModel.build(map, self);
    }

    public StopDataImportTaskRequest setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

}
