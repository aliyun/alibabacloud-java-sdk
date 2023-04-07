// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ClonePolicyGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the new policy.</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ClonePolicyGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClonePolicyGroupResponseBody self = new ClonePolicyGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ClonePolicyGroupResponseBody setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public ClonePolicyGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
