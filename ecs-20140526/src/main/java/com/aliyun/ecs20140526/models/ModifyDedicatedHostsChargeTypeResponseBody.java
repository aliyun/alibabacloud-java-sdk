// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostsChargeTypeResponseBody extends TeaModel {
    @NameInMap("FeeOfInstances")
    public java.util.List<ModifyDedicatedHostsChargeTypeResponseBodyFeeOfInstances> feeOfInstances;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OrderId")
    public String orderId;

    public static ModifyDedicatedHostsChargeTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostsChargeTypeResponseBody self = new ModifyDedicatedHostsChargeTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostsChargeTypeResponseBody setFeeOfInstances(java.util.List<ModifyDedicatedHostsChargeTypeResponseBodyFeeOfInstances> feeOfInstances) {
        this.feeOfInstances = feeOfInstances;
        return this;
    }
    public java.util.List<ModifyDedicatedHostsChargeTypeResponseBodyFeeOfInstances> getFeeOfInstances() {
        return this.feeOfInstances;
    }

    public ModifyDedicatedHostsChargeTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDedicatedHostsChargeTypeResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public static class ModifyDedicatedHostsChargeTypeResponseBodyFeeOfInstances extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("Fee")
        public String fee;

        public static ModifyDedicatedHostsChargeTypeResponseBodyFeeOfInstances build(java.util.Map<String, ?> map) throws Exception {
            ModifyDedicatedHostsChargeTypeResponseBodyFeeOfInstances self = new ModifyDedicatedHostsChargeTypeResponseBodyFeeOfInstances();
            return TeaModel.build(map, self);
        }

        public ModifyDedicatedHostsChargeTypeResponseBodyFeeOfInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyDedicatedHostsChargeTypeResponseBodyFeeOfInstances setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public ModifyDedicatedHostsChargeTypeResponseBodyFeeOfInstances setFee(String fee) {
            this.fee = fee;
            return this;
        }
        public String getFee() {
            return this.fee;
        }

    }

}
