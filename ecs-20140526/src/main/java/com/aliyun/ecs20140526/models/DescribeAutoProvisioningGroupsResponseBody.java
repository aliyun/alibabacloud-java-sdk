// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAutoProvisioningGroupsResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("AutoProvisioningGroups")
    public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroups autoProvisioningGroups;

    public static DescribeAutoProvisioningGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoProvisioningGroupsResponseBody self = new DescribeAutoProvisioningGroupsResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeAutoProvisioningGroupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAutoProvisioningGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeAutoProvisioningGroupsResponseBody setAutoProvisioningGroups(DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroups autoProvisioningGroups) {
        this.autoProvisioningGroups = autoProvisioningGroups;
        return this;
    }
    public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroups getAutoProvisioningGroups() {
        return this.autoProvisioningGroups;
    }

    public static class DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigsLaunchTemplateConfig extends TeaModel {
        @NameInMap("MaxPrice")
        public Float maxPrice;

        @NameInMap("Priority")
        public Float priority;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("WeightedCapacity")
        public Float weightedCapacity;

        @NameInMap("InstanceType")
        public String instanceType;

        public static DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigsLaunchTemplateConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigsLaunchTemplateConfig self = new DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigsLaunchTemplateConfig();
            return TeaModel.build(map, self);
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

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigsLaunchTemplateConfig setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
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

    public static class DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupSpotOptions extends TeaModel {
        @NameInMap("InstancePoolsToUseCount")
        public Integer instancePoolsToUseCount;

        @NameInMap("AllocationStrategy")
        public String allocationStrategy;

        @NameInMap("InstanceInterruptionBehavior")
        public String instanceInterruptionBehavior;

        public static DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupSpotOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupSpotOptions self = new DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupSpotOptions();
            return TeaModel.build(map, self);
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupSpotOptions setInstancePoolsToUseCount(Integer instancePoolsToUseCount) {
            this.instancePoolsToUseCount = instancePoolsToUseCount;
            return this;
        }
        public Integer getInstancePoolsToUseCount() {
            return this.instancePoolsToUseCount;
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

    }

    public static class DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupPayAsYouGoOptions extends TeaModel {
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

    public static class DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTargetCapacitySpecification extends TeaModel {
        @NameInMap("SpotTargetCapacity")
        public Float spotTargetCapacity;

        @NameInMap("PayAsYouGoTargetCapacity")
        public Float payAsYouGoTargetCapacity;

        @NameInMap("DefaultTargetCapacityType")
        public String defaultTargetCapacityType;

        @NameInMap("TotalTargetCapacity")
        public Float totalTargetCapacity;

        public static DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTargetCapacitySpecification build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTargetCapacitySpecification self = new DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTargetCapacitySpecification();
            return TeaModel.build(map, self);
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTargetCapacitySpecification setSpotTargetCapacity(Float spotTargetCapacity) {
            this.spotTargetCapacity = spotTargetCapacity;
            return this;
        }
        public Float getSpotTargetCapacity() {
            return this.spotTargetCapacity;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTargetCapacitySpecification setPayAsYouGoTargetCapacity(Float payAsYouGoTargetCapacity) {
            this.payAsYouGoTargetCapacity = payAsYouGoTargetCapacity;
            return this;
        }
        public Float getPayAsYouGoTargetCapacity() {
            return this.payAsYouGoTargetCapacity;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTargetCapacitySpecification setDefaultTargetCapacityType(String defaultTargetCapacityType) {
            this.defaultTargetCapacityType = defaultTargetCapacityType;
            return this;
        }
        public String getDefaultTargetCapacityType() {
            return this.defaultTargetCapacityType;
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
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("AutoProvisioningGroupName")
        public String autoProvisioningGroupName;

        @NameInMap("Status")
        public String status;

        @NameInMap("TerminateInstances")
        public Boolean terminateInstances;

        @NameInMap("MaxSpotPrice")
        public Float maxSpotPrice;

        @NameInMap("State")
        public String state;

        @NameInMap("LaunchTemplateId")
        public String launchTemplateId;

        @NameInMap("ValidFrom")
        public String validFrom;

        @NameInMap("LaunchTemplateVersion")
        public String launchTemplateVersion;

        @NameInMap("TerminateInstancesWithExpiration")
        public Boolean terminateInstancesWithExpiration;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ValidUntil")
        public String validUntil;

        @NameInMap("AutoProvisioningGroupType")
        public String autoProvisioningGroupType;

        @NameInMap("AutoProvisioningGroupId")
        public String autoProvisioningGroupId;

        @NameInMap("ExcessCapacityTerminationPolicy")
        public String excessCapacityTerminationPolicy;

        @NameInMap("LaunchTemplateConfigs")
        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupLaunchTemplateConfigs launchTemplateConfigs;

        @NameInMap("SpotOptions")
        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupSpotOptions spotOptions;

        @NameInMap("PayAsYouGoOptions")
        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupPayAsYouGoOptions payAsYouGoOptions;

        @NameInMap("TargetCapacitySpecification")
        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTargetCapacitySpecification targetCapacitySpecification;

        public static DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup self = new DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup();
            return TeaModel.build(map, self);
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setAutoProvisioningGroupName(String autoProvisioningGroupName) {
            this.autoProvisioningGroupName = autoProvisioningGroupName;
            return this;
        }
        public String getAutoProvisioningGroupName() {
            return this.autoProvisioningGroupName;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setTerminateInstances(Boolean terminateInstances) {
            this.terminateInstances = terminateInstances;
            return this;
        }
        public Boolean getTerminateInstances() {
            return this.terminateInstances;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setMaxSpotPrice(Float maxSpotPrice) {
            this.maxSpotPrice = maxSpotPrice;
            return this;
        }
        public Float getMaxSpotPrice() {
            return this.maxSpotPrice;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setLaunchTemplateId(String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }
        public String getLaunchTemplateId() {
            return this.launchTemplateId;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setValidFrom(String validFrom) {
            this.validFrom = validFrom;
            return this;
        }
        public String getValidFrom() {
            return this.validFrom;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setLaunchTemplateVersion(String launchTemplateVersion) {
            this.launchTemplateVersion = launchTemplateVersion;
            return this;
        }
        public String getLaunchTemplateVersion() {
            return this.launchTemplateVersion;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setTerminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
            this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
            return this;
        }
        public Boolean getTerminateInstancesWithExpiration() {
            return this.terminateInstancesWithExpiration;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setValidUntil(String validUntil) {
            this.validUntil = validUntil;
            return this;
        }
        public String getValidUntil() {
            return this.validUntil;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setAutoProvisioningGroupType(String autoProvisioningGroupType) {
            this.autoProvisioningGroupType = autoProvisioningGroupType;
            return this;
        }
        public String getAutoProvisioningGroupType() {
            return this.autoProvisioningGroupType;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setAutoProvisioningGroupId(String autoProvisioningGroupId) {
            this.autoProvisioningGroupId = autoProvisioningGroupId;
            return this;
        }
        public String getAutoProvisioningGroupId() {
            return this.autoProvisioningGroupId;
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

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setSpotOptions(DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupSpotOptions spotOptions) {
            this.spotOptions = spotOptions;
            return this;
        }
        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupSpotOptions getSpotOptions() {
            return this.spotOptions;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setPayAsYouGoOptions(DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupPayAsYouGoOptions payAsYouGoOptions) {
            this.payAsYouGoOptions = payAsYouGoOptions;
            return this;
        }
        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupPayAsYouGoOptions getPayAsYouGoOptions() {
            return this.payAsYouGoOptions;
        }

        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroup setTargetCapacitySpecification(DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTargetCapacitySpecification targetCapacitySpecification) {
            this.targetCapacitySpecification = targetCapacitySpecification;
            return this;
        }
        public DescribeAutoProvisioningGroupsResponseBodyAutoProvisioningGroupsAutoProvisioningGroupTargetCapacitySpecification getTargetCapacitySpecification() {
            return this.targetCapacitySpecification;
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
