// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyAutoProvisioningGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAutoProvisioningGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoProvisioningGroupResponseBody self = new ModifyAutoProvisioningGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAutoProvisioningGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
