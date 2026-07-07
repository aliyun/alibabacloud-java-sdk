// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class PurchaseOrderCreateResult extends TeaModel {
    /**
     * <p>Purchase Order ID</p>
     * 
     * <strong>example:</strong>
     * <p>6692****5696</p>
     */
    @NameInMap("purchaseOrderId")
    public String purchaseOrderId;

    /**
     * <p>API Request requestId</p>
     * 
     * <strong>example:</strong>
     * <p>841471F6-5D61-1331-8C38-2****B55</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static PurchaseOrderCreateResult build(java.util.Map<String, ?> map) throws Exception {
        PurchaseOrderCreateResult self = new PurchaseOrderCreateResult();
        return TeaModel.build(map, self);
    }

    public PurchaseOrderCreateResult setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
        return this;
    }
    public String getPurchaseOrderId() {
        return this.purchaseOrderId;
    }

    public PurchaseOrderCreateResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
