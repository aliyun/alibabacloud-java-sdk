// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListQueueUpStreamBindingsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("VirtualHost")
    public String virtualHost;

    @NameInMap("QueueName")
    public String queueName;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("MaxResults")
    public Integer maxResults;

    public static ListQueueUpStreamBindingsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQueueUpStreamBindingsRequest self = new ListQueueUpStreamBindingsRequest();
        return TeaModel.build(map, self);
    }

    public ListQueueUpStreamBindingsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListQueueUpStreamBindingsRequest setVirtualHost(String virtualHost) {
        this.virtualHost = virtualHost;
        return this;
    }
    public String getVirtualHost() {
        return this.virtualHost;
    }

    public ListQueueUpStreamBindingsRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public ListQueueUpStreamBindingsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListQueueUpStreamBindingsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

}
