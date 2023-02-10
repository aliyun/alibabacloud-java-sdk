// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceVpcAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The new private IP address of the instance.</p>
     * <br>
     * <p>>  The `PrivateIpAddress` value depends on the `VSwitchId` value. The specified IP address must be within the CIDR block of the specified vSwitch.</p>
     * <br>
     * <p>By default, if this parameter is not specified, a private IP address is randomly assigned from the CIDR block of the specified vSwitch.</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of security group N to which the instance belongs after the VPC is changed. This parameter is required only when the `VpcId` parameter is specified.</p>
     * <br>
     * <p>*   The specified security groups must be of the same type.</p>
     * <p>*   You can specify one or more security groups. The valid values of N depend on the maximum number of security groups to which an instance can belong. For more information, see [Limits](~~25412~~).</p>
     * <p>*   The specified security groups must belong to the VPC specified by the `VpcId` parameter.</p>
     */
    @NameInMap("SecurityGroupId")
    public java.util.List<String> securityGroupId;

    /**
     * <p>The vSwitch ID of the instance.</p>
     * <br>
     * <p>*   If this parameter is set to the ID of the current vSwitch, the vSwitch of the instance remains unchanged.</p>
     * <p>*   If this parameter is set to the ID of a different vSwitch and the `VpcId` parameter is not specified, the new vSwitch must belong to the same zone and VPC as the current vSwitch.</p>
     * <p>*   If the `VpcId` parameter is specified, the vSwitch specified by this parameter must belong to the specified VPC and to the same zone as the current vSwitch.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the new VPC.</p>
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
