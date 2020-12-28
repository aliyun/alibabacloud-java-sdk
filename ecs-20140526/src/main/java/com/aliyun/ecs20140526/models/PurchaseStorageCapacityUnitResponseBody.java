// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class PurchaseStorageCapacityUnitResponseBody extends TeaModel {
    @NameInMap("StorageCapacityUnitIds")
    public java.util.List<String> storageCapacityUnitIds;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OrderId")
    public String orderId;

    public static PurchaseStorageCapacityUnitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PurchaseStorageCapacityUnitResponseBody self = new PurchaseStorageCapacityUnitResponseBody();
        return TeaModel.build(map, self);
    }

    public PurchaseStorageCapacityUnitResponseBody setStorageCapacityUnitIds(java.util.List<String> storageCapacityUnitIds) {
        this.storageCapacityUnitIds = storageCapacityUnitIds;
        return this;
    }
    public java.util.List<String> getStorageCapacityUnitIds() {
        return this.storageCapacityUnitIds;
    }

    public PurchaseStorageCapacityUnitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PurchaseStorageCapacityUnitResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
