// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class CreateVscMountPointRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("InputRegionId")
    public String inputRegionId;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    public static CreateVscMountPointRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVscMountPointRequest self = new CreateVscMountPointRequest();
        return TeaModel.build(map, self);
    }

    public CreateVscMountPointRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVscMountPointRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateVscMountPointRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public CreateVscMountPointRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

}
