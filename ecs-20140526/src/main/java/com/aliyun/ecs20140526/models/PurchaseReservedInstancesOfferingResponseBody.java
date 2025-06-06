// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class PurchaseReservedInstancesOfferingResponseBody extends TeaModel {
    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>23841229****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8C314443-AF0D-4766-9562-C83B7F1A3C8B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The IDs of the reserved instances.</p>
     */
    @NameInMap("ReservedInstanceIdSets")
    public PurchaseReservedInstancesOfferingResponseBodyReservedInstanceIdSets reservedInstanceIdSets;

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

    public PurchaseReservedInstancesOfferingResponseBody setReservedInstanceIdSets(PurchaseReservedInstancesOfferingResponseBodyReservedInstanceIdSets reservedInstanceIdSets) {
        this.reservedInstanceIdSets = reservedInstanceIdSets;
        return this;
    }
    public PurchaseReservedInstancesOfferingResponseBodyReservedInstanceIdSets getReservedInstanceIdSets() {
        return this.reservedInstanceIdSets;
    }

    public static class PurchaseReservedInstancesOfferingResponseBodyReservedInstanceIdSets extends TeaModel {
        @NameInMap("ReservedInstanceId")
        public java.util.List<String> reservedInstanceId;

        public static PurchaseReservedInstancesOfferingResponseBodyReservedInstanceIdSets build(java.util.Map<String, ?> map) throws Exception {
            PurchaseReservedInstancesOfferingResponseBodyReservedInstanceIdSets self = new PurchaseReservedInstancesOfferingResponseBodyReservedInstanceIdSets();
            return TeaModel.build(map, self);
        }

        public PurchaseReservedInstancesOfferingResponseBodyReservedInstanceIdSets setReservedInstanceId(java.util.List<String> reservedInstanceId) {
            this.reservedInstanceId = reservedInstanceId;
            return this;
        }
        public java.util.List<String> getReservedInstanceId() {
            return this.reservedInstanceId;
        }

    }

}
