// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyAutoProvisioningGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B48A12CD-1295-4A38-A8F0-0E92C937****</p>
     */
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
