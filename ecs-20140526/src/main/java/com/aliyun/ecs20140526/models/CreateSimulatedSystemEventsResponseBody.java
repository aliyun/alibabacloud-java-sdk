// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateSimulatedSystemEventsResponseBody extends TeaModel {
    /**
     * <p>The IDs of the simulated events.</p>
     */
    @NameInMap("EventIdSet")
    public CreateSimulatedSystemEventsResponseBodyEventIdSet eventIdSet;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSimulatedSystemEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSimulatedSystemEventsResponseBody self = new CreateSimulatedSystemEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSimulatedSystemEventsResponseBody setEventIdSet(CreateSimulatedSystemEventsResponseBodyEventIdSet eventIdSet) {
        this.eventIdSet = eventIdSet;
        return this;
    }
    public CreateSimulatedSystemEventsResponseBodyEventIdSet getEventIdSet() {
        return this.eventIdSet;
    }

    public CreateSimulatedSystemEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateSimulatedSystemEventsResponseBodyEventIdSet extends TeaModel {
        @NameInMap("EventId")
        public java.util.List<String> eventId;

        public static CreateSimulatedSystemEventsResponseBodyEventIdSet build(java.util.Map<String, ?> map) throws Exception {
            CreateSimulatedSystemEventsResponseBodyEventIdSet self = new CreateSimulatedSystemEventsResponseBodyEventIdSet();
            return TeaModel.build(map, self);
        }

        public CreateSimulatedSystemEventsResponseBodyEventIdSet setEventId(java.util.List<String> eventId) {
            this.eventId = eventId;
            return this;
        }
        public java.util.List<String> getEventId() {
            return this.eventId;
        }

    }

}
