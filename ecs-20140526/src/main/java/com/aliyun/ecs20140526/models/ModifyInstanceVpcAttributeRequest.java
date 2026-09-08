// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceVpcAttributeRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>When you call this operation, the ECS instance must be in the <strong>Stopped</strong> (<code>Stopped</code>) state. For other restrictions on the instance, read the <strong>Operation description</strong> section carefully.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1iudwa5b1tqag1****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The new private IP address.</p>
     * <blockquote>
     * <p>The PrivateIpAddress parameter depends on VSwitchId. The specified IP address must be within the CIDR block of the vSwitch.</p>
     * </blockquote>
     * <p>Default value: If this parameter is not specified, an IP address is randomly assigned from the CIDR block of the vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p><code>172.17.**.**</code></p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The list of security group IDs that the instance joins after the VPC is modified. This parameter is required only when the VpcId parameter is specified.</p>
     * <ul>
     * <li>The VPC of the security group must match the target VPC.</li>
     * <li>Specifies the list of security groups that the instance joins after the modification. You can specify one or more security groups. The number of security groups is subject to the limit on the number of security groups that an instance can join. For more information, see <a href="~~25412#SecurityGroupQuota1~~">Limits</a>.</li>
     * <li>All security groups in the list must be of the same type.</li>
     * <li>Switching between security group types is supported.
     *     When an ECS instance switches between security group types, make sure that you understand the differences in the security group rule configurations of the two security group types to avoid affecting the instance network. For more information, see <a href="https://help.aliyun.com/document_detail/25387.html">Security group overview</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sg-o6w9l8bc8dgmkw87****</p>
     */
    @NameInMap("SecurityGroupId")
    public java.util.List<String> securityGroupId;

    /**
     * <p>The vSwitch ID.</p>
     * <ul>
     * <li>If the specified ID is the current vSwitch of the instance, the vSwitch of the instance remains unchanged.</li>
     * <li>If the specified ID is a new vSwitch and the VpcId parameter is not specified, the new and original vSwitches must belong to the same zone and the same VPC.</li>
     * <li>If the VpcId parameter is specified, the vSwitch ID specified in this parameter must belong to the VpcId and must be in the same zone as the original vSwitch.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1s5fnvk4gn3tw12****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The target VPC ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1vwnn14rqpyiczj****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static ModifyInstanceVpcAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceVpcAttributeRequest self = new ModifyInstanceVpcAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceVpcAttributeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceVpcAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyInstanceVpcAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyInstanceVpcAttributeRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public ModifyInstanceVpcAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyInstanceVpcAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyInstanceVpcAttributeRequest setSecurityGroupId(java.util.List<String> securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public java.util.List<String> getSecurityGroupId() {
        return this.securityGroupId;
    }

    public ModifyInstanceVpcAttributeRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public ModifyInstanceVpcAttributeRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
