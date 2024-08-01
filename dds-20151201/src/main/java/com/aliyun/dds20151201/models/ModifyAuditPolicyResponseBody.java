// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyAuditPolicyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DC04D812-F18D-4568-9B88-F260D9590116</p>
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
