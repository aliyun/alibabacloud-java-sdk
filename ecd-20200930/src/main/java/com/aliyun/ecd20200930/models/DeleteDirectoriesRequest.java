// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteDirectoriesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DirectoryId")
    @Validation(required = true)
    public java.util.List<String> directoryId;

    public static DeleteDirectoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDirectoriesRequest self = new DeleteDirectoriesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDirectoriesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteDirectoriesRequest setDirectoryId(java.util.List<String> directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public java.util.List<String> getDirectoryId() {
        return this.directoryId;
    }

}
