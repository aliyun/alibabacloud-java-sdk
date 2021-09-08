// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetLoraNodesTaskRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("TaskId")
    public String taskId;

    public static GetLoraNodesTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLoraNodesTaskRequest self = new GetLoraNodesTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetLoraNodesTaskRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public GetLoraNodesTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
