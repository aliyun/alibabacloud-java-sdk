// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class ListDISyncAlarmRulesResponseBody extends TeaModel {
    @NameInMap("AlarmRulePageResult")
    public ListDISyncAlarmRulesResponseBodyAlarmRulePageResult alarmRulePageResult;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDISyncAlarmRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDISyncAlarmRulesResponseBody self = new ListDISyncAlarmRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDISyncAlarmRulesResponseBody setAlarmRulePageResult(ListDISyncAlarmRulesResponseBodyAlarmRulePageResult alarmRulePageResult) {
        this.alarmRulePageResult = alarmRulePageResult;
        return this;
    }
    public ListDISyncAlarmRulesResponseBodyAlarmRulePageResult getAlarmRulePageResult() {
        return this.alarmRulePageResult;
    }

    public ListDISyncAlarmRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRulesCriticalMetricRule extends TeaModel {
        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Threshold")
        public Long threshold;

        public static ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRulesCriticalMetricRule build(java.util.Map<String, ?> map) throws Exception {
            ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRulesCriticalMetricRule self = new ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRulesCriticalMetricRule();
            return TeaModel.build(map, self);
        }

        public ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRulesCriticalMetricRule setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRulesCriticalMetricRule setThreshold(Long threshold) {
            this.threshold = threshold;
            return this;
        }
        public Long getThreshold() {
            return this.threshold;
        }

    }

    public static class ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRulesWarningMetricRule extends TeaModel {
        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Threshold")
        public Long threshold;

        public static ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRulesWarningMetricRule build(java.util.Map<String, ?> map) throws Exception {
            ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRulesWarningMetricRule self = new ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRulesWarningMetricRule();
            return TeaModel.build(map, self);
        }

        public ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRulesWarningMetricRule setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRulesWarningMetricRule setThreshold(Long threshold) {
            this.threshold = threshold;
            return this;
        }
        public Long getThreshold() {
            return this.threshold;
        }

    }

    public static class ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRules extends TeaModel {
        @NameInMap("AlarmInterval")
        public Integer alarmInterval;

        @NameInMap("AlarmReceivers")
        public java.util.List<String> alarmReceivers;

        @NameInMap("AlarmRobotAtAllEnabled")
        public Boolean alarmRobotAtAllEnabled;

        @NameInMap("AlarmRobotTokens")
        public java.util.List<String> alarmRobotTokens;

        @NameInMap("CriticalAlarmModes")
        public java.util.List<String> criticalAlarmModes;

        @NameInMap("CriticalMetricRule")
        public ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRulesCriticalMetricRule criticalMetricRule;

        @NameInMap("FileId")
        public Long fileId;

        @NameInMap("MetricType")
        public String metricType;

        @NameInMap("ProjectEnv")
        public String projectEnv;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("RuleDescription")
        public String ruleDescription;

        @NameInMap("RuleEnabled")
        public Boolean ruleEnabled;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("WarningAlarmModes")
        public java.util.List<String> warningAlarmModes;

        @NameInMap("WarningMetricRule")
        public ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRulesWarningMetricRule warningMetricRule;

        public static ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRules build(java.util.Map<String, ?> map) throws Exception {
            ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRules self = new ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRules();
            return TeaModel.build(map, self);
        }

        public ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRules setAlarmInterval(Integer alarmInterval) {
            this.alarmInterval = alarmInterval;
            return this;
        }
        public Integer getAlarmInterval() {
            return this.alarmInterval;
        }

        public ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRules setAlarmReceivers(java.util.List<String> alarmReceivers) {
            this.alarmReceivers = alarmReceivers;
            return this;
        }
        public java.util.List<String> getAlarmReceivers() {
            return this.alarmReceivers;
        }

        public ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRules setAlarmRobotAtAllEnabled(Boolean alarmRobotAtAllEnabled) {
            this.alarmRobotAtAllEnabled = alarmRobotAtAllEnabled;
            return this;
        }
        public Boolean getAlarmRobotAtAllEnabled() {
            return this.alarmRobotAtAllEnabled;
        }

        public ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRules setAlarmRobotTokens(java.util.List<String> alarmRobotTokens) {
            this.alarmRobotTokens = alarmRobotTokens;
            return this;
        }
        public java.util.List<String> getAlarmRobotTokens() {
            return this.alarmRobotTokens;
        }

        public ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRules setCriticalAlarmModes(java.util.List<String> criticalAlarmModes) {
            this.criticalAlarmModes = criticalAlarmModes;
            return this;
        }
        public java.util.List<String> getCriticalAlarmModes() {
            return this.criticalAlarmModes;
        }

        public ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRules setCriticalMetricRule(ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRulesCriticalMetricRule criticalMetricRule) {
            this.criticalMetricRule = criticalMetricRule;
            return this;
        }
        public ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRulesCriticalMetricRule getCriticalMetricRule() {
            return this.criticalMetricRule;
        }

        public ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRules setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRules setMetricType(String metricType) {
            this.metricType = metricType;
            return this;
        }
        public String getMetricType() {
            return this.metricType;
        }

        public ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRules setProjectEnv(String projectEnv) {
            this.projectEnv = projectEnv;
            return this;
        }
        public String getProjectEnv() {
            return this.projectEnv;
        }

        public ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRules setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRules setRuleDescription(String ruleDescription) {
            this.ruleDescription = ruleDescription;
            return this;
        }
        public String getRuleDescription() {
            return this.ruleDescription;
        }

        public ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRules setRuleEnabled(Boolean ruleEnabled) {
            this.ruleEnabled = ruleEnabled;
            return this;
        }
        public Boolean getRuleEnabled() {
            return this.ruleEnabled;
        }

        public ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRules setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRules setWarningAlarmModes(java.util.List<String> warningAlarmModes) {
            this.warningAlarmModes = warningAlarmModes;
            return this;
        }
        public java.util.List<String> getWarningAlarmModes() {
            return this.warningAlarmModes;
        }

        public ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRules setWarningMetricRule(ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRulesWarningMetricRule warningMetricRule) {
            this.warningMetricRule = warningMetricRule;
            return this;
        }
        public ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRulesWarningMetricRule getWarningMetricRule() {
            return this.warningMetricRule;
        }

    }

    public static class ListDISyncAlarmRulesResponseBodyAlarmRulePageResult extends TeaModel {
        @NameInMap("AlarmRules")
        public java.util.List<ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRules> alarmRules;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDISyncAlarmRulesResponseBodyAlarmRulePageResult build(java.util.Map<String, ?> map) throws Exception {
            ListDISyncAlarmRulesResponseBodyAlarmRulePageResult self = new ListDISyncAlarmRulesResponseBodyAlarmRulePageResult();
            return TeaModel.build(map, self);
        }

        public ListDISyncAlarmRulesResponseBodyAlarmRulePageResult setAlarmRules(java.util.List<ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRules> alarmRules) {
            this.alarmRules = alarmRules;
            return this;
        }
        public java.util.List<ListDISyncAlarmRulesResponseBodyAlarmRulePageResultAlarmRules> getAlarmRules() {
            return this.alarmRules;
        }

        public ListDISyncAlarmRulesResponseBodyAlarmRulePageResult setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDISyncAlarmRulesResponseBodyAlarmRulePageResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDISyncAlarmRulesResponseBodyAlarmRulePageResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
