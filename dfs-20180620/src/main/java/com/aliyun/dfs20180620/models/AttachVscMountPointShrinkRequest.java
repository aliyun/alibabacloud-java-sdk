// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class AttachVscMountPointShrinkRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("InputRegionId")
    public String inputRegionId;

    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    @NameInMap("MountPointId")
    public String mountPointId;

    @NameInMap("VscIds")
    public String vscIdsShrink;

    @NameInMap("VscType")
    public String vscType;

    public static AttachVscMountPointShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachVscMountPointShrinkRequest self = new AttachVscMountPointShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AttachVscMountPointShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AttachVscMountPointShrinkRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public AttachVscMountPointShrinkRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public AttachVscMountPointShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    public AttachVscMountPointShrinkRequest setMountPointId(String mountPointId) {
        this.mountPointId = mountPointId;
        return this;
    }
    public String getMountPointId() {
        return this.mountPointId;
    }

    public AttachVscMountPointShrinkRequest setVscIdsShrink(String vscIdsShrink) {
        this.vscIdsShrink = vscIdsShrink;
        return this;
    }
    public String getVscIdsShrink() {
        return this.vscIdsShrink;
    }

    public AttachVscMountPointShrinkRequest setVscType(String vscType) {
        this.vscType = vscType;
        return this;
    }
    public String getVscType() {
        return this.vscType;
    }

}
