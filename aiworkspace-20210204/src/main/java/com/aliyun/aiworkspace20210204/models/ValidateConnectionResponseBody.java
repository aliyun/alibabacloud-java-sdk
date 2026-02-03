// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ValidateConnectionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Details")
    public java.util.Map<String, String> details;

    /**
     * <strong>example:</strong>
     * <p>The connection is reachable.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>5A14FA81-DD4E-******-6343FE44B941</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    public static ValidateConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateConnectionResponseBody self = new ValidateConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateConnectionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ValidateConnectionResponseBody setDetails(java.util.Map<String, String> details) {
        this.details = details;
        return this;
    }
    public java.util.Map<String, String> getDetails() {
        return this.details;
    }

    public ValidateConnectionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ValidateConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ValidateConnectionResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
