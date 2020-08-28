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

}
