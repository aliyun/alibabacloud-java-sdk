// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class AddIpControlPolicyItemResponseBody extends TeaModel {
    /**
     * <p>The ID of the policy. The ID is unique.</p>
     */
    @NameInMap("PolicyItemId")
    public String policyItemId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddIpControlPolicyItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddIpControlPolicyItemResponseBody self = new AddIpControlPolicyItemResponseBody();
        return TeaModel.build(map, self);
    }

    public AddIpControlPolicyItemResponseBody setPolicyItemId(String policyItemId) {
        this.policyItemId = policyItemId;
        return this;
    }
    public String getPolicyItemId() {
        return this.policyItemId;
    }

    public AddIpControlPolicyItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
