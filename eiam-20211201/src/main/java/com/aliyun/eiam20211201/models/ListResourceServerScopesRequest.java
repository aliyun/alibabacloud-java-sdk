// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListResourceServerScopesRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The authorization type.</p>
     * 
     * <strong>example:</strong>
     * <p>authorize_required</p>
     */
    @NameInMap("AuthorizationType")
    public String authorizationType;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum number of entries to return per page in a paging query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page. Set this parameter to the value of the NextToken parameter returned from the previous API call. Leave this parameter empty for the first query.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The pagination token for the previous page. Set this parameter to the value of the PreviousToken parameter returned from the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>PTxxxxxexample</p>
     */
    @NameInMap("PreviousToken")
    public String previousToken;

    /**
     * <p>The list of scope permission IDs.</p>
     */
    @NameInMap("ResourceServerScopeIds")
    public java.util.List<String> resourceServerScopeIds;

    /**
     * <p>The name of the scope permission.</p>
     * 
     * <strong>example:</strong>
     * <p>Read all users</p>
     */
    @NameInMap("ResourceServerScopeName")
    public String resourceServerScopeName;

    /**
     * <p>The type of the scope permission.</p>
     * 
     * <strong>example:</strong>
     * <p>urn:alibaba:idaas:resourceserver:scope:delegated</p>
     */
    @NameInMap("ResourceServerScopeType")
    public String resourceServerScopeType;

    /**
     * <p>The value of the scope permission.</p>
     * 
     * <strong>example:</strong>
     * <p>User:Write:ALL</p>
     */
    @NameInMap("ResourceServerScopeValue")
    public String resourceServerScopeValue;

    public static ListResourceServerScopesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceServerScopesRequest self = new ListResourceServerScopesRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceServerScopesRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ListResourceServerScopesRequest setAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
        return this;
    }
    public String getAuthorizationType() {
        return this.authorizationType;
    }

    public ListResourceServerScopesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListResourceServerScopesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListResourceServerScopesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceServerScopesRequest setPreviousToken(String previousToken) {
        this.previousToken = previousToken;
        return this;
    }
    public String getPreviousToken() {
        return this.previousToken;
    }

    public ListResourceServerScopesRequest setResourceServerScopeIds(java.util.List<String> resourceServerScopeIds) {
        this.resourceServerScopeIds = resourceServerScopeIds;
        return this;
    }
    public java.util.List<String> getResourceServerScopeIds() {
        return this.resourceServerScopeIds;
    }

    public ListResourceServerScopesRequest setResourceServerScopeName(String resourceServerScopeName) {
        this.resourceServerScopeName = resourceServerScopeName;
        return this;
    }
    public String getResourceServerScopeName() {
        return this.resourceServerScopeName;
    }

    public ListResourceServerScopesRequest setResourceServerScopeType(String resourceServerScopeType) {
        this.resourceServerScopeType = resourceServerScopeType;
        return this;
    }
    public String getResourceServerScopeType() {
        return this.resourceServerScopeType;
    }

    public ListResourceServerScopesRequest setResourceServerScopeValue(String resourceServerScopeValue) {
        this.resourceServerScopeValue = resourceServerScopeValue;
        return this;
    }
    public String getResourceServerScopeValue() {
        return this.resourceServerScopeValue;
    }

}
