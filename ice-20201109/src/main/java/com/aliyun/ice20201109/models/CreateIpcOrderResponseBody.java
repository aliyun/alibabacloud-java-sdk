// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateIpcOrderResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("PurchaseStatus")
    public String purchaseStatus;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>36-3C1E-4417-BDB2-1E034F</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateIpcOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIpcOrderResponseBody self = new CreateIpcOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIpcOrderResponseBody setPurchaseStatus(String purchaseStatus) {
        this.purchaseStatus = purchaseStatus;
        return this;
    }
    public String getPurchaseStatus() {
        return this.purchaseStatus;
    }

    public CreateIpcOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
