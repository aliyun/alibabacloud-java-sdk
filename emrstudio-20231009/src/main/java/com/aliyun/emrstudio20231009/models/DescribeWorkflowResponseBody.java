// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20231009.models;

import com.aliyun.tea.*;

public class DescribeWorkflowResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("taskRelations")
    public java.util.List<DescribeWorkflowResponseBodyTaskRelations> taskRelations;

    @NameInMap("tasks")
    public java.util.List<DescribeWorkflowResponseBodyTasks> tasks;

    public static DescribeWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWorkflowResponseBody self = new DescribeWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWorkflowResponseBody setTaskRelations(java.util.List<DescribeWorkflowResponseBodyTaskRelations> taskRelations) {
        this.taskRelations = taskRelations;
        return this;
    }
    public java.util.List<DescribeWorkflowResponseBodyTaskRelations> getTaskRelations() {
        return this.taskRelations;
    }

    public DescribeWorkflowResponseBody setTasks(java.util.List<DescribeWorkflowResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<DescribeWorkflowResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public static class DescribeWorkflowResponseBodyTaskRelations extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("postTaskId")
        public Long postTaskId;

        @NameInMap("postTaskVersion")
        public Integer postTaskVersion;

        @NameInMap("preTaskId")
        public Long preTaskId;

        @NameInMap("preTaskVersion")
        public Integer preTaskVersion;

        public static DescribeWorkflowResponseBodyTaskRelations build(java.util.Map<String, ?> map) throws Exception {
            DescribeWorkflowResponseBodyTaskRelations self = new DescribeWorkflowResponseBodyTaskRelations();
            return TeaModel.build(map, self);
        }

        public DescribeWorkflowResponseBodyTaskRelations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeWorkflowResponseBodyTaskRelations setPostTaskId(Long postTaskId) {
            this.postTaskId = postTaskId;
            return this;
        }
        public Long getPostTaskId() {
            return this.postTaskId;
        }

        public DescribeWorkflowResponseBodyTaskRelations setPostTaskVersion(Integer postTaskVersion) {
            this.postTaskVersion = postTaskVersion;
            return this;
        }
        public Integer getPostTaskVersion() {
            return this.postTaskVersion;
        }

        public DescribeWorkflowResponseBodyTaskRelations setPreTaskId(Long preTaskId) {
            this.preTaskId = preTaskId;
            return this;
        }
        public Long getPreTaskId() {
            return this.preTaskId;
        }

        public DescribeWorkflowResponseBodyTaskRelations setPreTaskVersion(Integer preTaskVersion) {
            this.preTaskVersion = preTaskVersion;
            return this;
        }
        public Integer getPreTaskVersion() {
            return this.preTaskVersion;
        }

    }

    public static class DescribeWorkflowResponseBodyTasks extends TeaModel {
        @NameInMap("description")
        public String description;

        @NameInMap("name")
        public String name;

        @NameInMap("taskId")
        public Long taskId;

        @NameInMap("version")
        public Integer version;

        public static DescribeWorkflowResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeWorkflowResponseBodyTasks self = new DescribeWorkflowResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public DescribeWorkflowResponseBodyTasks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeWorkflowResponseBodyTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeWorkflowResponseBodyTasks setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public DescribeWorkflowResponseBodyTasks setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

}
