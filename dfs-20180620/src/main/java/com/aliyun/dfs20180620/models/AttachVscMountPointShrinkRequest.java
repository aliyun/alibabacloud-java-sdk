// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class AttachVscMountPointShrinkRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>037****e1d</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

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
     * <p>[&quot;ecs-instance1&quot;, &quot;ecs-instance2&quot;]</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>037cb49e1d-c***5</p>
     */
    @NameInMap("MountPointId")
    public String mountPointId;

    @NameInMap("UseAssumeRoleChkServerPerm")
    public Boolean useAssumeRoleChkServerPerm;

    @NameInMap("VscIds")
    public String vscIdsShrink;

    @NameInMap("VscName")
    public String vscName;

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

    public AttachVscMountPointShrinkRequest setUseAssumeRoleChkServerPerm(Boolean useAssumeRoleChkServerPerm) {
        this.useAssumeRoleChkServerPerm = useAssumeRoleChkServerPerm;
        return this;
    }
    public Boolean getUseAssumeRoleChkServerPerm() {
        return this.useAssumeRoleChkServerPerm;
    }

    public AttachVscMountPointShrinkRequest setVscIdsShrink(String vscIdsShrink) {
        this.vscIdsShrink = vscIdsShrink;
        return this;
    }
    public String getVscIdsShrink() {
        return this.vscIdsShrink;
    }

    public AttachVscMountPointShrinkRequest setVscName(String vscName) {
        this.vscName = vscName;
        return this;
    }
    public String getVscName() {
        return this.vscName;
    }

    public AttachVscMountPointShrinkRequest setVscType(String vscType) {
        this.vscType = vscType;
        return this;
    }
    public String getVscType() {
        return this.vscType;
    }

}
