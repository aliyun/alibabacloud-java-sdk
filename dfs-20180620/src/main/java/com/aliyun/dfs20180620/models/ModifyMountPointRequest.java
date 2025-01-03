// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ModifyMountPointRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>acg-e3755fb0-358d-4286-9942-8d461048****</p>
     */
    @NameInMap("AccessGroupId")
    public String accessGroupId;

    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
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
     * <p>This parameter is required.</p>
     */
    @NameInMap("MountPointId")
    public String mountPointId;

    /**
     * <strong>example:</strong>
     * <p>Inactive</p>
     */
    @NameInMap("Status")
    public String status;

    public static ModifyMountPointRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMountPointRequest self = new ModifyMountPointRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMountPointRequest setAccessGroupId(String accessGroupId) {
        this.accessGroupId = accessGroupId;
        return this;
    }
    public String getAccessGroupId() {
        return this.accessGroupId;
    }

    public ModifyMountPointRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyMountPointRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public ModifyMountPointRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public ModifyMountPointRequest setMountPointId(String mountPointId) {
        this.mountPointId = mountPointId;
        return this;
    }
    public String getMountPointId() {
        return this.mountPointId;
    }

    public ModifyMountPointRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
