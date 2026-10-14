// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class AuditTaskState extends TeaModel {
    /**
     * <p>The current expected sharing switch for the task.</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>The runtime error, which is returned only when runtimeStatus is error.</p>
     */
    @NameInMap("runtimeError")
    public AuditTaskStateRuntimeError runtimeError;

    /**
     * <p>The runtime status, which appears only when includeRuntimeStatus=true is requested. Valid values: pending, starting, stopping, running, stopped, missing, drifted, and error. The list and get operations do not return deleting.</p>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("runtimeStatus")
    public String runtimeStatus;

    /**
     * <p>The time when the remote status is checked. This field appears together with runtimeStatus.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("runtimeStatusCheckedAt")
    public String runtimeStatusCheckedAt;

    /**
     * <p>The task details in JSON format.</p>
     */
    @NameInMap("task")
    public java.util.Map<String, ?> task;

    /**
     * <p>The stable ID of the task, which must be equal to task.taskId.</p>
     * 
     * <strong>example:</strong>
     * <p>custom_host_intrusion_audit</p>
     */
    @NameInMap("taskId")
    public String taskId;

    /**
     * <p>The current execution configuration version of the task. The minimum value is 1. Starting or stopping the task does not increment this version.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("version")
    public Long version;

    public static AuditTaskState build(java.util.Map<String, ?> map) throws Exception {
        AuditTaskState self = new AuditTaskState();
        return TeaModel.build(map, self);
    }

    public AuditTaskState setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public AuditTaskState setRuntimeError(AuditTaskStateRuntimeError runtimeError) {
        this.runtimeError = runtimeError;
        return this;
    }
    public AuditTaskStateRuntimeError getRuntimeError() {
        return this.runtimeError;
    }

    public AuditTaskState setRuntimeStatus(String runtimeStatus) {
        this.runtimeStatus = runtimeStatus;
        return this;
    }
    public String getRuntimeStatus() {
        return this.runtimeStatus;
    }

    public AuditTaskState setRuntimeStatusCheckedAt(String runtimeStatusCheckedAt) {
        this.runtimeStatusCheckedAt = runtimeStatusCheckedAt;
        return this;
    }
    public String getRuntimeStatusCheckedAt() {
        return this.runtimeStatusCheckedAt;
    }

    public AuditTaskState setTask(java.util.Map<String, ?> task) {
        this.task = task;
        return this;
    }
    public java.util.Map<String, ?> getTask() {
        return this.task;
    }

    public AuditTaskState setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public AuditTaskState setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

    public static class AuditTaskStateRuntimeError extends TeaModel {
        /**
         * <p>The error code, such as task_status_query_failed.</p>
         * 
         * <strong>example:</strong>
         * <p>task_status_query_failed</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The error description.</p>
         * 
         * <strong>example:</strong>
         * <p>error</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>The ID of the status query request.</p>
         * 
         * <strong>example:</strong>
         * <p>GUID</p>
         */
        @NameInMap("requestId")
        public String requestId;

        public static AuditTaskStateRuntimeError build(java.util.Map<String, ?> map) throws Exception {
            AuditTaskStateRuntimeError self = new AuditTaskStateRuntimeError();
            return TeaModel.build(map, self);
        }

        public AuditTaskStateRuntimeError setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AuditTaskStateRuntimeError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AuditTaskStateRuntimeError setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
