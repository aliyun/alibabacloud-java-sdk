// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifySecurityGroupPolicyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySecurityGroupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityGroupPolicyResponseBody self = new ModifySecurityGroupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySecurityGroupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
