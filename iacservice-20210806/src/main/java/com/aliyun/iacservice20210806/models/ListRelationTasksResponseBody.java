// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListRelationTasksResponseBody extends TeaModel {
    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("tasks")
    public java.util.List<ListRelationTasksResponseBodyTasks> tasks;

    @NameInMap("totalCount")
    public Long totalCount;

    public static ListRelationTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRelationTasksResponseBody self = new ListRelationTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRelationTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRelationTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRelationTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRelationTasksResponseBody setTasks(java.util.List<ListRelationTasksResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<ListRelationTasksResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public ListRelationTasksResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListRelationTasksResponseBodyTasks extends TeaModel {
        @NameInMap("createTime")
        public String createTime;

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

        public static ListRelationTasksResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            ListRelationTasksResponseBodyTasks self = new ListRelationTasksResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public ListRelationTasksResponseBodyTasks setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListRelationTasksResponseBodyTasks setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public ListRelationTasksResponseBodyTasks setModuleVersion(String moduleVersion) {
            this.moduleVersion = moduleVersion;
            return this;
        }
        public String getModuleVersion() {
            return this.moduleVersion;
        }

        public ListRelationTasksResponseBodyTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRelationTasksResponseBodyTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRelationTasksResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
