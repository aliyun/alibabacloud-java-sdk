// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DeleteCloudBenchTaskRequest extends TeaModel {
    /**
     * <p>The ID of the stress testing task. You can call the [DescribeCloudBenchTasks](https://help.aliyun.com/document_detail/230670.html) operation to query the ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DeleteCloudBenchTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudBenchTaskRequest self = new DeleteCloudBenchTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCloudBenchTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
