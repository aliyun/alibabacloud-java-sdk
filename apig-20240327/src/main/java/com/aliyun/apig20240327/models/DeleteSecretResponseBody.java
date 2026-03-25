// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeleteSecretResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD4F1D33-7267-5596-8F5D-C593xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecretResponseBody self = new DeleteSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSecretResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteSecretResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
