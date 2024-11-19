// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetLoraNodesTaskRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>You can obtain the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console. If your instance has an ID, you must specify this parameter. Otherwise, the request fails.</p>
     * <blockquote>
     * <p>The ID of a public instance may not be displayed on the Overview page. For more information about how to obtain the instance ID, see <a href="https://help.aliyun.com/document_detail/267533.html">How do I obtain an instance ID?</a></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ID of the task for creating the LoRaWAN devices. You can call the <a href="https://help.aliyun.com/document_detail/109299.html">CreateLoRaNodesTask</a> operation and obtain the task ID from the value of the <strong>TaskId</strong> response parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>623***</p>
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
