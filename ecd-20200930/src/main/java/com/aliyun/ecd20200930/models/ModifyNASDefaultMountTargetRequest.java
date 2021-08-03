// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyNASDefaultMountTargetRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("MountTargetDomain")
    public String mountTargetDomain;

    public static ModifyNASDefaultMountTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNASDefaultMountTargetRequest self = new ModifyNASDefaultMountTargetRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNASDefaultMountTargetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyNASDefaultMountTargetRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public ModifyNASDefaultMountTargetRequest setMountTargetDomain(String mountTargetDomain) {
        this.mountTargetDomain = mountTargetDomain;
        return this;
    }
    public String getMountTargetDomain() {
        return this.mountTargetDomain;
    }

}
