// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDDLPublishRecordsRequest extends TeaModel {
    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("Tid")
    public Long tid;

    public static ListDDLPublishRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDDLPublishRecordsRequest self = new ListDDLPublishRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListDDLPublishRecordsRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ListDDLPublishRecordsRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
