// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyAutoProvisioningGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyAutoProvisioningGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoProvisioningGroupResponse self = new ModifyAutoProvisioningGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAutoProvisioningGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
