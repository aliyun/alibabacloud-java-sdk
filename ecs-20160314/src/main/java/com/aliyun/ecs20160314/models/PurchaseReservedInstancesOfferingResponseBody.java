// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class PurchaseReservedInstancesOfferingResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ReservedInstanceIdSets")
    public ReservedInstanceIdSets reservedInstanceIdSets;

    public static PurchaseReservedInstancesOfferingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PurchaseReservedInstancesOfferingResponseBody self = new PurchaseReservedInstancesOfferingResponseBody();
        return TeaModel.build(map, self);
    }

    public PurchaseReservedInstancesOfferingResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public PurchaseReservedInstancesOfferingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PurchaseReservedInstancesOfferingResponseBody setReservedInstanceIdSets(ReservedInstanceIdSets reservedInstanceIdSets) {
        this.reservedInstanceIdSets = reservedInstanceIdSets;
        return this;
    }
    public ReservedInstanceIdSets getReservedInstanceIdSets() {
        return this.reservedInstanceIdSets;
    }

    public static class ReservedInstanceIdSets extends TeaModel {
        @NameInMap("ReservedInstanceId")
        public java.util.List<String> reservedInstanceId;

        public static ReservedInstanceIdSets build(java.util.Map<String, ?> map) throws Exception {
            ReservedInstanceIdSets self = new ReservedInstanceIdSets();
            return TeaModel.build(map, self);
        }

        public ReservedInstanceIdSets setReservedInstanceId(java.util.List<String> reservedInstanceId) {
            this.reservedInstanceId = reservedInstanceId;
            return this;
        }
        public java.util.List<String> getReservedInstanceId() {
            return this.reservedInstanceId;
        }

    }

}
