// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetTaskGroupResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetTaskGroupResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static GetTaskGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskGroupResponseBody self = new GetTaskGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTaskGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskGroupResponseBody setData(GetTaskGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTaskGroupResponseBodyData getData() {
        return this.data;
    }

    public GetTaskGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GetTaskGroupResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("CompletedTasks")
        public Integer completedTasks;

        @NameInMap("TotalTasks")
        public Integer totalTasks;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Name")
        public String name;

        @NameInMap("TaskIds")
        public java.util.List<String> taskIds;

        @NameInMap("Id")
        public String id;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        public static GetTaskGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTaskGroupResponseBodyData self = new GetTaskGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTaskGroupResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTaskGroupResponseBodyData setCompletedTasks(Integer completedTasks) {
            this.completedTasks = completedTasks;
            return this;
        }
        public Integer getCompletedTasks() {
            return this.completedTasks;
        }

        public GetTaskGroupResponseBodyData setTotalTasks(Integer totalTasks) {
            this.totalTasks = totalTasks;
            return this;
        }
        public Integer getTotalTasks() {
            return this.totalTasks;
        }

        public GetTaskGroupResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetTaskGroupResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTaskGroupResponseBodyData setTaskIds(java.util.List<String> taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public java.util.List<String> getTaskIds() {
            return this.taskIds;
        }

        public GetTaskGroupResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetTaskGroupResponseBodyData setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public GetTaskGroupResponseBodyData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

}
