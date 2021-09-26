// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class UninstallLibrariesRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClusterBizIdList")
    public java.util.List<String> clusterBizIdList;

    @NameInMap("LibraryBizId")
    public String libraryBizId;

    public static UninstallLibrariesRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallLibrariesRequest self = new UninstallLibrariesRequest();
        return TeaModel.build(map, self);
    }

    public UninstallLibrariesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UninstallLibrariesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UninstallLibrariesRequest setClusterBizIdList(java.util.List<String> clusterBizIdList) {
        this.clusterBizIdList = clusterBizIdList;
        return this;
    }
    public java.util.List<String> getClusterBizIdList() {
        return this.clusterBizIdList;
    }

    public UninstallLibrariesRequest setLibraryBizId(String libraryBizId) {
        this.libraryBizId = libraryBizId;
        return this;
    }
    public String getLibraryBizId() {
        return this.libraryBizId;
    }

}
