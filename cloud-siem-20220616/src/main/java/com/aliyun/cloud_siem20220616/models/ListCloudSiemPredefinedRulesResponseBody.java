// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListCloudSiemPredefinedRulesResponseBody extends TeaModel {
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
    public ListCloudSiemPredefinedRulesResponseBodyData data;

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

    public static ListCloudSiemPredefinedRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCloudSiemPredefinedRulesResponseBody self = new ListCloudSiemPredefinedRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCloudSiemPredefinedRulesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListCloudSiemPredefinedRulesResponseBody setData(ListCloudSiemPredefinedRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCloudSiemPredefinedRulesResponseBodyData getData() {
        return this.data;
    }

    public ListCloudSiemPredefinedRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCloudSiemPredefinedRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCloudSiemPredefinedRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCloudSiemPredefinedRulesResponseBodyDataPageInfo extends TeaModel {
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

        public static ListCloudSiemPredefinedRulesResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCloudSiemPredefinedRulesResponseBodyDataPageInfo self = new ListCloudSiemPredefinedRulesResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public ListCloudSiemPredefinedRulesResponseBodyDataPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListCloudSiemPredefinedRulesResponseBodyDataPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCloudSiemPredefinedRulesResponseBodyDataPageInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListCloudSiemPredefinedRulesResponseBodyDataResponseData extends TeaModel {
        /**
         * <p>The type of the risk.</p>
         * 
         * <strong>example:</strong>
         * <p>WEBSHELL</p>
         */
        @NameInMap("AlertType")
        public String alertType;

        /**
         * <p>The alert additional field for ATT\&amp;CK.</p>
         * 
         * <strong>example:</strong>
         * <p>T1595.002 Vulnerability Scanning</p>
         */
        @NameInMap("AttCk")
        public String attCk;

        /**
         * <p>The method that is used to generate an event. Valid values:</p>
         * <ul>
         * <li>default: built-in method.</li>
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
         * <p>The time when the rule was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-06 16:37:29</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the rule was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-06 16:37:29</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the predefined rule.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The internal code of the rule description.</p>
         * 
         * <strong>example:</strong>
         * <p>${siem_rule_description_siem_cfw-attack-count-level-up_cfw-attack}</p>
         */
        @NameInMap("RuleDescMds")
        public String ruleDescMds;

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>siem_base64-command-exec_aegis-proc</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The rule name in Chinese.</p>
         * 
         * <strong>example:</strong>
         * <p>siem_base64-command-exec_aegis-proc</p>
         */
        @NameInMap("RuleNameCn")
        public String ruleNameCn;

        /**
         * <p>The rule name in English.</p>
         * 
         * <strong>example:</strong>
         * <p>siem_base64-command-exec_aegis-proc</p>
         */
        @NameInMap("RuleNameEn")
        public String ruleNameEn;

        /**
         * <p>The internal code of the rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>${siem_rule_name_siem_cfw-attack-count-level-up_cfw-attack}</p>
         */
        @NameInMap("RuleNameMds")
        public String ruleNameMds;

        /**
         * <p>The log source of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_siem_aegis_proc</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The status of the predefined rule. Valid values:</p>
         * <ul>
         * <li>0: The rule is in the initial state.</li>
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
         * <li>serious: high.</li>
         * <li>suspicious: medium.</li>
         * <li>remind: low.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>remind</p>
         */
        @NameInMap("ThreatLevel")
        public String threatLevel;

        public static ListCloudSiemPredefinedRulesResponseBodyDataResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListCloudSiemPredefinedRulesResponseBodyDataResponseData self = new ListCloudSiemPredefinedRulesResponseBodyDataResponseData();
            return TeaModel.build(map, self);
        }

        public ListCloudSiemPredefinedRulesResponseBodyDataResponseData setAlertType(String alertType) {
            this.alertType = alertType;
            return this;
        }
        public String getAlertType() {
            return this.alertType;
        }

        public ListCloudSiemPredefinedRulesResponseBodyDataResponseData setAttCk(String attCk) {
            this.attCk = attCk;
            return this;
        }
        public String getAttCk() {
            return this.attCk;
        }

        public ListCloudSiemPredefinedRulesResponseBodyDataResponseData setEventTransferType(String eventTransferType) {
            this.eventTransferType = eventTransferType;
            return this;
        }
        public String getEventTransferType() {
            return this.eventTransferType;
        }

        public ListCloudSiemPredefinedRulesResponseBodyDataResponseData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListCloudSiemPredefinedRulesResponseBodyDataResponseData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListCloudSiemPredefinedRulesResponseBodyDataResponseData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListCloudSiemPredefinedRulesResponseBodyDataResponseData setRuleDescMds(String ruleDescMds) {
            this.ruleDescMds = ruleDescMds;
            return this;
        }
        public String getRuleDescMds() {
            return this.ruleDescMds;
        }

        public ListCloudSiemPredefinedRulesResponseBodyDataResponseData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListCloudSiemPredefinedRulesResponseBodyDataResponseData setRuleNameCn(String ruleNameCn) {
            this.ruleNameCn = ruleNameCn;
            return this;
        }
        public String getRuleNameCn() {
            return this.ruleNameCn;
        }

        public ListCloudSiemPredefinedRulesResponseBodyDataResponseData setRuleNameEn(String ruleNameEn) {
            this.ruleNameEn = ruleNameEn;
            return this;
        }
        public String getRuleNameEn() {
            return this.ruleNameEn;
        }

        public ListCloudSiemPredefinedRulesResponseBodyDataResponseData setRuleNameMds(String ruleNameMds) {
            this.ruleNameMds = ruleNameMds;
            return this;
        }
        public String getRuleNameMds() {
            return this.ruleNameMds;
        }

        public ListCloudSiemPredefinedRulesResponseBodyDataResponseData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListCloudSiemPredefinedRulesResponseBodyDataResponseData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListCloudSiemPredefinedRulesResponseBodyDataResponseData setThreatLevel(String threatLevel) {
            this.threatLevel = threatLevel;
            return this;
        }
        public String getThreatLevel() {
            return this.threatLevel;
        }

    }

    public static class ListCloudSiemPredefinedRulesResponseBodyData extends TeaModel {
        /**
         * <p>The pagination information.</p>
         */
        @NameInMap("PageInfo")
        public ListCloudSiemPredefinedRulesResponseBodyDataPageInfo pageInfo;

        /**
         * <p>The detailed data.</p>
         */
        @NameInMap("ResponseData")
        public java.util.List<ListCloudSiemPredefinedRulesResponseBodyDataResponseData> responseData;

        public static ListCloudSiemPredefinedRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCloudSiemPredefinedRulesResponseBodyData self = new ListCloudSiemPredefinedRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCloudSiemPredefinedRulesResponseBodyData setPageInfo(ListCloudSiemPredefinedRulesResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public ListCloudSiemPredefinedRulesResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

        public ListCloudSiemPredefinedRulesResponseBodyData setResponseData(java.util.List<ListCloudSiemPredefinedRulesResponseBodyDataResponseData> responseData) {
            this.responseData = responseData;
            return this;
        }
        public java.util.List<ListCloudSiemPredefinedRulesResponseBodyDataResponseData> getResponseData() {
            return this.responseData;
        }

    }

}
