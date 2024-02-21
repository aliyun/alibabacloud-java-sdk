// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyAuditPolicyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAuditPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAuditPolicyResponseBody self = new ModifyAuditPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAuditPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
