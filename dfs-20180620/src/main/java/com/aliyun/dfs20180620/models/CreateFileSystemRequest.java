// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class CreateFileSystemRequest extends TeaModel {
    /**
     * <p>The redundancy mode of the file system.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>LRS: locally redundant storage. This is the default value.</li>
     * <li>ZRS: zone-redundant storage. If you select ZRS, ZoneId must be a string that consists of multiple zone IDs for zone-redundant storage, such as <codeph> <code>zoneId1,zoneId2</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LRS</p>
     */
    @NameInMap("DataRedundancyType")
    public String dataRedundancyType;

    /**
     * <p>The ID of the dedicated cluster for Apsara File Storage for HDFS.</p>
     * 
     * <strong>example:</strong>
     * <p>alidfs-DC-f76f7ca5-*****</p>
     */
    @NameInMap("DedicatedClusterId")
    public String dedicatedClusterId;

    /**
     * <p>The description of the file system.</p>
     * <p>The description can be up to 32 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>This is the first Apsara File Storage for HDFS instance for our company</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the file system. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must be 6 to 64 characters in length. </li>
     * <li>The name must be globally unique and cannot be an empty string.</li>
     * <li>The name can contain letters, digits, underscores (_), and hyphens (-).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyFirstHDFS</p>
     */
    @NameInMap("FileSystemName")
    public String fileSystemName;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("InputRegionId")
    public String inputRegionId;

    /**
     * <p>The metering mode.</p>
     * 
     * <strong>example:</strong>
     * <p>UsageBased,CapacityBased</p>
     */
    @NameInMap("MeteringMode")
    public String meteringMode;

    /**
     * <p>This parameter is reserved and does not require configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PartitionNumber")
    public Integer partitionNumber;

    /**
     * <p>The protocol type.</p>
     * <p>Only Hadoop Distributed File System (HDFS) is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HDFS</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The provisioned throughput. This parameter is required when ThroughputMode is set to Provisioned.</p>
     * <p>Unit: MB/s.</p>
     * <p>Valid values: 1 to 5120.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("ProvisionedThroughputInMiBps")
    public Long provisionedThroughputInMiBps;

    /**
     * <p>The capacity of the file system.</p>
     * <p>You cannot write data when the amount of stored data reaches the file system capacity.</p>
     * <p>Unit: GiB.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("SpaceCapacity")
    public Long spaceCapacity;

    /**
     * <p>This parameter is reserved and does not require configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>AligroupStorageSet</p>
     */
    @NameInMap("StorageSetName")
    public String storageSetName;

    /**
     * <p>The storage medium type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>STANDARD: standard storage. This is the default value.</li>
     * <li>PERFORMANCE: performance storage.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>STANDARD</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The throughput mode.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Standard: standard throughput. This is the default value.</li>
     * <li>Provisioned: provisioned throughput.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("ThroughputMode")
    public String throughputMode;

    /**
     * <p>The zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
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

    public CreateFileSystemRequest setDedicatedClusterId(String dedicatedClusterId) {
        this.dedicatedClusterId = dedicatedClusterId;
        return this;
    }
    public String getDedicatedClusterId() {
        return this.dedicatedClusterId;
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

    public CreateFileSystemRequest setMeteringMode(String meteringMode) {
        this.meteringMode = meteringMode;
        return this;
    }
    public String getMeteringMode() {
        return this.meteringMode;
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
