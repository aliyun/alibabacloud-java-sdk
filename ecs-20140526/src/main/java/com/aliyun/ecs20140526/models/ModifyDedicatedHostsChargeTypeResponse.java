// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostsChargeTypeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("OrderId")
    @Validation(required = true)
    public String orderId;

    @NameInMap("FeeOfInstances")
    @Validation(required = true)
    public ModifyDedicatedHostsChargeTypeResponseFeeOfInstances feeOfInstances;

    public static ModifyDedicatedHostsChargeTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostsChargeTypeResponse self = new ModifyDedicatedHostsChargeTypeResponse();
        return TeaModel.build(map, self);
    }

    public static class ModifyDedicatedHostsChargeTypeResponseFeeOfInstancesFeeOfInstance extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Fee")
        @Validation(required = true)
        public String fee;

        @NameInMap("Currency")
        @Validation(required = true)
        public String currency;

        public static ModifyDedicatedHostsChargeTypeResponseFeeOfInstancesFeeOfInstance build(java.util.Map<String, ?> map) throws Exception {
            ModifyDedicatedHostsChargeTypeResponseFeeOfInstancesFeeOfInstance self = new ModifyDedicatedHostsChargeTypeResponseFeeOfInstancesFeeOfInstance();
            return TeaModel.build(map, self);
        }

    }

    public static class ModifyDedicatedHostsChargeTypeResponseFeeOfInstances extends TeaModel {
        @NameInMap("FeeOfInstance")
        @Validation(required = true)
        public java.util.List<ModifyDedicatedHostsChargeTypeResponseFeeOfInstancesFeeOfInstance> feeOfInstance;

        public static ModifyDedicatedHostsChargeTypeResponseFeeOfInstances build(java.util.Map<String, ?> map) throws Exception {
            ModifyDedicatedHostsChargeTypeResponseFeeOfInstances self = new ModifyDedicatedHostsChargeTypeResponseFeeOfInstances();
            return TeaModel.build(map, self);
        }

    }

}
