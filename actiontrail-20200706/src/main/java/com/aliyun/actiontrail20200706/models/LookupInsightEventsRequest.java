// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class LookupInsightEventsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2026-01-07T07:10:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("LookupAttribute")
    public java.util.List<LookupInsightEventsRequestLookupAttribute> lookupAttribute;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <strong>example:</strong>
     * <p>VjE6dLbnNpVmbz06****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>2026-01-07T04:10:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static LookupInsightEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        LookupInsightEventsRequest self = new LookupInsightEventsRequest();
        return TeaModel.build(map, self);
    }

    public LookupInsightEventsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public LookupInsightEventsRequest setLookupAttribute(java.util.List<LookupInsightEventsRequestLookupAttribute> lookupAttribute) {
        this.lookupAttribute = lookupAttribute;
        return this;
    }
    public java.util.List<LookupInsightEventsRequestLookupAttribute> getLookupAttribute() {
        return this.lookupAttribute;
    }

    public LookupInsightEventsRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public LookupInsightEventsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public LookupInsightEventsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class LookupInsightEventsRequestLookupAttribute extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>InsightType</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>IpInsight</p>
         */
        @NameInMap("Value")
        public String value;

        public static LookupInsightEventsRequestLookupAttribute build(java.util.Map<String, ?> map) throws Exception {
            LookupInsightEventsRequestLookupAttribute self = new LookupInsightEventsRequestLookupAttribute();
            return TeaModel.build(map, self);
        }

        public LookupInsightEventsRequestLookupAttribute setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public LookupInsightEventsRequestLookupAttribute setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
