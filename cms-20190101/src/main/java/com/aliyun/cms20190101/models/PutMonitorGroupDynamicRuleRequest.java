// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutMonitorGroupDynamicRuleRequest extends TeaModel {
    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("GroupRules")
    public java.util.List<PutMonitorGroupDynamicRuleRequestGroupRules> groupRules;

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
        @NameInMap("Function")
        public String function;

        @NameInMap("Name")
        public String name;

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
        @NameInMap("Category")
        public String category;

        @NameInMap("FilterRelation")
        public String filterRelation;

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
