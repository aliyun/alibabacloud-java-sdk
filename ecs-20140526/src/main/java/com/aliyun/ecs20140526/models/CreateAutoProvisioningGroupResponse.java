// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateAutoProvisioningGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AutoProvisioningGroupId")
    @Validation(required = true)
    public String autoProvisioningGroupId;

    public static CreateAutoProvisioningGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoProvisioningGroupResponse self = new CreateAutoProvisioningGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateAutoProvisioningGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAutoProvisioningGroupResponse setAutoProvisioningGroupId(String autoProvisioningGroupId) {
        this.autoProvisioningGroupId = autoProvisioningGroupId;
        return this;
    }
    public String getAutoProvisioningGroupId() {
        return this.autoProvisioningGroupId;
    }

}
