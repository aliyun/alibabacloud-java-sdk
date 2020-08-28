// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AcceptInquiredSystemEventRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("EventId")
    @Validation(required = true)
    public String eventId;

    public static AcceptInquiredSystemEventRequest build(java.util.Map<String, ?> map) throws Exception {
        AcceptInquiredSystemEventRequest self = new AcceptInquiredSystemEventRequest();
        return TeaModel.build(map, self);
    }

}
