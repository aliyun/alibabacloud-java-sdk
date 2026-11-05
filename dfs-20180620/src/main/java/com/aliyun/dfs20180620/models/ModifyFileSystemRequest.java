// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ModifyFileSystemRequest extends TeaModel {
    /**
     * <p>The description of the file system.</p>
     * <p>The description can be up to 32 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>This is the first Apsara File Storage for HDFS instance for my company</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the file system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>37af8f42-2abc-4e74-889d-664f5163****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The name of the file system. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must be 6 to 64 characters in length.</li>
     * <li>The name must be globally unique and cannot be an empty string.</li>
     * <li>The name can contain letters, digits, underscores (_), and hyphens (-).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MyFirstModDFS</p>
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
     * <p>The capacity budget of the file system.</p>
     * <p>When the actual data storage reaches the file system capacity, no more data can be written. The file system capacity cannot be reduced.</p>
     * <p>Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("SpaceCapacity")
    public Long spaceCapacity;

    /**
     * <p>The throughput mode. Valid values:</p>
     * <ul>
     * <li>Standard: standard throughput</li>
     * <li>Provisioned: provisioned throughput</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("ThroughputMode")
    public String throughputMode;

    public static ModifyFileSystemRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFileSystemRequest self = new ModifyFileSystemRequest();
        return TeaModel.build(map, self);
    }

    public ModifyFileSystemRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyFileSystemRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public ModifyFileSystemRequest setFileSystemName(String fileSystemName) {
        this.fileSystemName = fileSystemName;
        return this;
    }
    public String getFileSystemName() {
        return this.fileSystemName;
    }

    public ModifyFileSystemRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public ModifyFileSystemRequest setMeteringMode(String meteringMode) {
        this.meteringMode = meteringMode;
        return this;
    }
    public String getMeteringMode() {
        return this.meteringMode;
    }

    public ModifyFileSystemRequest setProvisionedThroughputInMiBps(Long provisionedThroughputInMiBps) {
        this.provisionedThroughputInMiBps = provisionedThroughputInMiBps;
        return this;
    }
    public Long getProvisionedThroughputInMiBps() {
        return this.provisionedThroughputInMiBps;
    }

    public ModifyFileSystemRequest setSpaceCapacity(Long spaceCapacity) {
        this.spaceCapacity = spaceCapacity;
        return this;
    }
    public Long getSpaceCapacity() {
        return this.spaceCapacity;
    }

    public ModifyFileSystemRequest setThroughputMode(String throughputMode) {
        this.throughputMode = throughputMode;
        return this;
    }
    public String getThroughputMode() {
        return this.throughputMode;
    }

}
