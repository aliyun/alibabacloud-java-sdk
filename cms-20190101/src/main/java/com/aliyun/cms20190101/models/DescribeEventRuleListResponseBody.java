// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeEventRuleListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("EventRules")
    public DescribeEventRuleListResponseBodyEventRules eventRules;

    public static DescribeEventRuleListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventRuleListResponseBody self = new DescribeEventRuleListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventRuleListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeEventRuleListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEventRuleListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEventRuleListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeEventRuleListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeEventRuleListResponseBody setEventRules(DescribeEventRuleListResponseBodyEventRules eventRules) {
        this.eventRules = eventRules;
        return this;
    }
    public DescribeEventRuleListResponseBodyEventRules getEventRules() {
        return this.eventRules;
    }

    public static class DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternLevelList extends TeaModel {
        @NameInMap("LevelList")
        public java.util.List<String> levelList;

        public static DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternLevelList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternLevelList self = new DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternLevelList();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternLevelList setLevelList(java.util.List<String> levelList) {
            this.levelList = levelList;
            return this;
        }
        public java.util.List<String> getLevelList() {
            return this.levelList;
        }

    }

    public static class DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternEventTypeList extends TeaModel {
        @NameInMap("EventTypeList")
        public java.util.List<String> eventTypeList;

        public static DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternEventTypeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternEventTypeList self = new DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternEventTypeList();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternEventTypeList setEventTypeList(java.util.List<String> eventTypeList) {
            this.eventTypeList = eventTypeList;
            return this;
        }
        public java.util.List<String> getEventTypeList() {
            return this.eventTypeList;
        }

    }

    public static class DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternNameList extends TeaModel {
        @NameInMap("NameList")
        public java.util.List<String> nameList;

        public static DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternNameList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternNameList self = new DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternNameList();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternNameList setNameList(java.util.List<String> nameList) {
            this.nameList = nameList;
            return this;
        }
        public java.util.List<String> getNameList() {
            return this.nameList;
        }

    }

    public static class DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPattern extends TeaModel {
        @NameInMap("Product")
        public String product;

        @NameInMap("LevelList")
        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternLevelList levelList;

        @NameInMap("EventTypeList")
        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternEventTypeList eventTypeList;

        @NameInMap("NameList")
        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternNameList nameList;

        public static DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPattern build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPattern self = new DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPattern();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPattern setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPattern setLevelList(DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternLevelList levelList) {
            this.levelList = levelList;
            return this;
        }
        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternLevelList getLevelList() {
            return this.levelList;
        }

        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPattern setEventTypeList(DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternEventTypeList eventTypeList) {
            this.eventTypeList = eventTypeList;
            return this;
        }
        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternEventTypeList getEventTypeList() {
            return this.eventTypeList;
        }

        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPattern setNameList(DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternNameList nameList) {
            this.nameList = nameList;
            return this;
        }
        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPatternNameList getNameList() {
            return this.nameList;
        }

    }

    public static class DescribeEventRuleListResponseBodyEventRulesEventRuleEventPattern extends TeaModel {
        @NameInMap("EventPattern")
        public java.util.List<DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPattern> eventPattern;

        public static DescribeEventRuleListResponseBodyEventRulesEventRuleEventPattern build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleListResponseBodyEventRulesEventRuleEventPattern self = new DescribeEventRuleListResponseBodyEventRulesEventRuleEventPattern();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPattern setEventPattern(java.util.List<DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPattern> eventPattern) {
            this.eventPattern = eventPattern;
            return this;
        }
        public java.util.List<DescribeEventRuleListResponseBodyEventRulesEventRuleEventPatternEventPattern> getEventPattern() {
            return this.eventPattern;
        }

    }

    public static class DescribeEventRuleListResponseBodyEventRulesEventRule extends TeaModel {
        @NameInMap("EventType")
        public String eventType;

        @NameInMap("Description")
        public String description;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Name")
        public String name;

        @NameInMap("State")
        public String state;

        @NameInMap("EventPattern")
        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPattern eventPattern;

        public static DescribeEventRuleListResponseBodyEventRulesEventRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleListResponseBodyEventRulesEventRule self = new DescribeEventRuleListResponseBodyEventRulesEventRule();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleListResponseBodyEventRulesEventRule setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeEventRuleListResponseBodyEventRulesEventRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEventRuleListResponseBodyEventRulesEventRule setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeEventRuleListResponseBodyEventRulesEventRule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEventRuleListResponseBodyEventRulesEventRule setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeEventRuleListResponseBodyEventRulesEventRule setEventPattern(DescribeEventRuleListResponseBodyEventRulesEventRuleEventPattern eventPattern) {
            this.eventPattern = eventPattern;
            return this;
        }
        public DescribeEventRuleListResponseBodyEventRulesEventRuleEventPattern getEventPattern() {
            return this.eventPattern;
        }

    }

    public static class DescribeEventRuleListResponseBodyEventRules extends TeaModel {
        @NameInMap("EventRule")
        public java.util.List<DescribeEventRuleListResponseBodyEventRulesEventRule> eventRule;

        public static DescribeEventRuleListResponseBodyEventRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleListResponseBodyEventRules self = new DescribeEventRuleListResponseBodyEventRules();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleListResponseBodyEventRules setEventRule(java.util.List<DescribeEventRuleListResponseBodyEventRulesEventRule> eventRule) {
            this.eventRule = eventRule;
            return this;
        }
        public java.util.List<DescribeEventRuleListResponseBodyEventRulesEventRule> getEventRule() {
            return this.eventRule;
        }

    }

}
