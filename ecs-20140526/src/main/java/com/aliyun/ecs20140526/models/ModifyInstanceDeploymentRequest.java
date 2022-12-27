// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceDeploymentRequest extends TeaModel {
    // Specifies whether to associate the instance with a dedicated host. Valid values:
    // 
    // *   host: associates the instance with a dedicated host. When you start a stopped instance in economical mode, the instance remains on its original dedicated host.
    // *   default: does not associate the instance with a dedicated host. When you start a stopped instance in economical mode, the instance can be automatically deployed to another dedicated host in the automatic deployment resource pool if resources of the original dedicated host are insufficient.
    // 
    // If you want to migrate the instance from a shared host to a dedicated host, use the default value. Default value: default.
    @NameInMap("Affinity")
    public String affinity;

    // The ID of the dedicated host cluster.
    @NameInMap("DedicatedHostClusterId")
    public String dedicatedHostClusterId;

    // The ID of the destination dedicated host. You can call the [DescribeDedicatedHosts](~~134242~~) operation to query the most recent list of dedicated hosts.
    // 
    // When you migrate an instance from a shared host to a dedicated host or between dedicated hosts, take note of the following items:
    // 
    // *   To migrate the instance to a specific dedicated host, specify a value for this parameter.
    // *   To migrate the instance to a system-selected dedicated host, leave this parameter empty and set `Tenancy` to host.
    // 
    // For information about the automatic deployment feature, see [Features of dedicated hosts](~~118938~~).
    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    // The number of the deployment set group in which to deploy the instance in the destination deployment set. This parameter is valid only when the destination deployment set uses the high availability group strategy (AvailabilityGroup). Valid values: 1 to 7.
    // 
    // >  If you call this operation to deploy an instance to a deployment set that uses the high availability group strategy (`AvailablilityGroup`) and this parameter is left empty, the system evenly distributes ECS instances among the deployment set groups in the deployment set. If you call this operation to change the deployment set of an instance and specify the current deployment set of the instance as the destination deployment set, the system evenly distributes ECS instances again among the deployment set groups in the deployment set.
    @NameInMap("DeploymentSetGroupNo")
    public Integer deploymentSetGroupNo;

    // The ID of the destination deployment set.
    // 
    // This parameter is required when you add an ECS instance to a deployment set or change the deployment set of an instance.
    // 
    // >  You cannot change the deployment set when you modify the configurations of dedicated hosts, including parameters such as `Tenancy`, `Affinity`, and `DedicatedHostId`.
    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    // Specifies whether to forcibly change the host of the instance when the deployment set of the instance is changed. Valid values:
    // 
    // *   true: forcibly changes the host of the instance when the deployment set of the instance is changed. Hosts can be forcibly changed only for instances in the Running or Stopped state. The instances in the Stopped state do not include pay-as-you-go instances that are stopped in economical mode.
    // 
    //     > If the specified ECS instance has local disks attached, the local disks are forcibly changed when the host of the instance is forcibly changed. This may cause data loss in the local disks. Proceed with caution.
    // 
    // *   false: does not forcibly change the host of the instance when the deployment set of the instance is changed. You can add the instance to a deployment set only when the instance remains on the current host. When the Force parameter is set to false, the deployment set may fail to be changed.
    // 
    // Default value: false.
    @NameInMap("Force")
    public Boolean force;

    // The IDs of instances.
    @NameInMap("InstanceId")
    public String instanceId;

    // The instance type to which the instance is changed. You can call the [DescribeInstanceTypes](~~25620~~) operation to query the most recent list of instance types.
    // 
    // You can change the instance type of the ECS instance when you migrate the instance to a dedicated host. The new instance type must match the type of the specified dedicated host. For more information, see [Dedicated host types](~~68564~~).
    // 
    // *   If you specify this parameter, you must also specify the `DedicatedHostId` parameter.
    // *   You cannot change the instance type of the ECS instance if you use the automatic deployment feature to migrate the instance.
    @NameInMap("InstanceType")
    public String instanceType;

    // Specifies whether to stop the instance before it is migrated to the destination dedicated host. Valid values:
    // 
    // *   reboot: stops the instance before it is migrated.
    // *   live: migrates the instance without stopping it. If you set the MigrationType parameter to live, you must specify the DedicatedHostId parameter. In this case, you cannot change the instance type of the ECS instance when the instance is migrated.
    // 
    // Default value: reboot.
    @NameInMap("MigrationType")
    public String migrationType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The region ID of the instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // Specifies whether to remove the selected instance from the selected deployment set. Valid values:
    // 
    // *   true.
    // *   false.
    // 
    // Default value: false.
    // 
    // >  If you set this parameter to true, you must specify the InstanceId of the selected ECS instance and DeploymentSetId of the deployment set to which the ECS instance belongs.
    @NameInMap("RemoveFromDeploymentSet")
    public Boolean removeFromDeploymentSet;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // Specifies whether to deploy the instance on a dedicated host. Set the value to host to deploy the instance on a dedicated host.
    @NameInMap("Tenancy")
    public String tenancy;

    public static ModifyInstanceDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceDeploymentRequest self = new ModifyInstanceDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceDeploymentRequest setAffinity(String affinity) {
        this.affinity = affinity;
        return this;
    }
    public String getAffinity() {
        return this.affinity;
    }

    public ModifyInstanceDeploymentRequest setDedicatedHostClusterId(String dedicatedHostClusterId) {
        this.dedicatedHostClusterId = dedicatedHostClusterId;
        return this;
    }
    public String getDedicatedHostClusterId() {
        return this.dedicatedHostClusterId;
    }

    public ModifyInstanceDeploymentRequest setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public ModifyInstanceDeploymentRequest setDeploymentSetGroupNo(Integer deploymentSetGroupNo) {
        this.deploymentSetGroupNo = deploymentSetGroupNo;
        return this;
    }
    public Integer getDeploymentSetGroupNo() {
        return this.deploymentSetGroupNo;
    }

    public ModifyInstanceDeploymentRequest setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    public ModifyInstanceDeploymentRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public ModifyInstanceDeploymentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceDeploymentRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ModifyInstanceDeploymentRequest setMigrationType(String migrationType) {
        this.migrationType = migrationType;
        return this;
    }
    public String getMigrationType() {
        return this.migrationType;
    }

    public ModifyInstanceDeploymentRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyInstanceDeploymentRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyInstanceDeploymentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyInstanceDeploymentRequest setRemoveFromDeploymentSet(Boolean removeFromDeploymentSet) {
        this.removeFromDeploymentSet = removeFromDeploymentSet;
        return this;
    }
    public Boolean getRemoveFromDeploymentSet() {
        return this.removeFromDeploymentSet;
    }

    public ModifyInstanceDeploymentRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyInstanceDeploymentRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyInstanceDeploymentRequest setTenancy(String tenancy) {
        this.tenancy = tenancy;
        return this;
    }
    public String getTenancy() {
        return this.tenancy;
    }

}
