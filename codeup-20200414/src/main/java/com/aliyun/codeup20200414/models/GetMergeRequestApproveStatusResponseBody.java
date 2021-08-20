// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetMergeRequestApproveStatusResponseBody extends TeaModel {
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Result")
    public GetMergeRequestApproveStatusResponseBodyResult result;

    public static GetMergeRequestApproveStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMergeRequestApproveStatusResponseBody self = new GetMergeRequestApproveStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMergeRequestApproveStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMergeRequestApproveStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMergeRequestApproveStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetMergeRequestApproveStatusResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMergeRequestApproveStatusResponseBody setResult(GetMergeRequestApproveStatusResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetMergeRequestApproveStatusResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetMergeRequestApproveStatusResponseBodyResult extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("ApproveStatus")
        public String approveStatus;

        public static GetMergeRequestApproveStatusResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetMergeRequestApproveStatusResponseBodyResult self = new GetMergeRequestApproveStatusResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetMergeRequestApproveStatusResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetMergeRequestApproveStatusResponseBodyResult setApproveStatus(String approveStatus) {
            this.approveStatus = approveStatus;
            return this;
        }
        public String getApproveStatus() {
            return this.approveStatus;
        }

    }

}
