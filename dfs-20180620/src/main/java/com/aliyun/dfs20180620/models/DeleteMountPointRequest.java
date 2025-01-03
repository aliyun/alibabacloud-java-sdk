// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class DeleteMountPointRequest extends TeaModel {
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

    public static DeleteMountPointRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMountPointRequest self = new DeleteMountPointRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMountPointRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DeleteMountPointRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public DeleteMountPointRequest setMountPointId(String mountPointId) {
        this.mountPointId = mountPointId;
        return this;
    }
    public String getMountPointId() {
        return this.mountPointId;
    }

}
