// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class CreateDbfsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;cpuCoreCount&quot;:0.5,&quot;memorySize&quot;:512,&quot;pageCacheSize&quot;:128}</p>
     */
    @NameInMap("AdvancedFeatures")
    public String advancedFeatures;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeleteSnapshot")
    public Boolean deleteSnapshot;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableRaid")
    public Boolean enableRaid;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Encryption")
    public Boolean encryption;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testdbfs-001</p>
     */
    @NameInMap("FsName")
    public String fsName;

    /**
     * <strong>example:</strong>
     * <p>dbfs.small</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <strong>example:</strong>
     * <p>0e478b7a-4262-4802-b8cb-00d3fb40826X</p>
     */
    @NameInMap("KMSKeyId")
    public String KMSKeyId;

    /**
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("PerformanceLevel")
    public String performanceLevel;

    @NameInMap("RaidStripeUnitNumber")
    public Integer raidStripeUnitNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("SizeG")
    public Integer sizeG;

    /**
     * <strong>example:</strong>
     * <p>s-y2vZ3********vvMilZ2hQ</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <strong>example:</strong>
     * <p>PostgreSQL</p>
     */
    @NameInMap("UsedScene")
    public String usedScene;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-i</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateDbfsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDbfsRequest self = new CreateDbfsRequest();
        return TeaModel.build(map, self);
    }

    public CreateDbfsRequest setAdvancedFeatures(String advancedFeatures) {
        this.advancedFeatures = advancedFeatures;
        return this;
    }
    public String getAdvancedFeatures() {
        return this.advancedFeatures;
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
