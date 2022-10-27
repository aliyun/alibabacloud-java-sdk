// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CopySnapshotRequest extends TeaModel {
    @NameInMap("Arn")
    public java.util.List<CopySnapshotRequestArn> arn;

    @NameInMap("DestinationRegionId")
    public String destinationRegionId;

    @NameInMap("DestinationSnapshotDescription")
    public String destinationSnapshotDescription;

    @NameInMap("DestinationSnapshotName")
    public String destinationSnapshotName;

    @NameInMap("Encrypted")
    public Boolean encrypted;

    @NameInMap("KMSKeyId")
    public String KMSKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RetentionDays")
    public Integer retentionDays;

    @NameInMap("SnapshotId")
    public String snapshotId;

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
        @NameInMap("AssumeRoleFor")
        public Long assumeRoleFor;

        @NameInMap("RoleType")
        public String roleType;

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
        @NameInMap("Key")
        public String key;

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
