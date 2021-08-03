// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ResetNASDefaultMountTargetRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("FileSystemId")
    public String fileSystemId;

    public static ResetNASDefaultMountTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetNASDefaultMountTargetRequest self = new ResetNASDefaultMountTargetRequest();
        return TeaModel.build(map, self);
    }

    public ResetNASDefaultMountTargetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ResetNASDefaultMountTargetRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

}
