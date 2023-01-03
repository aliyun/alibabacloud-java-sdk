// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeDispatchRuleResponseBody extends TeaModel {
    // The struct returned.
    @NameInMap("DispatchRule")
    public DescribeDispatchRuleResponseBodyDispatchRule dispatchRule;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDispatchRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDispatchRuleResponseBody self = new DescribeDispatchRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDispatchRuleResponseBody setDispatchRule(DescribeDispatchRuleResponseBodyDispatchRule dispatchRule) {
        this.dispatchRule = dispatchRule;
        return this;
    }
    public DescribeDispatchRuleResponseBodyDispatchRule getDispatchRule() {
        return this.dispatchRule;
    }

    public DescribeDispatchRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDispatchRuleResponseBodyDispatchRuleGroupRules extends TeaModel {
        // The ID of the group.
        @NameInMap("GroupId")
        public Long groupId;

        // The grouping interval.
        @NameInMap("GroupInterval")
        public Long groupInterval;

        // The waiting time for grouping.
        @NameInMap("GroupWaitTime")
        public Long groupWaitTime;

        // The grouping fields.
        @NameInMap("GroupingFields")
        public java.util.List<String> groupingFields;

        @NameInMap("RepeatInterval")
        public Long repeatInterval;

        public static DescribeDispatchRuleResponseBodyDispatchRuleGroupRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeDispatchRuleResponseBodyDispatchRuleGroupRules self = new DescribeDispatchRuleResponseBodyDispatchRuleGroupRules();
            return TeaModel.build(map, self);
        }

        public DescribeDispatchRuleResponseBodyDispatchRuleGroupRules setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public DescribeDispatchRuleResponseBodyDispatchRuleGroupRules setGroupInterval(Long groupInterval) {
            this.groupInterval = groupInterval;
            return this;
        }
        public Long getGroupInterval() {
            return this.groupInterval;
        }

        public DescribeDispatchRuleResponseBodyDispatchRuleGroupRules setGroupWaitTime(Long groupWaitTime) {
            this.groupWaitTime = groupWaitTime;
            return this;
        }
        public Long getGroupWaitTime() {
            return this.groupWaitTime;
        }

        public DescribeDispatchRuleResponseBodyDispatchRuleGroupRules setGroupingFields(java.util.List<String> groupingFields) {
            this.groupingFields = groupingFields;
            return this;
        }
        public java.util.List<String> getGroupingFields() {
            return this.groupingFields;
        }

        public DescribeDispatchRuleResponseBodyDispatchRuleGroupRules setRepeatInterval(Long repeatInterval) {
            this.repeatInterval = repeatInterval;
            return this;
        }
        public Long getRepeatInterval() {
            return this.repeatInterval;
        }

    }

    public static class DescribeDispatchRuleResponseBodyDispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroupsLabelMatchExpressions extends TeaModel {
        // The key of the tag of the dispatch rule. Valid values:
        // 
        // *   `_aliyun_arms_userid`: user ID
        // *   `_aliyun_arms_involvedObject_kind`: type of the associated object
        // *   `_aliyun_arms_involvedObject_id`: ID of the associated object
        // *   `_aliyun_arms_involvedObject_name`: name of the associated object
        // *   `_aliyun_arms_alert_name`: alert name
        // *   `_aliyun_arms_alert_rule_id`: alert rule ID
        // *   `_aliyun_arms_alert_type`: alert type
        // *   `_aliyun_arms_alert_level`: alert severity
        @NameInMap("Key")
        public String key;

        // The operator used in the dispatch rule. Valid values:
        // 
        // *   `eq`: equals to.
        // *   `re`: matches a regular expression.
        @NameInMap("Operator")
        public String operator;

        // The value of the tag.
        @NameInMap("Value")
        public String value;

        public static DescribeDispatchRuleResponseBodyDispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroupsLabelMatchExpressions build(java.util.Map<String, ?> map) throws Exception {
            DescribeDispatchRuleResponseBodyDispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroupsLabelMatchExpressions self = new DescribeDispatchRuleResponseBodyDispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroupsLabelMatchExpressions();
            return TeaModel.build(map, self);
        }

        public DescribeDispatchRuleResponseBodyDispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroupsLabelMatchExpressions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDispatchRuleResponseBodyDispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroupsLabelMatchExpressions setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DescribeDispatchRuleResponseBodyDispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroupsLabelMatchExpressions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDispatchRuleResponseBodyDispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroups extends TeaModel {
        // The collection of conditions of the dispatch rule.
        @NameInMap("LabelMatchExpressions")
        public java.util.List<DescribeDispatchRuleResponseBodyDispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroupsLabelMatchExpressions> labelMatchExpressions;

        public static DescribeDispatchRuleResponseBodyDispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeDispatchRuleResponseBodyDispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroups self = new DescribeDispatchRuleResponseBodyDispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroups();
            return TeaModel.build(map, self);
        }

        public DescribeDispatchRuleResponseBodyDispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroups setLabelMatchExpressions(java.util.List<DescribeDispatchRuleResponseBodyDispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroupsLabelMatchExpressions> labelMatchExpressions) {
            this.labelMatchExpressions = labelMatchExpressions;
            return this;
        }
        public java.util.List<DescribeDispatchRuleResponseBodyDispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroupsLabelMatchExpressions> getLabelMatchExpressions() {
            return this.labelMatchExpressions;
        }

    }

    public static class DescribeDispatchRuleResponseBodyDispatchRuleLabelMatchExpressionGrid extends TeaModel {
        // The collection of dispatch rules.
        @NameInMap("LabelMatchExpressionGroups")
        public java.util.List<DescribeDispatchRuleResponseBodyDispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroups> labelMatchExpressionGroups;

        public static DescribeDispatchRuleResponseBodyDispatchRuleLabelMatchExpressionGrid build(java.util.Map<String, ?> map) throws Exception {
            DescribeDispatchRuleResponseBodyDispatchRuleLabelMatchExpressionGrid self = new DescribeDispatchRuleResponseBodyDispatchRuleLabelMatchExpressionGrid();
            return TeaModel.build(map, self);
        }

        public DescribeDispatchRuleResponseBodyDispatchRuleLabelMatchExpressionGrid setLabelMatchExpressionGroups(java.util.List<DescribeDispatchRuleResponseBodyDispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroups> labelMatchExpressionGroups) {
            this.labelMatchExpressionGroups = labelMatchExpressionGroups;
            return this;
        }
        public java.util.List<DescribeDispatchRuleResponseBodyDispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroups> getLabelMatchExpressionGroups() {
            return this.labelMatchExpressionGroups;
        }

    }

    public static class DescribeDispatchRuleResponseBodyDispatchRuleNotifyRulesNotifyObjects extends TeaModel {
        // The name of the contact or contact group.
        @NameInMap("Name")
        public String name;

        // The ID of the contact or contact group.
        @NameInMap("NotifyObjectId")
        public String notifyObjectId;

        // The type of the alert contact. Valid values:
        // 
        // - `CONTACT`: contact
        // - `CONTACT_GROUP`: contact group
        @NameInMap("NotifyType")
        public String notifyType;

        public static DescribeDispatchRuleResponseBodyDispatchRuleNotifyRulesNotifyObjects build(java.util.Map<String, ?> map) throws Exception {
            DescribeDispatchRuleResponseBodyDispatchRuleNotifyRulesNotifyObjects self = new DescribeDispatchRuleResponseBodyDispatchRuleNotifyRulesNotifyObjects();
            return TeaModel.build(map, self);
        }

        public DescribeDispatchRuleResponseBodyDispatchRuleNotifyRulesNotifyObjects setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDispatchRuleResponseBodyDispatchRuleNotifyRulesNotifyObjects setNotifyObjectId(String notifyObjectId) {
            this.notifyObjectId = notifyObjectId;
            return this;
        }
        public String getNotifyObjectId() {
            return this.notifyObjectId;
        }

        public DescribeDispatchRuleResponseBodyDispatchRuleNotifyRulesNotifyObjects setNotifyType(String notifyType) {
            this.notifyType = notifyType;
            return this;
        }
        public String getNotifyType() {
            return this.notifyType;
        }

    }

    public static class DescribeDispatchRuleResponseBodyDispatchRuleNotifyRules extends TeaModel {
        // The notification method. Valid values:
        // 
        // - `dingTalk`
        // - `sms`
        // - `webhook`
        // - `email`
        // - `wechat`
        @NameInMap("NotifyChannels")
        public java.util.List<String> notifyChannels;

        // The collection of alert contacts.
        @NameInMap("NotifyObjects")
        public java.util.List<DescribeDispatchRuleResponseBodyDispatchRuleNotifyRulesNotifyObjects> notifyObjects;

        public static DescribeDispatchRuleResponseBodyDispatchRuleNotifyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeDispatchRuleResponseBodyDispatchRuleNotifyRules self = new DescribeDispatchRuleResponseBodyDispatchRuleNotifyRules();
            return TeaModel.build(map, self);
        }

        public DescribeDispatchRuleResponseBodyDispatchRuleNotifyRules setNotifyChannels(java.util.List<String> notifyChannels) {
            this.notifyChannels = notifyChannels;
            return this;
        }
        public java.util.List<String> getNotifyChannels() {
            return this.notifyChannels;
        }

        public DescribeDispatchRuleResponseBodyDispatchRuleNotifyRules setNotifyObjects(java.util.List<DescribeDispatchRuleResponseBodyDispatchRuleNotifyRulesNotifyObjects> notifyObjects) {
            this.notifyObjects = notifyObjects;
            return this;
        }
        public java.util.List<DescribeDispatchRuleResponseBodyDispatchRuleNotifyRulesNotifyObjects> getNotifyObjects() {
            return this.notifyObjects;
        }

    }

    public static class DescribeDispatchRuleResponseBodyDispatchRule extends TeaModel {
        @NameInMap("DispatchType")
        public String dispatchType;

        // The information about groups.
        @NameInMap("GroupRules")
        public java.util.List<DescribeDispatchRuleResponseBodyDispatchRuleGroupRules> groupRules;

        @NameInMap("IsRecover")
        public Boolean isRecover;

        // The information about the dispatch rule.
        @NameInMap("LabelMatchExpressionGrid")
        public DescribeDispatchRuleResponseBodyDispatchRuleLabelMatchExpressionGrid labelMatchExpressionGrid;

        // The name of the dispatch policy.
        @NameInMap("Name")
        public String name;

        // The collection of notification methods.
        @NameInMap("NotifyRules")
        public java.util.List<DescribeDispatchRuleResponseBodyDispatchRuleNotifyRules> notifyRules;

        // The ID of the dispatch rule.
        @NameInMap("RuleId")
        public Long ruleId;

        // Indicates whether the dispatch policy is enabled. Valid values: 
        // 
        // - `true`: enabled
        // - `false`: disabled
        @NameInMap("State")
        public String state;

        public static DescribeDispatchRuleResponseBodyDispatchRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDispatchRuleResponseBodyDispatchRule self = new DescribeDispatchRuleResponseBodyDispatchRule();
            return TeaModel.build(map, self);
        }

        public DescribeDispatchRuleResponseBodyDispatchRule setDispatchType(String dispatchType) {
            this.dispatchType = dispatchType;
            return this;
        }
        public String getDispatchType() {
            return this.dispatchType;
        }

        public DescribeDispatchRuleResponseBodyDispatchRule setGroupRules(java.util.List<DescribeDispatchRuleResponseBodyDispatchRuleGroupRules> groupRules) {
            this.groupRules = groupRules;
            return this;
        }
        public java.util.List<DescribeDispatchRuleResponseBodyDispatchRuleGroupRules> getGroupRules() {
            return this.groupRules;
        }

        public DescribeDispatchRuleResponseBodyDispatchRule setIsRecover(Boolean isRecover) {
            this.isRecover = isRecover;
            return this;
        }
        public Boolean getIsRecover() {
            return this.isRecover;
        }

        public DescribeDispatchRuleResponseBodyDispatchRule setLabelMatchExpressionGrid(DescribeDispatchRuleResponseBodyDispatchRuleLabelMatchExpressionGrid labelMatchExpressionGrid) {
            this.labelMatchExpressionGrid = labelMatchExpressionGrid;
            return this;
        }
        public DescribeDispatchRuleResponseBodyDispatchRuleLabelMatchExpressionGrid getLabelMatchExpressionGrid() {
            return this.labelMatchExpressionGrid;
        }

        public DescribeDispatchRuleResponseBodyDispatchRule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDispatchRuleResponseBodyDispatchRule setNotifyRules(java.util.List<DescribeDispatchRuleResponseBodyDispatchRuleNotifyRules> notifyRules) {
            this.notifyRules = notifyRules;
            return this;
        }
        public java.util.List<DescribeDispatchRuleResponseBodyDispatchRuleNotifyRules> getNotifyRules() {
            return this.notifyRules;
        }

        public DescribeDispatchRuleResponseBodyDispatchRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DescribeDispatchRuleResponseBodyDispatchRule setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
