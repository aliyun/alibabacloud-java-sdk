// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListCdsFilesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Count")
    public String count;

    @NameInMap("FileModels")
    public java.util.List<ListCdsFilesResponseBodyFileModels> fileModels;

    @NameInMap("Message")
    public String message;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListCdsFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCdsFilesResponseBody self = new ListCdsFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCdsFilesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCdsFilesResponseBody setCount(String count) {
        this.count = count;
        return this;
    }
    public String getCount() {
        return this.count;
    }

    public ListCdsFilesResponseBody setFileModels(java.util.List<ListCdsFilesResponseBodyFileModels> fileModels) {
        this.fileModels = fileModels;
        return this;
    }
    public java.util.List<ListCdsFilesResponseBodyFileModels> getFileModels() {
        return this.fileModels;
    }

    public ListCdsFilesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCdsFilesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCdsFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCdsFilesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCdsFilesResponseBodyFileModels extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Description")
        public String description;

        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("FileExtension")
        public String fileExtension;

        @NameInMap("FileId")
        public String fileId;

        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("FileType")
        public String fileType;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("Name")
        public String name;

        @NameInMap("OpenTime")
        public String openTime;

        @NameInMap("OpenTimeStamp")
        public Long openTimeStamp;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Sha1")
        public String sha1;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Thumbnail")
        public String thumbnail;

        public static ListCdsFilesResponseBodyFileModels build(java.util.Map<String, ?> map) throws Exception {
            ListCdsFilesResponseBodyFileModels self = new ListCdsFilesResponseBodyFileModels();
            return TeaModel.build(map, self);
        }

        public ListCdsFilesResponseBodyFileModels setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListCdsFilesResponseBodyFileModels setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public ListCdsFilesResponseBodyFileModels setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListCdsFilesResponseBodyFileModels setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListCdsFilesResponseBodyFileModels setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCdsFilesResponseBodyFileModels setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public ListCdsFilesResponseBodyFileModels setFileExtension(String fileExtension) {
            this.fileExtension = fileExtension;
            return this;
        }
        public String getFileExtension() {
            return this.fileExtension;
        }

        public ListCdsFilesResponseBodyFileModels setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public ListCdsFilesResponseBodyFileModels setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public ListCdsFilesResponseBodyFileModels setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public ListCdsFilesResponseBodyFileModels setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public ListCdsFilesResponseBodyFileModels setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListCdsFilesResponseBodyFileModels setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListCdsFilesResponseBodyFileModels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCdsFilesResponseBodyFileModels setOpenTime(String openTime) {
            this.openTime = openTime;
            return this;
        }
        public String getOpenTime() {
            return this.openTime;
        }

        public ListCdsFilesResponseBodyFileModels setOpenTimeStamp(Long openTimeStamp) {
            this.openTimeStamp = openTimeStamp;
            return this;
        }
        public Long getOpenTimeStamp() {
            return this.openTimeStamp;
        }

        public ListCdsFilesResponseBodyFileModels setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public ListCdsFilesResponseBodyFileModels setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListCdsFilesResponseBodyFileModels setSha1(String sha1) {
            this.sha1 = sha1;
            return this;
        }
        public String getSha1() {
            return this.sha1;
        }

        public ListCdsFilesResponseBodyFileModels setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListCdsFilesResponseBodyFileModels setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }
        public String getThumbnail() {
            return this.thumbnail;
        }

    }

}
