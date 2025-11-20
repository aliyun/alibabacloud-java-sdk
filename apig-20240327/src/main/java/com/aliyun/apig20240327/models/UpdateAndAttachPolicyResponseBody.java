// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateAndAttachPolicyResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID, which is used to trace the call link.</p>
     * 
     * <strong>example:</strong>
     * <p>585657D2-1C20-5B8A-AF17-D727C6490BE4</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateAndAttachPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAndAttachPolicyResponseBody self = new UpdateAndAttachPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAndAttachPolicyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateAndAttachPolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateAndAttachPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
