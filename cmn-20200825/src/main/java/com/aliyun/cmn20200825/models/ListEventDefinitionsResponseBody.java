// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListEventDefinitionsResponseBody extends TeaModel {
    // 事件项列表
    @NameInMap("EventDefinitions")
    public java.util.List<EventDefinition> eventDefinitions;

    // MaxResults本次请求所返回的最大记录条数
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 表示当前调用返回读取到的位置，空代表数据已经读取完毕
    @NameInMap("NextToken")
    public String nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // TotalCount本次请求条件下的数据总量，此参数为可选参数，默认可不返回
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
