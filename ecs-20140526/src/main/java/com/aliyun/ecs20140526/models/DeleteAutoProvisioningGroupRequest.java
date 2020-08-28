// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteAutoProvisioningGroupRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("AutoProvisioningGroupId")
    @Validation(required = true)
    public String autoProvisioningGroupId;

    @NameInMap("TerminateInstances")
    @Validation(required = true)
    public Boolean terminateInstances;

    public static DeleteAutoProvisioningGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoProvisioningGroupRequest self = new DeleteAutoProvisioningGroupRequest();
        return TeaModel.build(map, self);
    }

}
