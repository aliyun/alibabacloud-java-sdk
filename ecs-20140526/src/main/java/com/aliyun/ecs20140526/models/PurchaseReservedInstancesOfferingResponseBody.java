// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class PurchaseReservedInstancesOfferingResponseBody extends TeaModel {
    @NameInMap("ReservedInstanceIdSets")
    public java.util.List<String> reservedInstanceIdSets;

    @NameInMap("RequestId")
    public String requestId;

    public static PurchaseReservedInstancesOfferingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PurchaseReservedInstancesOfferingResponseBody self = new PurchaseReservedInstancesOfferingResponseBody();
        return TeaModel.build(map, self);
    }

    public PurchaseReservedInstancesOfferingResponseBody setReservedInstanceIdSets(java.util.List<String> reservedInstanceIdSets) {
        this.reservedInstanceIdSets = reservedInstanceIdSets;
        return this;
    }
    public java.util.List<String> getReservedInstanceIdSets() {
        return this.reservedInstanceIdSets;
    }

    public PurchaseReservedInstancesOfferingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
