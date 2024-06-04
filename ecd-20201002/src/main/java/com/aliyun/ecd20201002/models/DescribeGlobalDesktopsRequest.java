// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class DescribeGlobalDesktopsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("DesktopAccessType")
    public String desktopAccessType;

    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    @NameInMap("DesktopName")
    public String desktopName;

    @NameInMap("DesktopStatus")
    public String desktopStatus;

    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>关键字。支持模糊搜索桌面ID、云桌面名称和终端用户自定义的桌面名称。</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("LoginRegionId")
    public String loginRegionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LoginToken")
    public String loginToken;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("QueryFotaUpdate")
    public Boolean queryFotaUpdate;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SearchRegionId")
    public String searchRegionId;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("SortType")
    public String sortType;

    @NameInMap("WithoutLatency")
    public Boolean withoutLatency;

    public static DescribeGlobalDesktopsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalDesktopsRequest self = new DescribeGlobalDesktopsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalDesktopsRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public DescribeGlobalDesktopsRequest setDesktopAccessType(String desktopAccessType) {
        this.desktopAccessType = desktopAccessType;
        return this;
    }
    public String getDesktopAccessType() {
        return this.desktopAccessType;
    }

    public DescribeGlobalDesktopsRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public DescribeGlobalDesktopsRequest setDesktopName(String desktopName) {
        this.desktopName = desktopName;
        return this;
    }
    public String getDesktopName() {
        return this.desktopName;
    }

    public DescribeGlobalDesktopsRequest setDesktopStatus(String desktopStatus) {
        this.desktopStatus = desktopStatus;
        return this;
    }
    public String getDesktopStatus() {
        return this.desktopStatus;
    }

    public DescribeGlobalDesktopsRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public DescribeGlobalDesktopsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeGlobalDesktopsRequest setLoginRegionId(String loginRegionId) {
        this.loginRegionId = loginRegionId;
        return this;
    }
    public String getLoginRegionId() {
        return this.loginRegionId;
    }

    public DescribeGlobalDesktopsRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public DescribeGlobalDesktopsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeGlobalDesktopsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeGlobalDesktopsRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public DescribeGlobalDesktopsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public DescribeGlobalDesktopsRequest setQueryFotaUpdate(Boolean queryFotaUpdate) {
        this.queryFotaUpdate = queryFotaUpdate;
        return this;
    }
    public Boolean getQueryFotaUpdate() {
        return this.queryFotaUpdate;
    }

    public DescribeGlobalDesktopsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeGlobalDesktopsRequest setSearchRegionId(String searchRegionId) {
        this.searchRegionId = searchRegionId;
        return this;
    }
    public String getSearchRegionId() {
        return this.searchRegionId;
    }

    public DescribeGlobalDesktopsRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public DescribeGlobalDesktopsRequest setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
    }

    public DescribeGlobalDesktopsRequest setWithoutLatency(Boolean withoutLatency) {
        this.withoutLatency = withoutLatency;
        return this;
    }
    public Boolean getWithoutLatency() {
        return this.withoutLatency;
    }

}
