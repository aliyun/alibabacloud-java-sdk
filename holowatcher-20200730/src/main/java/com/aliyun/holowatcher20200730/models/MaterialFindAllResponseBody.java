// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class MaterialFindAllResponseBody extends TeaModel {
    @NameInMap("Content")
    public java.util.List<MaterialFindAllResponseBodyContent> content;

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
    public MaterialFindAllResponseBodyPageable pageable;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Size")
    public Long size;

    @NameInMap("Sort")
    public MaterialFindAllResponseBodySort sort;

    @NameInMap("TotalElements")
    public Long totalElements;

    @NameInMap("TotalPages")
    public Long totalPages;

    public static MaterialFindAllResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MaterialFindAllResponseBody self = new MaterialFindAllResponseBody();
        return TeaModel.build(map, self);
    }

    public MaterialFindAllResponseBody setContent(java.util.List<MaterialFindAllResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<MaterialFindAllResponseBodyContent> getContent() {
        return this.content;
    }

    public MaterialFindAllResponseBody setEmpty(Boolean empty) {
        this.empty = empty;
        return this;
    }
    public Boolean getEmpty() {
        return this.empty;
    }

    public MaterialFindAllResponseBody setFirst(Boolean first) {
        this.first = first;
        return this;
    }
    public Boolean getFirst() {
        return this.first;
    }

    public MaterialFindAllResponseBody setLast(Boolean last) {
        this.last = last;
        return this;
    }
    public Boolean getLast() {
        return this.last;
    }

    public MaterialFindAllResponseBody setNumber(Long number) {
        this.number = number;
        return this;
    }
    public Long getNumber() {
        return this.number;
    }

    public MaterialFindAllResponseBody setNumberOfElements(Long numberOfElements) {
        this.numberOfElements = numberOfElements;
        return this;
    }
    public Long getNumberOfElements() {
        return this.numberOfElements;
    }

    public MaterialFindAllResponseBody setPageable(MaterialFindAllResponseBodyPageable pageable) {
        this.pageable = pageable;
        return this;
    }
    public MaterialFindAllResponseBodyPageable getPageable() {
        return this.pageable;
    }

    public MaterialFindAllResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MaterialFindAllResponseBody setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public MaterialFindAllResponseBody setSort(MaterialFindAllResponseBodySort sort) {
        this.sort = sort;
        return this;
    }
    public MaterialFindAllResponseBodySort getSort() {
        return this.sort;
    }

    public MaterialFindAllResponseBody setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }
    public Long getTotalElements() {
        return this.totalElements;
    }

    public MaterialFindAllResponseBody setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Long getTotalPages() {
        return this.totalPages;
    }

    public static class MaterialFindAllResponseBodyContent extends TeaModel {
        @NameInMap("AuditStatus")
        public String auditStatus;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("Remarks")
        public String remarks;

        @NameInMap("Source")
        public String source;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Thumbnail")
        public String thumbnail;

        @NameInMap("UploadStatus")
        public String uploadStatus;

        @NameInMap("Uploader")
        public String uploader;

        @NameInMap("Url")
        public String url;

        public static MaterialFindAllResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            MaterialFindAllResponseBodyContent self = new MaterialFindAllResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public MaterialFindAllResponseBodyContent setAuditStatus(String auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public String getAuditStatus() {
            return this.auditStatus;
        }

        public MaterialFindAllResponseBodyContent setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public MaterialFindAllResponseBodyContent setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public MaterialFindAllResponseBodyContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public MaterialFindAllResponseBodyContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public MaterialFindAllResponseBodyContent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public MaterialFindAllResponseBodyContent setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public MaterialFindAllResponseBodyContent setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public MaterialFindAllResponseBodyContent setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public MaterialFindAllResponseBodyContent setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public MaterialFindAllResponseBodyContent setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }
        public String getThumbnail() {
            return this.thumbnail;
        }

        public MaterialFindAllResponseBodyContent setUploadStatus(String uploadStatus) {
            this.uploadStatus = uploadStatus;
            return this;
        }
        public String getUploadStatus() {
            return this.uploadStatus;
        }

        public MaterialFindAllResponseBodyContent setUploader(String uploader) {
            this.uploader = uploader;
            return this;
        }
        public String getUploader() {
            return this.uploader;
        }

        public MaterialFindAllResponseBodyContent setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class MaterialFindAllResponseBodyPageableSort extends TeaModel {
        @NameInMap("Empty")
        public Boolean empty;

        @NameInMap("Sorted")
        public Boolean sorted;

        @NameInMap("Unsorted")
        public Boolean unsorted;

        public static MaterialFindAllResponseBodyPageableSort build(java.util.Map<String, ?> map) throws Exception {
            MaterialFindAllResponseBodyPageableSort self = new MaterialFindAllResponseBodyPageableSort();
            return TeaModel.build(map, self);
        }

        public MaterialFindAllResponseBodyPageableSort setEmpty(Boolean empty) {
            this.empty = empty;
            return this;
        }
        public Boolean getEmpty() {
            return this.empty;
        }

        public MaterialFindAllResponseBodyPageableSort setSorted(Boolean sorted) {
            this.sorted = sorted;
            return this;
        }
        public Boolean getSorted() {
            return this.sorted;
        }

        public MaterialFindAllResponseBodyPageableSort setUnsorted(Boolean unsorted) {
            this.unsorted = unsorted;
            return this;
        }
        public Boolean getUnsorted() {
            return this.unsorted;
        }

    }

    public static class MaterialFindAllResponseBodyPageable extends TeaModel {
        @NameInMap("Offset")
        public Long offset;

        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Paged")
        public Boolean paged;

        @NameInMap("Sort")
        public MaterialFindAllResponseBodyPageableSort sort;

        @NameInMap("Unpaged")
        public Boolean unpaged;

        public static MaterialFindAllResponseBodyPageable build(java.util.Map<String, ?> map) throws Exception {
            MaterialFindAllResponseBodyPageable self = new MaterialFindAllResponseBodyPageable();
            return TeaModel.build(map, self);
        }

        public MaterialFindAllResponseBodyPageable setOffset(Long offset) {
            this.offset = offset;
            return this;
        }
        public Long getOffset() {
            return this.offset;
        }

        public MaterialFindAllResponseBodyPageable setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public MaterialFindAllResponseBodyPageable setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public MaterialFindAllResponseBodyPageable setPaged(Boolean paged) {
            this.paged = paged;
            return this;
        }
        public Boolean getPaged() {
            return this.paged;
        }

        public MaterialFindAllResponseBodyPageable setSort(MaterialFindAllResponseBodyPageableSort sort) {
            this.sort = sort;
            return this;
        }
        public MaterialFindAllResponseBodyPageableSort getSort() {
            return this.sort;
        }

        public MaterialFindAllResponseBodyPageable setUnpaged(Boolean unpaged) {
            this.unpaged = unpaged;
            return this;
        }
        public Boolean getUnpaged() {
            return this.unpaged;
        }

    }

    public static class MaterialFindAllResponseBodySort extends TeaModel {
        @NameInMap("Empty")
        public Boolean empty;

        @NameInMap("Sorted")
        public Boolean sorted;

        @NameInMap("Unsorted")
        public Boolean unsorted;

        public static MaterialFindAllResponseBodySort build(java.util.Map<String, ?> map) throws Exception {
            MaterialFindAllResponseBodySort self = new MaterialFindAllResponseBodySort();
            return TeaModel.build(map, self);
        }

        public MaterialFindAllResponseBodySort setEmpty(Boolean empty) {
            this.empty = empty;
            return this;
        }
        public Boolean getEmpty() {
            return this.empty;
        }

        public MaterialFindAllResponseBodySort setSorted(Boolean sorted) {
            this.sorted = sorted;
            return this;
        }
        public Boolean getSorted() {
            return this.sorted;
        }

        public MaterialFindAllResponseBodySort setUnsorted(Boolean unsorted) {
            this.unsorted = unsorted;
            return this;
        }
        public Boolean getUnsorted() {
            return this.unsorted;
        }

    }

}
