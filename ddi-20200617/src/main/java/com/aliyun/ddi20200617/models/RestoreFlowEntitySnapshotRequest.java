// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class RestoreFlowEntitySnapshotRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("OperatorId")
    public String operatorId;

    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("EntityId")
    public String entityId;

    @NameInMap("Revision")
    public String revision;

    public static RestoreFlowEntitySnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        RestoreFlowEntitySnapshotRequest self = new RestoreFlowEntitySnapshotRequest();
        return TeaModel.build(map, self);
    }

    public RestoreFlowEntitySnapshotRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RestoreFlowEntitySnapshotRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RestoreFlowEntitySnapshotRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public RestoreFlowEntitySnapshotRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public RestoreFlowEntitySnapshotRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public RestoreFlowEntitySnapshotRequest setRevision(String revision) {
        this.revision = revision;
        return this;
    }
    public String getRevision() {
        return this.revision;
    }

}
