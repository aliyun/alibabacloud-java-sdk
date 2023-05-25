// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveIpControlPolicyItemResponseBody extends TeaModel {
    /**
     * <p>Removes one or more policies from an access control list (ACL).</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveIpControlPolicyItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveIpControlPolicyItemResponseBody self = new RemoveIpControlPolicyItemResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveIpControlPolicyItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
