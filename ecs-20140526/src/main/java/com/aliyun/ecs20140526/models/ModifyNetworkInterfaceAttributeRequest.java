// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyNetworkInterfaceAttributeRequest extends TeaModel {
    /**
     * <p>The description of the ENI. The description must be 2 to 255 characters in length and cannot start with http:// or https://.</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the ENI.</p>
     */
    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    /**
     * <p>The name of the ENI. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (\_), and hyphens (-).</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     */
    @NameInMap("NetworkInterfaceName")
    public String networkInterfaceName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of queues per ENI. Valid values: 1 to 2048.</p>
     * <br>
     * <p>*   You can modify the number of queues supported only by the secondary ENI.</p>
     * <p>*   You can modify the number of queues supported by the secondary ENI only when the ENI is in the `Available` state, or the secondary ENI is bound (`InUse`) to an instance that is in the `Stopped` state.</p>
     * <p>*   The number of queues supported by the secondary ENI cannot exceed the maximum number of queues that the instance allows for each ENI. The total number of queues for all ENIs on the instance cannot exceed the queue quota that the instance allows. To obtain information about the maximum number of queues per ENI and the queue quota for an instance type, you can call the [DescribeInstanceTypes](~~25620~~) operation to query the `MaximumQueueNumberPerEni` and `TotalEniQueueQuantity` values.</p>
     */
    @NameInMap("QueueNumber")
    public Integer queueNumber;

    /**
     * <p>The region ID of the ENI. You can call the [DescribeRegions](~~25609~~) operation to query thecurrent list of regions.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The list of security group IDs. You can specify up to 5 security group IDs.</p>
     * <br>
     * <p>- You can modify only the security groups to which the secondary ENI is added.</p>
     * <p>- After you specify a security group, the secondary ENI is added to the specified security group and removed from the existing security group.</p>
     * <br>
     * <p>>  After you modify the security group, the modification takes effect after a short delay.</p>
     */
    @NameInMap("SecurityGroupId")
    public java.util.List<String> securityGroupId;

    public static ModifyNetworkInterfaceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNetworkInterfaceAttributeRequest self = new ModifyNetworkInterfaceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNetworkInterfaceAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyNetworkInterfaceAttributeRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public ModifyNetworkInterfaceAttributeRequest setNetworkInterfaceName(String networkInterfaceName) {
        this.networkInterfaceName = networkInterfaceName;
        return this;
    }
    public String getNetworkInterfaceName() {
        return this.networkInterfaceName;
    }

    public ModifyNetworkInterfaceAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyNetworkInterfaceAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyNetworkInterfaceAttributeRequest setQueueNumber(Integer queueNumber) {
        this.queueNumber = queueNumber;
        return this;
    }
    public Integer getQueueNumber() {
        return this.queueNumber;
    }

    public ModifyNetworkInterfaceAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyNetworkInterfaceAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyNetworkInterfaceAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyNetworkInterfaceAttributeRequest setSecurityGroupId(java.util.List<String> securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public java.util.List<String> getSecurityGroupId() {
        return this.securityGroupId;
    }

}
