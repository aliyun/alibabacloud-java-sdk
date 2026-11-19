// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetSandboxRebuildOperationResponseBody extends TeaModel {
    /**
     * <p>The result code of this API request. SUCCESS is returned for successful requests. Query the asynchronous task result separately.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The overall result of the rebuild task.</p>
     */
    @NameInMap("data")
    public GetSandboxRebuildOperationResponseBodyData data;

    /**
     * <p>The HTTP status code corresponding to this API request.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The result description of this API request, which does not indicate that the asynchronous rebuild task is completed.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID, which is used to locate this API call.</p>
     * 
     * <strong>example:</strong>
     * <p>01A1BE93-46A7-1A2A-BD62-159FCDAA****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether this API request is successful. A value of true does not mean that the sandbox rebuild is completed.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetSandboxRebuildOperationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSandboxRebuildOperationResponseBody self = new GetSandboxRebuildOperationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSandboxRebuildOperationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSandboxRebuildOperationResponseBody setData(GetSandboxRebuildOperationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSandboxRebuildOperationResponseBodyData getData() {
        return this.data;
    }

    public GetSandboxRebuildOperationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetSandboxRebuildOperationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSandboxRebuildOperationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSandboxRebuildOperationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSandboxRebuildOperationResponseBodyDataError extends TeaModel {
        /**
         * <p>The task error code, which is used to distinguish between rebuild failures, subsequent instance creation failures, cancellations, or supersessions.</p>
         * 
         * <strong>example:</strong>
         * <p>SandboxRebuild.Failed</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The publicly displayable task error description. Retain the task ID for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>The Sandbox rebuild did not complete. Contact support with the operation ID.</p>
         */
        @NameInMap("message")
        public String message;

        public static GetSandboxRebuildOperationResponseBodyDataError build(java.util.Map<String, ?> map) throws Exception {
            GetSandboxRebuildOperationResponseBodyDataError self = new GetSandboxRebuildOperationResponseBodyDataError();
            return TeaModel.build(map, self);
        }

        public GetSandboxRebuildOperationResponseBodyDataError setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetSandboxRebuildOperationResponseBodyDataError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class GetSandboxRebuildOperationResponseBodyData extends TeaModel {
        /**
         * <p>The publicly displayable task error. Returned when the task fails, is canceled, or an override by subsequent operations occurs. This field can be empty in other states.</p>
         */
        @NameInMap("error")
        public GetSandboxRebuildOperationResponseBodyDataError error;

        /**
         * <p>The initial rebuild task ID. Use the operationId returned by RebuildSandbox. Always use this ID to query the overall result subsequently, without switching to the ID of subsequent creation tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>01a1be92-7fa4-76b2-a871-b376d6d0****</p>
         */
        @NameInMap("operationId")
        public String operationId;

        /**
         * <p>The logical sandbox ID corresponding to this rebuild. The logical ID remains unchanged after the rebuild.</p>
         * 
         * <strong>example:</strong>
         * <p>01a1b56a-b00f-7aa3-bacf-cc9d04b0****</p>
         */
        @NameInMap("sandboxId")
        public String sandboxId;

        /**
         * <p>The overall rebuild status. Valid values:</p>
         * <ul>
         * <li>PENDING: Waiting to be processed.</li>
         * <li>RUNNING: The task continues to execute.</li>
         * <li>SUCCEEDED: Overall success.</li>
         * <li>FAILED: Failed.</li>
         * <li>CANCELED: Canceled.</li>
         * <li>SUPERSEDED: A subsequent operation will override this task.</li>
         * <li>UNKNOWN: Unable to confirm.
         * Only SUCCEEDED indicates completion. UNKNOWN, missing status, or query exceptions must not be treated as success, and the rebuild must not be automatically resubmitted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("status")
        public String status;

        public static GetSandboxRebuildOperationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSandboxRebuildOperationResponseBodyData self = new GetSandboxRebuildOperationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSandboxRebuildOperationResponseBodyData setError(GetSandboxRebuildOperationResponseBodyDataError error) {
            this.error = error;
            return this;
        }
        public GetSandboxRebuildOperationResponseBodyDataError getError() {
            return this.error;
        }

        public GetSandboxRebuildOperationResponseBodyData setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

        public GetSandboxRebuildOperationResponseBodyData setSandboxId(String sandboxId) {
            this.sandboxId = sandboxId;
            return this;
        }
        public String getSandboxId() {
            return this.sandboxId;
        }

        public GetSandboxRebuildOperationResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
