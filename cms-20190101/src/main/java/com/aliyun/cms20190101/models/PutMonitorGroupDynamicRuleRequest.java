// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutMonitorGroupDynamicRuleRequest extends TeaModel {
    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("GroupRules")
    public java.util.List<PutMonitorGroupDynamicRuleRequestGroupRules> groupRules;

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

    public static class PutMonitorGroupDynamicRuleRequestGroupRulesFilters extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Function")
        public String function;

        @NameInMap("Name")
        public String name;

        public static PutMonitorGroupDynamicRuleRequestGroupRulesFilters build(java.util.Map<String, ?> map) throws Exception {
            PutMonitorGroupDynamicRuleRequestGroupRulesFilters self = new PutMonitorGroupDynamicRuleRequestGroupRulesFilters();
            return TeaModel.build(map, self);
        }

        public PutMonitorGroupDynamicRuleRequestGroupRulesFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
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

    }

    public static class PutMonitorGroupDynamicRuleRequestGroupRules extends TeaModel {
        @NameInMap("FilterRelation")
        public String filterRelation;

        @NameInMap("Filters")
        public java.util.List<PutMonitorGroupDynamicRuleRequestGroupRulesFilters> filters;

        @NameInMap("Category")
        public String category;

        public static PutMonitorGroupDynamicRuleRequestGroupRules build(java.util.Map<String, ?> map) throws Exception {
            PutMonitorGroupDynamicRuleRequestGroupRules self = new PutMonitorGroupDynamicRuleRequestGroupRules();
            return TeaModel.build(map, self);
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

        public PutMonitorGroupDynamicRuleRequestGroupRules setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

    }

}
