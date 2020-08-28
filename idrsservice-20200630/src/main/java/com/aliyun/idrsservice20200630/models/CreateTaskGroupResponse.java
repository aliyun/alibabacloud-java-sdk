// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateTaskGroupResponse extends TeaModel {
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
    public CreateTaskGroupResponseData data;

    public static CreateTaskGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskGroupResponse self = new CreateTaskGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateTaskGroupResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateTaskGroupResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTaskGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTaskGroupResponse setData(CreateTaskGroupResponseData data) {
        this.data = data;
        return this;
    }
    public CreateTaskGroupResponseData getData() {
        return this.data;
    }

    public static class CreateTaskGroupResponseData extends TeaModel {
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

        public static CreateTaskGroupResponseData build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskGroupResponseData self = new CreateTaskGroupResponseData();
            return TeaModel.build(map, self);
        }

        public CreateTaskGroupResponseData setCompletedTasks(Integer completedTasks) {
            this.completedTasks = completedTasks;
            return this;
        }
        public Integer getCompletedTasks() {
            return this.completedTasks;
        }

        public CreateTaskGroupResponseData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateTaskGroupResponseData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateTaskGroupResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateTaskGroupResponseData setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public CreateTaskGroupResponseData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateTaskGroupResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateTaskGroupResponseData setTotalTasks(Integer totalTasks) {
            this.totalTasks = totalTasks;
            return this;
        }
        public Integer getTotalTasks() {
            return this.totalTasks;
        }

        public CreateTaskGroupResponseData setTaskIds(java.util.List<String> taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public java.util.List<String> getTaskIds() {
            return this.taskIds;
        }

    }

}
