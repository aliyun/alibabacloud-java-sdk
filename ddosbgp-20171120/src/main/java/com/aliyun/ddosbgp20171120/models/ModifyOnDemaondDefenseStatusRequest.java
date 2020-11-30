// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class ModifyOnDemaondDefenseStatusRequest extends TeaModel {
    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("DefenseStatus")
    @Validation(required = true)
    public String defenseStatus;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyOnDemaondDefenseStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyOnDemaondDefenseStatusRequest self = new ModifyOnDemaondDefenseStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyOnDemaondDefenseStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyOnDemaondDefenseStatusRequest setDefenseStatus(String defenseStatus) {
        this.defenseStatus = defenseStatus;
        return this;
    }
    public String getDefenseStatus() {
        return this.defenseStatus;
    }

    public ModifyOnDemaondDefenseStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
