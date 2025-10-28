// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class RollbackChangeOrderRequest extends TeaModel {
    /**
     * <p>The ID of the change process.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dc5133d7-773f-4c81-<strong><strong>-e2103dce</strong></strong></p>
     */
    @NameInMap("ChangeOrderId")
    public String changeOrderId;

    public static RollbackChangeOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackChangeOrderRequest self = new RollbackChangeOrderRequest();
        return TeaModel.build(map, self);
    }

    public RollbackChangeOrderRequest setChangeOrderId(String changeOrderId) {
        this.changeOrderId = changeOrderId;
        return this;
    }
    public String getChangeOrderId() {
        return this.changeOrderId;
    }

}
