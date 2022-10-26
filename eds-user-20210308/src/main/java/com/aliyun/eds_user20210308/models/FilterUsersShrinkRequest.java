// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class FilterUsersShrinkRequest extends TeaModel {
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
    public String orderParamShrink;

    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("OwnerType")
    public String ownerType;

    @NameInMap("PropertyFilterParam")
    public java.util.List<FilterUsersShrinkRequestPropertyFilterParam> propertyFilterParam;

    @NameInMap("PropertyKeyValueFilterParam")
    public java.util.List<FilterUsersShrinkRequestPropertyKeyValueFilterParam> propertyKeyValueFilterParam;

    public static FilterUsersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        FilterUsersShrinkRequest self = new FilterUsersShrinkRequest();
        return TeaModel.build(map, self);
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

    public static class FilterUsersShrinkRequestPropertyFilterParam extends TeaModel {
        @NameInMap("PropertyId")
        public Long propertyId;

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
        @NameInMap("PropertyKey")
        public String propertyKey;

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
