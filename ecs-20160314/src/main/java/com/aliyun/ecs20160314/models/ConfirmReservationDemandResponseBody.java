// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ConfirmReservationDemandResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ConfirmReservationDemandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfirmReservationDemandResponseBody self = new ConfirmReservationDemandResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfirmReservationDemandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
