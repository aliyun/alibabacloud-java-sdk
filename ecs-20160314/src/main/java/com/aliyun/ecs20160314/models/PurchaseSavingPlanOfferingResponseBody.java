// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class PurchaseSavingPlanOfferingResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SavingPlanIdSets")
    public java.util.List<String> savingPlanIdSets;

    public static PurchaseSavingPlanOfferingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PurchaseSavingPlanOfferingResponseBody self = new PurchaseSavingPlanOfferingResponseBody();
        return TeaModel.build(map, self);
    }

    public PurchaseSavingPlanOfferingResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public PurchaseSavingPlanOfferingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PurchaseSavingPlanOfferingResponseBody setSavingPlanIdSets(java.util.List<String> savingPlanIdSets) {
        this.savingPlanIdSets = savingPlanIdSets;
        return this;
    }
    public java.util.List<String> getSavingPlanIdSets() {
        return this.savingPlanIdSets;
    }

}
