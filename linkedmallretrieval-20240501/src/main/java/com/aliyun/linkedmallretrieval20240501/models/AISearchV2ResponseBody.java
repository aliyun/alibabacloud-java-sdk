// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmallretrieval20240501.models;

import com.aliyun.tea.*;

public class AISearchV2ResponseBody extends TeaModel {
    @NameInMap("header")
    public AISearchV2ResponseBodyHeader header;

    @NameInMap("payload")
    public String payload;

    /**
     * <strong>example:</strong>
     * <p>D016A23D-738A-5209-A91A-6145845C5A23</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static AISearchV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AISearchV2ResponseBody self = new AISearchV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public AISearchV2ResponseBody setHeader(AISearchV2ResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public AISearchV2ResponseBodyHeader getHeader() {
        return this.header;
    }

    public AISearchV2ResponseBody setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

    public AISearchV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AISearchV2ResponseBodyHeader extends TeaModel {
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
         * <p>1403</p>
         */
        @NameInMap("responseTime")
        public String responseTime;

        public static AISearchV2ResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            AISearchV2ResponseBodyHeader self = new AISearchV2ResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public AISearchV2ResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public AISearchV2ResponseBodyHeader setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public AISearchV2ResponseBodyHeader setResponseTime(String responseTime) {
            this.responseTime = responseTime;
            return this;
        }
        public String getResponseTime() {
            return this.responseTime;
        }

    }

}
