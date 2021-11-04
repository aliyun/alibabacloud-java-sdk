// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListPublicMediaBasicInfosResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 符合要求的媒资集合
    @NameInMap("MediaInfos")
    public java.util.List<ListPublicMediaBasicInfosResponseBodyMediaInfos> mediaInfos;

    @NameInMap("NextToken")
    public String nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 符合要求的媒资总数
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
        // 文件基础信息，包含时长，大小等
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
        // FileInfos
        @NameInMap("FileInfoList")
        public java.util.List<ListPublicMediaBasicInfosResponseBodyMediaInfosFileInfoList> fileInfoList;

        // BasicInfo
        @NameInMap("MediaBasicInfo")
        public ListPublicMediaBasicInfosResponseBodyMediaInfosMediaBasicInfo mediaBasicInfo;

        // 媒资ID
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
