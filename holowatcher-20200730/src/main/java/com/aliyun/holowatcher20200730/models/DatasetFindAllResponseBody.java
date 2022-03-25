// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetFindAllResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Content")
    public java.util.List<DatasetFindAllResponseBodyContent> content;

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
    public DatasetFindAllResponseBodyPageable pageable;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Size")
    public Long size;

    @NameInMap("Sort")
    public DatasetFindAllResponseBodySort sort;

    @NameInMap("TotalElements")
    public Long totalElements;

    @NameInMap("TotalPages")
    public Long totalPages;

    public static DatasetFindAllResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DatasetFindAllResponseBody self = new DatasetFindAllResponseBody();
        return TeaModel.build(map, self);
    }

    public DatasetFindAllResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DatasetFindAllResponseBody setContent(java.util.List<DatasetFindAllResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<DatasetFindAllResponseBodyContent> getContent() {
        return this.content;
    }

    public DatasetFindAllResponseBody setEmpty(Boolean empty) {
        this.empty = empty;
        return this;
    }
    public Boolean getEmpty() {
        return this.empty;
    }

    public DatasetFindAllResponseBody setFirst(Boolean first) {
        this.first = first;
        return this;
    }
    public Boolean getFirst() {
        return this.first;
    }

    public DatasetFindAllResponseBody setLast(Boolean last) {
        this.last = last;
        return this;
    }
    public Boolean getLast() {
        return this.last;
    }

    public DatasetFindAllResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DatasetFindAllResponseBody setNumber(Long number) {
        this.number = number;
        return this;
    }
    public Long getNumber() {
        return this.number;
    }

    public DatasetFindAllResponseBody setNumberOfElements(Long numberOfElements) {
        this.numberOfElements = numberOfElements;
        return this;
    }
    public Long getNumberOfElements() {
        return this.numberOfElements;
    }

    public DatasetFindAllResponseBody setPageable(DatasetFindAllResponseBodyPageable pageable) {
        this.pageable = pageable;
        return this;
    }
    public DatasetFindAllResponseBodyPageable getPageable() {
        return this.pageable;
    }

    public DatasetFindAllResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DatasetFindAllResponseBody setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public DatasetFindAllResponseBody setSort(DatasetFindAllResponseBodySort sort) {
        this.sort = sort;
        return this;
    }
    public DatasetFindAllResponseBodySort getSort() {
        return this.sort;
    }

    public DatasetFindAllResponseBody setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }
    public Long getTotalElements() {
        return this.totalElements;
    }

    public DatasetFindAllResponseBody setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Long getTotalPages() {
        return this.totalPages;
    }

    public static class DatasetFindAllResponseBodyContentNote extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        public static DatasetFindAllResponseBodyContentNote build(java.util.Map<String, ?> map) throws Exception {
            DatasetFindAllResponseBodyContentNote self = new DatasetFindAllResponseBodyContentNote();
            return TeaModel.build(map, self);
        }

        public DatasetFindAllResponseBodyContentNote setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DatasetFindAllResponseBodyContentNote setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DatasetFindAllResponseBodyContent extends TeaModel {
        @NameInMap("BizType")
        public String bizType;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("GmtPublished")
        public String gmtPublished;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Note")
        public DatasetFindAllResponseBodyContentNote note;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("PublishStatus")
        public String publishStatus;

        @NameInMap("Status")
        public String status;

        @NameInMap("TypeId")
        public Long typeId;

        public static DatasetFindAllResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            DatasetFindAllResponseBodyContent self = new DatasetFindAllResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public DatasetFindAllResponseBodyContent setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DatasetFindAllResponseBodyContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DatasetFindAllResponseBodyContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DatasetFindAllResponseBodyContent setGmtPublished(String gmtPublished) {
            this.gmtPublished = gmtPublished;
            return this;
        }
        public String getGmtPublished() {
            return this.gmtPublished;
        }

        public DatasetFindAllResponseBodyContent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DatasetFindAllResponseBodyContent setNote(DatasetFindAllResponseBodyContentNote note) {
            this.note = note;
            return this;
        }
        public DatasetFindAllResponseBodyContentNote getNote() {
            return this.note;
        }

        public DatasetFindAllResponseBodyContent setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public DatasetFindAllResponseBodyContent setPublishStatus(String publishStatus) {
            this.publishStatus = publishStatus;
            return this;
        }
        public String getPublishStatus() {
            return this.publishStatus;
        }

        public DatasetFindAllResponseBodyContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DatasetFindAllResponseBodyContent setTypeId(Long typeId) {
            this.typeId = typeId;
            return this;
        }
        public Long getTypeId() {
            return this.typeId;
        }

    }

    public static class DatasetFindAllResponseBodyPageableSort extends TeaModel {
        @NameInMap("Empty")
        public Boolean empty;

        @NameInMap("Sorted")
        public Boolean sorted;

        @NameInMap("Unsorted")
        public Boolean unsorted;

        public static DatasetFindAllResponseBodyPageableSort build(java.util.Map<String, ?> map) throws Exception {
            DatasetFindAllResponseBodyPageableSort self = new DatasetFindAllResponseBodyPageableSort();
            return TeaModel.build(map, self);
        }

        public DatasetFindAllResponseBodyPageableSort setEmpty(Boolean empty) {
            this.empty = empty;
            return this;
        }
        public Boolean getEmpty() {
            return this.empty;
        }

        public DatasetFindAllResponseBodyPageableSort setSorted(Boolean sorted) {
            this.sorted = sorted;
            return this;
        }
        public Boolean getSorted() {
            return this.sorted;
        }

        public DatasetFindAllResponseBodyPageableSort setUnsorted(Boolean unsorted) {
            this.unsorted = unsorted;
            return this;
        }
        public Boolean getUnsorted() {
            return this.unsorted;
        }

    }

    public static class DatasetFindAllResponseBodyPageable extends TeaModel {
        @NameInMap("Offset")
        public Long offset;

        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Paged")
        public Boolean paged;

        @NameInMap("Sort")
        public DatasetFindAllResponseBodyPageableSort sort;

        @NameInMap("Unpaged")
        public Boolean unpaged;

        public static DatasetFindAllResponseBodyPageable build(java.util.Map<String, ?> map) throws Exception {
            DatasetFindAllResponseBodyPageable self = new DatasetFindAllResponseBodyPageable();
            return TeaModel.build(map, self);
        }

        public DatasetFindAllResponseBodyPageable setOffset(Long offset) {
            this.offset = offset;
            return this;
        }
        public Long getOffset() {
            return this.offset;
        }

        public DatasetFindAllResponseBodyPageable setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DatasetFindAllResponseBodyPageable setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DatasetFindAllResponseBodyPageable setPaged(Boolean paged) {
            this.paged = paged;
            return this;
        }
        public Boolean getPaged() {
            return this.paged;
        }

        public DatasetFindAllResponseBodyPageable setSort(DatasetFindAllResponseBodyPageableSort sort) {
            this.sort = sort;
            return this;
        }
        public DatasetFindAllResponseBodyPageableSort getSort() {
            return this.sort;
        }

        public DatasetFindAllResponseBodyPageable setUnpaged(Boolean unpaged) {
            this.unpaged = unpaged;
            return this;
        }
        public Boolean getUnpaged() {
            return this.unpaged;
        }

    }

    public static class DatasetFindAllResponseBodySort extends TeaModel {
        @NameInMap("Empty")
        public Boolean empty;

        @NameInMap("Sorted")
        public Boolean sorted;

        @NameInMap("Unsorted")
        public Boolean unsorted;

        public static DatasetFindAllResponseBodySort build(java.util.Map<String, ?> map) throws Exception {
            DatasetFindAllResponseBodySort self = new DatasetFindAllResponseBodySort();
            return TeaModel.build(map, self);
        }

        public DatasetFindAllResponseBodySort setEmpty(Boolean empty) {
            this.empty = empty;
            return this;
        }
        public Boolean getEmpty() {
            return this.empty;
        }

        public DatasetFindAllResponseBodySort setSorted(Boolean sorted) {
            this.sorted = sorted;
            return this;
        }
        public Boolean getSorted() {
            return this.sorted;
        }

        public DatasetFindAllResponseBodySort setUnsorted(Boolean unsorted) {
            this.unsorted = unsorted;
            return this;
        }
        public Boolean getUnsorted() {
            return this.unsorted;
        }

    }

}
