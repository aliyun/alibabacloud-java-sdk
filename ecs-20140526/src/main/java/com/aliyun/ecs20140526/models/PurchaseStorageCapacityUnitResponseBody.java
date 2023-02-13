// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class PurchaseStorageCapacityUnitResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StorageCapacityUnitIds")
    public PurchaseStorageCapacityUnitResponseBodyStorageCapacityUnitIds storageCapacityUnitIds;

    public static PurchaseStorageCapacityUnitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PurchaseStorageCapacityUnitResponseBody self = new PurchaseStorageCapacityUnitResponseBody();
        return TeaModel.build(map, self);
    }

    public PurchaseStorageCapacityUnitResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public PurchaseStorageCapacityUnitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PurchaseStorageCapacityUnitResponseBody setStorageCapacityUnitIds(PurchaseStorageCapacityUnitResponseBodyStorageCapacityUnitIds storageCapacityUnitIds) {
        this.storageCapacityUnitIds = storageCapacityUnitIds;
        return this;
    }
    public PurchaseStorageCapacityUnitResponseBodyStorageCapacityUnitIds getStorageCapacityUnitIds() {
        return this.storageCapacityUnitIds;
    }

    public static class PurchaseStorageCapacityUnitResponseBodyStorageCapacityUnitIds extends TeaModel {
        @NameInMap("StorageCapacityUnitId")
        public java.util.List<String> storageCapacityUnitId;

        public static PurchaseStorageCapacityUnitResponseBodyStorageCapacityUnitIds build(java.util.Map<String, ?> map) throws Exception {
            PurchaseStorageCapacityUnitResponseBodyStorageCapacityUnitIds self = new PurchaseStorageCapacityUnitResponseBodyStorageCapacityUnitIds();
            return TeaModel.build(map, self);
        }

        public PurchaseStorageCapacityUnitResponseBodyStorageCapacityUnitIds setStorageCapacityUnitId(java.util.List<String> storageCapacityUnitId) {
            this.storageCapacityUnitId = storageCapacityUnitId;
            return this;
        }
        public java.util.List<String> getStorageCapacityUnitId() {
            return this.storageCapacityUnitId;
        }

    }

}
