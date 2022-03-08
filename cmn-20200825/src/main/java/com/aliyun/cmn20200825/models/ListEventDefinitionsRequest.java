// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListEventDefinitionsRequest extends TeaModel {
    // 事件项ID
    @NameInMap("EventId")
    public String eventId;

    // 事件项名称
    @NameInMap("EventName")
    public String eventName;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 本次读取的最大数据记录数量
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 标记当前开始读取的位置，置空表示从头开始
    @NameInMap("NextToken")
    public String nextToken;

    public static ListEventDefinitionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEventDefinitionsRequest self = new ListEventDefinitionsRequest();
        return TeaModel.build(map, self);
    }

    public ListEventDefinitionsRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public ListEventDefinitionsRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public ListEventDefinitionsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListEventDefinitionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListEventDefinitionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
