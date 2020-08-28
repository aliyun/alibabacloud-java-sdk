// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateSimulatedSystemEventsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("EventIdSet")
    @Validation(required = true)
    public CreateSimulatedSystemEventsResponseEventIdSet eventIdSet;

    public static CreateSimulatedSystemEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSimulatedSystemEventsResponse self = new CreateSimulatedSystemEventsResponse();
        return TeaModel.build(map, self);
    }

    public static class CreateSimulatedSystemEventsResponseEventIdSet extends TeaModel {
        @NameInMap("EventId")
        @Validation(required = true)
        public java.util.List<String> eventId;

        public static CreateSimulatedSystemEventsResponseEventIdSet build(java.util.Map<String, ?> map) throws Exception {
            CreateSimulatedSystemEventsResponseEventIdSet self = new CreateSimulatedSystemEventsResponseEventIdSet();
            return TeaModel.build(map, self);
        }

    }

}
