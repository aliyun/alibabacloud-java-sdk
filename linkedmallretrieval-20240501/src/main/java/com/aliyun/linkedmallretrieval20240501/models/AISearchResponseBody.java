// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmallretrieval20240501.models;

import com.aliyun.tea.*;

public class AISearchResponseBody extends TeaModel {
    @NameInMap("header")
    public AISearchResponseBodyHeader header;

    @NameInMap("payload")
    public String payload;

    /**
     * <strong>example:</strong>
     * <p>D016A23D-738A-5209-A91A-6145845C5A23</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static AISearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AISearchResponseBody self = new AISearchResponseBody();
        return TeaModel.build(map, self);
    }

    public AISearchResponseBody setHeader(AISearchResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public AISearchResponseBodyHeader getHeader() {
        return this.header;
    }

    public AISearchResponseBody setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

    public AISearchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AISearchResponseBodyHeader extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>on_common_search_stream</p>
         */
        @NameInMap("event")
        public String event;

        /**
         * <strong>example:</strong>
         * <p>ff3de49-cedc-47ea-ba3c-8456acd345d8</p>
         */
        @NameInMap("eventId")
        public String eventId;

        /**
         * <strong>example:</strong>
         * <p>D4F6D088-EDE9-5823-9E66-22603937A40B</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>1403</p>
         */
        @NameInMap("responseTime")
        public String responseTime;

        public static AISearchResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            AISearchResponseBodyHeader self = new AISearchResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public AISearchResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public AISearchResponseBodyHeader setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public AISearchResponseBodyHeader setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public AISearchResponseBodyHeader setResponseTime(String responseTime) {
            this.responseTime = responseTime;
            return this;
        }
        public String getResponseTime() {
            return this.responseTime;
        }

    }

}
