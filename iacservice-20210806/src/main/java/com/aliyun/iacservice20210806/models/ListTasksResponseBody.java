// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListTasksResponseBody extends TeaModel {
    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("tasks")
    public java.util.List<ListTasksResponseBodyTasks> tasks;

    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTasksResponseBody self = new ListTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTasksResponseBody setTasks(java.util.List<ListTasksResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<ListTasksResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public ListTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTasksResponseBodyTasksGroupInfo extends TeaModel {
        @NameInMap("groupId")
        public String groupId;

        @NameInMap("groupName")
        public String groupName;

        @NameInMap("projectId")
        public String projectId;

        @NameInMap("projectName")
        public String projectName;

        public static ListTasksResponseBodyTasksGroupInfo build(java.util.Map<String, ?> map) throws Exception {
            ListTasksResponseBodyTasksGroupInfo self = new ListTasksResponseBodyTasksGroupInfo();
            return TeaModel.build(map, self);
        }

        public ListTasksResponseBodyTasksGroupInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListTasksResponseBodyTasksGroupInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListTasksResponseBodyTasksGroupInfo setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListTasksResponseBodyTasksGroupInfo setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

    public static class ListTasksResponseBodyTasks extends TeaModel {
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("currentJobId")
        public String currentJobId;

        @NameInMap("currentJobStatus")
        public String currentJobStatus;

        @NameInMap("groupInfo")
        public ListTasksResponseBodyTasksGroupInfo groupInfo;

        @NameInMap("hasDestroy")
        public Boolean hasDestroy;

        @NameInMap("moduleId")
        public String moduleId;

        @NameInMap("moduleVersion")
        public String moduleVersion;

        @NameInMap("name")
        public String name;

        @NameInMap("status")
        public String status;

        @NameInMap("taskId")
        public String taskId;

        public static ListTasksResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            ListTasksResponseBodyTasks self = new ListTasksResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public ListTasksResponseBodyTasks setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListTasksResponseBodyTasks setCurrentJobId(String currentJobId) {
            this.currentJobId = currentJobId;
            return this;
        }
        public String getCurrentJobId() {
            return this.currentJobId;
        }

        public ListTasksResponseBodyTasks setCurrentJobStatus(String currentJobStatus) {
            this.currentJobStatus = currentJobStatus;
            return this;
        }
        public String getCurrentJobStatus() {
            return this.currentJobStatus;
        }

        public ListTasksResponseBodyTasks setGroupInfo(ListTasksResponseBodyTasksGroupInfo groupInfo) {
            this.groupInfo = groupInfo;
            return this;
        }
        public ListTasksResponseBodyTasksGroupInfo getGroupInfo() {
            return this.groupInfo;
        }

        public ListTasksResponseBodyTasks setHasDestroy(Boolean hasDestroy) {
            this.hasDestroy = hasDestroy;
            return this;
        }
        public Boolean getHasDestroy() {
            return this.hasDestroy;
        }

        public ListTasksResponseBodyTasks setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public ListTasksResponseBodyTasks setModuleVersion(String moduleVersion) {
            this.moduleVersion = moduleVersion;
            return this;
        }
        public String getModuleVersion() {
            return this.moduleVersion;
        }

        public ListTasksResponseBodyTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTasksResponseBodyTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTasksResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
