// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteUserUsageDataExportTaskRequest extends TeaModel {
    /**
     * <p>The ID of the export task that you want to delete.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DeleteUserUsageDataExportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserUsageDataExportTaskRequest self = new DeleteUserUsageDataExportTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserUsageDataExportTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
