// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ErrorResult extends TeaModel {
    /**
     * <p>The error code. SUCCESS indicates the request was successful. Otherwise, a specific error code is returned, such as ERR_BAD_REQUEST, ERR_VALIDATION_FAILED, or ERR_INTERNAL_SERVER_ERROR.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>A human-readable description of the error.</p>
     * 
     * <strong>example:</strong>
     * <p>Conflict Transaction, process failed</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The unique request identifier, used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>55D4BE40-2811-5CFB-8482-E0E98D575B1E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ErrorResult build(java.util.Map<String, ?> map) throws Exception {
        ErrorResult self = new ErrorResult();
        return TeaModel.build(map, self);
    }

    public ErrorResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ErrorResult setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ErrorResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
