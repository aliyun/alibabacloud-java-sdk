// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetStructSyncJobDetailResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the schema synchronization task.</p>
     */
    @NameInMap("StructSyncJobDetail")
    public GetStructSyncJobDetailResponseBodyStructSyncJobDetail structSyncJobDetail;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
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
        /**
         * <p>The ID of the SQL task group.</p>
         */
        @NameInMap("DBTaskGroupId")
        public Long DBTaskGroupId;

        /**
         * <p>The number of SQL statements that have been executed.</p>
         */
        @NameInMap("ExecuteCount")
        public Long executeCount;

        /**
         * <p>The status of the task. Valid values:</p>
         * <br>
         * <p>*   **NEW**: The task was created.</p>
         * <p>*   **COMPARING**: The schemas of tables were being compared.</p>
         * <p>*   **COMPARE_BREAK**: The schema comparison was interrupted.</p>
         * <p>*   **COMPARE_FINISH**: The comparison was finished.</p>
         * <p>*   **NOT_SCRIPTS**: The comparison was finished but no executable script was available.</p>
         * <p>*   **SUBMITED_DBTASK**: The task was submitted.</p>
         * <p>*   **DBTASK_SUCCESS**: The task was complete.</p>
         * <p>*   **SUBMITED_WORKFLOW**: The ticket was submitted.</p>
         * <p>*   **WORKFLOW_SUCCESS**: The ticket was approved.</p>
         */
        @NameInMap("JobStatus")
        public String jobStatus;

        /**
         * <p>The description of the task.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The type of security rule. Valid values:</p>
         * <br>
         * <p>*   **CANNOT_SYNC**: Synchronization cannot be performed.</p>
         * <p>*   **WITH_APPROVE**: The schema synchronization can be performed after the ticket is approved. You can call the [SubmitStructSyncOrderApproval](https://help.aliyun.com/document_detail/206166.html) operation to submit the ticket for approval.</p>
         * <p>*   **WITHOUT_APPROVE**: The schema synchronization can be performed without approval.</p>
         */
        @NameInMap("SecurityRule")
        public String securityRule;

        /**
         * <p>The total number of SQL statements.</p>
         */
        @NameInMap("SqlCount")
        public Long sqlCount;

        /**
         * <p>The number of tables that have been analyzed.</p>
         */
        @NameInMap("TableAnalyzed")
        public Long tableAnalyzed;

        /**
         * <p>The total number of tables.</p>
         */
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
