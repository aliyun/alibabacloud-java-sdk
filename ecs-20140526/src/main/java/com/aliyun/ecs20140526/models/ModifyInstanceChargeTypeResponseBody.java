// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceChargeTypeResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FeeOfInstances")
    public ModifyInstanceChargeTypeResponseBodyFeeOfInstances feeOfInstances;

    public static ModifyInstanceChargeTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceChargeTypeResponseBody self = new ModifyInstanceChargeTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceChargeTypeResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ModifyInstanceChargeTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyInstanceChargeTypeResponseBody setFeeOfInstances(ModifyInstanceChargeTypeResponseBodyFeeOfInstances feeOfInstances) {
        this.feeOfInstances = feeOfInstances;
        return this;
    }
    public ModifyInstanceChargeTypeResponseBodyFeeOfInstances getFeeOfInstances() {
        return this.feeOfInstances;
    }

    public static class ModifyInstanceChargeTypeResponseBodyFeeOfInstancesFeeOfInstance extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("Fee")
        public String fee;

        public static ModifyInstanceChargeTypeResponseBodyFeeOfInstancesFeeOfInstance build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceChargeTypeResponseBodyFeeOfInstancesFeeOfInstance self = new ModifyInstanceChargeTypeResponseBodyFeeOfInstancesFeeOfInstance();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceChargeTypeResponseBodyFeeOfInstancesFeeOfInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyInstanceChargeTypeResponseBodyFeeOfInstancesFeeOfInstance setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public ModifyInstanceChargeTypeResponseBodyFeeOfInstancesFeeOfInstance setFee(String fee) {
            this.fee = fee;
            return this;
        }
        public String getFee() {
            return this.fee;
        }

    }

    public static class ModifyInstanceChargeTypeResponseBodyFeeOfInstances extends TeaModel {
        @NameInMap("FeeOfInstance")
        public java.util.List<ModifyInstanceChargeTypeResponseBodyFeeOfInstancesFeeOfInstance> feeOfInstance;

        public static ModifyInstanceChargeTypeResponseBodyFeeOfInstances build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceChargeTypeResponseBodyFeeOfInstances self = new ModifyInstanceChargeTypeResponseBodyFeeOfInstances();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceChargeTypeResponseBodyFeeOfInstances setFeeOfInstance(java.util.List<ModifyInstanceChargeTypeResponseBodyFeeOfInstancesFeeOfInstance> feeOfInstance) {
            this.feeOfInstance = feeOfInstance;
            return this;
        }
        public java.util.List<ModifyInstanceChargeTypeResponseBodyFeeOfInstancesFeeOfInstance> getFeeOfInstance() {
            return this.feeOfInstance;
        }

    }

}
