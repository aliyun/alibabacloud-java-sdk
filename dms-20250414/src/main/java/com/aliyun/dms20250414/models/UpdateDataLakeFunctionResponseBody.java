// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class UpdateDataLakeFunctionResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The details of the function.</p>
     */
    @NameInMap("Function")
    public DLFunction function;

    /**
     * <p>The ID of the request, used for log tracing and troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>C1D39814-9808-47F8-AFE0-AF167239****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateDataLakeFunctionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataLakeFunctionResponseBody self = new UpdateDataLakeFunctionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDataLakeFunctionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateDataLakeFunctionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateDataLakeFunctionResponseBody setFunction(DLFunction function) {
        this.function = function;
        return this;
    }
    public DLFunction getFunction() {
        return this.function;
    }

    public UpdateDataLakeFunctionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDataLakeFunctionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
