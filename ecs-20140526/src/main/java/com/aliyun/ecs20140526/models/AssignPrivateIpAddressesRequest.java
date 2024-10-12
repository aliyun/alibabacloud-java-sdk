// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AssignPrivateIpAddressesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <strong>token</strong> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The IPv4 prefixes to assign to the ENI. Valid values of N: 1 to 10.</p>
     * <blockquote>
     * <p> To assign IPv4 prefixes to the ENI, you must specify the Ipv4Prefix.N or Ipv4PrefixCount parameter, but not both.</p>
     * </blockquote>
     */
    @NameInMap("Ipv4Prefix")
    public java.util.List<String> ipv4Prefix;

    /**
     * <p>The number of IPv4 prefixes to be randomly generated for the ENI. Valid values: 1 to 10.</p>
     * <blockquote>
     * <p> To assign IPv4 prefixes to the ENI, you must specify the Ipv4Prefix.N or Ipv4PrefixCount parameter, but not both.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>hide</p>
     */
    @NameInMap("Ipv4PrefixCount")
    public Integer ipv4PrefixCount;

    /**
     * <p>The ID of the ENI.</p>
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
     * <p>Secondary private IP address N to be automatically assigned from the CIDR block of the vSwitch that is connected to the ENI. Valid values of N:</p>
     * <ul>
     * <li>When the ENI is in the Available (<code>Available</code>) state, the valid values of N are 1 to 50.</li>
     * <li>When the ENI is in the InUse (<code>InUse</code>) state, the valid values of N are subject to the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a>.</li>
     * </ul>
     * <p>To assign secondary private IP addresses to the ENI, you must specify <code>PrivateIpAddress.N</code> or <code>SecondaryPrivateIpAddressCount</code> but not both.</p>
     * 
     * <strong>example:</strong>
     * <p><code>10.1.**.**</code></p>
     */
    @NameInMap("PrivateIpAddress")
    public java.util.List<String> privateIpAddress;

    /**
     * <p>The region ID of the ENI. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
     * <p>The number of private IP addresses to be automatically assigned from the CIDR block of the vSwitch that is connected to the ENI.</p>
     * <p>To assign secondary private IP addresses to the ENI, you must specify <code>PrivateIpAddress.N</code> or <code>SecondaryPrivateIpAddressCount</code> but not both.</p>
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
