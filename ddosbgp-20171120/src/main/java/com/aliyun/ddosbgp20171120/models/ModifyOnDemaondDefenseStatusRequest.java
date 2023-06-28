// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class ModifyOnDemaondDefenseStatusRequest extends TeaModel {
    /**
     * <p>The protection status of the on-demand instance. Valid values:</p>
     * <br>
     * <p>*   **Defense**: enables the on-demand instance.</p>
     * <p>*   **UnDefense**: disables the on-demand instance.</p>
     */
    @NameInMap("DefenseStatus")
    public String defenseStatus;

    /**
     * <p>The ID of the on-demand instance.</p>
     * <br>
     * <p>>  You can call the [DescribeOnDemandInstance](~~152120~~) operation to query the IDs of all on-demand instances.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the on-demand instance.</p>
     * <br>
     * <p>>  You can call the [DescribeRegions](~~118703~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyOnDemaondDefenseStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyOnDemaondDefenseStatusRequest self = new ModifyOnDemaondDefenseStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyOnDemaondDefenseStatusRequest setDefenseStatus(String defenseStatus) {
        this.defenseStatus = defenseStatus;
        return this;
    }
    public String getDefenseStatus() {
        return this.defenseStatus;
    }

    public ModifyOnDemaondDefenseStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyOnDemaondDefenseStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
