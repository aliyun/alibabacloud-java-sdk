// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layout20220801.models;

import com.aliyun.tea.*;

public class DescribeFileMaterialByPageResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("MaterialInfos")
    public java.util.List<DescribeFileMaterialByPageResponseBodyMaterialInfos> materialInfos;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeFileMaterialByPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileMaterialByPageResponseBody self = new DescribeFileMaterialByPageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFileMaterialByPageResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribeFileMaterialByPageResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeFileMaterialByPageResponseBody setMaterialInfos(java.util.List<DescribeFileMaterialByPageResponseBodyMaterialInfos> materialInfos) {
        this.materialInfos = materialInfos;
        return this;
    }
    public java.util.List<DescribeFileMaterialByPageResponseBodyMaterialInfos> getMaterialInfos() {
        return this.materialInfos;
    }

    public DescribeFileMaterialByPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeFileMaterialByPageResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeFileMaterialByPageResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeFileMaterialByPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFileMaterialByPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeFileMaterialByPageResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeFileMaterialByPageResponseBodyMaterialInfos extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("DisplayOrder")
        public Long displayOrder;

        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("FileSize")
        public Long fileSize;

        @NameInMap("GmtCreateTime")
        public Long gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        public Long gmtModifiedTime;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("Thumbnail")
        public String thumbnail;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        public static DescribeFileMaterialByPageResponseBodyMaterialInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileMaterialByPageResponseBodyMaterialInfos self = new DescribeFileMaterialByPageResponseBodyMaterialInfos();
            return TeaModel.build(map, self);
        }

        public DescribeFileMaterialByPageResponseBodyMaterialInfos setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeFileMaterialByPageResponseBodyMaterialInfos setDisplayOrder(Long displayOrder) {
            this.displayOrder = displayOrder;
            return this;
        }
        public Long getDisplayOrder() {
            return this.displayOrder;
        }

        public DescribeFileMaterialByPageResponseBodyMaterialInfos setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public DescribeFileMaterialByPageResponseBodyMaterialInfos setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public DescribeFileMaterialByPageResponseBodyMaterialInfos setGmtCreateTime(Long gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public Long getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public DescribeFileMaterialByPageResponseBodyMaterialInfos setGmtModifiedTime(Long gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public Long getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public DescribeFileMaterialByPageResponseBodyMaterialInfos setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeFileMaterialByPageResponseBodyMaterialInfos setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public DescribeFileMaterialByPageResponseBodyMaterialInfos setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }
        public String getThumbnail() {
            return this.thumbnail;
        }

        public DescribeFileMaterialByPageResponseBodyMaterialInfos setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeFileMaterialByPageResponseBodyMaterialInfos setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
