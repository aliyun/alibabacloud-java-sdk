// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class FilterUsersRequest extends TeaModel {
    /**
     * <p>The list of usernames to be precisely excluded.</p>
     */
    @NameInMap("ExcludeEndUserIds")
    public java.util.List<String> excludeEndUserIds;

    /**
     * <p>The string that is used for fuzzy search. You can use usernames and email addresses to perform fuzzy search. Wildcard characters (\*) are supported for this parameter. For example, if you set this parameter to a\*m, the usernames or an email addresses that start with a or end with m are returned.</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>Specifies whether to return information about cloud desktops that are assigned to the convenience user.</p>
     */
    @NameInMap("IncludeDesktopCount")
    public Boolean includeDesktopCount;

    /**
     * <p>Specifies whether to return the number of desktop groups that are assigned to the user.</p>
     */
    @NameInMap("IncludeDesktopGroupCount")
    public Boolean includeDesktopGroupCount;

    /**
     * <p>The number of entries per page. If you set this parameter to a value greater than 100, the system resets the value to 100.</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. If not all results are returned in a query, a value is returned for the NextToken parameter. In this case, you can use the returned NextToken value to start the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The parameter that supports to sort query results.</p>
     */
    @NameInMap("OrderParam")
    public FilterUsersRequestOrderParam orderParam;

    /**
     * <p>The ID of the organization.</p>
     */
    @NameInMap("OrgId")
    public String orgId;

    /**
     * <p>The type of the account ownership.</p>
     */
    @NameInMap("OwnerType")
    public String ownerType;

    /**
     * <p>The list of properties for fuzzy search.</p>
     */
    @NameInMap("PropertyFilterParam")
    public java.util.List<FilterUsersRequestPropertyFilterParam> propertyFilterParam;

    /**
     * <p>The list of property names and property values.</p>
     */
    @NameInMap("PropertyKeyValueFilterParam")
    public java.util.List<FilterUsersRequestPropertyKeyValueFilterParam> propertyKeyValueFilterParam;

    public static FilterUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        FilterUsersRequest self = new FilterUsersRequest();
        return TeaModel.build(map, self);
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

    public static class FilterUsersRequestOrderParam extends TeaModel {
        /**
         * <p>The way to sort query results.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   EndUserId</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   id</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   gmt_created</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("OrderField")
        public String orderField;

        /**
         * <p>Specifies whether to sort query results in ascending or descending order. Valid values:</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   ASC: ascending</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   DESC (default): descending</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
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
         * <p>The ID of the property.</p>
         */
        @NameInMap("PropertyId")
        public Long propertyId;

        /**
         * <p>The IDs of the property values.</p>
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
         * <p>The property name.</p>
         */
        @NameInMap("PropertyKey")
        public String propertyKey;

        /**
         * <p>The property values.</p>
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
