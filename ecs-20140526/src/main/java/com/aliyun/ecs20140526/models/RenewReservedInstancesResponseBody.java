// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RenewReservedInstancesResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The IDs of the reserved instances.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the reserved instance.</p>
     */
    @NameInMap("ReservedInstanceIdSets")
    public RenewReservedInstancesResponseBodyReservedInstanceIdSets reservedInstanceIdSets;

    public static RenewReservedInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewReservedInstancesResponseBody self = new RenewReservedInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewReservedInstancesResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public RenewReservedInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RenewReservedInstancesResponseBody setReservedInstanceIdSets(RenewReservedInstancesResponseBodyReservedInstanceIdSets reservedInstanceIdSets) {
        this.reservedInstanceIdSets = reservedInstanceIdSets;
        return this;
    }
    public RenewReservedInstancesResponseBodyReservedInstanceIdSets getReservedInstanceIdSets() {
        return this.reservedInstanceIdSets;
    }

    public static class RenewReservedInstancesResponseBodyReservedInstanceIdSets extends TeaModel {
        @NameInMap("ReservedInstanceId")
        public java.util.List<String> reservedInstanceId;

        public static RenewReservedInstancesResponseBodyReservedInstanceIdSets build(java.util.Map<String, ?> map) throws Exception {
            RenewReservedInstancesResponseBodyReservedInstanceIdSets self = new RenewReservedInstancesResponseBodyReservedInstanceIdSets();
            return TeaModel.build(map, self);
        }

        public RenewReservedInstancesResponseBodyReservedInstanceIdSets setReservedInstanceId(java.util.List<String> reservedInstanceId) {
            this.reservedInstanceId = reservedInstanceId;
            return this;
        }
        public java.util.List<String> getReservedInstanceId() {
            return this.reservedInstanceId;
        }

    }

}
