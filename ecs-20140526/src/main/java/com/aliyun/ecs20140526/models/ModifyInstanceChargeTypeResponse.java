// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceChargeTypeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("OrderId")
    @Validation(required = true)
    public String orderId;

    @NameInMap("FeeOfInstances")
    @Validation(required = true)
    public ModifyInstanceChargeTypeResponseFeeOfInstances feeOfInstances;

    public static ModifyInstanceChargeTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceChargeTypeResponse self = new ModifyInstanceChargeTypeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceChargeTypeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyInstanceChargeTypeResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ModifyInstanceChargeTypeResponse setFeeOfInstances(ModifyInstanceChargeTypeResponseFeeOfInstances feeOfInstances) {
        this.feeOfInstances = feeOfInstances;
        return this;
    }
    public ModifyInstanceChargeTypeResponseFeeOfInstances getFeeOfInstances() {
        return this.feeOfInstances;
    }

    public static class ModifyInstanceChargeTypeResponseFeeOfInstancesFeeOfInstance extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Fee")
        @Validation(required = true)
        public String fee;

        @NameInMap("Currency")
        @Validation(required = true)
        public String currency;

        public static ModifyInstanceChargeTypeResponseFeeOfInstancesFeeOfInstance build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceChargeTypeResponseFeeOfInstancesFeeOfInstance self = new ModifyInstanceChargeTypeResponseFeeOfInstancesFeeOfInstance();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceChargeTypeResponseFeeOfInstancesFeeOfInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyInstanceChargeTypeResponseFeeOfInstancesFeeOfInstance setFee(String fee) {
            this.fee = fee;
            return this;
        }
        public String getFee() {
            return this.fee;
        }

        public ModifyInstanceChargeTypeResponseFeeOfInstancesFeeOfInstance setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

    }

    public static class ModifyInstanceChargeTypeResponseFeeOfInstances extends TeaModel {
        @NameInMap("FeeOfInstance")
        @Validation(required = true)
        public java.util.List<ModifyInstanceChargeTypeResponseFeeOfInstancesFeeOfInstance> feeOfInstance;

        public static ModifyInstanceChargeTypeResponseFeeOfInstances build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceChargeTypeResponseFeeOfInstances self = new ModifyInstanceChargeTypeResponseFeeOfInstances();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceChargeTypeResponseFeeOfInstances setFeeOfInstance(java.util.List<ModifyInstanceChargeTypeResponseFeeOfInstancesFeeOfInstance> feeOfInstance) {
            this.feeOfInstance = feeOfInstance;
            return this;
        }
        public java.util.List<ModifyInstanceChargeTypeResponseFeeOfInstancesFeeOfInstance> getFeeOfInstance() {
            return this.feeOfInstance;
        }

    }

}
