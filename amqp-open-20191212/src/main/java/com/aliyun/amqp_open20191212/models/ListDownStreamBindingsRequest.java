// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListDownStreamBindingsRequest extends TeaModel {
    /**
     * <p>The exchange name.</p>
     */
    @NameInMap("ExchangeName")
    public String exchangeName;

    /**
     * <p>The ID of the ApsaraMQ for RabbitMQ instance to which the exchange belongs.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum number of entries to return.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that marks the end position of the previous returned page. To obtain the next batch of data, call the operation again by using the value of NextToken returned by the previous request. If you call this operation for the first time or want to query all results, set NextToken to an empty string.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The name of the vhost to which the exchange belongs.</p>
     */
    @NameInMap("VirtualHost")
    public String virtualHost;

    public static ListDownStreamBindingsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDownStreamBindingsRequest self = new ListDownStreamBindingsRequest();
        return TeaModel.build(map, self);
    }

    public ListDownStreamBindingsRequest setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
        return this;
    }
    public String getExchangeName() {
        return this.exchangeName;
    }

    public ListDownStreamBindingsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDownStreamBindingsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDownStreamBindingsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDownStreamBindingsRequest setVirtualHost(String virtualHost) {
        this.virtualHost = virtualHost;
        return this;
    }
    public String getVirtualHost() {
        return this.virtualHost;
    }

}
