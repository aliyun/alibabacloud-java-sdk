// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class QueryEntityResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Items")
    public QueryEntityResponseBodyItems items;

    public static QueryEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEntityResponseBody self = new QueryEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEntityResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEntityResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryEntityResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryEntityResponseBody setItems(QueryEntityResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public QueryEntityResponseBodyItems getItems() {
        return this.items;
    }

    public static class QueryEntityResponseBodyItemsItem extends TeaModel {
        @NameInMap("EntityId")
        public String entityId;

        @NameInMap("EntityType")
        public String entityType;

        @NameInMap("TagId")
        public Long tagId;

        public static QueryEntityResponseBodyItemsItem build(java.util.Map<String, ?> map) throws Exception {
            QueryEntityResponseBodyItemsItem self = new QueryEntityResponseBodyItemsItem();
            return TeaModel.build(map, self);
        }

        public QueryEntityResponseBodyItemsItem setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public QueryEntityResponseBodyItemsItem setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public QueryEntityResponseBodyItemsItem setTagId(Long tagId) {
            this.tagId = tagId;
            return this;
        }
        public Long getTagId() {
            return this.tagId;
        }

    }

    public static class QueryEntityResponseBodyItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<QueryEntityResponseBodyItemsItem> item;

        public static QueryEntityResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            QueryEntityResponseBodyItems self = new QueryEntityResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public QueryEntityResponseBodyItems setItem(java.util.List<QueryEntityResponseBodyItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<QueryEntityResponseBodyItemsItem> getItem() {
            return this.item;
        }

    }

}
