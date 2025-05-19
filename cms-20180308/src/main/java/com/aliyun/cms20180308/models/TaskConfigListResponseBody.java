// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class TaskConfigListResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageTotal")
    public Integer pageTotal;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TaskList")
    public TaskConfigListResponseBodyTaskList taskList;

    @NameInMap("Total")
    public Integer total;

    public static TaskConfigListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TaskConfigListResponseBody self = new TaskConfigListResponseBody();
        return TeaModel.build(map, self);
    }

    public TaskConfigListResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public TaskConfigListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public TaskConfigListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public TaskConfigListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public TaskConfigListResponseBody setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
        return this;
    }
    public Integer getPageTotal() {
        return this.pageTotal;
    }

    public TaskConfigListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TaskConfigListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TaskConfigListResponseBody setTaskList(TaskConfigListResponseBodyTaskList taskList) {
        this.taskList = taskList;
        return this;
    }
    public TaskConfigListResponseBodyTaskList getTaskList() {
        return this.taskList;
    }

    public TaskConfigListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class TaskConfigListResponseBodyTaskListNodeTaskConfigInstanceList extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static TaskConfigListResponseBodyTaskListNodeTaskConfigInstanceList build(java.util.Map<String, ?> map) throws Exception {
            TaskConfigListResponseBodyTaskListNodeTaskConfigInstanceList self = new TaskConfigListResponseBodyTaskListNodeTaskConfigInstanceList();
            return TeaModel.build(map, self);
        }

        public TaskConfigListResponseBodyTaskListNodeTaskConfigInstanceList setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

    public static class TaskConfigListResponseBodyTaskListNodeTaskConfig extends TeaModel {
        @NameInMap("AlertConfig")
        public String alertConfig;

        @NameInMap("Disabled")
        public Boolean disabled;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceList")
        public TaskConfigListResponseBodyTaskListNodeTaskConfigInstanceList instanceList;

        @NameInMap("JsonData")
        public String jsonData;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TaskScope")
        public String taskScope;

        @NameInMap("TaskType")
        public String taskType;

        public static TaskConfigListResponseBodyTaskListNodeTaskConfig build(java.util.Map<String, ?> map) throws Exception {
            TaskConfigListResponseBodyTaskListNodeTaskConfig self = new TaskConfigListResponseBodyTaskListNodeTaskConfig();
            return TeaModel.build(map, self);
        }

        public TaskConfigListResponseBodyTaskListNodeTaskConfig setAlertConfig(String alertConfig) {
            this.alertConfig = alertConfig;
            return this;
        }
        public String getAlertConfig() {
            return this.alertConfig;
        }

        public TaskConfigListResponseBodyTaskListNodeTaskConfig setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public TaskConfigListResponseBodyTaskListNodeTaskConfig setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public TaskConfigListResponseBodyTaskListNodeTaskConfig setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public TaskConfigListResponseBodyTaskListNodeTaskConfig setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public TaskConfigListResponseBodyTaskListNodeTaskConfig setInstanceList(TaskConfigListResponseBodyTaskListNodeTaskConfigInstanceList instanceList) {
            this.instanceList = instanceList;
            return this;
        }
        public TaskConfigListResponseBodyTaskListNodeTaskConfigInstanceList getInstanceList() {
            return this.instanceList;
        }

        public TaskConfigListResponseBodyTaskListNodeTaskConfig setJsonData(String jsonData) {
            this.jsonData = jsonData;
            return this;
        }
        public String getJsonData() {
            return this.jsonData;
        }

        public TaskConfigListResponseBodyTaskListNodeTaskConfig setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public TaskConfigListResponseBodyTaskListNodeTaskConfig setTaskScope(String taskScope) {
            this.taskScope = taskScope;
            return this;
        }
        public String getTaskScope() {
            return this.taskScope;
        }

        public TaskConfigListResponseBodyTaskListNodeTaskConfig setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

    public static class TaskConfigListResponseBodyTaskList extends TeaModel {
        @NameInMap("NodeTaskConfig")
        public java.util.List<TaskConfigListResponseBodyTaskListNodeTaskConfig> nodeTaskConfig;

        public static TaskConfigListResponseBodyTaskList build(java.util.Map<String, ?> map) throws Exception {
            TaskConfigListResponseBodyTaskList self = new TaskConfigListResponseBodyTaskList();
            return TeaModel.build(map, self);
        }

        public TaskConfigListResponseBodyTaskList setNodeTaskConfig(java.util.List<TaskConfigListResponseBodyTaskListNodeTaskConfig> nodeTaskConfig) {
            this.nodeTaskConfig = nodeTaskConfig;
            return this;
        }
        public java.util.List<TaskConfigListResponseBodyTaskListNodeTaskConfig> getNodeTaskConfig() {
            return this.nodeTaskConfig;
        }

    }

}
