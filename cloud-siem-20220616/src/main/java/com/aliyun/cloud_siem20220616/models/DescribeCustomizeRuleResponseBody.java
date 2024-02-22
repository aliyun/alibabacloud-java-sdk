// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCustomizeRuleResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The return value for the request.</p>
     */
    @NameInMap("Data")
    public DescribeCustomizeRuleResponseBodyData data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeCustomizeRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomizeRuleResponseBody self = new DescribeCustomizeRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomizeRuleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeCustomizeRuleResponseBody setData(DescribeCustomizeRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCustomizeRuleResponseBodyData getData() {
        return this.data;
    }

    public DescribeCustomizeRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCustomizeRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomizeRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCustomizeRuleResponseBodyData extends TeaModel {
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
         * <p>The ID of the Alibaba Cloud account for which the threat analysis feature is enabled.</p>
         */
        @NameInMap("Aliuid")
        public Long aliuid;

        /**
         * <p>The extended information about event generation. If **eventTransferType** is set to **allToSingle**, a value is returned for EventTransferExt. The return value indicates the length and time unit of the alert aggregation window. The HTML escape characters are reversed.</p>
         */
        @NameInMap("EventTransferExt")
        public String eventTransferExt;

        /**
         * <p>Indicates whether the alert generates an event. Valid values:</p>
         * <br>
         * <p>*   0: no</p>
         * <p>*   1: yes</p>
         */
        @NameInMap("EventTransferSwitch")
        public Integer eventTransferSwitch;

        /**
         * <p>The event generation method. Valid values:</p>
         * <br>
         * <p>*   **default**: The default method is used.</p>
         * <p>*   **singleToSingle**: The system generates an event for each alert.</p>
         * <p>*   **allToSingle**: The system generates an event for alerts within a period of time.</p>
         */
        @NameInMap("EventTransferType")
        public String eventTransferType;

        /**
         * <p>The time when the custom rule was created.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the custom rule was last updated.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the custom rule.</p>
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
         * <p>The window length of the rule. The HTML escape characters are reversed.</p>
         */
        @NameInMap("QueryCycle")
        public String queryCycle;

        /**
         * <p>The query condition of the rule. The value is in the JSON format. The HTML escape characters are reversed.</p>
         */
        @NameInMap("RuleCondition")
        public String ruleCondition;

        /**
         * <p>The description of the rule.</p>
         */
        @NameInMap("RuleDesc")
        public String ruleDesc;

        /**
         * <p>The log aggregation field. The value is in the JSON format. The HTML escape characters are reversed.</p>
         */
        @NameInMap("RuleGroup")
        public String ruleGroup;

        /**
         * <p>The name of the rule.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The threshold configuration of the rule. The value is in the JSON format. The HTML escape characters are reversed.</p>
         */
        @NameInMap("RuleThreshold")
        public String ruleThreshold;

        /**
         * <p>The rule type. Valid values:</p>
         * <br>
         * <p>*   predefine</p>
         * <p>*   customize</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <p>The rule status. Valid values:</p>
         * <br>
         * <p>*   **0**: the initial status.</p>
         * <p>*   **10**: The simulation data is tested.</p>
         * <p>*   **15**: The business data is being tested.</p>
         * <p>*   **20**: The business data test ends.</p>
         * <p>*   **100**: The rule takes effect.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The threat level. Valid values:</p>
         * <br>
         * <p>*   **serious**: high risk</p>
         * <p>*   **suspicious**: medium risk</p>
         * <p>*   **remind**: low risk</p>
         */
        @NameInMap("ThreatLevel")
        public String threatLevel;

        public static DescribeCustomizeRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomizeRuleResponseBodyData self = new DescribeCustomizeRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCustomizeRuleResponseBodyData setAlertType(String alertType) {
            this.alertType = alertType;
            return this;
        }
        public String getAlertType() {
            return this.alertType;
        }

        public DescribeCustomizeRuleResponseBodyData setAlertTypeMds(String alertTypeMds) {
            this.alertTypeMds = alertTypeMds;
            return this;
        }
        public String getAlertTypeMds() {
            return this.alertTypeMds;
        }

        public DescribeCustomizeRuleResponseBodyData setAliuid(Long aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public Long getAliuid() {
            return this.aliuid;
        }

        public DescribeCustomizeRuleResponseBodyData setEventTransferExt(String eventTransferExt) {
            this.eventTransferExt = eventTransferExt;
            return this;
        }
        public String getEventTransferExt() {
            return this.eventTransferExt;
        }

        public DescribeCustomizeRuleResponseBodyData setEventTransferSwitch(Integer eventTransferSwitch) {
            this.eventTransferSwitch = eventTransferSwitch;
            return this;
        }
        public Integer getEventTransferSwitch() {
            return this.eventTransferSwitch;
        }

        public DescribeCustomizeRuleResponseBodyData setEventTransferType(String eventTransferType) {
            this.eventTransferType = eventTransferType;
            return this;
        }
        public String getEventTransferType() {
            return this.eventTransferType;
        }

        public DescribeCustomizeRuleResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeCustomizeRuleResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeCustomizeRuleResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeCustomizeRuleResponseBodyData setLogSource(String logSource) {
            this.logSource = logSource;
            return this;
        }
        public String getLogSource() {
            return this.logSource;
        }

        public DescribeCustomizeRuleResponseBodyData setLogSourceMds(String logSourceMds) {
            this.logSourceMds = logSourceMds;
            return this;
        }
        public String getLogSourceMds() {
            return this.logSourceMds;
        }

        public DescribeCustomizeRuleResponseBodyData setLogType(String logType) {
            this.logType = logType;
            return this;
        }
        public String getLogType() {
            return this.logType;
        }

        public DescribeCustomizeRuleResponseBodyData setLogTypeMds(String logTypeMds) {
            this.logTypeMds = logTypeMds;
            return this;
        }
        public String getLogTypeMds() {
            return this.logTypeMds;
        }

        public DescribeCustomizeRuleResponseBodyData setQueryCycle(String queryCycle) {
            this.queryCycle = queryCycle;
            return this;
        }
        public String getQueryCycle() {
            return this.queryCycle;
        }

        public DescribeCustomizeRuleResponseBodyData setRuleCondition(String ruleCondition) {
            this.ruleCondition = ruleCondition;
            return this;
        }
        public String getRuleCondition() {
            return this.ruleCondition;
        }

        public DescribeCustomizeRuleResponseBodyData setRuleDesc(String ruleDesc) {
            this.ruleDesc = ruleDesc;
            return this;
        }
        public String getRuleDesc() {
            return this.ruleDesc;
        }

        public DescribeCustomizeRuleResponseBodyData setRuleGroup(String ruleGroup) {
            this.ruleGroup = ruleGroup;
            return this;
        }
        public String getRuleGroup() {
            return this.ruleGroup;
        }

        public DescribeCustomizeRuleResponseBodyData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeCustomizeRuleResponseBodyData setRuleThreshold(String ruleThreshold) {
            this.ruleThreshold = ruleThreshold;
            return this;
        }
        public String getRuleThreshold() {
            return this.ruleThreshold;
        }

        public DescribeCustomizeRuleResponseBodyData setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public DescribeCustomizeRuleResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeCustomizeRuleResponseBodyData setThreatLevel(String threatLevel) {
            this.threatLevel = threatLevel;
            return this;
        }
        public String getThreatLevel() {
            return this.threatLevel;
        }

    }

}
