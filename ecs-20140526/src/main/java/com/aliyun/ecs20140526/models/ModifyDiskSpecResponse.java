// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDiskSpecResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    @NameInMap("OrderId")
    @Validation(required = true)
    public String orderId;

    public static ModifyDiskSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskSpecResponse self = new ModifyDiskSpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDiskSpecResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDiskSpecResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ModifyDiskSpecResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
