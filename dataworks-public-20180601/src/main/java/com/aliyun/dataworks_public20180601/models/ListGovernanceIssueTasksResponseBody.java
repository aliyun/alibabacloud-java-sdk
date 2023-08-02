// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class ListGovernanceIssueTasksResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListGovernanceIssueTasksResponseBodyData data;

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

    public static ListGovernanceIssueTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGovernanceIssueTasksResponseBody self = new ListGovernanceIssueTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGovernanceIssueTasksResponseBody setData(ListGovernanceIssueTasksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGovernanceIssueTasksResponseBodyData getData() {
        return this.data;
    }

    public ListGovernanceIssueTasksResponseBody setDynamicErrorCode(String dynamicErrorCode) {
        this.dynamicErrorCode = dynamicErrorCode;
        return this;
    }
    public String getDynamicErrorCode() {
        return this.dynamicErrorCode;
    }

    public ListGovernanceIssueTasksResponseBody setDynamicErrorMessage(String dynamicErrorMessage) {
        this.dynamicErrorMessage = dynamicErrorMessage;
        return this;
    }
    public String getDynamicErrorMessage() {
        return this.dynamicErrorMessage;
    }

    public ListGovernanceIssueTasksResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListGovernanceIssueTasksResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListGovernanceIssueTasksResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListGovernanceIssueTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGovernanceIssueTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListGovernanceIssueTasksResponseBodyDataTasks extends TeaModel {
        @NameInMap("BizDate")
        public String bizDate;

        @NameInMap("NodeId")
        public Long nodeId;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("NodeType")
        public String nodeType;

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

        public static ListGovernanceIssueTasksResponseBodyDataTasks build(java.util.Map<String, ?> map) throws Exception {
            ListGovernanceIssueTasksResponseBodyDataTasks self = new ListGovernanceIssueTasksResponseBodyDataTasks();
            return TeaModel.build(map, self);
        }

        public ListGovernanceIssueTasksResponseBodyDataTasks setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public ListGovernanceIssueTasksResponseBodyDataTasks setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListGovernanceIssueTasksResponseBodyDataTasks setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListGovernanceIssueTasksResponseBodyDataTasks setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public ListGovernanceIssueTasksResponseBodyDataTasks setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListGovernanceIssueTasksResponseBodyDataTasks setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListGovernanceIssueTasksResponseBodyDataTasks setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public ListGovernanceIssueTasksResponseBodyDataTasks setRuleCategory(String ruleCategory) {
            this.ruleCategory = ruleCategory;
            return this;
        }
        public String getRuleCategory() {
            return this.ruleCategory;
        }

        public ListGovernanceIssueTasksResponseBodyDataTasks setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

    public static class ListGovernanceIssueTasksResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Tasks")
        public java.util.List<ListGovernanceIssueTasksResponseBodyDataTasks> tasks;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListGovernanceIssueTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGovernanceIssueTasksResponseBodyData self = new ListGovernanceIssueTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGovernanceIssueTasksResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListGovernanceIssueTasksResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListGovernanceIssueTasksResponseBodyData setTasks(java.util.List<ListGovernanceIssueTasksResponseBodyDataTasks> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<ListGovernanceIssueTasksResponseBodyDataTasks> getTasks() {
            return this.tasks;
        }

        public ListGovernanceIssueTasksResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
