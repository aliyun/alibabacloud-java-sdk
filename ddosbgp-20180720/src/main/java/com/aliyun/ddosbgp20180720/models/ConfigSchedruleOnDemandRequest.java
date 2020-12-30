// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ConfigSchedruleOnDemandRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("RuleConditionMbps")
    public String ruleConditionMbps;

    @NameInMap("RuleConditionKpps")
    public String ruleConditionKpps;

    @NameInMap("RuleConditionCnt")
    public String ruleConditionCnt;

    @NameInMap("RuleAction")
    public String ruleAction;

    @NameInMap("RuleSwitch")
    public String ruleSwitch;

    @NameInMap("RuleUndoMode")
    public String ruleUndoMode;

    @NameInMap("RuleUndoBeginTime")
    public String ruleUndoBeginTime;

    @NameInMap("RuleUndoEndTime")
    public String ruleUndoEndTime;

    @NameInMap("TimeZone")
    public String timeZone;

    @NameInMap("RegionId")
    public String regionId;

    public static ConfigSchedruleOnDemandRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigSchedruleOnDemandRequest self = new ConfigSchedruleOnDemandRequest();
        return TeaModel.build(map, self);
    }

    public ConfigSchedruleOnDemandRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ConfigSchedruleOnDemandRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ConfigSchedruleOnDemandRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ConfigSchedruleOnDemandRequest setRuleConditionMbps(String ruleConditionMbps) {
        this.ruleConditionMbps = ruleConditionMbps;
        return this;
    }
    public String getRuleConditionMbps() {
        return this.ruleConditionMbps;
    }

    public ConfigSchedruleOnDemandRequest setRuleConditionKpps(String ruleConditionKpps) {
        this.ruleConditionKpps = ruleConditionKpps;
        return this;
    }
    public String getRuleConditionKpps() {
        return this.ruleConditionKpps;
    }

    public ConfigSchedruleOnDemandRequest setRuleConditionCnt(String ruleConditionCnt) {
        this.ruleConditionCnt = ruleConditionCnt;
        return this;
    }
    public String getRuleConditionCnt() {
        return this.ruleConditionCnt;
    }

    public ConfigSchedruleOnDemandRequest setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }
    public String getRuleAction() {
        return this.ruleAction;
    }

    public ConfigSchedruleOnDemandRequest setRuleSwitch(String ruleSwitch) {
        this.ruleSwitch = ruleSwitch;
        return this;
    }
    public String getRuleSwitch() {
        return this.ruleSwitch;
    }

    public ConfigSchedruleOnDemandRequest setRuleUndoMode(String ruleUndoMode) {
        this.ruleUndoMode = ruleUndoMode;
        return this;
    }
    public String getRuleUndoMode() {
        return this.ruleUndoMode;
    }

    public ConfigSchedruleOnDemandRequest setRuleUndoBeginTime(String ruleUndoBeginTime) {
        this.ruleUndoBeginTime = ruleUndoBeginTime;
        return this;
    }
    public String getRuleUndoBeginTime() {
        return this.ruleUndoBeginTime;
    }

    public ConfigSchedruleOnDemandRequest setRuleUndoEndTime(String ruleUndoEndTime) {
        this.ruleUndoEndTime = ruleUndoEndTime;
        return this;
    }
    public String getRuleUndoEndTime() {
        return this.ruleUndoEndTime;
    }

    public ConfigSchedruleOnDemandRequest setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

    public ConfigSchedruleOnDemandRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
