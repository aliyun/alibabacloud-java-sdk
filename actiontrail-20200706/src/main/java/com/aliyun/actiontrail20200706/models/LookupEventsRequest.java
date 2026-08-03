// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class LookupEventsRequest extends TeaModel {
    /**
     * <p>The order in which events are retrieved. Valid values:</p>
     * <ul>
     * <li><p>FORWARD: Chronological order.</p>
     * </li>
     * <li><p>BACKWARD (default): Reverse chronological order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BACKWARD</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p>You must specify both <code>StartTime</code> and <code>EndTime</code>, or leave both unspecified. If you leave them unspecified, the default value of <code>EndTime</code> is the current time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2020-10-15T11:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The filter conditions.</p>
     * <blockquote>
     * <p>You can specify one or two filter conditions at a time. For more information, see <a href="https://help.aliyun.com/document_detail/2920829.html">Limitations</a>.</p>
     * </blockquote>
     */
    @NameInMap("LookupAttribute")
    public java.util.List<LookupEventsRequestLookupAttribute> lookupAttribute;

    /**
     * <p>The maximum number of results to return.<br>Valid values: 1 to 50.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * <blockquote>
     * <p>You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>eyJhY2NvdW50IjoiMTQyNDM3OTU4NjM4NzE2MSIsImV2ZW50SWQiOiI3MkJDRTExRi02OTU3LTQ0NUItQjY0MC1CNEUyMkM4NUEwQzgiLCJsb2dJZCI6IjgyLTE0MjQzNzk1ODYzODcxNjEiLCJ0aW1lIjoxNjAyMzExNTQwMD****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
     * <blockquote>
     * <p>You must specify both <code>StartTime</code> and <code>EndTime</code>, or leave both unspecified. If you leave them unspecified, the default value of <code>StartTime</code> is 7 days before the current time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2020-10-08T11:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static LookupEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        LookupEventsRequest self = new LookupEventsRequest();
        return TeaModel.build(map, self);
    }

    public LookupEventsRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public LookupEventsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public LookupEventsRequest setLookupAttribute(java.util.List<LookupEventsRequestLookupAttribute> lookupAttribute) {
        this.lookupAttribute = lookupAttribute;
        return this;
    }
    public java.util.List<LookupEventsRequestLookupAttribute> getLookupAttribute() {
        return this.lookupAttribute;
    }

    public LookupEventsRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public LookupEventsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public LookupEventsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class LookupEventsRequestLookupAttribute extends TeaModel {
        /**
         * <p>The attribute key. For information about valid values, see <a href="https://help.aliyun.com/document_detail/2920829.html">How do I configure the LookupAttribute parameter when calling LookupInsightEvents?</a></p>
         * 
         * <strong>example:</strong>
         * <p>ServiceName</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The attribute value. For information about valid values, see <a href="https://help.aliyun.com/document_detail/2920829.html">How do I configure the LookupAttribute parameter when calling LookupInsightEvents?</a></p>
         * 
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        @NameInMap("Value")
        public String value;

        public static LookupEventsRequestLookupAttribute build(java.util.Map<String, ?> map) throws Exception {
            LookupEventsRequestLookupAttribute self = new LookupEventsRequestLookupAttribute();
            return TeaModel.build(map, self);
        }

        public LookupEventsRequestLookupAttribute setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public LookupEventsRequestLookupAttribute setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
