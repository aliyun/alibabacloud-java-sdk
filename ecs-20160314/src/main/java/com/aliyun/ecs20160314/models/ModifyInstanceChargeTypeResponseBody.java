// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyInstanceChargeTypeResponseBody extends TeaModel {
    @NameInMap("FeeOfInstances")
    public FeeOfInstances feeOfInstances;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceChargeTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceChargeTypeResponseBody self = new ModifyInstanceChargeTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceChargeTypeResponseBody setFeeOfInstances(FeeOfInstances feeOfInstances) {
        this.feeOfInstances = feeOfInstances;
        return this;
    }
    public FeeOfInstances getFeeOfInstances() {
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

    public static class FeeOfInstance extends TeaModel {
        @NameInMap("Currency")
        public String currency;

        @NameInMap("Fee")
        public String fee;

        @NameInMap("InstanceId")
        public String instanceId;

        public static FeeOfInstance build(java.util.Map<String, ?> map) throws Exception {
            FeeOfInstance self = new FeeOfInstance();
            return TeaModel.build(map, self);
        }

        public FeeOfInstance setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public FeeOfInstance setFee(String fee) {
            this.fee = fee;
            return this;
        }
        public String getFee() {
            return this.fee;
        }

        public FeeOfInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class FeeOfInstances extends TeaModel {
        @NameInMap("FeeOfInstance")
        public java.util.List<FeeOfInstance> feeOfInstance;

        public static FeeOfInstances build(java.util.Map<String, ?> map) throws Exception {
            FeeOfInstances self = new FeeOfInstances();
            return TeaModel.build(map, self);
        }

        public FeeOfInstances setFeeOfInstance(java.util.List<FeeOfInstance> feeOfInstance) {
            this.feeOfInstance = feeOfInstance;
            return this;
        }
        public java.util.List<FeeOfInstance> getFeeOfInstance() {
            return this.feeOfInstance;
        }

    }

}
