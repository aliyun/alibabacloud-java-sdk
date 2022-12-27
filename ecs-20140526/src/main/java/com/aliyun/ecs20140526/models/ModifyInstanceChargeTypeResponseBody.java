// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceChargeTypeResponseBody extends TeaModel {
    // Details about the charges for the order.
    @NameInMap("FeeOfInstances")
    public ModifyInstanceChargeTypeResponseBodyFeeOfInstances feeOfInstances;

    // The ID of the order.
    @NameInMap("OrderId")
    public String orderId;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceChargeTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceChargeTypeResponseBody self = new ModifyInstanceChargeTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceChargeTypeResponseBody setFeeOfInstances(ModifyInstanceChargeTypeResponseBodyFeeOfInstances feeOfInstances) {
        this.feeOfInstances = feeOfInstances;
        return this;
    }
    public ModifyInstanceChargeTypeResponseBodyFeeOfInstances getFeeOfInstances() {
        return this.feeOfInstances;
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

    public static class ModifyInstanceChargeTypeResponseBodyFeeOfInstancesFeeOfInstance extends TeaModel {
        // The unit of currency for the bill.
        // 
        // Alibaba Cloud China site (aliyun.com): CNY.
        // 
        // Alibaba Cloud International site (alibabacloud.com): USD.
        @NameInMap("Currency")
        public String currency;

        // The cost value.
        @NameInMap("Fee")
        public String fee;

        // The ID of the instance.
        @NameInMap("InstanceId")
        public String instanceId;

        public static ModifyInstanceChargeTypeResponseBodyFeeOfInstancesFeeOfInstance build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceChargeTypeResponseBodyFeeOfInstancesFeeOfInstance self = new ModifyInstanceChargeTypeResponseBodyFeeOfInstancesFeeOfInstance();
            return TeaModel.build(map, self);
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

        public ModifyInstanceChargeTypeResponseBodyFeeOfInstancesFeeOfInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
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
