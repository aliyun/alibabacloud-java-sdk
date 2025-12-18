// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListListsResponseBody extends TeaModel {
    @NameInMap("ItemsUsage")
    public Long itemsUsage;

    /**
     * <p>The array that contains list information, including list data after paging.</p>
     */
    @NameInMap("Lists")
    public java.util.List<ListListsResponseBodyLists> lists;

    /**
     * <p>The page number returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
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
     * <p>The total number of filtered lists.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The number of created lists.</p>
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
         * <p>The list description.</p>
         * 
         * <strong>example:</strong>
         * <p>a custom list</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the custom list.<a href="~~2850217~~"></a></p>
         * 
         * <strong>example:</strong>
         * <p>40000001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The list type.</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("Kind")
        public String kind;

        /**
         * <p>The length of the list information array, which indicates how many items the list contains.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Length")
        public Long length;

        /**
         * <p>The list name.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The time when the list was last modified.</p>
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
