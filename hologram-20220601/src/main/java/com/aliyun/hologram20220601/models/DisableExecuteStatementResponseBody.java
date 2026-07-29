// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class DisableExecuteStatementResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the operation is successful. Valid values:</p>
     * <ul>
     * <li>true: The operation is successful.</li>
     * <li>false: The operation failed.</li>
     * </ul>
     */
    @NameInMap("data")
    public Boolean data;

    /**
     * <p>The error code. This parameter is empty if the operation is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameterValue</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message. This parameter is empty if the operation is successful.</p>
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
    public String httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E3F4B2A7-1234-5678-9ABC-DEF012345678</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation is successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static DisableExecuteStatementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableExecuteStatementResponseBody self = new DisableExecuteStatementResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableExecuteStatementResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DisableExecuteStatementResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DisableExecuteStatementResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DisableExecuteStatementResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DisableExecuteStatementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisableExecuteStatementResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
