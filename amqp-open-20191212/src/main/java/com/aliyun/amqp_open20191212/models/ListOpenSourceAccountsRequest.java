// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListOpenSourceAccountsRequest extends TeaModel {
    /**
     * <p>The ID of the ApsaraMQ for RabbitMQ instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amqp-cn-7pp2mwbc****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum number of entries to return.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that marks the end of the current query. This token is passed as a parameter in the next call to continue pagination. Set this parameter to an empty string for the first call or when the last page is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListOpenSourceAccountsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOpenSourceAccountsRequest self = new ListOpenSourceAccountsRequest();
        return TeaModel.build(map, self);
    }

    public ListOpenSourceAccountsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListOpenSourceAccountsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListOpenSourceAccountsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
