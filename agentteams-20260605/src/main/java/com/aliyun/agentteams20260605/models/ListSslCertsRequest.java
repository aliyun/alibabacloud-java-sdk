// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class ListSslCertsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>instance-1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    public static ListSslCertsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSslCertsRequest self = new ListSslCertsRequest();
        return TeaModel.build(map, self);
    }

    public ListSslCertsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListSslCertsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSslCertsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
