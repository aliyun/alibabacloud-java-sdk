// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsai20260401.models;

import com.aliyun.tea.*;

public class DescribeDocParserJobStatusResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>JobNotFound</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified job does not exist.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The failure reason. This parameter has a value only when Status is failed.</p>
     * 
     * <strong>example:</strong>
     * <p>Failed Message</p>
     */
    @NameInMap("FailureMessage")
    public String failureMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A30D0930-xxxx-xxxx-xxxx-C2C661CC8B58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li><p><strong>init</strong>: Created and being prepared.</p>
     * </li>
     * <li><p><strong>pending</strong>: Queued and waiting to be scheduled.</p>
     * </li>
     * <li><p><strong>running</strong>: Being processed and parsed.</p>
     * </li>
     * <li><p><strong>success</strong>: Completed. You can call DescribeDocParserJobResult to obtain the result.</p>
     * </li>
     * <li><p><strong>failed</strong>: Failed. The reason is provided in FailureMessage.</p>
     * </li>
     * <li><p><strong>cancelled</strong>: Cancelled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>running</p>
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

    public static DescribeDocParserJobStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDocParserJobStatusResponseBody self = new DescribeDocParserJobStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDocParserJobStatusResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeDocParserJobStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeDocParserJobStatusResponseBody setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
        return this;
    }
    public String getFailureMessage() {
        return this.failureMessage;
    }

    public DescribeDocParserJobStatusResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeDocParserJobStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDocParserJobStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeDocParserJobStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
