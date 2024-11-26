// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeleteEnvironmentResponseBody extends TeaModel {
    /**
     * <p>Response code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Request ID, used for tracing the request chain.</p>
     * 
     * <strong>example:</strong>
     * <p>C61E30D3-579A-5B43-994E-31E02EDC9129</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteEnvironmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnvironmentResponseBody self = new DeleteEnvironmentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEnvironmentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteEnvironmentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteEnvironmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
