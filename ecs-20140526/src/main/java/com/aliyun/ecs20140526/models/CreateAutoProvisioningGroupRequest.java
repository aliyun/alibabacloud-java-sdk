// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateAutoProvisioningGroupRequest extends TeaModel {
    @NameInMap("LaunchConfiguration")
    public CreateAutoProvisioningGroupRequestLaunchConfiguration launchConfiguration;

    /**
     * <p>The name of the auto provisioning group. The name must be 2 to 128 characters in length, and can contain letters, digits, colons (:), underscores (\_), and hyphens (-). It must start with a letter but cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("AutoProvisioningGroupName")
    public String autoProvisioningGroupName;

    /**
     * <p>The delivery type of the auto provisioning group. Valid values:</p>
     * <br>
     * <p>*   request: one-time asynchronous delivery. The auto provisioning group attempts to asynchronously deliver an instance cluster that meets the target capacity only once when it is started. The group does not retry the operation regardless of whether all the instances are delivered.</p>
     * <p>*   instant: one-time synchronous delivery. The auto provisioning group attempts to synchronously deliver an instance cluster that meets the target capacity only once when it is started. The list of delivered instances and the causes of delivery failures are returned in the response.</p>
     * <p>*   maintain: continuous delivery. The auto provisioning group attempts to deliver an instance cluster that meets the target capacity, and monitors the real-time capacity when it is started. If the target capacity of the auto provisioning group is not reached, the auto provisioning group continues to create instances until the target capacity is reached.</p>
     * <br>
     * <p>Default value: maintain.</p>
     */
    @NameInMap("AutoProvisioningGroupType")
    public String autoProvisioningGroupType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but make sure that the value is unique among different requests. The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The information of data disks on the instance.</p>
     */
    @NameInMap("DataDiskConfig")
    public java.util.List<CreateAutoProvisioningGroupRequestDataDiskConfig> dataDiskConfig;

    /**
     * <p>The type of supplemental instances. If the sum of the values of the `PayAsYouGoTargetCapacity` and `SpotTargetCapacity` parameters is smaller than the value of the `TotalTargetCapacity` parameter, the auto provisioning group creates instances of the specified type to meet the capacity requirements. Valid values:</p>
     * <br>
     * <p>*   PayAsYouGo: pay-as-you-go instances</p>
     * <p>*   Spot: preemptible instances.</p>
     * <br>
     * <p>Default value: Spot.</p>
     */
    @NameInMap("DefaultTargetCapacityType")
    public String defaultTargetCapacityType;

    /**
     * <p>The description of the auto provisioning group.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to release the removed instances when the real-time capacity of the auto provisioning group exceeds the target capacity and a scale-in event is triggered. Valid values:</p>
     * <br>
     * <p>*   termination: releases the removed instances.</p>
     * <p>*   no-termination: only removes the instances from the auto provisioning group but does not release them.</p>
     * <br>
     * <p>Default value: no-termination.</p>
     */
    @NameInMap("ExcessCapacityTerminationPolicy")
    public String excessCapacityTerminationPolicy;

    /**
     * <p>> This parameter is in invitational preview and is unavailable for general users.</p>
     */
    @NameInMap("HibernationOptionsConfigured")
    public Boolean hibernationOptionsConfigured;

    /**
     * <p>The extended configurations of the launch template.</p>
     */
    @NameInMap("LaunchTemplateConfig")
    public java.util.List<CreateAutoProvisioningGroupRequestLaunchTemplateConfig> launchTemplateConfig;

    /**
     * <p>The ID of the launch template associated with the auto provisioning group. You can call the [DescribeLaunchTemplates](~~73759~~) operation to query available launch templates. If both the LaunchTemplateId and `LaunchConfiguration.*` parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
     */
    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    /**
     * <p>The version of the launch template associated with the auto provisioning group. You can call the [DescribeLaunchTemplateVersions](~~73761~~) operation to query the versions of available launch templates.</p>
     * <br>
     * <p>Default value: the default version of the launch template.</p>
     */
    @NameInMap("LaunchTemplateVersion")
    public String launchTemplateVersion;

    /**
     * <p>The maximum price of preemptible instances in the auto provisioning group.</p>
     * <br>
     * <p>> If the `MaxSpotPrice` and `LaunchTemplateConfig.N.MaxPrice` parameters are both specified, the lower price is used.</p>
     */
    @NameInMap("MaxSpotPrice")
    public Float maxSpotPrice;

    /**
     * <p>The minimum target capacity of the auto provisioning group. The value must be a positive integer.</p>
     * <br>
     * <p>When you specify this parameter, take note of the following items:</p>
     * <br>
     * <p>*   This parameter takes effect only when `AutoProvisioningGroupType` is set to instant.</p>
     * <p>*   If the number of instances that can be created in the current region is smaller than the value of this parameter, the operation cannot be called and no instances are created.</p>
     * <p>*   If the number of instances that can be created in the current region is greater than the value of this parameter, instances can be created based on the specified parameters.</p>
     */
    @NameInMap("MinTargetCapacity")
    public String minTargetCapacity;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The policy for creating pay-as-you-go instances. Valid values:</p>
     * <br>
     * <p>*   lowest-price: cost optimization policy. The auto provisioning group attempts to create instances of the lowest-priced instance type.</p>
     * <p>*   prioritized: priority-based policy. The auto provisioning group attempts to create instances based on the priority specified by the `LaunchTemplateConfig.N.Priority` parameter.</p>
     * <br>
     * <p>Default value: lowest-price.</p>
     */
    @NameInMap("PayAsYouGoAllocationStrategy")
    public String payAsYouGoAllocationStrategy;

    /**
     * <p>The target capacity of pay-as-you-go instances in the auto provisioning group. The value must be smaller than the `TotalTargetCapacity` value.</p>
     */
    @NameInMap("PayAsYouGoTargetCapacity")
    public String payAsYouGoTargetCapacity;

    /**
     * <p>The ID of the region in which to create the auto provisioning group. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which to assign the auto provisioning group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The policy for creating preemptible instances. Valid values:</p>
     * <br>
     * <p>*   lowest-price: cost optimization policy. The auto provisioning group attempts to create instances of the lowest-priced instance type.</p>
     * <p>*   diversified: balanced distribution policy. The auto provisioning group attempts to create instances in zones that are specified in extended configurations and then evenly distribute the instances across the zones.</p>
     * <p>*   capacity-optimized: capacity-optimized distribution policy. The auto provisioning group attempts to create instances that are of the optimal instance types across the optimal zones based on resource availability.</p>
     * <br>
     * <p>Default value: lowest-price.</p>
     */
    @NameInMap("SpotAllocationStrategy")
    public String spotAllocationStrategy;

    /**
     * <p>The operation to be performed on the preemptible instance when it is interrupted. Valid values:</p>
     * <br>
     * <p>*   stop: stops the preemptible instance.</p>
     * <p>*   terminate: releases the preemptible instance.</p>
     * <br>
     * <p>Default value: terminate.</p>
     */
    @NameInMap("SpotInstanceInterruptionBehavior")
    public String spotInstanceInterruptionBehavior;

    /**
     * <p>The number of preemptible instances of the lowest-priced instance type to be created by the auto provisioning group. This parameter takes effect when the `SpotAllocationStrategy` parameter is set to `lowest-price`.</p>
     * <br>
     * <p>The value of SpotInstancePoolsToUseCount must be smaller than the N value specified in `LaunchTemplateConfig.N.*` parameters.</p>
     */
    @NameInMap("SpotInstancePoolsToUseCount")
    public Integer spotInstancePoolsToUseCount;

    /**
     * <p>The target capacity of preemptible instances in the auto provisioning group. The value must be smaller than the `TotalTargetCapacity` value.</p>
     */
    @NameInMap("SpotTargetCapacity")
    public String spotTargetCapacity;

    /**
     * <p>The information of system disks on the instance.</p>
     */
    @NameInMap("SystemDiskConfig")
    public java.util.List<CreateAutoProvisioningGroupRequestSystemDiskConfig> systemDiskConfig;

    /**
     * <p>Specifies whether to release instances in the auto provisioning group after the auto provisioning group is deleted. Valid values:</p>
     * <br>
     * <p>*   true: releases instances in the auto provisioning group.</p>
     * <p>*   false: retains instances in the auto provisioning group.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("TerminateInstances")
    public Boolean terminateInstances;

    /**
     * <p>Specifies whether to release instances in the auto provisioning group after the auto provisioning group expires. Valid values:</p>
     * <br>
     * <p>*   true: releases instances in the auto provisioning group.</p>
     * <p>*   false: only removes instances from the auto provisioning group but does not release them.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("TerminateInstancesWithExpiration")
    public Boolean terminateInstancesWithExpiration;

    /**
     * <p>The total target capacity of the auto provisioning group. The value must be a positive integer.</p>
     * <br>
     * <p>The total target capacity of the auto provisioning group must be greater than or equal to the sum of the target capacity of pay-as-you-go instances specified by the `PayAsYouGoTargetCapacity` parameter and the target capacity of preemptible instances specified by the `SpotTargetCapacity` parameter.</p>
     */
    @NameInMap("TotalTargetCapacity")
    public String totalTargetCapacity;

    /**
     * <p>The time at which to start the auto provisioning group. The period of time between this point in time and the point in time specified by the `ValidUntil` parameter is the effective time period of the auto provisioning group.</p>
     * <br>
     * <p>Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>By default, an auto provisioning group is started immediately after it is created.</p>
     */
    @NameInMap("ValidFrom")
    public String validFrom;

    /**
     * <p>The expiration time of the auto provisioning group. The period of time between this point in time and the point in time specified by the `ValidFrom` parameter is the effective time period of the auto provisioning group.</p>
     * <br>
     * <p>Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>Default value: 2099-12-31T23:59:59Z.</p>
     */
    @NameInMap("ValidUntil")
    public String validUntil;

    public static CreateAutoProvisioningGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoProvisioningGroupRequest self = new CreateAutoProvisioningGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateAutoProvisioningGroupRequest setLaunchConfiguration(CreateAutoProvisioningGroupRequestLaunchConfiguration launchConfiguration) {
        this.launchConfiguration = launchConfiguration;
        return this;
    }
    public CreateAutoProvisioningGroupRequestLaunchConfiguration getLaunchConfiguration() {
        return this.launchConfiguration;
    }

    public CreateAutoProvisioningGroupRequest setAutoProvisioningGroupName(String autoProvisioningGroupName) {
        this.autoProvisioningGroupName = autoProvisioningGroupName;
        return this;
    }
    public String getAutoProvisioningGroupName() {
        return this.autoProvisioningGroupName;
    }

    public CreateAutoProvisioningGroupRequest setAutoProvisioningGroupType(String autoProvisioningGroupType) {
        this.autoProvisioningGroupType = autoProvisioningGroupType;
        return this;
    }
    public String getAutoProvisioningGroupType() {
        return this.autoProvisioningGroupType;
    }

    public CreateAutoProvisioningGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAutoProvisioningGroupRequest setDataDiskConfig(java.util.List<CreateAutoProvisioningGroupRequestDataDiskConfig> dataDiskConfig) {
        this.dataDiskConfig = dataDiskConfig;
        return this;
    }
    public java.util.List<CreateAutoProvisioningGroupRequestDataDiskConfig> getDataDiskConfig() {
        return this.dataDiskConfig;
    }

    public CreateAutoProvisioningGroupRequest setDefaultTargetCapacityType(String defaultTargetCapacityType) {
        this.defaultTargetCapacityType = defaultTargetCapacityType;
        return this;
    }
    public String getDefaultTargetCapacityType() {
        return this.defaultTargetCapacityType;
    }

    public CreateAutoProvisioningGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAutoProvisioningGroupRequest setExcessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
        return this;
    }
    public String getExcessCapacityTerminationPolicy() {
        return this.excessCapacityTerminationPolicy;
    }

    public CreateAutoProvisioningGroupRequest setHibernationOptionsConfigured(Boolean hibernationOptionsConfigured) {
        this.hibernationOptionsConfigured = hibernationOptionsConfigured;
        return this;
    }
    public Boolean getHibernationOptionsConfigured() {
        return this.hibernationOptionsConfigured;
    }

    public CreateAutoProvisioningGroupRequest setLaunchTemplateConfig(java.util.List<CreateAutoProvisioningGroupRequestLaunchTemplateConfig> launchTemplateConfig) {
        this.launchTemplateConfig = launchTemplateConfig;
        return this;
    }
    public java.util.List<CreateAutoProvisioningGroupRequestLaunchTemplateConfig> getLaunchTemplateConfig() {
        return this.launchTemplateConfig;
    }

    public CreateAutoProvisioningGroupRequest setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    public CreateAutoProvisioningGroupRequest setLaunchTemplateVersion(String launchTemplateVersion) {
        this.launchTemplateVersion = launchTemplateVersion;
        return this;
    }
    public String getLaunchTemplateVersion() {
        return this.launchTemplateVersion;
    }

    public CreateAutoProvisioningGroupRequest setMaxSpotPrice(Float maxSpotPrice) {
        this.maxSpotPrice = maxSpotPrice;
        return this;
    }
    public Float getMaxSpotPrice() {
        return this.maxSpotPrice;
    }

    public CreateAutoProvisioningGroupRequest setMinTargetCapacity(String minTargetCapacity) {
        this.minTargetCapacity = minTargetCapacity;
        return this;
    }
    public String getMinTargetCapacity() {
        return this.minTargetCapacity;
    }

    public CreateAutoProvisioningGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateAutoProvisioningGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateAutoProvisioningGroupRequest setPayAsYouGoAllocationStrategy(String payAsYouGoAllocationStrategy) {
        this.payAsYouGoAllocationStrategy = payAsYouGoAllocationStrategy;
        return this;
    }
    public String getPayAsYouGoAllocationStrategy() {
        return this.payAsYouGoAllocationStrategy;
    }

    public CreateAutoProvisioningGroupRequest setPayAsYouGoTargetCapacity(String payAsYouGoTargetCapacity) {
        this.payAsYouGoTargetCapacity = payAsYouGoTargetCapacity;
        return this;
    }
    public String getPayAsYouGoTargetCapacity() {
        return this.payAsYouGoTargetCapacity;
    }

    public CreateAutoProvisioningGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAutoProvisioningGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateAutoProvisioningGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateAutoProvisioningGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateAutoProvisioningGroupRequest setSpotAllocationStrategy(String spotAllocationStrategy) {
        this.spotAllocationStrategy = spotAllocationStrategy;
        return this;
    }
    public String getSpotAllocationStrategy() {
        return this.spotAllocationStrategy;
    }

    public CreateAutoProvisioningGroupRequest setSpotInstanceInterruptionBehavior(String spotInstanceInterruptionBehavior) {
        this.spotInstanceInterruptionBehavior = spotInstanceInterruptionBehavior;
        return this;
    }
    public String getSpotInstanceInterruptionBehavior() {
        return this.spotInstanceInterruptionBehavior;
    }

    public CreateAutoProvisioningGroupRequest setSpotInstancePoolsToUseCount(Integer spotInstancePoolsToUseCount) {
        this.spotInstancePoolsToUseCount = spotInstancePoolsToUseCount;
        return this;
    }
    public Integer getSpotInstancePoolsToUseCount() {
        return this.spotInstancePoolsToUseCount;
    }

    public CreateAutoProvisioningGroupRequest setSpotTargetCapacity(String spotTargetCapacity) {
        this.spotTargetCapacity = spotTargetCapacity;
        return this;
    }
    public String getSpotTargetCapacity() {
        return this.spotTargetCapacity;
    }

    public CreateAutoProvisioningGroupRequest setSystemDiskConfig(java.util.List<CreateAutoProvisioningGroupRequestSystemDiskConfig> systemDiskConfig) {
        this.systemDiskConfig = systemDiskConfig;
        return this;
    }
    public java.util.List<CreateAutoProvisioningGroupRequestSystemDiskConfig> getSystemDiskConfig() {
        return this.systemDiskConfig;
    }

    public CreateAutoProvisioningGroupRequest setTerminateInstances(Boolean terminateInstances) {
        this.terminateInstances = terminateInstances;
        return this;
    }
    public Boolean getTerminateInstances() {
        return this.terminateInstances;
    }

    public CreateAutoProvisioningGroupRequest setTerminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
        this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
        return this;
    }
    public Boolean getTerminateInstancesWithExpiration() {
        return this.terminateInstancesWithExpiration;
    }

    public CreateAutoProvisioningGroupRequest setTotalTargetCapacity(String totalTargetCapacity) {
        this.totalTargetCapacity = totalTargetCapacity;
        return this;
    }
    public String getTotalTargetCapacity() {
        return this.totalTargetCapacity;
    }

    public CreateAutoProvisioningGroupRequest setValidFrom(String validFrom) {
        this.validFrom = validFrom;
        return this;
    }
    public String getValidFrom() {
        return this.validFrom;
    }

    public CreateAutoProvisioningGroupRequest setValidUntil(String validUntil) {
        this.validUntil = validUntil;
        return this;
    }
    public String getValidUntil() {
        return this.validUntil;
    }

    public static class CreateAutoProvisioningGroupRequestLaunchConfigurationArn extends TeaModel {
        /**
         * <p>This parameter is unavailable for public use.</p>
         */
        @NameInMap("AssumeRoleFor")
        public Long assumeRoleFor;

        /**
         * <p>This parameter is unavailable for public use.</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        /**
         * <p>This parameter is unavailable for public use.</p>
         */
        @NameInMap("Rolearn")
        public String rolearn;

        public static CreateAutoProvisioningGroupRequestLaunchConfigurationArn build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupRequestLaunchConfigurationArn self = new CreateAutoProvisioningGroupRequestLaunchConfigurationArn();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationArn setAssumeRoleFor(Long assumeRoleFor) {
            this.assumeRoleFor = assumeRoleFor;
            return this;
        }
        public Long getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationArn setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationArn setRolearn(String rolearn) {
            this.rolearn = rolearn;
            return this;
        }
        public String getRolearn() {
            return this.rolearn;
        }

    }

    public static class CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk extends TeaModel {
        /**
         * <p>The category of data disk N. Valid values of N: 1 to 16. Valid values:</p>
         * <br>
         * <p>*   cloud_efficiency: ultra disk.</p>
         * <p>*   cloud_ssd: standard SSD.</p>
         * <p>*   cloud_essd: ESSD</p>
         * <p>*   cloud: basic disk.</p>
         * <br>
         * <p>For I/O optimized instances, the default value is cloud_efficiency. For non-I/O optimized instances, the default value is cloud.</p>
         * <br>
         * <p>If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Specifies whether to release the data disk after the instance with which the disk is associated is released. Valid values:</p>
         * <br>
         * <p>*   true: yes</p>
         * <p>*   false: no</p>
         * <br>
         * <p>Default value: true.</p>
         * <br>
         * <p>If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        /**
         * <p>The description of data disk N. The description must be 2 to 256 characters in length. The description can contain letters but cannot start with `http://` or `https://`. If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The mount target of the data disk. If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The name of the data disk. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), colons (:), underscores (\_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.</p>
         * <br>
         * <p>This parameter is empty by default.</p>
         * <br>
         * <p>If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>Specifies whether to encrypt data disk N. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>Default value: false.</p>
         * <br>
         * <p>If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("Encrypted")
        public Boolean encrypted;

        /**
         * <p>The ID of the Key Management Service (KMS) key to be used for the data disk. If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("KmsKeyId")
        public String kmsKeyId;

        /**
         * <p>The PL of the ESSD that is used as the data disk. The number of PLs that you specify must be the same as the value of N in the `LaunchConfiguration.DataDisk.N.Category` parameter. Default value: PL1. Valid values:</p>
         * <br>
         * <p>*   PL0: An ESSD can deliver up to 10,000 random read/write IOPS.</p>
         * <p>*   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</p>
         * <p>*   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</p>
         * <p>*   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</p>
         * <br>
         * <p>For more information about ESSD performance levels, see [ESSDs](~~122389~~).</p>
         * <br>
         * <p>If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The size of data disk N. Valid values of N: 1 to 16. Unit: GiB. Valid values:</p>
         * <br>
         * <p>*   Valid values when LaunchConfiguration.DataDisk.N.Category is set to cloud_efficiency: 20 to 32768.</p>
         * <br>
         * <p>*   Valid values when LaunchConfiguration.DataDisk.N.Category is set to cloud_ssd: 20 to 32768.</p>
         * <br>
         * <p>*   Valid values when LaunchConfiguration.DataDisk.N.Category is set to cloud_essd: depend on the `LaunchConfiguration.DataDisk.N.PerformanceLevel` value.</p>
         * <br>
         * <p>    *   Valid values when LaunchConfiguration.DataDisk.N.PerformanceLevel is set to PL0: 40 to 32768.</p>
         * <p>    *   Valid values when DataDisk.N.PerformanceLevel is set to PL1: 20 to 32768.</p>
         * <p>    *   Valid values when LaunchConfiguration.DataDisk.N.PerformanceLevel is set to PL2: 461 to 32768.</p>
         * <p>    *   Valid values when LaunchConfiguration.DataDisk.N.PerformanceLevel is set to PL3: 1261 to 32768.</p>
         * <br>
         * <p>*   Valid values when LaunchConfiguration.DataDisk.N.Category is set to cloud: 5 to 2000.</p>
         * <br>
         * <p>> The parameter value must be greater than or equal to the size of the snapshot specified by the `LaunchConfiguration.DataDisk.N.SnapshotId` parameter.</p>
         * <br>
         * <p>If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The ID of the snapshot that you want to use to create the data disk. Valid values of N: 1 to 16.</p>
         * <br>
         * <p>After this parameter is specified, the `LaunchConfiguration.DataDisk.N.Size` parameter is ignored. The size of the data disk is the same as that of the snapshot specified by this parameter. Use snapshots created after July 15, 2013. Otherwise, an error is returned and your request is rejected.</p>
         * <br>
         * <p>If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        public static CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk self = new CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk setKmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public String getKmsKeyId() {
            return this.kmsKeyId;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

    }

    public static class CreateAutoProvisioningGroupRequestLaunchConfigurationSystemDisk extends TeaModel {
        /**
         * <p>The algorithm to be used to encrypt data disks. Valid values:</p>
         * <br>
         * <p>*   aes-256</p>
         * <p>*   sm4-128</p>
         * <br>
         * <p>Default value: aes-256.</p>
         * <br>
         * <p>If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("EncryptAlgorithm")
        public String encryptAlgorithm;

        /**
         * <p>Specifies whether to encrypt system disk N. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>Default value: false.</p>
         * <br>
         * <p>If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("Encrypted")
        public String encrypted;

        /**
         * <p>The ID of the KMS key that you want to use for the system disk.</p>
         * <br>
         * <p>If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        public static CreateAutoProvisioningGroupRequestLaunchConfigurationSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupRequestLaunchConfigurationSystemDisk self = new CreateAutoProvisioningGroupRequestLaunchConfigurationSystemDisk();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationSystemDisk setEncryptAlgorithm(String encryptAlgorithm) {
            this.encryptAlgorithm = encryptAlgorithm;
            return this;
        }
        public String getEncryptAlgorithm() {
            return this.encryptAlgorithm;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationSystemDisk setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationSystemDisk setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

    }

    public static class CreateAutoProvisioningGroupRequestLaunchConfigurationTag extends TeaModel {
        /**
         * <p>The key of the tag. Valid values of N: 1 to 20. The tag key cannot be an empty string. It can be up to 128 characters in length and cannot start with acs: or aliyun. It cannot contain `http://` or `https://`. If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. Valid values of N: 1 to 20. The tag value can be an empty string. It can be up to 128 characters in length. It cannot start with acs: or contain `http://` or `https://`. If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateAutoProvisioningGroupRequestLaunchConfigurationTag build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupRequestLaunchConfigurationTag self = new CreateAutoProvisioningGroupRequestLaunchConfigurationTag();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateAutoProvisioningGroupRequestLaunchConfiguration extends TeaModel {
        /**
         * <p>This parameter is unavailable for public use.</p>
         */
        @NameInMap("Arn")
        public java.util.List<CreateAutoProvisioningGroupRequestLaunchConfigurationArn> arn;

        /**
         * <p>按量付费实例的自动释放时间。按照[ISO8601](~~25696~~)标准表示，使用UTC+0时间。格式为：`yyyy-MM-ddTHH:mm:ssZ`。</p>
         * <br>
         * <p>- 如果秒（`ss`）取值不是`00`，则自动取为当前分钟（`mm`）开始时。</p>
         * <br>
         * <p>- 最短释放时间为当前时间半小时之后。</p>
         * <br>
         * <p>- 最长释放时间不能超过当前时间三年。</p>
         */
        @NameInMap("AutoReleaseTime")
        public String autoReleaseTime;

        /**
         * <p>The performance mode of the burstable instance. Valid values:</p>
         * <br>
         * <p>*   Standard: the standard mode. For more information, see the "Standard mode" section in the [Burstable instances](~~59977~~) topic.</p>
         * <p>*   Unlimited: the unlimited mode. For more information, see the "Unlimited mode" section in [Burstable instances](~~59977~~).</p>
         * <br>
         * <p>This parameter is empty by default.</p>
         * <br>
         * <p>If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("CreditSpecification")
        public String creditSpecification;

        /**
         * <p>The cloud disks in the extended configurations of the launch template.</p>
         */
        @NameInMap("DataDisk")
        public java.util.List<CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk> dataDisk;

        /**
         * <p>The ID of the deployment set to which to deploy the instance.</p>
         */
        @NameInMap("DeploymentSetId")
        public String deploymentSetId;

        /**
         * <p>The hostname of the instance. Take note of the following items:</p>
         * <br>
         * <p>*   The hostname cannot start or end with a period (.) or hyphen (-). The hostname cannot contain consecutive periods (.) or hyphens (-).</p>
         * <p>*   For Windows instances, the hostname must be 2 to 15 characters in length and cannot contain periods (.) or contain only digits. It can contain letters, digits, and hyphens (-).</p>
         * <p>*   For instances that run other operating systems such as Linux, the hostname must be 2 to 64 characters in length. You can use periods (.) to separate a hostname into multiple segments. Each segment can contain letters, digits, and hyphens (-).</p>
         * <p>*   You cannot specify both the `LaunchConfiguration.HostName` and `LaunchConfiguration.HostNames.N` parameters. Otherwise, an error is returned.</p>
         * <p>*   If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The hostname of the instance. You can use this parameter to specify different hostnames for multiple instances. Take note of the following items:</p>
         * <br>
         * <p>*   This parameter takes effect only when `AutoProvisioningGroupType` is set to instant.</p>
         * <p>*   The value of N indicates the number of instances. Valid values: 1 to 1000. The value of N must be the same as the TotalTargetCapacity value.</p>
         * <p>*   The hostname cannot start or end with a period (.) or hyphen (-). It cannot contain consecutive periods (.) or hyphens (-).</p>
         * <p>*   For a Windows instance, the hostname must be 2 to 15 characters in length and cannot contain periods (.) or contain only digits. The hostname can contain letters, digits, and hyphens (-).</p>
         * <p>*   For instances that run other operating systems such as Linux, the hostname must be 2 to 64 characters in length. You can use periods (.) to separate the hostname into multiple segments. Each segment can contain letters, digits, and hyphens (-).</p>
         * <p>*   You cannot specify both the `LaunchConfiguration.HostName` and `LaunchConfiguration.HostNames.N` parameters. Otherwise, an error is returned.</p>
         * <p>*   If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("HostNames")
        public java.util.List<String> hostNames;

        /**
         * <p>The ID of the image that you want to use to create the instance. You can call the [DescribeImages](~~25534~~) operation to query available image resources. If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The description of the instance. The description must be 2 to 256 characters in length. The description can contain letters but cannot start with `http://` or `https://`. If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("InstanceDescription")
        public String instanceDescription;

        /**
         * <p>The name of the instance . The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-). The default value of this parameter is the `InstanceId` value.</p>
         * <br>
         * <p>When you batch create instances, you can batch configure sequential names for the instances. For more information, see [Batch configure sequential names or hostnames for multiple instances](~~196048~~).</p>
         * <br>
         * <p>If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The billing method for network usage. Valid values:</p>
         * <br>
         * <p>*   PayByBandwidth: pay-by-bandwidth</p>
         * <p>*   PayByTraffic: pay-by-traffic</p>
         * <br>
         * <p>> If the pay-by-traffic billing method for network usage is used, the maximum inbound and outbound bandwidths are used as the upper limits of bandwidths instead of guaranteed performance specifications. In scenarios where demand outstrips resource supplies, these maximum bandwidth values may not be reached. If you want guaranteed bandwidths for your instances, use the pay-by-bandwidth billing method for network usage.</p>
         * <br>
         * <p>If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>The maximum inbound public bandwidth. Unit: Mbit/s. Valid values:</p>
         * <br>
         * <p>*   When the purchased outbound public bandwidth is less than or equal to 10 Mbit/s, the valid values of this parameter are 1 to 10 and the default value is 10.</p>
         * <p>*   When the purchased outbound public bandwidth is greater than 10 Mbit/s, the valid values of this parameter are 1 to the value of `LaunchConfiguration.InternetMaxBandwidthOut`, and the default value is the value of `LaunchConfiguration.InternetMaxBandwidthOut`.</p>
         * <br>
         * <p>If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("InternetMaxBandwidthIn")
        public Integer internetMaxBandwidthIn;

        /**
         * <p>The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.</p>
         * <br>
         * <p>Default value: 0.</p>
         * <br>
         * <p>If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("InternetMaxBandwidthOut")
        public Integer internetMaxBandwidthOut;

        /**
         * <p>Specifies whether to create an I/O optimized instance. Valid values:</p>
         * <br>
         * <p>*   none: The instance is not I/O optimized.</p>
         * <p>*   optimized: The instance is I/O optimized.</p>
         * <br>
         * <p>For instances of retired instance types, the default value is none. For instances of other instance types, the default value is optimized.</p>
         * <br>
         * <p>If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("IoOptimized")
        public String ioOptimized;

        /**
         * <p>The name of the key pair to bind to the instance.</p>
         * <br>
         * <p>*   For Windows instances, this parameter is ignored. This parameter is empty by default.</p>
         * <p>*   By default, password-based logon is disabled for Linux instances.</p>
         * <br>
         * <p>If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("KeyPairName")
        public String keyPairName;

        /**
         * <p>The password of the instance. The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include:</p>
         * <br>
         * <p>``()`~!@#$%^&*-_+=|{}`[]`:;\"<>,.?/``</p>
         * <br>
         * <p>For Windows instances, the password cannot start with a forward slash (/).</p>
         * <br>
         * <p>If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>Specifies whether to use the preset password of the image. Valid values:</p>
         * <br>
         * <p>*   true: uses the preset password.</p>
         * <p>*   false: does not use the preset password.</p>
         * <br>
         * <p>If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("PasswordInherit")
        public Boolean passwordInherit;

        /**
         * <p>The name of the instance Resource Access Management (RAM) role. You can call the [ListRoles](~~28713~~) operation provided by RAM to query the instance RAM roles that you created. If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("RamRoleName")
        public String ramRoleName;

        /**
         * <p>The ID of the resource group to which to assign the instance. If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Indicates whether security hardening is enabled. Valid values:</p>
         * <br>
         * <p>*   Active: Security hardening is enabled. This value is applicable only to public images.</p>
         * <p>*   Deactive: Security hardening is disabled. This value is applicable to all image types.</p>
         * <br>
         * <p>If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("SecurityEnhancementStrategy")
        public String securityEnhancementStrategy;

        /**
         * <p>The ID of security group N to which to assign the instance. If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The IDs of the security groups to which the new ECS instances belong.</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>The information of the system disk on the instance. If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("SystemDisk")
        public CreateAutoProvisioningGroupRequestLaunchConfigurationSystemDisk systemDisk;

        /**
         * <p>The category of the system disk. Valid values:</p>
         * <br>
         * <p>*   cloud_efficiency: ultra disk.</p>
         * <p>*   cloud_ssd: standard SSD.</p>
         * <p>*   cloud_essd: enhanced SSD (ESSD)</p>
         * <p>*   cloud: basic disk.</p>
         * <br>
         * <p>For non-I/O optimized instances of retired instance types, the default value is cloud. For other instances, the default value is cloud_efficiency.</p>
         * <br>
         * <p>If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        /**
         * <p>The description of the system disk. The description must be 2 to 256 characters in length. The description can contain letters but cannot start with `http://` or `https://`.</p>
         * <br>
         * <p>If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("SystemDiskDescription")
        public String systemDiskDescription;

        /**
         * <p>The name of the system disk. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), colons (:), underscores (\_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.</p>
         * <br>
         * <p>This parameter is empty by default.</p>
         * <br>
         * <p>If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("SystemDiskName")
        public String systemDiskName;

        /**
         * <p>The performance level of the ESSD that you want to use as the system disk. Default value: PL0. Valid values:</p>
         * <br>
         * <p>*   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</p>
         * <p>*   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</p>
         * <p>*   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</p>
         * <p>*   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</p>
         * <br>
         * <p>For more information about ESSD performance levels, see [ESSDs](~~122389~~).</p>
         * <br>
         * <p>If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("SystemDiskPerformanceLevel")
        public String systemDiskPerformanceLevel;

        /**
         * <p>The size of the system disk. Valid values: 20 to 500. Unit: GiB. This parameter value must be at least 20 and greater than or equal to the size of the image specified by the LaunchConfiguration.ImageId parameter.</p>
         * <br>
         * <p>Default value: 40 or the size of the image specified by the LaunchConfiguration.ImageId parameter, whichever is greater.</p>
         * <br>
         * <p>If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        /**
         * <p>The tags in the extended configurations of the launch template.</p>
         */
        @NameInMap("Tag")
        public java.util.List<CreateAutoProvisioningGroupRequestLaunchConfigurationTag> tag;

        /**
         * <p>The user data of the instance. The user data must be encoded in Base64. The raw data can be up to 16 KB in size. If both the LaunchTemplateId and LaunchConfiguration.\* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static CreateAutoProvisioningGroupRequestLaunchConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupRequestLaunchConfiguration self = new CreateAutoProvisioningGroupRequestLaunchConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setArn(java.util.List<CreateAutoProvisioningGroupRequestLaunchConfigurationArn> arn) {
            this.arn = arn;
            return this;
        }
        public java.util.List<CreateAutoProvisioningGroupRequestLaunchConfigurationArn> getArn() {
            return this.arn;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setAutoReleaseTime(String autoReleaseTime) {
            this.autoReleaseTime = autoReleaseTime;
            return this;
        }
        public String getAutoReleaseTime() {
            return this.autoReleaseTime;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setCreditSpecification(String creditSpecification) {
            this.creditSpecification = creditSpecification;
            return this;
        }
        public String getCreditSpecification() {
            return this.creditSpecification;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setDataDisk(java.util.List<CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk> dataDisk) {
            this.dataDisk = dataDisk;
            return this;
        }
        public java.util.List<CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk> getDataDisk() {
            return this.dataDisk;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setDeploymentSetId(String deploymentSetId) {
            this.deploymentSetId = deploymentSetId;
            return this;
        }
        public String getDeploymentSetId() {
            return this.deploymentSetId;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setHostNames(java.util.List<String> hostNames) {
            this.hostNames = hostNames;
            return this;
        }
        public java.util.List<String> getHostNames() {
            return this.hostNames;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setInstanceDescription(String instanceDescription) {
            this.instanceDescription = instanceDescription;
            return this;
        }
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }
        public Integer getInternetMaxBandwidthIn() {
            return this.internetMaxBandwidthIn;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setIoOptimized(String ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public String getIoOptimized() {
            return this.ioOptimized;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setPasswordInherit(Boolean passwordInherit) {
            this.passwordInherit = passwordInherit;
            return this;
        }
        public Boolean getPasswordInherit() {
            return this.passwordInherit;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
            this.securityEnhancementStrategy = securityEnhancementStrategy;
            return this;
        }
        public String getSecurityEnhancementStrategy() {
            return this.securityEnhancementStrategy;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setSystemDisk(CreateAutoProvisioningGroupRequestLaunchConfigurationSystemDisk systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }
        public CreateAutoProvisioningGroupRequestLaunchConfigurationSystemDisk getSystemDisk() {
            return this.systemDisk;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setSystemDiskDescription(String systemDiskDescription) {
            this.systemDiskDescription = systemDiskDescription;
            return this;
        }
        public String getSystemDiskDescription() {
            return this.systemDiskDescription;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setSystemDiskName(String systemDiskName) {
            this.systemDiskName = systemDiskName;
            return this;
        }
        public String getSystemDiskName() {
            return this.systemDiskName;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
            this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
            return this;
        }
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setTag(java.util.List<CreateAutoProvisioningGroupRequestLaunchConfigurationTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<CreateAutoProvisioningGroupRequestLaunchConfigurationTag> getTag() {
            return this.tag;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class CreateAutoProvisioningGroupRequestDataDiskConfig extends TeaModel {
        /**
         * <p>The category of the data disk. You can specify multiple disk categories, and the disk categories are prioritized in the order in which they are specified. If a specified disk category is unavailable, the system uses the next available disk category. Valid values:</p>
         * <br>
         * <p>*   cloud_efficiency: ultra disk.</p>
         * <p>*   cloud_ssd: standard SSD.</p>
         * <p>*   cloud_essd: ESSD</p>
         * <p>*   cloud: basic disk.</p>
         */
        @NameInMap("DiskCategory")
        public String diskCategory;

        public static CreateAutoProvisioningGroupRequestDataDiskConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupRequestDataDiskConfig self = new CreateAutoProvisioningGroupRequestDataDiskConfig();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupRequestDataDiskConfig setDiskCategory(String diskCategory) {
            this.diskCategory = diskCategory;
            return this;
        }
        public String getDiskCategory() {
            return this.diskCategory;
        }

    }

    public static class CreateAutoProvisioningGroupRequestLaunchTemplateConfig extends TeaModel {
        /**
         * <p>The architectures of the instance types.</p>
         */
        @NameInMap("Architectures")
        public java.util.List<String> architectures;

        /**
         * <p>Specifies whether to include burstable instance types. Valid values:</p>
         * <br>
         * <p>*   Exclude: does not include burstable instance types.</p>
         * <p>*   Include: includes burstable instance types.</p>
         * <p>*   Required: includes only burstable instance types.</p>
         * <br>
         * <p>Default value: Include.</p>
         */
        @NameInMap("BurstablePerformance")
        public String burstablePerformance;

        /**
         * <p>The number of vCPU cores of the instance type.</p>
         */
        @NameInMap("Cores")
        public java.util.List<Integer> cores;

        /**
         * <p>The instance types that you want to exclude.</p>
         */
        @NameInMap("ExcludedInstanceTypes")
        public java.util.List<String> excludedInstanceTypes;

        /**
         * <p>The instance family level in the intelligent configuration mode. This parameter is used to filter the available instance types that meet the specified criteria. Valid values:</p>
         * <br>
         * <p>*   EntryLevel: shared instance type. Instances of this level are the most cost-effective but may not provide stable computing performance. Instances of this level are suitable for business scenarios in which the CPU utilization is low. For more information, see [Shared instance families](~~108489~~).</p>
         * <p>*   EnterpriseLevel: enterprise level. Instances of this level provide stable performance and dedicated resources, and are suitable for scenarios in which high stability is required. For more information, see [Overview of instance families](~~25378~~).</p>
         * <p>*   CreditEntryLevel: This value is available only for burstable instances. CPU credits are used to ensure computing performance. Instances of this level are suitable for scenarios in which the CPU utilization is low but may fluctuate in specific cases. For more information, see [What are burstable instances?](~~59977~~).</p>
         * <br>
         * <p>Valid values of N: 1 to 10.</p>
         */
        @NameInMap("InstanceFamilyLevel")
        public String instanceFamilyLevel;

        /**
         * <p>The instance type in extended configuration N. Valid values of N: 1 to 20. For more information about the valid values of this parameter, see [Instance families](~~25378~~).</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The maximum price of preemptible instances in extended configuration N.</p>
         * <br>
         * <p>**</p>
         * <br>
         * <p>**If you specify the **`LaunchTemplateConfig` parameter, you must also specify the `LaunchTemplateConfig.N.MaxPrice` parameter.</p>
         */
        @NameInMap("MaxPrice")
        public Double maxPrice;

        /**
         * <p>> This parameter is in invitational preview and is unavailable to general users.</p>
         */
        @NameInMap("MaxQuantity")
        public Integer maxQuantity;

        /**
         * <p>The memory sizes of the instance type.</p>
         */
        @NameInMap("Memories")
        public java.util.List<Float> memories;

        /**
         * <p>The priority of the extended configuration. A value of 0 indicates the highest priority. Valid values: 0 to ∞.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The ID of the vSwitch in extended configuration N. The zone of the ECS instances created from the extended configuration is determined by the vSwitch.</p>
         * <br>
         * <p>> If you specify the `LaunchTemplateConfig` parameter, you must also specify the `LaunchTemplateConfig.N.VSwitchId` parameter.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The weight of the instance type specified in the extended configuration. A greater weight indicates that a single instance has more computing power and fewer instances are required. The value must be greater than 0.</p>
         * <br>
         * <p>The weight is calculated based on the computing power of the instance type and the minimum computing power of a single instance in the cluster to be created by the auto provisioning group. For example, assume that the minimum computing power of a single instance is 8 vCPUs and 60 GiB of memory.</p>
         * <br>
         * <p>*   For an instance type with 8 vCPUs and 60 GiB of memory, you can set the weight to 1.</p>
         * <p>*   For an instance type with 16 vCPUs and 120 GiB of memory, you can set the weight to 2.</p>
         */
        @NameInMap("WeightedCapacity")
        public Double weightedCapacity;

        public static CreateAutoProvisioningGroupRequestLaunchTemplateConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupRequestLaunchTemplateConfig self = new CreateAutoProvisioningGroupRequestLaunchTemplateConfig();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupRequestLaunchTemplateConfig setArchitectures(java.util.List<String> architectures) {
            this.architectures = architectures;
            return this;
        }
        public java.util.List<String> getArchitectures() {
            return this.architectures;
        }

        public CreateAutoProvisioningGroupRequestLaunchTemplateConfig setBurstablePerformance(String burstablePerformance) {
            this.burstablePerformance = burstablePerformance;
            return this;
        }
        public String getBurstablePerformance() {
            return this.burstablePerformance;
        }

        public CreateAutoProvisioningGroupRequestLaunchTemplateConfig setCores(java.util.List<Integer> cores) {
            this.cores = cores;
            return this;
        }
        public java.util.List<Integer> getCores() {
            return this.cores;
        }

        public CreateAutoProvisioningGroupRequestLaunchTemplateConfig setExcludedInstanceTypes(java.util.List<String> excludedInstanceTypes) {
            this.excludedInstanceTypes = excludedInstanceTypes;
            return this;
        }
        public java.util.List<String> getExcludedInstanceTypes() {
            return this.excludedInstanceTypes;
        }

        public CreateAutoProvisioningGroupRequestLaunchTemplateConfig setInstanceFamilyLevel(String instanceFamilyLevel) {
            this.instanceFamilyLevel = instanceFamilyLevel;
            return this;
        }
        public String getInstanceFamilyLevel() {
            return this.instanceFamilyLevel;
        }

        public CreateAutoProvisioningGroupRequestLaunchTemplateConfig setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CreateAutoProvisioningGroupRequestLaunchTemplateConfig setMaxPrice(Double maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }
        public Double getMaxPrice() {
            return this.maxPrice;
        }

        public CreateAutoProvisioningGroupRequestLaunchTemplateConfig setMaxQuantity(Integer maxQuantity) {
            this.maxQuantity = maxQuantity;
            return this;
        }
        public Integer getMaxQuantity() {
            return this.maxQuantity;
        }

        public CreateAutoProvisioningGroupRequestLaunchTemplateConfig setMemories(java.util.List<Float> memories) {
            this.memories = memories;
            return this;
        }
        public java.util.List<Float> getMemories() {
            return this.memories;
        }

        public CreateAutoProvisioningGroupRequestLaunchTemplateConfig setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public CreateAutoProvisioningGroupRequestLaunchTemplateConfig setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateAutoProvisioningGroupRequestLaunchTemplateConfig setWeightedCapacity(Double weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public Double getWeightedCapacity() {
            return this.weightedCapacity;
        }

    }

    public static class CreateAutoProvisioningGroupRequestSystemDiskConfig extends TeaModel {
        /**
         * <p>The category of the system disk. You can specify multiple disk categories, and the disk categories are prioritized in the order in which they are specified. If a specified disk category is unavailable, the system uses the next available disk category. Valid values:</p>
         * <br>
         * <p>*   cloud_efficiency: ultra disk.</p>
         * <p>*   cloud_ssd: standard SSD.</p>
         * <p>*   cloud_essd: ESSD</p>
         * <p>*   cloud: basic disk.</p>
         */
        @NameInMap("DiskCategory")
        public String diskCategory;

        public static CreateAutoProvisioningGroupRequestSystemDiskConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupRequestSystemDiskConfig self = new CreateAutoProvisioningGroupRequestSystemDiskConfig();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupRequestSystemDiskConfig setDiskCategory(String diskCategory) {
            this.diskCategory = diskCategory;
            return this;
        }
        public String getDiskCategory() {
            return this.diskCategory;
        }

    }

}
