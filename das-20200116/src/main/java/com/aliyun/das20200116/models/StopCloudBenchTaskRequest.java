// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class StopCloudBenchTaskRequest extends TeaModel {
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
