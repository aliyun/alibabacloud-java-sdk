// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAutoProvisioningGroupsResponseBody extends TeaModel {
    /**
     * <p>The details of the auto provisioning groups.</p>
     */
    @NameInMap("AutoProvisioningGroups")
    public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroups autoProvisioningGroups;

    /**
     * <p>The number of the page returned.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of queried auto provisioning groups.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAutoProvisioningGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoProvisioningGroupsResponseBody self = new DescribeAutoProvisioningGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAutoProvisioningGroupsResponseBody setAutoProvisioningGroups(DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroups autoProvisioningGroups) {
        this.autoProvisioningGroups = autoProvisioningGroups;
        return this;
    }
    public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroups getAutoProvisioningGroups() {
        return this.autoProvisioningGroups;
    }

    public DescribeAutoProvisioningGroupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAutoProvisioningGroupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAutoProvisioningGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAutoProvisioningGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigsLaunchTemplateConfig extends TeaModel {
        /**
         * <p>The instance type that is specified in the extended configuration.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The maximum price of the instance type specified in the extended configuration.</p>
         */
        @NameInMap("MaxPrice")
        public Float maxPrice;

        /**
         * <p>The priority of the instance type specified in the extended configuration. A value of 0 indicates the highest priority.</p>
         */
        @NameInMap("Priority")
        public Float priority;

        /**
         * <p>The ID of the vSwitch specified in the extended configuration.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The weight of the instance type specified in the extended configuration.</p>
         */
        @NameInMap("WeightedCapacity")
        public Float weightedCapacity;

        public static DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigsLaunchTemplateConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigsLaunchTemplateConfig self = new DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigsLaunchTemplateConfig();
            return TeaModel.build(map, self);
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigsLaunchTemplateConfig setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigsLaunchTemplateConfig setMaxPrice(Float maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }
        public Float getMaxPrice() {
            return this.maxPrice;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigsLaunchTemplateConfig setPriority(Float priority) {
            this.priority = priority;
            return this;
        }
        public Float getPriority() {
            return this.priority;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigsLaunchTemplateConfig setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigsLaunchTemplateConfig setWeightedCapacity(Float weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public Float getWeightedCapacity() {
            return this.weightedCapacity;
        }

    }

    public static class DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigs extends TeaModel {
        @NameInMap("LaunchTemplateConfig")
        public java.util.List<DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigsLaunchTemplateConfig> launchTemplateConfig;

        public static DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigs self = new DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigs setLaunchTemplateConfig(java.util.List<DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigsLaunchTemplateConfig> launchTemplateConfig) {
            this.launchTemplateConfig = launchTemplateConfig;
            return this;
        }
        public java.util.List<DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigsLaunchTemplateConfig> getLaunchTemplateConfig() {
            return this.launchTemplateConfig;
        }

    }

    public static class DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupPayAsYouGoOptions extends TeaModel {
        /**
         * <p>The policy for creating pay-as-you-go instances. Valid values:</p>
         * <br>
         * <p>*   lowest-price: cost optimization policy. This policy indicates that lowest-cost instance types are used to create instances.</p>
         * <p>*   prioritized: priority-based policy. This policy indicates that instances are created based on the priority specified by LaunchTemplateConfig.N.Priority.</p>
         * <br>
         * <p>>  The value of LaunchTemplateConfig.N.Priority is specified when the auto provisioning group is created, and the value cannot be modified.</p>
         */
        @NameInMap("AllocationStrategy")
        public String allocationStrategy;

        public static DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupPayAsYouGoOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupPayAsYouGoOptions self = new DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupPayAsYouGoOptions();
            return TeaModel.build(map, self);
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupPayAsYouGoOptions setAllocationStrategy(String allocationStrategy) {
            this.allocationStrategy = allocationStrategy;
            return this;
        }
        public String getAllocationStrategy() {
            return this.allocationStrategy;
        }

    }

    public static class DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupSpotOptions extends TeaModel {
        /**
         * <p>The provisioning policy for preemptible instances. Valid values:</p>
         * <br>
         * <p>*   lowest-price: cost optimization policy. This policy indicates that lowest-cost instance types are used to create instances.</p>
         * <p>*   diversified: balanced distribution policy. This policy indicates that instances are created evenly across multiple zones specified in the extended configuration.</p>
         */
        @NameInMap("AllocationStrategy")
        public String allocationStrategy;

        /**
         * <p>The action to be performed after the excess preemptible instances are stopped. Valid values:</p>
         * <br>
         * <p>*   stop: retains the excess preemptible instances in the stopped state.</p>
         * <p>*   terminate: releases the excess preemptible instances.</p>
         */
        @NameInMap("InstanceInterruptionBehavior")
        public String instanceInterruptionBehavior;

        /**
         * <p>The number of instances that the auto provisioning group creates by selecting the instance type of the lowest price.</p>
         * <br>
         * <p>>  This parameter is set when the auto provisioning group is created, and cannot be modified.</p>
         */
        @NameInMap("InstancePoolsToUseCount")
        public Integer instancePoolsToUseCount;

        public static DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupSpotOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupSpotOptions self = new DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupSpotOptions();
            return TeaModel.build(map, self);
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupSpotOptions setAllocationStrategy(String allocationStrategy) {
            this.allocationStrategy = allocationStrategy;
            return this;
        }
        public String getAllocationStrategy() {
            return this.allocationStrategy;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupSpotOptions setInstanceInterruptionBehavior(String instanceInterruptionBehavior) {
            this.instanceInterruptionBehavior = instanceInterruptionBehavior;
            return this;
        }
        public String getInstanceInterruptionBehavior() {
            return this.instanceInterruptionBehavior;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupSpotOptions setInstancePoolsToUseCount(Integer instancePoolsToUseCount) {
            this.instancePoolsToUseCount = instancePoolsToUseCount;
            return this;
        }
        public Integer getInstancePoolsToUseCount() {
            return this.instancePoolsToUseCount;
        }

    }

    public static class DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTagsTag extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTagsTag self = new DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTagsTag> tag;

        public static DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTags self = new DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTags();
            return TeaModel.build(map, self);
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTags setTag(java.util.List<DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTargetCapacitySpecification extends TeaModel {
        /**
         * <p>The type of supplemental instances. When the sum of the `PayAsYouGoTargetCapacity` and `SpotTargetCapacity` values is less than the `TotalTargetCapacity` value, the auto provisioning group creates instances of the specified billing method to meet the target capacity. Valid values:</p>
         * <br>
         * <p>*   PayAsYouGo: pay-as-you-go instances</p>
         * <p>*   Spot: preemptible instances</p>
         */
        @NameInMap("DefaultTargetCapacityType")
        public String defaultTargetCapacityType;

        /**
         * <p>The target capacity of pay-as-you-go instances in the auto provisioning group.</p>
         */
        @NameInMap("PayAsYouGoTargetCapacity")
        public Float payAsYouGoTargetCapacity;

        /**
         * <p>The target capacity of preemptible instances in the auto provisioning group.</p>
         */
        @NameInMap("SpotTargetCapacity")
        public Float spotTargetCapacity;

        /**
         * <p>The target capacity of the auto provisioning group. The capacity consists of the following parts:</p>
         * <br>
         * <p>*   PayAsYouGoTargetCapacity</p>
         * <p>*   SpotTargetCapacity</p>
         * <p>*   The supplemental capacity besides instance capacities specified by PayAsYouGoTargetCapacity and SpotTargetCapacity.</p>
         */
        @NameInMap("TotalTargetCapacity")
        public Float totalTargetCapacity;

        public static DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTargetCapacitySpecification build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTargetCapacitySpecification self = new DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTargetCapacitySpecification();
            return TeaModel.build(map, self);
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTargetCapacitySpecification setDefaultTargetCapacityType(String defaultTargetCapacityType) {
            this.defaultTargetCapacityType = defaultTargetCapacityType;
            return this;
        }
        public String getDefaultTargetCapacityType() {
            return this.defaultTargetCapacityType;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTargetCapacitySpecification setPayAsYouGoTargetCapacity(Float payAsYouGoTargetCapacity) {
            this.payAsYouGoTargetCapacity = payAsYouGoTargetCapacity;
            return this;
        }
        public Float getPayAsYouGoTargetCapacity() {
            return this.payAsYouGoTargetCapacity;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTargetCapacitySpecification setSpotTargetCapacity(Float spotTargetCapacity) {
            this.spotTargetCapacity = spotTargetCapacity;
            return this;
        }
        public Float getSpotTargetCapacity() {
            return this.spotTargetCapacity;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTargetCapacitySpecification setTotalTargetCapacity(Float totalTargetCapacity) {
            this.totalTargetCapacity = totalTargetCapacity;
            return this;
        }
        public Float getTotalTargetCapacity() {
            return this.totalTargetCapacity;
        }

    }

    public static class DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup extends TeaModel {
        /**
         * <p>The ID of the auto provisioning group.</p>
         */
        @NameInMap("AutoProvisioningGroupId")
        public String autoProvisioningGroupId;

        /**
         * <p>The name of the auto provisioning group.</p>
         */
        @NameInMap("AutoProvisioningGroupName")
        public String autoProvisioningGroupName;

        /**
         * <p>The delivery type of the auto provisioning group. Valid values:</p>
         * <br>
         * <p>*   request: one-time delivery. When the auto provisioning group is started, it delivers instances only once. If the instances fail to be delivered, the auto provisioning group does not retry the delivery.</p>
         * <p>*   maintain: continuous delivery. When the auto provisioning group is started, it attempts to deliver instances that meet the target capacity and monitors the real-time capacity. If the target capacity of the auto provisioning group is not reached, the auto provisioning group continues to create instances until the target capacity is reached.</p>
         */
        @NameInMap("AutoProvisioningGroupType")
        public String autoProvisioningGroupType;

        /**
         * <p>The time when the auto provisioning group was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>Indicates whether to release the scaled-in instances when the real-time capacity exceeds the target capacity and the group scales in. Valid values:</p>
         * <br>
         * <p>*   termination: releases the scaled-in instances.</p>
         * <p>*   no-termination: only removes the scaled-in instances from the auto provisioning group but does not release the instances.</p>
         */
        @NameInMap("ExcessCapacityTerminationPolicy")
        public String excessCapacityTerminationPolicy;

        /**
         * <p>The details of the extended configurations.</p>
         */
        @NameInMap("LaunchTemplateConfigs")
        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigs launchTemplateConfigs;

        /**
         * <p>The ID of the launch template associated with the auto provisioning group.</p>
         */
        @NameInMap("LaunchTemplateId")
        public String launchTemplateId;

        /**
         * <p>The version of the launch template associated with the auto provisioning group.</p>
         */
        @NameInMap("LaunchTemplateVersion")
        public String launchTemplateVersion;

        /**
         * <p>The maximum price for preemptible instances in the auto provisioning group.</p>
         * <br>
         * <p>>  When both MaxSpotPrice and LaunchTemplateConfig.N.MaxPrice are specified, the smaller one of the two parameter values is used.</p>
         * <br>
         * <p>The value of LaunchTemplateConfig.N.MaxPrice is specified when the auto provisioning group is created, and the value cannot be modified.</p>
         */
        @NameInMap("MaxSpotPrice")
        public Float maxSpotPrice;

        /**
         * <p>The policies related to pay-as-you-go instances.</p>
         */
        @NameInMap("PayAsYouGoOptions")
        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupPayAsYouGoOptions payAsYouGoOptions;

        /**
         * <p>The region ID of the auto provisioning group.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the auto provisioning group belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The policy related to preemptible instances.</p>
         */
        @NameInMap("SpotOptions")
        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupSpotOptions spotOptions;

        /**
         * <p>The overall state of instance scheduling in the auto provisioning group. Valid values:</p>
         * <br>
         * <p>*   fulfilled: Scheduling was complete and the instances were delivered.</p>
         * <p>*   pending-fulfillment: The instances were being created.</p>
         * <p>*   pending-termination: The instances were being removed.</p>
         * <p>*   error: An exception occurred during scheduling and the instances were not delivered.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The state of the auto provisioning group. Valid values:</p>
         * <br>
         * <p>*   submitted: The auto provisioning group was created but did not execute scheduling tasks.</p>
         * <p>*   active: The auto provisioning group was executing scheduling tasks.</p>
         * <p>*   deleted: The auto provisioning group was deleted.</p>
         * <p>*   delete-running: The auto provisioning group was being deleted.</p>
         * <p>*   modifying: The auto provisioning group was being modified.</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTags tags;

        /**
         * <p>The settings of the target capacity of the auto provisioning group.</p>
         */
        @NameInMap("TargetCapacitySpecification")
        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTargetCapacitySpecification targetCapacitySpecification;

        /**
         * <p>Indicates whether the instances in the auto provisioning group are released when the auto provisioning group is deleted. Valid values:</p>
         * <br>
         * <p>*   true: releases the instances.</p>
         * <p>*   false: retains the instances.</p>
         */
        @NameInMap("TerminateInstances")
        public Boolean terminateInstances;

        /**
         * <p>Indicates whether to release instances in the auto provisioning group when the group expires. Valid values:</p>
         * <br>
         * <p>*   true: releases the instances.</p>
         * <p>*   false: only removes the instances from the auto provisioning group but does not release the instances.</p>
         */
        @NameInMap("TerminateInstancesWithExpiration")
        public Boolean terminateInstancesWithExpiration;

        /**
         * <p>The time at which the auto provisioning group is started. The provisioning group is effective until the point in time specified by `ValidUntil`.</p>
         */
        @NameInMap("ValidFrom")
        public String validFrom;

        /**
         * <p>The time at which the auto provisioning group expires. The period of time between this point in time and the point in time specified by the `ValidFrom` parameter is the validity period of the auto provisioning group.</p>
         */
        @NameInMap("ValidUntil")
        public String validUntil;

        public static DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup self = new DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup();
            return TeaModel.build(map, self);
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setAutoProvisioningGroupId(String autoProvisioningGroupId) {
            this.autoProvisioningGroupId = autoProvisioningGroupId;
            return this;
        }
        public String getAutoProvisioningGroupId() {
            return this.autoProvisioningGroupId;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setAutoProvisioningGroupName(String autoProvisioningGroupName) {
            this.autoProvisioningGroupName = autoProvisioningGroupName;
            return this;
        }
        public String getAutoProvisioningGroupName() {
            return this.autoProvisioningGroupName;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setAutoProvisioningGroupType(String autoProvisioningGroupType) {
            this.autoProvisioningGroupType = autoProvisioningGroupType;
            return this;
        }
        public String getAutoProvisioningGroupType() {
            return this.autoProvisioningGroupType;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setExcessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
            this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
            return this;
        }
        public String getExcessCapacityTerminationPolicy() {
            return this.excessCapacityTerminationPolicy;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setLaunchTemplateConfigs(DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigs launchTemplateConfigs) {
            this.launchTemplateConfigs = launchTemplateConfigs;
            return this;
        }
        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigs getLaunchTemplateConfigs() {
            return this.launchTemplateConfigs;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setLaunchTemplateId(String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }
        public String getLaunchTemplateId() {
            return this.launchTemplateId;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setLaunchTemplateVersion(String launchTemplateVersion) {
            this.launchTemplateVersion = launchTemplateVersion;
            return this;
        }
        public String getLaunchTemplateVersion() {
            return this.launchTemplateVersion;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setMaxSpotPrice(Float maxSpotPrice) {
            this.maxSpotPrice = maxSpotPrice;
            return this;
        }
        public Float getMaxSpotPrice() {
            return this.maxSpotPrice;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setPayAsYouGoOptions(DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupPayAsYouGoOptions payAsYouGoOptions) {
            this.payAsYouGoOptions = payAsYouGoOptions;
            return this;
        }
        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupPayAsYouGoOptions getPayAsYouGoOptions() {
            return this.payAsYouGoOptions;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setSpotOptions(DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupSpotOptions spotOptions) {
            this.spotOptions = spotOptions;
            return this;
        }
        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupSpotOptions getSpotOptions() {
            return this.spotOptions;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setTags(DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTags getTags() {
            return this.tags;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setTargetCapacitySpecification(DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTargetCapacitySpecification targetCapacitySpecification) {
            this.targetCapacitySpecification = targetCapacitySpecification;
            return this;
        }
        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTargetCapacitySpecification getTargetCapacitySpecification() {
            return this.targetCapacitySpecification;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setTerminateInstances(Boolean terminateInstances) {
            this.terminateInstances = terminateInstances;
            return this;
        }
        public Boolean getTerminateInstances() {
            return this.terminateInstances;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setTerminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
            this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
            return this;
        }
        public Boolean getTerminateInstancesWithExpiration() {
            return this.terminateInstancesWithExpiration;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setValidFrom(String validFrom) {
            this.validFrom = validFrom;
            return this;
        }
        public String getValidFrom() {
            return this.validFrom;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setValidUntil(String validUntil) {
            this.validUntil = validUntil;
            return this;
        }
        public String getValidUntil() {
            return this.validUntil;
        }

    }

    public static class DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroups extends TeaModel {
        @NameInMap("AutoProvisioningGroup")
        public java.util.List<DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup> autoProvisioningGroup;

        public static DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroups self = new DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroups();
            return TeaModel.build(map, self);
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroups setAutoProvisioningGroup(java.util.List<DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup> autoProvisioningGroup) {
            this.autoProvisioningGroup = autoProvisioningGroup;
            return this;
        }
        public java.util.List<DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup> getAutoProvisioningGroup() {
            return this.autoProvisioningGroup;
        }

    }

}
