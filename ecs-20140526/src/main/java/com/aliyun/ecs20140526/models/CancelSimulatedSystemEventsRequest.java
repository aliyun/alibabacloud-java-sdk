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

}
