// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ExecuteStructSyncRequest extends TeaModel {
    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("Tid")
    public Long tid;

    public static ExecuteStructSyncRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteStructSyncRequest self = new ExecuteStructSyncRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteStructSyncRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ExecuteStructSyncRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
