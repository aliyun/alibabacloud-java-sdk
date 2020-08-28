// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAutoProvisioningGroupsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("AutoProvisioningGroups")
    @Validation(required = true)
    public DescribeAutoProvisioningGroupsResponseAutoProvisioningGroups autoProvisioningGroups;

    public static DescribeAutoProvisioningGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoProvisioningGroupsResponse self = new DescribeAutoProvisioningGroupsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeAutoProvisioningGroupsResponseAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigsLaunchTemplateConfig extends TeaModel {
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
        public Double priority;

        public static DescribeAutoProvisioningGroupsResponseAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigsLaunchTemplateConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupsResponseAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigsLaunchTemplateConfig self = new DescribeAutoProvisioningGroupsResponseAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigsLaunchTemplateConfig();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAutoProvisioningGroupsResponseAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigs extends TeaModel {
        @NameInMap("LaunchTemplateConfig")
        @Validation(required = true)
        public java.util.List<DescribeAutoProvisioningGroupsResponseAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigsLaunchTemplateConfig> launchTemplateConfig;

        public static DescribeAutoProvisioningGroupsResponseAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupsResponseAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigs self = new DescribeAutoProvisioningGroupsResponseAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigs();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAutoProvisioningGroupsResponseAutoProvisioningGroupsAutoProvisioningGroupSpotOptions extends TeaModel {
        @NameInMap("AllocationStrategy")
        @Validation(required = true)
        public String allocationStrategy;

        @NameInMap("InstanceInterruptionBehavior")
        @Validation(required = true)
        public String instanceInterruptionBehavior;

        @NameInMap("InstancePoolsToUseCount")
        @Validation(required = true)
        public Integer instancePoolsToUseCount;

        public static DescribeAutoProvisioningGroupsResponseAutoProvisioningGroupsAutoProvisioningGroupSpotOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupsResponseAutoProvisioningGroupsAutoProvisioningGroupSpotOptions self = new DescribeAutoProvisioningGroupsResponseAutoProvisioningGroupsAutoProvisioningGroupSpotOptions();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAutoProvisioningGroupsResponseAutoProvisioningGroupsAutoProvisioningGroupPayAsYouGoOptions extends TeaModel {
        @NameInMap("AllocationStrategy")
        @Validation(required = true)
        public String allocationStrategy;

        public static DescribeAutoProvisioningGroupsResponseAutoProvisioningGroupsAutoProvisioningGroupPayAsYouGoOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupsResponseAutoProvisioningGroupsAutoProvisioningGroupPayAsYouGoOptions self = new DescribeAutoProvisioningGroupsResponseAutoProvisioningGroupsAutoProvisioningGroupPayAsYouGoOptions();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAutoProvisioningGroupsResponseAutoProvisioningGroupsAutoProvisioningGroupTargetCapacitySpecification extends TeaModel {
        @NameInMap("TotalTargetCapacity")
        @Validation(required = true)
        public Double totalTargetCapacity;

        @NameInMap("PayAsYouGoTargetCapacity")
        @Validation(required = true)
        public Double payAsYouGoTargetCapacity;

        @NameInMap("SpotTargetCapacity")
        @Validation(required = true)
        public Double spotTargetCapacity;

        @NameInMap("DefaultTargetCapacityType")
        @Validation(required = true)
        public String defaultTargetCapacityType;

        public static DescribeAutoProvisioningGroupsResponseAutoProvisioningGroupsAutoProvisioningGroupTargetCapacitySpecification build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupsResponseAutoProvisioningGroupsAutoProvisioningGroupTargetCapacitySpecification self = new DescribeAutoProvisioningGroupsResponseAutoProvisioningGroupsAutoProvisioningGroupTargetCapacitySpecification();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAutoProvisioningGroupsResponseAutoProvisioningGroupsAutoProvisioningGroup extends TeaModel {
        @NameInMap("AutoProvisioningGroupId")
        @Validation(required = true)
        public String autoProvisioningGroupId;

        @NameInMap("AutoProvisioningGroupName")
        @Validation(required = true)
        public String autoProvisioningGroupName;

        @NameInMap("AutoProvisioningGroupType")
        @Validation(required = true)
        public String autoProvisioningGroupType;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("State")
        @Validation(required = true)
        public String state;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ValidFrom")
        @Validation(required = true)
        public String validFrom;

        @NameInMap("ValidUntil")
        @Validation(required = true)
        public String validUntil;

        @NameInMap("ExcessCapacityTerminationPolicy")
        @Validation(required = true)
        public String excessCapacityTerminationPolicy;

        @NameInMap("MaxSpotPrice")
        @Validation(required = true)
        public Double maxSpotPrice;

        @NameInMap("LaunchTemplateId")
        @Validation(required = true)
        public String launchTemplateId;

        @NameInMap("LaunchTemplateVersion")
        @Validation(required = true)
        public String launchTemplateVersion;

        @NameInMap("TerminateInstances")
        @Validation(required = true)
        public Boolean terminateInstances;

        @NameInMap("TerminateInstancesWithExpiration")
        @Validation(required = true)
        public Boolean terminateInstancesWithExpiration;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("LaunchTemplateConfigs")
        @Validation(required = true)
        public DescribeAutoProvisioningGroupsResponseAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigs launchTemplateConfigs;

        @NameInMap("SpotOptions")
        @Validation(required = true)
        public DescribeAutoProvisioningGroupsResponseAutoProvisioningGroupsAutoProvisioningGroupSpotOptions spotOptions;

        @NameInMap("PayAsYouGoOptions")
        @Validation(required = true)
        public DescribeAutoProvisioningGroupsResponseAutoProvisioningGroupsAutoProvisioningGroupPayAsYouGoOptions payAsYouGoOptions;

        @NameInMap("TargetCapacitySpecification")
        @Validation(required = true)
        public DescribeAutoProvisioningGroupsResponseAutoProvisioningGroupsAutoProvisioningGroupTargetCapacitySpecification targetCapacitySpecification;

        public static DescribeAutoProvisioningGroupsResponseAutoProvisioningGroupsAutoProvisioningGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupsResponseAutoProvisioningGroupsAutoProvisioningGroup self = new DescribeAutoProvisioningGroupsResponseAutoProvisioningGroupsAutoProvisioningGroup();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAutoProvisioningGroupsResponseAutoProvisioningGroups extends TeaModel {
        @NameInMap("AutoProvisioningGroup")
        @Validation(required = true)
        public java.util.List<DescribeAutoProvisioningGroupsResponseAutoProvisioningGroupsAutoProvisioningGroup> autoProvisioningGroup;

        public static DescribeAutoProvisioningGroupsResponseAutoProvisioningGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupsResponseAutoProvisioningGroups self = new DescribeAutoProvisioningGroupsResponseAutoProvisioningGroups();
            return TeaModel.build(map, self);
        }

    }

}
