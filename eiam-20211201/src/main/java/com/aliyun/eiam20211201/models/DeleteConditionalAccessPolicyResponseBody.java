// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteConditionalAccessPolicyResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteConditionalAccessPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteConditionalAccessPolicyResponseBody self = new DeleteConditionalAccessPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteConditionalAccessPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
