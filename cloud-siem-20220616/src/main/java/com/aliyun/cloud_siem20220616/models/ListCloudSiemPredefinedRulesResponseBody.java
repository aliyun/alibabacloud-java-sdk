// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListCloudSiemPredefinedRulesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListCloudSiemPredefinedRulesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

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
        @NameInMap("AlertType")
        public String alertType;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("RuleDescMds")
        public String ruleDescMds;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleNameMds")
        public String ruleNameMds;

        @NameInMap("Source")
        public String source;

        @NameInMap("Status")
        public Integer status;

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
        @NameInMap("PageInfo")
        public ListCloudSiemPredefinedRulesResponseBodyDataPageInfo pageInfo;

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
