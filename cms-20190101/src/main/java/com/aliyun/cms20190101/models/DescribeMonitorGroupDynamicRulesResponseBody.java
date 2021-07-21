// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupDynamicRulesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Resource")
    public DescribeMonitorGroupDynamicRulesResponseBodyResource resource;

    public static DescribeMonitorGroupDynamicRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorGroupDynamicRulesResponseBody self = new DescribeMonitorGroupDynamicRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorGroupDynamicRulesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeMonitorGroupDynamicRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMonitorGroupDynamicRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMonitorGroupDynamicRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeMonitorGroupDynamicRulesResponseBody setResource(DescribeMonitorGroupDynamicRulesResponseBodyResource resource) {
        this.resource = resource;
        return this;
    }
    public DescribeMonitorGroupDynamicRulesResponseBodyResource getResource() {
        return this.resource;
    }

    public static class DescribeMonitorGroupDynamicRulesResponseBodyResourceResourceFiltersFilter extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Function")
        public String function;

        @NameInMap("Name")
        public String name;

        public static DescribeMonitorGroupDynamicRulesResponseBodyResourceResourceFiltersFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupDynamicRulesResponseBodyResourceResourceFiltersFilter self = new DescribeMonitorGroupDynamicRulesResponseBodyResourceResourceFiltersFilter();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorGroupDynamicRulesResponseBodyResourceResourceFiltersFilter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeMonitorGroupDynamicRulesResponseBodyResourceResourceFiltersFilter setFunction(String function) {
            this.function = function;
            return this;
        }
        public String getFunction() {
            return this.function;
        }

        public DescribeMonitorGroupDynamicRulesResponseBodyResourceResourceFiltersFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeMonitorGroupDynamicRulesResponseBodyResourceResourceFilters extends TeaModel {
        @NameInMap("Filter")
        public java.util.List<DescribeMonitorGroupDynamicRulesResponseBodyResourceResourceFiltersFilter> filter;

        public static DescribeMonitorGroupDynamicRulesResponseBodyResourceResourceFilters build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupDynamicRulesResponseBodyResourceResourceFilters self = new DescribeMonitorGroupDynamicRulesResponseBodyResourceResourceFilters();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorGroupDynamicRulesResponseBodyResourceResourceFilters setFilter(java.util.List<DescribeMonitorGroupDynamicRulesResponseBodyResourceResourceFiltersFilter> filter) {
            this.filter = filter;
            return this;
        }
        public java.util.List<DescribeMonitorGroupDynamicRulesResponseBodyResourceResourceFiltersFilter> getFilter() {
            return this.filter;
        }

    }

    public static class DescribeMonitorGroupDynamicRulesResponseBodyResourceResource extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("FilterRelation")
        public String filterRelation;

        @NameInMap("Filters")
        public DescribeMonitorGroupDynamicRulesResponseBodyResourceResourceFilters filters;

        public static DescribeMonitorGroupDynamicRulesResponseBodyResourceResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupDynamicRulesResponseBodyResourceResource self = new DescribeMonitorGroupDynamicRulesResponseBodyResourceResource();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorGroupDynamicRulesResponseBodyResourceResource setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeMonitorGroupDynamicRulesResponseBodyResourceResource setFilterRelation(String filterRelation) {
            this.filterRelation = filterRelation;
            return this;
        }
        public String getFilterRelation() {
            return this.filterRelation;
        }

        public DescribeMonitorGroupDynamicRulesResponseBodyResourceResource setFilters(DescribeMonitorGroupDynamicRulesResponseBodyResourceResourceFilters filters) {
            this.filters = filters;
            return this;
        }
        public DescribeMonitorGroupDynamicRulesResponseBodyResourceResourceFilters getFilters() {
            return this.filters;
        }

    }

    public static class DescribeMonitorGroupDynamicRulesResponseBodyResource extends TeaModel {
        @NameInMap("Resource")
        public java.util.List<DescribeMonitorGroupDynamicRulesResponseBodyResourceResource> resource;

        public static DescribeMonitorGroupDynamicRulesResponseBodyResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupDynamicRulesResponseBodyResource self = new DescribeMonitorGroupDynamicRulesResponseBodyResource();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorGroupDynamicRulesResponseBodyResource setResource(java.util.List<DescribeMonitorGroupDynamicRulesResponseBodyResourceResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<DescribeMonitorGroupDynamicRulesResponseBodyResourceResource> getResource() {
            return this.resource;
        }

    }

}
