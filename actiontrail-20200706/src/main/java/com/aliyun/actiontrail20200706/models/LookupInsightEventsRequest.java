// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class LookupInsightEventsRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The default value is the current time.</p>
     * <p>Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-07T07:10:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>An array of fliter conditions.</p>
     * <blockquote>
     * <ul>
     * <li>You can specify one or two query conditions. For more information, see <a href="https://help.aliyun.com/document_detail/3011147.html">Limitations</a>.</li>
     * </ul>
     * </blockquote>
     */
    @NameInMap("LookupAttribute")
    public java.util.List<LookupInsightEventsRequestLookupAttribute> lookupAttribute;

    /**
     * <p>The maximum number of entries to return.</p>
     * <ul>
     * <li><p>Valid values: 1 to 50.</p>
     * </li>
     * <li><p>Default value: 20.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * <ul>
     * <li><p>You do not need to specify this parameter for the first request.</p>
     * </li>
     * <li><p>You must specify the token that is obtained from the previous query as the value of <code>NextToken</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VjE6dLbnNpVmbz06****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The beginning of the time range to query. The default value is seven days before the current time.</p>
     * <p>Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
     * <blockquote>
     * <ul>
     * <li>The maximum time range that can be queried is 93 days. If the specified time range is longer than 93 days, only events from the last 93 days are returned.</li>
     * </ul>
     * </blockquote>
     * 
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
         * <p>The attribute key. For more information about valid values, see <a href="https://help.aliyun.com/document_detail/3011147.html">How do I configure the LookupAttribute parameter when calling LookupInsightEvents?</a></p>
         * 
         * <strong>example:</strong>
         * <p>InsightType</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The attribute value. For more information about valid values, see <a href="https://help.aliyun.com/document_detail/3011147.html">How do I configure the LookupAttribute parameter when calling LookupInsightEvents?</a></p>
         * 
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
