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

    public static class AiSearchResponseBodyHeaderQueryContextOriginalQuery extends TeaModel {
        @NameInMap("industry")
        public String industry;

        @NameInMap("page")
        public Integer page;

        @NameInMap("query")
        public String query;

        @NameInMap("timeRange")
        public String timeRange;

        public static AiSearchResponseBodyHeaderQueryContextOriginalQuery build(java.util.Map<String, ?> map) throws Exception {
            AiSearchResponseBodyHeaderQueryContextOriginalQuery self = new AiSearchResponseBodyHeaderQueryContextOriginalQuery();
            return TeaModel.build(map, self);
        }

        public AiSearchResponseBodyHeaderQueryContextOriginalQuery setIndustry(String industry) {
            this.industry = industry;
            return this;
        }
        public String getIndustry() {
            return this.industry;
        }

        public AiSearchResponseBodyHeaderQueryContextOriginalQuery setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public AiSearchResponseBodyHeaderQueryContextOriginalQuery setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public AiSearchResponseBodyHeaderQueryContextOriginalQuery setTimeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public String getTimeRange() {
            return this.timeRange;
        }

    }

    public static class AiSearchResponseBodyHeaderQueryContextRewrite extends TeaModel {
        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("timeRange")
        public String timeRange;

        public static AiSearchResponseBodyHeaderQueryContextRewrite build(java.util.Map<String, ?> map) throws Exception {
            AiSearchResponseBodyHeaderQueryContextRewrite self = new AiSearchResponseBodyHeaderQueryContextRewrite();
            return TeaModel.build(map, self);
        }

        public AiSearchResponseBodyHeaderQueryContextRewrite setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public AiSearchResponseBodyHeaderQueryContextRewrite setTimeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public String getTimeRange() {
            return this.timeRange;
        }

    }

    public static class AiSearchResponseBodyHeaderQueryContext extends TeaModel {
        @NameInMap("originalQuery")
        public AiSearchResponseBodyHeaderQueryContextOriginalQuery originalQuery;

        @NameInMap("rewrite")
        public AiSearchResponseBodyHeaderQueryContextRewrite rewrite;

        public static AiSearchResponseBodyHeaderQueryContext build(java.util.Map<String, ?> map) throws Exception {
            AiSearchResponseBodyHeaderQueryContext self = new AiSearchResponseBodyHeaderQueryContext();
            return TeaModel.build(map, self);
        }

        public AiSearchResponseBodyHeaderQueryContext setOriginalQuery(AiSearchResponseBodyHeaderQueryContextOriginalQuery originalQuery) {
            this.originalQuery = originalQuery;
            return this;
        }
        public AiSearchResponseBodyHeaderQueryContextOriginalQuery getOriginalQuery() {
            return this.originalQuery;
        }

        public AiSearchResponseBodyHeaderQueryContext setRewrite(AiSearchResponseBodyHeaderQueryContextRewrite rewrite) {
            this.rewrite = rewrite;
            return this;
        }
        public AiSearchResponseBodyHeaderQueryContextRewrite getRewrite() {
            return this.rewrite;
        }

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

        @NameInMap("queryContext")
        public AiSearchResponseBodyHeaderQueryContext queryContext;

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

        public AiSearchResponseBodyHeader setQueryContext(AiSearchResponseBodyHeaderQueryContext queryContext) {
            this.queryContext = queryContext;
            return this;
        }
        public AiSearchResponseBodyHeaderQueryContext getQueryContext() {
            return this.queryContext;
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
