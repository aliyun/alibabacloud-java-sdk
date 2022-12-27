// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CopySnapshotRequest extends TeaModel {
    // > This parameter is in invitational preview and is unavailable.
    @NameInMap("Arn")
    public java.util.List<CopySnapshotRequestArn> arn;

    // The region ID of the new snapshot.
    @NameInMap("DestinationRegionId")
    public String destinationRegionId;

    // The description of the new snapshot. The description must be 2 to 256 characters in length and cannot start with http:// or https://.
    // 
    // This parameter is empty by default.
    @NameInMap("DestinationSnapshotDescription")
    public String destinationSnapshotDescription;

    // The name of the new snapshot. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-). It must start with a letter and cannot start with http:// or https://.
    // 
    // This parameter is empty by default.
    @NameInMap("DestinationSnapshotName")
    public String destinationSnapshotName;

    // Specifies whether to query only encrypted cloud disks.
    // 
    // *   true: queries only encrypted cloud disks.
    // *   false: does not query encrypted cloud disks.
    // 
    // Default value: false.
    @NameInMap("Encrypted")
    public Boolean encrypted;

    // The ID of the Key Management Service (KMS) key used for the data disk.
    @NameInMap("KMSKeyId")
    public String KMSKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The region ID of the source snapshot. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the resource group.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The retention period of the new snapshot. Unit: days. The new snapshot will be automatically released when it expires. Valid values: 1 to 65536.
    // 
    // This parameter is empty by default, which indicates that the snapshot will not be automatically released.
    @NameInMap("RetentionDays")
    public Integer retentionDays;

    // The ID of the source snapshot.
    @NameInMap("SnapshotId")
    public String snapshotId;

    // The tags of the new snapshot.
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
        // > This parameter is in invitational preview and is unavailable.
        @NameInMap("AssumeRoleFor")
        public Long assumeRoleFor;

        // > This parameter is in invitational preview and is unavailable.
        @NameInMap("RoleType")
        public String roleType;

        // > This parameter is in invitational preview and is unavailable.
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
        // The key of tag N to be bound to the new snapshot. The tag key cannot be an empty string. It can be up to 128 characters in length and cannot contain http:// or https://. It cannot start with acs: or aliyun.
        @NameInMap("Key")
        public String key;

        // The value of tag N to be bound to the new snapshot. The tag value can be an empty string. It can be up to 128 characters in length and cannot contain http:// or https://. It cannot start with acs: or aliyun.
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
