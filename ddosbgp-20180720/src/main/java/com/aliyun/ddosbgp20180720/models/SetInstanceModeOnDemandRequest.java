// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class SetInstanceModeOnDemandRequest extends TeaModel {
    /**
     * <p>The IDs of on-demand instances.</p>
     * <br>
     * <p>>  You can call the [DescribeOnDemandInstance](~~152120~~) operation to query the IDs of all on-demand instances.</p>
     */
    @NameInMap("InstanceIdList")
    public java.util.List<String> instanceIdList;

    /**
     * <p>The scheduling mode of the on-demand instance. Valid values:</p>
     * <br>
     * <p>*   **manual**: manual scheduling</p>
     * <p>*   **netflow-auto**: automatic scheduling</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The region ID of the on-demand instance.</p>
     * <br>
     * <p>>  You can call the [DescribeRegions](~~118703~~) operation to query all regions supported by Anti-DDoS Origin.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static SetInstanceModeOnDemandRequest build(java.util.Map<String, ?> map) throws Exception {
        SetInstanceModeOnDemandRequest self = new SetInstanceModeOnDemandRequest();
        return TeaModel.build(map, self);
    }

    public SetInstanceModeOnDemandRequest setInstanceIdList(java.util.List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }
    public java.util.List<String> getInstanceIdList() {
        return this.instanceIdList;
    }

    public SetInstanceModeOnDemandRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public SetInstanceModeOnDemandRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
