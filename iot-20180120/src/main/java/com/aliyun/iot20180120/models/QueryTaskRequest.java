// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot-cn-0pp1n8t****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MSnT9***q010101</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static QueryTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskRequest self = new QueryTaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryTaskRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
