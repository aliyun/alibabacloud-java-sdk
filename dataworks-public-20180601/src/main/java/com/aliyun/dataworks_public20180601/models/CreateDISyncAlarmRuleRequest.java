// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class CreateDISyncAlarmRuleRequest extends TeaModel {
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

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("WarningAlarmModes")
    public String warningAlarmModes;

    @NameInMap("WarningMetricRule")
    public String warningMetricRule;

    public static CreateDISyncAlarmRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDISyncAlarmRuleRequest self = new CreateDISyncAlarmRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateDISyncAlarmRuleRequest setAlarmInterval(Integer alarmInterval) {
        this.alarmInterval = alarmInterval;
        return this;
    }
    public Integer getAlarmInterval() {
        return this.alarmInterval;
    }

    public CreateDISyncAlarmRuleRequest setAlarmReceivers(String alarmReceivers) {
        this.alarmReceivers = alarmReceivers;
        return this;
    }
    public String getAlarmReceivers() {
        return this.alarmReceivers;
    }

    public CreateDISyncAlarmRuleRequest setAlarmRobotAtAllEnabled(Boolean alarmRobotAtAllEnabled) {
        this.alarmRobotAtAllEnabled = alarmRobotAtAllEnabled;
        return this;
    }
    public Boolean getAlarmRobotAtAllEnabled() {
        return this.alarmRobotAtAllEnabled;
    }

    public CreateDISyncAlarmRuleRequest setAlarmRobotTokens(String alarmRobotTokens) {
        this.alarmRobotTokens = alarmRobotTokens;
        return this;
    }
    public String getAlarmRobotTokens() {
        return this.alarmRobotTokens;
    }

    public CreateDISyncAlarmRuleRequest setCriticalAlarmModes(String criticalAlarmModes) {
        this.criticalAlarmModes = criticalAlarmModes;
        return this;
    }
    public String getCriticalAlarmModes() {
        return this.criticalAlarmModes;
    }

    public CreateDISyncAlarmRuleRequest setCriticalMetricRule(String criticalMetricRule) {
        this.criticalMetricRule = criticalMetricRule;
        return this;
    }
    public String getCriticalMetricRule() {
        return this.criticalMetricRule;
    }

    public CreateDISyncAlarmRuleRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public CreateDISyncAlarmRuleRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public CreateDISyncAlarmRuleRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public CreateDISyncAlarmRuleRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateDISyncAlarmRuleRequest setRuleDescription(String ruleDescription) {
        this.ruleDescription = ruleDescription;
        return this;
    }
    public String getRuleDescription() {
        return this.ruleDescription;
    }

    public CreateDISyncAlarmRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateDISyncAlarmRuleRequest setWarningAlarmModes(String warningAlarmModes) {
        this.warningAlarmModes = warningAlarmModes;
        return this;
    }
    public String getWarningAlarmModes() {
        return this.warningAlarmModes;
    }

    public CreateDISyncAlarmRuleRequest setWarningMetricRule(String warningMetricRule) {
        this.warningMetricRule = warningMetricRule;
        return this;
    }
    public String getWarningMetricRule() {
        return this.warningMetricRule;
    }

}
