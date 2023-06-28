// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteNASFileSystemsRequest extends TeaModel {
    /**
     * <p>The IDs of the NAS file systems that you want to delete.</p>
     */
    @NameInMap("FileSystemId")
    public java.util.List<String> fileSystemId;

    /**
     * <p>The region ID of the NAS file system that you want to delete.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteNASFileSystemsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNASFileSystemsRequest self = new DeleteNASFileSystemsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNASFileSystemsRequest setFileSystemId(java.util.List<String> fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public java.util.List<String> getFileSystemId() {
        return this.fileSystemId;
    }

    public DeleteNASFileSystemsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
