// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyControlPolicyPriorityResponseBody extends TeaModel {
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
