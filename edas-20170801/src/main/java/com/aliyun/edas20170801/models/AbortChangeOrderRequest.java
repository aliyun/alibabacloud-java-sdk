// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class AbortChangeOrderRequest extends TeaModel {
    /**
     * <p>The ID of the change process. You can call the [GetChangeOrderInfo](~~62072~~) operation to query the change process ID.</p>
     */
    @NameInMap("ChangeOrderId")
    public String changeOrderId;

    public static AbortChangeOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        AbortChangeOrderRequest self = new AbortChangeOrderRequest();
        return TeaModel.build(map, self);
    }

    public AbortChangeOrderRequest setChangeOrderId(String changeOrderId) {
        this.changeOrderId = changeOrderId;
        return this;
    }
    public String getChangeOrderId() {
        return this.changeOrderId;
    }

}
