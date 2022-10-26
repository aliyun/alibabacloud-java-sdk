// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class FilterUsersRequest extends TeaModel {
    @NameInMap("ExcludeEndUserIds")
    public java.util.List<String> excludeEndUserIds;

    @NameInMap("Filter")
    public String filter;

    @NameInMap("IncludeDesktopCount")
    public Boolean includeDesktopCount;

    @NameInMap("IncludeDesktopGroupCount")
    public Boolean includeDesktopGroupCount;

    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OrderParam")
    public FilterUsersRequestOrderParam orderParam;

    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("OwnerType")
    public String ownerType;

    @NameInMap("PropertyFilterParam")
    public java.util.List<FilterUsersRequestPropertyFilterParam> propertyFilterParam;

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
        @NameInMap("OrderField")
        public String orderField;

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
        @NameInMap("PropertyId")
        public Long propertyId;

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
        @NameInMap("PropertyKey")
        public String propertyKey;

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
