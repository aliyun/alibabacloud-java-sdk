// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ModifyFileSystemRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <strong>example:</strong>
     * <p>MyFirstModDFS</p>
     */
    @NameInMap("FileSystemName")
    public String fileSystemName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("InputRegionId")
    public String inputRegionId;

    /**
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("ProvisionedThroughputInMiBps")
    public Long provisionedThroughputInMiBps;

    /**
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("SpaceCapacity")
    public Long spaceCapacity;

    /**
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
