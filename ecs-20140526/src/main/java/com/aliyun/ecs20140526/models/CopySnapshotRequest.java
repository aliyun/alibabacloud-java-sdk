// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CopySnapshotRequest extends TeaModel {
    /**
     * <blockquote>
     * <p>This parameter is in invitational preview and is not supported.</p>
     * </blockquote>
     */
    @NameInMap("Arn")
    public java.util.List<CopySnapshotRequestArn> arn;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the destination region for the new snapshot.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>us-east-1</p>
     */
    @NameInMap("DestinationRegionId")
    public String destinationRegionId;

    /**
     * <p>The description of the new snapshot. The description must be 2 to 256 characters in length and cannot start with http:// or https://.</p>
     * <p>Default value: empty.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CopySnapshotDemo</p>
     */
    @NameInMap("DestinationSnapshotDescription")
    public String destinationSnapshotDescription;

    /**
     * <p>The name of the new snapshot. The name must be 2 to 128 characters in length, must start with a letter or a Chinese character, and cannot start with http:// or https://. It supports characters in the Letter category of Unicode, including English letters, Chinese characters, and digits. It can contain colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * <p>Default value: empty.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CopySnapshotDemo</p>
     */
    @NameInMap("DestinationSnapshotName")
    public String destinationSnapshotName;

    /**
     * <blockquote>
     * <p>This parameter is not available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("DestinationStorageLocationArn")
    public String destinationStorageLocationArn;

    /**
     * <p>Specifies whether to encrypt the cloud disk. Valid values:</p>
     * <ul>
     * <li>true: yes.</li>
     * <li>false: no.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Encrypted")
    public Boolean encrypted;

    /**
     * <p>The KMS customer master key (CMK) in the destination region.</p>
     * 
     * <strong>example:</strong>
     * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
     */
    @NameInMap("KMSKeyId")
    public String KMSKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region where the source snapshot resides. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-chengdu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is not available.</p>
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
     * <p>The retention period of the new snapshot. Unit: days. The snapshot is subject to automatic release when the retention period expires. Valid values: 1 to 65536.</p>
     * <p>Default value: empty, which indicates that the snapshot is not subject to automatic release.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("RetentionDays")
    public Integer retentionDays;

    /**
     * <p>The ID of the source snapshot.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>s-bp67acfmxazb4p****</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>The tag information of the new snapshot.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CopySnapshotRequestTag> tag;

    public static CopySnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        CopySnapshotRequest self = new CopySnapshotRequest();
        return TeaModel.build(map, self);
    }

    public CopySnapshotRequest setArn(java.util.List<CopySnapshotRequestArn> arn) {
        this.arn = arn;
        return this;
    }
    public java.util.List<CopySnapshotRequestArn> getArn() {
        return this.arn;
    }

    public CopySnapshotRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CopySnapshotRequest setDestinationRegionId(String destinationRegionId) {
        this.destinationRegionId = destinationRegionId;
        return this;
    }
    public String getDestinationRegionId() {
        return this.destinationRegionId;
    }

    public CopySnapshotRequest setDestinationSnapshotDescription(String destinationSnapshotDescription) {
        this.destinationSnapshotDescription = destinationSnapshotDescription;
        return this;
    }
    public String getDestinationSnapshotDescription() {
        return this.destinationSnapshotDescription;
    }

    public CopySnapshotRequest setDestinationSnapshotName(String destinationSnapshotName) {
        this.destinationSnapshotName = destinationSnapshotName;
        return this;
    }
    public String getDestinationSnapshotName() {
        return this.destinationSnapshotName;
    }

    public CopySnapshotRequest setDestinationStorageLocationArn(String destinationStorageLocationArn) {
        this.destinationStorageLocationArn = destinationStorageLocationArn;
        return this;
    }
    public String getDestinationStorageLocationArn() {
        return this.destinationStorageLocationArn;
    }

    public CopySnapshotRequest setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    public CopySnapshotRequest setKMSKeyId(String KMSKeyId) {
        this.KMSKeyId = KMSKeyId;
        return this;
    }
    public String getKMSKeyId() {
        return this.KMSKeyId;
    }

    public CopySnapshotRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CopySnapshotRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CopySnapshotRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CopySnapshotRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CopySnapshotRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CopySnapshotRequest setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    public CopySnapshotRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public CopySnapshotRequest setTag(java.util.List<CopySnapshotRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CopySnapshotRequestTag> getTag() {
        return this.tag;
    }

    public static class CopySnapshotRequestArn extends TeaModel {
        /**
         * <blockquote>
         * <p>This parameter is not available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AssumeRoleFor")
        public Long assumeRoleFor;

        /**
         * <blockquote>
         * <p>This parameter is not available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        /**
         * <blockquote>
         * <p>This parameter is not available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Rolearn")
        public String rolearn;

        public static CopySnapshotRequestArn build(java.util.Map<String, ?> map) throws Exception {
            CopySnapshotRequestArn self = new CopySnapshotRequestArn();
            return TeaModel.build(map, self);
        }

        public CopySnapshotRequestArn setAssumeRoleFor(Long assumeRoleFor) {
            this.assumeRoleFor = assumeRoleFor;
            return this;
        }
        public Long getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        public CopySnapshotRequestArn setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

        public CopySnapshotRequestArn setRolearn(String rolearn) {
            this.rolearn = rolearn;
            return this;
        }
        public String getRolearn() {
            return this.rolearn;
        }

    }

    public static class CopySnapshotRequestTag extends TeaModel {
        /**
         * <p>The tag key of the new snapshot. If you specify this parameter, it cannot be an empty string. The tag key can be up to 128 characters in length, cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the new snapshot. If you specify this parameter, it can be an empty string. The tag value can be up to 128 characters in length, cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CopySnapshotRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CopySnapshotRequestTag self = new CopySnapshotRequestTag();
            return TeaModel.build(map, self);
        }

        public CopySnapshotRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CopySnapshotRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
