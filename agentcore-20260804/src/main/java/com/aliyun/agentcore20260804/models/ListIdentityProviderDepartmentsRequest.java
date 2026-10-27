// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListIdentityProviderDepartmentsRequest extends TeaModel {
    /**
     * <p>The number of departments to return per page. Valid values: 1 to 50. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The nextToken returned from the previous page. Do not specify this parameter for the first query. When continuing pagination, keep the identity provider and parentDepartmentId unchanged, and pass the token as is. An empty or missing return value indicates that there are no subsequent pages at the current hierarchy level.</p>
     * 
     * <strong>example:</strong>
     * <p>example-next-page-token</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Queries the direct child departments of the specified department. If this parameter is not specified or is empty, the root hierarchy is queried, and all descendants are not recursively returned. When expanding a node in the list, pass the ID of the node, not its parentId.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("parentDepartmentId")
    public String parentDepartmentId;

    public static ListIdentityProviderDepartmentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIdentityProviderDepartmentsRequest self = new ListIdentityProviderDepartmentsRequest();
        return TeaModel.build(map, self);
    }

    public ListIdentityProviderDepartmentsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIdentityProviderDepartmentsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIdentityProviderDepartmentsRequest setParentDepartmentId(String parentDepartmentId) {
        this.parentDepartmentId = parentDepartmentId;
        return this;
    }
    public String getParentDepartmentId() {
        return this.parentDepartmentId;
    }

}
