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

    public ModifyDedicatedHostsChargeTypeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDedicatedHostsChargeTypeResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ModifyDedicatedHostsChargeTypeResponse setFeeOfInstances(ModifyDedicatedHostsChargeTypeResponseFeeOfInstances feeOfInstances) {
        this.feeOfInstances = feeOfInstances;
        return this;
    }
    public ModifyDedicatedHostsChargeTypeResponseFeeOfInstances getFeeOfInstances() {
        return this.feeOfInstances;
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

        public ModifyDedicatedHostsChargeTypeResponseFeeOfInstancesFeeOfInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyDedicatedHostsChargeTypeResponseFeeOfInstancesFeeOfInstance setFee(String fee) {
            this.fee = fee;
            return this;
        }
        public String getFee() {
            return this.fee;
        }

        public ModifyDedicatedHostsChargeTypeResponseFeeOfInstancesFeeOfInstance setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
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

        public ModifyDedicatedHostsChargeTypeResponseFeeOfInstances setFeeOfInstance(java.util.List<ModifyDedicatedHostsChargeTypeResponseFeeOfInstancesFeeOfInstance> feeOfInstance) {
            this.feeOfInstance = feeOfInstance;
            return this;
        }
        public java.util.List<ModifyDedicatedHostsChargeTypeResponseFeeOfInstancesFeeOfInstance> getFeeOfInstance() {
            return this.feeOfInstance;
        }

    }

}
