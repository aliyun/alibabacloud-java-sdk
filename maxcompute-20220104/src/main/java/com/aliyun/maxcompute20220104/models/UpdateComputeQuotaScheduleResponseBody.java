// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateComputeQuotaScheduleResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("data")
    public String data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>QUOTA_PLAN_NOT_FOUND</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>plan \&quot;***\&quot; does not exist</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>HTTP status code.</p>
     * <ul>
     * <li>1xx: Informational - The request has been received and is being processed.</li>
     * <li>2xx: Success - The request action was successfully received, understood, and accepted by the server.</li>
     * <li>3xx: Redirection - Further action must be taken to complete the request.</li>
     * <li>4xx: Client Error - The request contains an error in the request parameters, syntax, or specific request conditions cannot be met.</li>
     * <li>5xx: Server Error - The server could not fulfill the request due to other reasons.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0be3e0aa16667684362147582e038f</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateComputeQuotaScheduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateComputeQuotaScheduleResponseBody self = new UpdateComputeQuotaScheduleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateComputeQuotaScheduleResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UpdateComputeQuotaScheduleResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateComputeQuotaScheduleResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public UpdateComputeQuotaScheduleResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public UpdateComputeQuotaScheduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
