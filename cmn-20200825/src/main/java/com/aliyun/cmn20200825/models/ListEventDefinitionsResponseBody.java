// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListEventDefinitionsResponseBody extends TeaModel {
    @NameInMap("EventDefinitions")
    public java.util.List<EventDefinition> eventDefinitions;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListEventDefinitionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEventDefinitionsResponseBody self = new ListEventDefinitionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEventDefinitionsResponseBody setEventDefinitions(java.util.List<EventDefinition> eventDefinitions) {
        this.eventDefinitions = eventDefinitions;
        return this;
    }
    public java.util.List<EventDefinition> getEventDefinitions() {
        return this.eventDefinitions;
    }

    public ListEventDefinitionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListEventDefinitionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEventDefinitionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEventDefinitionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
