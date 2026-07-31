// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceVpcAttributeRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>When you call this operation, the ECS instance must be in the <strong>Stopped</strong> state. For other restrictions on the instance, carefully read the <strong>operation description</strong> section.</p>
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
     * <p>The <code>PrivateIpAddress</code> parameter depends on <code>VSwitchId</code>. The specified IP address must be within the CIDR block of the vSwitch.</p>
     * </blockquote>
     * <p>Default value: If this parameter is not specified, a private IP address is randomly assigned from the CIDR block of the vSwitch.</p>
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
     * <p>The IDs of the security groups to which the instance is added after the VPC is changed. This parameter is required only when the <code>VpcId</code> parameter is specified.</p>
     * <ul>
     * <li>The security groups must belong to the destination VPC.</li>
     * <li>You can specify one or more security groups. The number of security groups is subject to the limits on the number of security groups to which an instance can belong. For more information, see <a href="~~25412#SecurityGroupQuota1~~">Limits</a>.</li>
     * <li>All security groups in the list must be of the same type.</li>
     * <li>Switching between security group types is supported. When you switch an ECS instance between security group types, make sure that you understand the differences in security group rule configurations between the two types to avoid impacts on instance networking. For more information, see <a href="https://help.aliyun.com/document_detail/25387.html">Security group overview</a>.</li>
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
     * <li>If the specified ID is the current vSwitch of the instance, the vSwitch remains unchanged.</li>
     * <li>If the specified ID is a new vSwitch and the <code>VpcId</code> parameter is empty, the new and old vSwitches must belong to the same zone and the same VPC.</li>
     * <li>If the <code>VpcId</code> parameter is not empty, the vSwitch specified by this parameter must belong to the specified VPC and must be in the same zone as the original vSwitch.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1s5fnvk4gn3tw12****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the destination VPC.</p>
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
