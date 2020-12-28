// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceChargeTypeResponseBody extends TeaModel {
    @NameInMap("FeeOfInstances")
    public java.util.List<ModifyInstanceChargeTypeResponseBodyFeeOfInstances> feeOfInstances;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OrderId")
    public String orderId;

    public static ModifyInstanceChargeTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceChargeTypeResponseBody self = new ModifyInstanceChargeTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceChargeTypeResponseBody setFeeOfInstances(java.util.List<ModifyInstanceChargeTypeResponseBodyFeeOfInstances> feeOfInstances) {
        this.feeOfInstances = feeOfInstances;
        return this;
    }
    public java.util.List<ModifyInstanceChargeTypeResponseBodyFeeOfInstances> getFeeOfInstances() {
        return this.feeOfInstances;
    }

    public ModifyInstanceChargeTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyInstanceChargeTypeResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public static class ModifyInstanceChargeTypeResponseBodyFeeOfInstances extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("Fee")
        public String fee;

        public static ModifyInstanceChargeTypeResponseBodyFeeOfInstances build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceChargeTypeResponseBodyFeeOfInstances self = new ModifyInstanceChargeTypeResponseBodyFeeOfInstances();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceChargeTypeResponseBodyFeeOfInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyInstanceChargeTypeResponseBodyFeeOfInstances setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public ModifyInstanceChargeTypeResponseBodyFeeOfInstances setFee(String fee) {
            this.fee = fee;
            return this;
        }
        public String getFee() {
            return this.fee;
        }

    }

}
