// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SkipDataCorrectRowCheckRequest extends TeaModel {
    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("Tid")
    public Long tid;

    public static SkipDataCorrectRowCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        SkipDataCorrectRowCheckRequest self = new SkipDataCorrectRowCheckRequest();
        return TeaModel.build(map, self);
    }

    public SkipDataCorrectRowCheckRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public SkipDataCorrectRowCheckRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public SkipDataCorrectRowCheckRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
