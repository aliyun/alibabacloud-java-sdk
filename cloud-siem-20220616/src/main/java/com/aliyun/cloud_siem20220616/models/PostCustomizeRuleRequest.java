// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class PostCustomizeRuleRequest extends TeaModel {
    /**
     * <p>The risk type.</p>
     */
    @NameInMap("AlertType")
    public String alertType;

    /**
     * <p>The internal code of the risk type.</p>
     */
    @NameInMap("AlertTypeMds")
    public String alertTypeMds;

    /**
     * <p>The extended information about event generation. If eventTransferType is set to allToSingle, the value of this parameter indicates the length and unit of the alert aggregation window.</p>
     */
    @NameInMap("EventTransferExt")
    public String eventTransferExt;

    /**
     * <p>Specifies whether to convert an alert to an event. Valid values:</p>
     * <br>
     * <p>*   0: no</p>
     * <p>*   1: yes</p>
     */
    @NameInMap("EventTransferSwitch")
    public Integer eventTransferSwitch;

    /**
     * <p>The event generation method. Valid values:</p>
     * <br>
     * <p>*   default: The default method is used.</p>
     * <p>*   singleToSingle: The system generates an event for each alert.</p>
     * <p>*   allToSingle: The system generates an event for alerts within a period of time.</p>
     */
    @NameInMap("EventTransferType")
    public String eventTransferType;

    /**
     * <p>The ID of the rule.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The log source of the rule.</p>
     */
    @NameInMap("LogSource")
    public String logSource;

    /**
     * <p>The internal code of the log source.</p>
     */
    @NameInMap("LogSourceMds")
    public String logSourceMds;

    /**
     * <p>The log type of the rule.</p>
     */
    @NameInMap("LogType")
    public String logType;

    /**
     * <p>The internal code of the log type.</p>
     */
    @NameInMap("LogTypeMds")
    public String logTypeMds;

    /**
     * <p>The window length of the rule.</p>
     */
    @NameInMap("QueryCycle")
    public String queryCycle;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <br>
     * <p>*   cn-hangzhou: Your assets reside in regions in China.</p>
     * <p>*   ap-southeast-1: Your assets reside in regions outside China.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The query condition of the rule. The value is in the JSON format.</p>
     */
    @NameInMap("RuleCondition")
    public String ruleCondition;

    /**
     * <p>The description of the rule.</p>
     */
    @NameInMap("RuleDesc")
    public String ruleDesc;

    /**
     * <p>The log aggregation field of the rule. The value is a JSON string.</p>
     */
    @NameInMap("RuleGroup")
    public String ruleGroup;

    /**
     * <p>The name of the rule.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The threshold configuration of the rule. The value is in the JSON format.</p>
     */
    @NameInMap("RuleThreshold")
    public String ruleThreshold;

    /**
     * <p>The risk level. Valid values:</p>
     * <br>
     * <p>*   serious: high</p>
     * <p>*   suspicious: medium</p>
     * <p>*   remind: low</p>
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
