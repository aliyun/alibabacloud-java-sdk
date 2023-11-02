// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListAutomateResponseConfigsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListAutomateResponseConfigsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListAutomateResponseConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAutomateResponseConfigsResponseBody self = new ListAutomateResponseConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAutomateResponseConfigsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListAutomateResponseConfigsResponseBody setData(ListAutomateResponseConfigsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAutomateResponseConfigsResponseBodyData getData() {
        return this.data;
    }

    public ListAutomateResponseConfigsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAutomateResponseConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAutomateResponseConfigsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAutomateResponseConfigsResponseBodyDataPageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListAutomateResponseConfigsResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAutomateResponseConfigsResponseBodyDataPageInfo self = new ListAutomateResponseConfigsResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public ListAutomateResponseConfigsResponseBodyDataPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListAutomateResponseConfigsResponseBodyDataPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAutomateResponseConfigsResponseBodyDataPageInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListAutomateResponseConfigsResponseBodyDataResponseData extends TeaModel {
        @NameInMap("ActionConfig")
        public String actionConfig;

        @NameInMap("ActionType")
        public String actionType;

        @NameInMap("Aliuid")
        public Long aliuid;

        @NameInMap("AutoResponseType")
        public String autoResponseType;

        @NameInMap("ExecutionCondition")
        public String executionCondition;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("SubUserId")
        public Long subUserId;

        public static ListAutomateResponseConfigsResponseBodyDataResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListAutomateResponseConfigsResponseBodyDataResponseData self = new ListAutomateResponseConfigsResponseBodyDataResponseData();
            return TeaModel.build(map, self);
        }

        public ListAutomateResponseConfigsResponseBodyDataResponseData setActionConfig(String actionConfig) {
            this.actionConfig = actionConfig;
            return this;
        }
        public String getActionConfig() {
            return this.actionConfig;
        }

        public ListAutomateResponseConfigsResponseBodyDataResponseData setActionType(String actionType) {
            this.actionType = actionType;
            return this;
        }
        public String getActionType() {
            return this.actionType;
        }

        public ListAutomateResponseConfigsResponseBodyDataResponseData setAliuid(Long aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public Long getAliuid() {
            return this.aliuid;
        }

        public ListAutomateResponseConfigsResponseBodyDataResponseData setAutoResponseType(String autoResponseType) {
            this.autoResponseType = autoResponseType;
            return this;
        }
        public String getAutoResponseType() {
            return this.autoResponseType;
        }

        public ListAutomateResponseConfigsResponseBodyDataResponseData setExecutionCondition(String executionCondition) {
            this.executionCondition = executionCondition;
            return this;
        }
        public String getExecutionCondition() {
            return this.executionCondition;
        }

        public ListAutomateResponseConfigsResponseBodyDataResponseData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAutomateResponseConfigsResponseBodyDataResponseData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListAutomateResponseConfigsResponseBodyDataResponseData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAutomateResponseConfigsResponseBodyDataResponseData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListAutomateResponseConfigsResponseBodyDataResponseData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListAutomateResponseConfigsResponseBodyDataResponseData setSubUserId(Long subUserId) {
            this.subUserId = subUserId;
            return this;
        }
        public Long getSubUserId() {
            return this.subUserId;
        }

    }

    public static class ListAutomateResponseConfigsResponseBodyData extends TeaModel {
        @NameInMap("PageInfo")
        public ListAutomateResponseConfigsResponseBodyDataPageInfo pageInfo;

        @NameInMap("ResponseData")
        public java.util.List<ListAutomateResponseConfigsResponseBodyDataResponseData> responseData;

        public static ListAutomateResponseConfigsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAutomateResponseConfigsResponseBodyData self = new ListAutomateResponseConfigsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAutomateResponseConfigsResponseBodyData setPageInfo(ListAutomateResponseConfigsResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public ListAutomateResponseConfigsResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

        public ListAutomateResponseConfigsResponseBodyData setResponseData(java.util.List<ListAutomateResponseConfigsResponseBodyDataResponseData> responseData) {
            this.responseData = responseData;
            return this;
        }
        public java.util.List<ListAutomateResponseConfigsResponseBodyDataResponseData> getResponseData() {
            return this.responseData;
        }

    }

}
