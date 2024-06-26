// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListPublicMediaBasicInfosResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("MediaInfos")
    public java.util.List<ListPublicMediaBasicInfosResponseBodyMediaInfos> mediaInfos;

    /**
     * <strong>example:</strong>
     * <p>8EqYpQbZ6Eh7+Zz8DxVYoQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>B7-7F87-4792-BFE9-63CD21</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListPublicMediaBasicInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPublicMediaBasicInfosResponseBody self = new ListPublicMediaBasicInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPublicMediaBasicInfosResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPublicMediaBasicInfosResponseBody setMediaInfos(java.util.List<ListPublicMediaBasicInfosResponseBodyMediaInfos> mediaInfos) {
        this.mediaInfos = mediaInfos;
        return this;
    }
    public java.util.List<ListPublicMediaBasicInfosResponseBodyMediaInfos> getMediaInfos() {
        return this.mediaInfos;
    }

    public ListPublicMediaBasicInfosResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPublicMediaBasicInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPublicMediaBasicInfosResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListPublicMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>270112.12</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <strong>example:</strong>
         * <p>10.040000</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <strong>example:</strong>
         * <p>example.mp4</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>338990717</p>
         */
        @NameInMap("FileSize")
        public String fileSize;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("FileStatus")
        public String fileStatus;

        /**
         * <strong>example:</strong>
         * <p>source_file</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <strong>example:</strong>
         * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4?Expires=">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4?Expires=</a><ExpireTime>&amp;OSSAccessKeyId=<OSSAccessKeyId>&amp;Signature=<Signature>&amp;security-token=<SecurityToken></p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <strong>example:</strong>
         * <p>mov,mp4,m4a,3gp,3g2,mj2</p>
         */
        @NameInMap("FormatName")
        public String formatName;

        /**
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>1920</p>
         */
        @NameInMap("Width")
        public String width;

        public static ListPublicMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            ListPublicMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo self = new ListPublicMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo();
            return TeaModel.build(map, self);
        }

        public ListPublicMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public ListPublicMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public ListPublicMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListPublicMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public ListPublicMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo setFileStatus(String fileStatus) {
            this.fileStatus = fileStatus;
            return this;
        }
        public String getFileStatus() {
            return this.fileStatus;
        }

        public ListPublicMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public ListPublicMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public ListPublicMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

        public ListPublicMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public ListPublicMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListPublicMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class ListPublicMediaBasicInfosResponseBodyMediaInfosFileInfoList extends TeaModel {
        @NameInMap("FileBasicInfo")
        public ListPublicMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo fileBasicInfo;

        public static ListPublicMediaBasicInfosResponseBodyMediaInfosFileInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListPublicMediaBasicInfosResponseBodyMediaInfosFileInfoList self = new ListPublicMediaBasicInfosResponseBodyMediaInfosFileInfoList();
            return TeaModel.build(map, self);
        }

        public ListPublicMediaBasicInfosResponseBodyMediaInfosFileInfoList setFileBasicInfo(ListPublicMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo fileBasicInfo) {
            this.fileBasicInfo = fileBasicInfo;
            return this;
        }
        public ListPublicMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo getFileBasicInfo() {
            return this.fileBasicInfo;
        }

    }

    public static class ListPublicMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>general</p>
         */
        @NameInMap("BusinessType")
        public String businessType;

        /**
         * <strong>example:</strong>
         * <p>video</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.png?Expires=">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.png?Expires=</a><ExpireTime>&amp;OSSAccessKeyId=<OSSAccessKeyId>&amp;Signature=<Signature>&amp;security-token=<SecurityToken></p>
         */
        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <strong>example:</strong>
         * <p>2021-01-08T16:52:04Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>2021-01-08T16:52:04Z</p>
         */
        @NameInMap("DeletedTime")
        public String deletedTime;

        /**
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p><a href="https://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4">https://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</a></p>
         */
        @NameInMap("InputURL")
        public String inputURL;

        /**
         * <p>MediaId</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>019b82e24b37a1c2958dec38</strong></strong></p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <strong>example:</strong>
         * <p>sticker-daily</p>
         */
        @NameInMap("MediaTags")
        public String mediaTags;

        /**
         * <strong>example:</strong>
         * <p>video</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        /**
         * <strong>example:</strong>
         * <p>2021-01-08T16:52:04Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Snapshots")
        public String snapshots;

        /**
         * <strong>example:</strong>
         * <p>oss</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>Init</p>
         */
        @NameInMap("TranscodeStatus")
        public String transcodeStatus;

        /**
         * <strong>example:</strong>
         * <p>userData</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static ListPublicMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            ListPublicMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo self = new ListPublicMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo();
            return TeaModel.build(map, self);
        }

        public ListPublicMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public ListPublicMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListPublicMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public ListPublicMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPublicMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo setDeletedTime(String deletedTime) {
            this.deletedTime = deletedTime;
            return this;
        }
        public String getDeletedTime() {
            return this.deletedTime;
        }

        public ListPublicMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPublicMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo setInputURL(String inputURL) {
            this.inputURL = inputURL;
            return this;
        }
        public String getInputURL() {
            return this.inputURL;
        }

        public ListPublicMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public ListPublicMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo setMediaTags(String mediaTags) {
            this.mediaTags = mediaTags;
            return this;
        }
        public String getMediaTags() {
            return this.mediaTags;
        }

        public ListPublicMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public ListPublicMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListPublicMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo setSnapshots(String snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public String getSnapshots() {
            return this.snapshots;
        }

        public ListPublicMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListPublicMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPublicMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListPublicMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo setTranscodeStatus(String transcodeStatus) {
            this.transcodeStatus = transcodeStatus;
            return this;
        }
        public String getTranscodeStatus() {
            return this.transcodeStatus;
        }

        public ListPublicMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class ListPublicMediaBasicInfosResponseBodyMediaInfos extends TeaModel {
        /**
         * <p>FileInfos</p>
         */
        @NameInMap("FileInfoList")
        public java.util.List<ListPublicMediaBasicInfosResponseBodyMediaInfosFileInfoList> fileInfoList;

        /**
         * <p>BasicInfo</p>
         */
        @NameInMap("MediaBasicInfo")
        public ListPublicMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo mediaBasicInfo;

        /**
         * <strong>example:</strong>
         * <p><strong><strong>019b82e24b37a1c2958dec38</strong></strong></p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        public static ListPublicMediaBasicInfosResponseBodyMediaInfos build(java.util.Map<String, ?> map) throws Exception {
            ListPublicMediaBasicInfosResponseBodyMediaInfos self = new ListPublicMediaBasicInfosResponseBodyMediaInfos();
            return TeaModel.build(map, self);
        }

        public ListPublicMediaBasicInfosResponseBodyMediaInfos setFileInfoList(java.util.List<ListPublicMediaBasicInfosResponseBodyMediaInfosFileInfoList> fileInfoList) {
            this.fileInfoList = fileInfoList;
            return this;
        }
        public java.util.List<ListPublicMediaBasicInfosResponseBodyMediaInfosFileInfoList> getFileInfoList() {
            return this.fileInfoList;
        }

        public ListPublicMediaBasicInfosResponseBodyMediaInfos setMediaBasicInfo(ListPublicMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo mediaBasicInfo) {
            this.mediaBasicInfo = mediaBasicInfo;
            return this;
        }
        public ListPublicMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo getMediaBasicInfo() {
            return this.mediaBasicInfo;
        }

        public ListPublicMediaBasicInfosResponseBodyMediaInfos setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

    }

}
