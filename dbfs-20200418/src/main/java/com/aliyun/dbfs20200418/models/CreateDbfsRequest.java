// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class CreateDbfsRequest extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DeleteSnapshot")
    public Boolean deleteSnapshot;

    @NameInMap("EnableRaid")
    public Boolean enableRaid;

    @NameInMap("Encryption")
    public Boolean encryption;

    @NameInMap("FsName")
    public String fsName;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("KMSKeyId")
    public String KMSKeyId;

    @NameInMap("PerformanceLevel")
    public String performanceLevel;

    @NameInMap("RaidStripeUnitNumber")
    public Integer raidStripeUnitNumber;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SizeG")
    public Integer sizeG;

    @NameInMap("SnapshotId")
    public String snapshotId;

    @NameInMap("UsedScene")
    public String usedScene;

    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateDbfsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDbfsRequest self = new CreateDbfsRequest();
        return TeaModel.build(map, self);
    }

    public CreateDbfsRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateDbfsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDbfsRequest setDeleteSnapshot(Boolean deleteSnapshot) {
        this.deleteSnapshot = deleteSnapshot;
        return this;
    }
    public Boolean getDeleteSnapshot() {
        return this.deleteSnapshot;
    }

    public CreateDbfsRequest setEnableRaid(Boolean enableRaid) {
        this.enableRaid = enableRaid;
        return this;
    }
    public Boolean getEnableRaid() {
        return this.enableRaid;
    }

    public CreateDbfsRequest setEncryption(Boolean encryption) {
        this.encryption = encryption;
        return this;
    }
    public Boolean getEncryption() {
        return this.encryption;
    }

    public CreateDbfsRequest setFsName(String fsName) {
        this.fsName = fsName;
        return this;
    }
    public String getFsName() {
        return this.fsName;
    }

    public CreateDbfsRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateDbfsRequest setKMSKeyId(String KMSKeyId) {
        this.KMSKeyId = KMSKeyId;
        return this;
    }
    public String getKMSKeyId() {
        return this.KMSKeyId;
    }

    public CreateDbfsRequest setPerformanceLevel(String performanceLevel) {
        this.performanceLevel = performanceLevel;
        return this;
    }
    public String getPerformanceLevel() {
        return this.performanceLevel;
    }

    public CreateDbfsRequest setRaidStripeUnitNumber(Integer raidStripeUnitNumber) {
        this.raidStripeUnitNumber = raidStripeUnitNumber;
        return this;
    }
    public Integer getRaidStripeUnitNumber() {
        return this.raidStripeUnitNumber;
    }

    public CreateDbfsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDbfsRequest setSizeG(Integer sizeG) {
        this.sizeG = sizeG;
        return this;
    }
    public Integer getSizeG() {
        return this.sizeG;
    }

    public CreateDbfsRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public CreateDbfsRequest setUsedScene(String usedScene) {
        this.usedScene = usedScene;
        return this;
    }
    public String getUsedScene() {
        return this.usedScene;
    }

    public CreateDbfsRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
