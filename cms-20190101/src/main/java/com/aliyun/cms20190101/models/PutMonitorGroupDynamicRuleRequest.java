// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutMonitorGroupDynamicRuleRequest extends TeaModel {
    /**
     * <p>The ID of the application group.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>None.</p>
     */
    @NameInMap("GroupRules")
    public java.util.List<PutMonitorGroupDynamicRuleRequestGroupRules> groupRules;

    /**
     * <p>The mode for creating the alert rule. Valid values:</p>
     * <br>
     * <p>*   true: creates asynchronously</p>
     * <p>*   false (default): creates synchronously</p>
     */
    @NameInMap("IsAsync")
    public Boolean isAsync;

    @NameInMap("RegionId")
    public String regionId;

    public static PutMonitorGroupDynamicRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        PutMonitorGroupDynamicRuleRequest self = new PutMonitorGroupDynamicRuleRequest();
        return TeaModel.build(map, self);
    }

    public PutMonitorGroupDynamicRuleRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public PutMonitorGroupDynamicRuleRequest setGroupRules(java.util.List<PutMonitorGroupDynamicRuleRequestGroupRules> groupRules) {
        this.groupRules = groupRules;
        return this;
    }
    public java.util.List<PutMonitorGroupDynamicRuleRequestGroupRules> getGroupRules() {
        return this.groupRules;
    }

    public PutMonitorGroupDynamicRuleRequest setIsAsync(Boolean isAsync) {
        this.isAsync = isAsync;
        return this;
    }
    public Boolean getIsAsync() {
        return this.isAsync;
    }

    public PutMonitorGroupDynamicRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class PutMonitorGroupDynamicRuleRequestGroupRulesFilters extends TeaModel {
        /**
         * <p>The method that is used to filter instances. Valid values of N: 1 to 3. Valid values:</p>
         * <br>
         * <p>*   contains: contains</p>
         * <p>*   notContains: does not contain</p>
         * <p>*   startWith: starts with a prefix</p>
         * <p>*   endWith: ends with a suffix</p>
         */
        @NameInMap("Function")
        public String function;

        /**
         * <p>The name of the field based on which instances are filtered. Valid values of N: 1 to 3.</p>
         * <br>
         * <p>Only hostnames are supported. Example: hostName.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value to be matched with the specified field. Valid values of N: 1 to 3.</p>
         */
        @NameInMap("Value")
        public String value;

        public static PutMonitorGroupDynamicRuleRequestGroupRulesFilters build(java.util.Map<String, ?> map) throws Exception {
            PutMonitorGroupDynamicRuleRequestGroupRulesFilters self = new PutMonitorGroupDynamicRuleRequestGroupRulesFilters();
            return TeaModel.build(map, self);
        }

        public PutMonitorGroupDynamicRuleRequestGroupRulesFilters setFunction(String function) {
            this.function = function;
            return this;
        }
        public String getFunction() {
            return this.function;
        }

        public PutMonitorGroupDynamicRuleRequestGroupRulesFilters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PutMonitorGroupDynamicRuleRequestGroupRulesFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class PutMonitorGroupDynamicRuleRequestGroupRules extends TeaModel {
        /**
         * <p>The cloud service to which the alert rule is applied. Valid values of N: 1 to 3. Valid values:</p>
         * <br>
         * <p>*   ecs: Elastic Compute Service (ECS)</p>
         * <p>*   rds: ApsaraDB RDS</p>
         * <p>*   slb: Server Load Balancer (SLB)</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The logical operator used between conditional expressions in the alert rule. Valid values of N: 1 to 3. Valid values:</p>
         * <br>
         * <p>*   and: The instances that meet all the conditional expressions are automatically added to the application group.</p>
         * <p>*   or: The instances that meet one of the conditional expressions are automatically added to the application group.</p>
         */
        @NameInMap("FilterRelation")
        public String filterRelation;

        /**
         * <p>None.</p>
         */
        @NameInMap("Filters")
        public java.util.List<PutMonitorGroupDynamicRuleRequestGroupRulesFilters> filters;

        public static PutMonitorGroupDynamicRuleRequestGroupRules build(java.util.Map<String, ?> map) throws Exception {
            PutMonitorGroupDynamicRuleRequestGroupRules self = new PutMonitorGroupDynamicRuleRequestGroupRules();
            return TeaModel.build(map, self);
        }

        public PutMonitorGroupDynamicRuleRequestGroupRules setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public PutMonitorGroupDynamicRuleRequestGroupRules setFilterRelation(String filterRelation) {
            this.filterRelation = filterRelation;
            return this;
        }
        public String getFilterRelation() {
            return this.filterRelation;
        }

        public PutMonitorGroupDynamicRuleRequestGroupRules setFilters(java.util.List<PutMonitorGroupDynamicRuleRequestGroupRulesFilters> filters) {
            this.filters = filters;
            return this;
        }
        public java.util.List<PutMonitorGroupDynamicRuleRequestGroupRulesFilters> getFilters() {
            return this.filters;
        }

    }

}
