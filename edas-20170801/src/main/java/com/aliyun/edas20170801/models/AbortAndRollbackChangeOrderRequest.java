// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class AbortAndRollbackChangeOrderRequest extends TeaModel {
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
