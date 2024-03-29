// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class DetachVscMountPointShrinkRequest extends TeaModel {
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

    public static DetachVscMountPointShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachVscMountPointShrinkRequest self = new DetachVscMountPointShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DetachVscMountPointShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DetachVscMountPointShrinkRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DetachVscMountPointShrinkRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public DetachVscMountPointShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    public DetachVscMountPointShrinkRequest setMountPointId(String mountPointId) {
        this.mountPointId = mountPointId;
        return this;
    }
    public String getMountPointId() {
        return this.mountPointId;
    }

    public DetachVscMountPointShrinkRequest setVscIdsShrink(String vscIdsShrink) {
        this.vscIdsShrink = vscIdsShrink;
        return this;
    }
    public String getVscIdsShrink() {
        return this.vscIdsShrink;
    }

}
