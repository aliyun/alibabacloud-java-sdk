// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceDeploymentRequest extends TeaModel {
    /**
     * <p>Specifies whether to associate the instance with a dedicated host. Valid values:</p>
     * <ul>
     * <li>host: associates the instance with a dedicated host. When you start a stopped instance in economical mode, the instance remains on its original dedicated host.</li>
     * <li>default: does not associate the instance with a dedicated host. When you start a stopped instance in economical mode, the instance can be automatically deployed to another dedicated host in the automatic deployment resource pool if the resources of the original dedicated host are insufficient.</li>
     * </ul>
     * <p>If you want to migrate the instance from a shared host to a dedicated host, use the default value. Default value: default.</p>
     * 
     * <strong>example:</strong>
     * <p>host</p>
     */
    @NameInMap("Affinity")
    public String affinity;

    /**
     * <p>The ID of the dedicated host cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>dc-bp67acfmxazb4ph****</p>
     */
    @NameInMap("DedicatedHostClusterId")
    public String dedicatedHostClusterId;

    /**
     * <p>The ID of the destination dedicated host. You can call the <a href="https://help.aliyun.com/document_detail/134242.html">DescribeDedicatedHosts</a> operation to query the most recent list of dedicated hosts.</p>
     * <p>When you migrate an instance from a shared host to a dedicated host or between dedicated hosts, take note of the following items:</p>
     * <ul>
     * <li>To migrate the instance to a specific dedicated host, specify this parameter.</li>
     * <li>To migrate the instance to a system-selected dedicated host, leave this parameter empty and set <code>Tenancy</code> to host.</li>
     * </ul>
     * <p>For information about the automatic deployment feature, see <a href="https://help.aliyun.com/document_detail/118938.html">Functions and features</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>dh-bp67acfmxazb4ph****</p>
     */
    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    /**
     * <p>The number of the deployment set group in which to deploy the instance in the destination deployment set. This parameter is valid only when the destination deployment set uses the high availability group strategy (AvailabilityGroup). Valid values: 1 to 7.</p>
     * <blockquote>
     * <p>If you call this operation to deploy an instance to a deployment set that uses the high availability group strategy (<code>AvailablilityGroup</code>) and leave this parameter empty, the system evenly distributes instances among the deployment set groups in the deployment set. If you call this operation to change the deployment set of an instance and specify the current deployment set of the instance as the destination deployment set, the system evenly distributes instances again among the deployment set groups in the deployment set.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("DeploymentSetGroupNo")
    public Integer deploymentSetGroupNo;

    /**
     * <p>The ID of the destination deployment set.</p>
     * <p>This parameter is required when you add an instance to a deployment set or change the deployment set of an instance.</p>
     * <blockquote>
     * <p>You cannot change the deployment set when you modify dedicated host configurations, including the <code>Tenancy</code>, <code>Affinity</code>, and <code>DedicatedHostId</code> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ds-bp67acfmxazb4ph****</p>
     */
    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    /**
     * <p>Specifies whether to forcefully change the host of the instance when the deployment set of the instance is changed. Valid values:</p>
     * <ul>
     * <li><p>true: forcefully changes the host of the instance when the deployment set of the instance is changed. Hosts can be forcefully changed only for instances in the Running (Running) or Stopped (Stopped) state. The instances that are in the Stopped (Stopped) state do not include pay-as-you-go instances that are stopped in economical mode.</p>
     * <p>**</p>
     * <p><strong>Note</strong> If the specified instance has local disks attached, the local disks are forcefully changed when the host of the instance is forcefully changed. This may cause data loss in the local disks. Proceed with caution.</p>
     * </li>
     * <li><p>false: does not forcefully change the host of the instance when the deployment set of the instance is changed. You can add the instance to a deployment set only when the instance remains on the current host. When the Force parameter is set to false, the deployment set may fail to be changed.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp67acfmxazb4ph***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance type to which the instance is changed. You can call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to query the most recent list of instance types.</p>
     * <p>You can change the instance type of an instance when you migrate the instance to a dedicated host. The new instance type must match the type of the specified dedicated host. For more information, see <a href="https://help.aliyun.com/document_detail/68564.html">Dedicated host types</a>.</p>
     * <ul>
     * <li>If you specify this parameter, you must also specify <code>DedicatedHostId</code>.</li>
     * <li>You cannot change the instance type of an instance if you use the automatic deployment feature to migrate the instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ecs.c6.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>Specifies whether to stop the instance before it is migrated to the destination dedicated host. Valid values:</p>
     * <ul>
     * <li>reboot: stops the instance before it is migrated.</li>
     * <li>live: migrates the instance without stopping it. If you set MigrationType to live, you must specify DedicatedHostId. In this case, you cannot change the instance type of the instance when the instance is migrated.</li>
     * </ul>
     * <p>Default value: reboot.</p>
     * 
     * <strong>example:</strong>
     * <p>live</p>
     */
    @NameInMap("MigrationType")
    public String migrationType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to remove the specified instance from the specified deployment set. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>If you set this parameter to true, you must specify InstanceId and DeploymentSetId and make sure that the specified instance belongs to the specified deployment set.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RemoveFromDeploymentSet")
    public Boolean removeFromDeploymentSet;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to deploy the instance on a dedicated host. Set the value to host, which indicates that the instance is deployed on a dedicated host.</p>
     * 
     * <strong>example:</strong>
     * <p>host</p>
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
