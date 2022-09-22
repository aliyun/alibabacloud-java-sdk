// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyInstanceCapacityReservationAttributesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceCapacityReservationAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceCapacityReservationAttributesResponseBody self = new ModifyInstanceCapacityReservationAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceCapacityReservationAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
