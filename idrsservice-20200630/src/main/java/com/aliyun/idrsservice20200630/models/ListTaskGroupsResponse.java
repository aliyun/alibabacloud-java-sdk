// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListTaskGroupsResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ListTaskGroupsResponseData data;

    public static ListTaskGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTaskGroupsResponse self = new ListTaskGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListTaskGroupsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTaskGroupsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTaskGroupsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTaskGroupsResponse setData(ListTaskGroupsResponseData data) {
        this.data = data;
        return this;
    }
    public ListTaskGroupsResponseData getData() {
        return this.data;
    }

    public static class ListTaskGroupsResponseDataItems extends TeaModel {
        @NameInMap("CompletedTasks")
        @Validation(required = true)
        public Integer completedTasks;

        @NameInMap("CreatedAt")
        @Validation(required = true)
        public String createdAt;

        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("RuleId")
        @Validation(required = true)
        public String ruleId;

        @NameInMap("RuleName")
        @Validation(required = true)
        public String ruleName;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("TotalTasks")
        @Validation(required = true)
        public Integer totalTasks;

        @NameInMap("TaskIds")
        @Validation(required = true)
        public java.util.List<String> taskIds;

        public static ListTaskGroupsResponseDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListTaskGroupsResponseDataItems self = new ListTaskGroupsResponseDataItems();
            return TeaModel.build(map, self);
        }

        public ListTaskGroupsResponseDataItems setCompletedTasks(Integer completedTasks) {
            this.completedTasks = completedTasks;
            return this;
        }
        public Integer getCompletedTasks() {
            return this.completedTasks;
        }

        public ListTaskGroupsResponseDataItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListTaskGroupsResponseDataItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListTaskGroupsResponseDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTaskGroupsResponseDataItems setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public ListTaskGroupsResponseDataItems setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListTaskGroupsResponseDataItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTaskGroupsResponseDataItems setTotalTasks(Integer totalTasks) {
            this.totalTasks = totalTasks;
            return this;
        }
        public Integer getTotalTasks() {
            return this.totalTasks;
        }

        public ListTaskGroupsResponseDataItems setTaskIds(java.util.List<String> taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public java.util.List<String> getTaskIds() {
            return this.taskIds;
        }

    }

    public static class ListTaskGroupsResponseData extends TeaModel {
        @NameInMap("TotalElements")
        @Validation(required = true)
        public Long totalElements;

        @NameInMap("TotalPages")
        @Validation(required = true)
        public Integer totalPages;

        @NameInMap("Items")
        @Validation(required = true)
        public java.util.List<ListTaskGroupsResponseDataItems> items;

        public static ListTaskGroupsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListTaskGroupsResponseData self = new ListTaskGroupsResponseData();
            return TeaModel.build(map, self);
        }

        public ListTaskGroupsResponseData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

        public ListTaskGroupsResponseData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

        public ListTaskGroupsResponseData setItems(java.util.List<ListTaskGroupsResponseDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListTaskGroupsResponseDataItems> getItems() {
            return this.items;
        }

    }

}
