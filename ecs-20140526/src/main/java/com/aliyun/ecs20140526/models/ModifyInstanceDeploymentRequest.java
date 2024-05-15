// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceDeploymentRequest extends TeaModel {
    /**
     * <p>Specifies whether to associate the instance with a dedicated host. Valid values:</p>
     * <br>
     * <p>*   host: associates the instance with a dedicated host. When you start a stopped instance in economical mode, the instance remains on its original dedicated host.</p>
     * <p>*   default: does not associate the instance with a dedicated host. When you start a stopped instance in economical mode, the instance can be automatically deployed to another dedicated host in the automatic deployment resource pool if the resources of the original dedicated host are insufficient.</p>
     * <br>
     * <p>If you want to migrate the instance from a shared host to a dedicated host, use the default value. Default value: default.</p>
     */
    @NameInMap("Affinity")
    public String affinity;

    /**
     * <p>The ID of the dedicated host cluster.</p>
     */
    @NameInMap("DedicatedHostClusterId")
    public String dedicatedHostClusterId;

    /**
     * <p>The ID of the destination dedicated host. You can call the [DescribeDedicatedHosts](https://help.aliyun.com/document_detail/134242.html) operation to query the most recent list of dedicated hosts.</p>
     * <br>
     * <p>When you migrate an instance from a shared host to a dedicated host or between dedicated hosts, take note of the following items:</p>
     * <br>
     * <p>*   To migrate the instance to a specific dedicated host, specify this parameter.</p>
     * <p>*   To migrate the instance to a system-selected dedicated host, leave this parameter empty and set `Tenancy` to host.</p>
     * <br>
     * <p>For information about the automatic deployment feature, see [Functions and features](https://help.aliyun.com/document_detail/118938.html).</p>
     */
    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    /**
     * <p>The number of the deployment set group in which to deploy the instance in the destination deployment set. This parameter is valid only when the destination deployment set uses the high availability group strategy (AvailabilityGroup). Valid values: 1 to 7.</p>
     * <br>
     * <p>> If you call this operation to deploy an instance to a deployment set that uses the high availability group strategy (`AvailablilityGroup`) and leave this parameter empty, the system evenly distributes instances among the deployment set groups in the deployment set. If you call this operation to change the deployment set of an instance and specify the current deployment set of the instance as the destination deployment set, the system evenly distributes instances again among the deployment set groups in the deployment set.</p>
     */
    @NameInMap("DeploymentSetGroupNo")
    public Integer deploymentSetGroupNo;

    /**
     * <p>The ID of the destination deployment set.</p>
     * <br>
     * <p>This parameter is required when you add an instance to a deployment set or change the deployment set of an instance.</p>
     * <br>
     * <p>> You cannot change the deployment set when you modify dedicated host configurations, including the `Tenancy`, `Affinity`, and `DedicatedHostId` parameters.</p>
     */
    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    /**
     * <p>Specifies whether to forcefully change the host of the instance when the deployment set of the instance is changed. Valid values:</p>
     * <br>
     * <p>*   true: forcefully changes the host of the instance when the deployment set of the instance is changed. Hosts can be forcefully changed only for instances in the Running (Running) or Stopped (Stopped) state. The instances that are in the Stopped (Stopped) state do not include pay-as-you-go instances that are stopped in economical mode.</p>
     * <br>
     * <p>    **</p>
     * <br>
     * <p>    **Note** If the specified instance has local disks attached, the local disks are forcefully changed when the host of the instance is forcefully changed. This may cause data loss in the local disks. Proceed with caution.</p>
     * <br>
     * <p>*   false: does not forcefully change the host of the instance when the deployment set of the instance is changed. You can add the instance to a deployment set only when the instance remains on the current host. When the Force parameter is set to false, the deployment set may fail to be changed.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance type to which the instance is changed. You can call the [DescribeInstanceTypes](https://help.aliyun.com/document_detail/25620.html) operation to query the most recent list of instance types.</p>
     * <br>
     * <p>You can change the instance type of an instance when you migrate the instance to a dedicated host. The new instance type must match the type of the specified dedicated host. For more information, see [Dedicated host types](https://help.aliyun.com/document_detail/68564.html).</p>
     * <br>
     * <p>*   If you specify this parameter, you must also specify `DedicatedHostId`.</p>
     * <p>*   You cannot change the instance type of an instance if you use the automatic deployment feature to migrate the instance.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>Specifies whether to stop the instance before it is migrated to the destination dedicated host. Valid values:</p>
     * <br>
     * <p>*   reboot: stops the instance before it is migrated.</p>
     * <p>*   live: migrates the instance without stopping it. If you set MigrationType to live, you must specify DedicatedHostId. In this case, you cannot change the instance type of the instance when the instance is migrated.</p>
     * <br>
     * <p>Default value: reboot.</p>
     */
    @NameInMap("MigrationType")
    public String migrationType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to remove the specified instance from the specified deployment set. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>Default value: false.</p>
     * <br>
     * <p>> If you set this parameter to true, you must specify InstanceId and DeploymentSetId and make sure that the specified instance belongs to the specified deployment set.</p>
     */
    @NameInMap("RemoveFromDeploymentSet")
    public Boolean removeFromDeploymentSet;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to deploy the instance on a dedicated host. Set the value to host, which indicates that the instance is deployed on a dedicated host.</p>
     */
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
