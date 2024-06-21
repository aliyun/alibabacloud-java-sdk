// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ConfigSchedruleOnDemandRequest extends TeaModel {
    /**
     * <p>The ID of the on-demand instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/152120.html">DescribeOnDemandInstance</a> operation to query the IDs of all on-demand instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddosbgp-cn-z2q1qzxb****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the on-demand instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/118703.html">DescribeRegions</a> operation to query all regions supported by Anti-DDoS Origin.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-zhangjiakou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The scheduling action. Set the value to <strong>declare</strong>, which indicates that the route is advertised.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>declare</p>
     */
    @NameInMap("RuleAction")
    public String ruleAction;

    /**
     * <p>If the inbound bandwidth or packets consecutively exceed the threshold for the specified number of times, the scheduling rule is triggered and traffic is rerouted to the on-demand instance. The specified number of times is the value of this parameter.</p>
     * <blockquote>
     * <p> The threshold of inbound bandwidth is the value of <strong>RuleConditionMbps</strong>. The threshold of inbound packets is the value of <strong>RuleConditionKpps</strong>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RuleConditionCnt")
    public String ruleConditionCnt;

    /**
     * <p>The threshold of inbound packets. Unit: Kpps. Minimum value: <strong>10</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RuleConditionKpps")
    public String ruleConditionKpps;

    /**
     * <p>The threshold of inbound bandwidth. Unit: Mbit/s. Minimum value: <strong>100</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("RuleConditionMbps")
    public String ruleConditionMbps;

    /**
     * <p>The name of the scheduling rule.</p>
     * <p>The name can contain lowercase letters, digits, hyphens (-), and underscores (_). The name can be up to 32 characters in length. We recommend that you use the ID of the on-demand instance as the name. Example: <code>ddosbgp-cn-z2q1qzxb****</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddosbgp-cn-z2q1qzxb****</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>Specifies whether the scheduling rule is enabled. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: enabled</li>
     * <li><strong>off</strong>: disabled</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleSwitch")
    public String ruleSwitch;

    /**
     * <p>The start time of the period during which the scheduling rule is automatically stopped. The time must be in the 24-hour clock and in the <code>hh:mm</code> format.</p>
     * <p>If the system detects that DDoS attacks stop, the system no longer reroutes traffic to the on-demand instance from the time you specified. We recommend that you set this parameter to a value that is defined as off-peak hours.</p>
     * <blockquote>
     * <p> This parameter takes effect only when the <strong>RuleUndoMode</strong> parameter is set to <strong>auto</strong>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>03:00</p>
     */
    @NameInMap("RuleUndoBeginTime")
    public String ruleUndoBeginTime;

    /**
     * <p>The end time of the period during which the scheduling rule is automatically stopped. The time must be in the 24-hour clock and in the <code>hh:mm</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>03:05</p>
     */
    @NameInMap("RuleUndoEndTime")
    public String ruleUndoEndTime;

    /**
     * <p>The stop method of the scheduling rule. Valid values:</p>
     * <ul>
     * <li><strong>auto</strong>: The scheduling rule automatically stops.</li>
     * <li><strong>manual</strong>: The scheduling rule is manually stopped.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>manual</p>
     */
    @NameInMap("RuleUndoMode")
    public String ruleUndoMode;

    /**
     * <p>The time zone of the time when the scheduling rule automatically stops. The time zone must be in the <code>GMT-hh:mm</code> format.</p>
     * <p>For example, the value <code>GMT-08:00</code> indicates that the time zone is UTC+8.</p>
     * <blockquote>
     * <p> This parameter takes effect only when the <strong>RuleUndoMode</strong> parameter is set to <strong>auto</strong>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GMT-08:00</p>
     */
    @NameInMap("TimeZone")
    public String timeZone;

    public static ConfigSchedruleOnDemandRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigSchedruleOnDemandRequest self = new ConfigSchedruleOnDemandRequest();
        return TeaModel.build(map, self);
    }

    public ConfigSchedruleOnDemandRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ConfigSchedruleOnDemandRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ConfigSchedruleOnDemandRequest setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }
    public String getRuleAction() {
        return this.ruleAction;
    }

    public ConfigSchedruleOnDemandRequest setRuleConditionCnt(String ruleConditionCnt) {
        this.ruleConditionCnt = ruleConditionCnt;
        return this;
    }
    public String getRuleConditionCnt() {
        return this.ruleConditionCnt;
    }

    public ConfigSchedruleOnDemandRequest setRuleConditionKpps(String ruleConditionKpps) {
        this.ruleConditionKpps = ruleConditionKpps;
        return this;
    }
    public String getRuleConditionKpps() {
        return this.ruleConditionKpps;
    }

    public ConfigSchedruleOnDemandRequest setRuleConditionMbps(String ruleConditionMbps) {
        this.ruleConditionMbps = ruleConditionMbps;
        return this;
    }
    public String getRuleConditionMbps() {
        return this.ruleConditionMbps;
    }

    public ConfigSchedruleOnDemandRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ConfigSchedruleOnDemandRequest setRuleSwitch(String ruleSwitch) {
        this.ruleSwitch = ruleSwitch;
        return this;
    }
    public String getRuleSwitch() {
        return this.ruleSwitch;
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

    public ConfigSchedruleOnDemandRequest setRuleUndoMode(String ruleUndoMode) {
        this.ruleUndoMode = ruleUndoMode;
        return this;
    }
    public String getRuleUndoMode() {
        return this.ruleUndoMode;
    }

    public ConfigSchedruleOnDemandRequest setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

}
