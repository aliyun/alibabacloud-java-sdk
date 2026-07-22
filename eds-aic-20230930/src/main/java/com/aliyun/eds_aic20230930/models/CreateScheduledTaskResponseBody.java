// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateScheduledTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>Success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>9A51B1DF-96FF-3BCC-B08C-783161D3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tasks")
    public java.util.List<CreateScheduledTaskResponseBodyTasks> tasks;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static CreateScheduledTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduledTaskResponseBody self = new CreateScheduledTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateScheduledTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateScheduledTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateScheduledTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateScheduledTaskResponseBody setTasks(java.util.List<CreateScheduledTaskResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<CreateScheduledTaskResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public CreateScheduledTaskResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class CreateScheduledTaskResponseBodyTasksInstanceResults extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>privateAccount not exist.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>acp-iuyb1zv1ap6nb****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static CreateScheduledTaskResponseBodyTasksInstanceResults build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduledTaskResponseBodyTasksInstanceResults self = new CreateScheduledTaskResponseBodyTasksInstanceResults();
            return TeaModel.build(map, self);
        }

        public CreateScheduledTaskResponseBodyTasksInstanceResults setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public CreateScheduledTaskResponseBodyTasksInstanceResults setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateScheduledTaskResponseBodyTasksInstanceResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class CreateScheduledTaskResponseBodyTasks extends TeaModel {
        @NameInMap("InstanceResults")
        public java.util.List<CreateScheduledTaskResponseBodyTasksInstanceResults> instanceResults;

        /**
         * <strong>example:</strong>
         * <p>sch-260705-agb*****</p>
         */
        @NameInMap("ScheduledId")
        public String scheduledId;

        /**
         * <strong>example:</strong>
         * <p>tsk-260705-0jj*****</p>
         */
        @NameInMap("TaskConfigId")
        public String taskConfigId;

        public static CreateScheduledTaskResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduledTaskResponseBodyTasks self = new CreateScheduledTaskResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public CreateScheduledTaskResponseBodyTasks setInstanceResults(java.util.List<CreateScheduledTaskResponseBodyTasksInstanceResults> instanceResults) {
            this.instanceResults = instanceResults;
            return this;
        }
        public java.util.List<CreateScheduledTaskResponseBodyTasksInstanceResults> getInstanceResults() {
            return this.instanceResults;
        }

        public CreateScheduledTaskResponseBodyTasks setScheduledId(String scheduledId) {
            this.scheduledId = scheduledId;
            return this;
        }
        public String getScheduledId() {
            return this.scheduledId;
        }

        public CreateScheduledTaskResponseBodyTasks setTaskConfigId(String taskConfigId) {
            this.taskConfigId = taskConfigId;
            return this;
        }
        public String getTaskConfigId() {
            return this.taskConfigId;
        }

    }

}
