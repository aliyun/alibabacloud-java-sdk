// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class PurchaseStorageCapacityUnitResponseBody extends TeaModel {
    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>204135153880****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The IDs of the SCUs.</p>
     */
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
