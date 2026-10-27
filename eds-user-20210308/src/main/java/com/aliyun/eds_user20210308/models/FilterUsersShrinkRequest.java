// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class FilterUsersShrinkRequest extends TeaModel {
    /**
     * <p>The channel.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("BusinessChannel")
    public String businessChannel;

    /**
     * <p>The list of usernames (EndUserIds) to exclude by exact match.</p>
     */
    @NameInMap("ExcludeEndUserIds")
    public java.util.List<String> excludeEndUserIds;

    /**
     * <p>The fuzzy search string. This parameter supports matching the username (EndUserId) and email address (Email). Wildcards (<em>) are supported. For example, if you set this parameter to a</em>m, all results where the username or email address starts with a and ends with m are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>a*m</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The fuzzy match condition mapping for user information. This parameter supports fields such as the username, remarks, phone number, email address, nickname, and employee ID.</p>
     */
    @NameInMap("FilterMap")
    public String filterMapShrink;

    /**
     * <p>Specifies whether to return the number of cloud computers assigned to the user.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeDesktopCount")
    public Boolean includeDesktopCount;

    /**
     * <p>Specifies whether to return the number of cloud computer pools assigned to the user.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeDesktopGroupCount")
    public Boolean includeDesktopGroupCount;

    /**
     * <p>The list of convenience account usernames to include in the query results.</p>
     */
    @NameInMap("IncludeEndUserIds")
    public java.util.List<String> includeEndUserIds;

    /**
     * <p>Specifies whether to include organization information.</p>
     */
    @NameInMap("IncludeOrgInfo")
    public Boolean includeOrgInfo;

    /**
     * <p>Specifies whether to include the supported logon types.</p>
     */
    @NameInMap("IncludeSupportIdps")
    public Boolean includeSupportIdps;

    /**
     * <p>Specifies whether to query all sub-organizations.</p>
     */
    @NameInMap("IsQueryAllSubOrgs")
    public Boolean isQueryAllSubOrgs;

    /**
     * <p>The number of entries per page in a paged query. If the value exceeds 100, it is automatically reset to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The token for the next query. You do not need to specify this parameter when you call this operation for the first time. If the response does not contain all results, a non-empty NextToken is returned. You can use the returned NextToken in subsequent queries to obtain the remaining results.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The supported sorting parameters.</p>
     */
    @NameInMap("OrderParam")
    public String orderParamShrink;

    /**
     * <p>The ID of the enterprise organization.</p>
     * 
     * <strong>example:</strong>
     * <p>org-aliyun-wy-org-id</p>
     */
    @NameInMap("OrgId")
    public String orgId;

    /**
     * <p>The account activation type.</p>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("OwnerType")
    public String ownerType;

    /**
     * <p>The list of user attributes for fuzzy queries.</p>
     */
    @NameInMap("PropertyFilterParam")
    public java.util.List<FilterUsersShrinkRequestPropertyFilterParam> propertyFilterParam;

    /**
     * <p>The list of attribute names and attribute values.</p>
     */
    @NameInMap("PropertyKeyValueFilterParam")
    public java.util.List<FilterUsersShrinkRequestPropertyKeyValueFilterParam> propertyKeyValueFilterParam;

    /**
     * <p>The switch mapping for additional response information. This parameter controls whether to include desktop policy information.</p>
     */
    @NameInMap("ShowExtras")
    public java.util.Map<String, String> showExtras;

    /**
     * <p>The user status used to filter results.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static FilterUsersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        FilterUsersShrinkRequest self = new FilterUsersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public FilterUsersShrinkRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    public FilterUsersShrinkRequest setExcludeEndUserIds(java.util.List<String> excludeEndUserIds) {
        this.excludeEndUserIds = excludeEndUserIds;
        return this;
    }
    public java.util.List<String> getExcludeEndUserIds() {
        return this.excludeEndUserIds;
    }

    public FilterUsersShrinkRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public FilterUsersShrinkRequest setFilterMapShrink(String filterMapShrink) {
        this.filterMapShrink = filterMapShrink;
        return this;
    }
    public String getFilterMapShrink() {
        return this.filterMapShrink;
    }

    public FilterUsersShrinkRequest setIncludeDesktopCount(Boolean includeDesktopCount) {
        this.includeDesktopCount = includeDesktopCount;
        return this;
    }
    public Boolean getIncludeDesktopCount() {
        return this.includeDesktopCount;
    }

    public FilterUsersShrinkRequest setIncludeDesktopGroupCount(Boolean includeDesktopGroupCount) {
        this.includeDesktopGroupCount = includeDesktopGroupCount;
        return this;
    }
    public Boolean getIncludeDesktopGroupCount() {
        return this.includeDesktopGroupCount;
    }

    public FilterUsersShrinkRequest setIncludeEndUserIds(java.util.List<String> includeEndUserIds) {
        this.includeEndUserIds = includeEndUserIds;
        return this;
    }
    public java.util.List<String> getIncludeEndUserIds() {
        return this.includeEndUserIds;
    }

    public FilterUsersShrinkRequest setIncludeOrgInfo(Boolean includeOrgInfo) {
        this.includeOrgInfo = includeOrgInfo;
        return this;
    }
    public Boolean getIncludeOrgInfo() {
        return this.includeOrgInfo;
    }

    public FilterUsersShrinkRequest setIncludeSupportIdps(Boolean includeSupportIdps) {
        this.includeSupportIdps = includeSupportIdps;
        return this;
    }
    public Boolean getIncludeSupportIdps() {
        return this.includeSupportIdps;
    }

    public FilterUsersShrinkRequest setIsQueryAllSubOrgs(Boolean isQueryAllSubOrgs) {
        this.isQueryAllSubOrgs = isQueryAllSubOrgs;
        return this;
    }
    public Boolean getIsQueryAllSubOrgs() {
        return this.isQueryAllSubOrgs;
    }

    public FilterUsersShrinkRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public FilterUsersShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public FilterUsersShrinkRequest setOrderParamShrink(String orderParamShrink) {
        this.orderParamShrink = orderParamShrink;
        return this;
    }
    public String getOrderParamShrink() {
        return this.orderParamShrink;
    }

    public FilterUsersShrinkRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public FilterUsersShrinkRequest setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public FilterUsersShrinkRequest setPropertyFilterParam(java.util.List<FilterUsersShrinkRequestPropertyFilterParam> propertyFilterParam) {
        this.propertyFilterParam = propertyFilterParam;
        return this;
    }
    public java.util.List<FilterUsersShrinkRequestPropertyFilterParam> getPropertyFilterParam() {
        return this.propertyFilterParam;
    }

    public FilterUsersShrinkRequest setPropertyKeyValueFilterParam(java.util.List<FilterUsersShrinkRequestPropertyKeyValueFilterParam> propertyKeyValueFilterParam) {
        this.propertyKeyValueFilterParam = propertyKeyValueFilterParam;
        return this;
    }
    public java.util.List<FilterUsersShrinkRequestPropertyKeyValueFilterParam> getPropertyKeyValueFilterParam() {
        return this.propertyKeyValueFilterParam;
    }

    public FilterUsersShrinkRequest setShowExtras(java.util.Map<String, String> showExtras) {
        this.showExtras = showExtras;
        return this;
    }
    public java.util.Map<String, String> getShowExtras() {
        return this.showExtras;
    }

    public FilterUsersShrinkRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public static class FilterUsersShrinkRequestPropertyFilterParam extends TeaModel {
        /**
         * <p>The ID of the attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>328</p>
         */
        @NameInMap("PropertyId")
        public Long propertyId;

        /**
         * <p>The IDs of the attribute values.</p>
         * 
         * <strong>example:</strong>
         * <p>1255</p>
         */
        @NameInMap("PropertyValueIds")
        public String propertyValueIds;

        public static FilterUsersShrinkRequestPropertyFilterParam build(java.util.Map<String, ?> map) throws Exception {
            FilterUsersShrinkRequestPropertyFilterParam self = new FilterUsersShrinkRequestPropertyFilterParam();
            return TeaModel.build(map, self);
        }

        public FilterUsersShrinkRequestPropertyFilterParam setPropertyId(Long propertyId) {
            this.propertyId = propertyId;
            return this;
        }
        public Long getPropertyId() {
            return this.propertyId;
        }

        public FilterUsersShrinkRequestPropertyFilterParam setPropertyValueIds(String propertyValueIds) {
            this.propertyValueIds = propertyValueIds;
            return this;
        }
        public String getPropertyValueIds() {
            return this.propertyValueIds;
        }

    }

    public static class FilterUsersShrinkRequestPropertyKeyValueFilterParam extends TeaModel {
        /**
         * <p>The name of the attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>job</p>
         */
        @NameInMap("PropertyKey")
        public String propertyKey;

        /**
         * <p>The values of the attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("PropertyValues")
        public String propertyValues;

        public static FilterUsersShrinkRequestPropertyKeyValueFilterParam build(java.util.Map<String, ?> map) throws Exception {
            FilterUsersShrinkRequestPropertyKeyValueFilterParam self = new FilterUsersShrinkRequestPropertyKeyValueFilterParam();
            return TeaModel.build(map, self);
        }

        public FilterUsersShrinkRequestPropertyKeyValueFilterParam setPropertyKey(String propertyKey) {
            this.propertyKey = propertyKey;
            return this;
        }
        public String getPropertyKey() {
            return this.propertyKey;
        }

        public FilterUsersShrinkRequestPropertyKeyValueFilterParam setPropertyValues(String propertyValues) {
            this.propertyValues = propertyValues;
            return this;
        }
        public String getPropertyValues() {
            return this.propertyValues;
        }

    }

}
