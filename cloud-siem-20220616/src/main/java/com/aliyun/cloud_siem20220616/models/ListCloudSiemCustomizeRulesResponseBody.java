// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListCloudSiemCustomizeRulesResponseBody extends TeaModel {
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
    public ListCloudSiemCustomizeRulesResponseBodyData data;

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
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
        /**
         * <p>The type of the risk.</p>
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
         * <p>The ID of the Alibaba Cloud account in SIEM.</p>
         * 
         * <strong>example:</strong>
         * <p>127608589417****</p>
         */
        @NameInMap("Aliuid")
        public Long aliuid;

        /**
         * <p>The alert additional field for ATT\&amp;CK.</p>
         * 
         * <strong>example:</strong>
         * <p>T1595.002 Vulnerability Scanning</p>
         */
        @NameInMap("AttCk")
        public String attCk;

        /**
         * <p>The type of the view. Valid values:</p>
         * <p>0: view of the current Alibaba Cloud account. 1: view of all accounts for the enterprise.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DataType")
        public Integer dataType;

        /**
         * <p>The extended information about event generation. If the value of <strong>eventTransferType</strong> is <strong>allToSingle</strong>, the value of this parameter indicates the length and unit of the alert aggregation window. The HTML escape characters are reversed.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;time&quot;:&quot;1&quot;,&quot;unit&quot;:&quot;MINUTE&quot;}</p>
         */
        @NameInMap("EventTransferExt")
        public String eventTransferExt;

        /**
         * <p>Indicates whether the system generates an event for the alert. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no.</li>
         * <li><strong>1</strong>: yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EventTransferSwitch")
        public Integer eventTransferSwitch;

        /**
         * <p>The method that is used to generate an event. Valid values:</p>
         * <ul>
         * <li><strong>default</strong>: built-in method.</li>
         * <li><strong>singleToSingle</strong>: The system generates an event for each alert.</li>
         * <li><strong>allToSingle</strong>: The system generates an event for alerts within a period of time.</li>
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
         * <p>${sas.cloudsiem.prod.alert_activity}</p>
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
         * <p>The log aggregation field. The value is in the JSON format. The HTML escape characters are reversed.</p>
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
         * <p>The threshold configurations of the rule in the JSON format. The HTML escape characters are reversed.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;aggregateFunction&quot;:&quot;count&quot;,&quot;aggregateFunctionName&quot;:&quot;count&quot;,&quot;field&quot;:&quot;activity_name&quot;,&quot;operator&quot;:&quot;&lt;=&quot;,&quot;value&quot;:1}</p>
         */
        @NameInMap("RuleThreshold")
        public String ruleThreshold;

        /**
         * <p>The type of the rule. Valid values:</p>
         * <ul>
         * <li><strong>predefine</strong></li>
         * <li><strong>customize</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>customize</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <p>The status of the rule. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The rule is in the initial state.</li>
         * <li><strong>10</strong>: The simulation data is tested.</li>
         * <li><strong>15</strong>: The business data is being tested.</li>
         * <li><strong>20</strong>: The business data test is complete.</li>
         * <li><strong>100</strong>: The rule is in effect.</li>
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
         * <li><strong>serious</strong>: high-risk.</li>
         * <li><strong>suspicious</strong>: medium-risk.</li>
         * <li><strong>remind</strong>: low-risk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>remind</p>
         */
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

        public ListCloudSiemCustomizeRulesResponseBodyDataResponseData setAttCk(String attCk) {
            this.attCk = attCk;
            return this;
        }
        public String getAttCk() {
            return this.attCk;
        }

        public ListCloudSiemCustomizeRulesResponseBodyDataResponseData setDataType(Integer dataType) {
            this.dataType = dataType;
            return this;
        }
        public Integer getDataType() {
            return this.dataType;
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
        /**
         * <p>The pagination information.</p>
         */
        @NameInMap("PageInfo")
        public ListCloudSiemCustomizeRulesResponseBodyDataPageInfo pageInfo;

        /**
         * <p>The detailed data.</p>
         */
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
