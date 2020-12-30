// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListLibraryStatusResponseBody extends TeaModel {
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
    public ListLibraryStatusResponseBodyItems items;

    public static ListLibraryStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLibraryStatusResponseBody self = new ListLibraryStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLibraryStatusResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListLibraryStatusResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListLibraryStatusResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListLibraryStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLibraryStatusResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListLibraryStatusResponseBody setItems(ListLibraryStatusResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public ListLibraryStatusResponseBodyItems getItems() {
        return this.items;
    }

    public static class ListLibraryStatusResponseBodyItemsItem extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("LibraryBizId")
        public String libraryBizId;

        @NameInMap("LibraryName")
        public String libraryName;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("ClusterBizId")
        public String clusterBizId;

        public static ListLibraryStatusResponseBodyItemsItem build(java.util.Map<String, ?> map) throws Exception {
            ListLibraryStatusResponseBodyItemsItem self = new ListLibraryStatusResponseBodyItemsItem();
            return TeaModel.build(map, self);
        }

        public ListLibraryStatusResponseBodyItemsItem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListLibraryStatusResponseBodyItemsItem setLibraryBizId(String libraryBizId) {
            this.libraryBizId = libraryBizId;
            return this;
        }
        public String getLibraryBizId() {
            return this.libraryBizId;
        }

        public ListLibraryStatusResponseBodyItemsItem setLibraryName(String libraryName) {
            this.libraryName = libraryName;
            return this;
        }
        public String getLibraryName() {
            return this.libraryName;
        }

        public ListLibraryStatusResponseBodyItemsItem setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListLibraryStatusResponseBodyItemsItem setClusterBizId(String clusterBizId) {
            this.clusterBizId = clusterBizId;
            return this;
        }
        public String getClusterBizId() {
            return this.clusterBizId;
        }

    }

    public static class ListLibraryStatusResponseBodyItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<ListLibraryStatusResponseBodyItemsItem> item;

        public static ListLibraryStatusResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListLibraryStatusResponseBodyItems self = new ListLibraryStatusResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListLibraryStatusResponseBodyItems setItem(java.util.List<ListLibraryStatusResponseBodyItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<ListLibraryStatusResponseBodyItemsItem> getItem() {
            return this.item;
        }

    }

}
