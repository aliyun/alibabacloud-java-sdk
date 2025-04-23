// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListExplorerTasksResponseBody extends TeaModel {
    @NameInMap("maxResults")
    public Integer maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("tasks")
    public java.util.List<ListExplorerTasksResponseBodyTasks> tasks;

    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListExplorerTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExplorerTasksResponseBody self = new ListExplorerTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExplorerTasksResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListExplorerTasksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListExplorerTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExplorerTasksResponseBody setTasks(java.util.List<ListExplorerTasksResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<ListExplorerTasksResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public ListExplorerTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListExplorerTasksResponseBodyTasks extends TeaModel {
        @NameInMap("autoApply")
        public Boolean autoApply;

        @NameInMap("createTime")
        public String createTime;

        @NameInMap("currentJobId")
        public String currentJobId;

        @NameInMap("currentJobStatus")
        public String currentJobStatus;

        @NameInMap("deletionProtection")
        public Boolean deletionProtection;

        @NameInMap("moduleId")
        public String moduleId;

        @NameInMap("moduleName")
        public String moduleName;

        @NameInMap("moduleVersion")
        public String moduleVersion;

        @NameInMap("name")
        public String name;

        @NameInMap("status")
        public String status;

        @NameInMap("taskId")
        public String taskId;

        public static ListExplorerTasksResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            ListExplorerTasksResponseBodyTasks self = new ListExplorerTasksResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public ListExplorerTasksResponseBodyTasks setAutoApply(Boolean autoApply) {
            this.autoApply = autoApply;
            return this;
        }
        public Boolean getAutoApply() {
            return this.autoApply;
        }

        public ListExplorerTasksResponseBodyTasks setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListExplorerTasksResponseBodyTasks setCurrentJobId(String currentJobId) {
            this.currentJobId = currentJobId;
            return this;
        }
        public String getCurrentJobId() {
            return this.currentJobId;
        }

        public ListExplorerTasksResponseBodyTasks setCurrentJobStatus(String currentJobStatus) {
            this.currentJobStatus = currentJobStatus;
            return this;
        }
        public String getCurrentJobStatus() {
            return this.currentJobStatus;
        }

        public ListExplorerTasksResponseBodyTasks setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        public ListExplorerTasksResponseBodyTasks setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public ListExplorerTasksResponseBodyTasks setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public ListExplorerTasksResponseBodyTasks setModuleVersion(String moduleVersion) {
            this.moduleVersion = moduleVersion;
            return this;
        }
        public String getModuleVersion() {
            return this.moduleVersion;
        }

        public ListExplorerTasksResponseBodyTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListExplorerTasksResponseBodyTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListExplorerTasksResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
