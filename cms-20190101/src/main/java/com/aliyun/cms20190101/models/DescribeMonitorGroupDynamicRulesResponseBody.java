// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupDynamicRulesResponseBody extends TeaModel {
    /**
     * <p>The responses code.</p>
     * <blockquote>
     * <p> The status code 200 indicates that the request was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified resource is not found.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2170B94A-1576-4D65-900E-2093037CDAF3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resources that are associated with the application group.</p>
     */
    @NameInMap("Resource")
    public DescribeMonitorGroupDynamicRulesResponseBodyResource resource;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

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

    public DescribeMonitorGroupDynamicRulesResponseBody setResource(DescribeMonitorGroupDynamicRulesResponseBodyResource resource) {
        this.resource = resource;
        return this;
    }
    public DescribeMonitorGroupDynamicRulesResponseBodyResource getResource() {
        return this.resource;
    }

    public DescribeMonitorGroupDynamicRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeMonitorGroupDynamicRulesResponseBodyResourceResourceFiltersFilter extends TeaModel {
        /**
         * <p>The method that is used to filter the instances. Valid values:</p>
         * <ul>
         * <li>contains: contains</li>
         * <li>startWith: starts with a prefix</li>
         * <li>endWith: ends with a suffix</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>contains</p>
         */
        @NameInMap("Function")
        public String function;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>hostName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the dynamic rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeMonitorGroupDynamicRulesResponseBodyResourceResourceFiltersFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupDynamicRulesResponseBodyResourceResourceFiltersFilter self = new DescribeMonitorGroupDynamicRulesResponseBodyResourceResourceFiltersFilter();
            return TeaModel.build(map, self);
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

        public DescribeMonitorGroupDynamicRulesResponseBodyResourceResourceFiltersFilter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
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
        /**
         * <p>The type of the cloud service to which the dynamic rule belongs. Valid values:</p>
         * <ul>
         * <li>ecs: Elastic Compute Service (ECS)</li>
         * <li>rds: ApsaraDB RDS</li>
         * <li>slb: Server Load Balancer (SLB)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The filter condition. Valid values:</p>
         * <ul>
         * <li>and: queries the instances that meet all alert rules.</li>
         * <li>or: queries the instances that meet any alert rule.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>and</p>
         */
        @NameInMap("FilterRelation")
        public String filterRelation;

        /**
         * <p>The dynamic rules of the application group.</p>
         */
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
