// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyReservedInstancesResponseBody extends TeaModel {
    @NameInMap("ReservedInstanceIdSets")
    public java.util.List<String> reservedInstanceIdSets;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyReservedInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyReservedInstancesResponseBody self = new ModifyReservedInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyReservedInstancesResponseBody setReservedInstanceIdSets(java.util.List<String> reservedInstanceIdSets) {
        this.reservedInstanceIdSets = reservedInstanceIdSets;
        return this;
    }
    public java.util.List<String> getReservedInstanceIdSets() {
        return this.reservedInstanceIdSets;
    }

    public ModifyReservedInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
