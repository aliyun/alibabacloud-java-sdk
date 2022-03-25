// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class MaterialFindAllPictureResponseBody extends TeaModel {
    @NameInMap("Content")
    public java.util.List<MaterialFindAllPictureResponseBodyContent> content;

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
    public MaterialFindAllPictureResponseBodyPageable pageable;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Size")
    public Long size;

    @NameInMap("Sort")
    public MaterialFindAllPictureResponseBodySort sort;

    @NameInMap("TotalElements")
    public Long totalElements;

    @NameInMap("TotalPages")
    public Long totalPages;

    public static MaterialFindAllPictureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MaterialFindAllPictureResponseBody self = new MaterialFindAllPictureResponseBody();
        return TeaModel.build(map, self);
    }

    public MaterialFindAllPictureResponseBody setContent(java.util.List<MaterialFindAllPictureResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<MaterialFindAllPictureResponseBodyContent> getContent() {
        return this.content;
    }

    public MaterialFindAllPictureResponseBody setEmpty(Boolean empty) {
        this.empty = empty;
        return this;
    }
    public Boolean getEmpty() {
        return this.empty;
    }

    public MaterialFindAllPictureResponseBody setFirst(Boolean first) {
        this.first = first;
        return this;
    }
    public Boolean getFirst() {
        return this.first;
    }

    public MaterialFindAllPictureResponseBody setLast(Boolean last) {
        this.last = last;
        return this;
    }
    public Boolean getLast() {
        return this.last;
    }

    public MaterialFindAllPictureResponseBody setNumber(Long number) {
        this.number = number;
        return this;
    }
    public Long getNumber() {
        return this.number;
    }

    public MaterialFindAllPictureResponseBody setNumberOfElements(Long numberOfElements) {
        this.numberOfElements = numberOfElements;
        return this;
    }
    public Long getNumberOfElements() {
        return this.numberOfElements;
    }

    public MaterialFindAllPictureResponseBody setPageable(MaterialFindAllPictureResponseBodyPageable pageable) {
        this.pageable = pageable;
        return this;
    }
    public MaterialFindAllPictureResponseBodyPageable getPageable() {
        return this.pageable;
    }

    public MaterialFindAllPictureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MaterialFindAllPictureResponseBody setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public MaterialFindAllPictureResponseBody setSort(MaterialFindAllPictureResponseBodySort sort) {
        this.sort = sort;
        return this;
    }
    public MaterialFindAllPictureResponseBodySort getSort() {
        return this.sort;
    }

    public MaterialFindAllPictureResponseBody setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }
    public Long getTotalElements() {
        return this.totalElements;
    }

    public MaterialFindAllPictureResponseBody setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Long getTotalPages() {
        return this.totalPages;
    }

    public static class MaterialFindAllPictureResponseBodyContent extends TeaModel {
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

        public static MaterialFindAllPictureResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            MaterialFindAllPictureResponseBodyContent self = new MaterialFindAllPictureResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public MaterialFindAllPictureResponseBodyContent setAuditStatus(String auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public String getAuditStatus() {
            return this.auditStatus;
        }

        public MaterialFindAllPictureResponseBodyContent setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public MaterialFindAllPictureResponseBodyContent setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public MaterialFindAllPictureResponseBodyContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public MaterialFindAllPictureResponseBodyContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public MaterialFindAllPictureResponseBodyContent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public MaterialFindAllPictureResponseBodyContent setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public MaterialFindAllPictureResponseBodyContent setRealFileName(String realFileName) {
            this.realFileName = realFileName;
            return this;
        }
        public String getRealFileName() {
            return this.realFileName;
        }

        public MaterialFindAllPictureResponseBodyContent setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public MaterialFindAllPictureResponseBodyContent setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public MaterialFindAllPictureResponseBodyContent setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public MaterialFindAllPictureResponseBodyContent setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }
        public String getThumbnail() {
            return this.thumbnail;
        }

        public MaterialFindAllPictureResponseBodyContent setUploadStatus(String uploadStatus) {
            this.uploadStatus = uploadStatus;
            return this;
        }
        public String getUploadStatus() {
            return this.uploadStatus;
        }

        public MaterialFindAllPictureResponseBodyContent setUploader(String uploader) {
            this.uploader = uploader;
            return this;
        }
        public String getUploader() {
            return this.uploader;
        }

        public MaterialFindAllPictureResponseBodyContent setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class MaterialFindAllPictureResponseBodyPageableSort extends TeaModel {
        @NameInMap("Empty")
        public Boolean empty;

        @NameInMap("Sorted")
        public Boolean sorted;

        @NameInMap("Unsorted")
        public Boolean unsorted;

        public static MaterialFindAllPictureResponseBodyPageableSort build(java.util.Map<String, ?> map) throws Exception {
            MaterialFindAllPictureResponseBodyPageableSort self = new MaterialFindAllPictureResponseBodyPageableSort();
            return TeaModel.build(map, self);
        }

        public MaterialFindAllPictureResponseBodyPageableSort setEmpty(Boolean empty) {
            this.empty = empty;
            return this;
        }
        public Boolean getEmpty() {
            return this.empty;
        }

        public MaterialFindAllPictureResponseBodyPageableSort setSorted(Boolean sorted) {
            this.sorted = sorted;
            return this;
        }
        public Boolean getSorted() {
            return this.sorted;
        }

        public MaterialFindAllPictureResponseBodyPageableSort setUnsorted(Boolean unsorted) {
            this.unsorted = unsorted;
            return this;
        }
        public Boolean getUnsorted() {
            return this.unsorted;
        }

    }

    public static class MaterialFindAllPictureResponseBodyPageable extends TeaModel {
        @NameInMap("Offset")
        public Long offset;

        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Paged")
        public Boolean paged;

        @NameInMap("Sort")
        public MaterialFindAllPictureResponseBodyPageableSort sort;

        @NameInMap("Unpaged")
        public Boolean unpaged;

        public static MaterialFindAllPictureResponseBodyPageable build(java.util.Map<String, ?> map) throws Exception {
            MaterialFindAllPictureResponseBodyPageable self = new MaterialFindAllPictureResponseBodyPageable();
            return TeaModel.build(map, self);
        }

        public MaterialFindAllPictureResponseBodyPageable setOffset(Long offset) {
            this.offset = offset;
            return this;
        }
        public Long getOffset() {
            return this.offset;
        }

        public MaterialFindAllPictureResponseBodyPageable setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public MaterialFindAllPictureResponseBodyPageable setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public MaterialFindAllPictureResponseBodyPageable setPaged(Boolean paged) {
            this.paged = paged;
            return this;
        }
        public Boolean getPaged() {
            return this.paged;
        }

        public MaterialFindAllPictureResponseBodyPageable setSort(MaterialFindAllPictureResponseBodyPageableSort sort) {
            this.sort = sort;
            return this;
        }
        public MaterialFindAllPictureResponseBodyPageableSort getSort() {
            return this.sort;
        }

        public MaterialFindAllPictureResponseBodyPageable setUnpaged(Boolean unpaged) {
            this.unpaged = unpaged;
            return this;
        }
        public Boolean getUnpaged() {
            return this.unpaged;
        }

    }

    public static class MaterialFindAllPictureResponseBodySort extends TeaModel {
        @NameInMap("Empty")
        public Boolean empty;

        @NameInMap("Sorted")
        public Boolean sorted;

        @NameInMap("Unsorted")
        public Boolean unsorted;

        public static MaterialFindAllPictureResponseBodySort build(java.util.Map<String, ?> map) throws Exception {
            MaterialFindAllPictureResponseBodySort self = new MaterialFindAllPictureResponseBodySort();
            return TeaModel.build(map, self);
        }

        public MaterialFindAllPictureResponseBodySort setEmpty(Boolean empty) {
            this.empty = empty;
            return this;
        }
        public Boolean getEmpty() {
            return this.empty;
        }

        public MaterialFindAllPictureResponseBodySort setSorted(Boolean sorted) {
            this.sorted = sorted;
            return this;
        }
        public Boolean getSorted() {
            return this.sorted;
        }

        public MaterialFindAllPictureResponseBodySort setUnsorted(Boolean unsorted) {
            this.unsorted = unsorted;
            return this;
        }
        public Boolean getUnsorted() {
            return this.unsorted;
        }

    }

}
