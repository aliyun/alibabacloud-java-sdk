// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class StopDataExportTaskRequest extends TeaModel {
    @NameInMap("TaskId")
    public Integer taskId;

    public static StopDataExportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StopDataExportTaskRequest self = new StopDataExportTaskRequest();
        return TeaModel.build(map, self);
    }

    public StopDataExportTaskRequest setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

}
