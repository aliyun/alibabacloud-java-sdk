// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class MaterialFindAllVideoResponseBody extends TeaModel {
    @NameInMap("Content")
    public java.util.List<MaterialFindAllVideoResponseBodyContent> content;

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
    public MaterialFindAllVideoResponseBodyPageable pageable;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Size")
    public Long size;

    @NameInMap("Sort")
    public MaterialFindAllVideoResponseBodySort sort;

    @NameInMap("TotalElements")
    public Long totalElements;

    @NameInMap("TotalPages")
    public Long totalPages;

    public static MaterialFindAllVideoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MaterialFindAllVideoResponseBody self = new MaterialFindAllVideoResponseBody();
        return TeaModel.build(map, self);
    }

    public MaterialFindAllVideoResponseBody setContent(java.util.List<MaterialFindAllVideoResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<MaterialFindAllVideoResponseBodyContent> getContent() {
        return this.content;
    }

    public MaterialFindAllVideoResponseBody setEmpty(Boolean empty) {
        this.empty = empty;
        return this;
    }
    public Boolean getEmpty() {
        return this.empty;
    }

    public MaterialFindAllVideoResponseBody setFirst(Boolean first) {
        this.first = first;
        return this;
    }
    public Boolean getFirst() {
        return this.first;
    }

    public MaterialFindAllVideoResponseBody setLast(Boolean last) {
        this.last = last;
        return this;
    }
    public Boolean getLast() {
        return this.last;
    }

    public MaterialFindAllVideoResponseBody setNumber(Long number) {
        this.number = number;
        return this;
    }
    public Long getNumber() {
        return this.number;
    }

    public MaterialFindAllVideoResponseBody setNumberOfElements(Long numberOfElements) {
        this.numberOfElements = numberOfElements;
        return this;
    }
    public Long getNumberOfElements() {
        return this.numberOfElements;
    }

    public MaterialFindAllVideoResponseBody setPageable(MaterialFindAllVideoResponseBodyPageable pageable) {
        this.pageable = pageable;
        return this;
    }
    public MaterialFindAllVideoResponseBodyPageable getPageable() {
        return this.pageable;
    }

    public MaterialFindAllVideoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MaterialFindAllVideoResponseBody setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public MaterialFindAllVideoResponseBody setSort(MaterialFindAllVideoResponseBodySort sort) {
        this.sort = sort;
        return this;
    }
    public MaterialFindAllVideoResponseBodySort getSort() {
        return this.sort;
    }

    public MaterialFindAllVideoResponseBody setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }
    public Long getTotalElements() {
        return this.totalElements;
    }

    public MaterialFindAllVideoResponseBody setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Long getTotalPages() {
        return this.totalPages;
    }

    public static class MaterialFindAllVideoResponseBodyContent extends TeaModel {
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

        @NameInMap("RealFileName")
        public String realFileName;

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

        public static MaterialFindAllVideoResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            MaterialFindAllVideoResponseBodyContent self = new MaterialFindAllVideoResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public MaterialFindAllVideoResponseBodyContent setAuditStatus(String auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public String getAuditStatus() {
            return this.auditStatus;
        }

        public MaterialFindAllVideoResponseBodyContent setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public MaterialFindAllVideoResponseBodyContent setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public MaterialFindAllVideoResponseBodyContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public MaterialFindAllVideoResponseBodyContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public MaterialFindAllVideoResponseBodyContent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public MaterialFindAllVideoResponseBodyContent setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public MaterialFindAllVideoResponseBodyContent setRealFileName(String realFileName) {
            this.realFileName = realFileName;
            return this;
        }
        public String getRealFileName() {
            return this.realFileName;
        }

        public MaterialFindAllVideoResponseBodyContent setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public MaterialFindAllVideoResponseBodyContent setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public MaterialFindAllVideoResponseBodyContent setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public MaterialFindAllVideoResponseBodyContent setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }
        public String getThumbnail() {
            return this.thumbnail;
        }

        public MaterialFindAllVideoResponseBodyContent setUploadStatus(String uploadStatus) {
            this.uploadStatus = uploadStatus;
            return this;
        }
        public String getUploadStatus() {
            return this.uploadStatus;
        }

        public MaterialFindAllVideoResponseBodyContent setUploader(String uploader) {
            this.uploader = uploader;
            return this;
        }
        public String getUploader() {
            return this.uploader;
        }

        public MaterialFindAllVideoResponseBodyContent setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class MaterialFindAllVideoResponseBodyPageableSort extends TeaModel {
        @NameInMap("Empty")
        public Boolean empty;

        @NameInMap("Sorted")
        public Boolean sorted;

        @NameInMap("Unsorted")
        public Boolean unsorted;

        public static MaterialFindAllVideoResponseBodyPageableSort build(java.util.Map<String, ?> map) throws Exception {
            MaterialFindAllVideoResponseBodyPageableSort self = new MaterialFindAllVideoResponseBodyPageableSort();
            return TeaModel.build(map, self);
        }

        public MaterialFindAllVideoResponseBodyPageableSort setEmpty(Boolean empty) {
            this.empty = empty;
            return this;
        }
        public Boolean getEmpty() {
            return this.empty;
        }

        public MaterialFindAllVideoResponseBodyPageableSort setSorted(Boolean sorted) {
            this.sorted = sorted;
            return this;
        }
        public Boolean getSorted() {
            return this.sorted;
        }

        public MaterialFindAllVideoResponseBodyPageableSort setUnsorted(Boolean unsorted) {
            this.unsorted = unsorted;
            return this;
        }
        public Boolean getUnsorted() {
            return this.unsorted;
        }

    }

    public static class MaterialFindAllVideoResponseBodyPageable extends TeaModel {
        @NameInMap("Offset")
        public Long offset;

        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Paged")
        public Boolean paged;

        @NameInMap("Sort")
        public MaterialFindAllVideoResponseBodyPageableSort sort;

        @NameInMap("Unpaged")
        public Boolean unpaged;

        public static MaterialFindAllVideoResponseBodyPageable build(java.util.Map<String, ?> map) throws Exception {
            MaterialFindAllVideoResponseBodyPageable self = new MaterialFindAllVideoResponseBodyPageable();
            return TeaModel.build(map, self);
        }

        public MaterialFindAllVideoResponseBodyPageable setOffset(Long offset) {
            this.offset = offset;
            return this;
        }
        public Long getOffset() {
            return this.offset;
        }

        public MaterialFindAllVideoResponseBodyPageable setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public MaterialFindAllVideoResponseBodyPageable setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public MaterialFindAllVideoResponseBodyPageable setPaged(Boolean paged) {
            this.paged = paged;
            return this;
        }
        public Boolean getPaged() {
            return this.paged;
        }

        public MaterialFindAllVideoResponseBodyPageable setSort(MaterialFindAllVideoResponseBodyPageableSort sort) {
            this.sort = sort;
            return this;
        }
        public MaterialFindAllVideoResponseBodyPageableSort getSort() {
            return this.sort;
        }

        public MaterialFindAllVideoResponseBodyPageable setUnpaged(Boolean unpaged) {
            this.unpaged = unpaged;
            return this;
        }
        public Boolean getUnpaged() {
            return this.unpaged;
        }

    }

    public static class MaterialFindAllVideoResponseBodySort extends TeaModel {
        @NameInMap("Empty")
        public Boolean empty;

        @NameInMap("Sorted")
        public Boolean sorted;

        @NameInMap("Unsorted")
        public Boolean unsorted;

        public static MaterialFindAllVideoResponseBodySort build(java.util.Map<String, ?> map) throws Exception {
            MaterialFindAllVideoResponseBodySort self = new MaterialFindAllVideoResponseBodySort();
            return TeaModel.build(map, self);
        }

        public MaterialFindAllVideoResponseBodySort setEmpty(Boolean empty) {
            this.empty = empty;
            return this;
        }
        public Boolean getEmpty() {
            return this.empty;
        }

        public MaterialFindAllVideoResponseBodySort setSorted(Boolean sorted) {
            this.sorted = sorted;
            return this;
        }
        public Boolean getSorted() {
            return this.sorted;
        }

        public MaterialFindAllVideoResponseBodySort setUnsorted(Boolean unsorted) {
            this.unsorted = unsorted;
            return this;
        }
        public Boolean getUnsorted() {
            return this.unsorted;
        }

    }

}
