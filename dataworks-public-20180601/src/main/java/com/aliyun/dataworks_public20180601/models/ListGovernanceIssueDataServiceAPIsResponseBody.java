// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class ListGovernanceIssueDataServiceAPIsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListGovernanceIssueDataServiceAPIsResponseBodyData data;

    @NameInMap("DynamicErrorCode")
    public String dynamicErrorCode;

    @NameInMap("DynamicErrorMessage")
    public String dynamicErrorMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListGovernanceIssueDataServiceAPIsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGovernanceIssueDataServiceAPIsResponseBody self = new ListGovernanceIssueDataServiceAPIsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGovernanceIssueDataServiceAPIsResponseBody setData(ListGovernanceIssueDataServiceAPIsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGovernanceIssueDataServiceAPIsResponseBodyData getData() {
        return this.data;
    }

    public ListGovernanceIssueDataServiceAPIsResponseBody setDynamicErrorCode(String dynamicErrorCode) {
        this.dynamicErrorCode = dynamicErrorCode;
        return this;
    }
    public String getDynamicErrorCode() {
        return this.dynamicErrorCode;
    }

    public ListGovernanceIssueDataServiceAPIsResponseBody setDynamicErrorMessage(String dynamicErrorMessage) {
        this.dynamicErrorMessage = dynamicErrorMessage;
        return this;
    }
    public String getDynamicErrorMessage() {
        return this.dynamicErrorMessage;
    }

    public ListGovernanceIssueDataServiceAPIsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListGovernanceIssueDataServiceAPIsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListGovernanceIssueDataServiceAPIsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListGovernanceIssueDataServiceAPIsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGovernanceIssueDataServiceAPIsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListGovernanceIssueDataServiceAPIsResponseBodyDataTables extends TeaModel {
        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("BizDate")
        public String bizDate;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("Properties")
        public String properties;

        @NameInMap("RuleCategory")
        public String ruleCategory;

        @NameInMap("RuleId")
        public String ruleId;

        public static ListGovernanceIssueDataServiceAPIsResponseBodyDataTables build(java.util.Map<String, ?> map) throws Exception {
            ListGovernanceIssueDataServiceAPIsResponseBodyDataTables self = new ListGovernanceIssueDataServiceAPIsResponseBodyDataTables();
            return TeaModel.build(map, self);
        }

        public ListGovernanceIssueDataServiceAPIsResponseBodyDataTables setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public ListGovernanceIssueDataServiceAPIsResponseBodyDataTables setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public ListGovernanceIssueDataServiceAPIsResponseBodyDataTables setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public ListGovernanceIssueDataServiceAPIsResponseBodyDataTables setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListGovernanceIssueDataServiceAPIsResponseBodyDataTables setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListGovernanceIssueDataServiceAPIsResponseBodyDataTables setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public ListGovernanceIssueDataServiceAPIsResponseBodyDataTables setRuleCategory(String ruleCategory) {
            this.ruleCategory = ruleCategory;
            return this;
        }
        public String getRuleCategory() {
            return this.ruleCategory;
        }

        public ListGovernanceIssueDataServiceAPIsResponseBodyDataTables setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

    public static class ListGovernanceIssueDataServiceAPIsResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Tables")
        public java.util.List<ListGovernanceIssueDataServiceAPIsResponseBodyDataTables> tables;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListGovernanceIssueDataServiceAPIsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGovernanceIssueDataServiceAPIsResponseBodyData self = new ListGovernanceIssueDataServiceAPIsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGovernanceIssueDataServiceAPIsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListGovernanceIssueDataServiceAPIsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListGovernanceIssueDataServiceAPIsResponseBodyData setTables(java.util.List<ListGovernanceIssueDataServiceAPIsResponseBodyDataTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<ListGovernanceIssueDataServiceAPIsResponseBodyDataTables> getTables() {
            return this.tables;
        }

        public ListGovernanceIssueDataServiceAPIsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
