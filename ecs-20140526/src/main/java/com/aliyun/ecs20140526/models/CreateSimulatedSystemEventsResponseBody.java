// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateSimulatedSystemEventsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EventIdSet")
    public java.util.List<String> eventIdSet;

    public static CreateSimulatedSystemEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSimulatedSystemEventsResponseBody self = new CreateSimulatedSystemEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSimulatedSystemEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSimulatedSystemEventsResponseBody setEventIdSet(java.util.List<String> eventIdSet) {
        this.eventIdSet = eventIdSet;
        return this;
    }
    public java.util.List<String> getEventIdSet() {
        return this.eventIdSet;
    }

}
