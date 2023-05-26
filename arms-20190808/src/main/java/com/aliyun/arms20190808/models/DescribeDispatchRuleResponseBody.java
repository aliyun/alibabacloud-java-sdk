// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeDispatchRuleResponseBody extends TeaModel {
    /**
     * <p>The collection of dispatch rules.</p>
     */
    @NameInMap("DispatchRule")
    public DescribeDispatchRuleResponseBodyDispatchRule dispatchRule;

    /**
     * <p>The ID of the dispatch policy.</p>
     */
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
        /**
         * <p>The struct returned.</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <p>The information about the dispatch rule.</p>
         */
        @NameInMap("GroupInterval")
        public Long groupInterval;

        /**
         * <p>The information about groups.</p>
         */
        @NameInMap("GroupWaitTime")
        public Long groupWaitTime;

        /**
         * <p>Queries the information about a dispatch policy.</p>
         */
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
        @NameInMap("Key")
        public String key;

        @NameInMap("Operator")
        public String operator;

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
        @NameInMap("Name")
        public String name;

        @NameInMap("NotifyObjectId")
        public String notifyObjectId;

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
        @NameInMap("NotifyChannels")
        public java.util.List<String> notifyChannels;

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

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("GroupRules")
        public java.util.List<DescribeDispatchRuleResponseBodyDispatchRuleGroupRules> groupRules;

        @NameInMap("IsRecover")
        public Boolean isRecover;

        @NameInMap("LabelMatchExpressionGrid")
        public DescribeDispatchRuleResponseBodyDispatchRuleLabelMatchExpressionGrid labelMatchExpressionGrid;

        /**
         * <p>The grouping interval.</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("NotifyRules")
        public java.util.List<DescribeDispatchRuleResponseBodyDispatchRuleNotifyRules> notifyRules;

        /**
         * <p>The waiting time for grouping.</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The grouping fields.</p>
         */
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
