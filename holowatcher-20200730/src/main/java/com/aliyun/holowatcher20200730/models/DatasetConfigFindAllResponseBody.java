// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetConfigFindAllResponseBody extends TeaModel {
    @NameInMap("Content")
    public java.util.List<DatasetConfigFindAllResponseBodyContent> content;

    @NameInMap("Empty")
    public Boolean empty;

    @NameInMap("First")
    public Boolean first;

    @NameInMap("Last")
    public Boolean last;

    @NameInMap("Number")
    public Long number;

    @NameInMap("NumberOfElements")
    public Long numberOfElements;

    @NameInMap("Pageable")
    public DatasetConfigFindAllResponseBodyPageable pageable;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Size")
    public Long size;

    @NameInMap("Sort")
    public DatasetConfigFindAllResponseBodySort sort;

    @NameInMap("TotalElements")
    public Long totalElements;

    @NameInMap("TotalPages")
    public Long totalPages;

    public static DatasetConfigFindAllResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DatasetConfigFindAllResponseBody self = new DatasetConfigFindAllResponseBody();
        return TeaModel.build(map, self);
    }

    public DatasetConfigFindAllResponseBody setContent(java.util.List<DatasetConfigFindAllResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<DatasetConfigFindAllResponseBodyContent> getContent() {
        return this.content;
    }

    public DatasetConfigFindAllResponseBody setEmpty(Boolean empty) {
        this.empty = empty;
        return this;
    }
    public Boolean getEmpty() {
        return this.empty;
    }

    public DatasetConfigFindAllResponseBody setFirst(Boolean first) {
        this.first = first;
        return this;
    }
    public Boolean getFirst() {
        return this.first;
    }

    public DatasetConfigFindAllResponseBody setLast(Boolean last) {
        this.last = last;
        return this;
    }
    public Boolean getLast() {
        return this.last;
    }

    public DatasetConfigFindAllResponseBody setNumber(Long number) {
        this.number = number;
        return this;
    }
    public Long getNumber() {
        return this.number;
    }

    public DatasetConfigFindAllResponseBody setNumberOfElements(Long numberOfElements) {
        this.numberOfElements = numberOfElements;
        return this;
    }
    public Long getNumberOfElements() {
        return this.numberOfElements;
    }

    public DatasetConfigFindAllResponseBody setPageable(DatasetConfigFindAllResponseBodyPageable pageable) {
        this.pageable = pageable;
        return this;
    }
    public DatasetConfigFindAllResponseBodyPageable getPageable() {
        return this.pageable;
    }

    public DatasetConfigFindAllResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DatasetConfigFindAllResponseBody setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public DatasetConfigFindAllResponseBody setSort(DatasetConfigFindAllResponseBodySort sort) {
        this.sort = sort;
        return this;
    }
    public DatasetConfigFindAllResponseBodySort getSort() {
        return this.sort;
    }

    public DatasetConfigFindAllResponseBody setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }
    public Long getTotalElements() {
        return this.totalElements;
    }

    public DatasetConfigFindAllResponseBody setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Long getTotalPages() {
        return this.totalPages;
    }

    public static class DatasetConfigFindAllResponseBodyContent extends TeaModel {
        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("GmtPublished")
        public String gmtPublished;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Key")
        public String key;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public java.util.Map<String, ?> value;

        public static DatasetConfigFindAllResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            DatasetConfigFindAllResponseBodyContent self = new DatasetConfigFindAllResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public DatasetConfigFindAllResponseBodyContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DatasetConfigFindAllResponseBodyContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DatasetConfigFindAllResponseBodyContent setGmtPublished(String gmtPublished) {
            this.gmtPublished = gmtPublished;
            return this;
        }
        public String getGmtPublished() {
            return this.gmtPublished;
        }

        public DatasetConfigFindAllResponseBodyContent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DatasetConfigFindAllResponseBodyContent setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DatasetConfigFindAllResponseBodyContent setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DatasetConfigFindAllResponseBodyContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DatasetConfigFindAllResponseBodyContent setValue(java.util.Map<String, ?> value) {
            this.value = value;
            return this;
        }
        public java.util.Map<String, ?> getValue() {
            return this.value;
        }

    }

    public static class DatasetConfigFindAllResponseBodyPageableSort extends TeaModel {
        @NameInMap("Empty")
        public Boolean empty;

        @NameInMap("Sorted")
        public Boolean sorted;

        @NameInMap("Unsorted")
        public Boolean unsorted;

        public static DatasetConfigFindAllResponseBodyPageableSort build(java.util.Map<String, ?> map) throws Exception {
            DatasetConfigFindAllResponseBodyPageableSort self = new DatasetConfigFindAllResponseBodyPageableSort();
            return TeaModel.build(map, self);
        }

        public DatasetConfigFindAllResponseBodyPageableSort setEmpty(Boolean empty) {
            this.empty = empty;
            return this;
        }
        public Boolean getEmpty() {
            return this.empty;
        }

        public DatasetConfigFindAllResponseBodyPageableSort setSorted(Boolean sorted) {
            this.sorted = sorted;
            return this;
        }
        public Boolean getSorted() {
            return this.sorted;
        }

        public DatasetConfigFindAllResponseBodyPageableSort setUnsorted(Boolean unsorted) {
            this.unsorted = unsorted;
            return this;
        }
        public Boolean getUnsorted() {
            return this.unsorted;
        }

    }

    public static class DatasetConfigFindAllResponseBodyPageable extends TeaModel {
        @NameInMap("Offset")
        public Long offset;

        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Paged")
        public Boolean paged;

        @NameInMap("Sort")
        public DatasetConfigFindAllResponseBodyPageableSort sort;

        @NameInMap("Unpaged")
        public Boolean unpaged;

        public static DatasetConfigFindAllResponseBodyPageable build(java.util.Map<String, ?> map) throws Exception {
            DatasetConfigFindAllResponseBodyPageable self = new DatasetConfigFindAllResponseBodyPageable();
            return TeaModel.build(map, self);
        }

        public DatasetConfigFindAllResponseBodyPageable setOffset(Long offset) {
            this.offset = offset;
            return this;
        }
        public Long getOffset() {
            return this.offset;
        }

        public DatasetConfigFindAllResponseBodyPageable setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DatasetConfigFindAllResponseBodyPageable setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DatasetConfigFindAllResponseBodyPageable setPaged(Boolean paged) {
            this.paged = paged;
            return this;
        }
        public Boolean getPaged() {
            return this.paged;
        }

        public DatasetConfigFindAllResponseBodyPageable setSort(DatasetConfigFindAllResponseBodyPageableSort sort) {
            this.sort = sort;
            return this;
        }
        public DatasetConfigFindAllResponseBodyPageableSort getSort() {
            return this.sort;
        }

        public DatasetConfigFindAllResponseBodyPageable setUnpaged(Boolean unpaged) {
            this.unpaged = unpaged;
            return this;
        }
        public Boolean getUnpaged() {
            return this.unpaged;
        }

    }

    public static class DatasetConfigFindAllResponseBodySort extends TeaModel {
        @NameInMap("Empty")
        public Boolean empty;

        @NameInMap("Sorted")
        public Boolean sorted;

        @NameInMap("Unsorted")
        public Boolean unsorted;

        public static DatasetConfigFindAllResponseBodySort build(java.util.Map<String, ?> map) throws Exception {
            DatasetConfigFindAllResponseBodySort self = new DatasetConfigFindAllResponseBodySort();
            return TeaModel.build(map, self);
        }

        public DatasetConfigFindAllResponseBodySort setEmpty(Boolean empty) {
            this.empty = empty;
            return this;
        }
        public Boolean getEmpty() {
            return this.empty;
        }

        public DatasetConfigFindAllResponseBodySort setSorted(Boolean sorted) {
            this.sorted = sorted;
            return this;
        }
        public Boolean getSorted() {
            return this.sorted;
        }

        public DatasetConfigFindAllResponseBodySort setUnsorted(Boolean unsorted) {
            this.unsorted = unsorted;
            return this;
        }
        public Boolean getUnsorted() {
            return this.unsorted;
        }

    }

}
