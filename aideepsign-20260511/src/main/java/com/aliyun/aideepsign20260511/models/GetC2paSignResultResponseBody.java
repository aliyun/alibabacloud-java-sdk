// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class GetC2paSignResultResponseBody extends TeaModel {
    /**
     * <p>The business error code for the API call. OK is returned when the call succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error code for task failure. This parameter is returned only when Status is FAILED.</p>
     * 
     * <strong>example:</strong>
     * <p>C2PA_FORMAT_UNSUPPORTED</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message for task failure. This parameter is returned only when Status is FAILED.</p>
     * 
     * <strong>example:</strong>
     * <p>only valid JPEG and PNG source files are supported</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The number of objects that failed to be signed, were skipped, or were terminated in the Bucket task. This parameter is returned only when the Bucket task is in the SUCCEEDED or CANCELED state.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("FailedCount")
    public Long failedCount;

    /**
     * <p>The HTTP status code. 200 is returned when the API call succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The additional information. success is returned when the API call succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The temporary download URL returned when a Bucket task enters the CANCELED state and the JSON report is successfully generated. The report covers only the objects discovered before termination.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example-bucket.oss-cn-hangzhou.aliyuncs.com/c2pa_report.json?Expires=1788000000&Signature=">https://example-bucket.oss-cn-hangzhou.aliyuncs.com/c2pa_report.json?Expires=1788000000&amp;Signature=</a>***</p>
     */
    @NameInMap("ReportFileUrl")
    public String reportFileUrl;

    /**
     * <p>The object key of the final standard JSON report for the Bucket task. This parameter is returned only when the Bucket task succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>ai-deepsign-signed/047b8305-9572-4eed-b7fb-8588b989b6e5/c2pa_report.json</p>
     */
    @NameInMap("ReportObjectKey")
    public String reportObjectKey;

    /**
     * <p>The request ID of the OpenAPI call.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-7890-ABCD-EF1234567890</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The temporary download URL of the signature file. This parameter is returned only when Status is SUCCEEDED.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.oss-cn-hangzhou.aliyuncs.com/">https://example.oss-cn-hangzhou.aliyuncs.com/</a>...</p>
     */
    @NameInMap("SignedFileUrl")
    public String signedFileUrl;

    /**
     * <p>The task status. Valid values: PROCESSING, SUCCEEDED, and FAILED.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCEEDED</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The number of successfully signed objects in the Bucket task. This parameter is returned only when the Bucket task is in the SUCCEEDED or CANCELED state.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SucceededCount")
    public Long succeededCount;

    /**
     * <p>Indicates whether the query call is successful. This value may still be true even if the task itself fails.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The C2PA signing task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7093c29e-f472-4e1e-91c6-a43df7c7382e</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The task type. Valid values: FILE and BUCKET.</p>
     * 
     * <strong>example:</strong>
     * <p>BUCKET</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>The total number of objects scanned by the Bucket task. This parameter is returned only when the Bucket task is in the SUCCEEDED or CANCELED state.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetC2paSignResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetC2paSignResultResponseBody self = new GetC2paSignResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetC2paSignResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetC2paSignResultResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetC2paSignResultResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetC2paSignResultResponseBody setFailedCount(Long failedCount) {
        this.failedCount = failedCount;
        return this;
    }
    public Long getFailedCount() {
        return this.failedCount;
    }

    public GetC2paSignResultResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetC2paSignResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetC2paSignResultResponseBody setReportFileUrl(String reportFileUrl) {
        this.reportFileUrl = reportFileUrl;
        return this;
    }
    public String getReportFileUrl() {
        return this.reportFileUrl;
    }

    public GetC2paSignResultResponseBody setReportObjectKey(String reportObjectKey) {
        this.reportObjectKey = reportObjectKey;
        return this;
    }
    public String getReportObjectKey() {
        return this.reportObjectKey;
    }

    public GetC2paSignResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetC2paSignResultResponseBody setSignedFileUrl(String signedFileUrl) {
        this.signedFileUrl = signedFileUrl;
        return this;
    }
    public String getSignedFileUrl() {
        return this.signedFileUrl;
    }

    public GetC2paSignResultResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetC2paSignResultResponseBody setSucceededCount(Long succeededCount) {
        this.succeededCount = succeededCount;
        return this;
    }
    public Long getSucceededCount() {
        return this.succeededCount;
    }

    public GetC2paSignResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetC2paSignResultResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetC2paSignResultResponseBody setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public GetC2paSignResultResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
