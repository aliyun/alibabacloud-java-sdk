// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceVpcAttributeRequest extends TeaModel {
    // The ID of the instance.
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The new private IP address of the instance.
    // 
    // >  The `PrivateIpAddress` value depends on the `VSwitchId` value. The specified IP address must be within the CIDR block of the specified vSwitch.
    // 
    // By default, if this parameter is not specified, a private IP address is randomly assigned from the CIDR block of the specified vSwitch.
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The IDs of security groups to which the instance belongs after the VPC is changed. This parameter is required only when the `VpcId` parameter is specified.
    // 
    // - The specified security groups must be of the same type.
    // - The security group list can contain one or more security groups to which the instance belongs after the modification. The valid values of N depend on the maximum number of security groups to which an instance can belong. For more information, see the "Security group limits" section in [Limits](~~25412~~).
    // - The specified security groups must belong to the VPC specified by the `VpcId` parameter.
    @NameInMap("SecurityGroupId")
    public java.util.List<String> securityGroupId;

    // The ID of the vSwitch.
    // 
    // *   If this parameter is set to the ID of the current vSwitch, the vSwitch of the instance remains unchanged.
    // *   If this parameter is set to the ID of a new vSwitch, and the `VpcId` parameter is not specified, the new vSwitch must belong to the same zone and VPC as the original vSwitch.
    // *   If the `VpcId` parameter is specified, the vSwitch specified by this parameter must belong to the VPC specified by the VpcId parameter and must belong to the same zone as the original vSwitch.
    @NameInMap("VSwitchId")
    public String vSwitchId;

    // The ID of the new VPC.
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
