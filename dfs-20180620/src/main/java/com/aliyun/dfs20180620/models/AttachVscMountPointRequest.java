// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class AttachVscMountPointRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("InputRegionId")
    public String inputRegionId;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("MountPointId")
    public String mountPointId;

    @NameInMap("VscIds")
    public java.util.List<String> vscIds;

    @NameInMap("VscType")
    public String vscType;

    public static AttachVscMountPointRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachVscMountPointRequest self = new AttachVscMountPointRequest();
        return TeaModel.build(map, self);
    }

    public AttachVscMountPointRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AttachVscMountPointRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public AttachVscMountPointRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public AttachVscMountPointRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public AttachVscMountPointRequest setMountPointId(String mountPointId) {
        this.mountPointId = mountPointId;
        return this;
    }
    public String getMountPointId() {
        return this.mountPointId;
    }

    public AttachVscMountPointRequest setVscIds(java.util.List<String> vscIds) {
        this.vscIds = vscIds;
        return this;
    }
    public java.util.List<String> getVscIds() {
        return this.vscIds;
    }

    public AttachVscMountPointRequest setVscType(String vscType) {
        this.vscType = vscType;
        return this;
    }
    public String getVscType() {
        return this.vscType;
    }

}
