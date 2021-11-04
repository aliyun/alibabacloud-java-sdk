// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListMediaBasicInfosResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 符合要求的媒资集合
    @NameInMap("MediaInfos")
    public java.util.List<ListMediaBasicInfosResponseBodyMediaInfos> mediaInfos;

    @NameInMap("NextToken")
    public String nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 符合要求的媒资总数
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListMediaBasicInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMediaBasicInfosResponseBody self = new ListMediaBasicInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMediaBasicInfosResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMediaBasicInfosResponseBody setMediaInfos(java.util.List<ListMediaBasicInfosResponseBodyMediaInfos> mediaInfos) {
        this.mediaInfos = mediaInfos;
        return this;
    }
    public java.util.List<ListMediaBasicInfosResponseBodyMediaInfos> getMediaInfos() {
        return this.mediaInfos;
    }

    public ListMediaBasicInfosResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMediaBasicInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMediaBasicInfosResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo extends TeaModel {
        // 码率
        @NameInMap("Bitrate")
        public String bitrate;

        // 时长
        @NameInMap("Duration")
        public String duration;

        // 文件名
        @NameInMap("FileName")
        public String fileName;

        // 文件大小（字节）
        @NameInMap("FileSize")
        public String fileSize;

        // 文件状态
        @NameInMap("FileStatus")
        public String fileStatus;

        // 文件类型
        @NameInMap("FileType")
        public String fileType;

        // 文件oss地址
        @NameInMap("FileUrl")
        public String fileUrl;

        // 封装格式
        @NameInMap("FormatName")
        public String formatName;

        // 高
        @NameInMap("Height")
        public String height;

        // 文件存储区域
        @NameInMap("Region")
        public String region;

        // 宽
        @NameInMap("Width")
        public String width;

        public static ListMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            ListMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo self = new ListMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo();
            return TeaModel.build(map, self);
        }

        public ListMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public ListMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public ListMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public ListMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo setFileStatus(String fileStatus) {
            this.fileStatus = fileStatus;
            return this;
        }
        public String getFileStatus() {
            return this.fileStatus;
        }

        public ListMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public ListMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public ListMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

        public ListMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public ListMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class ListMediaBasicInfosResponseBodyMediaInfosFileInfoList extends TeaModel {
        // 文件基础信息，包含时长，大小等
        @NameInMap("FileBasicInfo")
        public ListMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo fileBasicInfo;

        public static ListMediaBasicInfosResponseBodyMediaInfosFileInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListMediaBasicInfosResponseBodyMediaInfosFileInfoList self = new ListMediaBasicInfosResponseBodyMediaInfosFileInfoList();
            return TeaModel.build(map, self);
        }

        public ListMediaBasicInfosResponseBodyMediaInfosFileInfoList setFileBasicInfo(ListMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo fileBasicInfo) {
            this.fileBasicInfo = fileBasicInfo;
            return this;
        }
        public ListMediaBasicInfosResponseBodyMediaInfosFileInfoListFileBasicInfo getFileBasicInfo() {
            return this.fileBasicInfo;
        }

    }

    public static class ListMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo extends TeaModel {
        // 媒资业务类型
        @NameInMap("BusinessType")
        public String businessType;

        // 分类
        @NameInMap("Category")
        public String category;

        // 封面地址
        @NameInMap("CoverURL")
        public String coverURL;

        // 媒资创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 媒资删除时间
        @NameInMap("DeletedTime")
        public String deletedTime;

        // 内容描述
        @NameInMap("Description")
        public String description;

        // 待注册的媒资在相应系统中的地址
        @NameInMap("InputURL")
        public String inputURL;

        // MediaId
        @NameInMap("MediaId")
        public String mediaId;

        // 标签
        @NameInMap("MediaTags")
        public String mediaTags;

        // 媒资媒体类型
        @NameInMap("MediaType")
        public String mediaType;

        // 媒资修改时间
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        // 截图
        @NameInMap("Snapshots")
        public String snapshots;

        // 来源
        @NameInMap("Source")
        public String source;

        // 雪碧图
        @NameInMap("SpriteImages")
        public String spriteImages;

        // 资源状态
        @NameInMap("Status")
        public String status;

        // 标题
        @NameInMap("Title")
        public String title;

        // 转码状态
        @NameInMap("TranscodeStatus")
        public String transcodeStatus;

        // 用户数据
        @NameInMap("UserData")
        public String userData;

        public static ListMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            ListMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo self = new ListMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo();
            return TeaModel.build(map, self);
        }

        public ListMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public ListMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public ListMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo setDeletedTime(String deletedTime) {
            this.deletedTime = deletedTime;
            return this;
        }
        public String getDeletedTime() {
            return this.deletedTime;
        }

        public ListMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo setInputURL(String inputURL) {
            this.inputURL = inputURL;
            return this;
        }
        public String getInputURL() {
            return this.inputURL;
        }

        public ListMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public ListMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo setMediaTags(String mediaTags) {
            this.mediaTags = mediaTags;
            return this;
        }
        public String getMediaTags() {
            return this.mediaTags;
        }

        public ListMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public ListMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo setSnapshots(String snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public String getSnapshots() {
            return this.snapshots;
        }

        public ListMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo setSpriteImages(String spriteImages) {
            this.spriteImages = spriteImages;
            return this;
        }
        public String getSpriteImages() {
            return this.spriteImages;
        }

        public ListMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo setTranscodeStatus(String transcodeStatus) {
            this.transcodeStatus = transcodeStatus;
            return this;
        }
        public String getTranscodeStatus() {
            return this.transcodeStatus;
        }

        public ListMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class ListMediaBasicInfosResponseBodyMediaInfos extends TeaModel {
        // FileInfos
        @NameInMap("FileInfoList")
        public java.util.List<ListMediaBasicInfosResponseBodyMediaInfosFileInfoList> fileInfoList;

        // BasicInfo
        @NameInMap("MediaBasicInfo")
        public ListMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo mediaBasicInfo;

        // 媒资ID
        @NameInMap("MediaId")
        public String mediaId;

        public static ListMediaBasicInfosResponseBodyMediaInfos build(java.util.Map<String, ?> map) throws Exception {
            ListMediaBasicInfosResponseBodyMediaInfos self = new ListMediaBasicInfosResponseBodyMediaInfos();
            return TeaModel.build(map, self);
        }

        public ListMediaBasicInfosResponseBodyMediaInfos setFileInfoList(java.util.List<ListMediaBasicInfosResponseBodyMediaInfosFileInfoList> fileInfoList) {
            this.fileInfoList = fileInfoList;
            return this;
        }
        public java.util.List<ListMediaBasicInfosResponseBodyMediaInfosFileInfoList> getFileInfoList() {
            return this.fileInfoList;
        }

        public ListMediaBasicInfosResponseBodyMediaInfos setMediaBasicInfo(ListMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo mediaBasicInfo) {
            this.mediaBasicInfo = mediaBasicInfo;
            return this;
        }
        public ListMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo getMediaBasicInfo() {
            return this.mediaBasicInfo;
        }

        public ListMediaBasicInfosResponseBodyMediaInfos setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

    }

}
