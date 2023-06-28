// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListCdsFilesResponseBody extends TeaModel {
    /**
     * <p>The result of the operation. A value of success indicates that the operation is successful. If the operation failed, an error message is returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The total number of entries.</p>
     */
    @NameInMap("Count")
    public String count;

    /**
     * <p>The files.</p>
     */
    @NameInMap("FileModels")
    public java.util.List<ListCdsFilesResponseBodyFileModels> fileModels;

    /**
     * <p>The error message returned if the request failed. This parameter is empty if the value of Code is success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The token used for the next query. If this parameter is empty, all results have been returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID. An ID is the unique identifier of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   <!-- --></p>
     * <br>
     * <p>    false</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
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
        /**
         * <p>The file category. PDS categorizes files based on their suffixes and MIME types. The following major categories are included: doc, image, audio, and video.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The content type of the file.</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>The time when the file was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The file creator.</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The file description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The URL that is used to download the file. The download URL is valid for only 15 minutes. If the URL is expired, you can call the GetFile operation to obtain the file.</p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The filename extension.</p>
         */
        @NameInMap("FileExtension")
        public String fileExtension;

        /**
         * <p>The file ID.</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>The file path.</p>
         */
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <p>The file type.</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <p>The MD5 value of the file.</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <p>The time when the file was last modified.</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The user who modified the file.</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <p>The file name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The time when the file was last opened.</p>
         */
        @NameInMap("OpenTime")
        public String openTime;

        /**
         * <p>The timestamp that indicates the time when the file was last opened.</p>
         */
        @NameInMap("OpenTimeStamp")
        public Long openTimeStamp;

        /**
         * <p>The ID of the parent folder.</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <p>The region ID You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The SHA 1 file.</p>
         */
        @NameInMap("Sha1")
        public String sha1;

        /**
         * <p>The file size. Unit: bits.</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The URL of the thumbnail.</p>
         */
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
