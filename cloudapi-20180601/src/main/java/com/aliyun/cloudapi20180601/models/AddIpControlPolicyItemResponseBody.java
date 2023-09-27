// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class AddIpControlPolicyItemResponseBody extends TeaModel {
    @NameInMap("PolicyItemId")
    public String policyItemId;

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
