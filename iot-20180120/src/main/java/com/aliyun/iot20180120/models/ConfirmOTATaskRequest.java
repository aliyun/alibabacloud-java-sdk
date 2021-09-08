// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ConfirmOTATaskRequest extends TeaModel {
    @NameInMap("TaskId")
    @Validation(required = true)
    public java.util.List<String> taskId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static ConfirmOTATaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmOTATaskRequest self = new ConfirmOTATaskRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmOTATaskRequest setTaskId(java.util.List<String> taskId) {
        this.taskId = taskId;
        return this;
    }
    public java.util.List<String> getTaskId() {
        return this.taskId;
    }

    public ConfirmOTATaskRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
