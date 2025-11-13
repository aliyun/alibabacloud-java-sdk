// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SearchRecursionZonesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>4698691</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    @NameInMap("Zones")
    public SearchRecursionZonesResponseBodyZones zones;

    public static SearchRecursionZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchRecursionZonesResponseBody self = new SearchRecursionZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchRecursionZonesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public SearchRecursionZonesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SearchRecursionZonesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchRecursionZonesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchRecursionZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchRecursionZonesResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public SearchRecursionZonesResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public SearchRecursionZonesResponseBody setZones(SearchRecursionZonesResponseBodyZones zones) {
        this.zones = zones;
        return this;
    }
    public SearchRecursionZonesResponseBodyZones getZones() {
        return this.zones;
    }

    public static class SearchRecursionZonesResponseBodyZonesZoneEffectiveScopesEffectiveScopeScopes extends TeaModel {
        @NameInMap("Scope")
        public java.util.List<String> scope;

        public static SearchRecursionZonesResponseBodyZonesZoneEffectiveScopesEffectiveScopeScopes build(java.util.Map<String, ?> map) throws Exception {
            SearchRecursionZonesResponseBodyZonesZoneEffectiveScopesEffectiveScopeScopes self = new SearchRecursionZonesResponseBodyZonesZoneEffectiveScopesEffectiveScopeScopes();
            return TeaModel.build(map, self);
        }

        public SearchRecursionZonesResponseBodyZonesZoneEffectiveScopesEffectiveScopeScopes setScope(java.util.List<String> scope) {
            this.scope = scope;
            return this;
        }
        public java.util.List<String> getScope() {
            return this.scope;
        }

    }

    public static class SearchRecursionZonesResponseBodyZonesZoneEffectiveScopesEffectiveScope extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>account</p>
         */
        @NameInMap("EffectiveType")
        public String effectiveType;

        /**
         * <strong>example:</strong>
         * <p>[20003]</p>
         */
        @NameInMap("Scopes")
        public SearchRecursionZonesResponseBodyZonesZoneEffectiveScopesEffectiveScopeScopes scopes;

        public static SearchRecursionZonesResponseBodyZonesZoneEffectiveScopesEffectiveScope build(java.util.Map<String, ?> map) throws Exception {
            SearchRecursionZonesResponseBodyZonesZoneEffectiveScopesEffectiveScope self = new SearchRecursionZonesResponseBodyZonesZoneEffectiveScopesEffectiveScope();
            return TeaModel.build(map, self);
        }

        public SearchRecursionZonesResponseBodyZonesZoneEffectiveScopesEffectiveScope setEffectiveType(String effectiveType) {
            this.effectiveType = effectiveType;
            return this;
        }
        public String getEffectiveType() {
            return this.effectiveType;
        }

        public SearchRecursionZonesResponseBodyZonesZoneEffectiveScopesEffectiveScope setScopes(SearchRecursionZonesResponseBodyZonesZoneEffectiveScopesEffectiveScopeScopes scopes) {
            this.scopes = scopes;
            return this;
        }
        public SearchRecursionZonesResponseBodyZonesZoneEffectiveScopesEffectiveScopeScopes getScopes() {
            return this.scopes;
        }

    }

    public static class SearchRecursionZonesResponseBodyZonesZoneEffectiveScopes extends TeaModel {
        @NameInMap("EffectiveScope")
        public java.util.List<SearchRecursionZonesResponseBodyZonesZoneEffectiveScopesEffectiveScope> effectiveScope;

        public static SearchRecursionZonesResponseBodyZonesZoneEffectiveScopes build(java.util.Map<String, ?> map) throws Exception {
            SearchRecursionZonesResponseBodyZonesZoneEffectiveScopes self = new SearchRecursionZonesResponseBodyZonesZoneEffectiveScopes();
            return TeaModel.build(map, self);
        }

        public SearchRecursionZonesResponseBodyZonesZoneEffectiveScopes setEffectiveScope(java.util.List<SearchRecursionZonesResponseBodyZonesZoneEffectiveScopesEffectiveScope> effectiveScope) {
            this.effectiveScope = effectiveScope;
            return this;
        }
        public java.util.List<SearchRecursionZonesResponseBodyZonesZoneEffectiveScopesEffectiveScope> getEffectiveScope() {
            return this.effectiveScope;
        }

    }

    public static class SearchRecursionZonesResponseBodyZonesZone extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-10-17T06:13Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1749694625000</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>SUB</p>
         */
        @NameInMap("CreatorSubType")
        public String creatorSubType;

        /**
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("CreatorType")
        public String creatorType;

        @NameInMap("EffectiveScopes")
        public SearchRecursionZonesResponseBodyZonesZoneEffectiveScopes effectiveScopes;

        /**
         * <strong>example:</strong>
         * <p>record</p>
         */
        @NameInMap("ProxyPattern")
        public String proxyPattern;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("RecordCount")
        public Integer recordCount;

        /**
         * <strong>example:</strong>
         * <p>107</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <strong>example:</strong>
         * <p>2024-08-13T01:44Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>1639621006000</p>
         */
        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        /**
         * <strong>example:</strong>
         * <p>169439170000011</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        /**
         * <strong>example:</strong>
         * <p>ixiqiu.cn</p>
         */
        @NameInMap("ZoneName")
        public String zoneName;

        public static SearchRecursionZonesResponseBodyZonesZone build(java.util.Map<String, ?> map) throws Exception {
            SearchRecursionZonesResponseBodyZonesZone self = new SearchRecursionZonesResponseBodyZonesZone();
            return TeaModel.build(map, self);
        }

        public SearchRecursionZonesResponseBodyZonesZone setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SearchRecursionZonesResponseBodyZonesZone setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public SearchRecursionZonesResponseBodyZonesZone setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public SearchRecursionZonesResponseBodyZonesZone setCreatorSubType(String creatorSubType) {
            this.creatorSubType = creatorSubType;
            return this;
        }
        public String getCreatorSubType() {
            return this.creatorSubType;
        }

        public SearchRecursionZonesResponseBodyZonesZone setCreatorType(String creatorType) {
            this.creatorType = creatorType;
            return this;
        }
        public String getCreatorType() {
            return this.creatorType;
        }

        public SearchRecursionZonesResponseBodyZonesZone setEffectiveScopes(SearchRecursionZonesResponseBodyZonesZoneEffectiveScopes effectiveScopes) {
            this.effectiveScopes = effectiveScopes;
            return this;
        }
        public SearchRecursionZonesResponseBodyZonesZoneEffectiveScopes getEffectiveScopes() {
            return this.effectiveScopes;
        }

        public SearchRecursionZonesResponseBodyZonesZone setProxyPattern(String proxyPattern) {
            this.proxyPattern = proxyPattern;
            return this;
        }
        public String getProxyPattern() {
            return this.proxyPattern;
        }

        public SearchRecursionZonesResponseBodyZonesZone setRecordCount(Integer recordCount) {
            this.recordCount = recordCount;
            return this;
        }
        public Integer getRecordCount() {
            return this.recordCount;
        }

        public SearchRecursionZonesResponseBodyZonesZone setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public SearchRecursionZonesResponseBodyZonesZone setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public SearchRecursionZonesResponseBodyZonesZone setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public SearchRecursionZonesResponseBodyZonesZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public SearchRecursionZonesResponseBodyZonesZone setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

    }

    public static class SearchRecursionZonesResponseBodyZones extends TeaModel {
        @NameInMap("Zone")
        public java.util.List<SearchRecursionZonesResponseBodyZonesZone> zone;

        public static SearchRecursionZonesResponseBodyZones build(java.util.Map<String, ?> map) throws Exception {
            SearchRecursionZonesResponseBodyZones self = new SearchRecursionZonesResponseBodyZones();
            return TeaModel.build(map, self);
        }

        public SearchRecursionZonesResponseBodyZones setZone(java.util.List<SearchRecursionZonesResponseBodyZonesZone> zone) {
            this.zone = zone;
            return this;
        }
        public java.util.List<SearchRecursionZonesResponseBodyZonesZone> getZone() {
            return this.zone;
        }

    }

}
