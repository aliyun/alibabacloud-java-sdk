// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteMountTargetRequest extends TeaModel {
    /**
     * <p>The ID of the edge node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-cmcc</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The ID of the file system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c50f8*****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The name of the mount target.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TestMountPath</p>
     */
    @NameInMap("MountTargetName")
    public String mountTargetName;

    public static DeleteMountTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMountTargetRequest self = new DeleteMountTargetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMountTargetRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DeleteMountTargetRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DeleteMountTargetRequest setMountTargetName(String mountTargetName) {
        this.mountTargetName = mountTargetName;
        return this;
    }
    public String getMountTargetName() {
        return this.mountTargetName;
    }

}
