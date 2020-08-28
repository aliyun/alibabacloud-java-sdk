// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DetachInstanceRamRoleRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("InstanceIds")
    @Validation(required = true)
    public String instanceIds;

    public static DetachInstanceRamRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachInstanceRamRoleRequest self = new DetachInstanceRamRoleRequest();
        return TeaModel.build(map, self);
    }

}
