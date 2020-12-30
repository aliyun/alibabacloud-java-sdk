// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListFlowEntitySnapshotResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Items")
    public ListFlowEntitySnapshotResponseBodyItems items;

    public static ListFlowEntitySnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowEntitySnapshotResponseBody self = new ListFlowEntitySnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowEntitySnapshotResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListFlowEntitySnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowEntitySnapshotResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFlowEntitySnapshotResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFlowEntitySnapshotResponseBody setItems(ListFlowEntitySnapshotResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public ListFlowEntitySnapshotResponseBodyItems getItems() {
        return this.items;
    }

    public static class ListFlowEntitySnapshotResponseBodyItemsItem extends TeaModel {
        @NameInMap("Active")
        public Boolean active;

        @NameInMap("Data")
        public String data;

        @NameInMap("EntityId")
        public String entityId;

        @NameInMap("EntityType")
        public String entityType;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Message")
        public String message;

        @NameInMap("EntityGroupId")
        public String entityGroupId;

        @NameInMap("CommitterId")
        public String committerId;

        @NameInMap("Revision")
        public String revision;

        public static ListFlowEntitySnapshotResponseBodyItemsItem build(java.util.Map<String, ?> map) throws Exception {
            ListFlowEntitySnapshotResponseBodyItemsItem self = new ListFlowEntitySnapshotResponseBodyItemsItem();
            return TeaModel.build(map, self);
        }

        public ListFlowEntitySnapshotResponseBodyItemsItem setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public ListFlowEntitySnapshotResponseBodyItemsItem setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public ListFlowEntitySnapshotResponseBodyItemsItem setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public ListFlowEntitySnapshotResponseBodyItemsItem setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public ListFlowEntitySnapshotResponseBodyItemsItem setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListFlowEntitySnapshotResponseBodyItemsItem setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListFlowEntitySnapshotResponseBodyItemsItem setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListFlowEntitySnapshotResponseBodyItemsItem setEntityGroupId(String entityGroupId) {
            this.entityGroupId = entityGroupId;
            return this;
        }
        public String getEntityGroupId() {
            return this.entityGroupId;
        }

        public ListFlowEntitySnapshotResponseBodyItemsItem setCommitterId(String committerId) {
            this.committerId = committerId;
            return this;
        }
        public String getCommitterId() {
            return this.committerId;
        }

        public ListFlowEntitySnapshotResponseBodyItemsItem setRevision(String revision) {
            this.revision = revision;
            return this;
        }
        public String getRevision() {
            return this.revision;
        }

    }

    public static class ListFlowEntitySnapshotResponseBodyItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<ListFlowEntitySnapshotResponseBodyItemsItem> item;

        public static ListFlowEntitySnapshotResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListFlowEntitySnapshotResponseBodyItems self = new ListFlowEntitySnapshotResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListFlowEntitySnapshotResponseBodyItems setItem(java.util.List<ListFlowEntitySnapshotResponseBodyItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<ListFlowEntitySnapshotResponseBodyItemsItem> getItem() {
            return this.item;
        }

    }

}
