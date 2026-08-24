// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsai20260401.models;

import com.aliyun.tea.*;

public class CreateDocParserJobResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The parameter is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The document parsing task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>job_abc123</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A30D0930-xxxx-xxxx-xxxx-C2C661CC8B58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result data.</p>
     */
    @NameInMap("Result")
    public String result;

    /**
     * <p>The result type.</p>
     */
    @NameInMap("ResultType")
    public String resultType;

    /**
     * <p>The result URL.</p>
     */
    @NameInMap("ResultUrl")
    public String resultUrl;

    /**
     * <p>The status information.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateDocParserJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDocParserJobResponseBody self = new CreateDocParserJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDocParserJobResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateDocParserJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateDocParserJobResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateDocParserJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CreateDocParserJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDocParserJobResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public CreateDocParserJobResponseBody setResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }
    public String getResultType() {
        return this.resultType;
    }

    public CreateDocParserJobResponseBody setResultUrl(String resultUrl) {
        this.resultUrl = resultUrl;
        return this;
    }
    public String getResultUrl() {
        return this.resultUrl;
    }

    public CreateDocParserJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateDocParserJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
