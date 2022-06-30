// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CreateCapacityReservationResponseBody extends TeaModel {
    @NameInMap("CurrMaxAllocatableSessionCapacity")
    public Integer currMaxAllocatableSessionCapacity;

    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    // 自定义会话id
    @NameInMap("TaskId")
    public String taskId;

    public static CreateCapacityReservationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCapacityReservationResponseBody self = new CreateCapacityReservationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCapacityReservationResponseBody setCurrMaxAllocatableSessionCapacity(Integer currMaxAllocatableSessionCapacity) {
        this.currMaxAllocatableSessionCapacity = currMaxAllocatableSessionCapacity;
        return this;
    }
    public Integer getCurrMaxAllocatableSessionCapacity() {
        return this.currMaxAllocatableSessionCapacity;
    }

    public CreateCapacityReservationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCapacityReservationResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
