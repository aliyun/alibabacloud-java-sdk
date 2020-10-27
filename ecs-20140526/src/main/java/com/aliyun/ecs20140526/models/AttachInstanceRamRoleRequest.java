// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AttachInstanceRamRoleRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("RamRoleName")
    @Validation(required = true)
    public String ramRoleName;

    @NameInMap("InstanceIds")
    @Validation(required = true)
    public String instanceIds;

    public static AttachInstanceRamRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachInstanceRamRoleRequest self = new AttachInstanceRamRoleRequest();
        return TeaModel.build(map, self);
    }

    public AttachInstanceRamRoleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachInstanceRamRoleRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public AttachInstanceRamRoleRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

}
