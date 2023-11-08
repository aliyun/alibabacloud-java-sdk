// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListQueueConsumersRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("QueryCount")
    public Integer queryCount;

    @NameInMap("Queue")
    public String queue;

    @NameInMap("VirtualHost")
    public String virtualHost;

    public static ListQueueConsumersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQueueConsumersRequest self = new ListQueueConsumersRequest();
        return TeaModel.build(map, self);
    }

    public ListQueueConsumersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListQueueConsumersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListQueueConsumersRequest setQueryCount(Integer queryCount) {
        this.queryCount = queryCount;
        return this;
    }
    public Integer getQueryCount() {
        return this.queryCount;
    }

    public ListQueueConsumersRequest setQueue(String queue) {
        this.queue = queue;
        return this;
    }
    public String getQueue() {
        return this.queue;
    }

    public ListQueueConsumersRequest setVirtualHost(String virtualHost) {
        this.virtualHost = virtualHost;
        return this;
    }
    public String getVirtualHost() {
        return this.virtualHost;
    }

}
