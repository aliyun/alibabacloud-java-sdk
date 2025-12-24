// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateAutoProvisioningGroupShrinkRequest extends TeaModel {
    @NameInMap("LaunchConfiguration")
    public CreateAutoProvisioningGroupShrinkRequestLaunchConfiguration launchConfiguration;

    /**
     * <p>The name of the auto provisioning group. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>apg-test</p>
     */
    @NameInMap("AutoProvisioningGroupName")
    public String autoProvisioningGroupName;

    /**
     * <p>The delivery type of the auto provisioning group. Valid values:</p>
     * <ul>
     * <li>request: one-time asynchronous delivery. When the auto provisioning group is started, it attempts to asynchronously deliver an instance cluster that meets the target capacity only once. The group does not retry the operation regardless of whether all the instances are delivered.</li>
     * <li>instant: one-time synchronous delivery. When the auto provisioning group is started, it attempts to synchronously deliver an instance cluster that meets the target capacity only once. The list of delivered instances and the causes of delivery failures are returned in the response.</li>
     * <li>maintain: continuous delivery. When the auto provisioning group is started, it attempts to deliver an instance cluster that meets the target capacity, and monitors the real-time capacity. If the target capacity of the auto provisioning group is not reached, the auto provisioning group continues to create instances until the target capacity is reached.</li>
     * </ul>
     * <p>Default value: maintain.</p>
     * 
     * <strong>example:</strong>
     * <p>maintain</p>
     */
    @NameInMap("AutoProvisioningGroupType")
    public String autoProvisioningGroupType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The information of data disks on the instance.</p>
     */
    @NameInMap("DataDiskConfig")
    public java.util.List<CreateAutoProvisioningGroupShrinkRequestDataDiskConfig> dataDiskConfig;

    /**
     * <p>The type of supplemental instances. When the sum of the <code>PayAsYouGoTargetCapacity</code> and <code>SpotTargetCapacity</code> values is smaller than the <code>TotalTargetCapacity</code> value, the auto provisioning group creates instances of the specified type to meet the total target capacity. Valid values:</p>
     * <ul>
     * <li>PayAsYouGo: pay-as-you-go</li>
     * <li>Spot: spot instance</li>
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
     * <p>Specifies whether to release scaled-in instances when the real-time capacity of the auto provisioning group exceeds the target capacity and the group is triggered to scale in. Valid values:</p>
     * <ul>
     * <li>termination: releases the scaled-in instances in the auto provisioning group.</li>
     * <li>no-termination: removes the scaled-in instances from the auto provisioning group but does not release the instances.</li>
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
     * <p>The extended configurations of the launch template.</p>
     */
    @NameInMap("LaunchTemplateConfig")
    public java.util.List<CreateAutoProvisioningGroupShrinkRequestLaunchTemplateConfig> launchTemplateConfig;

    /**
     * <p>The ID of the launch template associated with the auto provisioning group. You can call the <a href="https://help.aliyun.com/document_detail/73759.html">DescribeLaunchTemplates</a> operation to query available launch templates. When both LaunchTemplateId and <code>LaunchConfiguration.*</code> parameters are specified, LaunchTemplateId takes precedence.</p>
     * 
     * <strong>example:</strong>
     * <p>lt-bp1fgzds4bdogu03****</p>
     */
    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    /**
     * <p>The version of the launch template associated with the auto provisioning group. You can call the <a href="https://help.aliyun.com/document_detail/73761.html">DescribeLaunchTemplateVersions</a> operation to query the versions of available launch templates.</p>
     * <p>Default value: the default version of the launch template.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LaunchTemplateVersion")
    public String launchTemplateVersion;

    /**
     * <p>The maximum price of spot instances in the auto provisioning group.</p>
     * <blockquote>
     * <p> When both <code>MaxSpotPrice</code> and <code>LaunchTemplateConfig.N.MaxPrice</code> are specified, the smaller one of the two parameter values is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MaxSpotPrice")
    public Float maxSpotPrice;

    /**
     * <p>The minimum target capacity of the auto provisioning group. The value must be a positive integer. When you specify this parameter, take note of the following items:</p>
     * <ul>
     * <li>This parameter takes effect only when <code>AutoProvisioningGroupType</code> is set to instant. </li>
     * <li>If the number of instances that can be created in the current region is smaller than the value of this parameter, the operation cannot be called and no instances are created. </li>
     * <li>If the number of instances that can be created in the current region is greater than the value of this parameter, instances can be created based on the specified parameters.</li>
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
     * <p>The policy for creating pay-as-you-go instances. Valid values:</p>
     * <ul>
     * <li>lowest-price: cost optimization policy. The auto provisioning group selects the lowest-priced instance type to create instances.</li>
     * <li>prioritized: priority-based policy. The auto provisioning group creates instances based on the priority specified by <code>LaunchTemplateConfig.N.Priority</code>.</li>
     * </ul>
     * <p>Default value: lowest-price.</p>
     * 
     * <strong>example:</strong>
     * <p>prioritized</p>
     */
    @NameInMap("PayAsYouGoAllocationStrategy")
    public String payAsYouGoAllocationStrategy;

    /**
     * <p>The target capacity of pay-as-you-go instances in the auto provisioning group. The value must be less than or equal to the <code>TotalTargetCapacity</code> value.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PayAsYouGoTargetCapacity")
    public String payAsYouGoTargetCapacity;

    /**
     * <p>The capacity details of the subscription instance.</p>
     */
    @NameInMap("PrePaidOptions")
    public CreateAutoProvisioningGroupShrinkRequestPrePaidOptions prePaidOptions;

    /**
     * <p>The ID of the region in which to create the auto provisioning group. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which to assign the auto provisioning group.</p>
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
     * <p>The resource pool options to use to create instances. When you specify this parameter, take note of the following items:</p>
     * <ul>
     * <li>This parameter takes effect only when the auto provisioning group creates pay-as-you-go instances.</li>
     * <li>This parameter takes effect only if you set <code>AutoProvisioningGroupType</code> to instant.</li>
     * </ul>
     */
    @NameInMap("ResourcePoolOptions")
    public String resourcePoolOptionsShrink;

    /**
     * <p>The policy for creating spot instances. Valid values:</p>
     * <ul>
     * <li>lowest-price: cost optimization policy. The auto provisioning group selects the lowest-priced instance type to create instances.</li>
     * <li>diversified: balanced distribution policy. The auto provisioning group creates instances in zones that are specified in extended configurations and then evenly distributes the instances across the zones.</li>
     * <li>capacity-optimized: capacity-optimized distribution policy. The auto provisioning group creates instances of the optimal instance types across the optimal zones based on resource availability.</li>
     * </ul>
     * <p>Default value: lowest-price.</p>
     * 
     * <strong>example:</strong>
     * <p>diversified</p>
     */
    @NameInMap("SpotAllocationStrategy")
    public String spotAllocationStrategy;

    /**
     * <p>The operation to be performed on the spot instance when it is interrupted. Valid values:</p>
     * <ul>
     * <li>stop: stops the spot instance.</li>
     * <li>terminate: releases the spot instance.</li>
     * </ul>
     * <p>Default value: terminate.</p>
     * 
     * <strong>example:</strong>
     * <p>terminate</p>
     */
    @NameInMap("SpotInstanceInterruptionBehavior")
    public String spotInstanceInterruptionBehavior;

    /**
     * <p>The number of spot instances of the lowest-priced instance type to be created by the auto provisioning group. This parameter takes effect when <code>SpotAllocationStrategy</code> is set to <code>lowest-price</code>.</p>
     * <p>The value must be smaller than the N value specified in <code>LaunchTemplateConfig.N</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SpotInstancePoolsToUseCount")
    public Integer spotInstancePoolsToUseCount;

    /**
     * <p>The target capacity of spot instances in the auto provisioning group. The value must be less than or equal to the <code>TotalTargetCapacity</code> value.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("SpotTargetCapacity")
    public String spotTargetCapacity;

    /**
     * <p>The information of system disks on the instance.</p>
     */
    @NameInMap("SystemDiskConfig")
    public java.util.List<CreateAutoProvisioningGroupShrinkRequestSystemDiskConfig> systemDiskConfig;

    /**
     * <p>The tags to add to the auto provisioning group.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateAutoProvisioningGroupShrinkRequestTag> tag;

    /**
     * <p>Specifies whether to release instances in the auto provisioning group when the auto provisioning group is deleted. Valid values:</p>
     * <ul>
     * <li>true: releases the instances.</li>
     * <li>false: retains the instances.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TerminateInstances")
    public Boolean terminateInstances;

    /**
     * <p>Specifies whether to release instances in the auto provisioning group when the group expires. Valid values:</p>
     * <ul>
     * <li>true: releases the instances.</li>
     * <li>false: only removes the instances from the auto provisioning group but does not release them.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TerminateInstancesWithExpiration")
    public Boolean terminateInstancesWithExpiration;

    /**
     * <p>The total target capacity of the auto provisioning group. The value must be a positive integer.</p>
     * <p>The total target capacity of the auto provisioning group must be greater than or equal to the sum of the target capacity of pay-as-you-go instances specified by <code>PayAsYouGoTargetCapacity</code> and the target capacity of spot instances specified by <code>SpotTargetCapacity</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("TotalTargetCapacity")
    public String totalTargetCapacity;

    /**
     * <p>The time at which to start the auto provisioning group. The period of time between this point in time and the point in time specified by <code>ValidUntil</code> is the validity period of the auto provisioning group.</p>
     * <p>Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <p>By default, an auto provisioning group is started immediately after it is created.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-04-01T15:10:20Z</p>
     */
    @NameInMap("ValidFrom")
    public String validFrom;

    /**
     * <p>The time at which the auto provisioning group expires. The period of time between this point in time and the point in time specified by <code>ValidFrom</code> is the validity period of the auto provisioning group.</p>
     * <p>Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
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
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123456789012****</p>
         */
        @NameInMap("AssumeRoleFor")
        public Long assumeRoleFor;

        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>34458433936495****:alice</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
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
         * <p>The ID of the automatic snapshot policy to apply to data disk N.</p>
         * <p>When you specify this parameter, take note of the following items:</p>
         * <ul>
         * <li>This parameter takes effect only when the AutoProvisioningGroupType parameter is set to instant.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sp-bp67acfmxazb4p****</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>Specifies whether to enable the performance burst feature for the system disk. Valid values:</p>
         * <ul>
         * <li>true: force attaches the disk to the instance.</li>
         * <li>false: disables the performance burst feature for the system disk.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is available only if you set LaunchConfiguration.DataDisk.N.Category to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
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
         * <li>cloud_efficiency: utra disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>cloud_essd: ESSD.</li>
         * <li>cloud: basic disk.</li>
         * </ul>
         * <p>For I/O optimized instances, the default value is cloud_efficiency. For non-I/O optimized instances, the default value is cloud.</p>
         * <p>When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Specifies whether to release data disk N when the instance to which the data disk is attached is released. Valid values:</p>
         * <ul>
         * <li>true: releases data disk N when the associated instance is released.</li>
         * <li>false: does not release data disk N when the associated instance is released.</li>
         * </ul>
         * <p>Default value: true.</p>
         * <p>When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        /**
         * <p>The description of data disk N. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>. When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>DataDisk_Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The mount point of data disk N. When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>/dev/vd1</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The name of data disk N. The name must be 2 to 128 characters in length. The name must start with a letter but cannot start with <code>http://</code> or <code>https://</code>. The name can contain letters, digits, periods (.), colons (:), underscores (_), and hyphens (-).</p>
         * <p>This parameter is left empty by default.</p>
         * <p>When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssdData</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
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
         * <li>true: encrypts system disk N.</li>
         * <li>false: does not encrypt system disk N.</li>
         * </ul>
         * <p>Default value: false. Valid values:</p>
         * <p>When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public Boolean encrypted;

        /**
         * <p>The ID of the Key Management Service (KMS) key to use for data disk N. When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("KmsKeyId")
        public String kmsKeyId;

        /**
         * <p>The performance level of the Enterprise SSD (ESSD) to use as data disk N. The value of N in this parameter must be the same as the value of N in <code>LaunchConfiguration.DataDisk.N.Category</code>. Valid values:</p>
         * <ul>
         * <li>PL0: A single ESSD can deliver up to 10000 random read/write IOPS.</li>
         * <li>PL1 (default): A single ESSD can deliver up to 50000 random read/write IOPS.</li>
         * <li>PL2: A single ESSD can deliver up to 100000 random read/write IOPS.</li>
         * <li>PL3: A single ESSD can deliver up to 1000000 random read/write IOPS.</li>
         * </ul>
         * <p>For information about ESSD performance levels, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
         * <p>When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The provisioned read/write IOPS of the ESSD AutoPL disk to use as the system disk. Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline IOPS}.</p>
         * <p>Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}.</p>
         * <blockquote>
         * <p> This parameter is available only if you set LaunchConfiguration.DataDisk.N.Category to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
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
         * <li><p>Valid values if you set LaunchConfiguration.DataDisk.N.Category to cloud_efficiency: 20 to 32768.</p>
         * </li>
         * <li><p>Valid values if you set LaunchConfiguration.DataDisk.N.Category to cloud_ssd: 20 to 32768.</p>
         * </li>
         * <li><p>Valid values if you set LaunchConfiguration.DataDisk.N.Category to cloud_essd: vary based on the <code>LaunchConfiguration.DataDisk.N.PerformanceLevel</code> value.</p>
         * <ul>
         * <li>Valid values if you set LaunchConfiguration.DataDisk.N.PerformanceLevel to PL0: 40 to 32768.</li>
         * <li>Valid values if you set LaunchConfiguration.DataDisk.N.PerformanceLevel to PL1: 20 to 32768.</li>
         * <li>Valid values if you set LaunchConfiguration.DataDisk.N.PerformanceLevel to PL2: 461 to 32768.</li>
         * <li>Valid values if you set LaunchConfiguration.DataDisk.N.PerformanceLevel to PL3: 1261 to 32768.</li>
         * </ul>
         * </li>
         * <li><p>Valid values if you set LaunchConfiguration.DataDisk.N.Category to cloud: 5 to 2000.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p> The value of this parameter must be greater than or equal to the size of the snapshot specified by <code>LaunchConfiguration.DataDisk.N.SnapshotId</code>.</p>
         * </blockquote>
         * <p>When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The ID of the snapshot to use to create data disk N. Valid values of N: 1 to 16.</p>
         * <p>If you specify this parameter, <code>LaunchConfiguration.DataDisk.N.Size</code> is ignored. The size of data disk N is the same as that of the snapshot specified by this parameter. Use snapshots created after July 15, 2013. Otherwise, an error is returned and your request is rejected.</p>
         * <p>When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.</p>
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
         * <p>The ID of the automatic snapshot policy to apply to the system disk.</p>
         * <p>When you specify this parameter, take note of the following items:</p>
         * <ul>
         * <li>This parameter takes effect only when the AutoProvisioningGroupType parameter is set to instant.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sp-bp67acfmxazb4p****</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>Specifies whether to enable the performance burst feature for the system disk. Valid values:</p>
         * <ul>
         * <li>true: force attaches the disk to the instance.</li>
         * <li>false: disables the performance burst feature for the system disk.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is available only if you set <code>LaunchConfiguration.SystemDisk.Category</code> to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>The algorithm to use to encrypt the system disk. Valid values:</p>
         * <ul>
         * <li>aes-256</li>
         * <li>sm4-128</li>
         * </ul>
         * <p>Default value: aes-256.</p>
         * <p>When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.</p>
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aes-256</p>
         */
        @NameInMap("EncryptAlgorithm")
        public String encryptAlgorithm;

        /**
         * <p>Specifies whether to encrypt the system disk. Valid values:</p>
         * <ul>
         * <li>true: encrypts system disk N.</li>
         * <li>false: does not encrypt system disk N.</li>
         * </ul>
         * <p>Default value: false. Valid values:</p>
         * <p>When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public String encrypted;

        /**
         * <p>The ID of the KMS key to use for system disk N.</p>
         * <p>When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The provisioned read/write IOPS of the ESSD AutoPL disk to use as the system disk. Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline IOPS}.</p>
         * <p>Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}.</p>
         * <blockquote>
         * <p> This parameter is available only if you set LaunchConfiguration.SystemDisk.Category to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
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
         * <p>The key of the tag. Valid values of N: 1 to 20. The tag key cannot be an empty string. It can be up to 128 characters in length and cannot start with acs: or aliyun. It cannot contain <code>http://</code> or <code>https://</code>. If both the LaunchTemplateId and LaunchConfiguration.* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. Valid values of N: 1 to 20. The tag value can be an empty string. It can be up to 128 characters in length. It cannot start with acs: or contain <code>http://</code> or <code>https://</code>. If both the LaunchTemplateId and LaunchConfiguration.* parameters are specified, the LaunchTemplateId parameter takes precedence.</p>
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
        @NameInMap("Core")
        public Integer core;

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
         * <p>Specifies whether the instance that uses the image supports logons of the ecs-user user. Valid value:</p>
         * <ul>
         * <li>true: The instance that uses the image supports logons of the ecs-user user.</li>
         * <li>false: The instance that uses the image does not support logons of the ecs-user user.</li>
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
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         */
        @NameInMap("Arn")
        public java.util.List<CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationArn> arn;

        /**
         * <p>The automatic release time of the pay-as-you-go instance. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in Coordinated Universal Time (UTC).</p>
         * <ul>
         * <li>If the value of <code>ss</code> is not <code>00</code>, the start time is automatically rounded down to the nearest minute based on the value of <code>mm</code>.</li>
         * <li>The specified time must be at least 30 minutes later than the current time.</li>
         * <li>The specified time can be at most three years later than the current time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2018-01-01T12:05:00Z</p>
         */
        @NameInMap("AutoReleaseTime")
        public String autoReleaseTime;

        /**
         * <p>The performance mode of the burstable instance. Valid values:</p>
         * <ul>
         * <li>Standard: the standard mode. For more information, see the &quot;Standard mode&quot; section in the <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a> topic.</li>
         * <li>Unlimited: the unlimited mode. For more information, see the &quot;Unlimited mode&quot; section in the <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a> topic.</li>
         * </ul>
         * <p>This parameter is empty by default.</p>
         * <p>When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("CreditSpecification")
        public String creditSpecification;

        /**
         * <p>The cloud disks in the extended configurations of the launch template.</p>
         */
        @NameInMap("DataDisk")
        public java.util.List<CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationDataDisk> dataDisk;

        /**
         * <p>The ID of the deployment set.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-bp1frxuzdg87zh4p****</p>
         */
        @NameInMap("DeploymentSetId")
        public String deploymentSetId;

        /**
         * <p>The instance hostname. Take note of the following items:</p>
         * <ul>
         * <li>The hostname cannot start or end with a period (.) or hyphen (-). The hostname cannot contain consecutive periods (.) or hyphens (-).</li>
         * <li>For Windows instances, the hostname must be 2 to 15 characters in length and cannot contain periods (.) or contain only digits. It can contain letters, digits, and hyphens (-).</li>
         * <li>For instances that run other operating systems such as Linux, the hostname must be 2 to 64 characters in length. You can use periods (.) to separate a hostname into multiple segments. Each segment can contain letters, digits, and hyphens (-).</li>
         * <li>You cannot specify both <code>LaunchConfiguration.HostName</code> and <code>LaunchConfiguration.HostNames.N</code>. Otherwise, an error is returned.</li>
         * <li>When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>k8s-node-[1,4]-ecshost</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The hostname of instance N. You can use this parameter to specify different hostnames for multiple instances. Take note of the following items:</p>
         * <ul>
         * <li>This parameter takes effect only when <code>AutoProvisioningGroupType</code> is set to instant. </li>
         * <li>The value of N indicates the number of instances. Valid values of N: 1 to 1000. The value of N must be the same as the TotalTargetCapacity value. </li>
         * <li>The hostname cannot start or end with a period (.) or hyphen (-). The hostname cannot contain consecutive periods (.) or hyphens (-). </li>
         * <li>For Windows instances, the hostname must be 2 to 15 characters in length and cannot contain periods (.) or contain only digits. The hostname can contain letters, digits, and hyphens (-). </li>
         * <li>For instances that run other operating systems such as Linux, the hostname must be 2 to 64 characters in length. You can use periods (.) to separate the hostname into multiple segments. Each segment can contain letters, digits, and hyphens (-). </li>
         * <li>You cannot specify both <code>LaunchConfiguration.HostName</code> and <code>LaunchConfiguration.HostNames.N</code>. Otherwise, an error is returned. </li>
         * <li>When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ecs-host-01</p>
         */
        @NameInMap("HostNames")
        public java.util.List<String> hostNames;

        /**
         * <p>The name of the image family. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with <code>aliyun</code> or <code>acs:</code>. The name cannot contain <code>http://</code> or <code>https://</code>. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>hangzhou-daily-update</p>
         */
        @NameInMap("ImageFamily")
        public String imageFamily;

        /**
         * <p>The ID of the image to be used to create the instance. You can call the <a href="https://help.aliyun.com/document_detail/25534.html">DescribeImages</a> operation to query available image resources. When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>m-bp1g7004ksh0oeuc****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The instance description. The description must be 2 to 256 characters in length. The description can contain letters and cannot start with <code>http://</code> or <code>https://</code>. When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance_Description</p>
         */
        @NameInMap("InstanceDescription")
        public String instanceDescription;

        /**
         * <p>The instance name. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. The name can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
         * <p>The default value of this parameter is the <code>InstanceId</code> value.</p>
         * <p>When you batch create instances, you can batch configure sequential names for the instances. For more information, see <a href="https://help.aliyun.com/document_detail/196048.html">Batch configure sequential names or hostnames for multiple instances</a>.</p>
         * <p>When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s-node-[1,4]-alibabacloud</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The billing method for network usage. Valid values:</p>
         * <ul>
         * <li>PayByBandwidth: pay-by-bandwidth</li>
         * <li>PayByTraffic: pay-by-traffic</li>
         * </ul>
         * <blockquote>
         * <p> When the pay-by-traffic billing method for network usage is used, the maximum inbound and outbound bandwidth values are used as the upper limits of bandwidth instead of guaranteed performance specifications. When demands outstrip resource supplies, the maximum bandwidths may be limited. If you want guaranteed bandwidth for your instance, use the pay-by-bandwidth billing method.</p>
         * </blockquote>
         * <p>When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>PayByTraffic</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>The maximum inbound public bandwidth. Unit: Mbit/s. Valid values:</p>
         * <ul>
         * <li>When the maximum outbound public bandwidth is less than or equal to 10 Mbit/s, the valid values of this parameter are 1 to 10 and the default value is 10.</li>
         * <li>When the maximum outbound public bandwidth is greater than 10 Mbit/s, the valid values of this parameter are 1 to the value of <code>LaunchConfiguration.InternetMaxBandwidthOut</code>, and the default value is the value of <code>LaunchConfiguration.InternetMaxBandwidthOut</code>.</li>
         * </ul>
         * <p>When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("InternetMaxBandwidthIn")
        public Integer internetMaxBandwidthIn;

        /**
         * <p>The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.</p>
         * <p>Default value: 0.</p>
         * <p>When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("InternetMaxBandwidthOut")
        public Integer internetMaxBandwidthOut;

        /**
         * <p>Specifies whether the instance is I/O optimized. Valid values:</p>
         * <ul>
         * <li>none: The instance is not I/O optimized.</li>
         * <li>optimized: The instance is I/O optimized.</li>
         * </ul>
         * <p>For instances of retired instance types, the default value is none. For instances of other instance types, the default value is optimized.</p>
         * <p>When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>optimized</p>
         */
        @NameInMap("IoOptimized")
        public String ioOptimized;

        /**
         * <p>The key pair name.</p>
         * <ul>
         * <li>For Windows instances, this parameter is ignored. This parameter is empty by default.</li>
         * <li>By default, password-based logon is disabled for Linux instances.</li>
         * </ul>
         * <p>When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>KeyPair_Name</p>
         */
        @NameInMap("KeyPairName")
        public String keyPairName;

        /**
         * <p>The instance password. The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The password can contain the following special characters:</p>
         * <p><code>( ) ` ~ ! @ # $ % ^ &amp; * - _ + = | { }  </code>: ; \&quot; &lt; &gt; , . ? /``  For Windows instances, the password cannot start with a forward slash (/). When both LaunchTemplateId and LaunchConfiguration.* parameters are specified, LaunchTemplateId takes precedence. `</p>
         * 
         * <strong>example:</strong>
         * <p>EcsV587!</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>Specifies whether to use the password preset in the image. Valid values:</p>
         * <ul>
         * <li>true: uses the password preset in the image.</li>
         * <li>false: does not use the password preset in the image.</li>
         * </ul>
         * <p>When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PasswordInherit")
        public Boolean passwordInherit;

        /**
         * <p>The name of the instance Resource Access Management (RAM) role. You can call the <a href="https://help.aliyun.com/document_detail/28713.html">ListRoles</a> operation provided by RAM to query the instance RAM roles that you created. When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>RAM_Name</p>
         */
        @NameInMap("RamRoleName")
        public String ramRoleName;

        /**
         * <p>The ID of the resource group to which to assign the instance. When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.</p>
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
         * <p>When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("SecurityEnhancementStrategy")
        public String securityEnhancementStrategy;

        /**
         * <p>The ID of the security group to which to assign the instance. When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp15ed6xe1yxeycg****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The IDs of the security groups to which the new ECS instances belong.</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>The system disk information of instances. When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.</p>
         */
        @NameInMap("SystemDisk")
        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationSystemDisk systemDisk;

        /**
         * <p>The category of the system disk. Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: ultra disk</li>
         * <li>cloud_ssd: standard SSD</li>
         * <li>cloud_essd: enhanced SSD (ESSD)</li>
         * <li>cloud: basic disk</li>
         * </ul>
         * <p>For non-I/O optimized instances of retired instance types, the default value is cloud. For other instances, the default value is cloud_efficiency.</p>
         * <p>When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        /**
         * <p>The description of the system disk. The description must be 2 to 256 characters in length. The description can contain letters and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * <p>When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>SystemDisk_Description</p>
         */
        @NameInMap("SystemDiskDescription")
        public String systemDiskDescription;

        /**
         * <p>The name of the system disk. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. The name can contain letters, digits, periods (.), colons (:), underscores (_), and hyphens (-).</p>
         * <p>This parameter is empty by default.</p>
         * <p>When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssdSystem</p>
         */
        @NameInMap("SystemDiskName")
        public String systemDiskName;

        /**
         * <p>The performance level of the ESSD to be used as the system disk. Valid values:</p>
         * <ul>
         * <li>PL0 (default): A single ESSD can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</li>
         * <li>PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <p>For more information about ESSD performance levels, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
         * <p>When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("SystemDiskPerformanceLevel")
        public String systemDiskPerformanceLevel;

        /**
         * <p>The size of the system disk. Valid values: 20 to 500. Unit: GiB. The value must be at least 20 and greater than or equal to the size of the image specified by LaunchConfiguration.ImageId.</p>
         * <p>Default value: 40 or the size of the image specified by LaunchConfiguration.ImageId, whichever is greater.</p>
         * <p>When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        /**
         * <p>The tag in the extended configurations of the launch template.</p>
         */
        @NameInMap("Tag")
        public java.util.List<CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationTag> tag;

        /**
         * <p>The instance user data. The user data must be encoded in Base64. The raw data can be up to 32 KB in size. When both LaunchTemplateId and LaunchConfiguration.\* parameters are specified, LaunchTemplateId takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>ZWNobyBoZWxsbyBlY3Mh</p>
         */
        @NameInMap("UserData")
        public String userData;

        /**
         * <p>Specifies whether to enable auto-renewal for the reserved instance. This parameter is required only when the instance uses the subscription billing method. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        /**
         * <p>The auto-renewal period of the instance. Valid values:</p>
         * <p>Valid values when PeriodUnit is set to Month: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AutoRenewPeriod")
        public Integer autoRenewPeriod;

        @NameInMap("CpuOptions")
        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationCpuOptions cpuOptions;

        /**
         * <p>The image options.</p>
         * <p>When you specify this parameter, take note of the following items:</p>
         * <ul>
         * <li>This parameter takes effect only when the AutoProvisioningGroupType parameter is set to instant.</li>
         * </ul>
         */
        @NameInMap("ImageOptions")
        public CreateAutoProvisioningGroupShrinkRequestLaunchConfigurationImageOptions imageOptions;

        /**
         * <p>The subscription period of the instance. The unit is specified by <code>PeriodUnit</code>. This parameter takes effect and is required only if the subscription billing method is selected. Valid values:</p>
         * <p>Valid values if PeriodUnit is set to Month: 1, 2, 3, 6, and 12.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The unit of the subscription period. Default value: Month. Valid values:</p>
         * <p>Month</p>
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
         * <p>The protection period of the spot instance. Unit: hours. Default value: 1. Valid values: Valid values:</p>
         * <ul>
         * <li>1: After a spot instance is created, Alibaba Cloud ensures that the instance is not automatically released within 1 hour. After the 1-hour protection period ends, the system compares the bid price with the market price and checks the resource inventory to determine whether to retain or release the instance.</li>
         * <li>0: After a spot instance is created, Alibaba Cloud does not ensure that the instance runs for 1 hour. The system compares the bid price with the market price and checks the resource inventory to determine whether to retain or release the instance.</li>
         * </ul>
         * <p>Alibaba Cloud sends an ECS system event to notify you 5 minutes before the instance is released. The spot instance is billed by second. We recommend that you specify an appropriate protection period based on your business requirements.</p>
         * <p>When you specify this parameter, take note of the following items:</p>
         * <ul>
         * <li>This parameter takes effect only when the AutoProvisioningGroupType parameter is set to instant.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SpotDuration")
        public Integer spotDuration;

        /**
         * <p>The interruption event of the spot instances. Valid values:</p>
         * <ul>
         * <li>Terminate: The instance is released.</li>
         * <li>Stop: The instance is stopped in economical mode.</li>
         * </ul>
         * <p>For information about the economical mode, see <a href="https://help.aliyun.com/document_detail/63353.html">Economical mode</a>.</p>
         * <p>Default value: Terminate.</p>
         * <p>When you specify this parameter, take note of the following items:</p>
         * <ul>
         * <li>This parameter takes effect only when the AutoProvisioningGroupType parameter is set to instant.</li>
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

    public static class CreateAutoProvisioningGroupShrinkRequestDataDiskConfig extends TeaModel {
        /**
         * <p>The category of data disk N. You can use this parameter to specify multiple disk categories, and the disk categories are prioritized in the order in which they are specified. If a specified disk category is unavailable, the system uses the next available disk category. Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: ultra disk</li>
         * <li>cloud_ssd: standard SSD</li>
         * <li>cloud_essd: ESSD</li>
         * <li>cloud: basic disk</li>
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
         * <p>The architectures of the instance types.</p>
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
         * <p>The numbers of vCPUs of instance types.</p>
         */
        @NameInMap("Cores")
        public java.util.List<Integer> cores;

        /**
         * <p>The instance types that you want to exclude.</p>
         */
        @NameInMap("ExcludedInstanceTypes")
        public java.util.List<String> excludedInstanceTypes;

        /**
         * <p>The ID of the image. You can use this parameter to specify the image that is used by the current resource pool. If you do not specify this parameter, the image that is configured in <code>LaunchConfiguration.ImageId</code> or the launch template is used by default. You can call the <a href="https://help.aliyun.com/document_detail/25534.html">DescribeImages</a> operation to query the available images. Note: This parameter is supported only when <code>AutoProvisioningGroupType</code> is set to instant.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_3_x64_20G_alibase_20210425.vhd</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The instance family level of the instance type in extended configuration N. This parameter is used to filter instance types. Valid values of Nextended configuration N, Valid values:</p>
         * <ul>
         * <li>EntryLevel: entry level (shared instance types). Instance types of this level are the most cost-effective but may not ensure stable computing performance. Instance types of this level are suitable for scenarios in which the CPU utilization is low. For more information, see <a href="https://help.aliyun.com/document_detail/108489.html">Shared instance families</a>.</li>
         * <li>EnterpriseLevel: enterprise level. Instance types of this level provide stable performance and dedicated resources and are suitable for business scenarios that require high stability. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a>.</li>
         * <li>CreditEntryLevel: credit entry level. This value is valid only for burstable instances. CPU credits are used to ensure computing performance. Instance types of this level are suitable for scenarios in which the CPU utilization is low but may fluctuate in specific cases. For information about burstable instances, see <a href="https://help.aliyun.com/document_detail/59977.html">Overview</a>.</li>
         * </ul>
         * <p>Valid values of N: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>EnterpriseLevel</p>
         */
        @NameInMap("InstanceFamilyLevel")
        public String instanceFamilyLevel;

        /**
         * <p>The instance type in extended configuration N. Valid values of N: 1 to 20. For information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g5.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The maximum price of spot instances in extended configuration N.</p>
         * <blockquote>
         * <p> If you specify one or more <code>LaunchTemplateConfig.N.*</code> parameters, you must also specify <code>LaunchTemplateConfig.N.MaxPrice</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxPrice")
        public Double maxPrice;

        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("MaxQuantity")
        public Integer maxQuantity;

        /**
         * <p>The memory sizes of instance types.</p>
         */
        @NameInMap("Memories")
        public java.util.List<Float> memories;

        /**
         * <p>The priority of extended configuration N. A value of 0 indicates the highest priority. Valid values: 0 to ∞.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The ID of the vSwitch in extended configuration N. The zone of the ECS instances created from the extended configuration is determined by the vSwitch.</p>
         * <blockquote>
         * <p> If you specify one or more <code>LaunchTemplateConfig.N.*</code> parameters, you must also specify <code>LaunchTemplateConfig.N.VSwitchId</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-sn5bsitu4lfzgc5o7****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The weight of the instance type in extended configuration N. A greater weight indicates that a single instance has more computing power and fewer instances are required. The value must be greater than 0.</p>
         * <p>The weight is calculated based on the computing power of the specified instance type and the minimum computing power of a single instance in the cluster to be created by the auto provisioning group. For example, assume that the minimum computing power of a single instance is 8 vCPUs and 60 GiB of memory.</p>
         * <ul>
         * <li>For an instance type with 8 vCPUs and 60 GiB of memory, you can set the weight to 1.</li>
         * <li>For an instance type with 16 vCPUs and 120 GiB of memory, you can set the weight to 2.</li>
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
         * <p>Details about the instance types. Duplicate instance types are not allowed and the instance types are within the LaunchTemplateConfig.InstanceType range.</p>
         */
        @NameInMap("InstanceTypes")
        public java.util.List<String> instanceTypes;

        /**
         * <p>The minimum number of instances to be delivered within the <code>InstanceTypes</code> range.</p>
         * <blockquote>
         * <p> <code>sum(MinTargetCapacity)&lt;= TotalTargetCapacity</code> indicates that the sum of MinTargetCapacity values of all instance types cannot exceed the TotalTargetCapacity value. If any instance type set cannot meet the MinTargetCapacity requirement due to insufficient inventory or other reasons, the entire request fails.</p>
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
         * <p>The minimum capacity set for different instance types. This parameter is valid only when <code>AutoProvisioningGroupType</code> is set to request.</p>
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
         * <p>The category of the system disk. You can specify multiple disk categories, and the disk categories are prioritized in the order in which they are specified. If a specified disk category is unavailable, the system uses the next available disk category. Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: ultra disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>cloud_essd: ESSD</li>
         * <li>cloud: basic disk.</li>
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
         * <p>The key of tag N to add to the auto provisioning group.</p>
         * <p>Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the auto provisioning group.</p>
         * <p>Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot contain http:// or https://.</p>
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
