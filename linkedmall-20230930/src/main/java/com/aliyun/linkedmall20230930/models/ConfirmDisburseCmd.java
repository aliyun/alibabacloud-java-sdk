// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ConfirmDisburseCmd extends TeaModel {
    @NameInMap("orderId")
    public String orderId;

    @NameInMap("purchaseOrderId")
    public String purchaseOrderId;

    public static ConfirmDisburseCmd build(java.util.Map<String, ?> map) throws Exception {
        ConfirmDisburseCmd self = new ConfirmDisburseCmd();
        return TeaModel.build(map, self);
    }

    public ConfirmDisburseCmd setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ConfirmDisburseCmd setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
        return this;
    }
    public String getPurchaseOrderId() {
        return this.purchaseOrderId;
    }

}
