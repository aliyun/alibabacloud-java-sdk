// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListBindingsRequest extends TeaModel {
    /**
     * <p>The ID of the ApsaraMQ for RabbitMQ instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum number of entries to return. Valid values:</p>
     * <br>
     * <p>**1 to 100**</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that marks the end position of the previous returned page. To obtain the next batch of data, call the operation again by using the value of NextToken returned by the previous request. If you call this operation for the first time or want to query all results, set NextToken to an empty string.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The vhost name.</p>
     */
    @NameInMap("VirtualHost")
    public String virtualHost;

    public static ListBindingsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBindingsRequest self = new ListBindingsRequest();
        return TeaModel.build(map, self);
    }

    public ListBindingsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListBindingsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListBindingsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListBindingsRequest setVirtualHost(String virtualHost) {
        this.virtualHost = virtualHost;
        return this;
    }
    public String getVirtualHost() {
        return this.virtualHost;
    }

}
