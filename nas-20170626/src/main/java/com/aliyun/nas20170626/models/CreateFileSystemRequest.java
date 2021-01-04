// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateFileSystemRequest extends TeaModel {
    @NameInMap("FileSystemType")
    public String fileSystemType;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("Capacity")
    public Long capacity;

    @NameInMap("Bandwidth")
    public Long bandwidth;

    @NameInMap("StorageType")
    public String storageType;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("ProtocolType")
    public String protocolType;

    @NameInMap("EncryptType")
    public Integer encryptType;

    @NameInMap("SnapshotId")
    public String snapshotId;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("Description")
    public String description;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("KmsKeyId")
    public String kmsKeyId;

    @NameInMap("DryRun")
    public Boolean dryRun;

    public static CreateFileSystemRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFileSystemRequest self = new CreateFileSystemRequest();
        return TeaModel.build(map, self);
    }

    public CreateFileSystemRequest setFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
        return this;
    }
    public String getFileSystemType() {
        return this.fileSystemType;
    }

    public CreateFileSystemRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateFileSystemRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreateFileSystemRequest setCapacity(Long capacity) {
        this.capacity = capacity;
        return this;
    }
    public Long getCapacity() {
        return this.capacity;
    }

    public CreateFileSystemRequest setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Long getBandwidth() {
        return this.bandwidth;
    }

    public CreateFileSystemRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public CreateFileSystemRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateFileSystemRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public CreateFileSystemRequest setEncryptType(Integer encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public Integer getEncryptType() {
        return this.encryptType;
    }

    public CreateFileSystemRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public CreateFileSystemRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateFileSystemRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateFileSystemRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateFileSystemRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateFileSystemRequest setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    public CreateFileSystemRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
