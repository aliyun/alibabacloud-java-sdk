// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListGrantVSwitchEnisRequest extends TeaModel {
    /**
     * <p>The ID of the CEN instance to which the VPC-connected instance is connected.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-a7syd349kne38g****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The maximum number of entries per page for a paged query. Valid values: 10 to 500.</p>
     * <p>Default value:</p>
     * <ul>
     * <li>If you do not set this parameter, the default value is 20.</li>
     * <li>If the value you set is greater than 500, the default value is 500.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The IDs of network interface controllers (NICs).</p>
     */
    @NameInMap("NetworkInterfaceId")
    public java.util.List<String> networkInterfaceId;

    /**
     * <p>The name of the elastic network interfaces (ENIs). You can use this parameter to filter network interface controllers (NICs) by name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-eni-name</p>
     */
    @NameInMap("NetworkInterfaceName")
    public String networkInterfaceName;

    /**
     * <p>The token for the next query. Valid values:</p>
     * <ul>
     * <li>If this is the first query or no next query exists, leave this parameter empty.</li>
     * <li>If a next query exists, set this parameter to the NextToken value returned by the previous API call.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The primary private IP IPv4 address of the elastic network interfaces (ENIs). You can use this parameter to filter network interface controllers (NICs) by primary private IP address.</p>
     * 
     * <strong>example:</strong>
     * <p><code>192.168.**.**</code></p>
     */
    @NameInMap("PrimaryIpAddress")
    public String primaryIpAddress;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of a vSwitch in the VPC-connected instance.</p>
     * <p>You can query network interface controller (NIC) information for only one vSwitch at a time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-p0w9s2ig1jnwgrbzl****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC-connected instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-p0w9alkte4w2htrqe****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static ListGrantVSwitchEnisRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGrantVSwitchEnisRequest self = new ListGrantVSwitchEnisRequest();
        return TeaModel.build(map, self);
    }

    public ListGrantVSwitchEnisRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public ListGrantVSwitchEnisRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListGrantVSwitchEnisRequest setNetworkInterfaceId(java.util.List<String> networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public java.util.List<String> getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public ListGrantVSwitchEnisRequest setNetworkInterfaceName(String networkInterfaceName) {
        this.networkInterfaceName = networkInterfaceName;
        return this;
    }
    public String getNetworkInterfaceName() {
        return this.networkInterfaceName;
    }

    public ListGrantVSwitchEnisRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListGrantVSwitchEnisRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListGrantVSwitchEnisRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListGrantVSwitchEnisRequest setPrimaryIpAddress(String primaryIpAddress) {
        this.primaryIpAddress = primaryIpAddress;
        return this;
    }
    public String getPrimaryIpAddress() {
        return this.primaryIpAddress;
    }

    public ListGrantVSwitchEnisRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListGrantVSwitchEnisRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListGrantVSwitchEnisRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public ListGrantVSwitchEnisRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
