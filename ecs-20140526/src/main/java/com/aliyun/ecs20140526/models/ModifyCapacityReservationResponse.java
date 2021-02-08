// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyCapacityReservationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyCapacityReservationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCapacityReservationResponse self = new ModifyCapacityReservationResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCapacityReservationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
