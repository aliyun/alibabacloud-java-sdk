// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class CreateVscMountPointShrinkRequest extends TeaModel {
    /**
     * <p>The description of the mount target.</p>
     * <p>The description must be 0 to 100 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>HDFS file system mounted on internal instances</p>
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
     * <p>The IDs of the ECS instances to which you want to mount the Apsara File Storage for HDFS file system. </p>
     * <p>Separate multiple ECS instance IDs with commas (,). You can specify up to 100 ECS instance IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *       &quot;i-bp1g6zv0ce8oghu7****&quot;,
     *       &quot;i-bp1g6zv0ce8oghu1****&quot;
     * ]</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    public static CreateVscMountPointShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVscMountPointShrinkRequest self = new CreateVscMountPointShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateVscMountPointShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVscMountPointShrinkRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateVscMountPointShrinkRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public CreateVscMountPointShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

}
