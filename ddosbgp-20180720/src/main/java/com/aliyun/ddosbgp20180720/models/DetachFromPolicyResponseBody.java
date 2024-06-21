// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DetachFromPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1B0F7EC6-51D7-4D70-B0EC-CD8A9E99****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetachFromPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachFromPolicyResponseBody self = new DetachFromPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachFromPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
