// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class PostCustomizeRuleRequest extends TeaModel {
    @NameInMap("AlertType")
    public String alertType;

    @NameInMap("AlertTypeMds")
    public String alertTypeMds;

    @NameInMap("EventTransferExt")
    public String eventTransferExt;

    @NameInMap("EventTransferSwitch")
    public Integer eventTransferSwitch;

    @NameInMap("EventTransferType")
    public String eventTransferType;

    @NameInMap("Id")
    public Long id;

    @NameInMap("LogSource")
    public String logSource;

    @NameInMap("LogSourceMds")
    public String logSourceMds;

    @NameInMap("LogType")
    public String logType;

    @NameInMap("LogTypeMds")
    public String logTypeMds;

    @NameInMap("QueryCycle")
    public String queryCycle;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RuleCondition")
    public String ruleCondition;

    @NameInMap("RuleDesc")
    public String ruleDesc;

    @NameInMap("RuleGroup")
    public String ruleGroup;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("RuleThreshold")
    public String ruleThreshold;

    @NameInMap("ThreatLevel")
    public String threatLevel;

    public static PostCustomizeRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        PostCustomizeRuleRequest self = new PostCustomizeRuleRequest();
        return TeaModel.build(map, self);
    }

    public PostCustomizeRuleRequest setAlertType(String alertType) {
        this.alertType = alertType;
        return this;
    }
    public String getAlertType() {
        return this.alertType;
    }

    public PostCustomizeRuleRequest setAlertTypeMds(String alertTypeMds) {
        this.alertTypeMds = alertTypeMds;
        return this;
    }
    public String getAlertTypeMds() {
        return this.alertTypeMds;
    }

    public PostCustomizeRuleRequest setEventTransferExt(String eventTransferExt) {
        this.eventTransferExt = eventTransferExt;
        return this;
    }
    public String getEventTransferExt() {
        return this.eventTransferExt;
    }

    public PostCustomizeRuleRequest setEventTransferSwitch(Integer eventTransferSwitch) {
        this.eventTransferSwitch = eventTransferSwitch;
        return this;
    }
    public Integer getEventTransferSwitch() {
        return this.eventTransferSwitch;
    }

    public PostCustomizeRuleRequest setEventTransferType(String eventTransferType) {
        this.eventTransferType = eventTransferType;
        return this;
    }
    public String getEventTransferType() {
        return this.eventTransferType;
    }

    public PostCustomizeRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PostCustomizeRuleRequest setLogSource(String logSource) {
        this.logSource = logSource;
        return this;
    }
    public String getLogSource() {
        return this.logSource;
    }

    public PostCustomizeRuleRequest setLogSourceMds(String logSourceMds) {
        this.logSourceMds = logSourceMds;
        return this;
    }
    public String getLogSourceMds() {
        return this.logSourceMds;
    }

    public PostCustomizeRuleRequest setLogType(String logType) {
        this.logType = logType;
        return this;
    }
    public String getLogType() {
        return this.logType;
    }

    public PostCustomizeRuleRequest setLogTypeMds(String logTypeMds) {
        this.logTypeMds = logTypeMds;
        return this;
    }
    public String getLogTypeMds() {
        return this.logTypeMds;
    }

    public PostCustomizeRuleRequest setQueryCycle(String queryCycle) {
        this.queryCycle = queryCycle;
        return this;
    }
    public String getQueryCycle() {
        return this.queryCycle;
    }

    public PostCustomizeRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PostCustomizeRuleRequest setRuleCondition(String ruleCondition) {
        this.ruleCondition = ruleCondition;
        return this;
    }
    public String getRuleCondition() {
        return this.ruleCondition;
    }

    public PostCustomizeRuleRequest setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
        return this;
    }
    public String getRuleDesc() {
        return this.ruleDesc;
    }

    public PostCustomizeRuleRequest setRuleGroup(String ruleGroup) {
        this.ruleGroup = ruleGroup;
        return this;
    }
    public String getRuleGroup() {
        return this.ruleGroup;
    }

    public PostCustomizeRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public PostCustomizeRuleRequest setRuleThreshold(String ruleThreshold) {
        this.ruleThreshold = ruleThreshold;
        return this;
    }
    public String getRuleThreshold() {
        return this.ruleThreshold;
    }

    public PostCustomizeRuleRequest setThreatLevel(String threatLevel) {
        this.threatLevel = threatLevel;
        return this;
    }
    public String getThreatLevel() {
        return this.threatLevel;
    }

}
