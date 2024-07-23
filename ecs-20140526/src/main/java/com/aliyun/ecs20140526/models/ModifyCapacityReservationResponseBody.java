// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyCapacityReservationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8455DD10-84F8-43C9-8365-5F448EB169B6</p>
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
