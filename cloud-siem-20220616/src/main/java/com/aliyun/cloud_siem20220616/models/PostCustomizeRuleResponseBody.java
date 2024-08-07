// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class PostCustomizeRuleResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Data")
    public PostCustomizeRuleResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static PostCustomizeRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PostCustomizeRuleResponseBody self = new PostCustomizeRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public PostCustomizeRuleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public PostCustomizeRuleResponseBody setData(PostCustomizeRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PostCustomizeRuleResponseBodyData getData() {
        return this.data;
    }

    public PostCustomizeRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PostCustomizeRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PostCustomizeRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PostCustomizeRuleResponseBodyData extends TeaModel {
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
         * <p>The ID of the Alibaba Cloud account that is used to purchase the threat analysis feature.</p>
         * 
         * <strong>example:</strong>
         * <p>127608589417****</p>
         */
        @NameInMap("Aliuid")
        public Long aliuid;

        /**
         * <p>告警附加字段attck</p>
         * 
         * <strong>example:</strong>
         * <p>T1595.002 Vulnerability Scanning</p>
         */
        @NameInMap("AttCk")
        public String attCk;

        /**
         * <p>自动化响应规则条件字段数据类型。</p>
         * 
         * <strong>example:</strong>
         * <p>varchar</p>
         */
        @NameInMap("DataType")
        public Integer dataType;

        /**
         * <p>The extended information about event generation. If eventTransferType is set to allToSingle, the value of this parameter indicates the length and unit of the alert aggregation window. The HTML escape characters are reversed.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;time&quot;:&quot;1&quot;,&quot;unit&quot;:&quot;MINUTE&quot;}</p>
         */
        @NameInMap("EventTransferExt")
        public String eventTransferExt;

        /**
         * <p>Indicates whether the system generates an event for the alert. Valid values:</p>
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
         * <p>The time when the custom rule was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-06 16:37:29</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the custom rule was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-06 16:37:29</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

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
         * <p>The window length of the rule. The HTML escape characters are reversed.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;time&quot;:&quot;1&quot;,&quot;unit&quot;:&quot;HOUR&quot;}</p>
         */
        @NameInMap("QueryCycle")
        public String queryCycle;

        /**
         * <p>The query condition of the rule. The value is in the JSON format. The HTML escape characters are reversed.</p>
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
         * <p>The log aggregation field of the rule. The value is a JSON string. The HTML escape characters are reversed.</p>
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
         * <p>The threshold configuration of the rule. The value is in the JSON format. The HTML escape characters are reversed.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;aggregateFunction&quot;:&quot;count&quot;,&quot;aggregateFunctionName&quot;:&quot;count&quot;,&quot;field&quot;:&quot;activity_name&quot;,&quot;operator&quot;:&quot;&lt;=&quot;,&quot;value&quot;:1}</p>
         */
        @NameInMap("RuleThreshold")
        public String ruleThreshold;

        /**
         * <p>The type of the rule. Valid values:</p>
         * <ul>
         * <li>predefine</li>
         * <li>customize</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>customize</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <p>The rule status. Valid values:</p>
         * <ul>
         * <li>0: The rule is in the initial state.</li>
         * <li>10: The simulation data is tested.</li>
         * <li>15: The business data is being tested.</li>
         * <li>20: The business data test ends.</li>
         * <li>100: The rule takes effect.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

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

        public static PostCustomizeRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PostCustomizeRuleResponseBodyData self = new PostCustomizeRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PostCustomizeRuleResponseBodyData setAlertType(String alertType) {
            this.alertType = alertType;
            return this;
        }
        public String getAlertType() {
            return this.alertType;
        }

        public PostCustomizeRuleResponseBodyData setAlertTypeMds(String alertTypeMds) {
            this.alertTypeMds = alertTypeMds;
            return this;
        }
        public String getAlertTypeMds() {
            return this.alertTypeMds;
        }

        public PostCustomizeRuleResponseBodyData setAliuid(Long aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public Long getAliuid() {
            return this.aliuid;
        }

        public PostCustomizeRuleResponseBodyData setAttCk(String attCk) {
            this.attCk = attCk;
            return this;
        }
        public String getAttCk() {
            return this.attCk;
        }

        public PostCustomizeRuleResponseBodyData setDataType(Integer dataType) {
            this.dataType = dataType;
            return this;
        }
        public Integer getDataType() {
            return this.dataType;
        }

        public PostCustomizeRuleResponseBodyData setEventTransferExt(String eventTransferExt) {
            this.eventTransferExt = eventTransferExt;
            return this;
        }
        public String getEventTransferExt() {
            return this.eventTransferExt;
        }

        public PostCustomizeRuleResponseBodyData setEventTransferSwitch(Integer eventTransferSwitch) {
            this.eventTransferSwitch = eventTransferSwitch;
            return this;
        }
        public Integer getEventTransferSwitch() {
            return this.eventTransferSwitch;
        }

        public PostCustomizeRuleResponseBodyData setEventTransferType(String eventTransferType) {
            this.eventTransferType = eventTransferType;
            return this;
        }
        public String getEventTransferType() {
            return this.eventTransferType;
        }

        public PostCustomizeRuleResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public PostCustomizeRuleResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public PostCustomizeRuleResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PostCustomizeRuleResponseBodyData setLogSource(String logSource) {
            this.logSource = logSource;
            return this;
        }
        public String getLogSource() {
            return this.logSource;
        }

        public PostCustomizeRuleResponseBodyData setLogSourceMds(String logSourceMds) {
            this.logSourceMds = logSourceMds;
            return this;
        }
        public String getLogSourceMds() {
            return this.logSourceMds;
        }

        public PostCustomizeRuleResponseBodyData setLogType(String logType) {
            this.logType = logType;
            return this;
        }
        public String getLogType() {
            return this.logType;
        }

        public PostCustomizeRuleResponseBodyData setLogTypeMds(String logTypeMds) {
            this.logTypeMds = logTypeMds;
            return this;
        }
        public String getLogTypeMds() {
            return this.logTypeMds;
        }

        public PostCustomizeRuleResponseBodyData setQueryCycle(String queryCycle) {
            this.queryCycle = queryCycle;
            return this;
        }
        public String getQueryCycle() {
            return this.queryCycle;
        }

        public PostCustomizeRuleResponseBodyData setRuleCondition(String ruleCondition) {
            this.ruleCondition = ruleCondition;
            return this;
        }
        public String getRuleCondition() {
            return this.ruleCondition;
        }

        public PostCustomizeRuleResponseBodyData setRuleDesc(String ruleDesc) {
            this.ruleDesc = ruleDesc;
            return this;
        }
        public String getRuleDesc() {
            return this.ruleDesc;
        }

        public PostCustomizeRuleResponseBodyData setRuleGroup(String ruleGroup) {
            this.ruleGroup = ruleGroup;
            return this;
        }
        public String getRuleGroup() {
            return this.ruleGroup;
        }

        public PostCustomizeRuleResponseBodyData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public PostCustomizeRuleResponseBodyData setRuleThreshold(String ruleThreshold) {
            this.ruleThreshold = ruleThreshold;
            return this;
        }
        public String getRuleThreshold() {
            return this.ruleThreshold;
        }

        public PostCustomizeRuleResponseBodyData setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public PostCustomizeRuleResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public PostCustomizeRuleResponseBodyData setThreatLevel(String threatLevel) {
            this.threatLevel = threatLevel;
            return this;
        }
        public String getThreatLevel() {
            return this.threatLevel;
        }

    }

}
