// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteCenterPolicyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>72E47B1E-6B11-5A11-A27C-7A80F866****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCenterPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCenterPolicyResponseBody self = new DeleteCenterPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCenterPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
