// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutMonitorGroupDynamicRuleRequest extends TeaModel {
    @NameInMap("GroupId")
    @Validation(required = true)
    public Long groupId;

    @NameInMap("GroupRules")
    @Validation(required = true)
    public java.util.List<PutMonitorGroupDynamicRuleRequestGroupRules> groupRules;

    public static PutMonitorGroupDynamicRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        PutMonitorGroupDynamicRuleRequest self = new PutMonitorGroupDynamicRuleRequest();
        return TeaModel.build(map, self);
    }

    public static class PutMonitorGroupDynamicRuleRequestGroupRulesFilters extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Function")
        @Validation(required = true)
        public String function;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static PutMonitorGroupDynamicRuleRequestGroupRulesFilters build(java.util.Map<String, ?> map) throws Exception {
            PutMonitorGroupDynamicRuleRequestGroupRulesFilters self = new PutMonitorGroupDynamicRuleRequestGroupRulesFilters();
            return TeaModel.build(map, self);
        }

    }

    public static class PutMonitorGroupDynamicRuleRequestGroupRules extends TeaModel {
        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("FilterRelation")
        @Validation(required = true)
        public String filterRelation;

        @NameInMap("Filters")
        @Validation(required = true)
        public java.util.List<PutMonitorGroupDynamicRuleRequestGroupRulesFilters> filters;

        public static PutMonitorGroupDynamicRuleRequestGroupRules build(java.util.Map<String, ?> map) throws Exception {
            PutMonitorGroupDynamicRuleRequestGroupRules self = new PutMonitorGroupDynamicRuleRequestGroupRules();
            return TeaModel.build(map, self);
        }

    }

}
