// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyReservationDemandResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyReservationDemandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyReservationDemandResponseBody self = new ModifyReservationDemandResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyReservationDemandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
