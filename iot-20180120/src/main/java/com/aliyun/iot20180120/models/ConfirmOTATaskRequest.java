// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ConfirmOTATaskRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
     * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>y3tOmCDNgpR8F9jnVEzC01****</p>
     */
    @NameInMap("TaskId")
    public java.util.List<String> taskId;

    public static ConfirmOTATaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmOTATaskRequest self = new ConfirmOTATaskRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmOTATaskRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ConfirmOTATaskRequest setTaskId(java.util.List<String> taskId) {
        this.taskId = taskId;
        return this;
    }
    public java.util.List<String> getTaskId() {
        return this.taskId;
    }

}
