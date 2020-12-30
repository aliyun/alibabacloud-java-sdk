// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListLibrariesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Items")
    public ListLibrariesResponseBodyItems items;

    public static ListLibrariesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLibrariesResponseBody self = new ListLibrariesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLibrariesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListLibrariesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListLibrariesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListLibrariesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLibrariesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListLibrariesResponseBody setItems(ListLibrariesResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public ListLibrariesResponseBodyItems getItems() {
        return this.items;
    }

    public static class ListLibrariesResponseBodyItemsItem extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("Scope")
        public String scope;

        @NameInMap("LibraryVersion")
        public String libraryVersion;

        @NameInMap("Name")
        public String name;

        @NameInMap("Properties")
        public String properties;

        @NameInMap("SourceLocation")
        public String sourceLocation;

        public static ListLibrariesResponseBodyItemsItem build(java.util.Map<String, ?> map) throws Exception {
            ListLibrariesResponseBodyItemsItem self = new ListLibrariesResponseBodyItemsItem();
            return TeaModel.build(map, self);
        }

        public ListLibrariesResponseBodyItemsItem setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListLibrariesResponseBodyItemsItem setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListLibrariesResponseBodyItemsItem setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListLibrariesResponseBodyItemsItem setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListLibrariesResponseBodyItemsItem setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public ListLibrariesResponseBodyItemsItem setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListLibrariesResponseBodyItemsItem setLibraryVersion(String libraryVersion) {
            this.libraryVersion = libraryVersion;
            return this;
        }
        public String getLibraryVersion() {
            return this.libraryVersion;
        }

        public ListLibrariesResponseBodyItemsItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLibrariesResponseBodyItemsItem setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public ListLibrariesResponseBodyItemsItem setSourceLocation(String sourceLocation) {
            this.sourceLocation = sourceLocation;
            return this;
        }
        public String getSourceLocation() {
            return this.sourceLocation;
        }

    }

    public static class ListLibrariesResponseBodyItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<ListLibrariesResponseBodyItemsItem> item;

        public static ListLibrariesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListLibrariesResponseBodyItems self = new ListLibrariesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListLibrariesResponseBodyItems setItem(java.util.List<ListLibrariesResponseBodyItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<ListLibrariesResponseBodyItemsItem> getItem() {
            return this.item;
        }

    }

}
