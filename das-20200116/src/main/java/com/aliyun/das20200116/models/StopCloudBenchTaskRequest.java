// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class StopCloudBenchTaskRequest extends TeaModel {
    /**
     * <p>The stress testing task ID. You can call the [DescribeCloudBenchTasks](~~230670~~) operation to query the task ID.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static StopCloudBenchTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StopCloudBenchTaskRequest self = new StopCloudBenchTaskRequest();
        return TeaModel.build(map, self);
    }

    public StopCloudBenchTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
