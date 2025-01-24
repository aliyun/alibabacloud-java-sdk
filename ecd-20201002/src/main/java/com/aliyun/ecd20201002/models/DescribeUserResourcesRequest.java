// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class DescribeUserResourcesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>INTERNET</p>
     */
    @NameInMap("AccessType")
    public String accessType;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRefresh")
    public Boolean autoRefresh;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CategoryId")
    public Integer categoryId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CategoryType")
    public Integer categoryType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>54c17e1d-2d72-4b87-aa33-25f3b3f2****</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <strong>example:</strong>
     * <p>windows</p>
     */
    @NameInMap("ClientType")
    public String clientType;

    /**
     * <strong>example:</strong>
     * <p>7.6.0-R-20241112.222305</p>
     */
    @NameInMap("ClientVersion")
    public String clientVersion;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DualCenterForward")
    public Boolean dualCenterForward;

    /**
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("LoginRegionId")
    public String loginRegionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v18101ac6a9e69c66b04a163031680463660b4b216cd758f34b60b9ad6a7c7f7334b83dd8f75eef4209c68f9f1080b****</p>
     */
    @NameInMap("LoginToken")
    public String loginToken;

    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OfficeSiteIds")
    public java.util.List<String> officeSiteIds;

    /**
     * <strong>example:</strong>
     * <p>AssignTime</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("ProductTypes")
    public java.util.List<String> productTypes;

    /**
     * <strong>example:</strong>
     * <p>ASP</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("QueryFotaUpdate")
    public Boolean queryFotaUpdate;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RefreshFotaUpdate")
    public Boolean refreshFotaUpdate;

    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    /**
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    @NameInMap("ResourceTypes")
    public java.util.List<String> resourceTypes;

    /**
     * <strong>example:</strong>
     * <p>desktop</p>
     */
    @NameInMap("Scene")
    public String scene;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SearchRegionId")
    public String searchRegionId;

    /**
     * <strong>example:</strong>
     * <p>cd45e873-650d-4d70-acb9-f996187a****</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("SortType")
    public String sortType;

    public static DescribeUserResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserResourcesRequest self = new DescribeUserResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserResourcesRequest setAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }
    public String getAccessType() {
        return this.accessType;
    }

    public DescribeUserResourcesRequest setAutoRefresh(Boolean autoRefresh) {
        this.autoRefresh = autoRefresh;
        return this;
    }
    public Boolean getAutoRefresh() {
        return this.autoRefresh;
    }

    public DescribeUserResourcesRequest setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Integer getCategoryId() {
        return this.categoryId;
    }

    public DescribeUserResourcesRequest setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
        return this;
    }
    public Integer getCategoryType() {
        return this.categoryType;
    }

    public DescribeUserResourcesRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public DescribeUserResourcesRequest setClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }
    public String getClientType() {
        return this.clientType;
    }

    public DescribeUserResourcesRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public DescribeUserResourcesRequest setDualCenterForward(Boolean dualCenterForward) {
        this.dualCenterForward = dualCenterForward;
        return this;
    }
    public Boolean getDualCenterForward() {
        return this.dualCenterForward;
    }

    public DescribeUserResourcesRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public DescribeUserResourcesRequest setLoginRegionId(String loginRegionId) {
        this.loginRegionId = loginRegionId;
        return this;
    }
    public String getLoginRegionId() {
        return this.loginRegionId;
    }

    public DescribeUserResourcesRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public DescribeUserResourcesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeUserResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeUserResourcesRequest setOfficeSiteIds(java.util.List<String> officeSiteIds) {
        this.officeSiteIds = officeSiteIds;
        return this;
    }
    public java.util.List<String> getOfficeSiteIds() {
        return this.officeSiteIds;
    }

    public DescribeUserResourcesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public DescribeUserResourcesRequest setProductTypes(java.util.List<String> productTypes) {
        this.productTypes = productTypes;
        return this;
    }
    public java.util.List<String> getProductTypes() {
        return this.productTypes;
    }

    public DescribeUserResourcesRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public DescribeUserResourcesRequest setQueryFotaUpdate(Boolean queryFotaUpdate) {
        this.queryFotaUpdate = queryFotaUpdate;
        return this;
    }
    public Boolean getQueryFotaUpdate() {
        return this.queryFotaUpdate;
    }

    public DescribeUserResourcesRequest setRefreshFotaUpdate(Boolean refreshFotaUpdate) {
        this.refreshFotaUpdate = refreshFotaUpdate;
        return this;
    }
    public Boolean getRefreshFotaUpdate() {
        return this.refreshFotaUpdate;
    }

    public DescribeUserResourcesRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public DescribeUserResourcesRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public DescribeUserResourcesRequest setResourceTypes(java.util.List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public java.util.List<String> getResourceTypes() {
        return this.resourceTypes;
    }

    public DescribeUserResourcesRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public DescribeUserResourcesRequest setSearchRegionId(String searchRegionId) {
        this.searchRegionId = searchRegionId;
        return this;
    }
    public String getSearchRegionId() {
        return this.searchRegionId;
    }

    public DescribeUserResourcesRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public DescribeUserResourcesRequest setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
    }

}
