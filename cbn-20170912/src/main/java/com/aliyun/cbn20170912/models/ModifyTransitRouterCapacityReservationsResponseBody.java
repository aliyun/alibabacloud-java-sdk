// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyTransitRouterCapacityReservationsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>004E99FB-E996-5777-888E-BA1D8F215407</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyTransitRouterCapacityReservationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTransitRouterCapacityReservationsResponseBody self = new ModifyTransitRouterCapacityReservationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTransitRouterCapacityReservationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
