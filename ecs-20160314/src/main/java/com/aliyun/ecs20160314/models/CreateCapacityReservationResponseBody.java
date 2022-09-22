// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateCapacityReservationResponseBody extends TeaModel {
    @NameInMap("CapacityReservationId")
    public String capacityReservationId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateCapacityReservationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCapacityReservationResponseBody self = new CreateCapacityReservationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCapacityReservationResponseBody setCapacityReservationId(String capacityReservationId) {
        this.capacityReservationId = capacityReservationId;
        return this;
    }
    public String getCapacityReservationId() {
        return this.capacityReservationId;
    }

    public CreateCapacityReservationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
