// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class DetachVscMountPointShrinkRequest extends TeaModel {
    /**
     * <p>A reserved parameter. This parameter has no practical effect.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The file system ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e389e5c7-bcb4-4558-846a-e5afc444****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

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
     * <p>The IDs of the ECS instances from which the HDFS file system is to be disassociated. Separate multiple ECS instance IDs with commas (,). Specify a maximum of 50 ECS instance IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *       &quot;i-bp1g6zv0ce8oghu7****&quot;,
     *       &quot;i-bp1g6zv0ce8oghu1****&quot;
     * ]</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    /**
     * <p>The mount point ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f-037cb49e1d-c****.dfs.aliyuncs.com</p>
     */
    @NameInMap("MountPointId")
    public String mountPointId;

    /**
     * <p>Specifies whether to use the assumed role to verify the permissions of the compute node. Valid values:</p>
     * <ul>
     * <li>true: Yes.</li>
     * <li>false: No.
     * Default value: false.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseAssumeRoleChkServerPerm")
    public Boolean useAssumeRoleChkServerPerm;

    /**
     * <p>The IDs of the VSCs from which the HDFS file system is to be disassociated. Specify a maximum of 50 VSC IDs.</p>
     */
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

    public DetachVscMountPointShrinkRequest setUseAssumeRoleChkServerPerm(Boolean useAssumeRoleChkServerPerm) {
        this.useAssumeRoleChkServerPerm = useAssumeRoleChkServerPerm;
        return this;
    }
    public Boolean getUseAssumeRoleChkServerPerm() {
        return this.useAssumeRoleChkServerPerm;
    }

    public DetachVscMountPointShrinkRequest setVscIdsShrink(String vscIdsShrink) {
        this.vscIdsShrink = vscIdsShrink;
        return this;
    }
    public String getVscIdsShrink() {
        return this.vscIdsShrink;
    }

}
