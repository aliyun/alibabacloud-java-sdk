// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateMountTargetRequest extends TeaModel {
    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The ID of the file system.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The name of the mount target.</p>
     */
    @NameInMap("MountTargetName")
    public String mountTargetName;

    /**
     * <p>The ID of the network.</p>
     */
    @NameInMap("NetWorkId")
    public String netWorkId;

    public static CreateMountTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMountTargetRequest self = new CreateMountTargetRequest();
        return TeaModel.build(map, self);
    }

    public CreateMountTargetRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public CreateMountTargetRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateMountTargetRequest setMountTargetName(String mountTargetName) {
        this.mountTargetName = mountTargetName;
        return this;
    }
    public String getMountTargetName() {
        return this.mountTargetName;
    }

    public CreateMountTargetRequest setNetWorkId(String netWorkId) {
        this.netWorkId = netWorkId;
        return this;
    }
    public String getNetWorkId() {
        return this.netWorkId;
    }

}
