// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetLoraNodesTaskRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>You can obtain the **ID** of the instance on the **Overview** page in the IoT Platform console. If your instance has an ID, you must specify this parameter. Otherwise, the request fails.</p>
     * <br>
     * <p>> The ID of a public instance may not be displayed on the Overview page. For more information about how to obtain the instance ID, see [How do I obtain an instance ID?](~~267533~~)</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ID of the task for creating the LoRaWAN devices. You can call the [CreateLoRaNodesTask](~~109299~~) operation and obtain the task ID from the value of the **TaskId** response parameter.</p>
     */
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
