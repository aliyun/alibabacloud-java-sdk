// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyAutoProvisioningGroupRequest extends TeaModel {
    /**
     * <p>The auto-provisioning group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>apg-bp67acfmxazb4ph****</p>
     */
    @NameInMap("AutoProvisioningGroupId")
    public String autoProvisioningGroupId;

    /**
     * <p>The name of the auto-provisioning group. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https://.<a href="http://https://%E3%80%82%E3%80%81%EF%BC%88:%EF%BC%89%E3%80%81%EF%BC%88_%EF%BC%89%EF%BC%88-%EF%BC%89%E3%80%82"> It can contain letters, digits, colons (:), underscores (_), and hyphens (-).</a></p>
     * 
     * <strong>example:</strong>
     * <p>apg-test</p>
     */
    @NameInMap("AutoProvisioningGroupName")
    public String autoProvisioningGroupName;

    /**
     * <p>The type of supplemental instances. When the sum of the PayAsYouGoTargetCapacity and SpotTargetCapacity values is smaller than the TotalTargetCapacity value, the auto-provisioning group creates instances of the specified type to meet the target capacity. Valid values:</p>
     * <ul>
     * <li>PayAsYouGo: pay-as-you-go instances</li>
     * <li>Spot: spot instances</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Spot</p>
     */
    @NameInMap("DefaultTargetCapacityType")
    public String defaultTargetCapacityType;

    /**
     * <p>Specifies whether to release the removed instances when the real-time capacity of the auto-provisioning group exceeds the target capacity and a scale-in event is triggered. Valid values:</p>
     * <ul>
     * <li>termination: releases the removed instances.</li>
     * <li>no-termination: removes the instances from the auto-provisioning group but does not release them.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>no-termination</p>
     */
    @NameInMap("ExcessCapacityTerminationPolicy")
    public String excessCapacityTerminationPolicy;

    /**
     * <p>The extended configurations of the launch template.</p>
     */
    @NameInMap("LaunchTemplateConfig")
    public java.util.List<ModifyAutoProvisioningGroupRequestLaunchTemplateConfig> launchTemplateConfig;

    /**
     * <p>The maximum price of spot instances in the auto-provisioning group.</p>
     * <blockquote>
     * <p>When both the MaxSpotPrice and LaunchTemplateConfig.N.MaxPrice parameters are specified, the smaller one of the two parameter values is used. The LaunchTemplateConfig.N.MaxPrice parameter is specified when the auto-provisioning group is created, and cannot be modified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0.5</p>
     */
    @NameInMap("MaxSpotPrice")
    public Float maxSpotPrice;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The target capacity of pay-as-you-go instances in the auto-provisioning group. Valid values: Set this parameter to a value smaller than the TotalTargetCapacity value.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PayAsYouGoTargetCapacity")
    public String payAsYouGoTargetCapacity;

    /**
     * <p>The region ID of the auto-provisioning group. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The target capacity of spot instances in the auto-provisioning group. Valid values: Set this parameter to a value smaller than the TotalTargetCapacity value.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("SpotTargetCapacity")
    public String spotTargetCapacity;

    /**
     * <p>Specifies whether to release instances that are located in the auto-provisioning group after the group expires. Valid values:</p>
     * <ul>
     * <li>true: releases instances that are located in the auto-provisioning group.</li>
     * <li>false: removes instances from the auto-provisioning group but does not release them.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("TerminateInstancesWithExpiration")
    public Boolean terminateInstancesWithExpiration;

    /**
     * <p>The total target capacity of the auto-provisioning group. The value must be a positive integer.</p>
     * <p>The total target capacity of the auto-provisioning group must be greater than or equal to the sum of the target capacity of pay-as-you-go instances specified by the PayAsYouGoTargetCapacity parameter as well as the target capacity of spot instances specified by the SpotTargetCapacity parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>70</p>
     */
    @NameInMap("TotalTargetCapacity")
    public String totalTargetCapacity;

    public static ModifyAutoProvisioningGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoProvisioningGroupRequest self = new ModifyAutoProvisioningGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAutoProvisioningGroupRequest setAutoProvisioningGroupId(String autoProvisioningGroupId) {
        this.autoProvisioningGroupId = autoProvisioningGroupId;
        return this;
    }
    public String getAutoProvisioningGroupId() {
        return this.autoProvisioningGroupId;
    }

    public ModifyAutoProvisioningGroupRequest setAutoProvisioningGroupName(String autoProvisioningGroupName) {
        this.autoProvisioningGroupName = autoProvisioningGroupName;
        return this;
    }
    public String getAutoProvisioningGroupName() {
        return this.autoProvisioningGroupName;
    }

    public ModifyAutoProvisioningGroupRequest setDefaultTargetCapacityType(String defaultTargetCapacityType) {
        this.defaultTargetCapacityType = defaultTargetCapacityType;
        return this;
    }
    public String getDefaultTargetCapacityType() {
        return this.defaultTargetCapacityType;
    }

    public ModifyAutoProvisioningGroupRequest setExcessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
        return this;
    }
    public String getExcessCapacityTerminationPolicy() {
        return this.excessCapacityTerminationPolicy;
    }

    public ModifyAutoProvisioningGroupRequest setLaunchTemplateConfig(java.util.List<ModifyAutoProvisioningGroupRequestLaunchTemplateConfig> launchTemplateConfig) {
        this.launchTemplateConfig = launchTemplateConfig;
        return this;
    }
    public java.util.List<ModifyAutoProvisioningGroupRequestLaunchTemplateConfig> getLaunchTemplateConfig() {
        return this.launchTemplateConfig;
    }

    public ModifyAutoProvisioningGroupRequest setMaxSpotPrice(Float maxSpotPrice) {
        this.maxSpotPrice = maxSpotPrice;
        return this;
    }
    public Float getMaxSpotPrice() {
        return this.maxSpotPrice;
    }

    public ModifyAutoProvisioningGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyAutoProvisioningGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyAutoProvisioningGroupRequest setPayAsYouGoTargetCapacity(String payAsYouGoTargetCapacity) {
        this.payAsYouGoTargetCapacity = payAsYouGoTargetCapacity;
        return this;
    }
    public String getPayAsYouGoTargetCapacity() {
        return this.payAsYouGoTargetCapacity;
    }

    public ModifyAutoProvisioningGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyAutoProvisioningGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyAutoProvisioningGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyAutoProvisioningGroupRequest setSpotTargetCapacity(String spotTargetCapacity) {
        this.spotTargetCapacity = spotTargetCapacity;
        return this;
    }
    public String getSpotTargetCapacity() {
        return this.spotTargetCapacity;
    }

    public ModifyAutoProvisioningGroupRequest setTerminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
        this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
        return this;
    }
    public Boolean getTerminateInstancesWithExpiration() {
        return this.terminateInstancesWithExpiration;
    }

    public ModifyAutoProvisioningGroupRequest setTotalTargetCapacity(String totalTargetCapacity) {
        this.totalTargetCapacity = totalTargetCapacity;
        return this;
    }
    public String getTotalTargetCapacity() {
        return this.totalTargetCapacity;
    }

    public static class ModifyAutoProvisioningGroupRequestLaunchTemplateConfig extends TeaModel {
        /**
         * <p>The instance type in extended configuration N. Valid values of N: 1 to 20. For more information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g5.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The maximum price of spot instances in extended configuration N.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxPrice")
        public Double maxPrice;

        /**
         * <p>The priority of extended configuration N. A value of 0 indicates the highest priority. The value must be greater than 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The ID of the vSwitch in extended configuration N. The zone of the instances created from the extended configuration is determined by the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-sn5bsitu4lfzgc5o7****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The weight of the instance type specified in the extended configuration. A greater weight indicates that a single instance has more computing power and fewer instances are required. The value must be greater than 0.</p>
         * <p>The weight is calculated based on the computing power of the instance type and the minimum computing power of a single instance in the cluster that can created by the auto-provisioning group. For example, assume that the minimum computing power of a single instance is 8 vCPUs and 60 GiB of memory.</p>
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

        public static ModifyAutoProvisioningGroupRequestLaunchTemplateConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyAutoProvisioningGroupRequestLaunchTemplateConfig self = new ModifyAutoProvisioningGroupRequestLaunchTemplateConfig();
            return TeaModel.build(map, self);
        }

        public ModifyAutoProvisioningGroupRequestLaunchTemplateConfig setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ModifyAutoProvisioningGroupRequestLaunchTemplateConfig setMaxPrice(Double maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }
        public Double getMaxPrice() {
            return this.maxPrice;
        }

        public ModifyAutoProvisioningGroupRequestLaunchTemplateConfig setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ModifyAutoProvisioningGroupRequestLaunchTemplateConfig setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ModifyAutoProvisioningGroupRequestLaunchTemplateConfig setWeightedCapacity(Double weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public Double getWeightedCapacity() {
            return this.weightedCapacity;
        }

    }

}
