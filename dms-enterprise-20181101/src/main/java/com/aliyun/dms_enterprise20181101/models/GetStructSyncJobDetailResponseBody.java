// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetStructSyncJobDetailResponseBody extends TeaModel {
    // The error code that is returned.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The error message that is returned.
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The details of the schema synchronization task.
    @NameInMap("StructSyncJobDetail")
    public GetStructSyncJobDetailResponseBodyStructSyncJobDetail structSyncJobDetail;

    // Indicates whether the call was successful.
    @NameInMap("Success")
    public Boolean success;

    public static GetStructSyncJobDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStructSyncJobDetailResponseBody self = new GetStructSyncJobDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStructSyncJobDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetStructSyncJobDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetStructSyncJobDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStructSyncJobDetailResponseBody setStructSyncJobDetail(GetStructSyncJobDetailResponseBodyStructSyncJobDetail structSyncJobDetail) {
        this.structSyncJobDetail = structSyncJobDetail;
        return this;
    }
    public GetStructSyncJobDetailResponseBodyStructSyncJobDetail getStructSyncJobDetail() {
        return this.structSyncJobDetail;
    }

    public GetStructSyncJobDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetStructSyncJobDetailResponseBodyStructSyncJobDetail extends TeaModel {
        // The ID of the task queue.
        @NameInMap("DBTaskGroupId")
        public Long DBTaskGroupId;

        // The number of SQL statements that have been executed.
        @NameInMap("ExecuteCount")
        public Long executeCount;

        // The status of the task. Valid values:
        // 
        // *   **NEW**: The task was created.
        // *   **COMPARING**: The schemas of tables were being compared.
        // *   **COMPARE_BREAK**: The schema comparison was interrupted.
        // *   **COMPARE_FINISH**: The schema comparison was complete.
        // *   **NOT_SCRIPTS**: The schema comparison was complete. No scripts were available.
        // *   **SUBMITED_DBTASK**: The task was submitted.
        // *   **DBTASK_SUCCESS**: The task was complete.
        // *   **SUBMITED_WORKFLOW**: The ticket was submitted for approval.
        // *   **WORKFLOW_SUCCESS**: The ticket was approved.
        @NameInMap("JobStatus")
        public String jobStatus;

        // The description of the task.
        @NameInMap("Message")
        public String message;

        // The type of security rule. Valid values:
        // 
        // *   **CANNOT_SYNC**: The schema synchronization is not allowed.
        // *   **WITH_APPROVE**: The schema synchronization can be performed after the ticket is approved. You can call the [SubmitStructSyncOrderApproval](~~206166~~) operation to submit the ticket for approval.
        // *   **WITHOUT_APPROVE**: The schema synchronization can be performed without approval.
        @NameInMap("SecurityRule")
        public String securityRule;

        // The total number of SQL statements.
        @NameInMap("SqlCount")
        public Long sqlCount;

        // The number of tables that have been analyzed.
        @NameInMap("TableAnalyzed")
        public Long tableAnalyzed;

        // The total number of tables.
        @NameInMap("TableCount")
        public Long tableCount;

        public static GetStructSyncJobDetailResponseBodyStructSyncJobDetail build(java.util.Map<String, ?> map) throws Exception {
            GetStructSyncJobDetailResponseBodyStructSyncJobDetail self = new GetStructSyncJobDetailResponseBodyStructSyncJobDetail();
            return TeaModel.build(map, self);
        }

        public GetStructSyncJobDetailResponseBodyStructSyncJobDetail setDBTaskGroupId(Long DBTaskGroupId) {
            this.DBTaskGroupId = DBTaskGroupId;
            return this;
        }
        public Long getDBTaskGroupId() {
            return this.DBTaskGroupId;
        }

        public GetStructSyncJobDetailResponseBodyStructSyncJobDetail setExecuteCount(Long executeCount) {
            this.executeCount = executeCount;
            return this;
        }
        public Long getExecuteCount() {
            return this.executeCount;
        }

        public GetStructSyncJobDetailResponseBodyStructSyncJobDetail setJobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public String getJobStatus() {
            return this.jobStatus;
        }

        public GetStructSyncJobDetailResponseBodyStructSyncJobDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetStructSyncJobDetailResponseBodyStructSyncJobDetail setSecurityRule(String securityRule) {
            this.securityRule = securityRule;
            return this;
        }
        public String getSecurityRule() {
            return this.securityRule;
        }

        public GetStructSyncJobDetailResponseBodyStructSyncJobDetail setSqlCount(Long sqlCount) {
            this.sqlCount = sqlCount;
            return this;
        }
        public Long getSqlCount() {
            return this.sqlCount;
        }

        public GetStructSyncJobDetailResponseBodyStructSyncJobDetail setTableAnalyzed(Long tableAnalyzed) {
            this.tableAnalyzed = tableAnalyzed;
            return this;
        }
        public Long getTableAnalyzed() {
            return this.tableAnalyzed;
        }

        public GetStructSyncJobDetailResponseBodyStructSyncJobDetail setTableCount(Long tableCount) {
            this.tableCount = tableCount;
            return this;
        }
        public Long getTableCount() {
            return this.tableCount;
        }

    }

}
