// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class PipelineFindAllResponseBody extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("Empty")
    public Boolean empty;

    @NameInMap("First")
    public Boolean first;

    @NameInMap("Last")
    public String last;

    @NameInMap("Number")
    public Long number;

    @NameInMap("NumberOfElements")
    public Long numberOfElements;

    @NameInMap("Pageable")
    public PipelineFindAllResponseBodyPageable pageable;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Size")
    public Long size;

    @NameInMap("Sort")
    public PipelineFindAllResponseBodySort sort;

    @NameInMap("TotalElements")
    public Long totalElements;

    @NameInMap("TotalPages")
    public Long totalPages;

    public static PipelineFindAllResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PipelineFindAllResponseBody self = new PipelineFindAllResponseBody();
        return TeaModel.build(map, self);
    }

    public PipelineFindAllResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public PipelineFindAllResponseBody setEmpty(Boolean empty) {
        this.empty = empty;
        return this;
    }
    public Boolean getEmpty() {
        return this.empty;
    }

    public PipelineFindAllResponseBody setFirst(Boolean first) {
        this.first = first;
        return this;
    }
    public Boolean getFirst() {
        return this.first;
    }

    public PipelineFindAllResponseBody setLast(String last) {
        this.last = last;
        return this;
    }
    public String getLast() {
        return this.last;
    }

    public PipelineFindAllResponseBody setNumber(Long number) {
        this.number = number;
        return this;
    }
    public Long getNumber() {
        return this.number;
    }

    public PipelineFindAllResponseBody setNumberOfElements(Long numberOfElements) {
        this.numberOfElements = numberOfElements;
        return this;
    }
    public Long getNumberOfElements() {
        return this.numberOfElements;
    }

    public PipelineFindAllResponseBody setPageable(PipelineFindAllResponseBodyPageable pageable) {
        this.pageable = pageable;
        return this;
    }
    public PipelineFindAllResponseBodyPageable getPageable() {
        return this.pageable;
    }

    public PipelineFindAllResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PipelineFindAllResponseBody setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public PipelineFindAllResponseBody setSort(PipelineFindAllResponseBodySort sort) {
        this.sort = sort;
        return this;
    }
    public PipelineFindAllResponseBodySort getSort() {
        return this.sort;
    }

    public PipelineFindAllResponseBody setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }
    public Long getTotalElements() {
        return this.totalElements;
    }

    public PipelineFindAllResponseBody setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Long getTotalPages() {
        return this.totalPages;
    }

    public static class PipelineFindAllResponseBodyPageableSort extends TeaModel {
        @NameInMap("Empty")
        public Boolean empty;

        @NameInMap("Sorted")
        public Boolean sorted;

        @NameInMap("Unsorted")
        public Boolean unsorted;

        public static PipelineFindAllResponseBodyPageableSort build(java.util.Map<String, ?> map) throws Exception {
            PipelineFindAllResponseBodyPageableSort self = new PipelineFindAllResponseBodyPageableSort();
            return TeaModel.build(map, self);
        }

        public PipelineFindAllResponseBodyPageableSort setEmpty(Boolean empty) {
            this.empty = empty;
            return this;
        }
        public Boolean getEmpty() {
            return this.empty;
        }

        public PipelineFindAllResponseBodyPageableSort setSorted(Boolean sorted) {
            this.sorted = sorted;
            return this;
        }
        public Boolean getSorted() {
            return this.sorted;
        }

        public PipelineFindAllResponseBodyPageableSort setUnsorted(Boolean unsorted) {
            this.unsorted = unsorted;
            return this;
        }
        public Boolean getUnsorted() {
            return this.unsorted;
        }

    }

    public static class PipelineFindAllResponseBodyPageable extends TeaModel {
        @NameInMap("Offset")
        public Long offset;

        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Paged")
        public Boolean paged;

        @NameInMap("Sort")
        public PipelineFindAllResponseBodyPageableSort sort;

        @NameInMap("Unpaged")
        public Boolean unpaged;

        public static PipelineFindAllResponseBodyPageable build(java.util.Map<String, ?> map) throws Exception {
            PipelineFindAllResponseBodyPageable self = new PipelineFindAllResponseBodyPageable();
            return TeaModel.build(map, self);
        }

        public PipelineFindAllResponseBodyPageable setOffset(Long offset) {
            this.offset = offset;
            return this;
        }
        public Long getOffset() {
            return this.offset;
        }

        public PipelineFindAllResponseBodyPageable setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public PipelineFindAllResponseBodyPageable setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public PipelineFindAllResponseBodyPageable setPaged(Boolean paged) {
            this.paged = paged;
            return this;
        }
        public Boolean getPaged() {
            return this.paged;
        }

        public PipelineFindAllResponseBodyPageable setSort(PipelineFindAllResponseBodyPageableSort sort) {
            this.sort = sort;
            return this;
        }
        public PipelineFindAllResponseBodyPageableSort getSort() {
            return this.sort;
        }

        public PipelineFindAllResponseBodyPageable setUnpaged(Boolean unpaged) {
            this.unpaged = unpaged;
            return this;
        }
        public Boolean getUnpaged() {
            return this.unpaged;
        }

    }

    public static class PipelineFindAllResponseBodySort extends TeaModel {
        @NameInMap("Empty")
        public Boolean empty;

        @NameInMap("Sorted")
        public Boolean sorted;

        @NameInMap("Unsorted")
        public Boolean unsorted;

        public static PipelineFindAllResponseBodySort build(java.util.Map<String, ?> map) throws Exception {
            PipelineFindAllResponseBodySort self = new PipelineFindAllResponseBodySort();
            return TeaModel.build(map, self);
        }

        public PipelineFindAllResponseBodySort setEmpty(Boolean empty) {
            this.empty = empty;
            return this;
        }
        public Boolean getEmpty() {
            return this.empty;
        }

        public PipelineFindAllResponseBodySort setSorted(Boolean sorted) {
            this.sorted = sorted;
            return this;
        }
        public Boolean getSorted() {
            return this.sorted;
        }

        public PipelineFindAllResponseBodySort setUnsorted(Boolean unsorted) {
            this.unsorted = unsorted;
            return this;
        }
        public Boolean getUnsorted() {
            return this.unsorted;
        }

    }

}
