// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifySecurityGroupPolicyRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <strong>token</strong> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The internal access control policy of the security group. Valid values:</p>
     * <ul>
     * <li>Accept: the internal interconnectivity policy</li>
     * <li>Drop: the internal isolation policy</li>
     * </ul>
     * <blockquote>
     * <p> The value of this parameter is case-insensitive.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Drop</p>
     */
    @NameInMap("InnerAccessPolicy")
    public String innerAccessPolicy;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the security group. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
     * <p>The ID of the security group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp67acfmxazb4ph****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    public static ModifySecurityGroupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityGroupPolicyRequest self = new ModifySecurityGroupPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifySecurityGroupPolicyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifySecurityGroupPolicyRequest setInnerAccessPolicy(String innerAccessPolicy) {
        this.innerAccessPolicy = innerAccessPolicy;
        return this;
    }
    public String getInnerAccessPolicy() {
        return this.innerAccessPolicy;
    }

    public ModifySecurityGroupPolicyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifySecurityGroupPolicyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySecurityGroupPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySecurityGroupPolicyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySecurityGroupPolicyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySecurityGroupPolicyRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

}
