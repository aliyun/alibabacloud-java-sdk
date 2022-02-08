// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class GetDISyncAlarmRuleResponseBody extends TeaModel {
    @NameInMap("AlarmRule")
    public GetDISyncAlarmRuleResponseBodyAlarmRule alarmRule;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDISyncAlarmRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDISyncAlarmRuleResponseBody self = new GetDISyncAlarmRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDISyncAlarmRuleResponseBody setAlarmRule(GetDISyncAlarmRuleResponseBodyAlarmRule alarmRule) {
        this.alarmRule = alarmRule;
        return this;
    }
    public GetDISyncAlarmRuleResponseBodyAlarmRule getAlarmRule() {
        return this.alarmRule;
    }

    public GetDISyncAlarmRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDISyncAlarmRuleResponseBodyAlarmRuleCriticalMetricRule extends TeaModel {
        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Threshold")
        public Long threshold;

        public static GetDISyncAlarmRuleResponseBodyAlarmRuleCriticalMetricRule build(java.util.Map<String, ?> map) throws Exception {
            GetDISyncAlarmRuleResponseBodyAlarmRuleCriticalMetricRule self = new GetDISyncAlarmRuleResponseBodyAlarmRuleCriticalMetricRule();
            return TeaModel.build(map, self);
        }

        public GetDISyncAlarmRuleResponseBodyAlarmRuleCriticalMetricRule setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetDISyncAlarmRuleResponseBodyAlarmRuleCriticalMetricRule setThreshold(Long threshold) {
            this.threshold = threshold;
            return this;
        }
        public Long getThreshold() {
            return this.threshold;
        }

    }

    public static class GetDISyncAlarmRuleResponseBodyAlarmRuleWarningMetricRule extends TeaModel {
        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Threshold")
        public Long threshold;

        public static GetDISyncAlarmRuleResponseBodyAlarmRuleWarningMetricRule build(java.util.Map<String, ?> map) throws Exception {
            GetDISyncAlarmRuleResponseBodyAlarmRuleWarningMetricRule self = new GetDISyncAlarmRuleResponseBodyAlarmRuleWarningMetricRule();
            return TeaModel.build(map, self);
        }

        public GetDISyncAlarmRuleResponseBodyAlarmRuleWarningMetricRule setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetDISyncAlarmRuleResponseBodyAlarmRuleWarningMetricRule setThreshold(Long threshold) {
            this.threshold = threshold;
            return this;
        }
        public Long getThreshold() {
            return this.threshold;
        }

    }

    public static class GetDISyncAlarmRuleResponseBodyAlarmRule extends TeaModel {
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
        public GetDISyncAlarmRuleResponseBodyAlarmRuleCriticalMetricRule criticalMetricRule;

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
        public GetDISyncAlarmRuleResponseBodyAlarmRuleWarningMetricRule warningMetricRule;

        public static GetDISyncAlarmRuleResponseBodyAlarmRule build(java.util.Map<String, ?> map) throws Exception {
            GetDISyncAlarmRuleResponseBodyAlarmRule self = new GetDISyncAlarmRuleResponseBodyAlarmRule();
            return TeaModel.build(map, self);
        }

        public GetDISyncAlarmRuleResponseBodyAlarmRule setAlarmInterval(Integer alarmInterval) {
            this.alarmInterval = alarmInterval;
            return this;
        }
        public Integer getAlarmInterval() {
            return this.alarmInterval;
        }

        public GetDISyncAlarmRuleResponseBodyAlarmRule setAlarmReceivers(java.util.List<String> alarmReceivers) {
            this.alarmReceivers = alarmReceivers;
            return this;
        }
        public java.util.List<String> getAlarmReceivers() {
            return this.alarmReceivers;
        }

        public GetDISyncAlarmRuleResponseBodyAlarmRule setAlarmRobotAtAllEnabled(Boolean alarmRobotAtAllEnabled) {
            this.alarmRobotAtAllEnabled = alarmRobotAtAllEnabled;
            return this;
        }
        public Boolean getAlarmRobotAtAllEnabled() {
            return this.alarmRobotAtAllEnabled;
        }

        public GetDISyncAlarmRuleResponseBodyAlarmRule setAlarmRobotTokens(java.util.List<String> alarmRobotTokens) {
            this.alarmRobotTokens = alarmRobotTokens;
            return this;
        }
        public java.util.List<String> getAlarmRobotTokens() {
            return this.alarmRobotTokens;
        }

        public GetDISyncAlarmRuleResponseBodyAlarmRule setCriticalAlarmModes(java.util.List<String> criticalAlarmModes) {
            this.criticalAlarmModes = criticalAlarmModes;
            return this;
        }
        public java.util.List<String> getCriticalAlarmModes() {
            return this.criticalAlarmModes;
        }

        public GetDISyncAlarmRuleResponseBodyAlarmRule setCriticalMetricRule(GetDISyncAlarmRuleResponseBodyAlarmRuleCriticalMetricRule criticalMetricRule) {
            this.criticalMetricRule = criticalMetricRule;
            return this;
        }
        public GetDISyncAlarmRuleResponseBodyAlarmRuleCriticalMetricRule getCriticalMetricRule() {
            return this.criticalMetricRule;
        }

        public GetDISyncAlarmRuleResponseBodyAlarmRule setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public GetDISyncAlarmRuleResponseBodyAlarmRule setMetricType(String metricType) {
            this.metricType = metricType;
            return this;
        }
        public String getMetricType() {
            return this.metricType;
        }

        public GetDISyncAlarmRuleResponseBodyAlarmRule setProjectEnv(String projectEnv) {
            this.projectEnv = projectEnv;
            return this;
        }
        public String getProjectEnv() {
            return this.projectEnv;
        }

        public GetDISyncAlarmRuleResponseBodyAlarmRule setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDISyncAlarmRuleResponseBodyAlarmRule setRuleDescription(String ruleDescription) {
            this.ruleDescription = ruleDescription;
            return this;
        }
        public String getRuleDescription() {
            return this.ruleDescription;
        }

        public GetDISyncAlarmRuleResponseBodyAlarmRule setRuleEnabled(Boolean ruleEnabled) {
            this.ruleEnabled = ruleEnabled;
            return this;
        }
        public Boolean getRuleEnabled() {
            return this.ruleEnabled;
        }

        public GetDISyncAlarmRuleResponseBodyAlarmRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public GetDISyncAlarmRuleResponseBodyAlarmRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetDISyncAlarmRuleResponseBodyAlarmRule setWarningAlarmModes(java.util.List<String> warningAlarmModes) {
            this.warningAlarmModes = warningAlarmModes;
            return this;
        }
        public java.util.List<String> getWarningAlarmModes() {
            return this.warningAlarmModes;
        }

        public GetDISyncAlarmRuleResponseBodyAlarmRule setWarningMetricRule(GetDISyncAlarmRuleResponseBodyAlarmRuleWarningMetricRule warningMetricRule) {
            this.warningMetricRule = warningMetricRule;
            return this;
        }
        public GetDISyncAlarmRuleResponseBodyAlarmRuleWarningMetricRule getWarningMetricRule() {
            return this.warningMetricRule;
        }

    }

}
