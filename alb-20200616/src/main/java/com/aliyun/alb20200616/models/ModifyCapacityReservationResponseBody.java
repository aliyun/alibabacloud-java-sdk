// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ModifyCapacityReservationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>593B0448-D13E-4C56-AC0D-FDF0F******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCapacityReservationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCapacityReservationResponseBody self = new ModifyCapacityReservationResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCapacityReservationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
