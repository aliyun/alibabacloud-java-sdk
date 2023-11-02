// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListCloudSiemCustomizeRulesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListCloudSiemCustomizeRulesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListCloudSiemCustomizeRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCloudSiemCustomizeRulesResponseBody self = new ListCloudSiemCustomizeRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCloudSiemCustomizeRulesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListCloudSiemCustomizeRulesResponseBody setData(ListCloudSiemCustomizeRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCloudSiemCustomizeRulesResponseBodyData getData() {
        return this.data;
    }

    public ListCloudSiemCustomizeRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCloudSiemCustomizeRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCloudSiemCustomizeRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCloudSiemCustomizeRulesResponseBodyDataPageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListCloudSiemCustomizeRulesResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCloudSiemCustomizeRulesResponseBodyDataPageInfo self = new ListCloudSiemCustomizeRulesResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public ListCloudSiemCustomizeRulesResponseBodyDataPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListCloudSiemCustomizeRulesResponseBodyDataPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCloudSiemCustomizeRulesResponseBodyDataPageInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListCloudSiemCustomizeRulesResponseBodyDataResponseData extends TeaModel {
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

        public static ListCloudSiemCustomizeRulesResponseBodyDataResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListCloudSiemCustomizeRulesResponseBodyDataResponseData self = new ListCloudSiemCustomizeRulesResponseBodyDataResponseData();
            return TeaModel.build(map, self);
        }

        public ListCloudSiemCustomizeRulesResponseBodyDataResponseData setAlertType(String alertType) {
            this.alertType = alertType;
            return this;
        }
        public String getAlertType() {
            return this.alertType;
        }

        public ListCloudSiemCustomizeRulesResponseBodyDataResponseData setAlertTypeMds(String alertTypeMds) {
            this.alertTypeMds = alertTypeMds;
            return this;
        }
        public String getAlertTypeMds() {
            return this.alertTypeMds;
        }

        public ListCloudSiemCustomizeRulesResponseBodyDataResponseData setAliuid(Long aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public Long getAliuid() {
            return this.aliuid;
        }

        public ListCloudSiemCustomizeRulesResponseBodyDataResponseData setEventTransferExt(String eventTransferExt) {
            this.eventTransferExt = eventTransferExt;
            return this;
        }
        public String getEventTransferExt() {
            return this.eventTransferExt;
        }

        public ListCloudSiemCustomizeRulesResponseBodyDataResponseData setEventTransferSwitch(Integer eventTransferSwitch) {
            this.eventTransferSwitch = eventTransferSwitch;
            return this;
        }
        public Integer getEventTransferSwitch() {
            return this.eventTransferSwitch;
        }

        public ListCloudSiemCustomizeRulesResponseBodyDataResponseData setEventTransferType(String eventTransferType) {
            this.eventTransferType = eventTransferType;
            return this;
        }
        public String getEventTransferType() {
            return this.eventTransferType;
        }

        public ListCloudSiemCustomizeRulesResponseBodyDataResponseData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListCloudSiemCustomizeRulesResponseBodyDataResponseData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListCloudSiemCustomizeRulesResponseBodyDataResponseData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListCloudSiemCustomizeRulesResponseBodyDataResponseData setLogSource(String logSource) {
            this.logSource = logSource;
            return this;
        }
        public String getLogSource() {
            return this.logSource;
        }

        public ListCloudSiemCustomizeRulesResponseBodyDataResponseData setLogSourceMds(String logSourceMds) {
            this.logSourceMds = logSourceMds;
            return this;
        }
        public String getLogSourceMds() {
            return this.logSourceMds;
        }

        public ListCloudSiemCustomizeRulesResponseBodyDataResponseData setLogType(String logType) {
            this.logType = logType;
            return this;
        }
        public String getLogType() {
            return this.logType;
        }

        public ListCloudSiemCustomizeRulesResponseBodyDataResponseData setLogTypeMds(String logTypeMds) {
            this.logTypeMds = logTypeMds;
            return this;
        }
        public String getLogTypeMds() {
            return this.logTypeMds;
        }

        public ListCloudSiemCustomizeRulesResponseBodyDataResponseData setQueryCycle(String queryCycle) {
            this.queryCycle = queryCycle;
            return this;
        }
        public String getQueryCycle() {
            return this.queryCycle;
        }

        public ListCloudSiemCustomizeRulesResponseBodyDataResponseData setRuleCondition(String ruleCondition) {
            this.ruleCondition = ruleCondition;
            return this;
        }
        public String getRuleCondition() {
            return this.ruleCondition;
        }

        public ListCloudSiemCustomizeRulesResponseBodyDataResponseData setRuleDesc(String ruleDesc) {
            this.ruleDesc = ruleDesc;
            return this;
        }
        public String getRuleDesc() {
            return this.ruleDesc;
        }

        public ListCloudSiemCustomizeRulesResponseBodyDataResponseData setRuleGroup(String ruleGroup) {
            this.ruleGroup = ruleGroup;
            return this;
        }
        public String getRuleGroup() {
            return this.ruleGroup;
        }

        public ListCloudSiemCustomizeRulesResponseBodyDataResponseData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListCloudSiemCustomizeRulesResponseBodyDataResponseData setRuleThreshold(String ruleThreshold) {
            this.ruleThreshold = ruleThreshold;
            return this;
        }
        public String getRuleThreshold() {
            return this.ruleThreshold;
        }

        public ListCloudSiemCustomizeRulesResponseBodyDataResponseData setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public ListCloudSiemCustomizeRulesResponseBodyDataResponseData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListCloudSiemCustomizeRulesResponseBodyDataResponseData setThreatLevel(String threatLevel) {
            this.threatLevel = threatLevel;
            return this;
        }
        public String getThreatLevel() {
            return this.threatLevel;
        }

    }

    public static class ListCloudSiemCustomizeRulesResponseBodyData extends TeaModel {
        @NameInMap("PageInfo")
        public ListCloudSiemCustomizeRulesResponseBodyDataPageInfo pageInfo;

        @NameInMap("ResponseData")
        public java.util.List<ListCloudSiemCustomizeRulesResponseBodyDataResponseData> responseData;

        public static ListCloudSiemCustomizeRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCloudSiemCustomizeRulesResponseBodyData self = new ListCloudSiemCustomizeRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCloudSiemCustomizeRulesResponseBodyData setPageInfo(ListCloudSiemCustomizeRulesResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public ListCloudSiemCustomizeRulesResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

        public ListCloudSiemCustomizeRulesResponseBodyData setResponseData(java.util.List<ListCloudSiemCustomizeRulesResponseBodyDataResponseData> responseData) {
            this.responseData = responseData;
            return this;
        }
        public java.util.List<ListCloudSiemCustomizeRulesResponseBodyDataResponseData> getResponseData() {
            return this.responseData;
        }

    }

}
