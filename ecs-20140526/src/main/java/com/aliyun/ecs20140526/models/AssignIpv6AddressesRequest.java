// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AssignIpv6AddressesRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>IPv6 address N to assign to the ENI. Valid values of N: 1 to 10.</p>
     * <br>
     * <p>Example: Ipv6Address.1=2001:db8:1234:1a00::\*\*\*\*</p>
     * <br>
     * <p>> You must specify `Ipv6Addresses.N` or `Ipv6AddressCount` but cannot specify both.</p>
     */
    @NameInMap("Ipv6Address")
    public java.util.List<String> ipv6Address;

    /**
     * <p>The number of IPv6 addresses to randomly generate for the ENI. Valid values: 1 to 10.</p>
     * <br>
     * <p>>  You must specify `Ipv6Addresses.N` or `Ipv6AddressCount` but cannot specify both.</p>
     */
    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    /**
     * <p>> 该参数正在邀测中，暂未开放使用。</p>
     */
    @NameInMap("Ipv6Prefix")
    public java.util.List<String> ipv6Prefix;

    /**
     * <p>> 该参数正在邀测中，暂未开放使用。</p>
     */
    @NameInMap("Ipv6PrefixCount")
    public Integer ipv6PrefixCount;

    /**
     * <p>The ID of the ENI.</p>
     */
    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the ENI. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static AssignIpv6AddressesRequest build(java.util.Map<String, ?> map) throws Exception {
        AssignIpv6AddressesRequest self = new AssignIpv6AddressesRequest();
        return TeaModel.build(map, self);
    }

    public AssignIpv6AddressesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AssignIpv6AddressesRequest setIpv6Address(java.util.List<String> ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }
    public java.util.List<String> getIpv6Address() {
        return this.ipv6Address;
    }

    public AssignIpv6AddressesRequest setIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
        return this;
    }
    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    public AssignIpv6AddressesRequest setIpv6Prefix(java.util.List<String> ipv6Prefix) {
        this.ipv6Prefix = ipv6Prefix;
        return this;
    }
    public java.util.List<String> getIpv6Prefix() {
        return this.ipv6Prefix;
    }

    public AssignIpv6AddressesRequest setIpv6PrefixCount(Integer ipv6PrefixCount) {
        this.ipv6PrefixCount = ipv6PrefixCount;
        return this;
    }
    public Integer getIpv6PrefixCount() {
        return this.ipv6PrefixCount;
    }

    public AssignIpv6AddressesRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public AssignIpv6AddressesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AssignIpv6AddressesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AssignIpv6AddressesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AssignIpv6AddressesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AssignIpv6AddressesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
