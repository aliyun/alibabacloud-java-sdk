// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class DeleteVscMountPointRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>037c****1d</p>
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
     * 
     * <strong>example:</strong>
     * <p>037cb49e1d-c***5</p>
     */
    @NameInMap("MountPointId")
    public String mountPointId;

    public static DeleteVscMountPointRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVscMountPointRequest self = new DeleteVscMountPointRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVscMountPointRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DeleteVscMountPointRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public DeleteVscMountPointRequest setMountPointId(String mountPointId) {
        this.mountPointId = mountPointId;
        return this;
    }
    public String getMountPointId() {
        return this.mountPointId;
    }

}
