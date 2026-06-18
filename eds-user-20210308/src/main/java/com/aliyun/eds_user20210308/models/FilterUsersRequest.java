// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class FilterUsersRequest extends TeaModel {
    /**
     * <p>The channel.</p>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("BusinessChannel")
    public String businessChannel;

    /**
     * <p>The usernames (<code>EndUserId</code>) to exclude by exact match.</p>
     */
    @NameInMap("ExcludeEndUserIds")
    public java.util.List<String> excludeEndUserIds;

    /**
     * <p>The string for a fuzzy search on the username (<code>EndUserId</code>) and email address (<code>Email</code>). The wildcard character (<code>*</code>) is supported. For example, if you set this parameter to <code>a*m</code>, the query returns all results where the username or email address starts with <code>a</code> and ends with <code>m</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>a*m</p>
     */
    @NameInMap("Filter")
    public String filter;

    @NameInMap("FilterMap")
    public java.util.Map<String, String> filterMap;

    /**
     * <p>Specifies whether to return the number of cloud desktops that are assigned to the user.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeDesktopCount")
    public Boolean includeDesktopCount;

    /**
     * <p>Specifies whether to return the number of desktop groups that are assigned to the user.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeDesktopGroupCount")
    public Boolean includeDesktopGroupCount;

    @NameInMap("IncludeEndUserIds")
    public java.util.List<String> includeEndUserIds;

    /**
     * <p>Specifies whether to include organization information in the response.</p>
     */
    @NameInMap("IncludeOrgInfo")
    public Boolean includeOrgInfo;

    /**
     * <p>Specifies whether to include the supported logon types in the response.</p>
     */
    @NameInMap("IncludeSupportIdps")
    public Boolean includeSupportIdps;

    /**
     * <p>Specifies whether to query all sub-organizations.</p>
     */
    @NameInMap("IsQueryAllSubOrgs")
    public Boolean isQueryAllSubOrgs;

    /**
     * <p>The number of entries per page. If you specify a value greater than 100, the system automatically sets this parameter to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. If the number of results exceeds the value of the <code>MaxResults</code> parameter, a <code>NextToken</code> is returned. You can use the <code>NextToken</code> to query the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sorting parameters.</p>
     */
    @NameInMap("OrderParam")
    public FilterUsersRequestOrderParam orderParam;

    /**
     * <p>The organization ID.</p>
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
     * <p>The user properties for a fuzzy search.</p>
     */
    @NameInMap("PropertyFilterParam")
    public java.util.List<FilterUsersRequestPropertyFilterParam> propertyFilterParam;

    /**
     * <p>The information about property keys and property values.</p>
     */
    @NameInMap("PropertyKeyValueFilterParam")
    public java.util.List<FilterUsersRequestPropertyKeyValueFilterParam> propertyKeyValueFilterParam;

    @NameInMap("ShowExtras")
    public java.util.Map<String, String> showExtras;

    /**
     * <p>The user status by which to filter the results.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static FilterUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        FilterUsersRequest self = new FilterUsersRequest();
        return TeaModel.build(map, self);
    }

    public FilterUsersRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    public FilterUsersRequest setExcludeEndUserIds(java.util.List<String> excludeEndUserIds) {
        this.excludeEndUserIds = excludeEndUserIds;
        return this;
    }
    public java.util.List<String> getExcludeEndUserIds() {
        return this.excludeEndUserIds;
    }

    public FilterUsersRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public FilterUsersRequest setFilterMap(java.util.Map<String, String> filterMap) {
        this.filterMap = filterMap;
        return this;
    }
    public java.util.Map<String, String> getFilterMap() {
        return this.filterMap;
    }

    public FilterUsersRequest setIncludeDesktopCount(Boolean includeDesktopCount) {
        this.includeDesktopCount = includeDesktopCount;
        return this;
    }
    public Boolean getIncludeDesktopCount() {
        return this.includeDesktopCount;
    }

    public FilterUsersRequest setIncludeDesktopGroupCount(Boolean includeDesktopGroupCount) {
        this.includeDesktopGroupCount = includeDesktopGroupCount;
        return this;
    }
    public Boolean getIncludeDesktopGroupCount() {
        return this.includeDesktopGroupCount;
    }

    public FilterUsersRequest setIncludeEndUserIds(java.util.List<String> includeEndUserIds) {
        this.includeEndUserIds = includeEndUserIds;
        return this;
    }
    public java.util.List<String> getIncludeEndUserIds() {
        return this.includeEndUserIds;
    }

    public FilterUsersRequest setIncludeOrgInfo(Boolean includeOrgInfo) {
        this.includeOrgInfo = includeOrgInfo;
        return this;
    }
    public Boolean getIncludeOrgInfo() {
        return this.includeOrgInfo;
    }

    public FilterUsersRequest setIncludeSupportIdps(Boolean includeSupportIdps) {
        this.includeSupportIdps = includeSupportIdps;
        return this;
    }
    public Boolean getIncludeSupportIdps() {
        return this.includeSupportIdps;
    }

    public FilterUsersRequest setIsQueryAllSubOrgs(Boolean isQueryAllSubOrgs) {
        this.isQueryAllSubOrgs = isQueryAllSubOrgs;
        return this;
    }
    public Boolean getIsQueryAllSubOrgs() {
        return this.isQueryAllSubOrgs;
    }

    public FilterUsersRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public FilterUsersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public FilterUsersRequest setOrderParam(FilterUsersRequestOrderParam orderParam) {
        this.orderParam = orderParam;
        return this;
    }
    public FilterUsersRequestOrderParam getOrderParam() {
        return this.orderParam;
    }

    public FilterUsersRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public FilterUsersRequest setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public FilterUsersRequest setPropertyFilterParam(java.util.List<FilterUsersRequestPropertyFilterParam> propertyFilterParam) {
        this.propertyFilterParam = propertyFilterParam;
        return this;
    }
    public java.util.List<FilterUsersRequestPropertyFilterParam> getPropertyFilterParam() {
        return this.propertyFilterParam;
    }

    public FilterUsersRequest setPropertyKeyValueFilterParam(java.util.List<FilterUsersRequestPropertyKeyValueFilterParam> propertyKeyValueFilterParam) {
        this.propertyKeyValueFilterParam = propertyKeyValueFilterParam;
        return this;
    }
    public java.util.List<FilterUsersRequestPropertyKeyValueFilterParam> getPropertyKeyValueFilterParam() {
        return this.propertyKeyValueFilterParam;
    }

    public FilterUsersRequest setShowExtras(java.util.Map<String, String> showExtras) {
        this.showExtras = showExtras;
        return this;
    }
    public java.util.Map<String, String> getShowExtras() {
        return this.showExtras;
    }

    public FilterUsersRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public static class FilterUsersRequestOrderParam extends TeaModel {
        /**
         * <p>The field by which to sort the results.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("OrderField")
        public String orderField;

        /**
         * <p>The sort order.</p>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        public static FilterUsersRequestOrderParam build(java.util.Map<String, ?> map) throws Exception {
            FilterUsersRequestOrderParam self = new FilterUsersRequestOrderParam();
            return TeaModel.build(map, self);
        }

        public FilterUsersRequestOrderParam setOrderField(String orderField) {
            this.orderField = orderField;
            return this;
        }
        public String getOrderField() {
            return this.orderField;
        }

        public FilterUsersRequestOrderParam setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

    }

    public static class FilterUsersRequestPropertyFilterParam extends TeaModel {
        /**
         * <p>The property ID.</p>
         * 
         * <strong>example:</strong>
         * <p>328</p>
         */
        @NameInMap("PropertyId")
        public Long propertyId;

        /**
         * <p>The property value ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1255</p>
         */
        @NameInMap("PropertyValueIds")
        public String propertyValueIds;

        public static FilterUsersRequestPropertyFilterParam build(java.util.Map<String, ?> map) throws Exception {
            FilterUsersRequestPropertyFilterParam self = new FilterUsersRequestPropertyFilterParam();
            return TeaModel.build(map, self);
        }

        public FilterUsersRequestPropertyFilterParam setPropertyId(Long propertyId) {
            this.propertyId = propertyId;
            return this;
        }
        public Long getPropertyId() {
            return this.propertyId;
        }

        public FilterUsersRequestPropertyFilterParam setPropertyValueIds(String propertyValueIds) {
            this.propertyValueIds = propertyValueIds;
            return this;
        }
        public String getPropertyValueIds() {
            return this.propertyValueIds;
        }

    }

    public static class FilterUsersRequestPropertyKeyValueFilterParam extends TeaModel {
        /**
         * <p>The property key.</p>
         * 
         * <strong>example:</strong>
         * <p>job</p>
         */
        @NameInMap("PropertyKey")
        public String propertyKey;

        /**
         * <p>The property value.</p>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("PropertyValues")
        public String propertyValues;

        public static FilterUsersRequestPropertyKeyValueFilterParam build(java.util.Map<String, ?> map) throws Exception {
            FilterUsersRequestPropertyKeyValueFilterParam self = new FilterUsersRequestPropertyKeyValueFilterParam();
            return TeaModel.build(map, self);
        }

        public FilterUsersRequestPropertyKeyValueFilterParam setPropertyKey(String propertyKey) {
            this.propertyKey = propertyKey;
            return this;
        }
        public String getPropertyKey() {
            return this.propertyKey;
        }

        public FilterUsersRequestPropertyKeyValueFilterParam setPropertyValues(String propertyValues) {
            this.propertyValues = propertyValues;
            return this;
        }
        public String getPropertyValues() {
            return this.propertyValues;
        }

    }

}
