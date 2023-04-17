// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyReservedInstancesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The IDs of the reserved instances.</p>
     */
    @NameInMap("ReservedInstanceIdSets")
    public ModifyReservedInstancesResponseBodyReservedInstanceIdSets reservedInstanceIdSets;

    public static ModifyReservedInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyReservedInstancesResponseBody self = new ModifyReservedInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyReservedInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyReservedInstancesResponseBody setReservedInstanceIdSets(ModifyReservedInstancesResponseBodyReservedInstanceIdSets reservedInstanceIdSets) {
        this.reservedInstanceIdSets = reservedInstanceIdSets;
        return this;
    }
    public ModifyReservedInstancesResponseBodyReservedInstanceIdSets getReservedInstanceIdSets() {
        return this.reservedInstanceIdSets;
    }

    public static class ModifyReservedInstancesResponseBodyReservedInstanceIdSets extends TeaModel {
        @NameInMap("ReservedInstanceId")
        public java.util.List<String> reservedInstanceId;

        public static ModifyReservedInstancesResponseBodyReservedInstanceIdSets build(java.util.Map<String, ?> map) throws Exception {
            ModifyReservedInstancesResponseBodyReservedInstanceIdSets self = new ModifyReservedInstancesResponseBodyReservedInstanceIdSets();
            return TeaModel.build(map, self);
        }

        public ModifyReservedInstancesResponseBodyReservedInstanceIdSets setReservedInstanceId(java.util.List<String> reservedInstanceId) {
            this.reservedInstanceId = reservedInstanceId;
            return this;
        }
        public java.util.List<String> getReservedInstanceId() {
            return this.reservedInstanceId;
        }

    }

}
