// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class RunCloudBenchTaskRequest extends TeaModel {
    /**
     * <p>The stress testing task ID. You can call the [DescribeCloudBenchTasks](https://help.aliyun.com/document_detail/230670.html) operation to query the task ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static RunCloudBenchTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        RunCloudBenchTaskRequest self = new RunCloudBenchTaskRequest();
        return TeaModel.build(map, self);
    }

    public RunCloudBenchTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
