// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListRolesRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return per page. Valid values: 1 to 1000. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to query the next page of data. This parameter is not required for the first call. If a NextToken is returned in the response of a previous call, specify it in the current call to retrieve the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>TGlzdFJvbGVzOjoxMA==</p>
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

    public static ListRolesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRolesRequest self = new ListRolesRequest();
        return TeaModel.build(map, self);
    }

    public ListRolesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRolesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRolesRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
