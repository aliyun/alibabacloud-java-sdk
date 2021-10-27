// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsTasksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Tasks")
    public DescribeDrdsTasksResponseBodyTasks tasks;

    public static DescribeDrdsTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsTasksResponseBody self = new DescribeDrdsTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDrdsTasksResponseBody setTasks(DescribeDrdsTasksResponseBodyTasks tasks) {
        this.tasks = tasks;
        return this;
    }
    public DescribeDrdsTasksResponseBodyTasks getTasks() {
        return this.tasks;
    }

    public static class DescribeDrdsTasksResponseBodyTasksTask extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Id")
        public Long id;

        @NameInMap("State")
        public String state;

        public static DescribeDrdsTasksResponseBodyTasksTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsTasksResponseBodyTasksTask self = new DescribeDrdsTasksResponseBodyTasksTask();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsTasksResponseBodyTasksTask setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeDrdsTasksResponseBodyTasksTask setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeDrdsTasksResponseBodyTasksTask setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class DescribeDrdsTasksResponseBodyTasks extends TeaModel {
        @NameInMap("Task")
        public java.util.List<DescribeDrdsTasksResponseBodyTasksTask> task;

        public static DescribeDrdsTasksResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsTasksResponseBodyTasks self = new DescribeDrdsTasksResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsTasksResponseBodyTasks setTask(java.util.List<DescribeDrdsTasksResponseBodyTasksTask> task) {
            this.task = task;
            return this;
        }
        public java.util.List<DescribeDrdsTasksResponseBodyTasksTask> getTask() {
            return this.task;
        }

    }

}
