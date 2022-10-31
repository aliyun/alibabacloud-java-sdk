// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveRealtimeLogDeliveryInfosRequest extends TeaModel {
    @NameInMap("LiveOpenapiReserve")
    public String liveOpenapiReserve;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static ListLiveRealtimeLogDeliveryInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRealtimeLogDeliveryInfosRequest self = new ListLiveRealtimeLogDeliveryInfosRequest();
        return TeaModel.build(map, self);
    }

    public ListLiveRealtimeLogDeliveryInfosRequest setLiveOpenapiReserve(String liveOpenapiReserve) {
        this.liveOpenapiReserve = liveOpenapiReserve;
        return this;
    }
    public String getLiveOpenapiReserve() {
        return this.liveOpenapiReserve;
    }

    public ListLiveRealtimeLogDeliveryInfosRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
