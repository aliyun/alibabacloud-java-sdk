// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateAutoProvisioningGroupRequest extends TeaModel {
    @NameInMap("LaunchConfiguration")
    public CreateAutoProvisioningGroupRequestLaunchConfiguration launchConfiguration;

    /**
     * <p>The name of the auto provisioning group. The name must be 2 to 128 characters in length. It must start with a letter or a Chinese character and cannot start with <code>http://</code> or <code>https://</code>. It can contain digits, colons (:), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>apg-test</p>
     */
    @NameInMap("AutoProvisioningGroupName")
    public String autoProvisioningGroupName;

    /**
     * <p>The delivery type of the auto provisioning group. Valid values:</p>
     * <ul>
     * <li><p>request: one-time asynchronous delivery. The group delivers an instance cluster asynchronously only at startup. If scheduling fails, no retry is performed.</p>
     * </li>
     * <li><p>instant: one-time synchronous delivery. The group synchronously creates instances only at startup and returns the list of successfully created instances and the causes of creation failures in the response.</p>
     * </li>
     * <li><p>maintain: continuous delivery. The group attempts to deliver an instance cluster at startup and monitors real-time capacity. If the target capacity is not reached, the group continues to create ECS instances.</p>
     * </li>
     * </ul>
     * <p>Default value: maintain.</p>
     * 
     * <strong>example:</strong>
     * <p>maintain</p>
     */
    @NameInMap("AutoProvisioningGroupType")
    public String autoProvisioningGroupType;

    @NameInMap("CandidateOptions")
    public CreateAutoProvisioningGroupRequestCandidateOptions candidateOptions;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The list of data disk configurations.</p>
     */
    @NameInMap("DataDiskConfig")
    public java.util.List<CreateAutoProvisioningGroupRequestDataDiskConfig> dataDiskConfig;

    /**
     * <p>The billing method for the capacity difference when the sum of <code>PayAsYouGoTargetCapacity</code> and <code>SpotTargetCapacity</code> is less than <code>TotalTargetCapacity</code>. Valid values:</p>
     * <ul>
     * <li>PayAsYouGo: pay-as-you-go instances.</li>
     * <li>Spot: spot instances.</li>
     * </ul>
     * <p>Default value: Spot.</p>
     * 
     * <strong>example:</strong>
     * <p>Spot</p>
     */
    @NameInMap("DefaultTargetCapacityType")
    public String defaultTargetCapacityType;

    /**
     * <p>The description of the auto provisioning group.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to release instances when the real-time capacity of the auto provisioning group exceeds the target capacity and a scale-in event is triggered. Valid values:</p>
     * <ul>
     * <li>termination: releases the scaled-in instances.</li>
     * <li>no-termination: only removes the scaled-in instances from the auto provisioning group.</li>
     * </ul>
     * <p>Default value: no-termination.</p>
     * 
     * <strong>example:</strong>
     * <p>termination</p>
     */
    @NameInMap("ExcessCapacityTerminationPolicy")
    public String excessCapacityTerminationPolicy;

    @NameInMap("ExecutionMode")
    public String executionMode;

    /**
     * <blockquote>
     * <p>This parameter is in invitational preview and is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HibernationOptionsConfigured")
    public Boolean hibernationOptionsConfigured;

    /**
     * <p>The list of extended launch templates.</p>
     */
    @NameInMap("LaunchTemplateConfig")
    public java.util.List<CreateAutoProvisioningGroupRequestLaunchTemplateConfig> launchTemplateConfig;

    /**
     * <p>The ID of the instance launch template associated with the auto provisioning group. You can invoke <a href="https://help.aliyun.com/document_detail/73759.html">DescribeLaunchTemplates</a> to query active instance launch templates. If you specify both a launch template and launch configuration information (<code>LaunchConfiguration.*</code>), the launch template takes precedence.</p>
     * 
     * <strong>example:</strong>
     * <p>lt-bp1fgzds4bdogu03****</p>
     */
    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    /**
     * <p>The version of the instance launch template associated with the auto provisioning group. You can invoke <a href="https://help.aliyun.com/document_detail/73761.html">DescribeLaunchTemplateVersions</a> to query active instance launch template versions.</p>
     * <p>Default value: the default version of the launch template.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LaunchTemplateVersion")
    public String launchTemplateVersion;

    /**
     * <p>The maximum price for spot instances in the auto provisioning group.</p>
     * <blockquote>
     * <p>If both <code>MaxSpotPrice</code> and <code>LaunchTemplateConfig.N.MaxPrice</code> are specified, the lower value is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MaxSpotPrice")
    public Float maxSpotPrice;

    /**
     * <p>The minimum target capacity of the auto provisioning group. Valid values</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MinTargetCapacity")
    public String minTargetCapacity;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The policy for creating pay-as-you-go instances. Valid values:</p>
     * <ul>
     * <li><p>lowest-price: cost optimization policy. Selects the instance type with the lowest price.</p>
     * </li>
     * <li><p>prioritized: priority-based policy. Creates instances based on the priority specified by <code>LaunchTemplateConfig.N.Priority</code>.</p>
     * </li>
     * </ul>
     * <p>Default value: lowest-price.</p>
     * 
     * <strong>example:</strong>
     * <p>prioritized</p>
     */
    @NameInMap("PayAsYouGoAllocationStrategy")
    public String payAsYouGoAllocationStrategy;

    /**
     * <p>The target capacity of pay-as-you-go instances in the auto provisioning group. Valid values: less than or equal to the parameter value of <code>TotalTargetCapacity</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PayAsYouGoTargetCapacity")
    public String payAsYouGoTargetCapacity;

    /**
     * <p>The detailed capacity configuration for subscription instances.</p>
     */
    @NameInMap("PrePaidOptions")
    public CreateAutoProvisioningGroupRequestPrePaidOptions prePaidOptions;

    /**
     * <p>The ID of the region in which the auto provisioning group resides. You can invoke <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the auto provisioning group belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The resource pool policy used to create instances. After you set this parameter, note the following items:</p>
     * <ul>
     * <li>This parameter takes effect only when you create pay-as-you-go instances.</li>
     * <li>This parameter takes effect only when you create a one-time synchronization delivery auto provisioning group (<code>AutoProvisioningGroupType=instant</code>).</li>
     * </ul>
     */
    @NameInMap("ResourcePoolOptions")
    public CreateAutoProvisioningGroupRequestResourcePoolOptions resourcePoolOptions;

    /**
     * <p>The policy for creating spot instances. Valid values:</p>
     * <ul>
     * <li><p>lowest-price: cost optimization policy. Selects the instance type with the lowest price.</p>
     * </li>
     * <li><p>diversified: balanced zone distribution policy. Creates instances in the zones specified in the extended launch template and evenly distributes them across zones.</p>
     * </li>
     * <li><p>capacity-optimized: capacity optimization distribution policy. Selects the optimal instance type and zone based on inventory availability.</p>
     * </li>
     * </ul>
     * <p>Default value: lowest-price.</p>
     * 
     * <strong>example:</strong>
     * <p>diversified</p>
     */
    @NameInMap("SpotAllocationStrategy")
    public String spotAllocationStrategy;

    /**
     * <p>The action to take when a spot instance is interrupted. Valid values:</p>
     * <ul>
     * <li><p>stop: stops the instance.</p>
     * </li>
     * <li><p>terminate: releases the instance.</p>
     * </li>
     * </ul>
     * <p>Default value: terminate.</p>
     * 
     * <strong>example:</strong>
     * <p>terminate</p>
     */
    @NameInMap("SpotInstanceInterruptionBehavior")
    public String spotInstanceInterruptionBehavior;

    /**
     * <p>Takes effect when <code>SpotAllocationStrategy</code> is set to <code>lowest-price</code>. Specifies the number of instance types with the lowest prices from which the auto provisioning group creates instances.</p>
     * <p>Valid values: less than the value of N in <code>LaunchTemplateConfig.N</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SpotInstancePoolsToUseCount")
    public Integer spotInstancePoolsToUseCount;

    /**
     * <p>The target capacity of spot instances in the auto provisioning group. Valid values: less than or equal to the parameter value of <code>TotalTargetCapacity</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("SpotTargetCapacity")
    public String spotTargetCapacity;

    /**
     * <p>The list of system disk configurations.</p>
     */
    @NameInMap("SystemDiskConfig")
    public java.util.List<CreateAutoProvisioningGroupRequestSystemDiskConfig> systemDiskConfig;

    /**
     * <p>The tags to attach to the auto provisioning group.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateAutoProvisioningGroupRequestTag> tag;

    /**
     * <p>Specifies whether to release instances auto provisioning group when the auto-provisioning group is deleted. Valid values:</p>
     * <ul>
     * <li>true: releases instances auto provisioning group.</li>
     * <li>false: retains instances auto provisioning group.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TerminateInstances")
    public Boolean terminateInstances;

    /**
     * <p>Specifies whether to release instances auto provisioning group when the auto-provisioning group expires. Valid values:</p>
     * <ul>
     * <li>true: releases instances auto provisioning group.</li>
     * <li>false: only removes instances from the auto-provisioning group.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TerminateInstancesWithExpiration")
    public Boolean terminateInstancesWithExpiration;

    /**
     * <p>The total target capacity of the auto provisioning group. Valid values: positive integers.</p>
     * <p>The total capacity must be greater than or equal to the sum of <code>PayAsYouGoTargetCapacity</code> (the target capacity of pay-as-you-go instances) and <code>SpotTargetCapacity</code> (the target capacity of spot instances).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("TotalTargetCapacity")
    public String totalTargetCapacity;

    /**
     * <p>The time when the auto provisioning group is started. Used together with <code>ValidUntil</code> to determine the valid period.</p>
     * <p>Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.</p>
     * <p>Default value: the UNIX timestamp at which the request takes effect immediately.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-04-01T15:10:20Z</p>
     */
    @NameInMap("ValidFrom")
    public String validFrom;

    /**
     * <p>The time when the auto provisioning group expires. Used together with <code>ValidFrom</code> to determine the valid period.</p>
     * <p>Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.</p>
     * <p>Default value: 2099-12-31T23:59:59Z.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-06-01T15:10:20Z</p>
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

    public CreateAutoProvisioningGroupRequest setCandidateOptions(CreateAutoProvisioningGroupRequestCandidateOptions candidateOptions) {
        this.candidateOptions = candidateOptions;
        return this;
    }
    public CreateAutoProvisioningGroupRequestCandidateOptions getCandidateOptions() {
        return this.candidateOptions;
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

    public CreateAutoProvisioningGroupRequest setExecutionMode(String executionMode) {
        this.executionMode = executionMode;
        return this;
    }
    public String getExecutionMode() {
        return this.executionMode;
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

    public CreateAutoProvisioningGroupRequest setPrePaidOptions(CreateAutoProvisioningGroupRequestPrePaidOptions prePaidOptions) {
        this.prePaidOptions = prePaidOptions;
        return this;
    }
    public CreateAutoProvisioningGroupRequestPrePaidOptions getPrePaidOptions() {
        return this.prePaidOptions;
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

    public CreateAutoProvisioningGroupRequest setResourcePoolOptions(CreateAutoProvisioningGroupRequestResourcePoolOptions resourcePoolOptions) {
        this.resourcePoolOptions = resourcePoolOptions;
        return this;
    }
    public CreateAutoProvisioningGroupRequestResourcePoolOptions getResourcePoolOptions() {
        return this.resourcePoolOptions;
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

    public CreateAutoProvisioningGroupRequest setTag(java.util.List<CreateAutoProvisioningGroupRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateAutoProvisioningGroupRequestTag> getTag() {
        return this.tag;
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
         * <blockquote>
         * <p>This parameter is in invitational preview and is not available for use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123456789012****</p>
         */
        @NameInMap("AssumeRoleFor")
        public Long assumeRoleFor;

        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not available for use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>34458433936495****:alice</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not available for use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789012****:role/adminrole</p>
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
         * <p>The ID of the automatic snapshot policy applied to the data disk.</p>
         * <p>Note:</p>
         * <ul>
         * <li>This parameter takes effect only when you create a one-time synchronous delivery auto provisioning group (AutoProvisioningGroupType=instant).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sp-bp67acfmxazb4p****</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>Specifies whether to enable the performance burst feature. Valid values:</p>
         * <ul>
         * <li>true: enables the feature.</li>
         * <li>false: disables the feature.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is supported only when DiskCategory is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>The category of data disk N. Valid values of N: 1 to 16. Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: ultra disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>cloud_essd: enterprise SSD (ESSD).</li>
         * <li>cloud: basic disk.</li>
         * </ul>
         * <p>For I/O optimized instances, the default value is cloud_efficiency. For non-I/O optimized instances, the default value is cloud.</p>
         * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Specifies whether the data disk is released when the instance is released. Valid values:</p>
         * <ul>
         * <li>true: the data disk is released when the instance is released.</li>
         * <li>false: the data disk is not released when the instance is released.</li>
         * </ul>
         * <p>Default value: true.</p>
         * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        /**
         * <p>The description of the data disk. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>. If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>DataDisk_Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The mount point of the data disk. If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>/dev/vd1</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The name of the data disk. The name must be 2 to 128 characters in length. It must start with a letter or a Chinese character and cannot start with <code>http://</code> or <code>https://</code>. It can contain digits, periods (.), colons (:), underscores (_), and hyphens (-).</p>
         * <p>Default value: empty.</p>
         * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssdData</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("EncryptAlgorithm")
        public String encryptAlgorithm;

        /**
         * <p>Specifies whether data disk N is encrypted. Valid values:</p>
         * <ul>
         * <li>true: encrypted.</li>
         * <li>false: not encrypted.</li>
         * </ul>
         * <p>Default value: false.</p>
         * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public Boolean encrypted;

        /**
         * <p>The ID of the KMS key for the data disk. If both a launch template and launch configuration are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("KmsKeyId")
        public String kmsKeyId;

        /**
         * <p>The performance level of the enterprise SSD used as a data disk. The value of N must be consistent with the N in <code>LaunchConfiguration.DataDisk.N.Category</code>. Valid values:</p>
         * <ul>
         * <li>PL0: a single disk can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1 (default): a single disk can deliver up to 50,000 random read/write IOPS.</li>
         * <li>PL2: a single disk can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: a single disk can deliver up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <p>For information about how to select an ESSD performance level, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
         * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50,000, 1000 × capacity - baseline performance}.</p>
         * <p>Baseline performance = min{1,800 + 50 × capacity, 50,000}.</p>
         * <blockquote>
         * <p>This parameter is supported only when DiskCategory is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>40000</p>
         */
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        /**
         * <p>The size of data disk N. Valid values of N: 1 to 16. Unit: GiB. Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: 20 to 32768.</li>
         * <li>cloud_ssd: 20 to 32768.</li>
         * <li>cloud_essd: depends on the value of <code>LaunchConfiguration.DataDisk.N.PerformanceLevel</code>.<ul>
         * <li>PL0: 40 to 32768.</li>
         * <li>PL1: 20 to 32768.</li>
         * <li>PL2: 461 to 32768.</li>
         * <li>PL3: 1261 to 32768.</li>
         * </ul>
         * </li>
         * <li>cloud: 5 to 2000.</li>
         * </ul>
         * <blockquote>
         * <p>The value of this parameter must be greater than or equal to the size of the snapshot specified by <code>LaunchConfiguration.DataDisk.N.SnapshotId</code>.</p>
         * </blockquote>
         * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The ID of the snapshot used to create data disk N. Valid values of N: 1 to 16.</p>
         * <p>After you specify this parameter, the <code>LaunchConfiguration.DataDisk.N.Size</code> parameter is ignored. The actual size of the created disk is the size of the specified snapshot. Snapshots created on or before July 15, 2013 cannot be used. Requests that use such snapshots are rejected.</p>
         * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp17441ohwka0yuh****</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        public static CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk self = new CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
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

        public CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk setEncryptAlgorithm(String encryptAlgorithm) {
            this.encryptAlgorithm = encryptAlgorithm;
            return this;
        }
        public String getEncryptAlgorithm() {
            return this.encryptAlgorithm;
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

        public CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
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
         * <p>The ID of the automatic snapshot policy to apply to the system disk.</p>
         * <p>After you set this parameter, note the following items:</p>
         * <ul>
         * <li>This parameter takes effect only when you create a one-time synchronization delivery auto provisioning group (AutoProvisioningGroupType=instant).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sp-bp67acfmxazb4p****</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>Specifies whether to enable the performance burst feature. Valid values:</p>
         * <ul>
         * <li>true: enables the feature.</li>
         * <li>false: does not enable the feature.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is supported only when <code>SystemDisk.Category</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disk</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>The encryption algorithm for the system disk. Valid values:</p>
         * <ul>
         * <li>aes-256</li>
         * <li>sm4-128</li>
         * </ul>
         * <p>Default value: aes-256.</p>
         * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aes-256</p>
         */
        @NameInMap("EncryptAlgorithm")
        public String encryptAlgorithm;

        /**
         * <p>Specifies whether the system disk is encrypted. Valid values:</p>
         * <ul>
         * <li><p>true: encrypted.</p>
         * </li>
         * <li><p>false: not encrypted.</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * <p>If you specify both.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public String encrypted;

        /**
         * <p>The KMS key ID of the system disk.</p>
         * <p>When both a launch template and launch configuration information are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50,000, 1000 × Capacity - Baseline performance}.</p>
         * <p>Baseline performance = min{1,800 + 50 × Capacity, 50,000}.</p>
         * <blockquote>
         * <p>This parameter is supported only when SystemDisk.Category is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disk</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>40000</p>
         */
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        public static CreateAutoProvisioningGroupRequestLaunchConfigurationSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupRequestLaunchConfigurationSystemDisk self = new CreateAutoProvisioningGroupRequestLaunchConfigurationSystemDisk();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationSystemDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationSystemDisk setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
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

        public CreateAutoProvisioningGroupRequestLaunchConfigurationSystemDisk setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

    }

    public static class CreateAutoProvisioningGroupRequestLaunchConfigurationTag extends TeaModel {
        /**
         * <p>The tag key of the instance. Valid values of N: 1 to 20. The tag key cannot be an empty string. It can be up to 128 characters in length and cannot start with aliyun or acs:. It cannot contain <code>http://</code> or <code>https://</code>. If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the instance. Valid values of N: 1 to 20. The tag value can be an empty string. It can be up to 128 characters in length and cannot start with acs:. It cannot contain <code>http://</code> or <code>https://</code>. If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
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

    public static class CreateAutoProvisioningGroupRequestLaunchConfigurationCpuOptions extends TeaModel {
        /**
         * <p>The number of CPU cores.</p>
         * <p>Default value: see <a href="https://www.alibabacloud.com/help/en/ecs/user-guide/specify-and-view-cpu-options">Specify and view CPU options</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Core")
        public Integer core;

        /**
         * <p>The number of threads per CPU core. The number of vCPUs of the ECS instance = CpuOptions.Core value × CpuOptions.ThreadsPerCore value.</p>
         * <p>If CpuOptions.ThreadsPerCore is set to 1, CPU hyper-threading is disabled.</p>
         * <p>Only specific instance types support custom CPU thread counts.</p>
         * <p>For valid values and default values, see <a href="https://www.alibabacloud.com/help/en/ecs/user-guide/specify-and-view-cpu-options">Specify and view CPU options</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ThreadsPerCore")
        public Integer threadsPerCore;

        public static CreateAutoProvisioningGroupRequestLaunchConfigurationCpuOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupRequestLaunchConfigurationCpuOptions self = new CreateAutoProvisioningGroupRequestLaunchConfigurationCpuOptions();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationCpuOptions setCore(Integer core) {
            this.core = core;
            return this;
        }
        public Integer getCore() {
            return this.core;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationCpuOptions setThreadsPerCore(Integer threadsPerCore) {
            this.threadsPerCore = threadsPerCore;
            return this;
        }
        public Integer getThreadsPerCore() {
            return this.threadsPerCore;
        }

    }

    public static class CreateAutoProvisioningGroupRequestLaunchConfigurationImageOptions extends TeaModel {
        /**
         * <p>Specifies whether the instance that uses this image supports logon as the ecs-user user. Valid values:</p>
         * <ul>
         * <li>true: supported.</li>
         * <li>false: not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("LoginAsNonRoot")
        public Boolean loginAsNonRoot;

        public static CreateAutoProvisioningGroupRequestLaunchConfigurationImageOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupRequestLaunchConfigurationImageOptions self = new CreateAutoProvisioningGroupRequestLaunchConfigurationImageOptions();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationImageOptions setLoginAsNonRoot(Boolean loginAsNonRoot) {
            this.loginAsNonRoot = loginAsNonRoot;
            return this;
        }
        public Boolean getLoginAsNonRoot() {
            return this.loginAsNonRoot;
        }

    }

    public static class CreateAutoProvisioningGroupRequestLaunchConfigurationSchedulerOptions extends TeaModel {
        @NameInMap("DedicatedHostClusterId")
        public String dedicatedHostClusterId;

        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        public static CreateAutoProvisioningGroupRequestLaunchConfigurationSchedulerOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupRequestLaunchConfigurationSchedulerOptions self = new CreateAutoProvisioningGroupRequestLaunchConfigurationSchedulerOptions();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationSchedulerOptions setDedicatedHostClusterId(String dedicatedHostClusterId) {
            this.dedicatedHostClusterId = dedicatedHostClusterId;
            return this;
        }
        public String getDedicatedHostClusterId() {
            return this.dedicatedHostClusterId;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationSchedulerOptions setDedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

    }

    public static class CreateAutoProvisioningGroupRequestLaunchConfigurationSecurityOptions extends TeaModel {
        @NameInMap("TrustedSystemMode")
        public String trustedSystemMode;

        public static CreateAutoProvisioningGroupRequestLaunchConfigurationSecurityOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupRequestLaunchConfigurationSecurityOptions self = new CreateAutoProvisioningGroupRequestLaunchConfigurationSecurityOptions();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupRequestLaunchConfigurationSecurityOptions setTrustedSystemMode(String trustedSystemMode) {
            this.trustedSystemMode = trustedSystemMode;
            return this;
        }
        public String getTrustedSystemMode() {
            return this.trustedSystemMode;
        }

    }

    public static class CreateAutoProvisioningGroupRequestLaunchConfiguration extends TeaModel {
        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not available for use.</p>
         * </blockquote>
         */
        @NameInMap("Arn")
        public java.util.List<CreateAutoProvisioningGroupRequestLaunchConfigurationArn> arn;

        /**
         * <p>The automatic release time of the pay-as-you-go instance. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
         * <ul>
         * <li><p>If the value of seconds (<code>ss</code>) is not <code>00</code>, the time is automatically rounded down to the start of the current minute (<code>mm</code>).</p>
         * </li>
         * <li><p>The earliest release time is 30 minutes after the current time.</p>
         * </li>
         * <li><p>The latest release time cannot be more than three years from the current time.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2018-01-01T12:05:00Z</p>
         */
        @NameInMap("AutoReleaseTime")
        public String autoReleaseTime;

        /**
         * <p>The running mode of the burstable instance. Valid values:</p>
         * <ul>
         * <li>Standard: standard mode. For more information about instance performance, see the performance constrained mode section in <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
         * <li>Unlimited: unlimited mode. For more information about instance performance, see the unlimited mode section in <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
         * </ul>
         * <p>Default value: none.</p>
         * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("CreditSpecification")
        public String creditSpecification;

        /**
         * <p>The list of data disk configurations in the launch configuration.</p>
         */
        @NameInMap("DataDisk")
        public java.util.List<CreateAutoProvisioningGroupRequestLaunchConfigurationDataDisk> dataDisk;

        /**
         * <p>The ID of the deployment set.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-bp1frxuzdg87zh4p****</p>
         */
        @NameInMap("DeploymentSetId")
        public String deploymentSetId;

        /**
         * <p>The hostname of the instance. The following limits apply:</p>
         * <ul>
         * <li>Periods (.) and hyphens (-) cannot be used as the first or last characters and cannot be used consecutively.</li>
         * <li>Windows instances: The hostname must be 2 to 15 characters in length and cannot contain periods (.) or consist entirely of digits. It can contain letters, digits, and hyphens (-).</li>
         * <li>Instances of other types (such as Linux): The hostname must be 2 to 64 characters in length and can contain multiple periods (.). Each segment between periods can contain letters, digits, and hyphens (-).</li>
         * <li>You cannot specify both <code>LaunchConfiguration.HostName</code> and <code>LaunchConfiguration.HostNames.N</code>. Otherwise, an error is returned.</li>
         * <li>If you specify both a launch template and launch configuration information, the launch template takes precedence.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>k8s-node-[1,4]-ecshost</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The list of hostnames for one or more instances. The following limits apply:</p>
         * <ul>
         * <li>This parameter takes effect only when you create a one-time synchronous delivery auto provisioning group (<code>AutoProvisioningGroupType=instant</code>).</li>
         * <li>N indicates the number of instances. Valid values of N: 1 to 1000. The value must be consistent with the TotalTargetCapacity parameter.</li>
         * <li>Periods (.) and hyphens (-) cannot be used as the first or last characters and cannot be used consecutively.</li>
         * <li>If you specify both a launch template and launch configuration information, the launch template takes precedence.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ecs-host-01</p>
         */
        @NameInMap("HostNames")
        public java.util.List<String> hostNames;

        /**
         * <p>The name of the image family. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with <code>aliyun</code> or <code>acs:</code>. The name cannot contain <code>http://</code> or <code>https://</code>. The name can contain digits, colons (:), underscores (_), or hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>hangzhou-daily-update</p>
         */
        @NameInMap("ImageFamily")
        public String imageFamily;

        /**
         * <p>The ID of the image used to launch instances. You can call <a href="https://help.aliyun.com/document_detail/25534.html">DescribeImages</a> to query available image resources. If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>m-bp1g7004ksh0oeuc****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The description of the instance. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>. If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance_Description</p>
         */
        @NameInMap("InstanceDescription")
        public String instanceDescription;

        /**
         * <p>The name of the instance. The name must be 2 to 128 characters in length. It must start with a letter or a Chinese character and cannot start with <code>http://</code> or <code>https://</code>. It can contain Chinese characters, letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
         * <p>Default value: the <code>InstanceId</code> of the instance.</p>
         * <p>When you create multiple ECS instances, you can batch configure sequential instance names. For more information, see <a href="https://help.aliyun.com/document_detail/196048.html">Batch configure sequential names or hostnames for multiple instances</a>.</p>
         * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s-node-[1,4]-alibabacloud</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The billing method for network usage. Valid values:</p>
         * <ul>
         * <li>PayByBandwidth: pay-by-bandwidth.</li>
         * <li>PayByTraffic: pay-by-traffic.</li>
         * </ul>
         * <blockquote>
         * <p>In pay-by-traffic mode, the peak inbound and outbound bandwidths are used as upper limits of bandwidths instead of guaranteed performance metrics. When resources are contended, the peak bandwidths may be limited. If you require guaranteed bandwidth, use pay-by-bandwidth.</p>
         * </blockquote>
         * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>PayByTraffic</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>The maximum inbound public bandwidth. Unit: Mbit/s. Valid values:</p>
         * <ul>
         * <li>If the maximum outbound public bandwidth is less than or equal to 10 Mbit/s: 1 to 10. Default value: 10.</li>
         * <li>If the maximum outbound public bandwidth is greater than 10 Mbit/s: 1 to the value of <code>LaunchConfiguration.InternetMaxBandwidthOut</code>. Default value: the value of <code>LaunchConfiguration.InternetMaxBandwidthOut</code>.</li>
         * </ul>
         * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("InternetMaxBandwidthIn")
        public Integer internetMaxBandwidthIn;

        /**
         * <p>The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.</p>
         * <p>Default value: 0.</p>
         * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("InternetMaxBandwidthOut")
        public Integer internetMaxBandwidthOut;

        /**
         * <p>Specifies whether the instance is an I/O optimized instance. Valid values:</p>
         * <ul>
         * <li>none: non-I/O optimization.</li>
         * <li>optimized: I/O optimization.</li>
         * </ul>
         * <p>For retired instance types, the default value is none. For other instance types, the default value is optimized.</p>
         * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>optimized</p>
         */
        @NameInMap("IoOptimized")
        public String ioOptimized;

        /**
         * <p>The name of the key pair.</p>
         * <ul>
         * <li>For Windows instances, this parameter is ignored and is empty by default.</li>
         * <li>For Linux instances, password-based logon is disabled during initialization.</li>
         * </ul>
         * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>KeyPair_Name</p>
         */
        @NameInMap("KeyPairName")
        public String keyPairName;

        /**
         * <p>The password of the instance. The password must be 8 to 30 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The following special characters are supported:</p>
         * <p><code>()`~!@#$%^&amp;*-_+=|{}`[]`:;\\&quot;&lt;&gt;,.?/</code></p>
         * <p>For Windows instances, the password cannot start with a forward slash (/).</p>
         * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>EcsV587!</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>Specifies whether to use the password preset in the image. Valid values:</p>
         * <ul>
         * <li>true: uses the preset password.</li>
         * <li>false: does not use the preset password.</li>
         * </ul>
         * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PasswordInherit")
        public Boolean passwordInherit;

        /**
         * <p>The name of the instance RAM role. You can call the RAM API <a href="https://help.aliyun.com/document_detail/28713.html">ListRoles</a> to query the instance RAM roles that you have created. If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>RAM_Name</p>
         */
        @NameInMap("RamRoleName")
        public String ramRoleName;

        /**
         * <p>The ID of the resource group to which the instance belongs. If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4p****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Specifies whether to enable security hardening. Valid values:</p>
         * <ul>
         * <li>Active: enables security hardening. This value is applicable only to public images.</li>
         * <li>Deactive: disables security hardening. This value is applicable to all image types.</li>
         * </ul>
         * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("SecurityEnhancementStrategy")
        public String securityEnhancementStrategy;

        /**
         * <p>The ID of the security group to which the instance belongs. If both a launch template and launch configuration information are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp15ed6xe1yxeycg****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The list of security groups to which the instance belongs.</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>The system disk information of the instance. If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
         */
        @NameInMap("SystemDisk")
        public CreateAutoProvisioningGroupRequestLaunchConfigurationSystemDisk systemDisk;

        /**
         * <p>The category of the system disk. Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: ultra disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>cloud_essd: enterprise SSD (ESSD).</li>
         * <li>cloud: basic disk.</li>
         * </ul>
         * <p>For retired instance types that are non-I/O optimization instances, the default value is cloud. For other instance types, the default value is cloud_efficiency.</p>
         * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        /**
         * <p>The description of the system disk. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>SystemDisk_Description</p>
         */
        @NameInMap("SystemDiskDescription")
        public String systemDiskDescription;

        /**
         * <p>The name of the system disk. The name must be 2 to 128 characters in length. It must start with a letter or a Chinese character and cannot start with <code>http://</code> or <code>https://</code>. It can contain digits, periods (.), colons (:), underscores (_), and hyphens (-).</p>
         * <p>Default value: empty.</p>
         * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssdSystem</p>
         */
        @NameInMap("SystemDiskName")
        public String systemDiskName;

        /**
         * <p>The performance level (PL) of the enterprise SSD used as the system disk. Valid values:</p>
         * <ul>
         * <li>PL0 (default): a single disk can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1: a single disk can deliver up to 50,000 random read/write IOPS.</li>
         * <li>PL2: a single disk can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: a single disk can deliver up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <p>For information about how to select an ESSD performance level, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
         * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("SystemDiskPerformanceLevel")
        public String systemDiskPerformanceLevel;

        /**
         * <p>The size of the system disk. Unit: GiB. Valid values: 20 to 500. The value of this parameter must be greater than or equal to max{20, size of the image specified by LaunchConfiguration.ImageId}.</p>
         * <p>Default value: max{40, size of the image specified by LaunchConfiguration.ImageId}.</p>
         * <p>If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        /**
         * <p>The list of tags in the launch configuration.</p>
         */
        @NameInMap("Tag")
        public java.util.List<CreateAutoProvisioningGroupRequestLaunchConfigurationTag> tag;

        /**
         * <p>Instance user data of the instance. Instance user data must be Base64-encoded. The maximum size of the raw data is 32 KB. If you specify both a launch template and launch configuration information, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>ZWNobyBoZWxsbyBlY3Mh</p>
         */
        @NameInMap("UserData")
        public String userData;

        /**
         * <p>Specifies whether to enable auto-renewal. This parameter takes effect when you create subscription instances. Valid values:</p>
         * <ul>
         * <li>true: enables auto-renewal.</li>
         * <li>false (default): does not enable auto-renewal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        /**
         * <p>The auto-renewal period. Valid values: </p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li>If PeriodUnit is set to Week: 1, 2, and 3.</li>
         * <li>If PeriodUnit is set to Month: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;If PeriodUnit is set to Month: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AutoRenewPeriod")
        public Integer autoRenewPeriod;

        /**
         * <p>The CPU-related configurations.</p>
         */
        @NameInMap("CpuOptions")
        public CreateAutoProvisioningGroupRequestLaunchConfigurationCpuOptions cpuOptions;

        /**
         * <p>The image-related property information.</p>
         * <p>After you set this parameter, note the following items:</p>
         * <ul>
         * <li>This parameter takes effect only when you create a one-time synchronization delivery auto provisioning group (AutoProvisioningGroupType=instant).</li>
         * </ul>
         */
        @NameInMap("ImageOptions")
        public CreateAutoProvisioningGroupRequestLaunchConfigurationImageOptions imageOptions;

        /**
         * <p>The subscription duration of the resource. Unit: specified by <code>PeriodUnit</code>. This parameter is required when you create subscription instances. Valid values:</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li>If PeriodUnit is set to Week, valid values of Period: 1, 2, 3, and 4.</li>
         * <li>If PeriodUnit is set to Month, valid values of Period: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;If PeriodUnit is set to Month, valid values of Period: 1, 2, 3, 6, and 12.</p>
         * <p>&lt;props=&quot;partner&quot;&gt;If PeriodUnit is set to Month, valid values of Period: 1, 2, 3, 6, and 12.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The unit of the subscription billable methods duration. Valid values: </p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li>Week</li>
         * <li>Month (default)</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;Month (default).</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        @NameInMap("SchedulerOptions")
        public CreateAutoProvisioningGroupRequestLaunchConfigurationSchedulerOptions schedulerOptions;

        @NameInMap("SecurityOptions")
        public CreateAutoProvisioningGroupRequestLaunchConfigurationSecurityOptions securityOptions;

        /**
         * <p>The protection period of the spot instance. Unit: hours. Default value: 1. Valid values:</p>
         * <ul>
         * <li>1: After a spot instance is created, Alibaba Cloud ensures that the instance is not subject to automatic release within 1 hour. After the 1-hour protection period ends, the system compares the bid price with the marketplace price and checks the resource inventory to determine whether to retain or revoke the instance.</li>
         * <li>0: After a spot instance is created, Alibaba Cloud does not ensure that the instance runs for 1 hour. The system compares the bid price with the marketplace price and checks the resource inventory to determine whether to retain or revoke the instance.</li>
         * </ul>
         * <p>Alibaba Cloud sends an ECS system event notification 5 minutes before the instance is released. Spot instances are billed by second. Select an appropriate protection period based on the expected task execution duration.</p>
         * <p>After you set this parameter, note the following items:</p>
         * <ul>
         * <li>This parameter takes effect only when you create a one-time synchronization delivery auto provisioning group (AutoProvisioningGroupType=instant).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SpotDuration")
        public Integer spotDuration;

        /**
         * <p>The spot instance break mode. Valid values:</p>
         * <ul>
         * <li><p>Terminate: directly releases the instance.</p>
         * </li>
         * <li><p>Stop: puts the instance into economical mode.</p>
         * </li>
         * </ul>
         * <p>For more information about economical mode, see <a href="https://help.aliyun.com/document_detail/63353.html">Economical mode</a>.</p>
         * <p>Default value: Terminate.</p>
         * <p>After you set this parameter, note the following items:</p>
         * <ul>
         * <li>This parameter takes effect only when you create a one-time synchronization delivery auto provisioning group (AutoProvisioningGroupType=instant).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Terminate</p>
         */
        @NameInMap("SpotInterruptionBehavior")
        public String spotInterruptionBehavior;

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

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setImageFamily(String imageFamily) {
            this.imageFamily = imageFamily;
            return this;
        }
        public String getImageFamily() {
            return this.imageFamily;
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

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setAutoRenewPeriod(Integer autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public Integer getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setCpuOptions(CreateAutoProvisioningGroupRequestLaunchConfigurationCpuOptions cpuOptions) {
            this.cpuOptions = cpuOptions;
            return this;
        }
        public CreateAutoProvisioningGroupRequestLaunchConfigurationCpuOptions getCpuOptions() {
            return this.cpuOptions;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setImageOptions(CreateAutoProvisioningGroupRequestLaunchConfigurationImageOptions imageOptions) {
            this.imageOptions = imageOptions;
            return this;
        }
        public CreateAutoProvisioningGroupRequestLaunchConfigurationImageOptions getImageOptions() {
            return this.imageOptions;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setSchedulerOptions(CreateAutoProvisioningGroupRequestLaunchConfigurationSchedulerOptions schedulerOptions) {
            this.schedulerOptions = schedulerOptions;
            return this;
        }
        public CreateAutoProvisioningGroupRequestLaunchConfigurationSchedulerOptions getSchedulerOptions() {
            return this.schedulerOptions;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setSecurityOptions(CreateAutoProvisioningGroupRequestLaunchConfigurationSecurityOptions securityOptions) {
            this.securityOptions = securityOptions;
            return this;
        }
        public CreateAutoProvisioningGroupRequestLaunchConfigurationSecurityOptions getSecurityOptions() {
            return this.securityOptions;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setSpotDuration(Integer spotDuration) {
            this.spotDuration = spotDuration;
            return this;
        }
        public Integer getSpotDuration() {
            return this.spotDuration;
        }

        public CreateAutoProvisioningGroupRequestLaunchConfiguration setSpotInterruptionBehavior(String spotInterruptionBehavior) {
            this.spotInterruptionBehavior = spotInterruptionBehavior;
            return this;
        }
        public String getSpotInterruptionBehavior() {
            return this.spotInterruptionBehavior;
        }

    }

    public static class CreateAutoProvisioningGroupRequestCandidateOptions extends TeaModel {
        @NameInMap("Evaluate")
        public Boolean evaluate;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("TimeoutMinutes")
        public Integer timeoutMinutes;

        public static CreateAutoProvisioningGroupRequestCandidateOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupRequestCandidateOptions self = new CreateAutoProvisioningGroupRequestCandidateOptions();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupRequestCandidateOptions setEvaluate(Boolean evaluate) {
            this.evaluate = evaluate;
            return this;
        }
        public Boolean getEvaluate() {
            return this.evaluate;
        }

        public CreateAutoProvisioningGroupRequestCandidateOptions setTimeoutMinutes(Integer timeoutMinutes) {
            this.timeoutMinutes = timeoutMinutes;
            return this;
        }
        public Integer getTimeoutMinutes() {
            return this.timeoutMinutes;
        }

    }

    public static class CreateAutoProvisioningGroupRequestDataDiskConfig extends TeaModel {
        /**
         * <p>The category of the data disk. You can specify multiple candidate disk categories. The specified order determines the priority of each disk category. When a disk category is unavailable, the system automatically switches to the next category. Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: ultra disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>cloud_essd: enterprise SSD (ESSD).</li>
         * <li>cloud: basic disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
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
         * <p>The list of architecture types for instance types.</p>
         */
        @NameInMap("Architectures")
        public java.util.List<String> architectures;

        /**
         * <p>Specifies whether to include burstable instance types. Valid values:</p>
         * <ul>
         * <li>Exclude: excludes burstable instance types.</li>
         * <li>Include: includes burstable instance types.</li>
         * <li>Required: includes only burstable instance types.</li>
         * </ul>
         * <p>Default value: Include.</p>
         * 
         * <strong>example:</strong>
         * <p>Include</p>
         */
        @NameInMap("BurstablePerformance")
        public String burstablePerformance;

        /**
         * <p>The list of vCPU core counts for instance types.</p>
         */
        @NameInMap("Cores")
        public java.util.List<Integer> cores;

        /**
         * <p>The list of instance types to exclude.</p>
         */
        @NameInMap("ExcludedInstanceTypes")
        public java.util.List<String> excludedInstanceTypes;

        /**
         * <p>The image ID. You can use this parameter to set the image for the current resource pool. If not set, the image specified in <code>LaunchConfiguration.ImageId</code> or the launch template is used by default. You can call <a href="https://help.aliyun.com/document_detail/25534.html">DescribeImages</a> to query available image resources.
         * Note: This parameter is supported only when <code>AutoProvisioningGroupType = instant</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_3_x64_20G_alibase_20210425.vhd</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The level of the instance family, used to filter instance types that meet the requirements. Valid values:</p>
         * <ul>
         * <li>EntryLevel: entry level, which refers to shared instance types. Lower cost but no guarantee of stable computing performance. Suitable for scenarios with low average CPU utilization. For more information, see <a href="https://help.aliyun.com/document_detail/108489.html">Shared instance families</a>.</li>
         * <li>EnterpriseLevel: enterprise level. Stable performance with dedicated resources. Suitable for scenarios that require high stability. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</li>
         * <li>CreditEntryLevel: credit-based entry level, which refers to burstable instances. Uses CPU credits to ensure computing performance. Suitable for scenarios with low average CPU utilization and occasional bursts. For more information, see <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
         * </ul>
         * <p>Valid values of N: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>EnterpriseLevel</p>
         */
        @NameInMap("InstanceFamilyLevel")
        public String instanceFamilyLevel;

        /**
         * <p>The instance type in the extended launch template. Valid values of N: 1 to 20. For valid values, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g5.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The maximum price for spot instances in the extended launch template.</p>
         * <blockquote>
         * <p>After you set <code>LaunchTemplateConfig</code>, <code>LaunchTemplateConfig.N.MaxPrice</code> is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxPrice")
        public Double maxPrice;

        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not available for use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("MaxQuantity")
        public Integer maxQuantity;

        /**
         * <p>The list of memory sizes for instance types.</p>
         */
        @NameInMap("Memories")
        public java.util.List<Float> memories;

        /**
         * <p>The priority of the extended launch template. A value of 0 indicates the highest priority. Valid values: 0 to +∞.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The ID of the vSwitch to which the ECS instance in the extended launch template is connected. The zone of the ECS instance created from the extended template is determined by the vSwitch.</p>
         * <blockquote>
         * <p>If you specify LaunchTemplateConfig, LaunchTemplateConfig.N.VSwitchId is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-sn5bsitu4lfzgc5o7****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The weight of the instance type in the extended launch template. A higher value indicates that a single instance can meet more computing power requirements, which reduces the number of instances required. Valid values: greater than 0.</p>
         * <p>You can calculate the weight based on the computing power of the specified instance type and the minimum computing power of a single node in the cluster. For example, if the minimum computing power of a single node is 8 vCPUs and 60 GiB:</p>
         * <ul>
         * <li>The weight of an instance type with 8 vCPUs and 60 GiB can be set to 1.</li>
         * <li>The weight of an instance type with 16 vCPUs and 120 GiB can be set to 2.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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

        public CreateAutoProvisioningGroupRequestLaunchTemplateConfig setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
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

    public static class CreateAutoProvisioningGroupRequestPrePaidOptionsSpecifyCapacityDistribution extends TeaModel {
        /**
         * <p>The set of instance types. Duplicate values are not allowed, and the instance types must be within the range of LaunchTemplateConfig.InstanceType.</p>
         */
        @NameInMap("InstanceTypes")
        public java.util.List<String> instanceTypes;

        /**
         * <p>The minimum number of instances to deliver within the <code>InstanceTypes</code> range.</p>
         * <blockquote>
         * <p>The sum of all MinTargetCapacity values (<code>sum(MinTargetCapacity) &lt;= TotalTargetCapacity</code>) cannot exceed TotalTargetCapacity. If any instance type set cannot meet the MinTargetCapacity requirement due to insufficient inventory or other reasons, the entire request fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MinTargetCapacity")
        public Integer minTargetCapacity;

        public static CreateAutoProvisioningGroupRequestPrePaidOptionsSpecifyCapacityDistribution build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupRequestPrePaidOptionsSpecifyCapacityDistribution self = new CreateAutoProvisioningGroupRequestPrePaidOptionsSpecifyCapacityDistribution();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupRequestPrePaidOptionsSpecifyCapacityDistribution setInstanceTypes(java.util.List<String> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        public CreateAutoProvisioningGroupRequestPrePaidOptionsSpecifyCapacityDistribution setMinTargetCapacity(Integer minTargetCapacity) {
            this.minTargetCapacity = minTargetCapacity;
            return this;
        }
        public Integer getMinTargetCapacity() {
            return this.minTargetCapacity;
        }

    }

    public static class CreateAutoProvisioningGroupRequestPrePaidOptions extends TeaModel {
        /**
         * <p>The minimum capacity set for different instance types. This parameter is supported only when <code>AutoProvisioningGroupType = request</code>.</p>
         */
        @NameInMap("SpecifyCapacityDistribution")
        public java.util.List<CreateAutoProvisioningGroupRequestPrePaidOptionsSpecifyCapacityDistribution> specifyCapacityDistribution;

        public static CreateAutoProvisioningGroupRequestPrePaidOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupRequestPrePaidOptions self = new CreateAutoProvisioningGroupRequestPrePaidOptions();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupRequestPrePaidOptions setSpecifyCapacityDistribution(java.util.List<CreateAutoProvisioningGroupRequestPrePaidOptionsSpecifyCapacityDistribution> specifyCapacityDistribution) {
            this.specifyCapacityDistribution = specifyCapacityDistribution;
            return this;
        }
        public java.util.List<CreateAutoProvisioningGroupRequestPrePaidOptionsSpecifyCapacityDistribution> getSpecifyCapacityDistribution() {
            return this.specifyCapacityDistribution;
        }

    }

    public static class CreateAutoProvisioningGroupRequestResourcePoolOptions extends TeaModel {
        /**
         * <p>The list of private pool IDs. Valid values: 1 to 20.</p>
         */
        @NameInMap("PrivatePoolIds")
        public java.util.List<String> privatePoolIds;

        /**
         * <p>Resource pools include private pools generated after Elasticity Assurance or Capacity Reservation takes effect, and public pools for instance startup. Valid values:</p>
         * <ul>
         * <li><p>PrivatePoolFirst: private pool first. When you select this strategy and specify ResourcePoolOptions.PrivatePoolIds, the specified private pools are used first. If no private pools are specified or the specified private pools have insufficient capacity, open private pools are automatically matched. If no matching private pools are available, the public pool is used to create instances.</p>
         * </li>
         * <li><p>PrivatePoolOnly: private pool only. When you select this strategy, you must specify ResourcePoolOptions.PrivatePoolIds. If the specified private pools have insufficient capacity, the instance fails to start.</p>
         * </li>
         * <li><p>PublicPoolOnly: uses the public pool to create instances.</p>
         * </li>
         * </ul>
         * <p>Default value: PublicPoolOnly.</p>
         * 
         * <strong>example:</strong>
         * <p>PrivatePoolFirst</p>
         */
        @NameInMap("Strategy")
        public String strategy;

        public static CreateAutoProvisioningGroupRequestResourcePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupRequestResourcePoolOptions self = new CreateAutoProvisioningGroupRequestResourcePoolOptions();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupRequestResourcePoolOptions setPrivatePoolIds(java.util.List<String> privatePoolIds) {
            this.privatePoolIds = privatePoolIds;
            return this;
        }
        public java.util.List<String> getPrivatePoolIds() {
            return this.privatePoolIds;
        }

        public CreateAutoProvisioningGroupRequestResourcePoolOptions setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

    }

    public static class CreateAutoProvisioningGroupRequestSystemDiskConfig extends TeaModel {
        /**
         * <p>The category of the system disk. You can specify multiple candidate disk categories. The specified order determines the priority of each disk category. When a disk category is unavailable, the system automatically switches to the next category. Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: ultra disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>cloud_essd: enterprise SSD (ESSD).</li>
         * <li>cloud: basic disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
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

    public static class CreateAutoProvisioningGroupRequestTag extends TeaModel {
        /**
         * <p>The tag key of the auto provisioning group.</p>
         * <p>Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with aliyun or acs:. The tag key cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the auto provisioning group.</p>
         * <p>Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateAutoProvisioningGroupRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupRequestTag self = new CreateAutoProvisioningGroupRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAutoProvisioningGroupRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
