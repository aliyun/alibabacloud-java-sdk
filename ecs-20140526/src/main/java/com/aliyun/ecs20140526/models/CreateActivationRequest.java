// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateActivationRequest extends TeaModel {
    // The description of the activation code. The description can be 1 to 100 characters in length and cannot start with `http://` or `https://`.
    @NameInMap("Description")
    public String description;

    // The maximum number of times that the activation code can be used to register managed instances. Valid values: 1 to 1000.
    // 
    // Default value: 10.
    @NameInMap("InstanceCount")
    public Integer instanceCount;

    // The default instance name prefix. The instance name prefix must be 1 to 50 characters in length. It must start with a letter and cannot start with `http://` or `https://`. The instance name prefix can contain only letters, digits, periods (.), underscores (\_), hyphens (-), and colons (:).
    // 
    // If you use the activation code created by calling the CreateActivation operation to register managed instances, the instances are assigned sequential names that are prefixed by the value of this parameter. You can also specify a new instance name to override the assigned sequential name when you register a managed instance.
    // 
    // If you specify InstanceName when you register a managed instance, an instance name in the format of `<InstanceName>-<Number>` is generated. The number of digits in the \<Number> value is determined by that in the `InstanceCount` value. Example: `001`. If you do not specify InstanceName, the hostname (Hostname) is used as the instance name.
    @NameInMap("InstanceName")
    public String instanceName;

    // The IP addresses of hosts that are allowed to use the activation code. The value can be IPv4 addresses, IPv6 addresses, or CIDR blocks.
    @NameInMap("IpAddressRange")
    public String ipAddressRange;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The ID of the region in which to create the activation code. The following regions are supported: China (Qingdao), China (Beijing), China (Zhangjiakou), China (Hohhot), China (Hangzhou), China (Shanghai), China (Shenzhen), China (Heyuan), and China (Hong Kong).
    // 
    // You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The validity period of the activation code. The activation code can no longer be used to register instances after the code expires. Unit: hours. Valid values: 1 to 24.
    // 
    // Default value: 4.
    @NameInMap("TimeToLiveInHours")
    public Long timeToLiveInHours;

    public static CreateActivationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateActivationRequest self = new CreateActivationRequest();
        return TeaModel.build(map, self);
    }

    public CreateActivationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateActivationRequest setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    public CreateActivationRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateActivationRequest setIpAddressRange(String ipAddressRange) {
        this.ipAddressRange = ipAddressRange;
        return this;
    }
    public String getIpAddressRange() {
        return this.ipAddressRange;
    }

    public CreateActivationRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateActivationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateActivationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateActivationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateActivationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateActivationRequest setTimeToLiveInHours(Long timeToLiveInHours) {
        this.timeToLiveInHours = timeToLiveInHours;
        return this;
    }
    public Long getTimeToLiveInHours() {
        return this.timeToLiveInHours;
    }

}
