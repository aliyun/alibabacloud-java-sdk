// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteAutoRepairPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>A9891419-D125-4D89-AFCA-68846675****</p>
     */
    @NameInMap("request_id")
    public String requestId;

    public static DeleteAutoRepairPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoRepairPolicyResponseBody self = new DeleteAutoRepairPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAutoRepairPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
