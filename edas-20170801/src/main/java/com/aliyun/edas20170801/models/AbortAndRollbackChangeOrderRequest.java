// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class AbortAndRollbackChangeOrderRequest extends TeaModel {
    /**
     * <p>The ID of the change process.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6b55106c-c7f2-40f7-a1d4-092870*****</p>
     */
    @NameInMap("ChangeOrderId")
    public String changeOrderId;

    public static AbortAndRollbackChangeOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        AbortAndRollbackChangeOrderRequest self = new AbortAndRollbackChangeOrderRequest();
        return TeaModel.build(map, self);
    }

    public AbortAndRollbackChangeOrderRequest setChangeOrderId(String changeOrderId) {
        this.changeOrderId = changeOrderId;
        return this;
    }
    public String getChangeOrderId() {
        return this.changeOrderId;
    }

}
