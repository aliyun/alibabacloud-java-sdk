// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class CreateJobResponseBody extends TeaModel {
    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>job-xxxx</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>896D338C-E4F4-41EC-A154-D605E5DE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of tasks.</p>
     */
    @NameInMap("Tasks")
    public java.util.List<CreateJobResponseBodyTasks> tasks;

    public static CreateJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateJobResponseBody self = new CreateJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CreateJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateJobResponseBody setTasks(java.util.List<CreateJobResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<CreateJobResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public static class CreateJobResponseBodyTasks extends TeaModel {
        /**
         * <p>The list of executor IDs contained in the task.</p>
         */
        @NameInMap("ExecutorIds")
        public java.util.List<String> executorIds;

        /**
         * <p>The name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>task0</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        public static CreateJobResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            CreateJobResponseBodyTasks self = new CreateJobResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public CreateJobResponseBodyTasks setExecutorIds(java.util.List<String> executorIds) {
            this.executorIds = executorIds;
            return this;
        }
        public java.util.List<String> getExecutorIds() {
            return this.executorIds;
        }

        public CreateJobResponseBodyTasks setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

}
