// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateAutoProvisioningGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AutoProvisioningGroupId")
    public String autoProvisioningGroupId;

    public static CreateAutoProvisioningGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoProvisioningGroupResponseBody self = new CreateAutoProvisioningGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAutoProvisioningGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAutoProvisioningGroupResponseBody setAutoProvisioningGroupId(String autoProvisioningGroupId) {
        this.autoProvisioningGroupId = autoProvisioningGroupId;
        return this;
    }
    public String getAutoProvisioningGroupId() {
        return this.autoProvisioningGroupId;
    }

}
