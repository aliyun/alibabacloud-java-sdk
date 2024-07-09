// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListCdsFilesResponseBody extends TeaModel {
    /**
     * <p>The result of the operation. A value of success indicates that the operation is successful. If the operation failed, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
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
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The token used for the next query. If this parameter is empty, all results have been returned.</p>
     * 
     * <strong>example:</strong>
     * <p>WyI2MzhmMjA2ZTFmZGZlZGVjZDk3OTRlNzVhZmIwMDFiZmM5NWQ3YTgwIiwibiIsIm4iLDEsLTEsMTY3MDMyNDMzNTAzMSwiNjM4ZjIwNmZjNDFkMzIwOTZmZWU0NGYxODkwY2I5ZjI0Mjg0NzM2****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID. An ID is the unique identifier of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>40D86754-20FD-53DC-A9B8-25F7FECC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><!-- -->
     * 
     * <p>false</p>
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The content type of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>application/json</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>The time when the file was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-06T07:27:08Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The file creator.</p>
         * 
         * <strong>example:</strong>
         * <p>user01</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The file description.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The URL that is used to download the file. The download URL is valid for only 15 minutes. If the URL is expired, you can call the GetFile operation to obtain the file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://data.aliyunpds.com/hz22%2F5d5b986facbec311ef844c25954f96821497b383%2F5d5b986f955410dd991646bb87c6b4e899ef****?Expires=xxx&OSSAccessKeyId=xxx&Signature=xxx">https://data.aliyunpds.com/hz22%2F5d5b986facbec311ef844c25954f96821497b383%2F5d5b986f955410dd991646bb87c6b4e899ef****?Expires=xxx&amp;OSSAccessKeyId=xxx&amp;Signature=xxx</a></p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The filename extension.</p>
         * 
         * <strong>example:</strong>
         * <p>pdf</p>
         */
        @NameInMap("FileExtension")
        public String fileExtension;

        /**
         * <p>The file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>637725ff2f63db8470984e6c92c692b87d52****</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>The file path.</p>
         * 
         * <strong>example:</strong>
         * <p>isv/1019236948660053/temp/</p>
         */
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <p>The file type.</p>
         * 
         * <strong>example:</strong>
         * <p>file</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <p>The MD5 value of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>63c83ececb4e6926c51448fc5ecb****</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <p>The time when the file was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-06T07:27:08Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The user who modified the file.</p>
         * 
         * <strong>example:</strong>
         * <p>user02</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>fvt-appcenterp4qwa</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The time when the file was last opened.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-06T07:27:08Z</p>
         */
        @NameInMap("OpenTime")
        public String openTime;

        /**
         * <p>The timestamp that indicates the time when the file was last opened.</p>
         * 
         * <strong>example:</strong>
         * <p>168951245231</p>
         */
        @NameInMap("OpenTimeStamp")
        public Long openTimeStamp;

        /**
         * <p>The ID of the parent folder.</p>
         * 
         * <strong>example:</strong>
         * <p>3343213ff2f63db8470984e6c92c3213dfdw****</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <p>The region ID You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The SHA 1 file.</p>
         * 
         * <strong>example:</strong>
         * <p>EA4942AA8761213890A5C386F88E6464D2C3****</p>
         */
        @NameInMap("Sha1")
        public String sha1;

        /**
         * <p>The file size. Unit: bits.</p>
         * 
         * <strong>example:</strong>
         * <p>102400</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The URL of the thumbnail.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://data.aliyunpds.com/hz22%2F5d5b986facbec311ef844c25954f96821497b383%2F5d5b986f955410dd991646bb87c6b4e899ef****?Expires=xxx&OSSAccessKeyId=xxx&Signature=xxx">https://data.aliyunpds.com/hz22%2F5d5b986facbec311ef844c25954f96821497b383%2F5d5b986f955410dd991646bb87c6b4e899ef****?Expires=xxx&amp;OSSAccessKeyId=xxx&amp;Signature=xxx</a></p>
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
