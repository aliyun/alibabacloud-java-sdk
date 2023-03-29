// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeIllegalUrlExportTaskRequest extends TeaModel {
    /**
     * <p>The ID of the task. You can call the [CreateIllegalUrlExportTask](~~156492~~) operation to query task IDs.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DescribeIllegalUrlExportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIllegalUrlExportTaskRequest self = new DescribeIllegalUrlExportTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIllegalUrlExportTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
