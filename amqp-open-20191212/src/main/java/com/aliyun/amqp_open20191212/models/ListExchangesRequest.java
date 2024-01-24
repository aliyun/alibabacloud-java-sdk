// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListExchangesRequest extends TeaModel {
    /**
     * <p>The ID of the ApsaraMQ for RabbitMQ instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum number of entries to return. Valid values: **1 to 100**</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   If you call this operation for the first time or a next query is not required, leave this parameter empty.</p>
     * <p>*   If a next query is to be sent, set the value to the value of `NextToken` that is returned from the previous request.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The vhost name.</p>
     */
    @NameInMap("VirtualHost")
    public String virtualHost;

    public static ListExchangesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExchangesRequest self = new ListExchangesRequest();
        return TeaModel.build(map, self);
    }

    public ListExchangesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListExchangesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListExchangesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListExchangesRequest setVirtualHost(String virtualHost) {
        this.virtualHost = virtualHost;
        return this;
    }
    public String getVirtualHost() {
        return this.virtualHost;
    }

}
