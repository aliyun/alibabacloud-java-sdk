// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyControlPolicyPriorityResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>586F34E8-3F16-4C08-9FFC-8FFDC64B9D0D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyControlPolicyPriorityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyControlPolicyPriorityResponseBody self = new ModifyControlPolicyPriorityResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyControlPolicyPriorityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
