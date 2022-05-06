// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class CreateFileSystemRequest extends TeaModel {
    @NameInMap("DataRedundancyType")
    public String dataRedundancyType;

    @NameInMap("Description")
    public String description;

    @NameInMap("FileSystemName")
    public String fileSystemName;

    @NameInMap("InputRegionId")
    public String inputRegionId;

    @NameInMap("PartitionNumber")
    public Integer partitionNumber;

    @NameInMap("ProtocolType")
    public String protocolType;

    @NameInMap("ProvisionedThroughputInMiBps")
    public Long provisionedThroughputInMiBps;

    @NameInMap("SpaceCapacity")
    public Long spaceCapacity;

    @NameInMap("StorageSetName")
    public String storageSetName;

    @NameInMap("StorageType")
    public String storageType;

    @NameInMap("ThroughputMode")
    public String throughputMode;

    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateFileSystemRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFileSystemRequest self = new CreateFileSystemRequest();
        return TeaModel.build(map, self);
    }

    public CreateFileSystemRequest setDataRedundancyType(String dataRedundancyType) {
        this.dataRedundancyType = dataRedundancyType;
        return this;
    }
    public String getDataRedundancyType() {
        return this.dataRedundancyType;
    }

    public CreateFileSystemRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateFileSystemRequest setFileSystemName(String fileSystemName) {
        this.fileSystemName = fileSystemName;
        return this;
    }
    public String getFileSystemName() {
        return this.fileSystemName;
    }

    public CreateFileSystemRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public CreateFileSystemRequest setPartitionNumber(Integer partitionNumber) {
        this.partitionNumber = partitionNumber;
        return this;
    }
    public Integer getPartitionNumber() {
        return this.partitionNumber;
    }

    public CreateFileSystemRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public CreateFileSystemRequest setProvisionedThroughputInMiBps(Long provisionedThroughputInMiBps) {
        this.provisionedThroughputInMiBps = provisionedThroughputInMiBps;
        return this;
    }
    public Long getProvisionedThroughputInMiBps() {
        return this.provisionedThroughputInMiBps;
    }

    public CreateFileSystemRequest setSpaceCapacity(Long spaceCapacity) {
        this.spaceCapacity = spaceCapacity;
        return this;
    }
    public Long getSpaceCapacity() {
        return this.spaceCapacity;
    }

    public CreateFileSystemRequest setStorageSetName(String storageSetName) {
        this.storageSetName = storageSetName;
        return this;
    }
    public String getStorageSetName() {
        return this.storageSetName;
    }

    public CreateFileSystemRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public CreateFileSystemRequest setThroughputMode(String throughputMode) {
        this.throughputMode = throughputMode;
        return this;
    }
    public String getThroughputMode() {
        return this.throughputMode;
    }

    public CreateFileSystemRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
