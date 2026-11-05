// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class AttachVscMountPointRequest extends TeaModel {
    /**
     * <p>A reserved field. This field has no practical meaning.</p>
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
     * <p>The IDs of the ECS instances to which you want to mount the Apsara File Storage for HDFS file system. Separate multiple ECS instance IDs with commas (,). You can specify up to 100 ECS instance IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *       &quot;i-bp1g6zv0ce8oghu7****&quot;,
     *       &quot;i-bp1g6zv0ce8oghu1****&quot;
     * ]</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

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
     * <li>true: yes.</li>
     * <li>false: no. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseAssumeRoleChkServerPerm")
    public Boolean useAssumeRoleChkServerPerm;

    /**
     * <p>The IDs of the VSCs to which you want to mount the HDFS file system. Specify up to 100 VSC IDs.</p>
     */
    @NameInMap("VscIds")
    public java.util.List<String> vscIds;

    /**
     * <p>The custom name of the VSC.</p>
     * 
     * <strong>example:</strong>
     * <p>1fb6b247-4c4a-4fb9-b3b5-7ea38b167bb5</p>
     */
    @NameInMap("VscName")
    public String vscName;

    /**
     * <p>The VSC type. Valid values:</p>
     * <ul>
     * <li>Primary: the reserved default VSC on the ECS instance. This is the default value.</li>
     * <li>Secondary: a repeatable VSC on the ECS instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Primary</p>
     */
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

    public AttachVscMountPointRequest setUseAssumeRoleChkServerPerm(Boolean useAssumeRoleChkServerPerm) {
        this.useAssumeRoleChkServerPerm = useAssumeRoleChkServerPerm;
        return this;
    }
    public Boolean getUseAssumeRoleChkServerPerm() {
        return this.useAssumeRoleChkServerPerm;
    }

    public AttachVscMountPointRequest setVscIds(java.util.List<String> vscIds) {
        this.vscIds = vscIds;
        return this;
    }
    public java.util.List<String> getVscIds() {
        return this.vscIds;
    }

    public AttachVscMountPointRequest setVscName(String vscName) {
        this.vscName = vscName;
        return this;
    }
    public String getVscName() {
        return this.vscName;
    }

    public AttachVscMountPointRequest setVscType(String vscType) {
        this.vscType = vscType;
        return this;
    }
    public String getVscType() {
        return this.vscType;
    }

}
