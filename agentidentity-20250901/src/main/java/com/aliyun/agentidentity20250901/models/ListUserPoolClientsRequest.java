// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListUserPoolClientsRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return per page. Valid values: 1 to 1000. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to retrieve the next page of results. You do not need to specify this parameter for the first call. If a NextToken value is returned in the previous response, specify it in the current request to retrieve the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>TGlzdENsaWVudHM6OjEw</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The name of the user pool.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent-userpool</p>
     */
    @NameInMap("UserPoolName")
    public String userPoolName;

    public static ListUserPoolClientsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserPoolClientsRequest self = new ListUserPoolClientsRequest();
        return TeaModel.build(map, self);
    }

    public ListUserPoolClientsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUserPoolClientsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUserPoolClientsRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
