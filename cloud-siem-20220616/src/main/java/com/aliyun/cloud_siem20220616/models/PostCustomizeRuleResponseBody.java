// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class PostCustomizeRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public PostCustomizeRuleResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AlertType")
        public String alertType;

        @NameInMap("AlertTypeMds")
        public String alertTypeMds;

        @NameInMap("Aliuid")
        public Long aliuid;

        @NameInMap("EventTransferExt")
        public String eventTransferExt;

        @NameInMap("EventTransferSwitch")
        public Integer eventTransferSwitch;

        @NameInMap("EventTransferType")
        public String eventTransferType;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

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

        @NameInMap("RuleType")
        public String ruleType;

        @NameInMap("Status")
        public Integer status;

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
