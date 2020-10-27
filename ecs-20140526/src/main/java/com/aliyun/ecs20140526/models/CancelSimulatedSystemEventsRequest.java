// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CancelSimulatedSystemEventsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("EventId")
    @Validation(required = true)
    public java.util.List<String> eventId;

    public static CancelSimulatedSystemEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelSimulatedSystemEventsRequest self = new CancelSimulatedSystemEventsRequest();
        return TeaModel.build(map, self);
    }

    public CancelSimulatedSystemEventsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CancelSimulatedSystemEventsRequest setEventId(java.util.List<String> eventId) {
        this.eventId = eventId;
        return this;
    }
    public java.util.List<String> getEventId() {
        return this.eventId;
    }

}
