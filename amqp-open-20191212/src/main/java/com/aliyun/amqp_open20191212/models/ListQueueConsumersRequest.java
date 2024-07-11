// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListQueueConsumersRequest extends TeaModel {
    /**
     * <p>The ID of the ApsaraMQ for RabbitMQ instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>188077086902***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The token that marks the end position of the previous returned page. To obtain the next batch of data, call the operation again by using the value of NextToken returned by the previous request. If you call this operation for the first time or want to query all results, set NextToken to an empty string.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of data entries to return. If you do not configure this parameter, the default value 1 is used.</p>
     * <p>Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("QueryCount")
    public Integer queryCount;

    /**
     * <p>The name of the queue for which you want to query online consumers.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>queue-rabbit-springboot-advance5</p>
     */
    @NameInMap("Queue")
    public String queue;

    /**
     * <p>The virtual host (vhost) name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
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
