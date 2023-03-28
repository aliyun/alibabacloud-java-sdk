// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostsChargeTypeResponseBody extends TeaModel {
    @NameInMap("FeeOfInstances")
    public ModifyDedicatedHostsChargeTypeResponseBodyFeeOfInstances feeOfInstances;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDedicatedHostsChargeTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostsChargeTypeResponseBody self = new ModifyDedicatedHostsChargeTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostsChargeTypeResponseBody setFeeOfInstances(ModifyDedicatedHostsChargeTypeResponseBodyFeeOfInstances feeOfInstances) {
        this.feeOfInstances = feeOfInstances;
        return this;
    }
    public ModifyDedicatedHostsChargeTypeResponseBodyFeeOfInstances getFeeOfInstances() {
        return this.feeOfInstances;
    }

    public ModifyDedicatedHostsChargeTypeResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ModifyDedicatedHostsChargeTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyDedicatedHostsChargeTypeResponseBodyFeeOfInstancesFeeOfInstance extends TeaModel {
        @NameInMap("Currency")
        public String currency;

        @NameInMap("Fee")
        public String fee;

        @NameInMap("InstanceId")
        public String instanceId;

        public static ModifyDedicatedHostsChargeTypeResponseBodyFeeOfInstancesFeeOfInstance build(java.util.Map<String, ?> map) throws Exception {
            ModifyDedicatedHostsChargeTypeResponseBodyFeeOfInstancesFeeOfInstance self = new ModifyDedicatedHostsChargeTypeResponseBodyFeeOfInstancesFeeOfInstance();
            return TeaModel.build(map, self);
        }

        public ModifyDedicatedHostsChargeTypeResponseBodyFeeOfInstancesFeeOfInstance setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public ModifyDedicatedHostsChargeTypeResponseBodyFeeOfInstancesFeeOfInstance setFee(String fee) {
            this.fee = fee;
            return this;
        }
        public String getFee() {
            return this.fee;
        }

        public ModifyDedicatedHostsChargeTypeResponseBodyFeeOfInstancesFeeOfInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class ModifyDedicatedHostsChargeTypeResponseBodyFeeOfInstances extends TeaModel {
        @NameInMap("FeeOfInstance")
        public java.util.List<ModifyDedicatedHostsChargeTypeResponseBodyFeeOfInstancesFeeOfInstance> feeOfInstance;

        public static ModifyDedicatedHostsChargeTypeResponseBodyFeeOfInstances build(java.util.Map<String, ?> map) throws Exception {
            ModifyDedicatedHostsChargeTypeResponseBodyFeeOfInstances self = new ModifyDedicatedHostsChargeTypeResponseBodyFeeOfInstances();
            return TeaModel.build(map, self);
        }

        public ModifyDedicatedHostsChargeTypeResponseBodyFeeOfInstances setFeeOfInstance(java.util.List<ModifyDedicatedHostsChargeTypeResponseBodyFeeOfInstancesFeeOfInstance> feeOfInstance) {
            this.feeOfInstance = feeOfInstance;
            return this;
        }
        public java.util.List<ModifyDedicatedHostsChargeTypeResponseBodyFeeOfInstancesFeeOfInstance> getFeeOfInstance() {
            return this.feeOfInstance;
        }

    }

}
