// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class RollbackChangeOrderRequest extends TeaModel {
    /**
     * <p>The ID of the change process.</p>
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
