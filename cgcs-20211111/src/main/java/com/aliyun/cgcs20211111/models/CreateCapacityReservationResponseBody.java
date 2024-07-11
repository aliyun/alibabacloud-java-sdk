// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CreateCapacityReservationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("CurrMaxAllocatableSessionCapacity")
    public Integer currMaxAllocatableSessionCapacity;

    /**
     * <strong>example:</strong>
     * <p>46329898-489C-4E63-9BA1-C1DA5C5D0986</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>b354****</p>
     */
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
