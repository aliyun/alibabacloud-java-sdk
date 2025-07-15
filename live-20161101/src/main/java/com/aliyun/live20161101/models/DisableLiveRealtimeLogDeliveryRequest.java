// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DisableLiveRealtimeLogDeliveryRequest extends TeaModel {
    /**
     * <p>The streaming domain for which you want to suspend real-time log delivery. Separate multiple streaming domains with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    public static DisableLiveRealtimeLogDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableLiveRealtimeLogDeliveryRequest self = new DisableLiveRealtimeLogDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public DisableLiveRealtimeLogDeliveryRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DisableLiveRealtimeLogDeliveryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DisableLiveRealtimeLogDeliveryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
