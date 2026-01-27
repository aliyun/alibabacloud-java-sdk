// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyAutoRepairPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>db82195b-75a8-40e5-9be4-16f182******</p>
     */
    @NameInMap("request_id")
    public String requestId;

    public static ModifyAutoRepairPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoRepairPolicyResponseBody self = new ModifyAutoRepairPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAutoRepairPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
