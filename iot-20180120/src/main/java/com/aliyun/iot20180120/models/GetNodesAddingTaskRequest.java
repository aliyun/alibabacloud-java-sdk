// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetNodesAddingTaskRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    public static GetNodesAddingTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNodesAddingTaskRequest self = new GetNodesAddingTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetNodesAddingTaskRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public GetNodesAddingTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
