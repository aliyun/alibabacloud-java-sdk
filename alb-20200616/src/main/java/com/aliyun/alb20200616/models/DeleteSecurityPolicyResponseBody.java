// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DeleteSecurityPolicyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSecurityPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityPolicyResponseBody self = new DeleteSecurityPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
