// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteDirectoriesRequest extends TeaModel {
    /**
     * <p>The IDs of directories.</p>
     */
    @NameInMap("DirectoryId")
    public java.util.List<String> directoryId;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteDirectoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDirectoriesRequest self = new DeleteDirectoriesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDirectoriesRequest setDirectoryId(java.util.List<String> directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public java.util.List<String> getDirectoryId() {
        return this.directoryId;
    }

    public DeleteDirectoriesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
