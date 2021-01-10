// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveRealtimeLogAuthorizedRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("LiveOpenapiReserve")
    public String liveOpenapiReserve;

    public static DescribeLiveRealtimeLogAuthorizedRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveRealtimeLogAuthorizedRequest self = new DescribeLiveRealtimeLogAuthorizedRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveRealtimeLogAuthorizedRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveRealtimeLogAuthorizedRequest setLiveOpenapiReserve(String liveOpenapiReserve) {
        this.liveOpenapiReserve = liveOpenapiReserve;
        return this;
    }
    public String getLiveOpenapiReserve() {
        return this.liveOpenapiReserve;
    }

}
