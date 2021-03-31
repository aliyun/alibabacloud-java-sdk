// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class PurchaseStorageCapacityUnitResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("OrderId")
    @Validation(required = true)
    public String orderId;

    @NameInMap("StorageCapacityUnitIds")
    @Validation(required = true)
    public PurchaseStorageCapacityUnitResponseStorageCapacityUnitIds storageCapacityUnitIds;

    public static PurchaseStorageCapacityUnitResponse build(java.util.Map<String, ?> map) throws Exception {
        PurchaseStorageCapacityUnitResponse self = new PurchaseStorageCapacityUnitResponse();
        return TeaModel.build(map, self);
    }

    public PurchaseStorageCapacityUnitResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PurchaseStorageCapacityUnitResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public PurchaseStorageCapacityUnitResponse setStorageCapacityUnitIds(PurchaseStorageCapacityUnitResponseStorageCapacityUnitIds storageCapacityUnitIds) {
        this.storageCapacityUnitIds = storageCapacityUnitIds;
        return this;
    }
    public PurchaseStorageCapacityUnitResponseStorageCapacityUnitIds getStorageCapacityUnitIds() {
        return this.storageCapacityUnitIds;
    }

    public static class PurchaseStorageCapacityUnitResponseStorageCapacityUnitIds extends TeaModel {
        @NameInMap("StorageCapacityUnitId")
        @Validation(required = true)
        public java.util.List<String> storageCapacityUnitId;

        public static PurchaseStorageCapacityUnitResponseStorageCapacityUnitIds build(java.util.Map<String, ?> map) throws Exception {
            PurchaseStorageCapacityUnitResponseStorageCapacityUnitIds self = new PurchaseStorageCapacityUnitResponseStorageCapacityUnitIds();
            return TeaModel.build(map, self);
        }

        public PurchaseStorageCapacityUnitResponseStorageCapacityUnitIds setStorageCapacityUnitId(java.util.List<String> storageCapacityUnitId) {
            this.storageCapacityUnitId = storageCapacityUnitId;
            return this;
        }
        public java.util.List<String> getStorageCapacityUnitId() {
            return this.storageCapacityUnitId;
        }

    }

}
