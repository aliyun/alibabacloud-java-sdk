// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class PutEventRequest extends TeaModel {
    @NameInMap("EventInfo")
    public String eventInfo;

    @NameInMap("RegionId")
    public String regionId;

    public static PutEventRequest build(java.util.Map<String, ?> map) throws Exception {
        PutEventRequest self = new PutEventRequest();
        return TeaModel.build(map, self);
    }

    public PutEventRequest setEventInfo(String eventInfo) {
        this.eventInfo = eventInfo;
        return this;
    }
    public String getEventInfo() {
        return this.eventInfo;
    }

    public PutEventRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
