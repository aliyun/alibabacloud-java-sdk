// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class UpdateModelLimitsResponseBody extends TeaModel {
    /**
     * <p>The error code. This parameter is empty when the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>A workspace with ID beb173d2361941 does not exist.</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E4C14AE6-E987-5C2F-9230-9960AB48F4F2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static UpdateModelLimitsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelLimitsResponseBody self = new UpdateModelLimitsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateModelLimitsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateModelLimitsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateModelLimitsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateModelLimitsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateModelLimitsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
