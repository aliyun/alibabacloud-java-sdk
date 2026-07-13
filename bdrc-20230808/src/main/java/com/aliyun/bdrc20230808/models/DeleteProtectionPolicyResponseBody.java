// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DeleteProtectionPolicyResponseBody extends TeaModel {
    /**
     * <p>The unique identifier of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5B2F09BF-CEBD-5A7E-AC01-E7F86169A5E5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteProtectionPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteProtectionPolicyResponseBody self = new DeleteProtectionPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteProtectionPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
