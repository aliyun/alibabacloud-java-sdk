// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class QueryTagResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Items")
    public QueryTagResponseBodyItems items;

    public static QueryTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTagResponseBody self = new QueryTagResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTagResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTagResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTagResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryTagResponseBody setItems(QueryTagResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public QueryTagResponseBodyItems getItems() {
        return this.items;
    }

    public static class QueryTagResponseBodyItemsItem extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Category")
        public String category;

        @NameInMap("Name")
        public String name;

        public static QueryTagResponseBodyItemsItem build(java.util.Map<String, ?> map) throws Exception {
            QueryTagResponseBodyItemsItem self = new QueryTagResponseBodyItemsItem();
            return TeaModel.build(map, self);
        }

        public QueryTagResponseBodyItemsItem setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryTagResponseBodyItemsItem setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public QueryTagResponseBodyItemsItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QueryTagResponseBodyItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<QueryTagResponseBodyItemsItem> item;

        public static QueryTagResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            QueryTagResponseBodyItems self = new QueryTagResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public QueryTagResponseBodyItems setItem(java.util.List<QueryTagResponseBodyItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<QueryTagResponseBodyItemsItem> getItem() {
            return this.item;
        }

    }

}
