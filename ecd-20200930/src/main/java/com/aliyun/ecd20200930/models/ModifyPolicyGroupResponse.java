// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyPolicyGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyPolicyGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolicyGroupResponse self = new ModifyPolicyGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPolicyGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
