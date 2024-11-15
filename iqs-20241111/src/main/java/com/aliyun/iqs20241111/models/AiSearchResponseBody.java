// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class AiSearchResponseBody extends TeaModel {
    @NameInMap("header")
    public AiSearchResponseBodyHeader header;

    /**
     * <strong>example:</strong>
     * <p>{&quot;header&quot;:{&quot;eventId&quot;:&quot;6f617de0-204f-406f-a9be-34779c06d498&quot;,&quot;event&quot;:&quot;on_common_search_start&quot;,&quot;responseTime&quot;:120},&quot;payload&quot;:&quot;&quot;,&quot;requestId&quot;:&quot;715d01a0-de7e-42c3-abca-b901fcd79b39&quot;}</p>
     */
    @NameInMap("payload")
    public String payload;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>ECB2144C-E277-5434-80E6-12D26678D364</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static AiSearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AiSearchResponseBody self = new AiSearchResponseBody();
        return TeaModel.build(map, self);
    }

    public AiSearchResponseBody setHeader(AiSearchResponseBodyHeader header) {
        this.header = header;
        return this;
    }
    public AiSearchResponseBodyHeader getHeader() {
        return this.header;
    }

    public AiSearchResponseBody setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

    public AiSearchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AiSearchResponseBodyHeader extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>on_common_search_end</p>
         */
        @NameInMap("event")
        public String event;

        /**
         * <strong>example:</strong>
         * <p>988021f0-951a-43d0-ba4d-785359e7e7be</p>
         */
        @NameInMap("eventId")
        public String eventId;

        /**
         * <strong>example:</strong>
         * <p>1293</p>
         */
        @NameInMap("responseTime")
        public Long responseTime;

        public static AiSearchResponseBodyHeader build(java.util.Map<String, ?> map) throws Exception {
            AiSearchResponseBodyHeader self = new AiSearchResponseBodyHeader();
            return TeaModel.build(map, self);
        }

        public AiSearchResponseBodyHeader setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public AiSearchResponseBodyHeader setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public AiSearchResponseBodyHeader setResponseTime(Long responseTime) {
            this.responseTime = responseTime;
            return this;
        }
        public Long getResponseTime() {
            return this.responseTime;
        }

    }

}
