// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListActionTrackEventTypesResponseBody extends TeaModel {
    @NameInMap("EventTypes")
    public java.util.List<ListActionTrackEventTypesResponseBodyEventTypes> eventTypes;

    /**
     * <p>分页查询时每页行数。</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>本次调用返回的查询凭证（Token）值，用于下一次翻页查询。</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>本次调用返回的查询凭证（Token）值，用于上一次翻页查询。</p>
     * 
     * <strong>example:</strong>
     * <p>PTxxxexample</p>
     */
    @NameInMap("PreviousToken")
    public String previousToken;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListActionTrackEventTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListActionTrackEventTypesResponseBody self = new ListActionTrackEventTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListActionTrackEventTypesResponseBody setEventTypes(java.util.List<ListActionTrackEventTypesResponseBodyEventTypes> eventTypes) {
        this.eventTypes = eventTypes;
        return this;
    }
    public java.util.List<ListActionTrackEventTypesResponseBodyEventTypes> getEventTypes() {
        return this.eventTypes;
    }

    public ListActionTrackEventTypesResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListActionTrackEventTypesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListActionTrackEventTypesResponseBody setPreviousToken(String previousToken) {
        this.previousToken = previousToken;
        return this;
    }
    public String getPreviousToken() {
        return this.previousToken;
    }

    public ListActionTrackEventTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListActionTrackEventTypesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListActionTrackEventTypesResponseBodyEventTypes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>urn:alibaba:idaas:event:user:create</p>
         */
        @NameInMap("EventType")
        public String eventType;

        public static ListActionTrackEventTypesResponseBodyEventTypes build(java.util.Map<String, ?> map) throws Exception {
            ListActionTrackEventTypesResponseBodyEventTypes self = new ListActionTrackEventTypesResponseBodyEventTypes();
            return TeaModel.build(map, self);
        }

        public ListActionTrackEventTypesResponseBodyEventTypes setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

    }

}
