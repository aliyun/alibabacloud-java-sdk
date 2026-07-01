// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateSecurityGroupRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The <strong>ClientToken</strong> value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the security group. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * <p>Default value: empty.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the security group. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the security group belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The name of the security group. The name must be 2 to 128 characters in length and must start with a letter or a Chinese character. It cannot start with <code>http://</code> or <code>https://</code>. The name can contain characters that are categorized as letter in Unicode, including Chinese characters and English letters, and digits. The name can also contain colons (:), underscores (_), periods (.), or hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>testSecurityGroupName</p>
     */
    @NameInMap("SecurityGroupName")
    public String securityGroupName;

    /**
     * <p>The type of the security group. Valid values:</p>
     * <ul>
     * <li>normal: basic security group.</li>
     * <li>enterprise: advanced security group. For more information, see <a href="https://help.aliyun.com/document_detail/120621.html">Overview of advanced security groups</a>.</li>
     * </ul>
     * <p>Default value: normal.</p>
     * 
     * <strong>example:</strong>
     * <p>enterprise</p>
     */
    @NameInMap("SecurityGroupType")
    public String securityGroupType;

    /**
     * <p>This parameter is not publicly available.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ServiceManaged")
    public Boolean serviceManaged;

    /**
     * <p>The tags to bind to the security group. Array length: 0 to 20.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateSecurityGroupRequestTag> tag;

    /**
     * <p>The ID of the VPC to which the security group belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1opxu1zkhn00gzv****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateSecurityGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityGroupRequest self = new CreateSecurityGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateSecurityGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateSecurityGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSecurityGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateSecurityGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSecurityGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSecurityGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateSecurityGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSecurityGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateSecurityGroupRequest setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
        return this;
    }
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    public CreateSecurityGroupRequest setSecurityGroupType(String securityGroupType) {
        this.securityGroupType = securityGroupType;
        return this;
    }
    public String getSecurityGroupType() {
        return this.securityGroupType;
    }

    public CreateSecurityGroupRequest setServiceManaged(Boolean serviceManaged) {
        this.serviceManaged = serviceManaged;
        return this;
    }
    public Boolean getServiceManaged() {
        return this.serviceManaged;
    }

    public CreateSecurityGroupRequest setTag(java.util.List<CreateSecurityGroupRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateSecurityGroupRequestTag> getTag() {
        return this.tag;
    }

    public CreateSecurityGroupRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class CreateSecurityGroupRequestTag extends TeaModel {
        /**
         * <p>The tag key of the security group.</p>
         * <p>The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the security group.</p>
         * <p>The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateSecurityGroupRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateSecurityGroupRequestTag self = new CreateSecurityGroupRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateSecurityGroupRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateSecurityGroupRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
