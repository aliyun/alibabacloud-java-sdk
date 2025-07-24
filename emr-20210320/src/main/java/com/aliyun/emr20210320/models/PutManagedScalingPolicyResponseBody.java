// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class PutManagedScalingPolicyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PutManagedScalingPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutManagedScalingPolicyResponseBody self = new PutManagedScalingPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public PutManagedScalingPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
