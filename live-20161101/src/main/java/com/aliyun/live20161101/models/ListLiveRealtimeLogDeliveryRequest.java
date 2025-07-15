// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveRealtimeLogDeliveryRequest extends TeaModel {
    /**
     * <p>This parameter has no practical significance.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LiveOpenapiReserve")
    public String liveOpenapiReserve;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    public static ListLiveRealtimeLogDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRealtimeLogDeliveryRequest self = new ListLiveRealtimeLogDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public ListLiveRealtimeLogDeliveryRequest setLiveOpenapiReserve(String liveOpenapiReserve) {
        this.liveOpenapiReserve = liveOpenapiReserve;
        return this;
    }
    public String getLiveOpenapiReserve() {
        return this.liveOpenapiReserve;
    }

    public ListLiveRealtimeLogDeliveryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListLiveRealtimeLogDeliveryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
