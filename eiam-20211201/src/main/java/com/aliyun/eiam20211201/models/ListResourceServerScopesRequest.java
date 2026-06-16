// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListResourceServerScopesRequest extends TeaModel {
    /**
     * <p>Application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>Authorization type.</p>
     * 
     * <strong>example:</strong>
     * <p>authorize_required</p>
     */
    @NameInMap("AuthorizationType")
    public String authorizationType;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Number of rows per page in paginated queries.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Token for the next page query. Set this to the NextToken value returned by the previous API call. Leave empty for the first query.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Token for the previous page query. Set this to the PreviousToken value returned by the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>PTxxxxxexample</p>
     */
    @NameInMap("PreviousToken")
    public String previousToken;

    /**
     * <p>List of Scope permission IDs.</p>
     */
    @NameInMap("ResourceServerScopeIds")
    public java.util.List<String> resourceServerScopeIds;

    /**
     * <p>Scope permission name.</p>
     * 
     * <strong>example:</strong>
     * <p>读取全部用户</p>
     */
    @NameInMap("ResourceServerScopeName")
    public String resourceServerScopeName;

    /**
     * <p>Scope permission type.</p>
     * 
     * <strong>example:</strong>
     * <p>urn:alibaba:idaas:resourceserver:scope:delegated</p>
     */
    @NameInMap("ResourceServerScopeType")
    public String resourceServerScopeType;

    /**
     * <p>Scope permission value.</p>
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
