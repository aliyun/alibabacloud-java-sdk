// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyEipAddressAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("AllocationId")
    @Validation(required = true)
    public String allocationId;

    @NameInMap("Bandwidth")
    @Validation(required = true)
    public String bandwidth;

    public static ModifyEipAddressAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyEipAddressAttributeRequest self = new ModifyEipAddressAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyEipAddressAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyEipAddressAttributeRequest setAllocationId(String allocationId) {
        this.allocationId = allocationId;
        return this;
    }
    public String getAllocationId() {
        return this.allocationId;
    }

    public ModifyEipAddressAttributeRequest setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public String getBandwidth() {
        return this.bandwidth;
    }

}
