// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class GetFlowAuditLogsResponseBody extends TeaModel {
    @NameInMap("Items")
    public GetFlowAuditLogsResponseBodyItems items;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GetFlowAuditLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFlowAuditLogsResponseBody self = new GetFlowAuditLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFlowAuditLogsResponseBody setItems(GetFlowAuditLogsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public GetFlowAuditLogsResponseBodyItems getItems() {
        return this.items;
    }

    public GetFlowAuditLogsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetFlowAuditLogsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetFlowAuditLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFlowAuditLogsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetFlowAuditLogsResponseBodyItemsItem extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("EntityGroupId")
        public String entityGroupId;

        @NameInMap("EntityId")
        public String entityId;

        @NameInMap("EntityType")
        public String entityType;

        @NameInMap("Operation")
        public String operation;

        @NameInMap("OperatorId")
        public String operatorId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Ts")
        public Long ts;

        @NameInMap("UserId")
        public String userId;

        public static GetFlowAuditLogsResponseBodyItemsItem build(java.util.Map<String, ?> map) throws Exception {
            GetFlowAuditLogsResponseBodyItemsItem self = new GetFlowAuditLogsResponseBodyItemsItem();
            return TeaModel.build(map, self);
        }

        public GetFlowAuditLogsResponseBodyItemsItem setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetFlowAuditLogsResponseBodyItemsItem setEntityGroupId(String entityGroupId) {
            this.entityGroupId = entityGroupId;
            return this;
        }
        public String getEntityGroupId() {
            return this.entityGroupId;
        }

        public GetFlowAuditLogsResponseBodyItemsItem setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public GetFlowAuditLogsResponseBodyItemsItem setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public GetFlowAuditLogsResponseBodyItemsItem setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public GetFlowAuditLogsResponseBodyItemsItem setOperatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }
        public String getOperatorId() {
            return this.operatorId;
        }

        public GetFlowAuditLogsResponseBodyItemsItem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetFlowAuditLogsResponseBodyItemsItem setTs(Long ts) {
            this.ts = ts;
            return this;
        }
        public Long getTs() {
            return this.ts;
        }

        public GetFlowAuditLogsResponseBodyItemsItem setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetFlowAuditLogsResponseBodyItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<GetFlowAuditLogsResponseBodyItemsItem> item;

        public static GetFlowAuditLogsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            GetFlowAuditLogsResponseBodyItems self = new GetFlowAuditLogsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public GetFlowAuditLogsResponseBodyItems setItem(java.util.List<GetFlowAuditLogsResponseBodyItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<GetFlowAuditLogsResponseBodyItemsItem> getItem() {
            return this.item;
        }

    }

}
