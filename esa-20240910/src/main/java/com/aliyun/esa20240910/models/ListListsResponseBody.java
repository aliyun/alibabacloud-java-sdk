// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListListsResponseBody extends TeaModel {
    /**
     * <p>The total number of items across all lists.</p>
     * 
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("ItemsUsage")
    public Long itemsUsage;

    /**
     * <p>A paginated array of lists.</p>
     */
    @NameInMap("Lists")
    public java.util.List<ListListsResponseBodyLists> lists;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of filtered records.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The number of lists used by the account.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Usage")
    public Long usage;

    public static ListListsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListListsResponseBody self = new ListListsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListListsResponseBody setItemsUsage(Long itemsUsage) {
        this.itemsUsage = itemsUsage;
        return this;
    }
    public Long getItemsUsage() {
        return this.itemsUsage;
    }

    public ListListsResponseBody setLists(java.util.List<ListListsResponseBodyLists> lists) {
        this.lists = lists;
        return this;
    }
    public java.util.List<ListListsResponseBodyLists> getLists() {
        return this.lists;
    }

    public ListListsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListListsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListListsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListListsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListListsResponseBody setUsage(Long usage) {
        this.usage = usage;
        return this;
    }
    public Long getUsage() {
        return this.usage;
    }

    public static class ListListsResponseBodyLists extends TeaModel {
        /**
         * <p>The description of the list.</p>
         * 
         * <strong>example:</strong>
         * <p>a custom list</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the custom list. To get this ID, call the <a href="https://help.aliyun.com/document_detail/2850217.html">ListLists</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>40000001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The kind of the list.</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("Kind")
        public String kind;

        /**
         * <p>The number of items in the list.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Length")
        public Long length;

        /**
         * <p>The name of the list.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The time when the list was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01T00:00:00Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListListsResponseBodyLists build(java.util.Map<String, ?> map) throws Exception {
            ListListsResponseBodyLists self = new ListListsResponseBodyLists();
            return TeaModel.build(map, self);
        }

        public ListListsResponseBodyLists setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListListsResponseBodyLists setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListListsResponseBodyLists setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public ListListsResponseBodyLists setLength(Long length) {
            this.length = length;
            return this;
        }
        public Long getLength() {
            return this.length;
        }

        public ListListsResponseBodyLists setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListListsResponseBodyLists setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
