// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateVpcRequest extends TeaModel {
    /**
     * <p>The IPv4 CIDR block of the VPC. You can use one of the following standard IPv4 CIDR blocks or their subnets:</p>
     * <ul>
     * <li><code>10.0.0.0/8</code></li>
     * <li><code>172.16.0.0/12</code></li>
     * <li><code>192.168.0.0/16</code></li>
     * </ul>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <p>A client-generated token that ensures the idempotence of the request. The token must be unique across requests, contain only ASCII characters, and not exceed 64 characters. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The VPC description. The description must be 2 to 256 characters long and cannot start with <code>http://</code> or <code>https://</code>.</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the VPC will be created. You can call the <code>DescribeRegions</code> operation to query the latest list of regions.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The user CIDR block. You can specify a user CIDR block as an alternative to the standard CIDR blocks. This lets you use a private IP address range other than <code>10.0.0.0/8</code>, <code>172.16.0.0/12</code>, or <code>192.168.0.0/16</code> as the CIDR block for the VPC.</p>
     */
    @NameInMap("UserCidr")
    public String userCidr;

    /**
     * <p>The VPC name. It must be 2 to 128 characters long, start with a letter, and contain only letters, digits, underscores (_), and hyphens (-).</p>
     */
    @NameInMap("VpcName")
    public String vpcName;

    public static CreateVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcRequest self = new CreateVpcRequest();
        return TeaModel.build(map, self);
    }

    public CreateVpcRequest setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public CreateVpcRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateVpcRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVpcRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateVpcRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateVpcRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVpcRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateVpcRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateVpcRequest setUserCidr(String userCidr) {
        this.userCidr = userCidr;
        return this;
    }
    public String getUserCidr() {
        return this.userCidr;
    }

    public CreateVpcRequest setVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }
    public String getVpcName() {
        return this.vpcName;
    }

}
