// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateMemoryEventRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("events")
    public java.util.List<CreateMemoryEventRequestEvents> events;

    public static CreateMemoryEventRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMemoryEventRequest self = new CreateMemoryEventRequest();
        return TeaModel.build(map, self);
    }

    public CreateMemoryEventRequest setEvents(java.util.List<CreateMemoryEventRequestEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<CreateMemoryEventRequestEvents> getEvents() {
        return this.events;
    }

    public static class CreateMemoryEventRequestEvents extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>33.63.112.139_29914368_MTEE3_1754878127662_117007</p>
         */
        @NameInMap("eventId")
        public String eventId;

        @NameInMap("message")
        public java.util.List<java.util.Map<String, String>> message;

        @NameInMap("metadata")
        public java.util.Map<String, ?> metadata;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fd0bbf26-3c0c-4d91-a392-42d59501e12b</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>uid1</p>
         */
        @NameInMap("userId")
        public String userId;

        public static CreateMemoryEventRequestEvents build(java.util.Map<String, ?> map) throws Exception {
            CreateMemoryEventRequestEvents self = new CreateMemoryEventRequestEvents();
            return TeaModel.build(map, self);
        }

        public CreateMemoryEventRequestEvents setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public CreateMemoryEventRequestEvents setMessage(java.util.List<java.util.Map<String, String>> message) {
            this.message = message;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getMessage() {
            return this.message;
        }

        public CreateMemoryEventRequestEvents setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public CreateMemoryEventRequestEvents setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public CreateMemoryEventRequestEvents setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
