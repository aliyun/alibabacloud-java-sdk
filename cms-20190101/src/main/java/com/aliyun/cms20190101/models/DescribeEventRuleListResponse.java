// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeEventRuleListResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("EventRules")
    @Validation(required = true)
    public DescribeEventRuleListResponseEventRules eventRules;

    public static DescribeEventRuleListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventRuleListResponse self = new DescribeEventRuleListResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeEventRuleListResponseEventRulesEventRuleEventPatternEventPatternNameList extends TeaModel {
        @NameInMap("NameList")
        @Validation(required = true)
        public java.util.List<String> nameList;

        public static DescribeEventRuleListResponseEventRulesEventRuleEventPatternEventPatternNameList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleListResponseEventRulesEventRuleEventPatternEventPatternNameList self = new DescribeEventRuleListResponseEventRulesEventRuleEventPatternEventPatternNameList();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeEventRuleListResponseEventRulesEventRuleEventPatternEventPatternLevelList extends TeaModel {
        @NameInMap("LevelList")
        @Validation(required = true)
        public java.util.List<String> levelList;

        public static DescribeEventRuleListResponseEventRulesEventRuleEventPatternEventPatternLevelList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleListResponseEventRulesEventRuleEventPatternEventPatternLevelList self = new DescribeEventRuleListResponseEventRulesEventRuleEventPatternEventPatternLevelList();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeEventRuleListResponseEventRulesEventRuleEventPatternEventPatternEventTypeList extends TeaModel {
        @NameInMap("EventTypeList")
        @Validation(required = true)
        public java.util.List<String> eventTypeList;

        public static DescribeEventRuleListResponseEventRulesEventRuleEventPatternEventPatternEventTypeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleListResponseEventRulesEventRuleEventPatternEventPatternEventTypeList self = new DescribeEventRuleListResponseEventRulesEventRuleEventPatternEventPatternEventTypeList();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeEventRuleListResponseEventRulesEventRuleEventPatternEventPattern extends TeaModel {
        @NameInMap("Product")
        @Validation(required = true)
        public String product;

        @NameInMap("NameList")
        @Validation(required = true)
        public DescribeEventRuleListResponseEventRulesEventRuleEventPatternEventPatternNameList nameList;

        @NameInMap("LevelList")
        @Validation(required = true)
        public DescribeEventRuleListResponseEventRulesEventRuleEventPatternEventPatternLevelList levelList;

        @NameInMap("EventTypeList")
        @Validation(required = true)
        public DescribeEventRuleListResponseEventRulesEventRuleEventPatternEventPatternEventTypeList eventTypeList;

        public static DescribeEventRuleListResponseEventRulesEventRuleEventPatternEventPattern build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleListResponseEventRulesEventRuleEventPatternEventPattern self = new DescribeEventRuleListResponseEventRulesEventRuleEventPatternEventPattern();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeEventRuleListResponseEventRulesEventRuleEventPattern extends TeaModel {
        @NameInMap("EventPattern")
        @Validation(required = true)
        public java.util.List<DescribeEventRuleListResponseEventRulesEventRuleEventPatternEventPattern> eventPattern;

        public static DescribeEventRuleListResponseEventRulesEventRuleEventPattern build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleListResponseEventRulesEventRuleEventPattern self = new DescribeEventRuleListResponseEventRulesEventRuleEventPattern();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeEventRuleListResponseEventRulesEventRule extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        @NameInMap("EventType")
        @Validation(required = true)
        public String eventType;

        @NameInMap("State")
        @Validation(required = true)
        public String state;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("EventPattern")
        @Validation(required = true)
        public DescribeEventRuleListResponseEventRulesEventRuleEventPattern eventPattern;

        public static DescribeEventRuleListResponseEventRulesEventRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleListResponseEventRulesEventRule self = new DescribeEventRuleListResponseEventRulesEventRule();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeEventRuleListResponseEventRules extends TeaModel {
        @NameInMap("EventRule")
        @Validation(required = true)
        public java.util.List<DescribeEventRuleListResponseEventRulesEventRule> eventRule;

        public static DescribeEventRuleListResponseEventRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleListResponseEventRules self = new DescribeEventRuleListResponseEventRules();
            return TeaModel.build(map, self);
        }

    }

}
