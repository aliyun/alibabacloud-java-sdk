// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ListRealtimeLogDeliveryInfosRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static ListRealtimeLogDeliveryInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRealtimeLogDeliveryInfosRequest self = new ListRealtimeLogDeliveryInfosRequest();
        return TeaModel.build(map, self);
    }

    public ListRealtimeLogDeliveryInfosRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
