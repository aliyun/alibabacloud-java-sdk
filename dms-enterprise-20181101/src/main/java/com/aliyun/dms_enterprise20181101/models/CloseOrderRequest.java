// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CloseOrderRequest extends TeaModel {
    @NameInMap("Tid")
    public Long tid;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("CloseReason")
    public String closeReason;

    public static CloseOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseOrderRequest self = new CloseOrderRequest();
        return TeaModel.build(map, self);
    }

    public CloseOrderRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public CloseOrderRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public CloseOrderRequest setCloseReason(String closeReason) {
        this.closeReason = closeReason;
        return this;
    }
    public String getCloseReason() {
        return this.closeReason;
    }

}
