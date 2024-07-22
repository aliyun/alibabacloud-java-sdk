// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateILMPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F99407AB-2FA9-489E-A259-40CF6DCC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>my-policy</p>
     */
    @NameInMap("Result")
    public String result;

    public static UpdateILMPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateILMPolicyResponseBody self = new UpdateILMPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateILMPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateILMPolicyResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
