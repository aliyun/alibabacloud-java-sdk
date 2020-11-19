// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsTasksResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Tasks")
    @Validation(required = true)
    public DescribeDrdsTasksResponseTasks tasks;

    public static DescribeDrdsTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsTasksResponse self = new DescribeDrdsTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsTasksResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsTasksResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDrdsTasksResponse setTasks(DescribeDrdsTasksResponseTasks tasks) {
        this.tasks = tasks;
        return this;
    }
    public DescribeDrdsTasksResponseTasks getTasks() {
        return this.tasks;
    }

    public static class DescribeDrdsTasksResponseTasksTask extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("State")
        @Validation(required = true)
        public String state;

        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        public static DescribeDrdsTasksResponseTasksTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsTasksResponseTasksTask self = new DescribeDrdsTasksResponseTasksTask();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsTasksResponseTasksTask setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeDrdsTasksResponseTasksTask setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeDrdsTasksResponseTasksTask setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class DescribeDrdsTasksResponseTasks extends TeaModel {
        @NameInMap("Task")
        @Validation(required = true)
        public java.util.List<DescribeDrdsTasksResponseTasksTask> task;

        public static DescribeDrdsTasksResponseTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsTasksResponseTasks self = new DescribeDrdsTasksResponseTasks();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsTasksResponseTasks setTask(java.util.List<DescribeDrdsTasksResponseTasksTask> task) {
            this.task = task;
            return this;
        }
        public java.util.List<DescribeDrdsTasksResponseTasksTask> getTask() {
            return this.task;
        }

    }

}
