// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DeleteLibrariesRequest extends TeaModel {
    @NameInMap("LibraryBizIdList")
    public java.util.List<String> libraryBizIdList;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteLibrariesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLibrariesRequest self = new DeleteLibrariesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLibrariesRequest setLibraryBizIdList(java.util.List<String> libraryBizIdList) {
        this.libraryBizIdList = libraryBizIdList;
        return this;
    }
    public java.util.List<String> getLibraryBizIdList() {
        return this.libraryBizIdList;
    }

    public DeleteLibrariesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteLibrariesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
