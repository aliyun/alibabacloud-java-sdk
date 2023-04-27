// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetStructSyncJobDetailRequest extends TeaModel {
    /**
     * <p>The total number of tables.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The error message that is returned.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetStructSyncJobDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStructSyncJobDetailRequest self = new GetStructSyncJobDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetStructSyncJobDetailRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetStructSyncJobDetailRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
