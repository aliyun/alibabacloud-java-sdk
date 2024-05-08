// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListTaskGroupsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    /**
     * <p>-</p>
     */
    @NameInMap("Data")
    public ListTaskGroupsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListTaskGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaskGroupsResponseBody self = new ListTaskGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTaskGroupsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTaskGroupsResponseBody setData(ListTaskGroupsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTaskGroupsResponseBodyData getData() {
        return this.data;
    }

    public ListTaskGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTaskGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListTaskGroupsResponseBodyDataItems extends TeaModel {
        @NameInMap("CompletedTasks")
        public Integer completedTasks;

        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>ID</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskIds")
        public java.util.List<String> taskIds;

        @NameInMap("TotalTasks")
        public Integer totalTasks;

        public static ListTaskGroupsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListTaskGroupsResponseBodyDataItems self = new ListTaskGroupsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListTaskGroupsResponseBodyDataItems setCompletedTasks(Integer completedTasks) {
            this.completedTasks = completedTasks;
            return this;
        }
        public Integer getCompletedTasks() {
            return this.completedTasks;
        }

        public ListTaskGroupsResponseBodyDataItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListTaskGroupsResponseBodyDataItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListTaskGroupsResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTaskGroupsResponseBodyDataItems setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public ListTaskGroupsResponseBodyDataItems setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListTaskGroupsResponseBodyDataItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTaskGroupsResponseBodyDataItems setTaskIds(java.util.List<String> taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public java.util.List<String> getTaskIds() {
            return this.taskIds;
        }

        public ListTaskGroupsResponseBodyDataItems setTotalTasks(Integer totalTasks) {
            this.totalTasks = totalTasks;
            return this;
        }
        public Integer getTotalTasks() {
            return this.totalTasks;
        }

    }

    public static class ListTaskGroupsResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListTaskGroupsResponseBodyDataItems> items;

        @NameInMap("TotalElements")
        public Long totalElements;

        @NameInMap("TotalPages")
        public Integer totalPages;

        public static ListTaskGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTaskGroupsResponseBodyData self = new ListTaskGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTaskGroupsResponseBodyData setItems(java.util.List<ListTaskGroupsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListTaskGroupsResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListTaskGroupsResponseBodyData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

        public ListTaskGroupsResponseBodyData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

}
