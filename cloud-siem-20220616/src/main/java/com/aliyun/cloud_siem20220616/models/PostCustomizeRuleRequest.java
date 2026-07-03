// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class PostCustomizeRuleRequest extends TeaModel {
    /**
     * <p>The threat type.</p>
     * 
     * <strong>example:</strong>
     * <p>WEBSHELL</p>
     */
    @NameInMap("AlertType")
    public String alertType;

    /**
     * <p>The Medusa code of the threat type.</p>
     * 
     * <strong>example:</strong>
     * <p>${siem_rule_type_process_abnormal_command}</p>
     */
    @NameInMap("AlertTypeMds")
    public String alertTypeMds;

    /**
     * <p>The ATT\&amp;CK technique.</p>
     * 
     * <strong>example:</strong>
     * <p>T1595.002 Vulnerability Scanning</p>
     */
    @NameInMap("AttCk")
    public String attCk;

    /**
     * <p>The extended information for event generation. This parameter is returned only when EventTransferType is set to allToSingle. The value indicates the length and unit of the alert aggregation window.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;time&quot;:&quot;1&quot;,&quot;unit&quot;:&quot;MINUTE&quot;}</p>
     */
    @NameInMap("EventTransferExt")
    public String eventTransferExt;

    /**
     * <p>Specifies whether to convert alerts into events. Valid values:</p>
     * <ul>
     * <li><p>0: no</p>
     * </li>
     * <li><p>1: yes</p>
     * </li>
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
     * <li><p>default: the default method</p>
     * </li>
     * <li><p>singleToSingle: An event is generated for each alert.</p>
     * </li>
     * <li><p>allToSingle: An event is generated for all alerts in a period.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>allToSingle</p>
     */
    @NameInMap("EventTransferType")
    public String eventTransferType;

    /**
     * <p>The ID of the custom rule.</p>
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
     * <p>The Medusa code of the log source.</p>
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
     * <p>The Medusa code of the log type.</p>
     * 
     * <strong>example:</strong>
     * <p>${security_event_config.event_name.webshellName_clientav}</p>
     */
    @NameInMap("LogTypeMds")
    public String logTypeMds;

    /**
     * <p>The length of the rule window.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;time&quot;:&quot;1&quot;,&quot;unit&quot;:&quot;HOUR&quot;}</p>
     */
    @NameInMap("QueryCycle")
    public String queryCycle;

    /**
     * <p>The region where the data management center of Threat Analysis is located. Select the region where your assets are located. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: assets in the Chinese mainland and China (Hong Kong)</p>
     * </li>
     * <li><p>ap-southeast-1: assets outside China</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID that is used to switch the administrator\&quot;s perspective to a member\&quot;s perspective.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The view type.</p>
     * <ul>
     * <li><p>0: the view of the current Alibaba Cloud account.</p>
     * </li>
     * <li><p>1: the view of all accounts that are managed by the administrator.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>The query condition of the rule. The value is a JSON string.</p>
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
     * <p>The fields that are used to group logs. The value is a JSON array.</p>
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
     * <p>The threshold configuration of the rule. The value is a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;aggregateFunction&quot;:&quot;count&quot;,&quot;aggregateFunctionName&quot;:&quot;count&quot;,&quot;field&quot;:&quot;activity_name&quot;,&quot;operator&quot;:&quot;&lt;=&quot;,&quot;value&quot;:1}</p>
     */
    @NameInMap("RuleThreshold")
    public String ruleThreshold;

    /**
     * <p>The threat level. Valid values:</p>
     * <ul>
     * <li><p>serious: high</p>
     * </li>
     * <li><p>suspicious: medium</p>
     * </li>
     * <li><p>remind: low</p>
     * </li>
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
