// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetStructSyncJobDetailResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("StructSyncJobDetail")
    public GetStructSyncJobDetailResponseBodyStructSyncJobDetail structSyncJobDetail;

    public static GetStructSyncJobDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStructSyncJobDetailResponseBody self = new GetStructSyncJobDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStructSyncJobDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStructSyncJobDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetStructSyncJobDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetStructSyncJobDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetStructSyncJobDetailResponseBody setStructSyncJobDetail(GetStructSyncJobDetailResponseBodyStructSyncJobDetail structSyncJobDetail) {
        this.structSyncJobDetail = structSyncJobDetail;
        return this;
    }
    public GetStructSyncJobDetailResponseBodyStructSyncJobDetail getStructSyncJobDetail() {
        return this.structSyncJobDetail;
    }

    public static class GetStructSyncJobDetailResponseBodyStructSyncJobDetail extends TeaModel {
        @NameInMap("JobStatus")
        public String jobStatus;

        @NameInMap("Message")
        public String message;

        @NameInMap("TableAnalyzed")
        public Long tableAnalyzed;

        @NameInMap("TableCount")
        public Long tableCount;

        @NameInMap("SqlCount")
        public Long sqlCount;

        @NameInMap("ExecuteCount")
        public Long executeCount;

        @NameInMap("SecurityRule")
        public String securityRule;

        public static GetStructSyncJobDetailResponseBodyStructSyncJobDetail build(java.util.Map<String, ?> map) throws Exception {
            GetStructSyncJobDetailResponseBodyStructSyncJobDetail self = new GetStructSyncJobDetailResponseBodyStructSyncJobDetail();
            return TeaModel.build(map, self);
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

        public GetStructSyncJobDetailResponseBodyStructSyncJobDetail setSqlCount(Long sqlCount) {
            this.sqlCount = sqlCount;
            return this;
        }
        public Long getSqlCount() {
            return this.sqlCount;
        }

        public GetStructSyncJobDetailResponseBodyStructSyncJobDetail setExecuteCount(Long executeCount) {
            this.executeCount = executeCount;
            return this;
        }
        public Long getExecuteCount() {
            return this.executeCount;
        }

        public GetStructSyncJobDetailResponseBodyStructSyncJobDetail setSecurityRule(String securityRule) {
            this.securityRule = securityRule;
            return this;
        }
        public String getSecurityRule() {
            return this.securityRule;
        }

    }

}
