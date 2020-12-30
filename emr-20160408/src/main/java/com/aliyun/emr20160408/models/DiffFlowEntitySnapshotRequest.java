// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DiffFlowEntitySnapshotRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("EntityId")
    public String entityId;

    @NameInMap("SrcRevision")
    public String srcRevision;

    @NameInMap("DstRevision")
    public String dstRevision;

    public static DiffFlowEntitySnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        DiffFlowEntitySnapshotRequest self = new DiffFlowEntitySnapshotRequest();
        return TeaModel.build(map, self);
    }

    public DiffFlowEntitySnapshotRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DiffFlowEntitySnapshotRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DiffFlowEntitySnapshotRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public DiffFlowEntitySnapshotRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public DiffFlowEntitySnapshotRequest setSrcRevision(String srcRevision) {
        this.srcRevision = srcRevision;
        return this;
    }
    public String getSrcRevision() {
        return this.srcRevision;
    }

    public DiffFlowEntitySnapshotRequest setDstRevision(String dstRevision) {
        this.dstRevision = dstRevision;
        return this;
    }
    public String getDstRevision() {
        return this.dstRevision;
    }

}
