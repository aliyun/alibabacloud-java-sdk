// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetUploadFindByDatasetIdResponseBody extends TeaModel {
    @NameInMap("Content")
    public java.util.List<DatasetUploadFindByDatasetIdResponseBodyContent> content;

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
    public DatasetUploadFindByDatasetIdResponseBodyPageable pageable;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Size")
    public Long size;

    @NameInMap("Sort")
    public DatasetUploadFindByDatasetIdResponseBodySort sort;

    @NameInMap("TotalElements")
    public Long totalElements;

    @NameInMap("TotalPages")
    public Long totalPages;

    public static DatasetUploadFindByDatasetIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DatasetUploadFindByDatasetIdResponseBody self = new DatasetUploadFindByDatasetIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DatasetUploadFindByDatasetIdResponseBody setContent(java.util.List<DatasetUploadFindByDatasetIdResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<DatasetUploadFindByDatasetIdResponseBodyContent> getContent() {
        return this.content;
    }

    public DatasetUploadFindByDatasetIdResponseBody setEmpty(Boolean empty) {
        this.empty = empty;
        return this;
    }
    public Boolean getEmpty() {
        return this.empty;
    }

    public DatasetUploadFindByDatasetIdResponseBody setFirst(Boolean first) {
        this.first = first;
        return this;
    }
    public Boolean getFirst() {
        return this.first;
    }

    public DatasetUploadFindByDatasetIdResponseBody setLast(Boolean last) {
        this.last = last;
        return this;
    }
    public Boolean getLast() {
        return this.last;
    }

    public DatasetUploadFindByDatasetIdResponseBody setNumber(Long number) {
        this.number = number;
        return this;
    }
    public Long getNumber() {
        return this.number;
    }

    public DatasetUploadFindByDatasetIdResponseBody setNumberOfElements(Long numberOfElements) {
        this.numberOfElements = numberOfElements;
        return this;
    }
    public Long getNumberOfElements() {
        return this.numberOfElements;
    }

    public DatasetUploadFindByDatasetIdResponseBody setPageable(DatasetUploadFindByDatasetIdResponseBodyPageable pageable) {
        this.pageable = pageable;
        return this;
    }
    public DatasetUploadFindByDatasetIdResponseBodyPageable getPageable() {
        return this.pageable;
    }

    public DatasetUploadFindByDatasetIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DatasetUploadFindByDatasetIdResponseBody setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public DatasetUploadFindByDatasetIdResponseBody setSort(DatasetUploadFindByDatasetIdResponseBodySort sort) {
        this.sort = sort;
        return this;
    }
    public DatasetUploadFindByDatasetIdResponseBodySort getSort() {
        return this.sort;
    }

    public DatasetUploadFindByDatasetIdResponseBody setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }
    public Long getTotalElements() {
        return this.totalElements;
    }

    public DatasetUploadFindByDatasetIdResponseBody setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Long getTotalPages() {
        return this.totalPages;
    }

    public static class DatasetUploadFindByDatasetIdResponseBodyContent extends TeaModel {
        @NameInMap("Code")
        public Long code;

        @NameInMap("DatasetId")
        public Long datasetId;

        @NameInMap("DeviceKey")
        public String deviceKey;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Message")
        public String message;

        @NameInMap("Progress")
        public Long progress;

        @NameInMap("Status")
        public String status;

        public static DatasetUploadFindByDatasetIdResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            DatasetUploadFindByDatasetIdResponseBodyContent self = new DatasetUploadFindByDatasetIdResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public DatasetUploadFindByDatasetIdResponseBodyContent setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

        public DatasetUploadFindByDatasetIdResponseBodyContent setDatasetId(Long datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public Long getDatasetId() {
            return this.datasetId;
        }

        public DatasetUploadFindByDatasetIdResponseBodyContent setDeviceKey(String deviceKey) {
            this.deviceKey = deviceKey;
            return this;
        }
        public String getDeviceKey() {
            return this.deviceKey;
        }

        public DatasetUploadFindByDatasetIdResponseBodyContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DatasetUploadFindByDatasetIdResponseBodyContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DatasetUploadFindByDatasetIdResponseBodyContent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DatasetUploadFindByDatasetIdResponseBodyContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DatasetUploadFindByDatasetIdResponseBodyContent setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public DatasetUploadFindByDatasetIdResponseBodyContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DatasetUploadFindByDatasetIdResponseBodyPageableSort extends TeaModel {
        @NameInMap("Empty")
        public Boolean empty;

        @NameInMap("Sorted")
        public Boolean sorted;

        @NameInMap("Unsorted")
        public Boolean unsorted;

        public static DatasetUploadFindByDatasetIdResponseBodyPageableSort build(java.util.Map<String, ?> map) throws Exception {
            DatasetUploadFindByDatasetIdResponseBodyPageableSort self = new DatasetUploadFindByDatasetIdResponseBodyPageableSort();
            return TeaModel.build(map, self);
        }

        public DatasetUploadFindByDatasetIdResponseBodyPageableSort setEmpty(Boolean empty) {
            this.empty = empty;
            return this;
        }
        public Boolean getEmpty() {
            return this.empty;
        }

        public DatasetUploadFindByDatasetIdResponseBodyPageableSort setSorted(Boolean sorted) {
            this.sorted = sorted;
            return this;
        }
        public Boolean getSorted() {
            return this.sorted;
        }

        public DatasetUploadFindByDatasetIdResponseBodyPageableSort setUnsorted(Boolean unsorted) {
            this.unsorted = unsorted;
            return this;
        }
        public Boolean getUnsorted() {
            return this.unsorted;
        }

    }

    public static class DatasetUploadFindByDatasetIdResponseBodyPageable extends TeaModel {
        @NameInMap("Offset")
        public Long offset;

        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Paged")
        public Boolean paged;

        @NameInMap("Sort")
        public DatasetUploadFindByDatasetIdResponseBodyPageableSort sort;

        @NameInMap("Unpaged")
        public Boolean unpaged;

        public static DatasetUploadFindByDatasetIdResponseBodyPageable build(java.util.Map<String, ?> map) throws Exception {
            DatasetUploadFindByDatasetIdResponseBodyPageable self = new DatasetUploadFindByDatasetIdResponseBodyPageable();
            return TeaModel.build(map, self);
        }

        public DatasetUploadFindByDatasetIdResponseBodyPageable setOffset(Long offset) {
            this.offset = offset;
            return this;
        }
        public Long getOffset() {
            return this.offset;
        }

        public DatasetUploadFindByDatasetIdResponseBodyPageable setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DatasetUploadFindByDatasetIdResponseBodyPageable setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DatasetUploadFindByDatasetIdResponseBodyPageable setPaged(Boolean paged) {
            this.paged = paged;
            return this;
        }
        public Boolean getPaged() {
            return this.paged;
        }

        public DatasetUploadFindByDatasetIdResponseBodyPageable setSort(DatasetUploadFindByDatasetIdResponseBodyPageableSort sort) {
            this.sort = sort;
            return this;
        }
        public DatasetUploadFindByDatasetIdResponseBodyPageableSort getSort() {
            return this.sort;
        }

        public DatasetUploadFindByDatasetIdResponseBodyPageable setUnpaged(Boolean unpaged) {
            this.unpaged = unpaged;
            return this;
        }
        public Boolean getUnpaged() {
            return this.unpaged;
        }

    }

    public static class DatasetUploadFindByDatasetIdResponseBodySort extends TeaModel {
        @NameInMap("Empty")
        public Boolean empty;

        @NameInMap("Sorted")
        public Boolean sorted;

        @NameInMap("Unsorted")
        public Boolean unsorted;

        public static DatasetUploadFindByDatasetIdResponseBodySort build(java.util.Map<String, ?> map) throws Exception {
            DatasetUploadFindByDatasetIdResponseBodySort self = new DatasetUploadFindByDatasetIdResponseBodySort();
            return TeaModel.build(map, self);
        }

        public DatasetUploadFindByDatasetIdResponseBodySort setEmpty(Boolean empty) {
            this.empty = empty;
            return this;
        }
        public Boolean getEmpty() {
            return this.empty;
        }

        public DatasetUploadFindByDatasetIdResponseBodySort setSorted(Boolean sorted) {
            this.sorted = sorted;
            return this;
        }
        public Boolean getSorted() {
            return this.sorted;
        }

        public DatasetUploadFindByDatasetIdResponseBodySort setUnsorted(Boolean unsorted) {
            this.unsorted = unsorted;
            return this;
        }
        public Boolean getUnsorted() {
            return this.unsorted;
        }

    }

}
