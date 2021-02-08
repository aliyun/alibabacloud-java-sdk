// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class PurchaseReservedInstancesOfferingResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ReservedInstanceIdSets")
    @Validation(required = true)
    public PurchaseReservedInstancesOfferingResponseReservedInstanceIdSets reservedInstanceIdSets;

    public static PurchaseReservedInstancesOfferingResponse build(java.util.Map<String, ?> map) throws Exception {
        PurchaseReservedInstancesOfferingResponse self = new PurchaseReservedInstancesOfferingResponse();
        return TeaModel.build(map, self);
    }

    public PurchaseReservedInstancesOfferingResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PurchaseReservedInstancesOfferingResponse setReservedInstanceIdSets(PurchaseReservedInstancesOfferingResponseReservedInstanceIdSets reservedInstanceIdSets) {
        this.reservedInstanceIdSets = reservedInstanceIdSets;
        return this;
    }
    public PurchaseReservedInstancesOfferingResponseReservedInstanceIdSets getReservedInstanceIdSets() {
        return this.reservedInstanceIdSets;
    }

    public static class PurchaseReservedInstancesOfferingResponseReservedInstanceIdSets extends TeaModel {
        @NameInMap("ReservedInstanceId")
        @Validation(required = true)
        public java.util.List<String> reservedInstanceId;

        public static PurchaseReservedInstancesOfferingResponseReservedInstanceIdSets build(java.util.Map<String, ?> map) throws Exception {
            PurchaseReservedInstancesOfferingResponseReservedInstanceIdSets self = new PurchaseReservedInstancesOfferingResponseReservedInstanceIdSets();
            return TeaModel.build(map, self);
        }

        public PurchaseReservedInstancesOfferingResponseReservedInstanceIdSets setReservedInstanceId(java.util.List<String> reservedInstanceId) {
            this.reservedInstanceId = reservedInstanceId;
            return this;
        }
        public java.util.List<String> getReservedInstanceId() {
            return this.reservedInstanceId;
        }

    }

}
