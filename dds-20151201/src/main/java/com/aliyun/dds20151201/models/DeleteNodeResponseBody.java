// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DeleteNodeResponseBody extends TeaModel {
    @NameInMap("TaskId")
    public Integer taskId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OrderId")
    public String orderId;

    public static DeleteNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNodeResponseBody self = new DeleteNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNodeResponseBody setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

    public DeleteNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteNodeResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
