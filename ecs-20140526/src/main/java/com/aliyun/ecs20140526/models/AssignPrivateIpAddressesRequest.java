// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AssignPrivateIpAddressesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The <strong>ClientToken</strong> value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>One or more IPv4 prefixes to allocate to the network interface controller (NIC). Valid values of N: 1 to 10.</p>
     * <blockquote>
     * <p>To configure IPv4 prefixes for the ENI, you must specify either the Ipv4Prefix.N parameter or the Ipv4PrefixCount parameter, but not both.</p>
     * </blockquote>
     */
    @NameInMap("Ipv4Prefix")
    public java.util.List<String> ipv4Prefix;

    /**
     * <p>The number of randomly generated IPv4 prefixes to allocate to the network interface controller (NIC). Valid values: 1 to 10.</p>
     * <blockquote>
     * <p>To configure IPv4 prefixes for the ENI, you must specify either the Ipv4Prefix.N parameter or the Ipv4PrefixCount parameter, but not both.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Ipv4PrefixCount")
    public Integer ipv4PrefixCount;

    /**
     * <p>The ID of the network interface controller (NIC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eni-bp67acfmxazb4p****</p>
     */
    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>One or more secondary private IP addresses selected from the available IP addresses of the vSwitch to which the network interface controller (NIC) belongs. Valid values of N:</p>
     * <ul>
     * <li>When the ENI is in the Available (<code>Available</code>) state: 1 to 32.</li>
     * <li>When the ENI is in the <code>InUse</code> state: limited by the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</li>
     * </ul>
     * <p>When you allocate secondary private IP addresses, you cannot specify both PrivateIpAddress.N and SecondaryPrivateIpAddressCount.</p>
     * 
     * <strong>example:</strong>
     * <p><code>10.1.**.**</code></p>
     */
    @NameInMap("PrivateIpAddress")
    public java.util.List<String> privateIpAddress;

    /**
     * <p>The region ID of the network interface controller (NIC). You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent list of Alibaba Cloud regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The number of private IP addresses to be automatically assigned from the available IP addresses of the vSwitch.</p>
     * <p>When you assign secondary private IP addresses, you cannot specify both PrivateIpAddress.N and SecondaryPrivateIpAddressCount.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SecondaryPrivateIpAddressCount")
    public Integer secondaryPrivateIpAddressCount;

    public static AssignPrivateIpAddressesRequest build(java.util.Map<String, ?> map) throws Exception {
        AssignPrivateIpAddressesRequest self = new AssignPrivateIpAddressesRequest();
        return TeaModel.build(map, self);
    }

    public AssignPrivateIpAddressesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AssignPrivateIpAddressesRequest setIpv4Prefix(java.util.List<String> ipv4Prefix) {
        this.ipv4Prefix = ipv4Prefix;
        return this;
    }
    public java.util.List<String> getIpv4Prefix() {
        return this.ipv4Prefix;
    }

    public AssignPrivateIpAddressesRequest setIpv4PrefixCount(Integer ipv4PrefixCount) {
        this.ipv4PrefixCount = ipv4PrefixCount;
        return this;
    }
    public Integer getIpv4PrefixCount() {
        return this.ipv4PrefixCount;
    }

    public AssignPrivateIpAddressesRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public AssignPrivateIpAddressesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AssignPrivateIpAddressesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AssignPrivateIpAddressesRequest setPrivateIpAddress(java.util.List<String> privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public java.util.List<String> getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public AssignPrivateIpAddressesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AssignPrivateIpAddressesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AssignPrivateIpAddressesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AssignPrivateIpAddressesRequest setSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
        this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
        return this;
    }
    public Integer getSecondaryPrivateIpAddressCount() {
        return this.secondaryPrivateIpAddressCount;
    }

}
