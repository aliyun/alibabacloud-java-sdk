// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetTaskGroupResponse extends TeaModel {
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
    public GetTaskGroupResponseData data;

    public static GetTaskGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskGroupResponse self = new GetTaskGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskGroupResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTaskGroupResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTaskGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskGroupResponse setData(GetTaskGroupResponseData data) {
        this.data = data;
        return this;
    }
    public GetTaskGroupResponseData getData() {
        return this.data;
    }

    public static class GetTaskGroupResponseData extends TeaModel {
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

        public static GetTaskGroupResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetTaskGroupResponseData self = new GetTaskGroupResponseData();
            return TeaModel.build(map, self);
        }

        public GetTaskGroupResponseData setCompletedTasks(Integer completedTasks) {
            this.completedTasks = completedTasks;
            return this;
        }
        public Integer getCompletedTasks() {
            return this.completedTasks;
        }

        public GetTaskGroupResponseData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetTaskGroupResponseData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetTaskGroupResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTaskGroupResponseData setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public GetTaskGroupResponseData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetTaskGroupResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTaskGroupResponseData setTotalTasks(Integer totalTasks) {
            this.totalTasks = totalTasks;
            return this;
        }
        public Integer getTotalTasks() {
            return this.totalTasks;
        }

        public GetTaskGroupResponseData setTaskIds(java.util.List<String> taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public java.util.List<String> getTaskIds() {
            return this.taskIds;
        }

    }

}
