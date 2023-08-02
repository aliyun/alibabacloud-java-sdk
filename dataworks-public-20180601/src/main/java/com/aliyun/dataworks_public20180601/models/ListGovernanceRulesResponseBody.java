// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class ListGovernanceRulesResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListGovernanceRulesResponseBodyData data;

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

    public static ListGovernanceRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGovernanceRulesResponseBody self = new ListGovernanceRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGovernanceRulesResponseBody setData(ListGovernanceRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGovernanceRulesResponseBodyData getData() {
        return this.data;
    }

    public ListGovernanceRulesResponseBody setDynamicErrorCode(String dynamicErrorCode) {
        this.dynamicErrorCode = dynamicErrorCode;
        return this;
    }
    public String getDynamicErrorCode() {
        return this.dynamicErrorCode;
    }

    public ListGovernanceRulesResponseBody setDynamicErrorMessage(String dynamicErrorMessage) {
        this.dynamicErrorMessage = dynamicErrorMessage;
        return this;
    }
    public String getDynamicErrorMessage() {
        return this.dynamicErrorMessage;
    }

    public ListGovernanceRulesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListGovernanceRulesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListGovernanceRulesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListGovernanceRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGovernanceRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListGovernanceRulesResponseBodyDataRules extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Description")
        public String description;

        @NameInMap("Guide")
        public String guide;

        @NameInMap("Id")
        public String id;

        @NameInMap("IssueType")
        public String issueType;

        @NameInMap("Name")
        public String name;

        @NameInMap("Note")
        public String note;

        @NameInMap("Rule")
        public String rule;

        public static ListGovernanceRulesResponseBodyDataRules build(java.util.Map<String, ?> map) throws Exception {
            ListGovernanceRulesResponseBodyDataRules self = new ListGovernanceRulesResponseBodyDataRules();
            return TeaModel.build(map, self);
        }

        public ListGovernanceRulesResponseBodyDataRules setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListGovernanceRulesResponseBodyDataRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGovernanceRulesResponseBodyDataRules setGuide(String guide) {
            this.guide = guide;
            return this;
        }
        public String getGuide() {
            return this.guide;
        }

        public ListGovernanceRulesResponseBodyDataRules setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListGovernanceRulesResponseBodyDataRules setIssueType(String issueType) {
            this.issueType = issueType;
            return this;
        }
        public String getIssueType() {
            return this.issueType;
        }

        public ListGovernanceRulesResponseBodyDataRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGovernanceRulesResponseBodyDataRules setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public ListGovernanceRulesResponseBodyDataRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

    }

    public static class ListGovernanceRulesResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Rules")
        public java.util.List<ListGovernanceRulesResponseBodyDataRules> rules;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListGovernanceRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGovernanceRulesResponseBodyData self = new ListGovernanceRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGovernanceRulesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListGovernanceRulesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListGovernanceRulesResponseBodyData setRules(java.util.List<ListGovernanceRulesResponseBodyDataRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<ListGovernanceRulesResponseBodyDataRules> getRules() {
            return this.rules;
        }

        public ListGovernanceRulesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
