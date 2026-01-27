// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class DescribeUserResourcesRequest extends TeaModel {
    /**
     * <p>The access type. If you leave this parameter empty, both types will be displayed.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>INTERNET: access over the Internet.</li>
     * <li>VPC: access over an enterprise virtual private cloud (VPC).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>INTERNET</p>
     */
    @NameInMap("AccessType")
    public String accessType;

    /**
     * <p>Specifies whether to enable the immediate refresh feature.</p>
     * <blockquote>
     * <p> To ensure the operation response speed, we recommend that you set the value to <code>false</code>.</p>
     * </blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li>false</li>
     * <li>true</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRefresh")
    public Boolean autoRefresh;

    /**
     * <p>The level-2 resource category.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CategoryId")
    public Integer categoryId;

    /**
     * <p>The level-1 resource category.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CategoryType")
    public Integer categoryType;

    /**
     * <p>The client ID. The system generates a unique ID for each client. This parameter is non-sensitive and does not need encryption.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>54c17e1d-2d72-4b87-aa33-25f3b3f2****</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The client type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>html5: the web client.</li>
     * <li>android: the Android client.</li>
     * <li>windows: the Windows client.</li>
     * <li>ios: the iOS client.</li>
     * <li>macos: the macOS client.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>windows</p>
     */
    @NameInMap("ClientType")
    public String clientType;

    /**
     * <p>The client version.</p>
     * 
     * <strong>example:</strong>
     * <p>7.6.0-R-20241112.222305</p>
     */
    @NameInMap("ClientVersion")
    public String clientVersion;

    /**
     * <p>Specifies whether to enable geo-redundant forwarding. Set the value to <code>false</code>.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>false: disables geo-redundant forwarding.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DualCenterForward")
    @Deprecated
    public Boolean dualCenterForward;

    /**
     * <p>The client language.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>en_US: English.</li>
     * <li>zh_CN: Simplified Chinese.</li>
     * <li>ja_JP: Japanese.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The ID of the region where end users log on to clients. This parameter applies to office network ID-based logons. For organization ID-based logons, you can leave this parameter empty.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("LoginRegionId")
    public String loginRegionId;

    /**
     * <p>The logon token. You can call the <code>GetLoginToken</code> or <code>RefreshLoginToken</code> operation to retrieve the logon token.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v18101ac6a9e69c66b04a163031680463660b4b216cd758f34b60b9ad6a7c7f7334b83dd8f75eef4209c68f9f1080b****</p>
     */
    @NameInMap("LoginToken")
    public String loginToken;

    /**
     * <p>The number of entries per page. Default value: 500.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The office network IDs. This parameter is required for logons by using enterprise Active Directory (AD) accounts.</p>
     */
    @NameInMap("OfficeSiteIds")
    public java.util.List<String> officeSiteIds;

    /**
     * <p>The sorting field. If you do not specify this parameter, resources are sorted by creation time by default.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>CreateTime: the time when resources are created.</li>
     * <li>AssignTime: the time when resources are assigned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AssignTime</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The service types. If you leave this parameter empty, services of all supported types will be queried.</p>
     */
    @NameInMap("ProductTypes")
    public java.util.List<String> productTypes;

    /**
     * <p>The protocol type. You can specify this parameter to filter cloud computers.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>HDX: High-definition Experience (HDX).</li>
     * <li>ASP: Adaptive Streaming Protocol (ASP).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASP</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>是否查询云桌面套餐包信息，默认为true。</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("QueryDesktopDurationList")
    public Boolean queryDesktopDurationList;

    /**
     * <p>是否查询云电脑定时任务信息，默认为true。</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("QueryDesktopTimers")
    public Boolean queryDesktopTimers;

    /**
     * <p>Specifies whether to return the image version information of cloud computers.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("QueryFotaUpdate")
    public Boolean queryFotaUpdate;

    /**
     * <p>Specifies whether to refresh over-the-air (OTA) information in real time.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RefreshFotaUpdate")
    public Boolean refreshFotaUpdate;

    /**
     * <p>The resource IDs. You can specify up to 100 resource IDs.</p>
     */
    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    /**
     * <p>The resource name. Fuzzy search is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <p>The resource types. If you leave this parameter empty, resources of all supported types will be queried.</p>
     */
    @NameInMap("ResourceTypes")
    public java.util.List<String> resourceTypes;

    /**
     * <p>The client usage scenario. Set the value to <code>desktop</code>.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>desktop: cloud computers.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desktop</p>
     */
    @NameInMap("Scene")
    public String scene;

    /**
     * <p>The ID of the searched region. You can specify this parameter to filter cloud resources in specific regions.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SearchRegionId")
    public String searchRegionId;

    /**
     * <p>The session ID. You can call the <code>GetLoginToken</code> operation to retrieve the session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cd45e873-650d-4d70-acb9-f996187a****</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The sorting method.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>ASC (default): the ascending order.</li>
     * <li>DESC: the descending order.</li>
     * </ul>
     * 
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

    @Deprecated
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

    public DescribeUserResourcesRequest setQueryDesktopDurationList(Boolean queryDesktopDurationList) {
        this.queryDesktopDurationList = queryDesktopDurationList;
        return this;
    }
    public Boolean getQueryDesktopDurationList() {
        return this.queryDesktopDurationList;
    }

    public DescribeUserResourcesRequest setQueryDesktopTimers(Boolean queryDesktopTimers) {
        this.queryDesktopTimers = queryDesktopTimers;
        return this;
    }
    public Boolean getQueryDesktopTimers() {
        return this.queryDesktopTimers;
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
