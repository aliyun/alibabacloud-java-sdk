// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ProjectFindUploadsResponseBody extends TeaModel {
    @NameInMap("Content")
    public java.util.List<ProjectFindUploadsResponseBodyContent> content;

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
    public ProjectFindUploadsResponseBodyPageable pageable;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Size")
    public Long size;

    @NameInMap("Sort")
    public ProjectFindUploadsResponseBodySort sort;

    @NameInMap("TotalElements")
    public Long totalElements;

    @NameInMap("TotalPages")
    public Long totalPages;

    public static ProjectFindUploadsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ProjectFindUploadsResponseBody self = new ProjectFindUploadsResponseBody();
        return TeaModel.build(map, self);
    }

    public ProjectFindUploadsResponseBody setContent(java.util.List<ProjectFindUploadsResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<ProjectFindUploadsResponseBodyContent> getContent() {
        return this.content;
    }

    public ProjectFindUploadsResponseBody setEmpty(Boolean empty) {
        this.empty = empty;
        return this;
    }
    public Boolean getEmpty() {
        return this.empty;
    }

    public ProjectFindUploadsResponseBody setFirst(Boolean first) {
        this.first = first;
        return this;
    }
    public Boolean getFirst() {
        return this.first;
    }

    public ProjectFindUploadsResponseBody setLast(Boolean last) {
        this.last = last;
        return this;
    }
    public Boolean getLast() {
        return this.last;
    }

    public ProjectFindUploadsResponseBody setNumber(Long number) {
        this.number = number;
        return this;
    }
    public Long getNumber() {
        return this.number;
    }

    public ProjectFindUploadsResponseBody setNumberOfElements(Long numberOfElements) {
        this.numberOfElements = numberOfElements;
        return this;
    }
    public Long getNumberOfElements() {
        return this.numberOfElements;
    }

    public ProjectFindUploadsResponseBody setPageable(ProjectFindUploadsResponseBodyPageable pageable) {
        this.pageable = pageable;
        return this;
    }
    public ProjectFindUploadsResponseBodyPageable getPageable() {
        return this.pageable;
    }

    public ProjectFindUploadsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ProjectFindUploadsResponseBody setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public ProjectFindUploadsResponseBody setSort(ProjectFindUploadsResponseBodySort sort) {
        this.sort = sort;
        return this;
    }
    public ProjectFindUploadsResponseBodySort getSort() {
        return this.sort;
    }

    public ProjectFindUploadsResponseBody setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }
    public Long getTotalElements() {
        return this.totalElements;
    }

    public ProjectFindUploadsResponseBody setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Long getTotalPages() {
        return this.totalPages;
    }

    public static class ProjectFindUploadsResponseBodyContent extends TeaModel {
        @NameInMap("Code")
        public String code;

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

        public static ProjectFindUploadsResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ProjectFindUploadsResponseBodyContent self = new ProjectFindUploadsResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ProjectFindUploadsResponseBodyContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ProjectFindUploadsResponseBodyContent setDatasetId(Long datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public Long getDatasetId() {
            return this.datasetId;
        }

        public ProjectFindUploadsResponseBodyContent setDeviceKey(String deviceKey) {
            this.deviceKey = deviceKey;
            return this;
        }
        public String getDeviceKey() {
            return this.deviceKey;
        }

        public ProjectFindUploadsResponseBodyContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ProjectFindUploadsResponseBodyContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ProjectFindUploadsResponseBodyContent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ProjectFindUploadsResponseBodyContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ProjectFindUploadsResponseBodyContent setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public ProjectFindUploadsResponseBodyContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ProjectFindUploadsResponseBodyPageableSort extends TeaModel {
        @NameInMap("Empty")
        public Boolean empty;

        @NameInMap("Sorted")
        public Boolean sorted;

        @NameInMap("Unsorted")
        public Boolean unsorted;

        public static ProjectFindUploadsResponseBodyPageableSort build(java.util.Map<String, ?> map) throws Exception {
            ProjectFindUploadsResponseBodyPageableSort self = new ProjectFindUploadsResponseBodyPageableSort();
            return TeaModel.build(map, self);
        }

        public ProjectFindUploadsResponseBodyPageableSort setEmpty(Boolean empty) {
            this.empty = empty;
            return this;
        }
        public Boolean getEmpty() {
            return this.empty;
        }

        public ProjectFindUploadsResponseBodyPageableSort setSorted(Boolean sorted) {
            this.sorted = sorted;
            return this;
        }
        public Boolean getSorted() {
            return this.sorted;
        }

        public ProjectFindUploadsResponseBodyPageableSort setUnsorted(Boolean unsorted) {
            this.unsorted = unsorted;
            return this;
        }
        public Boolean getUnsorted() {
            return this.unsorted;
        }

    }

    public static class ProjectFindUploadsResponseBodyPageable extends TeaModel {
        @NameInMap("Offset")
        public Long offset;

        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Paged")
        public Boolean paged;

        @NameInMap("Sort")
        public ProjectFindUploadsResponseBodyPageableSort sort;

        @NameInMap("Unpaged")
        public Boolean unpaged;

        public static ProjectFindUploadsResponseBodyPageable build(java.util.Map<String, ?> map) throws Exception {
            ProjectFindUploadsResponseBodyPageable self = new ProjectFindUploadsResponseBodyPageable();
            return TeaModel.build(map, self);
        }

        public ProjectFindUploadsResponseBodyPageable setOffset(Long offset) {
            this.offset = offset;
            return this;
        }
        public Long getOffset() {
            return this.offset;
        }

        public ProjectFindUploadsResponseBodyPageable setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ProjectFindUploadsResponseBodyPageable setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ProjectFindUploadsResponseBodyPageable setPaged(Boolean paged) {
            this.paged = paged;
            return this;
        }
        public Boolean getPaged() {
            return this.paged;
        }

        public ProjectFindUploadsResponseBodyPageable setSort(ProjectFindUploadsResponseBodyPageableSort sort) {
            this.sort = sort;
            return this;
        }
        public ProjectFindUploadsResponseBodyPageableSort getSort() {
            return this.sort;
        }

        public ProjectFindUploadsResponseBodyPageable setUnpaged(Boolean unpaged) {
            this.unpaged = unpaged;
            return this;
        }
        public Boolean getUnpaged() {
            return this.unpaged;
        }

    }

    public static class ProjectFindUploadsResponseBodySort extends TeaModel {
        @NameInMap("Empty")
        public Boolean empty;

        @NameInMap("Sorted")
        public Boolean sorted;

        @NameInMap("Unsorted")
        public Boolean unsorted;

        public static ProjectFindUploadsResponseBodySort build(java.util.Map<String, ?> map) throws Exception {
            ProjectFindUploadsResponseBodySort self = new ProjectFindUploadsResponseBodySort();
            return TeaModel.build(map, self);
        }

        public ProjectFindUploadsResponseBodySort setEmpty(Boolean empty) {
            this.empty = empty;
            return this;
        }
        public Boolean getEmpty() {
            return this.empty;
        }

        public ProjectFindUploadsResponseBodySort setSorted(Boolean sorted) {
            this.sorted = sorted;
            return this;
        }
        public Boolean getSorted() {
            return this.sorted;
        }

        public ProjectFindUploadsResponseBodySort setUnsorted(Boolean unsorted) {
            this.unsorted = unsorted;
            return this;
        }
        public Boolean getUnsorted() {
            return this.unsorted;
        }

    }

}
