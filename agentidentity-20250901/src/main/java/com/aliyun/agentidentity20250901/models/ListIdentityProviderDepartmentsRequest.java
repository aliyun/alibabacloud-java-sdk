// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListIdentityProviderDepartmentsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DingTalk</p>
     */
    @NameInMap("IdentityProviderType")
    public String identityProviderType;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>eyJwYWdlIjoyfQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ParentDepartmentId")
    public String parentDepartmentId;

    /**
     * <strong>example:</strong>
     * <p>syncscope-example</p>
     */
    @NameInMap("UserPoolName")
    public String userPoolName;

    public static ListIdentityProviderDepartmentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIdentityProviderDepartmentsRequest self = new ListIdentityProviderDepartmentsRequest();
        return TeaModel.build(map, self);
    }

    public ListIdentityProviderDepartmentsRequest setIdentityProviderType(String identityProviderType) {
        this.identityProviderType = identityProviderType;
        return this;
    }
    public String getIdentityProviderType() {
        return this.identityProviderType;
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

    public ListIdentityProviderDepartmentsRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
