// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteUsageDetailDataExportTaskRequest extends TeaModel {
    /**
     * <p>The ID of the task. You can call the [DescribeUserUsageDataExportTask](~~91062~~) operation to query the most recent task list.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DeleteUsageDetailDataExportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUsageDetailDataExportTaskRequest self = new DeleteUsageDetailDataExportTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUsageDetailDataExportTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
