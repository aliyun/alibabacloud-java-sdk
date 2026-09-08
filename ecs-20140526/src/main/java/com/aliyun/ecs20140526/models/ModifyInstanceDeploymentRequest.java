// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceDeploymentRequest extends TeaModel {
    /**
     * <p>Specifies whether the instance is associated with the dedicated host. Valid values:</p>
     * <ul>
     * <li><p>host: The instance is associated with the dedicated host. When an instance that has economical mode enabled is restarted after being stopped, the instance is still deployed on the original dedicated host.</p>
     * </li>
     * <li><p>default: The instance is not associated with the dedicated host. When an instance that has economical mode enabled is restarted after being stopped, if the resources of the original dedicated host are insufficient, the instance can be migrated to another dedicated host in the automatic deployment resource pool.</p>
     * </li>
     * </ul>
     * <p>Default value when migrating an instance from a shared host to a dedicated host: default.</p>
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
     * <p>The ID of the dedicated host. You can call <a href="https://help.aliyun.com/document_detail/134242.html">DescribeDedicatedHosts</a> to query available dedicated hosts.</p>
     * <p>When you modify the host of an ECS instance (migrate the instance from a shared host to a dedicated host or between dedicated hosts):</p>
     * <ul>
     * <li>To migrate the instance to a specified dedicated host, you must specify this parameter.</li>
     * <li>To migrate the instance to a dedicated host that is automatically selected by the system, you must set this parameter to empty and set the <code>Tenancy</code> parameter to host.</li>
     * </ul>
     * <p>For more information about the automatic deployment feature, see <a href="https://help.aliyun.com/document_detail/118938.html">Features of dedicated hosts</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>dh-bp67acfmxazb4ph****</p>
     */
    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    /**
     * <p>The group number of the instance in the deployment set when the deployment set uses the availability group strategy (AvailabilityGroup). Valid values: 1 to 7.</p>
     * <blockquote>
     * <p>If you change the deployment set of an ECS instance and the deployment set uses the availability group strategy (<code>AvailablilityGroup</code>), the system automatically distributes ECS instances evenly across groups when this parameter is not specified. If you specify the same deployment set that the instance currently belongs to, the system also redistributes ECS instances evenly across groups.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("DeploymentSetGroupNo")
    public Integer deploymentSetGroupNo;

    /**
     * <p>The ID of the deployment set.</p>
     * <p>This parameter is required when you add an ECS instance to a deployment set or change the deployment set of an ECS instance.</p>
     * <blockquote>
     * <p>When you modify dedicated host-related parameters (<code>Tenancy</code>, <code>Affinity</code>, and <code>DedicatedHostId</code>), you cannot modify the deployment set at the same time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ds-bp67acfmxazb4ph****</p>
     */
    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    /**
     * <p>Specifies whether to forcefully change the host when the instance is added to a deployment set. Valid values:</p>
     * <ul>
     * <li><p>true: Allows the operation. Allows restarting ECS instances in the Running or Stopped state. Stopped instances do not include pay-as-you-go ECS instances that have economical mode enabled.</p>
     * <blockquote>
     * <p>If the specified ECS instance has local disks attached, the local disks are also forcefully replaced. This may cause data loss on the local disks during host replacement. Proceed with caution.</p>
     * </blockquote>
     * </li>
     * <li><p>false: Does not allow the operation. The instance is added to the deployment set only on the current host. This may cause the deployment set change to fail.</p>
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
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp67acfmxazb4ph***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The target instance type of the ECS instance. You can call <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> to query the most recent instance type list.</p>
     * <p>When you modify the host of an ECS instance, you can also change ECS instance type. The target instance type must match the specifications of the specified dedicated host. For more information, see <a href="https://help.aliyun.com/document_detail/68564.html">Dedicated host types</a>.</p>
     * <ul>
     * <li>To change ECS instance type, you must specify the dedicated host ID by setting the <code>DedicatedHostId</code> parameter.</li>
     * <li>You cannot change ECS instance type when using the automatic deployment feature to migrate an ECS instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ecs.c6.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>Specifies whether to stop ECS instance before migrating it to the destination dedicated host. Valid values:</p>
     * <ul>
     * <li><p>reboot: Stops ECS instance before migration.</p>
     * </li>
     * <li><p>live: Migrates ECS instance without stopping it. In this case, you must specify the DedicatedHostId parameter. This value does not support changing ECS instance type while migrating ECS instance.</p>
     * </li>
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
     * <p>The region ID of the instance. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to remove the selected instance from the selected deployment set. Valid values:</p>
     * <ul>
     * <li><p>true: Yes.</p>
     * </li>
     * <li><p>false: No.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>When this parameter is set to true, you must specify the InstanceId and DeploymentSetId that have an ownership relationship.</p>
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
     * <p>Specifies whether the instance is deployed on a dedicated host. Valid values: host. The instance is deployed only on a dedicated host.</p>
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
