// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ReleaseClusterRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Id")
    public String id;

    @NameInMap("ForceRelease")
    public Boolean forceRelease;

    public static ReleaseClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseClusterRequest self = new ReleaseClusterRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseClusterRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ReleaseClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ReleaseClusterRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ReleaseClusterRequest setForceRelease(Boolean forceRelease) {
        this.forceRelease = forceRelease;
        return this;
    }
    public Boolean getForceRelease() {
        return this.forceRelease;
    }

}
