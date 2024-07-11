// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetStructSyncJobDetailResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>48602B78-0DDF-414C-8688-70CAB6070115</p>
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
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("DBTaskGroupId")
        public Long DBTaskGroupId;

        /**
         * <p>The number of SQL statements that have been executed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExecuteCount")
        public Long executeCount;

        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li><strong>NEW</strong>: The task was created.</li>
         * <li><strong>COMPARING</strong>: The schemas of tables were being compared.</li>
         * <li><strong>COMPARE_BREAK</strong>: The schema comparison was interrupted.</li>
         * <li><strong>COMPARE_FINISH</strong>: The comparison was finished.</li>
         * <li><strong>NOT_SCRIPTS</strong>: The comparison was finished but no executable script was available.</li>
         * <li><strong>SUBMITED_DBTASK</strong>: The task was submitted.</li>
         * <li><strong>DBTASK_SUCCESS</strong>: The task was complete.</li>
         * <li><strong>SUBMITED_WORKFLOW</strong>: The ticket was submitted.</li>
         * <li><strong>WORKFLOW_SUCCESS</strong>: The ticket was approved.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DBTASK_SUCCESS</p>
         */
        @NameInMap("JobStatus")
        public String jobStatus;

        /**
         * <p>The description of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The type of security rule. Valid values:</p>
         * <ul>
         * <li><strong>CANNOT_SYNC</strong>: Synchronization cannot be performed.</li>
         * <li><strong>WITH_APPROVE</strong>: The schema synchronization can be performed after the ticket is approved. You can call the <a href="https://help.aliyun.com/document_detail/206166.html">SubmitStructSyncOrderApproval</a> operation to submit the ticket for approval.</li>
         * <li><strong>WITHOUT_APPROVE</strong>: The schema synchronization can be performed without approval.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WITHOUT_APPROVE</p>
         */
        @NameInMap("SecurityRule")
        public String securityRule;

        /**
         * <p>The total number of SQL statements.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SqlCount")
        public Long sqlCount;

        /**
         * <p>The number of tables that have been analyzed.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TableAnalyzed")
        public Long tableAnalyzed;

        /**
         * <p>The total number of tables.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
