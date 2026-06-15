// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateAutoProvisioningGroupShrinkRequest extends TeaModel {
    @NameInMap("LaunchConfiguration")
    public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration launchConfiguration;

    /**
     * <p>The name of the auto provisioning group. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>apg-test</p>
     */
    @NameInMap("AutoProvisioningGroupName")
    public String autoProvisioningGroupName;

    /**
     * <p>The delivery type of the auto provisioning group. Valid values:</p>
     * <ul>
     * <li><p>request: One-time asynchronous delivery. The group delivers the instance cluster only at startup. If scheduling fails, no retry occurs.</p>
     * </li>
     * <li><p>instant: One-time synchronous delivery. The group creates instances synchronously at startup and returns the list of successfully created instances and reasons for failures in the response.</p>
     * </li>
     * <li><p>maintain: Continuous provisioning. The group attempts to deliver the instance cluster at startup and monitors real-time capacity. If the target capacity is not met, it continues creating ECS instances.</p>
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
    public CreateAutoProvisioningGroupShrinkRequestCandidateOptions candidateOptions;

    /**
     * <p>Ensures request idempotence. Generate a unique value from your client for this parameter to ensure uniqueness across different requests. ClientToken supports only ASCII characters and cannot exceed 64 characters. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The list of data disk configurations for instances.</p>
     */
    @NameInMap("DataDiskConfig")
    public java.util.List<CreateAutoProvisioningGroupShrinkRequestDataDiskConfig> dataDiskConfig;

    /**
     * <p>Specifies the billing method for the capacity difference when the sum of <code>PayAsYouGoTargetCapacity</code> and <code>SpotTargetCapacity</code> is less than <code>TotalTargetCapacity</code>. Valid values:</p>
     * <ul>
     * <li><p>PayAsYouGo: Pay-as-you-go instances.</p>
     * </li>
     * <li><p>Spot: Spot instances.</p>
     * </li>
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
     * <p>Specifies whether to release instances when the real-time capacity of the auto provisioning group exceeds the target capacity and scale-in is triggered. Valid values:</p>
     * <ul>
     * <li><p>termination: Releases scaled-in instances.</p>
     * </li>
     * <li><p>no-termination: Only removes scaled-in instances from the auto provisioning group.</p>
     * </li>
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
     * <p>This parameter is in invitational preview and is not yet available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HibernationOptionsConfigured")
    public Boolean hibernationOptionsConfigured;

    /**
     * <p>The list of extended launch template configurations.</p>
     */
    @NameInMap("LaunchTemplateConfig")
    public java.util.List<CreateAutoProvisioningGroupShrinkRequestLaunchTemplateConfig> launchTemplateConfig;

    /**
     * <p>The ID of the launch template associated with the auto provisioning group. Call <a href="https://help.aliyun.com/document_detail/73759.html">DescribeLaunchTemplates</a> to query available launch templates. When both a launch template and launch configuration parameters (<code>LaunchConfiguration.*</code>) are specified, the launch template takes precedence.</p>
     * 
     * <strong>example:</strong>
     * <p>lt-bp1fgzds4bdogu03****</p>
     */
    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    /**
     * <p>The version of the launch template associated with the auto provisioning group. Call <a href="https://help.aliyun.com/document_detail/73761.html">DescribeLaunchTemplateVersions</a> to query available launch template versions.</p>
     * <p>Default value: The default version of the launch template.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LaunchTemplateVersion")
    public String launchTemplateVersion;

    /**
     * <p>The maximum price for spot instances in the auto provisioning group.</p>
     * <blockquote>
     * <p>If both <code>MaxSpotPrice</code> and <code>LaunchTemplateConfig.N.MaxPrice</code> are set, the lower value takes effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MaxSpotPrice")
    public Float maxSpotPrice;

    /**
     * <p>The minimum target capacity of the auto provisioning group. Valid values: Positive integers.</p>
     * <p>Note:</p>
     * <ul>
     * <li><p>This parameter takes effect only when creating an auto provisioning group with <code>AutoProvisioningGroupType=instant</code>.</p>
     * </li>
     * <li><p>If the instance inventory in the region is less than this value, the API call fails and no instances are created.</p>
     * </li>
     * <li><p>If the instance inventory in the region is greater than this value, instances are created based on other configured parameters.</p>
     * </li>
     * </ul>
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
     * <p>The strategy for creating pay-as-you-go instances. Valid values:</p>
     * <ul>
     * <li><p>lowest-price: Cost optimization strategy. Selects the instance type with the lowest price.</p>
     * </li>
     * <li><p>prioritized: Priority-based strategy. Creates instances based on the priority specified in <code>LaunchTemplateConfig.N.Priority</code>.</p>
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
     * <p>The target capacity for pay-as-you-go instances in the auto provisioning group. Valid values: Integers less than or equal to the value of <code>TotalTargetCapacity</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PayAsYouGoTargetCapacity")
    public String payAsYouGoTargetCapacity;

    /**
     * <p>Detailed capacity configuration for subscription instances.</p>
     */
    @NameInMap("PrePaidOptions")
    public CreateAutoProvisioningGroupShrinkRequestPrePaidOptions prePaidOptions;

    /**
     * <p>The region ID of the auto provisioning group. Call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to view the latest Alibaba Cloud region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID of the auto provisioning group.</p>
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
     * <p>The resource pool strategy used when creating instances. Note:</p>
     * <ul>
     * <li><p>This parameter takes effect only when creating pay-as-you-go instances.</p>
     * </li>
     * <li><p>This parameter takes effect only when creating an auto provisioning group with <code>AutoProvisioningGroupType=instant</code>.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ResourcePoolOptions")
    public String resourcePoolOptionsShrink;

    /**
     * <p>The strategy for creating spot instances. Valid values:</p>
     * <ul>
     * <li><p>lowest-price: Cost optimization strategy. Selects the instance type with the lowest price.</p>
     * </li>
     * <li><p>diversified: Balanced zone distribution strategy. Creates instances across the zones specified in the launch template configurations and distributes them evenly.</p>
     * </li>
     * <li><p>capacity-optimized: Capacity optimization strategy. Selects the optimal instance type and zone based on inventory availability.</p>
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
     * <p>The behavior when a spot instance is interrupted. Valid values:</p>
     * <ul>
     * <li><p>stop: Stops the instance.</p>
     * </li>
     * <li><p>terminate: Releases the instance.</p>
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
     * <p>Takes effect only when <code>SpotAllocationStrategy</code> is set to <code>lowest-price</code>. Specifies the number of lowest-priced instance types from which the auto provisioning group creates instances.</p>
     * <p>Valid values: Less than the value of N in <code>LaunchTemplateConfig.N</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SpotInstancePoolsToUseCount")
    public Integer spotInstancePoolsToUseCount;

    /**
     * <p>The target capacity for spot instances in the auto provisioning group. Valid values: Integers less than or equal to the value of <code>TotalTargetCapacity</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("SpotTargetCapacity")
    public String spotTargetCapacity;

    /**
     * <p>The list of system disk configurations for instances.</p>
     */
    @NameInMap("SystemDiskConfig")
    public java.util.List<CreateAutoProvisioningGroupShrinkRequestSystemDiskConfig> systemDiskConfig;

    /**
     * <p>The list of tags bound to the auto provisioning group.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateAutoProvisioningGroupShrinkRequestTag> tag;

    /**
     * <p>Specifies whether to release instances in the group when you delete the auto provisioning group. Valid values:</p>
     * <ul>
     * <li><p>true: Releases instances in the group.</p>
     * </li>
     * <li><p>false: Retains instances in the group.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TerminateInstances")
    public Boolean terminateInstances;

    /**
     * <p>Specifies whether to release instances in the group when the auto provisioning group expires. Valid values:</p>
     * <ul>
     * <li><p>true: Releases instances in the group.</p>
     * </li>
     * <li><p>false: Only removes instances from the auto provisioning group.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TerminateInstancesWithExpiration")
    public Boolean terminateInstancesWithExpiration;

    /**
     * <p>The total target capacity of the auto provisioning group. Valid values: Positive integers.</p>
     * <p>The total capacity must be greater than or equal to the sum of <code>PayAsYouGoTargetCapacity</code> (target capacity for pay-as-you-go instances) and <code>SpotTargetCapacity</code> (target capacity for spot instances).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("TotalTargetCapacity")
    public String totalTargetCapacity;

    /**
     * <p>The start time of the auto provisioning group. Used together with <code>ValidUntil</code> to define the validity period.</p>
     * <p>Specify the time in <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> format using UTC+0 time. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
     * <p>Default value: The timestamp when the API call takes effect immediately.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-04-01T15:10:20Z</p>
     */
    @NameInMap("ValidFrom")
    public String validFrom;

    /**
     * <p>The expiration time of the auto provisioning group. Used together with <code>ValidFrom</code> to define the validity period.</p>
     * <p>Specify the time in <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> format using UTC+0 time. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
     * <p>Default value: 2099-12-31T23:59:59Z.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-06-01T15:10:20Z</p>
     */
    @NameInMap("ValidUntil")
    public String validUntil;

    public static CreateAutoProvisioningGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoProvisioningGroupShrinkRequest self = new CreateAutoProvisioningGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAutoProvisioningGroupShrinkRequest setLaunchConfiguration(CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration launchConfiguration) {
        this.launchConfiguration = launchConfiguration;
        return this;
    }
    public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration getLaunchConfiguration() {
        return this.launchConfiguration;
    }

    public CreateAutoProvisioningGroupShrinkRequest setAutoProvisioningGroupName(String autoProvisioningGroupName) {
        this.autoProvisioningGroupName = autoProvisioningGroupName;
        return this;
    }
    public String getAutoProvisioningGroupName() {
        return this.autoProvisioningGroupName;
    }

    public CreateAutoProvisioningGroupShrinkRequest setAutoProvisioningGroupType(String autoProvisioningGroupType) {
        this.autoProvisioningGroupType = autoProvisioningGroupType;
        return this;
    }
    public String getAutoProvisioningGroupType() {
        return this.autoProvisioningGroupType;
    }

    public CreateAutoProvisioningGroupShrinkRequest setCandidateOptions(CreateAutoProvisioningGroupShrinkRequestCandidateOptions candidateOptions) {
        this.candidateOptions = candidateOptions;
        return this;
    }
    public CreateAutoProvisioningGroupShrinkRequestCandidateOptions getCandidateOptions() {
        return this.candidateOptions;
    }

    public CreateAutoProvisioningGroupShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAutoProvisioningGroupShrinkRequest setDataDiskConfig(java.util.List<CreateAutoProvisioningGroupShrinkRequestDataDiskConfig> dataDiskConfig) {
        this.dataDiskConfig = dataDiskConfig;
        return this;
    }
    public java.util.List<CreateAutoProvisioningGroupShrinkRequestDataDiskConfig> getDataDiskConfig() {
        return this.dataDiskConfig;
    }

    public CreateAutoProvisioningGroupShrinkRequest setDefaultTargetCapacityType(String defaultTargetCapacityType) {
        this.defaultTargetCapacityType = defaultTargetCapacityType;
        return this;
    }
    public String getDefaultTargetCapacityType() {
        return this.defaultTargetCapacityType;
    }

    public CreateAutoProvisioningGroupShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAutoProvisioningGroupShrinkRequest setExcessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
        return this;
    }
    public String getExcessCapacityTerminationPolicy() {
        return this.excessCapacityTerminationPolicy;
    }

    public CreateAutoProvisioningGroupShrinkRequest setExecutionMode(String executionMode) {
        this.executionMode = executionMode;
        return this;
    }
    public String getExecutionMode() {
        return this.executionMode;
    }

    public CreateAutoProvisioningGroupShrinkRequest setHibernationOptionsConfigured(Boolean hibernationOptionsConfigured) {
        this.hibernationOptionsConfigured = hibernationOptionsConfigured;
        return this;
    }
    public Boolean getHibernationOptionsConfigured() {
        return this.hibernationOptionsConfigured;
    }

    public CreateAutoProvisioningGroupShrinkRequest setLaunchTemplateConfig(java.util.List<CreateAutoProvisioningGroupShrinkRequestLaunchTemplateConfig> launchTemplateConfig) {
        this.launchTemplateConfig = launchTemplateConfig;
        return this;
    }
    public java.util.List<CreateAutoProvisioningGroupShrinkRequestLaunchTemplateConfig> getLaunchTemplateConfig() {
        return this.launchTemplateConfig;
    }

    public CreateAutoProvisioningGroupShrinkRequest setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    public CreateAutoProvisioningGroupShrinkRequest setLaunchTemplateVersion(String launchTemplateVersion) {
        this.launchTemplateVersion = launchTemplateVersion;
        return this;
    }
    public String getLaunchTemplateVersion() {
        return this.launchTemplateVersion;
    }

    public CreateAutoProvisioningGroupShrinkRequest setMaxSpotPrice(Float maxSpotPrice) {
        this.maxSpotPrice = maxSpotPrice;
        return this;
    }
    public Float getMaxSpotPrice() {
        return this.maxSpotPrice;
    }

    public CreateAutoProvisioningGroupShrinkRequest setMinTargetCapacity(String minTargetCapacity) {
        this.minTargetCapacity = minTargetCapacity;
        return this;
    }
    public String getMinTargetCapacity() {
        return this.minTargetCapacity;
    }

    public CreateAutoProvisioningGroupShrinkRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateAutoProvisioningGroupShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateAutoProvisioningGroupShrinkRequest setPayAsYouGoAllocationStrategy(String payAsYouGoAllocationStrategy) {
        this.payAsYouGoAllocationStrategy = payAsYouGoAllocationStrategy;
        return this;
    }
    public String getPayAsYouGoAllocationStrategy() {
        return this.payAsYouGoAllocationStrategy;
    }

    public CreateAutoProvisioningGroupShrinkRequest setPayAsYouGoTargetCapacity(String payAsYouGoTargetCapacity) {
        this.payAsYouGoTargetCapacity = payAsYouGoTargetCapacity;
        return this;
    }
    public String getPayAsYouGoTargetCapacity() {
        return this.payAsYouGoTargetCapacity;
    }

    public CreateAutoProvisioningGroupShrinkRequest setPrePaidOptions(CreateAutoProvisioningGroupShrinkRequestPrePaidOptions prePaidOptions) {
        this.prePaidOptions = prePaidOptions;
        return this;
    }
    public CreateAutoProvisioningGroupShrinkRequestPrePaidOptions getPrePaidOptions() {
        return this.prePaidOptions;
    }

    public CreateAutoProvisioningGroupShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAutoProvisioningGroupShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateAutoProvisioningGroupShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateAutoProvisioningGroupShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateAutoProvisioningGroupShrinkRequest setResourcePoolOptionsShrink(String resourcePoolOptionsShrink) {
        this.resourcePoolOptionsShrink = resourcePoolOptionsShrink;
        return this;
    }
    public String getResourcePoolOptionsShrink() {
        return this.resourcePoolOptionsShrink;
    }

    public CreateAutoProvisioningGroupShrinkRequest setSpotAllocationStrategy(String spotAllocationStrategy) {
        this.spotAllocationStrategy = spotAllocationStrategy;
        return this;
    }
    public String getSpotAllocationStrategy() {
        return this.spotAllocationStrategy;
    }

    public CreateAutoProvisioningGroupShrinkRequest setSpotInstanceInterruptionBehavior(String spotInstanceInterruptionBehavior) {
        this.spotInstanceInterruptionBehavior = spotInstanceInterruptionBehavior;
        return this;
    }
    public String getSpotInstanceInterruptionBehavior() {
        return this.spotInstanceInterruptionBehavior;
    }

    public CreateAutoProvisioningGroupShrinkRequest setSpotInstancePoolsToUseCount(Integer spotInstancePoolsToUseCount) {
        this.spotInstancePoolsToUseCount = spotInstancePoolsToUseCount;
        return this;
    }
    public Integer getSpotInstancePoolsToUseCount() {
        return this.spotInstancePoolsToUseCount;
    }

    public CreateAutoProvisioningGroupShrinkRequest setSpotTargetCapacity(String spotTargetCapacity) {
        this.spotTargetCapacity = spotTargetCapacity;
        return this;
    }
    public String getSpotTargetCapacity() {
        return this.spotTargetCapacity;
    }

    public CreateAutoProvisioningGroupShrinkRequest setSystemDiskConfig(java.util.List<CreateAutoProvisioningGroupShrinkRequestSystemDiskConfig> systemDiskConfig) {
        this.systemDiskConfig = systemDiskConfig;
        return this;
    }
    public java.util.List<CreateAutoProvisioningGroupShrinkRequestSystemDiskConfig> getSystemDiskConfig() {
        return this.systemDiskConfig;
    }

    public CreateAutoProvisioningGroupShrinkRequest setTag(java.util.List<CreateAutoProvisioningGroupShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateAutoProvisioningGroupShrinkRequestTag> getTag() {
        return this.tag;
    }

    public CreateAutoProvisioningGroupShrinkRequest setTerminateInstances(Boolean terminateInstances) {
        this.terminateInstances = terminateInstances;
        return this;
    }
    public Boolean getTerminateInstances() {
        return this.terminateInstances;
    }

    public CreateAutoProvisioningGroupShrinkRequest setTerminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
        this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
        return this;
    }
    public Boolean getTerminateInstancesWithExpiration() {
        return this.terminateInstancesWithExpiration;
    }

    public CreateAutoProvisioningGroupShrinkRequest setTotalTargetCapacity(String totalTargetCapacity) {
        this.totalTargetCapacity = totalTargetCapacity;
        return this;
    }
    public String getTotalTargetCapacity() {
        return this.totalTargetCapacity;
    }

    public CreateAutoProvisioningGroupShrinkRequest setValidFrom(String validFrom) {
        this.validFrom = validFrom;
        return this;
    }
    public String getValidFrom() {
        return this.validFrom;
    }

    public CreateAutoProvisioningGroupShrinkRequest setValidUntil(String validUntil) {
        this.validUntil = validUntil;
        return this;
    }
    public String getValidUntil() {
        return this.validUntil;
    }

    public static class CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationArn extends TeaModel {
        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123456789012****</p>
         */
        @NameInMap("AssumeRoleFor")
        public Long assumeRoleFor;

        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>34458433936495****:alice</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789012****:role/adminrole</p>
         */
        @NameInMap("Rolearn")
        public String rolearn;

        public static CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationArn build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationArn self = new CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationArn();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationArn setAssumeRoleFor(Long assumeRoleFor) {
            this.assumeRoleFor = assumeRoleFor;
            return this;
        }
        public Long getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationArn setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationArn setRolearn(String rolearn) {
            this.rolearn = rolearn;
            return this;
        }
        public String getRolearn() {
            return this.rolearn;
        }

    }

    public static class CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationDataDisk extends TeaModel {
        /**
         * <p>The automatic snapshot policy ID applied to the data disk.</p>
         * <p>Note:</p>
         * <ul>
         * <li>This parameter takes effect only when creating an auto provisioning group with AutoProvisioningGroupType=instant.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sp-bp67acfmxazb4p****</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>Specifies whether to enable performance burst. Valid values:</p>
         * <ul>
         * <li><p>true: Enables performance burst.</p>
         * </li>
         * <li><p>false: Disables performance burst.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is supported only when DiskCategory is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>The category of data disk N. N ranges from 1 to 16. Valid values:</p>
         * <ul>
         * <li><p>cloud_efficiency: Ultra disk.</p>
         * </li>
         * <li><p>cloud_ssd: Standard SSD.</p>
         * </li>
         * <li><p>cloud_essd: ESSD.</p>
         * </li>
         * <li><p>cloud: Basic disk.</p>
         * </li>
         * </ul>
         * <p>For I/O optimized instances, the default value is cloud_efficiency. For non-I/O optimized instances, the default value is cloud.</p>
         * <p>When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Specifies whether to release the data disk when the instance is released. Valid values:</p>
         * <ul>
         * <li><p>true: Releases the data disk with the instance.</p>
         * </li>
         * <li><p>false: Does not release the data disk with the instance.</p>
         * </li>
         * </ul>
         * <p>Default value: true.</p>
         * <p>When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        /**
         * <p>The description of the data disk. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>. When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>DataDisk_Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The mount point of the data disk. When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>/dev/vd1</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The name of the data disk. The name must be 2 to 128 characters in length and can contain letters, digits, periods (.), colons (:), underscores (_), and hyphens (-). It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * <p>Default value: empty.</p>
         * <p>When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssdData</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <blockquote>
         * <p>This parameter is not yet available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("EncryptAlgorithm")
        public String encryptAlgorithm;

        /**
         * <p>Specifies whether to encrypt data disk N. Valid values:</p>
         * <ul>
         * <li><p>true: Encrypts the disk.</p>
         * </li>
         * <li><p>false: Does not encrypt the disk.</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * <p>When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public Boolean encrypted;

        /**
         * <p>The KMS key ID for the data disk. When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("KmsKeyId")
        public String kmsKeyId;

        /**
         * <p>The performance level of the ESSD used as a data disk. The value of N must match the N in <code>LaunchConfiguration.DataDisk.N.Category</code>. Valid values:</p>
         * <ul>
         * <li><p>PL0: Up to 10,000 random read/write IOPS per disk.</p>
         * </li>
         * <li><p>PL1 (default): Up to 50,000 random read/write IOPS per disk.</p>
         * </li>
         * <li><p>PL2: Up to 100,000 random read/write IOPS per disk.</p>
         * </li>
         * <li><p>PL3: Up to 1,000,000 random read/write IOPS per disk.</p>
         * </li>
         * </ul>
         * <p>For more information about selecting ESSD performance levels, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD</a>.</p>
         * <p>When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The provisioned read/write IOPS for ESSD AutoPL disks. Valid values: 0 to min{50,000, 1000 × capacity - baseline performance}.</p>
         * <p>Baseline performance = min{1,800 + 50 × capacity, 50,000}.</p>
         * <blockquote>
         * <p>This parameter is supported only when DiskCategory is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>40000</p>
         */
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        /**
         * <p>The size of data disk N, in GiB. N ranges from 1 to 16. Valid values:</p>
         * <ul>
         * <li><p>cloud_efficiency: 20–32768.</p>
         * </li>
         * <li><p>cloud_ssd: 20–32768.</p>
         * </li>
         * <li><p>cloud_essd: The valid range depends on the value of <code>LaunchConfiguration.DataDisk.N.PerformanceLevel</code>.</p>
         * <ul>
         * <li><p>PL0: 40–32768.</p>
         * </li>
         * <li><p>PL1: 20–32768.</p>
         * </li>
         * <li><p>PL2: 461–32768.</p>
         * </li>
         * <li><p>PL3: 1261–32768</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>cloud: 5–2000.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The value must be greater than or equal to the size of the snapshot specified by <code>LaunchConfiguration.DataDisk.N.SnapshotId</code>.</p>
         * </blockquote>
         * <p>When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The snapshot used to create data disk N. N ranges from 1 to 16.</p>
         * <p>After this parameter is specified, <code>LaunchConfiguration.DataDisk.N.Size</code> is ignored. The actual disk size equals the size of the specified snapshot. Snapshots created on or before July 15, 2013 are not supported and will cause the request to fail.</p>
         * <p>When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp17441ohwka0yuh****</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        public static CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationDataDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationDataDisk self = new CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationDataDisk();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationDataDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationDataDisk setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationDataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationDataDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationDataDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationDataDisk setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationDataDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationDataDisk setEncryptAlgorithm(String encryptAlgorithm) {
            this.encryptAlgorithm = encryptAlgorithm;
            return this;
        }
        public String getEncryptAlgorithm() {
            return this.encryptAlgorithm;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationDataDisk setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationDataDisk setKmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public String getKmsKeyId() {
            return this.kmsKeyId;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationDataDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationDataDisk setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationDataDisk setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

    }

    public static class CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationSystemDisk extends TeaModel {
        /**
         * <p>The automatic snapshot policy ID applied to the system disk.</p>
         * <p>Note:</p>
         * <ul>
         * <li>This parameter takes effect only when creating an auto provisioning group with AutoProvisioningGroupType=instant.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sp-bp67acfmxazb4p****</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>Specifies whether to enable performance burst. Valid values:</p>
         * <ul>
         * <li><p>true: Enables performance burst.</p>
         * </li>
         * <li><p>false: Disables performance burst.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is supported only when <code>SystemDisk.Category</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL</a>.</p>
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
         * <li><p>aes-256.</p>
         * </li>
         * <li><p>sm4-128.</p>
         * </li>
         * </ul>
         * <p>Default value: aes-256.</p>
         * <p>When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * <blockquote>
         * <p>This parameter is not yet available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aes-256</p>
         */
        @NameInMap("EncryptAlgorithm")
        public String encryptAlgorithm;

        /**
         * <p>Specifies whether to encrypt system disk N. Valid values:</p>
         * <ul>
         * <li><p>true: Encrypts the disk.</p>
         * </li>
         * <li><p>false: Does not encrypt the disk.</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * <p>When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public String encrypted;

        /**
         * <p>The KMS key ID for the system disk.</p>
         * <p>When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The provisioned read/write IOPS for ESSD AutoPL disks. Valid values: 0 to min{50,000, 1000 × capacity - baseline performance}.</p>
         * <p>Baseline performance = min{1,800 + 50 × capacity, 50,000}.</p>
         * <blockquote>
         * <p>This parameter is supported only when SystemDisk.Category is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>40000</p>
         */
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        public static CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationSystemDisk self = new CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationSystemDisk();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationSystemDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationSystemDisk setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationSystemDisk setEncryptAlgorithm(String encryptAlgorithm) {
            this.encryptAlgorithm = encryptAlgorithm;
            return this;
        }
        public String getEncryptAlgorithm() {
            return this.encryptAlgorithm;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationSystemDisk setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationSystemDisk setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationSystemDisk setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

    }

    public static class CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationTag extends TeaModel {
        /**
         * <p>The tag key of the instance. N ranges from 1 to 20. If specified, the value cannot be an empty string. The key can be up to 128 characters in length and cannot start with aliyun or acs:. It also cannot contain <code>http://</code> or <code>https://</code>. When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the instance. N ranges from 1 to 20. If specified, the value can be an empty string. The value can be up to 128 characters in length and cannot start with acs:. It also cannot contain <code>http://</code> or <code>https://</code>. When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationTag build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationTag self = new CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationTag();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationCpuOptions extends TeaModel {
        /**
         * <p>The number of CPU cores.</p>
         * <p>Default value: See <a href="https://help.aliyun.com/zh/ecs/user-guide/specify-and-view-cpu-options?spm=a2c4g.11186623.0.0.734f769asTEobd">Customize CPU options</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Core")
        public Integer core;

        /**
         * <p>The number of CPU threads. The vCPU count of an ECS instance equals CpuOptions.Core × CpuOptions.ThreadsPerCore.</p>
         * <p>CpuOptions.ThreadsPerCore=1 disables CPU hyper-threading.</p>
         * <p>Only specific instance types support setting the number of CPU threads.</p>
         * <p>Valid values and default values: See <a href="https://help.aliyun.com/zh/ecs/user-guide/specify-and-view-cpu-options?spm=a2c4g.11186623.0.0.734f769aeIFsoj">Customize CPU options</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ThreadsPerCore")
        public Integer threadsPerCore;

        public static CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationCpuOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationCpuOptions self = new CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationCpuOptions();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationCpuOptions setCore(Integer core) {
            this.core = core;
            return this;
        }
        public Integer getCore() {
            return this.core;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationCpuOptions setThreadsPerCore(Integer threadsPerCore) {
            this.threadsPerCore = threadsPerCore;
            return this;
        }
        public Integer getThreadsPerCore() {
            return this.threadsPerCore;
        }

    }

    public static class CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationImageOptions extends TeaModel {
        /**
         * <p>Specifies whether instances using this image support logging on as the ecs-user. Valid values:</p>
         * <ul>
         * <li><p>true: Supported.</p>
         * </li>
         * <li><p>false: Not supported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("LoginAsNonRoot")
        public Boolean loginAsNonRoot;

        public static CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationImageOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationImageOptions self = new CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationImageOptions();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationImageOptions setLoginAsNonRoot(Boolean loginAsNonRoot) {
            this.loginAsNonRoot = loginAsNonRoot;
            return this;
        }
        public Boolean getLoginAsNonRoot() {
            return this.loginAsNonRoot;
        }

    }

    public static class CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationSchedulerOptions extends TeaModel {
        @NameInMap("DedicatedHostClusterId")
        public String dedicatedHostClusterId;

        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        public static CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationSchedulerOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationSchedulerOptions self = new CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationSchedulerOptions();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationSchedulerOptions setDedicatedHostClusterId(String dedicatedHostClusterId) {
            this.dedicatedHostClusterId = dedicatedHostClusterId;
            return this;
        }
        public String getDedicatedHostClusterId() {
            return this.dedicatedHostClusterId;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationSchedulerOptions setDedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

    }

    public static class CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationSecurityOptions extends TeaModel {
        @NameInMap("TrustedSystemMode")
        public String trustedSystemMode;

        public static CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationSecurityOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationSecurityOptions self = new CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationSecurityOptions();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationSecurityOptions setTrustedSystemMode(String trustedSystemMode) {
            this.trustedSystemMode = trustedSystemMode;
            return this;
        }
        public String getTrustedSystemMode() {
            return this.trustedSystemMode;
        }

    }

    public static class CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration extends TeaModel {
        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not supported.</p>
         * </blockquote>
         */
        @NameInMap("Arn")
        public java.util.List<CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationArn> arn;

        /**
         * <p>The automatic release time for pay-as-you-go instances. Specify the time in <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> format using UTC+0 time. Format: <code>yyyy-MM-ddTHH:mm:ssZ</code>.</p>
         * <ul>
         * <li><p>If seconds (<code>ss</code>) are not <code>00</code>, the time is rounded down to the start of the current minute (<code>mm</code>).</p>
         * </li>
         * <li><p>The earliest release time is 30 minutes after the current time.</p>
         * </li>
         * <li><p>The latest release time cannot exceed three years from the current time.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2018-01-01T12:05:00Z</p>
         */
        @NameInMap("AutoReleaseTime")
        public String autoReleaseTime;

        /**
         * <p>The running mode of burstable instances. Valid values:</p>
         * <ul>
         * <li><p>Standard: Standard mode. For more information, see the &quot;Performance-constrained mode&quot; section in <a href="https://help.aliyun.com/document_detail/59977.html">What are burstable instances?</a></p>
         * </li>
         * <li><p>Unlimited: Unlimited mode. For more information, see the &quot;Unlimited mode&quot; section in <a href="https://help.aliyun.com/document_detail/59977.html">What are burstable instances?</a></p>
         * </li>
         * </ul>
         * <p>Default value: None.</p>
         * <p>When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("CreditSpecification")
        public String creditSpecification;

        /**
         * <p>The list of data disk configurations for the extended launch template.</p>
         */
        @NameInMap("DataDisk")
        public java.util.List<CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationDataDisk> dataDisk;

        /**
         * <p>The deployment set ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-bp1frxuzdg87zh4p****</p>
         */
        @NameInMap("DeploymentSetId")
        public String deploymentSetId;

        /**
         * <p>The hostname of the instance. Requirements:</p>
         * <ul>
         * <li><p>Periods (.) and hyphens (-) cannot be the first or last character and cannot appear consecutively.</p>
         * </li>
         * <li><p>Windows instances: 2–15 characters. Periods (.) are not supported. Cannot consist of only digits. Can contain letters, digits, and hyphens (-).</p>
         * </li>
         * <li><p>Other instances (such as Linux): 2–64 characters. Multiple periods (.) are supported. Each segment between periods can contain letters, digits, and hyphens (-).</p>
         * </li>
         * <li><p>Do not set both <code>LaunchConfiguration.HostName</code> and <code>LaunchConfiguration.HostNames.N</code>. Otherwise, an error is returned.</p>
         * </li>
         * <li><p>When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>k8s-node-[1,4]-ecshost</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The list of hostnames for one or more instances. Requirements:</p>
         * <ul>
         * <li><p>This parameter takes effect only when creating an auto provisioning group with <code>AutoProvisioningGroupType=instant</code>.</p>
         * </li>
         * <li><p>N indicates the number of instances. Valid values: 1 to 1000. The value must match TotalTargetCapacity.</p>
         * </li>
         * <li><p>Periods (.) and hyphens (-) cannot be the first or last character and cannot appear consecutively.</p>
         * </li>
         * <li><p>When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ecs-host-01</p>
         */
        @NameInMap("HostNames")
        public java.util.List<String> hostNames;

        /**
         * <p>The image family name. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). It must start with a letter and cannot start with <code>aliyun</code> or <code>acs:</code>. It also cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>hangzhou-daily-update</p>
         */
        @NameInMap("ImageFamily")
        public String imageFamily;

        /**
         * <p>The image ID. This is the image used when launching instances. Call <a href="https://help.aliyun.com/document_detail/25534.html">DescribeImages</a> to query available images. When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>m-bp1g7004ksh0oeuc****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The instance description. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>. When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance_Description</p>
         */
        @NameInMap("InstanceDescription")
        public String instanceDescription;

        /**
         * <p>The instance name. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-). It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * <p>Default value: The instance <code>InstanceId</code>.</p>
         * <p>To create multiple ECS instances, you can batch configure sequential instance names. For more information, see <a href="https://help.aliyun.com/document_detail/196048.html">Batch configure sequential instance names or hostnames</a>.</p>
         * <p>When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s-node-[1,4]-alibabacloud</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The network billing type. Valid values:</p>
         * <ul>
         * <li><p>PayByBandwidth: Pay-by-bandwidth.</p>
         * </li>
         * <li><p>PayByTraffic: Pay-by-traffic.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>For pay-by-traffic, inbound and outbound bandwidth peaks represent upper limits and are not service-level commitments. Bandwidth may be throttled during resource contention. Use pay-by-bandwidth if your workload requires guaranteed bandwidth.</p>
         * </blockquote>
         * <p>When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>PayByTraffic</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>The maximum inbound public bandwidth, in Mbit/s. Valid values:</p>
         * <ul>
         * <li><p>When outbound public bandwidth is ≤ 10 Mbit/s: 1–10. Default: 10.</p>
         * </li>
         * <li><p>When outbound public bandwidth is &gt; 10 Mbit/s: 1–<code>LaunchConfiguration.InternetMaxBandwidthOut</code>. Default: <code>LaunchConfiguration.InternetMaxBandwidthOut</code>.</p>
         * </li>
         * </ul>
         * <p>When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("InternetMaxBandwidthIn")
        public Integer internetMaxBandwidthIn;

        /**
         * <p>The maximum outbound public bandwidth, in Mbit/s. Valid values: 0–100.</p>
         * <p>Default value: 0.</p>
         * <p>When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("InternetMaxBandwidthOut")
        public Integer internetMaxBandwidthOut;

        /**
         * <p>Specifies whether the instance is I/O optimized. Valid values:</p>
         * <ul>
         * <li><p>none: Not I/O optimized.</p>
         * </li>
         * <li><p>optimized: I/O optimized.</p>
         * </li>
         * </ul>
         * <p>For retired instance types, the default value is none. For other instance types, the default value is optimized.</p>
         * <p>When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>optimized</p>
         */
        @NameInMap("IoOptimized")
        public String ioOptimized;

        /**
         * <p>The key pair name.</p>
         * <ul>
         * <li><p>For Windows instances, this parameter is ignored. Default value: empty.</p>
         * </li>
         * <li><p>For Linux instances, password logon is disabled after initialization.</p>
         * </li>
         * </ul>
         * <p>When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>KeyPair_Name</p>
         */
        @NameInMap("KeyPairName")
        public String keyPairName;

        /**
         * <p>The instance password. The password must be 8 to 30 characters in length and include at least three of the following: uppercase letters, lowercase letters, digits, and special characters. Valid special characters:</p>
         * <p><code>()`~!@#$%^&amp;*-_+=|{}`[]`:;\\&quot;&lt;&gt;,.?/</code></p>
         * <p>For Windows instances, the password cannot start with a forward slash (/).</p>
         * <p>When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>EcsV587!</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>Specifies whether to use the password preset in the image. Valid values:</p>
         * <ul>
         * <li><p>true: Uses the preset password.</p>
         * </li>
         * <li><p>false: Does not use the preset password.</p>
         * </li>
         * </ul>
         * <p>When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PasswordInherit")
        public Boolean passwordInherit;

        /**
         * <p>The RAM role name of the instance. Use the RAM API <a href="https://help.aliyun.com/document_detail/28713.html">ListRoles</a> to query your created RAM roles. When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>RAM_Name</p>
         */
        @NameInMap("RamRoleName")
        public String ramRoleName;

        /**
         * <p>The resource group ID of the instance. When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4p****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Specifies whether to enable security hardening. Valid values:</p>
         * <ul>
         * <li><p>Active: Enables security hardening. Applies only to public images.</p>
         * </li>
         * <li><p>Deactive: Disables security hardening. Applies to all image types.</p>
         * </li>
         * </ul>
         * <p>When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("SecurityEnhancementStrategy")
        public String securityEnhancementStrategy;

        /**
         * <p>The security group ID of the instance. When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
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
         * <p>System disk information for the instance. When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         */
        @NameInMap("SystemDisk")
        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationSystemDisk systemDisk;

        /**
         * <p>The category of the system disk. Valid values:</p>
         * <ul>
         * <li><p>cloud_efficiency: Ultra disk.</p>
         * </li>
         * <li><p>cloud_ssd: Standard SSD.</p>
         * </li>
         * <li><p>cloud_essd: ESSD.</p>
         * </li>
         * <li><p>cloud: Basic disk.</p>
         * </li>
         * </ul>
         * <p>For retired instance types that are not I/O optimized, the default value is cloud. Otherwise, the default value is cloud_efficiency.</p>
         * <p>When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        /**
         * <p>The description of the system disk. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * <p>When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>SystemDisk_Description</p>
         */
        @NameInMap("SystemDiskDescription")
        public String systemDiskDescription;

        /**
         * <p>The name of the system disk. The name must be 2 to 128 characters in length and can contain letters, digits, periods (.), colons (:), underscores (_), and hyphens (-). It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * <p>Default value: empty.</p>
         * <p>When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssdSystem</p>
         */
        @NameInMap("SystemDiskName")
        public String systemDiskName;

        /**
         * <p>The performance level of the ESSD used as the system disk. Valid values:</p>
         * <ul>
         * <li><p>PL0 (default): Up to 10,000 random read/write IOPS per disk.</p>
         * </li>
         * <li><p>PL1: Up to 50,000 random read/write IOPS per disk.</p>
         * </li>
         * <li><p>PL2: Up to 100,000 random read/write IOPS per disk.</p>
         * </li>
         * <li><p>PL3: Up to 1,000,000 random read/write IOPS per disk.</p>
         * </li>
         * </ul>
         * <p>For more information about selecting ESSD performance levels, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD</a>.</p>
         * <p>When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("SystemDiskPerformanceLevel")
        public String systemDiskPerformanceLevel;

        /**
         * <p>The size of the system disk, in GiB. Valid values: 20–500. The value must be greater than or equal to max{20, size of the image specified by LaunchConfiguration.ImageId}.</p>
         * <p>Default value: max{40, size of the image specified by LaunchConfiguration.ImageId}.</p>
         * <p>When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        /**
         * <p>The list of tags for the extended launch template.</p>
         */
        @NameInMap("Tag")
        public java.util.List<CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationTag> tag;

        /**
         * <p>The instance user data. Encode the data in Base64. The raw data cannot exceed 32 KB. When both a launch template and launch configuration parameters are specified, the launch template takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>ZWNobyBoZWxsbyBlY3Mh</p>
         */
        @NameInMap("UserData")
        public String userData;

        /**
         * <p>Specifies whether to enable auto-renewal. Takes effect when creating subscription instances. Valid values:</p>
         * <ul>
         * <li><p>true: Enables auto-renewal.</p>
         * </li>
         * <li><p>false (default): Disables auto-renewal.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        /**
         * <p>The auto-renewal duration per cycle. Valid values:</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li><p>When PeriodUnit=Week: 1, 2, 3.</p>
         * </li>
         * <li><p>When PeriodUnit=Month: 1, 2, 3, 6, 12, 24, 36, 48, 60.</p>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <p>When PeriodUnit=Month: 1, 2, 3, 6, 12, 24, 36, 48, 60.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AutoRenewPeriod")
        public Integer autoRenewPeriod;

        /**
         * <p>CPU configuration.</p>
         */
        @NameInMap("CpuOptions")
        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationCpuOptions cpuOptions;

        /**
         * <p>Image-related properties.</p>
         * <p>Note:</p>
         * <ul>
         * <li>This parameter takes effect only when creating an auto provisioning group with AutoProvisioningGroupType=instant.</li>
         * </ul>
         */
        @NameInMap("ImageOptions")
        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationImageOptions imageOptions;

        /**
         * <p>The subscription duration. The unit is specified by <code>PeriodUnit</code>. Required when creating subscription instances. Valid values:</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li><p>When PeriodUnit=Week, Period values: 1, 2, 3, 4.</p>
         * </li>
         * <li><p>When PeriodUnit=Month, Period values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, 60.</p>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <p>When PeriodUnit=Month, Period values: 1, 2, 3, 6, 12.</p>
         * <p>&lt;props=&quot;partner&quot;&gt;</p>
         * <p>When PeriodUnit=Month, Period values: 1, 2, 3, 6, 12.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The time unit for subscription billing. Valid values:</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li><p>Week.</p>
         * </li>
         * <li><p>Month (default).</p>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <p>Month (default).</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        @NameInMap("SchedulerOptions")
        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationSchedulerOptions schedulerOptions;

        @NameInMap("SecurityOptions")
        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationSecurityOptions securityOptions;

        /**
         * <p>The reserved duration for spot instances, in hours. Default value: 1. Valid values:</p>
         * <ul>
         * <li><p>1: Alibaba Cloud guarantees that the instance runs for 1 hour without being automatically released. After 1 hour, the system compares your bid price with the market price and checks inventory to decide whether to retain or reclaim the instance.</p>
         * </li>
         * <li><p>0: Alibaba Cloud does not guarantee that the instance runs for 1 hour. The system immediately compares your bid price with the market price and checks inventory to decide whether to retain or reclaim the instance.</p>
         * </li>
         * </ul>
         * <p>Alibaba Cloud sends an ECS system event notification 5 minutes before reclaiming a spot instance. Spot instances are billed per second. Choose the reserved duration based on your task execution time.</p>
         * <p>Note:</p>
         * <ul>
         * <li>This parameter takes effect only when creating an auto provisioning group with AutoProvisioningGroupType=instant.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SpotDuration")
        public Integer spotDuration;

        /**
         * <p>The interruption behavior for spot instances. Valid values:</p>
         * <ul>
         * <li><p>Terminate: Releases the instance immediately.</p>
         * </li>
         * <li><p>Stop: Puts the instance into economical mode.</p>
         * </li>
         * </ul>
         * <p>For more information about economical mode, see <a href="https://help.aliyun.com/document_detail/63353.html">Economical mode</a>.</p>
         * <p>Default value: Terminate.</p>
         * <p>Note:</p>
         * <ul>
         * <li>This parameter takes effect only when creating an auto provisioning group with AutoProvisioningGroupType=instant.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Terminate</p>
         */
        @NameInMap("SpotInterruptionBehavior")
        public String spotInterruptionBehavior;

        public static CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration self = new CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setArn(java.util.List<CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationArn> arn) {
            this.arn = arn;
            return this;
        }
        public java.util.List<CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationArn> getArn() {
            return this.arn;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setAutoReleaseTime(String autoReleaseTime) {
            this.autoReleaseTime = autoReleaseTime;
            return this;
        }
        public String getAutoReleaseTime() {
            return this.autoReleaseTime;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setCreditSpecification(String creditSpecification) {
            this.creditSpecification = creditSpecification;
            return this;
        }
        public String getCreditSpecification() {
            return this.creditSpecification;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setDataDisk(java.util.List<CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationDataDisk> dataDisk) {
            this.dataDisk = dataDisk;
            return this;
        }
        public java.util.List<CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationDataDisk> getDataDisk() {
            return this.dataDisk;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setDeploymentSetId(String deploymentSetId) {
            this.deploymentSetId = deploymentSetId;
            return this;
        }
        public String getDeploymentSetId() {
            return this.deploymentSetId;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setHostNames(java.util.List<String> hostNames) {
            this.hostNames = hostNames;
            return this;
        }
        public java.util.List<String> getHostNames() {
            return this.hostNames;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setImageFamily(String imageFamily) {
            this.imageFamily = imageFamily;
            return this;
        }
        public String getImageFamily() {
            return this.imageFamily;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setInstanceDescription(String instanceDescription) {
            this.instanceDescription = instanceDescription;
            return this;
        }
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }
        public Integer getInternetMaxBandwidthIn() {
            return this.internetMaxBandwidthIn;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setIoOptimized(String ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public String getIoOptimized() {
            return this.ioOptimized;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setPasswordInherit(Boolean passwordInherit) {
            this.passwordInherit = passwordInherit;
            return this;
        }
        public Boolean getPasswordInherit() {
            return this.passwordInherit;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
            this.securityEnhancementStrategy = securityEnhancementStrategy;
            return this;
        }
        public String getSecurityEnhancementStrategy() {
            return this.securityEnhancementStrategy;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setSystemDisk(CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationSystemDisk systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }
        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationSystemDisk getSystemDisk() {
            return this.systemDisk;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setSystemDiskDescription(String systemDiskDescription) {
            this.systemDiskDescription = systemDiskDescription;
            return this;
        }
        public String getSystemDiskDescription() {
            return this.systemDiskDescription;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setSystemDiskName(String systemDiskName) {
            this.systemDiskName = systemDiskName;
            return this;
        }
        public String getSystemDiskName() {
            return this.systemDiskName;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
            this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
            return this;
        }
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setTag(java.util.List<CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationTag> getTag() {
            return this.tag;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setAutoRenewPeriod(Integer autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public Integer getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setCpuOptions(CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationCpuOptions cpuOptions) {
            this.cpuOptions = cpuOptions;
            return this;
        }
        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationCpuOptions getCpuOptions() {
            return this.cpuOptions;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setImageOptions(CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationImageOptions imageOptions) {
            this.imageOptions = imageOptions;
            return this;
        }
        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationImageOptions getImageOptions() {
            return this.imageOptions;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setSchedulerOptions(CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationSchedulerOptions schedulerOptions) {
            this.schedulerOptions = schedulerOptions;
            return this;
        }
        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationSchedulerOptions getSchedulerOptions() {
            return this.schedulerOptions;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setSecurityOptions(CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationSecurityOptions securityOptions) {
            this.securityOptions = securityOptions;
            return this;
        }
        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationSecurityOptions getSecurityOptions() {
            return this.securityOptions;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setSpotDuration(Integer spotDuration) {
            this.spotDuration = spotDuration;
            return this;
        }
        public Integer getSpotDuration() {
            return this.spotDuration;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration setSpotInterruptionBehavior(String spotInterruptionBehavior) {
            this.spotInterruptionBehavior = spotInterruptionBehavior;
            return this;
        }
        public String getSpotInterruptionBehavior() {
            return this.spotInterruptionBehavior;
        }

    }

    public static class CreateAutoProvisioningGroupShrinkRequestCandidateOptions extends TeaModel {
        @NameInMap("Evaluate")
        public Boolean evaluate;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("TimeoutMinutes")
        public Integer timeoutMinutes;

        public static CreateAutoProvisioningGroupShrinkRequestCandidateOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupShrinkRequestCandidateOptions self = new CreateAutoProvisioningGroupShrinkRequestCandidateOptions();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupShrinkRequestCandidateOptions setEvaluate(Boolean evaluate) {
            this.evaluate = evaluate;
            return this;
        }
        public Boolean getEvaluate() {
            return this.evaluate;
        }

        public CreateAutoProvisioningGroupShrinkRequestCandidateOptions setTimeoutMinutes(Integer timeoutMinutes) {
            this.timeoutMinutes = timeoutMinutes;
            return this;
        }
        public Integer getTimeoutMinutes() {
            return this.timeoutMinutes;
        }

    }

    public static class CreateAutoProvisioningGroupShrinkRequestDataDiskConfig extends TeaModel {
        /**
         * <p>The data disk type. You can specify multiple candidate disk types. The order specifies their priority. If one disk type is unavailable, the system automatically switches to the next type. Valid values:</p>
         * <ul>
         * <li><p>cloud_efficiency: Ultra disk.</p>
         * </li>
         * <li><p>cloud_ssd: Standard SSD.</p>
         * </li>
         * <li><p>cloud_essd: ESSD.</p>
         * </li>
         * <li><p>cloud: Basic disk.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
         */
        @NameInMap("DiskCategory")
        public String diskCategory;

        public static CreateAutoProvisioningGroupShrinkRequestDataDiskConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupShrinkRequestDataDiskConfig self = new CreateAutoProvisioningGroupShrinkRequestDataDiskConfig();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupShrinkRequestDataDiskConfig setDiskCategory(String diskCategory) {
            this.diskCategory = diskCategory;
            return this;
        }
        public String getDiskCategory() {
            return this.diskCategory;
        }

    }

    public static class CreateAutoProvisioningGroupShrinkRequestLaunchTemplateConfig extends TeaModel {
        /**
         * <p>The list of architecture types for instance types.</p>
         */
        @NameInMap("Architectures")
        public java.util.List<String> architectures;

        /**
         * <p>Specifies whether the instance type supports performance bursts. Valid values:</p>
         * <ul>
         * <li><p>Exclude: Excludes burstable instance types.</p>
         * </li>
         * <li><p>Include: Includes burstable instance types.</p>
         * </li>
         * <li><p>Required: Includes only burstable instance types.</p>
         * </li>
         * </ul>
         * <p>Default value: Include.</p>
         * 
         * <strong>example:</strong>
         * <p>Include</p>
         */
        @NameInMap("BurstablePerformance")
        public String burstablePerformance;

        /**
         * <p>The list of vCPU counts for instance types.</p>
         */
        @NameInMap("Cores")
        public java.util.List<Integer> cores;

        /**
         * <p>The list of instance types to exclude.</p>
         */
        @NameInMap("ExcludedInstanceTypes")
        public java.util.List<String> excludedInstanceTypes;

        /**
         * <p>The image ID. Use this parameter to specify the image for the current resource pool. If not set, the image specified in <code>LaunchConfiguration.ImageId</code> or the launch template is used by default. Call <a href="https://help.aliyun.com/document_detail/25534.html">DescribeImages</a> to query available images.
         * Note: This parameter is supported only when <code>AutoProvisioningGroupType = instant</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_3_x64_20G_alibase_20210425.vhd</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The instance family level, used to filter eligible instance types. Valid values:</p>
         * <ul>
         * <li><p>EntryLevel: Entry-level, or shared-resource instances. Lower cost but no guaranteed stable computing performance. Suitable for workloads with low average CPU usage. For more information, see <a href="https://help.aliyun.com/document_detail/108489.html">Shared-resource instances</a>.</p>
         * </li>
         * <li><p>EnterpriseLevel: Enterprise-level. Stable performance with dedicated resources. Suitable for workloads requiring high stability. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
         * </li>
         * <li><p>CreditEntryLevel: Credit entry-level, or burstable instances. Uses CPU credits to guarantee computing performance. Suitable for workloads with low average CPU usage and occasional bursts. For more information, see <a href="https://help.aliyun.com/document_detail/59977.html">Burstable instances</a>.</p>
         * </li>
         * </ul>
         * <p>N ranges from 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>EnterpriseLevel</p>
         */
        @NameInMap("InstanceFamilyLevel")
        public String instanceFamilyLevel;

        /**
         * <p>The instance type corresponding to the extended launch template. N ranges from 1 to 20. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g5.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The maximum hourly price for spot instances in the extended launch template.</p>
         * <blockquote>
         * <p>After <code>LaunchTemplateConfig</code> is set, <code>LaunchTemplateConfig.N.MaxPrice</code> is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxPrice")
        public Double maxPrice;

        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not supported.</p>
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
         * <p>The ID of the virtual switch to which the ECS instance belongs in the extended launch template. The zone of the ECS instance launched from this template is determined by the virtual switch.</p>
         * <blockquote>
         * <p>After <code>LaunchTemplateConfig</code> is set, <code>LaunchTemplateConfig.N.VSwitchId</code> is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-sn5bsitu4lfzgc5o7****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The weight of the instance type in the extended launch template. A higher value indicates greater computing power per instance and fewer instances needed. Valid values: Greater than 0.</p>
         * <p>You can calculate the weight based on the computing power of the specified instance type and the minimum computing power required per node in the cluster. For example, if the minimum computing power per node is 8 vCPUs and 60 GiB memory:</p>
         * <ul>
         * <li><p>An instance type with 8 vCPUs and 60 GiB memory can have a weight of 1.</p>
         * </li>
         * <li><p>An instance type with 16 vCPUs and 120 GiB memory can have a weight of 2.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("WeightedCapacity")
        public Double weightedCapacity;

        public static CreateAutoProvisioningGroupShrinkRequestLaunchTemplateConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupShrinkRequestLaunchTemplateConfig self = new CreateAutoProvisioningGroupShrinkRequestLaunchTemplateConfig();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchTemplateConfig setArchitectures(java.util.List<String> architectures) {
            this.architectures = architectures;
            return this;
        }
        public java.util.List<String> getArchitectures() {
            return this.architectures;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchTemplateConfig setBurstablePerformance(String burstablePerformance) {
            this.burstablePerformance = burstablePerformance;
            return this;
        }
        public String getBurstablePerformance() {
            return this.burstablePerformance;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchTemplateConfig setCores(java.util.List<Integer> cores) {
            this.cores = cores;
            return this;
        }
        public java.util.List<Integer> getCores() {
            return this.cores;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchTemplateConfig setExcludedInstanceTypes(java.util.List<String> excludedInstanceTypes) {
            this.excludedInstanceTypes = excludedInstanceTypes;
            return this;
        }
        public java.util.List<String> getExcludedInstanceTypes() {
            return this.excludedInstanceTypes;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchTemplateConfig setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchTemplateConfig setInstanceFamilyLevel(String instanceFamilyLevel) {
            this.instanceFamilyLevel = instanceFamilyLevel;
            return this;
        }
        public String getInstanceFamilyLevel() {
            return this.instanceFamilyLevel;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchTemplateConfig setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchTemplateConfig setMaxPrice(Double maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }
        public Double getMaxPrice() {
            return this.maxPrice;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchTemplateConfig setMaxQuantity(Integer maxQuantity) {
            this.maxQuantity = maxQuantity;
            return this;
        }
        public Integer getMaxQuantity() {
            return this.maxQuantity;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchTemplateConfig setMemories(java.util.List<Float> memories) {
            this.memories = memories;
            return this;
        }
        public java.util.List<Float> getMemories() {
            return this.memories;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchTemplateConfig setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchTemplateConfig setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateAutoProvisioningGroupShrinkRequestLaunchTemplateConfig setWeightedCapacity(Double weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public Double getWeightedCapacity() {
            return this.weightedCapacity;
        }

    }

    public static class CreateAutoProvisioningGroupShrinkRequestPrePaidOptionsSpecifyCapacityDistribution extends TeaModel {
        /**
         * <p>The set of instance types. Duplicates are not allowed, and the types must be within the range of LaunchTemplateConfig.InstanceType.</p>
         */
        @NameInMap("InstanceTypes")
        public java.util.List<String> instanceTypes;

        /**
         * <p>The minimum number of instances to deliver within the <code>InstanceTypes</code> range.</p>
         * <blockquote>
         * <p><code>sum(MinTargetCapacity)&lt;= TotalTargetCapacity</code>. The sum of MinTargetCapacity across all instance type sets cannot exceed TotalTargetCapacity. If any instance type set fails to meet its MinTargetCapacity due to inventory issues, the entire request fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MinTargetCapacity")
        public Integer minTargetCapacity;

        public static CreateAutoProvisioningGroupShrinkRequestPrePaidOptionsSpecifyCapacityDistribution build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupShrinkRequestPrePaidOptionsSpecifyCapacityDistribution self = new CreateAutoProvisioningGroupShrinkRequestPrePaidOptionsSpecifyCapacityDistribution();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupShrinkRequestPrePaidOptionsSpecifyCapacityDistribution setInstanceTypes(java.util.List<String> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        public CreateAutoProvisioningGroupShrinkRequestPrePaidOptionsSpecifyCapacityDistribution setMinTargetCapacity(Integer minTargetCapacity) {
            this.minTargetCapacity = minTargetCapacity;
            return this;
        }
        public Integer getMinTargetCapacity() {
            return this.minTargetCapacity;
        }

    }

    public static class CreateAutoProvisioningGroupShrinkRequestPrePaidOptions extends TeaModel {
        /**
         * <p>The minimum capacity set for different instance types. This parameter is supported only when <code>AutoProvisioningGroupType = request</code>.</p>
         */
        @NameInMap("SpecifyCapacityDistribution")
        public java.util.List<CreateAutoProvisioningGroupShrinkRequestPrePaidOptionsSpecifyCapacityDistribution> specifyCapacityDistribution;

        public static CreateAutoProvisioningGroupShrinkRequestPrePaidOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupShrinkRequestPrePaidOptions self = new CreateAutoProvisioningGroupShrinkRequestPrePaidOptions();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupShrinkRequestPrePaidOptions setSpecifyCapacityDistribution(java.util.List<CreateAutoProvisioningGroupShrinkRequestPrePaidOptionsSpecifyCapacityDistribution> specifyCapacityDistribution) {
            this.specifyCapacityDistribution = specifyCapacityDistribution;
            return this;
        }
        public java.util.List<CreateAutoProvisioningGroupShrinkRequestPrePaidOptionsSpecifyCapacityDistribution> getSpecifyCapacityDistribution() {
            return this.specifyCapacityDistribution;
        }

    }

    public static class CreateAutoProvisioningGroupShrinkRequestSystemDiskConfig extends TeaModel {
        /**
         * <p>The system disk type. You can specify multiple candidate disk types. The order specifies their priority. If one disk type is unavailable, the system automatically switches to the next type. Valid values:</p>
         * <ul>
         * <li><p>cloud_efficiency: Ultra disk.</p>
         * </li>
         * <li><p>cloud_ssd: Standard SSD.</p>
         * </li>
         * <li><p>cloud_essd: ESSD.</p>
         * </li>
         * <li><p>cloud: Basic disk.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("DiskCategory")
        public String diskCategory;

        public static CreateAutoProvisioningGroupShrinkRequestSystemDiskConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupShrinkRequestSystemDiskConfig self = new CreateAutoProvisioningGroupShrinkRequestSystemDiskConfig();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupShrinkRequestSystemDiskConfig setDiskCategory(String diskCategory) {
            this.diskCategory = diskCategory;
            return this;
        }
        public String getDiskCategory() {
            return this.diskCategory;
        }

    }

    public static class CreateAutoProvisioningGroupShrinkRequestTag extends TeaModel {
        /**
         * <p>The tag key of the auto provisioning group.</p>
         * <p>N ranges from 1 to 20. If specified, the value cannot be an empty string. The key can be up to 128 characters in length and cannot start with aliyun or acs:. It also cannot contain http\:// or https\://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the auto provisioning group.</p>
         * <p>N ranges from 1 to 20. If specified, the value can be an empty string. The value can be up to 128 characters in length and cannot contain http\:// or https\://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateAutoProvisioningGroupShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupShrinkRequestTag self = new CreateAutoProvisioningGroupShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAutoProvisioningGroupShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
