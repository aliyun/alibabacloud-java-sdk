// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListFlowEntitySnapshotRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CurrentSize")
    public Integer currentSize;

    @NameInMap("PageCount")
    public Integer pageCount;

    @NameInMap("OrderField")
    public String orderField;

    @NameInMap("OrderMode")
    public String orderMode;

    @NameInMap("CommitterId")
    public String committerId;

    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("EntityGroupId")
    public String entityGroupId;

    @NameInMap("EntityId")
    public String entityId;

    @NameInMap("Revision")
    public String revision;

    public static ListFlowEntitySnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFlowEntitySnapshotRequest self = new ListFlowEntitySnapshotRequest();
        return TeaModel.build(map, self);
    }

    public ListFlowEntitySnapshotRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListFlowEntitySnapshotRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListFlowEntitySnapshotRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListFlowEntitySnapshotRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFlowEntitySnapshotRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFlowEntitySnapshotRequest setCurrentSize(Integer currentSize) {
        this.currentSize = currentSize;
        return this;
    }
    public Integer getCurrentSize() {
        return this.currentSize;
    }

    public ListFlowEntitySnapshotRequest setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public ListFlowEntitySnapshotRequest setOrderField(String orderField) {
        this.orderField = orderField;
        return this;
    }
    public String getOrderField() {
        return this.orderField;
    }

    public ListFlowEntitySnapshotRequest setOrderMode(String orderMode) {
        this.orderMode = orderMode;
        return this;
    }
    public String getOrderMode() {
        return this.orderMode;
    }

    public ListFlowEntitySnapshotRequest setCommitterId(String committerId) {
        this.committerId = committerId;
        return this;
    }
    public String getCommitterId() {
        return this.committerId;
    }

    public ListFlowEntitySnapshotRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public ListFlowEntitySnapshotRequest setEntityGroupId(String entityGroupId) {
        this.entityGroupId = entityGroupId;
        return this;
    }
    public String getEntityGroupId() {
        return this.entityGroupId;
    }

    public ListFlowEntitySnapshotRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public ListFlowEntitySnapshotRequest setRevision(String revision) {
        this.revision = revision;
        return this;
    }
    public String getRevision() {
        return this.revision;
    }

}
