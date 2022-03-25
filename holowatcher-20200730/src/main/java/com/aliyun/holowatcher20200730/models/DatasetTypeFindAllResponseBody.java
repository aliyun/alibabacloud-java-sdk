// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetTypeFindAllResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Content")
    public java.util.List<DatasetTypeFindAllResponseBodyContent> content;

    @NameInMap("Empty")
    public Boolean empty;

    @NameInMap("First")
    public Boolean first;

    @NameInMap("Last")
    public Boolean last;

    @NameInMap("Message")
    public String message;

    @NameInMap("Number")
    public Long number;

    @NameInMap("NumberOfElements")
    public Long numberOfElements;

    @NameInMap("Pageable")
    public DatasetTypeFindAllResponseBodyPageable pageable;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Size")
    public Long size;

    @NameInMap("Sort")
    public DatasetTypeFindAllResponseBodySort sort;

    @NameInMap("TotalElements")
    public Long totalElements;

    @NameInMap("TotalPages")
    public Long totalPages;

    public static DatasetTypeFindAllResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DatasetTypeFindAllResponseBody self = new DatasetTypeFindAllResponseBody();
        return TeaModel.build(map, self);
    }

    public DatasetTypeFindAllResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DatasetTypeFindAllResponseBody setContent(java.util.List<DatasetTypeFindAllResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<DatasetTypeFindAllResponseBodyContent> getContent() {
        return this.content;
    }

    public DatasetTypeFindAllResponseBody setEmpty(Boolean empty) {
        this.empty = empty;
        return this;
    }
    public Boolean getEmpty() {
        return this.empty;
    }

    public DatasetTypeFindAllResponseBody setFirst(Boolean first) {
        this.first = first;
        return this;
    }
    public Boolean getFirst() {
        return this.first;
    }

    public DatasetTypeFindAllResponseBody setLast(Boolean last) {
        this.last = last;
        return this;
    }
    public Boolean getLast() {
        return this.last;
    }

    public DatasetTypeFindAllResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DatasetTypeFindAllResponseBody setNumber(Long number) {
        this.number = number;
        return this;
    }
    public Long getNumber() {
        return this.number;
    }

    public DatasetTypeFindAllResponseBody setNumberOfElements(Long numberOfElements) {
        this.numberOfElements = numberOfElements;
        return this;
    }
    public Long getNumberOfElements() {
        return this.numberOfElements;
    }

    public DatasetTypeFindAllResponseBody setPageable(DatasetTypeFindAllResponseBodyPageable pageable) {
        this.pageable = pageable;
        return this;
    }
    public DatasetTypeFindAllResponseBodyPageable getPageable() {
        return this.pageable;
    }

    public DatasetTypeFindAllResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DatasetTypeFindAllResponseBody setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public DatasetTypeFindAllResponseBody setSort(DatasetTypeFindAllResponseBodySort sort) {
        this.sort = sort;
        return this;
    }
    public DatasetTypeFindAllResponseBodySort getSort() {
        return this.sort;
    }

    public DatasetTypeFindAllResponseBody setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }
    public Long getTotalElements() {
        return this.totalElements;
    }

    public DatasetTypeFindAllResponseBody setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Long getTotalPages() {
        return this.totalPages;
    }

    public static class DatasetTypeFindAllResponseBodyContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Note")
        public String note;

        public static DatasetTypeFindAllResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            DatasetTypeFindAllResponseBodyContent self = new DatasetTypeFindAllResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public DatasetTypeFindAllResponseBodyContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DatasetTypeFindAllResponseBodyContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DatasetTypeFindAllResponseBodyContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DatasetTypeFindAllResponseBodyContent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DatasetTypeFindAllResponseBodyContent setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

    }

    public static class DatasetTypeFindAllResponseBodyPageableSort extends TeaModel {
        @NameInMap("Empty")
        public Boolean empty;

        @NameInMap("Sorted")
        public Boolean sorted;

        @NameInMap("Unsorted")
        public Boolean unsorted;

        public static DatasetTypeFindAllResponseBodyPageableSort build(java.util.Map<String, ?> map) throws Exception {
            DatasetTypeFindAllResponseBodyPageableSort self = new DatasetTypeFindAllResponseBodyPageableSort();
            return TeaModel.build(map, self);
        }

        public DatasetTypeFindAllResponseBodyPageableSort setEmpty(Boolean empty) {
            this.empty = empty;
            return this;
        }
        public Boolean getEmpty() {
            return this.empty;
        }

        public DatasetTypeFindAllResponseBodyPageableSort setSorted(Boolean sorted) {
            this.sorted = sorted;
            return this;
        }
        public Boolean getSorted() {
            return this.sorted;
        }

        public DatasetTypeFindAllResponseBodyPageableSort setUnsorted(Boolean unsorted) {
            this.unsorted = unsorted;
            return this;
        }
        public Boolean getUnsorted() {
            return this.unsorted;
        }

    }

    public static class DatasetTypeFindAllResponseBodyPageable extends TeaModel {
        @NameInMap("Offset")
        public Long offset;

        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Paged")
        public Boolean paged;

        @NameInMap("Sort")
        public DatasetTypeFindAllResponseBodyPageableSort sort;

        @NameInMap("Unpaged")
        public Boolean unpaged;

        public static DatasetTypeFindAllResponseBodyPageable build(java.util.Map<String, ?> map) throws Exception {
            DatasetTypeFindAllResponseBodyPageable self = new DatasetTypeFindAllResponseBodyPageable();
            return TeaModel.build(map, self);
        }

        public DatasetTypeFindAllResponseBodyPageable setOffset(Long offset) {
            this.offset = offset;
            return this;
        }
        public Long getOffset() {
            return this.offset;
        }

        public DatasetTypeFindAllResponseBodyPageable setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DatasetTypeFindAllResponseBodyPageable setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DatasetTypeFindAllResponseBodyPageable setPaged(Boolean paged) {
            this.paged = paged;
            return this;
        }
        public Boolean getPaged() {
            return this.paged;
        }

        public DatasetTypeFindAllResponseBodyPageable setSort(DatasetTypeFindAllResponseBodyPageableSort sort) {
            this.sort = sort;
            return this;
        }
        public DatasetTypeFindAllResponseBodyPageableSort getSort() {
            return this.sort;
        }

        public DatasetTypeFindAllResponseBodyPageable setUnpaged(Boolean unpaged) {
            this.unpaged = unpaged;
            return this;
        }
        public Boolean getUnpaged() {
            return this.unpaged;
        }

    }

    public static class DatasetTypeFindAllResponseBodySort extends TeaModel {
        @NameInMap("Empty")
        public Boolean empty;

        @NameInMap("Sorted")
        public Boolean sorted;

        @NameInMap("Unsorted")
        public Boolean unsorted;

        public static DatasetTypeFindAllResponseBodySort build(java.util.Map<String, ?> map) throws Exception {
            DatasetTypeFindAllResponseBodySort self = new DatasetTypeFindAllResponseBodySort();
            return TeaModel.build(map, self);
        }

        public DatasetTypeFindAllResponseBodySort setEmpty(Boolean empty) {
            this.empty = empty;
            return this;
        }
        public Boolean getEmpty() {
            return this.empty;
        }

        public DatasetTypeFindAllResponseBodySort setSorted(Boolean sorted) {
            this.sorted = sorted;
            return this;
        }
        public Boolean getSorted() {
            return this.sorted;
        }

        public DatasetTypeFindAllResponseBodySort setUnsorted(Boolean unsorted) {
            this.unsorted = unsorted;
            return this;
        }
        public Boolean getUnsorted() {
            return this.unsorted;
        }

    }

}
