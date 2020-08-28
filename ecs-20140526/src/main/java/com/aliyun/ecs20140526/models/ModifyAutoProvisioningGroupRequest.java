// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyAutoProvisioningGroupRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("AutoProvisioningGroupId")
    public String autoProvisioningGroupId;

    @NameInMap("ExcessCapacityTerminationPolicy")
    public String excessCapacityTerminationPolicy;

    @NameInMap("DefaultTargetCapacityType")
    public String defaultTargetCapacityType;

    @NameInMap("TerminateInstancesWithExpiration")
    public Boolean terminateInstancesWithExpiration;

    @NameInMap("MaxSpotPrice")
    public Double maxSpotPrice;

    @NameInMap("TotalTargetCapacity")
    public String totalTargetCapacity;

    @NameInMap("PayAsYouGoTargetCapacity")
    public String payAsYouGoTargetCapacity;

    @NameInMap("SpotTargetCapacity")
    public String spotTargetCapacity;

    @NameInMap("AutoProvisioningGroupName")
    public String autoProvisioningGroupName;

    public static ModifyAutoProvisioningGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoProvisioningGroupRequest self = new ModifyAutoProvisioningGroupRequest();
        return TeaModel.build(map, self);
    }

}
