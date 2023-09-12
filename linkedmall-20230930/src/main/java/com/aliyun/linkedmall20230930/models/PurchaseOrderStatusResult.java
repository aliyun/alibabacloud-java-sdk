// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class PurchaseOrderStatusResult extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("status")
    public String status;

    public static PurchaseOrderStatusResult build(java.util.Map<String, ?> map) throws Exception {
        PurchaseOrderStatusResult self = new PurchaseOrderStatusResult();
        return TeaModel.build(map, self);
    }

    public PurchaseOrderStatusResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PurchaseOrderStatusResult setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
