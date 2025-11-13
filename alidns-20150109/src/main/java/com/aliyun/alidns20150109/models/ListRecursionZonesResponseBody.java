// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListRecursionZonesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100</p>
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
     * <p>5</p>
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
     * <p>1</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    @NameInMap("Zones")
    public ListRecursionZonesResponseBodyZones zones;

    public static ListRecursionZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRecursionZonesResponseBody self = new ListRecursionZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRecursionZonesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRecursionZonesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRecursionZonesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRecursionZonesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRecursionZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRecursionZonesResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public ListRecursionZonesResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public ListRecursionZonesResponseBody setZones(ListRecursionZonesResponseBodyZones zones) {
        this.zones = zones;
        return this;
    }
    public ListRecursionZonesResponseBodyZones getZones() {
        return this.zones;
    }

    public static class ListRecursionZonesResponseBodyZonesZoneEffectiveScopesEffectiveScopeScopes extends TeaModel {
        @NameInMap("Scope")
        public java.util.List<String> scope;

        public static ListRecursionZonesResponseBodyZonesZoneEffectiveScopesEffectiveScopeScopes build(java.util.Map<String, ?> map) throws Exception {
            ListRecursionZonesResponseBodyZonesZoneEffectiveScopesEffectiveScopeScopes self = new ListRecursionZonesResponseBodyZonesZoneEffectiveScopesEffectiveScopeScopes();
            return TeaModel.build(map, self);
        }

        public ListRecursionZonesResponseBodyZonesZoneEffectiveScopesEffectiveScopeScopes setScope(java.util.List<String> scope) {
            this.scope = scope;
            return this;
        }
        public java.util.List<String> getScope() {
            return this.scope;
        }

    }

    public static class ListRecursionZonesResponseBodyZonesZoneEffectiveScopesEffectiveScope extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>account</p>
         */
        @NameInMap("EffectiveType")
        public String effectiveType;

        @NameInMap("Scopes")
        public ListRecursionZonesResponseBodyZonesZoneEffectiveScopesEffectiveScopeScopes scopes;

        public static ListRecursionZonesResponseBodyZonesZoneEffectiveScopesEffectiveScope build(java.util.Map<String, ?> map) throws Exception {
            ListRecursionZonesResponseBodyZonesZoneEffectiveScopesEffectiveScope self = new ListRecursionZonesResponseBodyZonesZoneEffectiveScopesEffectiveScope();
            return TeaModel.build(map, self);
        }

        public ListRecursionZonesResponseBodyZonesZoneEffectiveScopesEffectiveScope setEffectiveType(String effectiveType) {
            this.effectiveType = effectiveType;
            return this;
        }
        public String getEffectiveType() {
            return this.effectiveType;
        }

        public ListRecursionZonesResponseBodyZonesZoneEffectiveScopesEffectiveScope setScopes(ListRecursionZonesResponseBodyZonesZoneEffectiveScopesEffectiveScopeScopes scopes) {
            this.scopes = scopes;
            return this;
        }
        public ListRecursionZonesResponseBodyZonesZoneEffectiveScopesEffectiveScopeScopes getScopes() {
            return this.scopes;
        }

    }

    public static class ListRecursionZonesResponseBodyZonesZoneEffectiveScopes extends TeaModel {
        @NameInMap("EffectiveScope")
        public java.util.List<ListRecursionZonesResponseBodyZonesZoneEffectiveScopesEffectiveScope> effectiveScope;

        public static ListRecursionZonesResponseBodyZonesZoneEffectiveScopes build(java.util.Map<String, ?> map) throws Exception {
            ListRecursionZonesResponseBodyZonesZoneEffectiveScopes self = new ListRecursionZonesResponseBodyZonesZoneEffectiveScopes();
            return TeaModel.build(map, self);
        }

        public ListRecursionZonesResponseBodyZonesZoneEffectiveScopes setEffectiveScope(java.util.List<ListRecursionZonesResponseBodyZonesZoneEffectiveScopesEffectiveScope> effectiveScope) {
            this.effectiveScope = effectiveScope;
            return this;
        }
        public java.util.List<ListRecursionZonesResponseBodyZonesZoneEffectiveScopesEffectiveScope> getEffectiveScope() {
            return this.effectiveScope;
        }

    }

    public static class ListRecursionZonesResponseBodyZonesZone extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2021-03-08T05:45Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1729674680000</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <strong>example:</strong>
         * <p>218497924149333932</p>
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
        public ListRecursionZonesResponseBodyZonesZoneEffectiveScopes effectiveScopes;

        /**
         * <strong>example:</strong>
         * <p>record</p>
         */
        @NameInMap("ProxyPattern")
        public String proxyPattern;

        /**
         * <strong>example:</strong>
         * <p>8</p>
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
         * <p>2024-11-12T04:30Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>1707189878000</p>
         */
        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        /**
         * <strong>example:</strong>
         * <p>173671468000011</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        /**
         * <strong>example:</strong>
         * <p>dfsdfsd</p>
         */
        @NameInMap("ZoneName")
        public String zoneName;

        public static ListRecursionZonesResponseBodyZonesZone build(java.util.Map<String, ?> map) throws Exception {
            ListRecursionZonesResponseBodyZonesZone self = new ListRecursionZonesResponseBodyZonesZone();
            return TeaModel.build(map, self);
        }

        public ListRecursionZonesResponseBodyZonesZone setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListRecursionZonesResponseBodyZonesZone setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public ListRecursionZonesResponseBodyZonesZone setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListRecursionZonesResponseBodyZonesZone setCreatorSubType(String creatorSubType) {
            this.creatorSubType = creatorSubType;
            return this;
        }
        public String getCreatorSubType() {
            return this.creatorSubType;
        }

        public ListRecursionZonesResponseBodyZonesZone setCreatorType(String creatorType) {
            this.creatorType = creatorType;
            return this;
        }
        public String getCreatorType() {
            return this.creatorType;
        }

        public ListRecursionZonesResponseBodyZonesZone setEffectiveScopes(ListRecursionZonesResponseBodyZonesZoneEffectiveScopes effectiveScopes) {
            this.effectiveScopes = effectiveScopes;
            return this;
        }
        public ListRecursionZonesResponseBodyZonesZoneEffectiveScopes getEffectiveScopes() {
            return this.effectiveScopes;
        }

        public ListRecursionZonesResponseBodyZonesZone setProxyPattern(String proxyPattern) {
            this.proxyPattern = proxyPattern;
            return this;
        }
        public String getProxyPattern() {
            return this.proxyPattern;
        }

        public ListRecursionZonesResponseBodyZonesZone setRecordCount(Integer recordCount) {
            this.recordCount = recordCount;
            return this;
        }
        public Integer getRecordCount() {
            return this.recordCount;
        }

        public ListRecursionZonesResponseBodyZonesZone setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListRecursionZonesResponseBodyZonesZone setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListRecursionZonesResponseBodyZonesZone setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public ListRecursionZonesResponseBodyZonesZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public ListRecursionZonesResponseBodyZonesZone setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

    }

    public static class ListRecursionZonesResponseBodyZones extends TeaModel {
        @NameInMap("Zone")
        public java.util.List<ListRecursionZonesResponseBodyZonesZone> zone;

        public static ListRecursionZonesResponseBodyZones build(java.util.Map<String, ?> map) throws Exception {
            ListRecursionZonesResponseBodyZones self = new ListRecursionZonesResponseBodyZones();
            return TeaModel.build(map, self);
        }

        public ListRecursionZonesResponseBodyZones setZone(java.util.List<ListRecursionZonesResponseBodyZonesZone> zone) {
            this.zone = zone;
            return this;
        }
        public java.util.List<ListRecursionZonesResponseBodyZonesZone> getZone() {
            return this.zone;
        }

    }

}
