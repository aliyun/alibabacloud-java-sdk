// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CleanupFlowEntitySnapshotRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("EntityIdList")
    public String entityIdList;

    public static CleanupFlowEntitySnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        CleanupFlowEntitySnapshotRequest self = new CleanupFlowEntitySnapshotRequest();
        return TeaModel.build(map, self);
    }

    public CleanupFlowEntitySnapshotRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CleanupFlowEntitySnapshotRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CleanupFlowEntitySnapshotRequest setEntityIdList(String entityIdList) {
        this.entityIdList = entityIdList;
        return this;
    }
    public String getEntityIdList() {
        return this.entityIdList;
    }

}
