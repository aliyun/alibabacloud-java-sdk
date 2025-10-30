// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteCustomPrivacyPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCustomPrivacyPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomPrivacyPolicyResponseBody self = new DeleteCustomPrivacyPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCustomPrivacyPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
