// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CopySnapshotRequest extends TeaModel {
    /**
     * <p>>This parameter is currently in invitational preview and unavailable for public use.</p>
     */
    @NameInMap("Arn")
    public java.util.List<CopySnapshotRequestArn> arn;

    /**
     * <p>The ID of the destination region to which to copy the source snapshot.</p>
     */
    @NameInMap("DestinationRegionId")
    public String destinationRegionId;

    /**
     * <p>The description of the new snapshot. The description must be 2 to 256 characters in length and cannot start with http:// or https://.</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     */
    @NameInMap("DestinationSnapshotDescription")
    public String destinationSnapshotDescription;

    /**
     * <p>The name of the new snapshot. The name must be 2 to 128 characters in length. It must start with a letter and cannot start http:// or https://. The name can contain digits, letters, colons (:), underscores (\_), and hyphens (-).</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     */
    @NameInMap("DestinationSnapshotName")
    public String destinationSnapshotName;

    /**
     * <p>> This parameter is not publicly available.</p>
     */
    @NameInMap("DestinationStorageLocationArn")
    public String destinationStorageLocationArn;

    /**
     * <p>Specifies whether to encrypt the new snapshot. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("Encrypted")
    public Boolean encrypted;

    /**
     * <p>The ID of the customer master key (CMK) in Key Management Service (KMS) in the destination region.</p>
     */
    @NameInMap("KMSKeyId")
    public String KMSKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the source snapshot. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is not publicly available.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The retention period of the new snapshot. Unit: days. The new snapshot is automatically released when its retention period ends. Valid values: 1 to 65536.</p>
     * <br>
     * <p>This parameter is empty by default, which indicates that the snapshot is not automatically released.</p>
     */
    @NameInMap("RetentionDays")
    public Integer retentionDays;

    /**
     * <p>The ID of the source snapshot.</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>The tag key and value of the new snapshot.</p>
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
         * <p>> This parameter is not publicly available.</p>
         */
        @NameInMap("AssumeRoleFor")
        public Long assumeRoleFor;

        /**
         * <p>> This parameter is not publicly available.</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        /**
         * <p>> This parameter is not publicly available.</p>
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
         * <p>The key of tag N to add to the new snapshot. The tag key cannot be an empty string. It can be up to 128 characters in length and cannot start with acs: or aliyun. It cannot contain http:// or https://.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the new snapshot. The tag value can be an empty string. It can be up to 128 characters in length and cannot start with acs: or aliyun. It cannot contain http:// or https://.</p>
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
