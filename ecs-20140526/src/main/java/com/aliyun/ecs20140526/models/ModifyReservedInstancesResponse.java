// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyReservedInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ReservedInstanceIdSets")
    @Validation(required = true)
    public ModifyReservedInstancesResponseReservedInstanceIdSets reservedInstanceIdSets;

    public static ModifyReservedInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyReservedInstancesResponse self = new ModifyReservedInstancesResponse();
        return TeaModel.build(map, self);
    }

    public static class ModifyReservedInstancesResponseReservedInstanceIdSets extends TeaModel {
        @NameInMap("ReservedInstanceId")
        @Validation(required = true)
        public java.util.List<String> reservedInstanceId;

        public static ModifyReservedInstancesResponseReservedInstanceIdSets build(java.util.Map<String, ?> map) throws Exception {
            ModifyReservedInstancesResponseReservedInstanceIdSets self = new ModifyReservedInstancesResponseReservedInstanceIdSets();
            return TeaModel.build(map, self);
        }

    }

}
