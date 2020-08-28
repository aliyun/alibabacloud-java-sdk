// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupDynamicRulesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("Resource")
    @Validation(required = true)
    public DescribeMonitorGroupDynamicRulesResponseResource resource;

    public static DescribeMonitorGroupDynamicRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorGroupDynamicRulesResponse self = new DescribeMonitorGroupDynamicRulesResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeMonitorGroupDynamicRulesResponseResourceResourceFiltersFilter extends TeaModel {
        @NameInMap("Function")
        @Validation(required = true)
        public String function;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeMonitorGroupDynamicRulesResponseResourceResourceFiltersFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupDynamicRulesResponseResourceResourceFiltersFilter self = new DescribeMonitorGroupDynamicRulesResponseResourceResourceFiltersFilter();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMonitorGroupDynamicRulesResponseResourceResourceFilters extends TeaModel {
        @NameInMap("Filter")
        @Validation(required = true)
        public java.util.List<DescribeMonitorGroupDynamicRulesResponseResourceResourceFiltersFilter> filter;

        public static DescribeMonitorGroupDynamicRulesResponseResourceResourceFilters build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupDynamicRulesResponseResourceResourceFilters self = new DescribeMonitorGroupDynamicRulesResponseResourceResourceFilters();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMonitorGroupDynamicRulesResponseResourceResource extends TeaModel {
        @NameInMap("GroupId")
        @Validation(required = true)
        public Long groupId;

        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("FilterRelation")
        @Validation(required = true)
        public String filterRelation;

        @NameInMap("Filters")
        @Validation(required = true)
        public DescribeMonitorGroupDynamicRulesResponseResourceResourceFilters filters;

        public static DescribeMonitorGroupDynamicRulesResponseResourceResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupDynamicRulesResponseResourceResource self = new DescribeMonitorGroupDynamicRulesResponseResourceResource();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMonitorGroupDynamicRulesResponseResource extends TeaModel {
        @NameInMap("Resource")
        @Validation(required = true)
        public java.util.List<DescribeMonitorGroupDynamicRulesResponseResourceResource> resource;

        public static DescribeMonitorGroupDynamicRulesResponseResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupDynamicRulesResponseResource self = new DescribeMonitorGroupDynamicRulesResponseResource();
            return TeaModel.build(map, self);
        }

    }

}
