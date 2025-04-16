// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceVpcAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the ECS instance.</p>
     * <blockquote>
     * <p> When you call this operation, the ECS instance must be in the <strong>Stopped</strong> (<code>Stopped</code>) state. For other limits on the ECS instance, see the <strong>Usage notes</strong> section of this topic.</p>
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
     * <p>The new private IP address of the ECS instance.</p>
     * <blockquote>
     * <p> The value of <code>PrivateIpAddress</code> depends on the value of <code>VSwitchId</code>. The specified IP address must be within the CIDR block of the specified vSwitch.</p>
     * </blockquote>
     * <p>By default, if this parameter is empty, a private IP address is randomly assigned from the CIDR block of the specified vSwitch.</p>
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
     * <p>The IDs of new security groups to which the ECS instance belongs after the VPC is changed. This parameter is required only if <code>VpcId</code> is specified.</p>
     * <ul>
     * <li>The security groups that you specify must belong to the new VPC.</li>
     * <li>You can specify one or more security groups. The valid values of N vary based on the maximum number of security groups to which an ECS instance can belong. For more information, see <a href="~~25412#SecurityGroupQuota1~~">Limits</a>.</li>
     * <li>The specified security groups must be of the same type.</li>
     * <li>You can switch the ECS instance to security groups of a different type. To ensure network connectivity, we recommend that you understand the differences in rule configurations of the two security group types before you switch the ECS instance to security groups of a different type. For more information, see <a href="https://help.aliyun.com/document_detail/25387.html">Overview of security groups</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sg-o6w9l8bc8dgmkw87****</p>
     */
    @NameInMap("SecurityGroupId")
    public java.util.List<String> securityGroupId;

    /**
     * <p>The ID of the new vSwitch.</p>
     * <ul>
     * <li>If you set this parameter to the ID of the current vSwitch, the vSwitch of the ECS instance remains unchanged.</li>
     * <li>If you set this parameter to the ID of a different vSwitch and leave <code>VpcId</code> empty, the new vSwitch must belong to the same zone and VPC as the current vSwitch.</li>
     * <li>If you specify <code>VpcId</code>, the vSwitch specified by this parameter must belong to the specified VPC and the same zone as the current vSwitch.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1s5fnvk4gn3tw12****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the new VPC.</p>
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
