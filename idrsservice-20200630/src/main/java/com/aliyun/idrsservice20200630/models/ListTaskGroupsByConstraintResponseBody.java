// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListTaskGroupsByConstraintResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public String code;

    // 数据
    @NameInMap("Data")
    public ListTaskGroupsByConstraintResponseBodyData data;

    // 错误列表
    @NameInMap("Errors")
    public java.util.List<ListTaskGroupsByConstraintResponseBodyErrors> errors;

    @NameInMap("HttpCode")
    public Integer httpCode;

    // 提示
    @NameInMap("Message")
    public String message;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // 给 pop 使用的
    @NameInMap("Success")
    public Boolean success;

    public static ListTaskGroupsByConstraintResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaskGroupsByConstraintResponseBody self = new ListTaskGroupsByConstraintResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTaskGroupsByConstraintResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTaskGroupsByConstraintResponseBody setData(ListTaskGroupsByConstraintResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTaskGroupsByConstraintResponseBodyData getData() {
        return this.data;
    }

    public ListTaskGroupsByConstraintResponseBody setErrors(java.util.List<ListTaskGroupsByConstraintResponseBodyErrors> errors) {
        this.errors = errors;
        return this;
    }
    public java.util.List<ListTaskGroupsByConstraintResponseBodyErrors> getErrors() {
        return this.errors;
    }

    public ListTaskGroupsByConstraintResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public ListTaskGroupsByConstraintResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTaskGroupsByConstraintResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTaskGroupsByConstraintResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTaskGroupsByConstraintResponseBodyDataItems extends TeaModel {
        // 已经完成任务数
        @NameInMap("CompletedTasks")
        public Integer completedTasks;

        // 创建时间
        @NameInMap("CreatedAt")
        public String createdAt;

        // 任务组id
        @NameInMap("Id")
        public String id;

        // 名称
        @NameInMap("Name")
        public String name;

        // 规则id
        @NameInMap("RuleId")
        public String ruleId;

        // 规则名称
        @NameInMap("RuleName")
        public String ruleName;

        // 状态
        @NameInMap("Status")
        public String status;

        // 任务组下的所有任务id列表
        @NameInMap("TaskIds")
        public java.util.List<String> taskIds;

        // 总任务数
        @NameInMap("TotalTasks")
        public Integer totalTasks;

        public static ListTaskGroupsByConstraintResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListTaskGroupsByConstraintResponseBodyDataItems self = new ListTaskGroupsByConstraintResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListTaskGroupsByConstraintResponseBodyDataItems setCompletedTasks(Integer completedTasks) {
            this.completedTasks = completedTasks;
            return this;
        }
        public Integer getCompletedTasks() {
            return this.completedTasks;
        }

        public ListTaskGroupsByConstraintResponseBodyDataItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListTaskGroupsByConstraintResponseBodyDataItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListTaskGroupsByConstraintResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTaskGroupsByConstraintResponseBodyDataItems setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public ListTaskGroupsByConstraintResponseBodyDataItems setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListTaskGroupsByConstraintResponseBodyDataItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTaskGroupsByConstraintResponseBodyDataItems setTaskIds(java.util.List<String> taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public java.util.List<String> getTaskIds() {
            return this.taskIds;
        }

        public ListTaskGroupsByConstraintResponseBodyDataItems setTotalTasks(Integer totalTasks) {
            this.totalTasks = totalTasks;
            return this;
        }
        public Integer getTotalTasks() {
            return this.totalTasks;
        }

    }

    public static class ListTaskGroupsByConstraintResponseBodyData extends TeaModel {
        // 当前页面数据项
        @NameInMap("Items")
        public java.util.List<ListTaskGroupsByConstraintResponseBodyDataItems> items;

        // 总数据项数
        @NameInMap("TotalElements")
        public Long totalElements;

        // 总页数
        @NameInMap("TotalPages")
        public Integer totalPages;

        public static ListTaskGroupsByConstraintResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTaskGroupsByConstraintResponseBodyData self = new ListTaskGroupsByConstraintResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTaskGroupsByConstraintResponseBodyData setItems(java.util.List<ListTaskGroupsByConstraintResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListTaskGroupsByConstraintResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListTaskGroupsByConstraintResponseBodyData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

        public ListTaskGroupsByConstraintResponseBodyData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

    public static class ListTaskGroupsByConstraintResponseBodyErrors extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("Message")
        public String message;

        public static ListTaskGroupsByConstraintResponseBodyErrors build(java.util.Map<String, ?> map) throws Exception {
            ListTaskGroupsByConstraintResponseBodyErrors self = new ListTaskGroupsByConstraintResponseBodyErrors();
            return TeaModel.build(map, self);
        }

        public ListTaskGroupsByConstraintResponseBodyErrors setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public ListTaskGroupsByConstraintResponseBodyErrors setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
