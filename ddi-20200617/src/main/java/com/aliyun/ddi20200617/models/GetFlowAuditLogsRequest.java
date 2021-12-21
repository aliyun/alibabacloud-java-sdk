// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class GetFlowAuditLogsRequest extends TeaModel {
    @NameInMap("CurrentSize")
    public Integer currentSize;

    @NameInMap("EntityGroupId")
    public String entityGroupId;

    @NameInMap("EntityId")
    public String entityId;

    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("Operation")
    public String operation;

    @NameInMap("OperatorId")
    public String operatorId;

    @NameInMap("OrderField")
    public String orderField;

    @NameInMap("OrderMode")
    public String orderMode;

    @NameInMap("PageCount")
    public Integer pageCount;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Status")
    public String status;

    public static GetFlowAuditLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFlowAuditLogsRequest self = new GetFlowAuditLogsRequest();
        return TeaModel.build(map, self);
    }

    public GetFlowAuditLogsRequest setCurrentSize(Integer currentSize) {
        this.currentSize = currentSize;
        return this;
    }
    public Integer getCurrentSize() {
        return this.currentSize;
    }

    public GetFlowAuditLogsRequest setEntityGroupId(String entityGroupId) {
        this.entityGroupId = entityGroupId;
        return this;
    }
    public String getEntityGroupId() {
        return this.entityGroupId;
    }

    public GetFlowAuditLogsRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public GetFlowAuditLogsRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public GetFlowAuditLogsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public GetFlowAuditLogsRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public GetFlowAuditLogsRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public GetFlowAuditLogsRequest setOrderField(String orderField) {
        this.orderField = orderField;
        return this;
    }
    public String getOrderField() {
        return this.orderField;
    }

    public GetFlowAuditLogsRequest setOrderMode(String orderMode) {
        this.orderMode = orderMode;
        return this;
    }
    public String getOrderMode() {
        return this.orderMode;
    }

    public GetFlowAuditLogsRequest setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public GetFlowAuditLogsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetFlowAuditLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetFlowAuditLogsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetFlowAuditLogsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetFlowAuditLogsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
