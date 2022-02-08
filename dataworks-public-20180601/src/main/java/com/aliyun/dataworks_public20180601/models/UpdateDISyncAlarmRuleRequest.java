// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class UpdateDISyncAlarmRuleRequest extends TeaModel {
    @NameInMap("AlarmInterval")
    public Integer alarmInterval;

    @NameInMap("AlarmReceivers")
    public String alarmReceivers;

    @NameInMap("AlarmRobotAtAllEnabled")
    public Boolean alarmRobotAtAllEnabled;

    @NameInMap("AlarmRobotTokens")
    public String alarmRobotTokens;

    @NameInMap("CriticalAlarmModes")
    public String criticalAlarmModes;

    @NameInMap("CriticalMetricRule")
    public String criticalMetricRule;

    @NameInMap("MetricType")
    public String metricType;

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
    public String warningAlarmModes;

    @NameInMap("WarningMetricRule")
    public String warningMetricRule;

    public static UpdateDISyncAlarmRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDISyncAlarmRuleRequest self = new UpdateDISyncAlarmRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDISyncAlarmRuleRequest setAlarmInterval(Integer alarmInterval) {
        this.alarmInterval = alarmInterval;
        return this;
    }
    public Integer getAlarmInterval() {
        return this.alarmInterval;
    }

    public UpdateDISyncAlarmRuleRequest setAlarmReceivers(String alarmReceivers) {
        this.alarmReceivers = alarmReceivers;
        return this;
    }
    public String getAlarmReceivers() {
        return this.alarmReceivers;
    }

    public UpdateDISyncAlarmRuleRequest setAlarmRobotAtAllEnabled(Boolean alarmRobotAtAllEnabled) {
        this.alarmRobotAtAllEnabled = alarmRobotAtAllEnabled;
        return this;
    }
    public Boolean getAlarmRobotAtAllEnabled() {
        return this.alarmRobotAtAllEnabled;
    }

    public UpdateDISyncAlarmRuleRequest setAlarmRobotTokens(String alarmRobotTokens) {
        this.alarmRobotTokens = alarmRobotTokens;
        return this;
    }
    public String getAlarmRobotTokens() {
        return this.alarmRobotTokens;
    }

    public UpdateDISyncAlarmRuleRequest setCriticalAlarmModes(String criticalAlarmModes) {
        this.criticalAlarmModes = criticalAlarmModes;
        return this;
    }
    public String getCriticalAlarmModes() {
        return this.criticalAlarmModes;
    }

    public UpdateDISyncAlarmRuleRequest setCriticalMetricRule(String criticalMetricRule) {
        this.criticalMetricRule = criticalMetricRule;
        return this;
    }
    public String getCriticalMetricRule() {
        return this.criticalMetricRule;
    }

    public UpdateDISyncAlarmRuleRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public UpdateDISyncAlarmRuleRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateDISyncAlarmRuleRequest setRuleDescription(String ruleDescription) {
        this.ruleDescription = ruleDescription;
        return this;
    }
    public String getRuleDescription() {
        return this.ruleDescription;
    }

    public UpdateDISyncAlarmRuleRequest setRuleEnabled(Boolean ruleEnabled) {
        this.ruleEnabled = ruleEnabled;
        return this;
    }
    public Boolean getRuleEnabled() {
        return this.ruleEnabled;
    }

    public UpdateDISyncAlarmRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public UpdateDISyncAlarmRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateDISyncAlarmRuleRequest setWarningAlarmModes(String warningAlarmModes) {
        this.warningAlarmModes = warningAlarmModes;
        return this;
    }
    public String getWarningAlarmModes() {
        return this.warningAlarmModes;
    }

    public UpdateDISyncAlarmRuleRequest setWarningMetricRule(String warningMetricRule) {
        this.warningMetricRule = warningMetricRule;
        return this;
    }
    public String getWarningMetricRule() {
        return this.warningMetricRule;
    }

}
