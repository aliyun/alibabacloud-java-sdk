// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class AddIpControlPolicyItemResponseBody extends TeaModel {
    /**
     * <p>When you call this operation, note that:</p>
     * <br>
     * <p>*   This operation is intended for API providers.</p>
     * <p>*   An added policy immediately takes effect on all APIs that are bound to the access control list (ACL).</p>
     * <p>*   A maximum of 100 policies can be added to an ACL.</p>
     */
    @NameInMap("PolicyItemId")
    public String policyItemId;

    /**
     * <p>Adds a policy to an existing ACL.</p>
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
