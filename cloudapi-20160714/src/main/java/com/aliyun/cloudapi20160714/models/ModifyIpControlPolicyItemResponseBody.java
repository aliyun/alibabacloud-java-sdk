// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyIpControlPolicyItemResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyIpControlPolicyItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpControlPolicyItemResponseBody self = new ModifyIpControlPolicyItemResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyIpControlPolicyItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
