// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyScheduledTaskResponseBody extends TeaModel {
    /**
     * <p>The API status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9A51B1DF-96FF-3BCC-B08C-783161D3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of modification results.</p>
     */
    @NameInMap("Tasks")
    public java.util.List<ModifyScheduledTaskResponseBodyTasks> tasks;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ModifyScheduledTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyScheduledTaskResponseBody self = new ModifyScheduledTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyScheduledTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyScheduledTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyScheduledTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyScheduledTaskResponseBody setTasks(java.util.List<ModifyScheduledTaskResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<ModifyScheduledTaskResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public ModifyScheduledTaskResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ModifyScheduledTaskResponseBodyTasksInstanceResults extends TeaModel {
        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance not found.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-4dkmkip0l0uw*****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Indicates whether the operation is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static ModifyScheduledTaskResponseBodyTasksInstanceResults build(java.util.Map<String, ?> map) throws Exception {
            ModifyScheduledTaskResponseBodyTasksInstanceResults self = new ModifyScheduledTaskResponseBodyTasksInstanceResults();
            return TeaModel.build(map, self);
        }

        public ModifyScheduledTaskResponseBodyTasksInstanceResults setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ModifyScheduledTaskResponseBodyTasksInstanceResults setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyScheduledTaskResponseBodyTasksInstanceResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class ModifyScheduledTaskResponseBodyTasks extends TeaModel {
        /**
         * <p>The list of batch delivery results for instance scheduled tasks.</p>
         */
        @NameInMap("InstanceResults")
        public java.util.List<ModifyScheduledTaskResponseBodyTasksInstanceResults> instanceResults;

        /**
         * <p>The updated CAS version number.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NewVersion")
        public Integer newVersion;

        /**
         * <p>The scheduled task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sch-260705-agbx*****</p>
         */
        @NameInMap("ScheduledId")
        public String scheduledId;

        public static ModifyScheduledTaskResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            ModifyScheduledTaskResponseBodyTasks self = new ModifyScheduledTaskResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public ModifyScheduledTaskResponseBodyTasks setInstanceResults(java.util.List<ModifyScheduledTaskResponseBodyTasksInstanceResults> instanceResults) {
            this.instanceResults = instanceResults;
            return this;
        }
        public java.util.List<ModifyScheduledTaskResponseBodyTasksInstanceResults> getInstanceResults() {
            return this.instanceResults;
        }

        public ModifyScheduledTaskResponseBodyTasks setNewVersion(Integer newVersion) {
            this.newVersion = newVersion;
            return this;
        }
        public Integer getNewVersion() {
            return this.newVersion;
        }

        public ModifyScheduledTaskResponseBodyTasks setScheduledId(String scheduledId) {
            this.scheduledId = scheduledId;
            return this;
        }
        public String getScheduledId() {
            return this.scheduledId;
        }

    }

}
