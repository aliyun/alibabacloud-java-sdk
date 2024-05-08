// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetTaskGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    /**
     * <p>-</p>
     */
    @NameInMap("Data")
    public GetTaskGroupResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetTaskGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskGroupResponseBody self = new GetTaskGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTaskGroupResponseBody setData(GetTaskGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTaskGroupResponseBodyData getData() {
        return this.data;
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

    public static class GetTaskGroupResponseBodyData extends TeaModel {
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

        /**
         * <p>-</p>
         */
        @NameInMap("TaskIds")
        public java.util.List<String> taskIds;

        @NameInMap("TotalTasks")
        public Integer totalTasks;

        public static GetTaskGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTaskGroupResponseBodyData self = new GetTaskGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTaskGroupResponseBodyData setCompletedTasks(Integer completedTasks) {
            this.completedTasks = completedTasks;
            return this;
        }
        public Integer getCompletedTasks() {
            return this.completedTasks;
        }

        public GetTaskGroupResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetTaskGroupResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetTaskGroupResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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

        public GetTaskGroupResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTaskGroupResponseBodyData setTaskIds(java.util.List<String> taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public java.util.List<String> getTaskIds() {
            return this.taskIds;
        }

        public GetTaskGroupResponseBodyData setTotalTasks(Integer totalTasks) {
            this.totalTasks = totalTasks;
            return this;
        }
        public Integer getTotalTasks() {
            return this.totalTasks;
        }

    }

}
