// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class InflightTaskTimeoutRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("InstanceOwnerId")
    public Long instanceOwnerId;

    public static InflightTaskTimeoutRequest build(java.util.Map<String, ?> map) throws Exception {
        InflightTaskTimeoutRequest self = new InflightTaskTimeoutRequest();
        return TeaModel.build(map, self);
    }

    public InflightTaskTimeoutRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public InflightTaskTimeoutRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public InflightTaskTimeoutRequest setInstanceOwnerId(Long instanceOwnerId) {
        this.instanceOwnerId = instanceOwnerId;
        return this;
    }
    public Long getInstanceOwnerId() {
        return this.instanceOwnerId;
    }

}
