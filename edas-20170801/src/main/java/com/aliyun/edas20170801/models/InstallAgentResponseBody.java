// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InstallAgentResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ExecutionResultList")
    public InstallAgentResponseBodyExecutionResultList executionResultList;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static InstallAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallAgentResponseBody self = new InstallAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallAgentResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public InstallAgentResponseBody setExecutionResultList(InstallAgentResponseBodyExecutionResultList executionResultList) {
        this.executionResultList = executionResultList;
        return this;
    }
    public InstallAgentResponseBodyExecutionResultList getExecutionResultList() {
        return this.executionResultList;
    }

    public InstallAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InstallAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InstallAgentResponseBodyExecutionResultListExecutionResult extends TeaModel {
        @NameInMap("FinishedTime")
        public String finishedTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InvokeRecordStatus")
        public String invokeRecordStatus;

        @NameInMap("Status")
        public String status;

        @NameInMap("Success")
        public Boolean success;

        public static InstallAgentResponseBodyExecutionResultListExecutionResult build(java.util.Map<String, ?> map) throws Exception {
            InstallAgentResponseBodyExecutionResultListExecutionResult self = new InstallAgentResponseBodyExecutionResultListExecutionResult();
            return TeaModel.build(map, self);
        }

        public InstallAgentResponseBodyExecutionResultListExecutionResult setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public InstallAgentResponseBodyExecutionResultListExecutionResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public InstallAgentResponseBodyExecutionResultListExecutionResult setInvokeRecordStatus(String invokeRecordStatus) {
            this.invokeRecordStatus = invokeRecordStatus;
            return this;
        }
        public String getInvokeRecordStatus() {
            return this.invokeRecordStatus;
        }

        public InstallAgentResponseBodyExecutionResultListExecutionResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public InstallAgentResponseBodyExecutionResultListExecutionResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class InstallAgentResponseBodyExecutionResultList extends TeaModel {
        @NameInMap("ExecutionResult")
        public java.util.List<InstallAgentResponseBodyExecutionResultListExecutionResult> executionResult;

        public static InstallAgentResponseBodyExecutionResultList build(java.util.Map<String, ?> map) throws Exception {
            InstallAgentResponseBodyExecutionResultList self = new InstallAgentResponseBodyExecutionResultList();
            return TeaModel.build(map, self);
        }

        public InstallAgentResponseBodyExecutionResultList setExecutionResult(java.util.List<InstallAgentResponseBodyExecutionResultListExecutionResult> executionResult) {
            this.executionResult = executionResult;
            return this;
        }
        public java.util.List<InstallAgentResponseBodyExecutionResultListExecutionResult> getExecutionResult() {
            return this.executionResult;
        }

    }

}
