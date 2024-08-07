// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class PostCustomizeRuleRequest extends TeaModel {
    /**
     * <p>The risk type.</p>
     * 
     * <strong>example:</strong>
     * <p>WEBSHELL</p>
     */
    @NameInMap("AlertType")
    public String alertType;

    /**
     * <p>The internal code of the risk type.</p>
     * 
     * <strong>example:</strong>
     * <p>${siem_rule_type_process_abnormal_command}</p>
     */
    @NameInMap("AlertTypeMds")
    public String alertTypeMds;

    /**
     * <p>att&amp;ck.</p>
     * 
     * <strong>example:</strong>
     * <p>T1595.002 Vulnerability Scanning</p>
     */
    @NameInMap("AttCk")
    public String attCk;

    /**
     * <p>The extended information about event generation. If eventTransferType is set to allToSingle, the value of this parameter indicates the length and unit of the alert aggregation window.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;time&quot;:&quot;1&quot;,&quot;unit&quot;:&quot;MINUTE&quot;}</p>
     */
    @NameInMap("EventTransferExt")
    public String eventTransferExt;

    /**
     * <p>Specifies whether to convert an alert to an event. Valid values:</p>
     * <ul>
     * <li>0: no</li>
     * <li>1: yes</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EventTransferSwitch")
    public Integer eventTransferSwitch;

    /**
     * <p>The event generation method. Valid values:</p>
     * <ul>
     * <li>default: The default method is used.</li>
     * <li>singleToSingle: The system generates an event for each alert.</li>
     * <li>allToSingle: The system generates an event for alerts within a period of time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>allToSingle</p>
     */
    @NameInMap("EventTransferType")
    public String eventTransferType;

    /**
     * <p>The ID of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The log source of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_siem_aegis_sas_alert</p>
     */
    @NameInMap("LogSource")
    public String logSource;

    /**
     * <p>The internal code of the log source.</p>
     * 
     * <strong>example:</strong>
     * <p>${sas.cloudsiem.prod.cloud_siem_aegis_sas_alert}</p>
     */
    @NameInMap("LogSourceMds")
    public String logSourceMds;

    /**
     * <p>The log type of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>ALERT_ACTIVITY</p>
     */
    @NameInMap("LogType")
    public String logType;

    /**
     * <p>The internal code of the log type.</p>
     * 
     * <strong>example:</strong>
     * <p>${security_event_config.event_name.webshellName_clientav}</p>
     */
    @NameInMap("LogTypeMds")
    public String logTypeMds;

    /**
     * <p>The window length of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;time&quot;:&quot;1&quot;,&quot;unit&quot;:&quot;HOUR&quot;}</p>
     */
    @NameInMap("QueryCycle")
    public String queryCycle;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets reside in regions in China.</li>
     * <li>ap-southeast-1: Your assets reside in regions outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the account that you switch from the management account.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The type of the view. Valid values:</p>
     * <ul>
     * <li>0: the current Alibaba Cloud account</li>
     * <li>1: the global account</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>The query condition of the rule. The value is in the JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>[[{&quot;not&quot;:false,&quot;left&quot;:&quot;alert_name&quot;,&quot;operator&quot;:&quot;=&quot;,&quot;right&quot;:&quot;WEBSHELL&quot;}]]</p>
     */
    @NameInMap("RuleCondition")
    public String ruleCondition;

    /**
     * <p>The description of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>this rule is for waf scan</p>
     */
    @NameInMap("RuleDesc")
    public String ruleDesc;

    /**
     * <p>The log aggregation field of the rule. The value is a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;asset_id&quot;]</p>
     */
    @NameInMap("RuleGroup")
    public String ruleGroup;

    /**
     * <p>The name of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_scan</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The threshold configuration of the rule. The value is in the JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;aggregateFunction&quot;:&quot;count&quot;,&quot;aggregateFunctionName&quot;:&quot;count&quot;,&quot;field&quot;:&quot;activity_name&quot;,&quot;operator&quot;:&quot;&lt;=&quot;,&quot;value&quot;:1}</p>
     */
    @NameInMap("RuleThreshold")
    public String ruleThreshold;

    /**
     * <p>The risk level. Valid values:</p>
     * <ul>
     * <li>serious: high</li>
     * <li>suspicious: medium</li>
     * <li>remind: low</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>remind</p>
     */
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

    public PostCustomizeRuleRequest setAttCk(String attCk) {
        this.attCk = attCk;
        return this;
    }
    public String getAttCk() {
        return this.attCk;
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

    public PostCustomizeRuleRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public PostCustomizeRuleRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
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
