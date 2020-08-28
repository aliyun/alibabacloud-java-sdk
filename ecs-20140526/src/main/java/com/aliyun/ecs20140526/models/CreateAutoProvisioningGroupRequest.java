// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateAutoProvisioningGroupRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("AutoProvisioningGroupName")
    public String autoProvisioningGroupName;

    @NameInMap("AutoProvisioningGroupType")
    public String autoProvisioningGroupType;

    @NameInMap("SpotAllocationStrategy")
    public String spotAllocationStrategy;

    @NameInMap("SpotInstanceInterruptionBehavior")
    public String spotInstanceInterruptionBehavior;

    @NameInMap("SpotInstancePoolsToUseCount")
    public Integer spotInstancePoolsToUseCount;

    @NameInMap("PayAsYouGoAllocationStrategy")
    public String payAsYouGoAllocationStrategy;

    @NameInMap("ExcessCapacityTerminationPolicy")
    public String excessCapacityTerminationPolicy;

    @NameInMap("ValidFrom")
    public String validFrom;

    @NameInMap("ValidUntil")
    public String validUntil;

    @NameInMap("TerminateInstancesWithExpiration")
    public Boolean terminateInstancesWithExpiration;

    @NameInMap("TerminateInstances")
    public Boolean terminateInstances;

    @NameInMap("MaxSpotPrice")
    public Double maxSpotPrice;

    @NameInMap("TotalTargetCapacity")
    @Validation(required = true)
    public String totalTargetCapacity;

    @NameInMap("PayAsYouGoTargetCapacity")
    public String payAsYouGoTargetCapacity;

    @NameInMap("SpotTargetCapacity")
    public String spotTargetCapacity;

    @NameInMap("DefaultTargetCapacityType")
    public String defaultTargetCapacityType;

    @NameInMap("LaunchTemplateId")
    @Validation(required = true)
    public String launchTemplateId;

    @NameInMap("LaunchTemplateVersion")
    public String launchTemplateVersion;

    @NameInMap("LaunchTemplateConfig")
    public java.util.List<CreateAutoProvisioningGroupRequestLaunchTemplateConfig> launchTemplateConfig;

    @NameInMap("Description")
    public String description;

    public static CreateAutoProvisioningGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoProvisioningGroupRequest self = new CreateAutoProvisioningGroupRequest();
        return TeaModel.build(map, self);
    }

    public static class CreateAutoProvisioningGroupRequestLaunchTemplateConfig extends TeaModel {
        @NameInMap("InstanceType")
        @Validation(required = true)
        public String instanceType;

        @NameInMap("MaxPrice")
        @Validation(required = true)
        public Double maxPrice;

        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String vSwitchId;

        @NameInMap("WeightedCapacity")
        @Validation(required = true)
        public Double weightedCapacity;

        @NameInMap("Priority")
        @Validation(required = true)
        public Integer priority;

        public static CreateAutoProvisioningGroupRequestLaunchTemplateConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupRequestLaunchTemplateConfig self = new CreateAutoProvisioningGroupRequestLaunchTemplateConfig();
            return TeaModel.build(map, self);
        }

    }

}
